<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.cestar.model.User" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<%
    // Fetch the logged-in user from session
    User user = (User) session.getAttribute("user");
    String username = (user != null) ? user.getUserName() : "Guest";
%>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand" href="#">Dashboard</a>
        <div class="collapse navbar-collapse justify-content-end">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a href="logout" class="btn btn-outline-light">Logout</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Welcome Message -->
<div class="container text-center mt-5">
    <h2 class="text-primary">Hello <%= username %>, Welcome to the Dashboard!</h2>
</div>

<!-- Content Section -->
<div class="container mt-4">
    <div class="row">
        <div class="col-md-6 mx-auto">
            <div class="card shadow-lg border-0">
                <div class="card-body text-center">
                    <h4 class="card-title text-success">You're successfully logged in!</h4>
                    <a href="logout" class="btn btn-danger mt-3">Logout</a>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
