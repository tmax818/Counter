<!-- Here we have to import the Date class. -->
<!-- You will put the import in the first line of the jsp tag. Use the import attribute -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Demo JSP</title>
</head>
<body>
<!-- Inserting a for loop into your jsp -->
<h2>You have visited: <c:out value="${countToShow}"/> times!!</h2>
<a href="/">visit again</a>
<a href="/reset">reset</a>
</body>
</html>
