<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>User Auth System</title>
</head>
<body class="d-flex justify-content-center align-items-center vh-100">
	<div class="container">
		<div class="row justify-content-center">
			<div class="card pt-6" style="width: 30rem;">
				<div class="card-body">
					<h3 class="card-title py-4">Create an account !</h3>
					<form action="SignUp">
						<div class="mb-3">
							<label for="username" class="form-label">User Name</label> <input
								type="text" class="form-control" id="username" name="username">
						</div>

						<div class="mb-3">
							<label for="password" class="form-label">Password</label> <input
								type="password" class="form-control" id="password"
								name="password">
						</div>
						
						<div class="mb-3">
							<label for="email" class="form-label">Email</label> <input
								type="email" class="form-control" id="email" name="email">
						</div>
						
						<div class="mb-3">
							<label for="contact" class="form-label">Contact</label> <input
								type="text" class="form-control" id="contact" name="contact">
						</div>
						
						<div class="mb-3">
							<label for="city" class="form-label">City</label> <input
								type="text" class="form-control" id="city" name="city">
						</div>
						
						<button type="submit" class="btn btn-primary">Sign Up</button>
						<p>Already have an account ? <a href="index.jsp">Login</a></p>
					</form>
				</div>
			</div>

		</div>

	</div>

</body>
</html>