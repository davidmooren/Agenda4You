<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">Login Administrador</h1>
            <div class="account-wall">
                <img class="profile-img" src="https://media.licdn.com/dms/image/C4D03AQGSKf_Jkh0Gqw/profile-displayphoto-shrink_200_200/0?e=1527231600&v=alpha&t=iTQ23jmMmEwiw8OKS-gR-EJxGNIvzBztRjawjOh9EYU"
                    alt="">
                <form action="login" method="POST">
                <input type="text" class="form-control" placeholder="usuario" name="usuario" id="usuario" required autofocus>
                <input type="password" class="form-control" placeholder="Contraseña" name="password" id="password" required>
                <button class="btn btn-lg btn-primary btn-block" type="submit">
                    Entrar</button>
                <label class="checkbox pull-left">
                    <input type="checkbox" value="remember-me">
                    Recordarme
                </label>
                <a href="#" class="pull-right need-help">Necesitas ayuda? </a><span class="clearfix"></span>
                </form>
            </div>
            <a href="#" class="text-center new-account">Avisar a papa </a>
        </div>
    </div>
</div>