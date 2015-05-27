<%@page import="es.curso.model.entity.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.time.LocalDateTime"%><!-- si autocompleto con eclipse importa automático -->
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
    <span><%=LocalDateTime.now() %></span>
    <span>Valor enviado desde el servlet Tienda, (iva)</span>
    <span><%=request.getAttribute("iva")%></span>  <!-- aca lo ejecutamos desde el proyecto -->
<%--     <span><%=(Integer)request.getAttribute("iva")%></span> --%>
<!-- para que eclipse autocomplete escribo poco a poco Array y <Cl ctrl+intro y sale suger
 --> 
     <% ArrayList<Cliente> clientes = (ArrayList<Cliente>)request.getAttribute("clientes");%> 

    <table>
        <tr>
	        <th>ID</th>
	        <th>NOMBRE</th>
	        <th>APELLIDO</th>
	        <th>DNI</th>
        </tr>
        
        <% for(Cliente c: clientes){ %>
            <tr>
                <td><%= c.getId() %></td>
                <td><%= c.getNombre() %></td>
                <td><%= c.getApellidos() %></td>
                <td><%= c.getDNI() %></td>
            </tr>
         <% }%>
         
        <!--  esta parte (las tr) dinámicamente depende si hay o no elem en bbdd
          usando instrucciones java embebido -->
    </table>
    <h2><%=request.getAttribute("titulo")%></h2>
<%--     <h2><%=clientes%></h2>  //SOLO EN UNA LINEA  CONSEJO --%>
</body>
</html>