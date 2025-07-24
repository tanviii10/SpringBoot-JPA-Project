<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bank Dashboard</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap Icons CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(to right, #e0f7fa, #e1f5fe);
            font-family: 'Segoe UI', sans-serif;
        }
        .navbar {
            box-shadow: 0 4px 6px rgba(0,0,0,0.1);
        }
        .dashboard-title {
            margin: 2rem 0 1.5rem;
            text-align: center;
            font-weight: bold;
            color: #0d6efd;
        }
        .card {
            transition: transform 0.3s ease, box-shadow 0.3s ease;
            border: none;
        }
        .card:hover {
            transform: scale(1.03);
            box-shadow: 0 8px 16px rgba(0,0,0,0.2);
        }
        .card i {
            font-size: 2.5rem;
            margin-bottom: 0.5rem;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand fw-bold" href="#">🏦 BankApp</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto text-center">
                <li class="nav-item"><a class="nav-link text-white" href="add">New Account</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="deposit">Deposit</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="withdraw">Withdraw</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="transfer">Transfer</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="search">Search</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="close">Close Account</a></li>
            </ul>
        </div>
    </div>
</nav>

<!-- Title -->
<div class="container">
    <h2 class="dashboard-title">Welcome to Your Banking Dashboard</h2>

    <div class="row g-4 mb-5">
        <!-- New Account -->
        <div class="col-md-4">
            <div class="card bg-light text-center p-3">
                <i class="bi bi-person-plus-fill text-primary"></i>
                <h5 class="card-title">Open New Account</h5>
                <p class="card-text">Open a savings, fixed, current, or PPF account quickly.</p>
                <a href="add" class="btn btn-outline-primary">Create Account</a>
            </div>
        </div>

        <!-- Deposit -->
        <div class="col-md-4">
            <div class="card bg-light text-center p-3">
                <i class="bi bi-wallet-fill text-success"></i>
                <h5 class="card-title">Deposit Money</h5>
                <p class="card-text">Deposit money securely to grow your balance.</p>
                <a href="deposit" class="btn btn-outline-success">Deposit</a>
            </div>
        </div>

        <!-- Withdraw -->
        <div class="col-md-4">
            <div class="card bg-light text-center p-3">
                <i class="bi bi-cash-stack text-danger"></i>
                <h5 class="card-title">Withdraw Funds</h5>
                <p class="card-text">Withdraw cash securely from your account.</p>
                <a href="withdraw" class="btn btn-outline-danger">Withdraw</a>
            </div>
        </div>

        <!-- Transfer -->
        <div class="col-md-4">
            <div class="card bg-light text-center p-3">
                <i class="bi bi-arrow-left-right text-info"></i>
                <h5 class="card-title">Transfer Money</h5>
                <p class="card-text">Transfer funds to other accounts with ease.</p>
                <a href="transfer" class="btn btn-outline-info">Transfer</a>
            </div>
        </div>

        <!-- Search -->
        <div class="col-md-4">
            <div class="card bg-light text-center p-3">
                <i class="bi bi-search text-secondary"></i>
                <h5 class="card-title">Search Account</h5>
                <p class="card-text">Find account details using account number.</p>
                <a href="search" class="btn btn-outline-secondary">Search</a>
            </div>
        </div>

        <!-- Close Account -->
        <div class="col-md-4">
            <div class="card bg-light text-center p-3">
                <i class="bi bi-person-dash-fill text-dark"></i>
                <h5 class="card-title">Close Account</h5>
                <p class="card-text">Permanently close a customer account.</p>
                <a href="close" class="btn btn-outline-dark">Close</a>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS Bundle -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>