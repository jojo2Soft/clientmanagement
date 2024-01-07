<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html lang="fr">


<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description"
        content="JBank toujours prÃªt Ã  vous accompagner.">
    <meta name="author" content="Ernest&JosuÃ©">
    <link rel="icon" href="/assets/images/favicon.png" type="image/x-icon">
    <link rel="shortcut icon" href="/assets/images/favicon.png" type="image/x-icon">
    <title>JBank
</title>
    <!-- Google font-->
    <link rel="preconnect" href="https://fonts.gstatic.com/">
    <link
        href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&amp;display=swap"
        rel="stylesheet">
    <link
        href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&amp;display=swap"
        rel="stylesheet">
    <link
        href="https://fonts.googleapis.com/css2?family=Rubik:ital,wght@0,400;0,500;0,600;0,700;0,800;0,900;1,300;1,400;1,500;1,600;1,700;1,800;1,900&amp;display=swap"
        rel="stylesheet">
    <!-- Font Awesome-->
    <link rel="stylesheet" type="text/css" href="/assets/css/fontawesome.css">
<!-- ico-font-->
<link rel="stylesheet" type="text/css" href="/assets/css/icofont.css">
<!-- Themify icon-->
<link rel="stylesheet" type="text/css" href="/assets/css/themify.css">
<!-- Flag icon-->
<link rel="stylesheet" type="text/css" href="/assets/css/flag-icon.css">
<!-- Feather icon-->
<link rel="stylesheet" type="text/css" href="/assets/css/feather-icon.css">
<!-- Plugins css start-->
<link rel="stylesheet" type="text/css" href="/assets/css/date-picker.css">
<link rel="stylesheet" type="text/css" href="/assets/css/owlcarousel.css">
<link rel="stylesheet" type="text/css" href="/assets/css/prism.css">
<link rel="stylesheet" type="text/css" href="/assets/css/whether-icon.css">
<!-- Plugins css Ends-->
<!-- Bootstrap css-->
<link rel="stylesheet" type="text/css" href="/assets/css/bootstrap.css">
<!-- App css-->

<link rel="preload" as="style" href="/builde//assets/style-48b1edf8.css" /><link rel="modulepreload" href="/builde//assets/app-e4a857d6.js" /><link rel="stylesheet" href="/builde//assets/style-48b1edf8.css" /><script type="module" src="/builde//assets/app-e4a857d6.js"></script>
<link id="color" rel="stylesheet" href="/assets/css/color-1.css" media="screen">
<!-- Responsive css-->
<link rel="stylesheet" type="text/css" href="/assets/css/responsive.css"></head>


                    <body>
                                <!-- Loader starts-->
                <div class="loader-wrapper">
                    <div class="theme-loader"></div>
                </div>
                <!-- Loader ends-->
                <!-- page-wrapper Start-->
                <div class="page-wrapper compact-sidebar" id="pageWrapper">
                    <!-- Page Header Start-->
                    <div class="page-main-header">
  <div class="main-header-right row m-0">
    <div class="main-header-left">
      <div class="logo-wrapper"><a href="dashboard.html"><img class="img-fluid" src="/assets/images/logo/logo.png" alt=""></a></div>
      <div class="dark-logo-wrapper"><a href="dashboard.html"><img class="img-fluid" src="/assets/images/logo/dark-logo.png" alt=""></a></div>
      <div class="toggle-sidebar"><i class="status_toggle middle" data-feather="align-center" id="sidebar-toggle">    </i></div>
    </div>
    <div class="left-menu-header col">
    </div>
    <div class="nav-right col pull-right right-menu p-0">
      <ul class="nav-menus">
        <li><a class="text-dark" href="#!" onclick="javascript:toggleFullScreen()"><i data-feather="maximize"></i></a></li>
        <li class="onhover-dropdown p-0">
          <button class="btn btn-primary-light" type="button"><i data-feather="log-out"></i>Déconnexion</button>
        </li>
      </ul>
    </div>
    <div class="d-lg-none mobile-toggle pull-right w-auto"><i data-feather="more-horizontal"></i></div>
  </div>
