<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">

<head>
	<link rel="stylesheet" href="/css/style.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css" integrity="sha384-KA6wR/X5RY4zFAHpv/CnoG2UW1uogYfdnP67Uv7eULvTveboZJg0qUpmJZb5VqzN" crossorigin="anonymous">
	<link rel="stylesheet" href="/assets/owlcarousel/assets/owl.carousel.min.css" />

    
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="/js/owl.carousel.min.js"></script>

    <!-- fontAwesome -->
    <!-- <script src="https://kit.fontawesome.com/b79e81a6e4.js" crossorigin="anonymous"></script> -->
    
    
</head>

<body>
    <tiles:insertAttribute name="header" />
       
    <tiles:insertAttribute name="body" />
  
    <tiles:insertAttribute name="footer" />
   
	<script src="/js/script.js"></script>
</body>

</html>