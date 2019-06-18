
Vue.component('todo-item', {
    template: '<li>这是个待办项</li>'
});

var app = new Vue({
    el: '#app',
    data: {
        message: 'hello vue',
        show: true,
        list: [1, 2, 3, 4, 5]
    },
    methods: {
        toggle: function () {
            this.show = false;
        }
    }
});

