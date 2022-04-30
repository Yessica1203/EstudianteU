<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información del Estudiante </title>
    </head>
    <body>
        <!Pide los datos que necesita>
        <h1>Información del Estudiante </h1>
        <form action="./EstudinteUServlet" method="POST">
            <table>
                <tr>
                    <td>Id Estudiante</td>
                    <td><input type="text" name="studentId" value="${student.estudianteid}" /></td>
                </tr>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="firstName" value="${student.nombre}" /></td>
                </tr>
                <tr>
                    <td>Apellido</td>
                    <td><input type="text" name="lastName" value="${student.apellido}" /></td>
                </tr>
                <tr>
                    <td>Semestre </td>
                    <td><input type="text" name="yearLevel" value="${student.semestre}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <!botones>
                        <input type="submit" name="action" value="Add" />
                        <input type="submit" name="action" value="Edit" />
                        <input type="submit" name="action" value="Delete" />
                        <input type="submit" name="action" value="Search" />
                    </td>
                </tr>
            </table>
        </form>
        <br>
        <table border="1">
            <th>Id Estudiante</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Semestre</th>
            
                <c:forEach items="${allStudents}" var="stud">
                <tr>
                    <td>${stud.estudianteid}</td>
                    <td>${stud.nombre}</td>
                    <td>${stud.apellido}</td>
                    <td>${stud.semestre}</td>
                </tr>
            </c:forEach> 
        </table>
    </body>
</html>
