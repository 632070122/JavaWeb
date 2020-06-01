window.onload = function () {

    /*1.给表单绑定onsubmit事件,监听器中判断每个方法校验的结果*/
    document.getElementById("form").onsubmit = function () {
        return checkUsername() && checkPassword() &&checkEmail() &&checkName() &&checkTel();
    }

    /*2.绑定离焦事件*/
    document.getElementById("username").onblur = checkUsername;
    document.getElementById("password").onblur = checkPassword;
    document.getElementById("email").onblur = checkEmail;
    document.getElementById("name").onblur = checkName;
    document.getElementById("tel").onblur = checkTel;


    /*3.定义方法分别校验各个表单项*/
    function checkUsername() {
        var username = document.getElementById("username").value;
        var reg_username = /^\w{6,12}$/;
        var flag = reg_username.test(username);
        var s_username = document.getElementById("s_username");
        if(flag){
            s_username.innerHTML = "<img src='../04-表单校验/img/timg.jpg'>"
        }else {
            s_username.innerHTML = "用户名格式错误"
        }
    }

    function checkPassword() {
        var password = document.getElementById("password").value;
        var reg_password = /^\w{6,12}$/;
        var flag = reg_password.test(password);
        var s_password = document.getElementById("s_password");
        if(flag){
            s_password.innerHTML = "<img src='../04-表单校验/img/timg.jpg'>"
        }else {
            s_password.innerHTML = "密码格式错误"
        }
    }

    function checkEmail() {
        var email = document.getElementById("email").value;
        var reg_email = /^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
        var flag = reg_email.test(email);
        var s_email = document.getElementById("s_email");
        if(flag){
            s_email.innerHTML = "<img src='../04-表单校验/img/timg.jpg'>"
        }else {
            s_email.innerHTML = "邮箱格式错误"
        }
    }

    function checkName() {
        var name = document.getElementById("name").value;
        var reg_name = /^[\u2E80-\u9FFF]+$/;
        var flag = reg_name.test(name);
        var s_name = document.getElementById("s_name");
        if(flag){
            s_name.innerHTML = "<img src='../04-表单校验/img/timg.jpg'>"
        }else {
            s_name.innerHTML = "姓名格式错误"
        }
    }

    function checkTel() {
        var tel = document.getElementById("tel").value;
        var reg_tel = /^1[3456789]\d{9}$/;
        var flag = reg_tel.test(tel);
        var s_tel = document.getElementById("s_tel");
        if(flag){
            s_tel.innerHTML = "<img src='../04-表单校验/img/timg.jpg'>"
        }else {
            s_tel.innerHTML = "手机号格式错误"
        }
    }
}