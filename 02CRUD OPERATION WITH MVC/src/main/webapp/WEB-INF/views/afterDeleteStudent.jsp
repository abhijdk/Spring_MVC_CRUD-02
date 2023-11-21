<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 20-11-2023
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        /* Apply red color to h2 element */
        h2 {
            color: red;
            background: yellow;
        }
    </style>
</head>
<body><a href="/Demo">Home</a><hr>
<h2>${student.getName()} record Deleted successfully</h2><hr>
<h6><a href="/Demo/studentView?id=0">View All Student Record</a> </h6>
<h6><a href="/Demo/form">ADD Student</a> </h6>
<h6><a href="/Demo/byId?id=0">ById & Name</a> </h6>

</body>
</html>
