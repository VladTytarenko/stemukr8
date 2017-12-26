<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="./images/favicon.ico">

    <title>STEMUKR</title>

    <!-- Bootstrap core CSS -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="./css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <!-- <link href="css/cover.css" rel="stylesheet"> -->
    <!-- <link rel="stylesheet/less" type="text/css" href="less/main.less" /> -->
    <link rel="stylesheet" type="text/css" href="./css/main.css">

    <!-- Less CDN -->
    <!-- <script src="./js/less.min.js"></script> -->

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="./js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                    <h3 class="masthead-brand">STEM</h3>
                    <nav>
                        <ul class="nav masthead-nav">
                            <li class="active"><a href="./login">Log in</a></li>
                        </ul>
                    </nav>
                </div>
            </div>

            <div class="inner cover">

                <form class="form-horizontal" name="login" role="form" method="POST" action="/login">
                    <div class="row">
                        <div class="col-md-12">
                            <h1 class="cover-heading uppercase">Welcome</h1>
                            <hr class="hr-style">
                        </div>
                    </div>
                    <div class="center">
                        <div class="row centered-form center-block">
                            <div class="col-md-3 field-label-responsive">
                                <label for="email">E-Mail Address</label>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <div class="input-group mb-2 mr-sm-2 mb-sm-0">
                                        <div class="input-group-addon" style="width: 2.6rem"><i class="glyphicon glyphicon-send"></i></div>
                                        <!--<input type="text" name="email" class="form-control" id="email"
                                               placeholder="you@example.com" required autofocus>-->
                                        <input title="Username" type="email" class="form-control" id="email" name="username" placeholder="you@example.com" required autofocus>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-control-feedback strokes">
                                 <span class="text-danger align-middle">
                                     <!-- Put e-mail validation error messages here -->
                                 </span>
                                </div>
                            </div>
                        </div>
                        <div class="row centered-form center-block">
                            <div class="col-md-3 field-label-responsive">
                                <label for="password">Password</label>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group has-danger">
                                    <div class="input-group mb-2 mr-sm-2 mb-sm-0">
                                        <div class="input-group-addon" style="width: 2.6rem"><i class="glyphicon glyphicon-lock"></i></div>
                                        <!--<input type="password" name="password" class="form-control" id="password"
                                               placeholder="Password" required>-->
                                        <input title="Password" type="password" name="password" class="form-control" id="password"
                                               placeholder="Password" required>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-control-feedback strokes">
                                 <span class="text-danger align-middle">
                                     <!--<i class="fa fa-close ">Example Error Message</i>-->
                                 </span>
                                </div>
                            </div>
                        </div>
                        <div class="row centered-form center-block">
                            <div class="col-md-3"></div>
                            <div class="col-md-6">
                                <button type="submit" value="Login" class="btn btn-default btn-lg btn-block register-button"><i class="fa fa-user-plus"></i>Enter</button>
                            </div>
                        </div>
                    </div>
                </form>

                <!--<h1 class="cover-heading">Cover your page.</h1>
                <p class="lead">Cover is a one-page template for building simple and beautiful home pages. Download, edit the text, and add your own fullscreen background photo to make it your own.</p>
                <p class="lead">
                  <a href="#" class="btn btn-lg btn-default">Learn more</a>
               </p>-->

            </div>

            <div class="mastfoot">
                <div class="inner">
                    <p>Developed in National University of Kyiv-Mohyla Academy.</p>
                </div>
            </div>

        </div>

    </div>

</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="./js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="./js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>



<!--<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="login" action="/login" method="post">
    <p>Email:</p>
    <input title="Username" type="email" name="username">
    <p>Password:</p>
    <input title="Password" type="password" name="password">
    <input type="submit" value="Login">
</form>
</body>
</html>-->
