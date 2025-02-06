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
					<h3 class="card-title py-4">Login to your account !</h3>
					<form action="Login" method="post">
						<div class="mb-3">
							<label for="email" class="form-label">Email</label> <input
								type="email" class="form-control" id="email" name="email">
						</div>

						<div class="mb-3">
							<label for="password" class="form-label">Password</label> <input
								type="password" class="form-control" id="password"
								name="password">
						</div>
						<button type="submit" class="btn btn-primary">Login</button>
						<p>Don't have an account ? <a href="SignUp">Sign Up</a></p>
					</form>
				</div>
			</div>

		</div>

	</div>

</body>
</html>