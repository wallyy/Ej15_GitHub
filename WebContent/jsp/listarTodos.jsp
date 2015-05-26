<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listado de Cliente</title>
<link rel="stylesheet" href="../css/estilos_formulario.css" />
</head>
<body>
    <!--   tabla  html const dinámicamente --> 
    <table>
        <tr>
	        <th>ID</th>
	        <th>NOMBRE</th>
	        <th>APELLIDO</th>
	        <th>DNI</th>
        </tr>
        <!--  esta parte (las tr) dinámicamente depende si hay o no elem en bbdd
          usando instrucciones java embebido -->
    </table>
</body>
</html>