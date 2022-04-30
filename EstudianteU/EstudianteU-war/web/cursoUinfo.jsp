<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Informacion del Curso </title>
    </head>
    <body>
        <!Pide los datos que necesita>
        <h1>Información del Curso</h1>
        <form action="./CursoUServlet" method="POST">
            <table>
                <tr>
                    <td>Id del Curso </td>
                    <td><input type="text" name="cursoId" value="${curso.cursoid}" /></td>
                </tr>
                <tr>
                    <td>Nombre del Curso</td>
                    <td><input type="text" name="nombreCurso" value="${curso.nombrecurso}" /></td>
                </tr>
                <tr>
                    <td>Número de Créditos</td>
                    <td><input type="text" name="numeroCreditos" value="${curso.numcreditos}" /></td>
                </tr>
                <tr>
                    <td>Semestre del curso</td>
                    <td><input type="text" name="semestre" value="${curso.semestre}" /></td>
                </tr>
                <tr>
                    <td>Número de estudiantes admitidos</td>
                    <td><input type="text" name="numestudadmitidos" value="${curso.numestudadmitidos}" /></td>
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
            <th>Id del Curso</th>
            <th>Nombre del curso</th>
            <th>Número de créditos</th>
            <th>Semestre</th>
            <th>Número de estudiantes admitidos</th>
            
                <c:forEach items="${allCursos}" var="cur">
                <tr>
                    <td>${cur.cursoid}</td>
                    <td>${cur.nombrecurso}</td>
                    <td>${cur.numcreditos}</td>
                    <td>${cur.semestre}</td>
                    <td>${cur.numestudadmitidos}</td>
                </tr>
            </c:forEach> 
        </table>
    </body>
</html>
