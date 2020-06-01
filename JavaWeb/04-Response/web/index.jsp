<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script>
        window.onload = function () {

            var img = document.getElementById("checkCode");
            img.onclick = function () {
                var date = new Date().getTime();
                img.src = "/03-Response/responseVerificationCode?"+date;
            }


            var change = document.getElementById("change");
            change.onclick = function () {
                var img = document.getElementById("checkCode");
                var date = new Date().getTime();
                img.src = "/03-Response/responseVerificationCode?"+date
            }
        }
    </script>
</head>
<body>
    <a href="/03-Response/responseRedirect">完成重定向</a><br>
    <a href="/03-Response/responseOutputCharacters">输出字符流</a><br>
    <a href="/03-Response/responseOutputByte">输出字节流</a><br>
    <a href="/03-Response/responseVerificationCode">验证码</a><br>

    <img id="checkCode" src="/03-Response/responseVerificationCode" alt="加载错误">
    <a id="change" href="#">看不清换一张</a><br>
    <a href="/03-Response/img/1.jpg">图片不提示直接下载</a><br>
    <a href="/03-Response/servletDown?filename=1.jpg">图片提示再下载</a><br>

<ol type="1" start="5">
    <li>e</li>
    <li>e</li>
    <li>e</li>
</ol>
</body>
</html>
