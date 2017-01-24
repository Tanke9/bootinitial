<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE-edge">
	<meta http-equiv="Pragma" content="no-cache">
	<meta http-equiv="Cache-Control" content="no-cache">
	<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
	
	<title>User Manager | Home</title>
	
	<link href="static/css/bootstrap.min.css" rel="stylesheet">
	<link href="static/css/style.css" rel="stylesheet">
</head>
<body>

	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Bootsample</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="new-user">Create User</a></li>
					<li><a href="all-users">All User</a></li>
				</ul>
			</div>
		</div>
	</div>
	<c:choose>
		<c:when test="${mode == 'MODE_HOME'}">
			<div class="container" id="homeDiv">
						<div class="jumbotron text-center">
								<h1>Wellcome to User Manager</h1>
						</div>
					</div>
				</c:when>
				<c:when test="${mode == 'MODE_USERS'}">
						<div class="container text-center" id="usersDiv">
				<h3>My Users</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Login</th>
								<th>Password</th>
								<th>Email</th>
								<th>Rol</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="user" items="${users}">
								<tr>
									<td>${user.id}</td>
									<td>${user.name}</td>
									<td>${user.login}</td>
									<td>${user.password}</td>
									<td>${user.email}</td>
									<td>${user.rol}</td>
									<td><a href="update-user?id=${user.id}"><span class="glyphicon glyphicon-pencil"></span> </a> </td>
									<td><a href="delete-user?id=${user.id}"><span class="glyphicon glyphicon-trash"></span> </a> </td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			</c:when>
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage User</h3>
				<form class="form-horizontal" method="POST" action="save-user">
				<input type="hidden" name="id" value="${user.id}">
				<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="name" value="${user.name}">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Login</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="login" value="${user.login}">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Password</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="password" value="${user.password}">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Email</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="email" value="${user.email}">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Rol</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="rol" value="${user.rol}">
						</div>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save"/>
					</div>
				</form>
			</div>
			</c:when>
	</c:choose>
	


<script type="static/js/bootstrap.min.js"></script>
</body>

</html>