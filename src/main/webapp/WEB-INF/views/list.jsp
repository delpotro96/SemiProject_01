<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Daily Tennis</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.min.js"
            integrity="sha512-3j3VU6WC5rPQB4Ld1jnLV7Kd5xr+cq9avvhwqzbH/taCRNURoeEpoPBK9pDyeukwSxwRPJ8fDgvYXd6SkaZ2TA=="
            crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="js/login.js"></script>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Daily Tennis</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor02"
                aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation">
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
                    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                       aria-haspopup="true" aria-expanded="false">Dropdown</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <a class="dropdown-item" href="#">Something else here</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Separated link</a>
                    </div>
                </li>
                <li class="nav-item">
        	<span id="loginSpan">
        		ID<input id="id" size=7>
        		PW<input id="pw" type="password" size=7>
        		<button id="loginBtn" type="button" class="btn btn-primary">SignIn</button>
        	</span>
                    <button type="button" class="btn btn-primary"
                            onclick='window.open("html/memberInsert.html", "_blank", "toolbar=yes,scrollbars=yes,resizable=yes,top=100,left=300,width=400,height=550");'>
                        SignUp
                    </button>
                </li>
            </ul>
            <form class="d-flex">
            </form>
        </div>
    </div>
</nav>
<table class="table table-hover">
    <thead>
    <tr>
        <th scope="col">Type</th>
        <th scope="col">Column heading</th>
        <th scope="col">Column heading</th>
        <th scope="col">Column heading</th>
    </tr>
    </thead>
    <tbody>
    <tr class="table-active">
        <th scope="row">Active</th>
        <td>Column content</td>
        <td>Column content</td>
        <td>Column content</td>
    </tr>
    <tr>
        <th scope="row">Default</th>
        <td>Column content</td>
        <td>Column content</td>
        <td>Column content</td>
    </tr>
    <tr class="table-primary">
        <th scope="row">Primary</th>
        <td>Column content</td>
        <td>Column content</td>
        <td>Column content</td>
    </tr>
    <tr class="table-secondary">
        <th scope="row">Secondary</th>
        <td>Column content</td>
        <td>Column content</td>
        <td>Column content</td>
    </tr>
    <tr class="table-success">
        <th scope="row">Success</th>
        <td>Column content</td>
        <td>Column content</td>
        <td>Column content</td>
    </tr>
    <tr class="table-danger">
        <th scope="row">Danger</th>
        <td>Column content</td>
        <td>Column content</td>
        <td>Column content</td>
    </tr>
    <tr class="table-warning">
        <th scope="row">Warning</th>
        <td>Column content</td>
        <td>Column content</td>
        <td>Column content</td>
    </tr>
    <tr class="table-info">
        <th scope="row">Info</th>
        <td>Column content</td>
        <td>Column content</td>
        <td>Column content</td>
    </tr>
    <tr class="table-light">
        <th scope="row">Light</th>
        <td>Column content</td>
        <td>Column content</td>
        <td>Column content</td>
    </tr>
    <tr class="table-dark">
        <th scope="row">Dark</th>
        <td>Column content</td>
        <td>Column content</td>
        <td>Column content</td>
    </tr>
    </tbody>
</table>
</body>
</html>