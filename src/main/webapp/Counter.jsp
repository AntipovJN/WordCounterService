<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Counter</title>
</head>
<body>
<c:forEach items="${wordsCountMap}" var="entry">
<p>Word:
        <c:out value="${entry.key}"/>
<p>Count:
        <c:out value="${entry.value}"/>
    </c:forEach>
</body>
</html>
