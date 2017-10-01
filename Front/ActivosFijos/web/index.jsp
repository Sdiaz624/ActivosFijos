<%-- 
    Document   : index
    Created on : 30/09/2017, 06:32:43 PM
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">

    <!-- Mirrored from premiumlayers.com/demos/unik/skin4/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 12 Aug 2015 18:31:29 GMT -->
    <!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
    <head>
        <title>Activos fijos</title>

        <meta charset="utf-8">

        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,400,700,600,300' rel='stylesheet' type='text/css'>

        <link rel="stylesheet" href="css/bootstrap.css" type="text/css" media="screen">
        <link rel="stylesheet" type="text/css" href="css/animate.css" media="screen">
        <link rel="stylesheet" type="text/css" href="css/Sergio.css" media="screen">
        <link rel="stylesheet" type="text/css" href="css/flexslider.css" media="screen">
        <link rel="stylesheet" type="text/css" href="css/jquery.bxslider.css" media="screen">
        <link rel="stylesheet" type="text/css" href="css/magnific-popup.css" media="screen">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.css" media="screen">
        <link rel="stylesheet" type="text/css" href="css/style.css" media="screen">
        <script type="text/javascript" src="js/procesarMenuDir.js"></script>
        <script type="text/javascript" src="js/Front.js"></script>
        <script type="text/javascript" src="js/noVolver.js"></script>
    </head>
    <body onload="nobackbutton()">
        <!-- Container -->


        <div id="container" class="container">
            <!-- sidebar
                ================================================== -->
            <div id="sidebar">

                <!-- header -->
                <header class="sidebar-section">

                    <a class="elemadded responsive-link" href="#">Menú</a>
                    <div class="navbar-vertical">
                        <ul class="main-menu">

                            <li class="drop"><a><i class="fa fa-home"></i>Area</a>
                                <ul class="drop-down">
                                    <li><a onclick="registrarArea()">Registrar</a></li>
                                    <li><a onclick="listarArea()">Listar</a></li>

                                </ul>
                            </li>
                            <li class="drop"><a><i class="fa fa-home"></i>Persona</a>
                                <ul class="drop-down">
                                    <li><a onclick="registrarPersona()">Registrar</a></li>
                                    <li><a onclick="listarPersona()">Listar</a></li>

                                </ul>
                            </li>
                            <li class="drop"><a><i class="fa fa-home"></i>Activo</a>
                                <ul class="drop-down">
                                    <li><a onclick="registrarActivo()">Registrar</a></li>
                                    <li><a onclick="actualizarActivo()">Actualizar</a></li>
                                    <li><a onclick="listarActivo()">Listar todas</a></li>
                                    <li><a onclick="listarPorSerie()">Listar Por Serie</a></li>
                                    <li><a onclick="listarPorFecha()">Listar Por Fecha</a></li>
                                    <li><a onclick="listarPorTipo()">Listar Por Tipo</a></li>                                    
                                </ul>
                            </li>                         
                        </ul>
                    </div>
                </header>
            </div>        
                                
                <div id="content">
                <!-- slider 
                            ================================================== -->
                    <div id="ajax"> 
                        
                    </div>
                </div>
                <!-- End Sidebar -->
            
                <script type="text/javascript" src="js/jquery.min.js"></script>
                <script type="text/javascript" src="js/jquery.migrate.js"></script>
                <script type="text/javascript" src="js/jquery.appear.js"></script>
                <script type="text/javascript" src="js/jquery.magnific-popup.min.js"></script>
                <script type="text/javascript" src="js/bootstrap.js"></script>
                <script type="text/javascript" src="js/raphael-min.js"></script>
                <script type="text/javascript" src="js/DevSolutionSkill.min.js"></script>
                <script type="text/javascript" src="js/jquery.flexslider.js"></script>
                <script type="text/javascript" src="js/jquery.bxslider.min.js"></script>
                <script type="text/javascript" src="js/retina-1.1.0.min.js"></script>
                <script type="text/javascript" src="js/waypoint.min.js"></script>
                <script type="text/javascript" src="js/plugins-scroll.js"></script>
                <script type="text/javascript" src="js/script.js"></script>

                </body>

                <!-- Mirrored from premiumlayers.com/demos/unik/skin4/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 12 Aug 2015 18:32:48 GMT -->
                </html>
