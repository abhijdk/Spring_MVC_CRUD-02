<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 20-11-2023
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        h2,h3{
            color: green;
            background: yellow;
        }
    </style>
</head>
<body>

<a href="/Demo">Home</a><hr>
<h2>Student Details Added Successfully</h2><hr>
<h3>Student Name is: ${student.getName()}</h3>
<h3>Student Mobile Number is: ${student.getMobile()}</h3>
<h3>Student Address is: ${student.getAddress()}</h3><hr>


<h6><a href="/Demo/studentView?id=0">View All Student Record</a> </h6>
<h6><a href="/Demo/form">ADD Student</a> </h6>
<h6><a href="/Demo/byId?id=0">ById & Name</a> </h6>

</body>
</html>
