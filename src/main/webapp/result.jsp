<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <jsp:useBean id="function" class="com.example.webtdd.beans.FunctionClass" scope="request"/>
    <h1>Result:</h1>
    <h2>${function.getMinValueAndIndex(function.getFillY(function.fillX))}</h2>
    <h2>${function.getMaxValueAndIndex(function.getFillY(function.fillX))}</h2>
    <h2>Sum: ${function.getSum(function.getFillY(function.fillX))}</h2>
    <h2>Average: ${function.getAvg(function.getFillY(function.fillX))}</h2>
</body>
</html>
