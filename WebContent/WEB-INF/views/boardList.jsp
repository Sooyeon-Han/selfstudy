<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<fmt:requestEncoding value="UTF-8" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/a00_com/bootstrap.min.css">
<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css">
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script type="text/javascript">
	
<%--
 
 
--%>
	//
	$(document).ready(function() {

	});
</script>
</head>
<body>
	<div class="jumbotron text-center">
		<h2>게시글 목록</h2>
	</div>
	<div class="container">
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
			<%--현재 클릭한 페이지 번호 hidden으로 --%>
			<input class="form-control mr-sm-2" path="subject" placeholder="제목" />
			<input class="form-control mr-sm-2" path="writer" placeholder="작성자" />
			<button class="btn btn-info" type="button" id="regBtn">등록</button>
			&nbsp;&nbsp;
			<button class="btn btn-success" type="submit">Search</button>
		</nav>
		<%--총 건수와 페이지 크기 표현 --%>
		<div class="input-group lb-3">
			<div class="input-group-prepend">
				<span class="input-group-text">총 : 건</span>
			</div>
			<input class="form-control" />
			<div class="input-group-append">
				<%--<span class="input-group-text">페이지 크기</span>
  		<form:select path="pageSize" items ="${pageOp }" class="form-control"/> --%>
			</div>
		</div>
		<table class="table table-hover">
			<thead>
				<tr class="table-success text-center">
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>등록일</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>

	</div>
</body>
</html>