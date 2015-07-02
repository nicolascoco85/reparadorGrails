<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to Grails</title>
	</head>
	<body>
		<h1>Elige sus componentes</h1>
		
			<g:if test="${command}">
				<g:hasErrors bean="${command}">
					<div class="alert alert-error slide_down_on_show">
						<strong>Han ocurrido los siguientes errores:</strong>
						<ul>
							<g:eachError bean="${command}" var="error">
								<li><g:message error="${error}" /></li>
							</g:eachError>
						</ul>
					</div>
				</g:hasErrors>
			</g:if>
		
			<g:form action="Elegir componente" enctype="multipart/form-data">
				nombre: <g:textField name="nombre" value="${command.nombre}" /><br/>
				raza: <g:textField name="raza" value="${command.raza}" /> <br/>
				direccion: <g:textField name="direccion" value="${command.direccion}" />
				
				foto: <input type="file" name="fotito" />
				
				
				<input type="submit" value="dale que lo perdí" />
			</g:form>
	</body>
</html>