<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
    <a href="/queryAll">查询全部数据</a>
    <br>
    <from mothod="post" action="/insert">
        姓名<input type="text" name="name"><br>
        年龄<input type="text" name="age"><br>
        <input type="submit" value="插入表单数据"><br>
    </from>
</body>
</html>
