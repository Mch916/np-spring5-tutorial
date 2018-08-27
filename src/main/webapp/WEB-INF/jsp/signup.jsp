<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="includes/header.jsp" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div class="card" style="margin-top: 5px;">
  <div class="card-header">
    SIGNUP
  </div>
	<form:form modelAttribute="user" style="padding: 15px;">
	
	  <form:errors cssClass="error"/>
	  
	  <div class="form-group">
	    <form:label path="email">Email address</form:label>
	    <form:input path="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" />
	    <form:errors path="email" cssClass="error" />
	  </div>
	  
	  <div class="form-group">
	    <form:label path="name">Name</form:label>
	    <form:input path="name" type="name" class="form-control" id="exampleInputName1" aria-describedby="nameHelp" placeholder="Enter name" />
	    <form:errors path="name" cssClass="error" />
	  </div>
	  
	  <div class="form-group">
	    <form:label path="password">Password address</form:label>
	    <form:input path="password" type="password" class="form-control" id="exampleInputPassword1" aria-describedby="passwordHelp" placeholder="Enter password" />
	  	<form:errors path="password" cssClass="error" />
	  </div>
	
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
</div>

	
<%@include file="includes/footer.jsp" %>