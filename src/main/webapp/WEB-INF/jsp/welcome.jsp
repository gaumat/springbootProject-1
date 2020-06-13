<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<div class="container">
	Welcome ${name}!! <a href="/employees">Click here</a> to manage your
	todo's.
</div>
</html>
<%@ include file="common/footer.jspf"%>