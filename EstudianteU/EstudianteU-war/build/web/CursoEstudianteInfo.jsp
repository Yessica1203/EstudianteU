<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Relación del Curso y Estudiante </title>
    </head>
    <body>
        <!Pide los datos que necesita>
        <h1>Relación del Curso y Estudiante </h1>
        <form action="./CursoEstudianteServlet" method="POST">
            <table>
                <tr>
                    <td>Id Curso</td>
                    <td><input type="text" name="Id Curso" value="${curStu.idCurso}" /></td>
                </tr>
                <tr>
                    <td>Id Estudiante</td>
                    <td><input type="text" name="Id Estudiante" value="${curStu.idEstudiste}" /></td>
                </tr>
                <tr>
                    <td>Nota</td>
                    <td><input type="text" name="lastName" value="${curStu.nota}" /></td>
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
            <th>Id Curso</th>
            <th>Id Estudiante</th>
            <th>Nota</th>
            
                <c:forEach items="${allCurStudent}" var="curS">
                <tr>
                    <td>${curS.idCurso}</td>
                    <td>${curS.idEstudiste}</td>
                    <td>${curS.nota}</td>
                   </tr>
            </c:forEach> 
        </table>
    </body>
</html>