</div>
                    <!-- Page Header Ends -->
                    <!-- Page Body Start-->
                    <div class="page-body-wrapper sidebar-icon">
                        <!-- Page Sidebar Start-->
                        <header class="main-nav">
    <div class="sidebar-user text-center">
        <img class="img-90 rounded-circle" src="/assets/images/dashboard/1.png" alt="" />
        <a href="javascript:void(0)"> <h6 class="mt-3 f-14 f-w-600">Emay Walter</h6></a>
        <p class="mb-0 font-roboto">Directeur général</p>
    </div>
    <nav>
        <div class="main-navbar">
            <div class="left-arrow" id="left-arrow"><i data-feather="arrow-left"></i></div>
               <div id="mainnav">
                <ul class="nav-menu custom-scrollbar">
                    <li class="back-btn">
                        <div class="mobile-back text-end"><span>Back</span><i class="fa fa-angle-right ps-2" ></i></div>
                    </li>
                    <li class="back-btn">
                        <a class="nav-link menu-title link-nav  " href="/"><i data-feather="git-pull-request"></i><span>Dashboard</span></a>
                    </li>
                    <li class="dropdown">
                        <a class="nav-link menu-title link-nav " href="/agences/list"><i data-feather="git-pull-request"></i><span>Listes des Agences</span></a>
                    </li>
               	  <li class="dropdown">
                        <a class="nav-link menu-title" href="javascript:void(0)"><i data-feather="airplay"></i><span>Clients</span></a>
                        <ul class="nav-submenu menu-content"  style="display: block;">
                            <li><a href="/agences/clients" class="">Listes</a></li>
                            <li><a href="/clients/list/decoucouvert" class="active">Clients à découvers</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <div class="right-arrow" id="right-arrow"><i data-feather="arrow-right"></i></div>
        </div>
    </nav>
</header>
                        <!-- Page Sidebar Ends-->
                        <div class="page-body">
                            <!-- Container-fluid starts-->
                                    <div class="container-fluid">
    <div class="page-header">
      <div class="row">
        <div class="col-lg-6">
          <h3>Statistique Globale</h3>
          <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="dashboard.html">Home</a></li>
              <li class="breadcrumb-item">Widgets</li>
            <li class="breadcrumb-item active">General</li>
          </ol>
        </div>
      </div>
    </div>
