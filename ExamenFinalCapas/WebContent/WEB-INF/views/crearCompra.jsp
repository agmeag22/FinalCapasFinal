<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Compra</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/crearCompradone" method="post">
	<select name="producto">
	<c:forEach items="${ productos}" var="producto">
		<option value="${producto.cproducto}">${producto.nombre}</option>
	</c:forEach>
	</select>
	<select name="cliente">
	<c:forEach items="${ clientes}" var="cliente">
		<option value="${cliente.ccliente}">${cliente.nombres} ${cliente.apellidos}</option>
	</c:forEach>
	</select>
	
	<label>Cantidad: </label>
	<input type="number" name="ncatidad" required>
	<br>
	<input type="submit" value="RealizarCompra">
	
	</form>

</body>
</html>