new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            password:"",
            email:"",
            sex:"",
            age:""
        },
        userList:[]
    },
   /*
    这么写也可以
    created:{
        this.findAll();
    }*/
    methods:{
        findAll:function () {
            //在当前方法中定义一个变量,表明是Vue对象
            var _this=this;
            axios.get('/user/findAll')
                .then(function (response) {
                    // handle success 请求成功的回调
                    _this.userList=response.data; //响应数据给userList;
                    console.log(response);
                })
                .catch(function (error) {
                    // handle error 请求失败的处理
                    console.log(error);
                })
                .finally(function () {
                    // always executed
                });
        },

        //根据id查询用户
        findById:function (userId) {
            var _this=this;
            axios.get('/user/findById',{
                params:
                    {userId: userId}
            })
                .then(function (response) {
                    // handle success 请求成功的回调
                    _this.user=response.data; //响应数据给userList;
                    $("#myModal").modal("show") //让模态框显示 固定写法show
                })
                .catch(function (error) {
                    // handle error 请求失败的处理
                    console.log(error);
                })
                .finally(function () {
                    // always executed
                });
            
        },


        //更新
        update:function (user) {
            var _this=this;
            axios.post('/user/update', _this.user) //这个user本质是一个json数据,后端需要处理
                .then(function (response) {
                    _this.findAll();
                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    },


    created:function(){ //当页面加载的时候触发请求,查询所有
        this.findAll();
    }
});