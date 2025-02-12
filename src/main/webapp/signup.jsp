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
		<%-- Display error message if present --%>
		<%
		String successMessage = (String) request.getAttribute("success");
		%>
		<%
		String errorMessage = (String) request.getAttribute("error");
		%>
		<%
		if (successMessage != null || errorMessage != null) {
		%>
		<div
			class="alert alert-<%=(successMessage != null) ? "success" : "danger"%> alert-dismissible fade show"
			role="alert">
			<%=(successMessage != null) ? successMessage : errorMessage%>
			<button type="button" class="btn-close" data-bs-dismiss="alert"
				aria-label="Close"></button>
		</div>
		<%
		}
		%>
		<div class="row justify-content-center">
			<div class="card pt-6" style="width: 30rem;">
				<div class="card-body">
					<h3 class="card-title py-4">Create an account !</h3>
					<form action="signup" method="post">
						<div class="mb-3">
							<label for="username" class="form-label">User Name <span
								class="text-danger">*</span></label> <input type="text"
								class="form-control" id="username" name="username" required
								placeholder="Enter username">
						</div>

						<div class="mb-3">
							<label for="password" class="form-label">Password <span
								class="text-danger">*</span></label> <input type="password"
								class="form-control" id="password" name="password"
								pattern=".{6,}" required
								placeholder="Enter password (must be at least 6 characters)">
						</div>

						<div class="mb-3">
							<label for="email" class="form-label">Email <span
								class="text-danger">*</span></label> <input type="email"
								class="form-control" id="email" name="email" required
								placeholder="Enter email">
						</div>

						<div class="mb-3">
							<label for="contact" class="form-label">Contact <span
								class="text-danger">*</span></label> <input type="text"
								class="form-control" id="contact" name="contact" required
								placeholder="Enter contact">
						</div>

						<div class="mb-3">
							<label for="city" class="form-label">City <span
								class="text-danger">*</span></label> <input type="text"
								class="form-control" id="city" name="city" required
								placeholder="Enter city">
						</div>

						<button type="submit" class="btn btn-primary">Sign Up</button>
						<p>
							Already have an account ? <a href="login-form">Login</a>
						</p>
					</form>
				</div>
			</div>

		</div>

	</div>

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.3/js/bootstrap.min.js"
		integrity="sha512-ykZ1QQr0Jy/4ZkvKuqWn4iF3lqPZyij9iRv6sGqLRdTPkY69YX6+7wvVGmsdBbiIfN/8OdsI7HABjvEok6ZopQ=="
		crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</body>
</html>