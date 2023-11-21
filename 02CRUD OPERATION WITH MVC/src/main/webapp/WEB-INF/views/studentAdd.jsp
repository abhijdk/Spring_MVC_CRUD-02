<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isErrorPage="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body><a href="/Demo">Home</a><hr>
<h1>Student Registation Form</h1>
<div align="center">
    <i>Add Student</i>
    <form:form action="insert" modelAttribute="student">


        <label>Student Id:</label>
        <form:input path="id" type="number" pattern="[0-9]" id="studentId"/>
        <form:errors path="id"  cssClass="error"/>
        <br />
        <label>Student Name:</label>
        <form:input path="name" />
        <form:errors path="name" cssClass="error"/>
        <br />
        <label>Student Mobile:</label>
        <form:input path="mobile" />
        <form:errors path="mobile" cssClass="error"/>
        <br />
        <label>Student Address:</label>
        <form:input path="address" />
        <form:errors path="address" cssClass="error"/>
        <br />
        <input type="submit" value="submit" onclick="setDefaultStudentId()"/>

    </form:form>
</div>
<style>
    .error{
        color: red;
    }
</style>
<script>
    function setDefaultStudentId() {
        var studentIdField = document.getElementById("studentId");
        if (studentIdField.value === "") {
            studentIdField.value = "0"; // Set default value to 1
        }
    }
</script>
</body>
</html>