</div>        
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-6 col-xl-3 col-lg-6">
                    <div class="card o-hidden border-0">
                        <div class="bg-primary b-r-4 card-body">
                            <div class="media static-top-widget">
                                <div class="align-self-center text-center"><i data-feather="database"></i></div>
                                <div class="media-body">
                                    <span class="m-0">Solde Total</span>
                                    <h4 class="mb-0 counter">6659</h4>
                                    <i class="icon-bg" data-feather="database"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-xl-3 col-lg-6">
                    <div class="card o-hidden border-0">
                        <div class="bg-secondary b-r-4 card-body">
                            <div class="media static-top-widget">
                                <div class="align-self-center text-center"><i data-feather="shopping-bag"></i></div>
                                <div class="media-body">
                                    <span class="m-0">Nombre d'agencess</span>
                                    <h4 class="mb-0 counter">${nbAgences}</h4>
                                    <i class="icon-bg" data-feather="shopping-bag"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-xl-3 col-lg-6">
                    <div class="card o-hidden border-0">
                        <div class="bg-primary b-r-4 card-body">
                            <div class="media static-top-widget">
                                <div class="align-self-center text-center"><i data-feather="message-circle"></i></div>
                                <div class="media-body">
                                    <span class="m-0">Compte Bancaires</span>
                                    <h4 class="mb-0 counter">${nbBankAccounts}</h4>
                                    <i class="icon-bg" data-feather="message-circle"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-xl-3 col-lg-6">
                    <div class="card o-hidden border-0">
                        <div class="bg-primary b-r-4 card-body">
                            <div class="media static-top-widget">
                                <div class="align-self-center text-center"><i data-feather="user-plus"></i></div>
                                <div class="media-body">
                                    <span class="m-0">Compte avec interÃªt</span>
                                    <h4 class="mb-0 counter">${nbBankAccountsWithInterest}</h4>
                                    <i class="icon-bg" data-feather="user-plus"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- 
                <div class="col-sm-12">
                    <div class="card">
                       <div class="card-header">
                            <h5>Listes des agences</h5>
                        </div>
                        <div class="card-block row">
                            <div class="col-sm-12 col-lg-12 col-xl-12">
                                <div class="table-responsive">
                                    <table class="table text-center">
                                        <thead class="table-primary">
                                            <tr>
                                                <th scope="col">#</th>
                                                <th scope="col">Numero</th>
                                                <th scope="col">Ville</th>
                                                <th scope="col">Code Postal</th>
                                                <th scope="col">Nom du manager</th>
                                               <th scope="col">Nom de la banque</th>
                                               <th scope="col">Actions  </th>
                                                
                                            </tr>
                                        </thead>
                                        <tbody>
                                          <c:forEach items="${agences}" var="agence" varStatus="loop">
                                        
                                        
                                            <tr>
                                                <th scope="row">${loop.index + 1}</th>
                                                <td>${agence.number}</td>
												<td>${agence.city}</td>
                                                <td>${agence.postalCode}</td>
                                                <td>${agence.nameOfManager}</td>
                                                <td>${agence.bank.name}</td>
                                                <td><a href="/agences/${agence.id}/clients" class="btn btn-primary">Listes des clients</a> </td>
                                                
                                            </tr>
                                            
                                          </c:forEach>   
                                            
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div> -->
                </div>
            </div>
        </div>

                                <!-- Container-fluid Ends-->
                        </div>
                        <!-- footer start-->
                                                                <footer>
                                                                        <div class="container-fluid">
                                        <div class="row">
                                            <div class="col-md-12 footer-copyright">
                                                <p class="mb-0 text-center">Copyright
                                                    2023-24 Â© JBank
                                                    Tous droits rÃ©servÃ©s.</p>
                                            </div>
                                        </div>
                                    </div>
                                </footer>
                    </div>
                </div>
                <!-- latest jquery-->
                <script src="/assets/js/jquery-3.5.1.min.js"></script>
<!-- feather icon js-->
<script src="/assets/js/icons/feather-icon/feather.min.js"></script>
<script src="/assets/js/icons/feather-icon/feather-icon.js"></script>
<!-- Sidebar jquery-->
<script src="/assets/js/sidebar-menu.js"></script>
<script src="/assets/js/config.js"></script>
<!-- Bootstrap js-->
<script src="/assets/js/bootstrap/popper.min.js"></script>
<script src="/assets/js/bootstrap/bootstrap.min.js"></script>
<!-- Plugins JS start-->
    
        <script src="/assets/js/prism/prism.min.js"></script>
        <script src="/assets/js/clipboard/clipboard.min.js"></script>
        <script src="/assets/js/counter/jquery.waypoints.min.js"></script>
        <script src="/assets/js/counter/jquery.counterup.min.js"></script>
        <script src="/assets/js/counter/counter-custom.js"></script>
        <script src="/assets/js/custom-card/custom-card.js"></script>
        <script src="/assets/js/datepicker/date-picker/datepicker.js"></script>
        <script src="/assets/js/datepicker/date-picker/datepicker.en.js"></script>
        <script src="/assets/js/datepicker/date-picker/datepicker.custom.js"></script>
        <script src="/assets/js/owlcarousel/owl.carousel.js"></script>
        <script src="/assets/js/general-widget.js"></script>
        <script src="/assets/js/height-equal.js"></script>
        <script src="/assets/js/tooltip-init.js"></script>
        <script src="/assets/js/popover-custom.js"></script>
    <!-- Plugins JS Ends-->
<!-- Theme js-->
<script src="/assets/js/script.js"></script>
<script src="/assets/js/theme-customizer/customizer.js"></script>
<!-- Plugin used-->            </body>


<!-- Mirrored from laravel.pixelstrap.com/JBank/widgets/general-widget by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 04 Sep 2023 17:12:26 GMT -->
</html>
