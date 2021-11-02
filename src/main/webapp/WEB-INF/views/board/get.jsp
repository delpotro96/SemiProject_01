<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Daily Tennis</title>
<link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.min.js" integrity="sha512-3j3VU6WC5rPQB4Ld1jnLV7Kd5xr+cq9avvhwqzbH/taCRNURoeEpoPBK9pDyeukwSxwRPJ8fDgvYXd6SkaZ2TA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>


</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="../../">Daily Tennis</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor02" aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarColor02">
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
          <a class="nav-link active" href="#">Home
            <span class="visually-hidden">(current)</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">About</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Dropdown</a>
          <div class="dropdown-menu">
            <a class="dropdown-item" href="#">Action</a>
            <a class="dropdown-item" href="#">Another action</a>
            <a class="dropdown-item" href="#">Something else here</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">Separated link</a>
          </div>
        </li>
      </ul>
      <form class="d-flex">
      </form>
    </div>
  </div>
</nav>
<a href="/board/list">글 목록</a>

    <div class="form-group">
      <label for="exampleInputEmail1" class="form-label mt-4">게시판 번호</label>
      <input name = "bno" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"  value='<c:out value="${pageInfo.bno}"/>' readonly="readonly">
    </div>
    <div class="form-group">
      <label for="exampleInputEmail1" class="form-label mt-4">게시판 제목</label>
      <input name = "title" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"  value='<c:out value="${pageInfo.title}"/>' readonly="readonly">
    </div>
    <div class="form-group">
      <label for="exampleTextarea" class="form-label mt-4">게시판 내용</label>
      <br><br><iframe id="iframeId" width="560" height="315" src="https://www.youtube.com/embed/${pageInfo.youtube }" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe><br>  
      <br><br>
      <div name="content" class="form-control" id="exampleTextarea" rows="3" readonly="readonly"><c:out value="${pageInfo.content}"/>
      	
      </div>
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1" class="form-label mt-4">게시판 작성자</label>
      <input name="writer" type="text" class="form-control" id="exampleInputPassword1" readonly="readonly" value='<c:out value="${pageInfo.writer}"/>'>
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1" class="form-label mt-4">게시판 등록일</label>
      <input name="regdate" type="text" class="form-control" id="exampleInputPassword1" readonly="readonly" value='<fmt:formatDate pattern="yyyy/MM/dd" value="${pageInfo.regdate}"/>'>
    </div>

<script>
	let form = $("#infoForm");
	
	$("#list_btn").on("click", function(e){
		form.find("#bno").remove();
		form.attr("action", "/board/list");
		form.submit();
	});
	
	$("#modify_btn").on("click", function(e){
		form.attr("action", "/board/modify");
		form.submit();
	});	
</script>
</body>
</html>