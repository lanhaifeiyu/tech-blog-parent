/**
 * http://jmesnil.net/stomp-websocket/doc/
 * https://www.cnblogs.com/jmcui/p/8999998.html
 * https://github.com/sockjs/sockjs-client
 * @type {null}
 */

CUR_USER_NAME = null;
var stompClient = null;

$(document).ready(function () {
    init();
});

function init() {
    $('#content').keyup(function (event) {
        if (event.keyCode == 13) {
            sendMessage();
        }
    });
}

//设置连接状态控制显示隐藏
function setConnected(connected) {
    $("#connect").attr("disabled", connected);
    $("#disconnect").attr("disabled", !connected);
    if (!connected) {
        $("#inputDiv").hide();
    } else {
        $("#inputDiv").show();
    }
    $("#reponse").html("");
}

//连接
function connect_old() {
    var socket = new SockJS("/endpointWisely");
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log("connected : " + frame);
        stompClient.subscribe("/topic/getResponse", function (response) {
            showResponse(JSON.parse(response.body).responseMessage);
        })
    })
}

//连接
function connect() {
    var username = 'guest';
    var password = 'guest';

    var ws = new WebSocket('ws://192.168.1.160:15674/ws');
    // Init Client
    stompClient = Stomp.over(ws);

    // SockJS does not support heart-beat: disable heart-beats
    stompClient.heartbeat.outgoing = 0;
    stompClient.heartbeat.incoming = 0;

    //stompClient.connect(headers, function (frame) {
    stompClient.connect('guest', 'guest', function (frame) {
        setConnected(true);
        console.log("connected : " + frame);
        stompClient.subscribe("/topic/test", function (response) {
            // showResponse(JSON.parse(response.body).responseMessage);
            var message = JSON.parse(response.body);
            if (CUR_USER_NAME == message.name) {
                showResponse("我说：" + message.content);
            } else {
                showResponse("他说：" + message.content);
            }
        })
    }, function () {
        console.log('err');
    }, '/');
}

//发送名称到后台
function sendMessage() {
    var name = $("#name").val();
    var content = $("#content").val();
    CUR_USER_NAME = name;
    stompClient.send("/topic/test", {}, JSON.stringify({name: name, content: content}));
    $("#content").val('');
}

//显示socket返回消息内容
function showResponse(message) {
    $("#response").append('<p>' + message + '</p>');
}

//断开
function disconnect() {
    if (stompClient != null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("disconnected!");
}