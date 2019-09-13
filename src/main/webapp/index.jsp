<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Words Counter</title>
</head>
<body>
some text
<form method="post" action="/counter">
    <textarea name="words"></textarea>
    <input type="submit" value="Send words"/>
</form>
</body>
</html>