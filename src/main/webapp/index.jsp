<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Function</title>
</head>
<body>
<img src="images/function3.png">
<br>
<h2>Enter arguments: </h2>
<form action="hello-servlet" method="post">
    <label for="a">
        Value a:
        <input type="text" id="a" name="a">
    </label>
    <br>
    <label for="b">
        Value b:
        <input type="text" id="b" name="b">
    </label>
    <br>
    <label for="c">
        Value c:
        <input type="text" id="c" name="c">
    </label>
    <hr>
    <input type="submit" value="Result">
</form>
</body>
</html>