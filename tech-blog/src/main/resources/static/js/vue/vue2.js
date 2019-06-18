tableColumns1 = [
    {
        title: 'Name',
        key: 'name'
    },
    {
        title: 'Status',
        key: 'status',
        render: function (h, params) {
            var row = params.row;
            var color = row.status === 1 ? 'primary' : row.status === 2 ? 'success' : 'error';
            var text = row.status === 1 ? 'Working' : row.status === 2 ? 'Success' : 'Fail';

            return h('Tag', {
                props: {
                    type: 'dot',
                    color: color
                }
            }, text);
        }
    },
    {
        title: 'Portrayal',
        key: 'portrayal',
        render: function (h, params) {
            return h('Poptip', {
                props: {
                    trigger: 'hover',
                    title: params.row.portrayal.length + 'portrayals',
                    placement: 'bottom'
                }
            }, [
                h('Tag', params.row.portrayal.length),
                h('div', {
                    slot: 'content'
                }, [
                    h('ul', this.tableData1[params.index].portrayal.map(item => {
                        return h('li', {
                            style: {
                                textAlign: 'center',
                                padding: '4px'
                            }
                        }, item)
                    }))
                ])
            ]);
        }
    },
    /*{
        title: 'People',
        key: 'people',
        render: function (h, params) {
            return h('Poptip', {
                props: {
                    trigger: 'hover',
                    title: params.row.people.length + 'customers',
                    placement: 'bottom'
                }
            }, [
                h('Tag', params.row.people.length),
                h('div', {
                    slot: 'content'
                }, [
                    h('ul', this.tableData1[params.index].people.map(item => {
                        return h('li', {
                            style: {
                                textAlign: 'center',
                                padding: '4px'
                            }
                        }, item.n + '：' + item.c + 'People')
                    }))
                ])
            ]);
        }
    },*/
    {
        title: 'Sampling Time',
        key: 'time',
        render: function (h, params) {
            return h('div', 'Almost' + params.row.time + 'days');
        }
    },
    {
        title: 'Updated Time',
        key: 'update',
        render: function (h, params) {
            return h('div', this.formatDate(this.tableData1[params.index].update));
        }
    }
];

var vm = new Vue({
    el: '#app',
    data: {
        visible: false,
        tableData1: null,
        tableColumns1: tableColumns1

    },
    methods: {
        show: function () {
            this.visible = true;
        },
        mockTableData1: function () {
            let data = [];
            for (let i = 0; i < 10; i++) {
                data.push({
                    name: 'Business' + Math.floor(Math.random() * 100 + 1),
                    status: Math.floor(Math.random() * 3 + 1),
                    portrayal: ['City', 'People', 'Cost', 'Life', 'Entertainment'],
                    /*people: [
                        {
                            n: 'People' + Math.floor(Math.random() * 100 + 1),
                            c: Math.floor(Math.random() * 1000000 + 100000)
                        },
                        {
                            n: 'People' + Math.floor(Math.random() * 100 + 1),
                            c: Math.floor(Math.random() * 1000000 + 100000)
                        },
                        {
                            n: 'People' + Math.floor(Math.random() * 100 + 1),
                            c: Math.floor(Math.random() * 1000000 + 100000)
                        }
                    ],*/
                    time: Math.floor(Math.random() * 7 + 1),
                    update: new Date()
                })
            }
            return data;
        },
        formatDate: function () {
            var y = date.getFullYear();
            let m = date.getMonth() + 1;
            m = m < 10 ? '0' + m : m;
            let d = date.getDate();
            d = d < 10 ? ('0' + d) : d;
            return y + '-' + m + '-' + d;
        },
        changePage: function () {
            // The simulated data is changed directly here, and the actual usage scenario should fetch the data from the server
            this.tableData1 = this.mockTableData1();
        }
    }
});
vm.tableData1 = vm.mockTableData1();