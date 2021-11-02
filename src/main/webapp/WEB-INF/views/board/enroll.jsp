<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <a class="navbar-brand" href="#">Daily Tennis</a>
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

<form action="/board/enroll" method="post">
    <div class="form-group">
      <label for="exampleInputEmail1" class="form-label mt-4">Title</label>
      <input name = "title" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Title">
    </div>
    <div class="form-group">
      <label for="exampleInputEmail1" class="form-label mt-4">YouTube 주소</label>
      <input name = "youtube" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="원할 시 Youtube Full URL 중 v= 뒤 코드만 입력해주세요">
    </div>
    <div class="form-group">
      <label for="exampleTextarea" class="form-label mt-4">textarea</label>
      <textarea name="content" class="form-control" id="exampleTextarea" rows="3">
      	
      </textarea>
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1" class="form-label mt-4">writer</label>
      <input name="writer" type="text" class="form-control" id="exampleInputPassword1" placeholder="writer">
    </div>
 
    <button class="btn btn-outline-primary">등록</button>
</form>

</body>
</html>