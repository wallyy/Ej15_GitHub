<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/estilos_formulario.css" />
</head>
<body>
<!-- esto se pone en jsp no en html para que no tengamos q poner siempre proyecto por si lo cambiásemos -->
    <form action="${pageContext.request.contextPath}/Tienda/buscarPorNombre" method="get" name="buscarPorNombre">
        <fieldset>
	        <label>NOMBRE:</label>
	        <input type="text" name="nombre" id="nombre">
	        <input type="submit" name="enviar" value="ENVIAR" />
	        <input type="reset" name="reiniciar" value="REINICIAR" />
        </fieldset>
    </form>

</body>
</html>