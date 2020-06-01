<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<a href="/02-Request/servletRow?name=zhangsan">测试请求行</a>
<br>
<a href="/02-Request/servletHead">测试请求头</a>
<br>
<h3>测试请求体</h3>
<form action="/02-Request/servletBody" method="post">
    姓名:<input type="text" name="username" value="zhangsan">
    姓名:<input type="text" name="password" value="zhangsan">
    <input type="submit" value="提交">
</form>
<br>
<h3>通用请求参数</h3>
<form action="/02-Request/servletCommonParameter" method="post">
    姓名:<input type="text" name="username" value="zhangsan"><br>
    姓名:<input type="text" name="password" value="zhangsan"><br>
    游戏<input type="checkbox" name="hobby" value="game">
    学习<input type="checkbox" name="hobby" value="study">
    <input type="submit" value="提交">
</form>
<br>
<a href="/02-Request/servletRow?name=zhangsan">测试请求行</a>
<a href="/02-Request/servletForward">请求转发</a>
<a href="/02-Request/servletContextMIME">获取MIME类型</a>
<a href="/02-Request/servletContextSharedData">共享最大数据</a>
<a href="/02-Request/servletContextFilePath">获取文件真实路径</a>
</body>
</html>
