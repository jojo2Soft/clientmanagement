<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib
uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%@ taglib
uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="fr">
  <meta http-equiv="content-type" content="text/html;charset=UTF-8" />
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta
      name="description"
      content="JBank toujours prÃªt Ã  vous accompagner."
    />
    <meta name="author" content="Ernest&JosuÃ©" />
    <link rel="icon" href="../assets/images/favicon.png" type="image/x-icon" />
    <link
      rel="shortcut icon"
      href="../assets/images/favicon.png"
      type="image/x-icon"
    />
    <title>JBank</title>
    <!-- Google font-->
    <link rel="preconnect" href="https://fonts.gstatic.com/" />
    <link
      href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&amp;display=swap"
      rel="stylesheet"
    />
    <link
      href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&amp;display=swap"
      rel="stylesheet"
    />
    <link
      href="https://fonts.googleapis.com/css2?family=Rubik:ital,wght@0,400;0,500;0,600;0,700;0,800;0,900;1,300;1,400;1,500;1,600;1,700;1,800;1,900&amp;display=swap"
      rel="stylesheet"
    />
    <!-- Font Awesome-->
    <link
      rel="stylesheet"
      type="text/css"
      href="../assets/css/fontawesome.css"
    />
    <!-- ico-font-->
    <link rel="stylesheet" type="text/css" href="../assets/css/icofont.css" />
    <!-- Themify icon-->
    <link rel="stylesheet" type="text/css" href="../assets/css/themify.css" />
    <!-- Flag icon-->
    <link rel="stylesheet" type="text/css" href="../assets/css/flag-icon.css" />
    <!-- Feather icon-->
    <link
      rel="stylesheet"
      type="text/css"
      href="../assets/css/feather-icon.css"
    />
    <!-- Plugins css start-->
    <link
      rel="stylesheet"
      type="text/css"
      href="../assets/css/date-picker.css"
    />
    <link
      rel="stylesheet"
      type="text/css"
      href="../assets/css/owlcarousel.css"
    />
    <link rel="stylesheet" type="text/css" href="../assets/css/prism.css" />
    <link
      rel="stylesheet"
      type="text/css"
      href="../assets/css/whether-icon.css"
    />
    <!-- Plugins css Ends-->
    <!-- Plugins css start-->
    <link
      rel="stylesheet"
      type="text/css"
      href="../assets/css/datatables.css"
    />
    <!-- Plugins css Ends-->
    <!-- Bootstrap css-->
    <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />
    <!-- App css-->

    <link rel="preload" as="style" href="../builde/assets/style-48b1edf8.css" />
    <link rel="modulepreload" href="../builde/assets/app-e4a857d6.js" />
    <link rel="stylesheet" href="../builde/assets/style-48b1edf8.css" />
    <script type="module" src="../builde/assets/app-e4a857d6.js"></script>
    <link
      id="color"
      rel="stylesheet"
      href="../assets/css/color-1.css"
      media="screen"
    />
    <!-- Responsive css-->
    <link
      rel="stylesheet"
      type="text/css"
      href="../assets/css/responsive.css"
    />
  </head>

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
            <div class="logo-wrapper">
              <a href="../dashboard.html"
                ><img
                  class="img-fluid"
                  src="../assets/images/logo/logo.png"
                  alt=""
              /></a>
            </div>
            <div class="dark-logo-wrapper">
              <a href="../dashboard.html"
                ><img
                  class="img-fluid"
                  src="../assets/images/logo/dark-logo.png"
                  alt=""
              /></a>
            </div>
            <div class="toggle-sidebar">
              <i
                class="status_toggle middle"
                data-feather="align-center"
                id="sidebar-toggle"
              >
              </i>
            </div>
          </div>
          <div class="left-menu-header col"></div>
          <div class="nav-right col pull-right right-menu p-0">
            <ul class="nav-menus">
              <li>
                <a
                  class="text-dark"
                  href="#!"
                  onclick="javascript:toggleFullScreen()"
                  ><i data-feather="maximize"></i
                ></a>
              </li>
              
            </ul>
          </div>
          <div class="d-lg-none mobile-toggle pull-right w-auto">
            <i data-feather="more-horizontal"></i>
          </div>
        </div>
      </div>
      <!-- Page Header Ends -->
      <!-- Page Body Start-->
      <div class="page-body-wrapper sidebar-icon">
        <!-- Page Sidebar Start-->
        <header class="main-nav">
          <div class="sidebar-user text-center">
            <img
              class="img-90 rounded-circle"
              src="../assets/images/dashboard/1.png"
              alt=""
            />
            <a href="javascript:void(0)">
              <h6 class="mt-3 f-14 f-w-600">Emay Walter</h6></a
            >
            <p class="mb-0 font-roboto">Directeur général</p>
          </div>
          <nav>
            <div class="main-navbar">
              <div class="left-arrow" id="left-arrow">
                <i data-feather="arrow-left"></i>
              </div>
              <div id="mainnav">
                <ul class="nav-menu custom-scrollbar">
                  <li class="back-btn">
                    <div class="mobile-back text-end">
                      <span>Back</span
                      ><i class="fa fa-angle-right ps-2" aria-hidden="true"></i>
                    </div>
                  </li>
                  <li class="dropdown">
                    <a class="nav-link menu-title link-nav" href="/"
                      ><i data-feather="git-pull-request"></i
                      ><span>Dashboard</span></a
                    >
                  </li>
                  <li class="dropdown">
                        <a class="nav-link menu-title link-nav " href="/agences/list"><i data-feather="git-pull-request"></i><span>Listes des Agences</span></a>
                    </li>
 					<li class="dropdown">
                        <a class="nav-link menu-title active" href="javascript:void(0)"><i data-feather="airplay"></i><span>Clients</span></a>
                        <ul class="nav-submenu menu-content"  style="display: block;">
                            <li><a href="/agences/clients" class="">Listes</a></li>
                            <li><a href="/clients/list/decoucouvert" class="active">Clients à découvers</a></li>
                        </ul>
                    </li>
                </ul>
              </div>
              <div class="right-arrow" id="right-arrow">
                <i data-feather="arrow-right"></i>
              </div>
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
                  <h3>General</h3>
                  <ol class="breadcrumb">
                    <li class="breadcrumb-item">
                      <a href="../dashboard.html">Home</a>
                    </li>
                    <li class="breadcrumb-item">Widgets</li>
                    <li class="breadcrumb-item active">General</li>
                  </ol>
                </div>
              </div>
            </div>
          </div>
          <div class="container-fluid">
            <div class="row">

            
                  <div class="row mx-4">
               		 <a href="/clients/add-client-form" class="btn btn-success col-3">Ajouter</a>
                 </div>
                  <div class="row mx-4">
               		 <a href="/clients/Liste" class="btn btn-success col-3">Retour</a>
                 </div>
                 <div class="row mx-4">
               		 <p>Resultats de la recherche</p>
                 </div>
                </div>
                
                <div class="card">
                  <div class="card-body">
                    <div class="table-responsive">
                      <table class="display" id="basic-1">
                        <thead>
                          <tr>
                            <th>#</th>
                            <th>Nom</th>
                            <th>Prénom</th>
                            <th>Adresse</th>
                            <th>Conseiller</th>
                            <th>Agence</th>
                          <!--  <th>Action</th> -->
                          </tr>
                        </thead>
                        <tbody>
                          <c:forEach items="${clients}" var="client" varStatus="loop">
                            <tr>
                              <th scope="row">${loop.index + 1}</th>
                              <td>${client.firstname}</td>
                              <td>${client.lastname}</td>
                              <td>${client.adress}</td>
                              <td>${client.nameAdvisor}</td>
                              <td>${client.agency.name}</td>
                            <!--    <td><a href="" class="btn btn-secondary">Comptes bancaires</a></td> -->
                            </tr>
                          </c:forEach>
                        </tbody>
                      </table>
                    </div>
                  </div>
                </div>
              </div>
              <!-- Zero Configuration  Ends-->
            </div>
          </div>

          <!-- Container-fluid Ends-->
        </div>
        <!-- footer start-->
        <footer>
          <div class="container-fluid">
            <div class="row">
              <div class="col-md-12 footer-copyright">
                <p class="mb-0 text-center">
                  Copyright 2023-24 Â© JBank Tous droits rÃ©servÃ©s.
                </p>
              </div>
            </div>
          </div>
        </footer>
      </div>
    </div>
    <!-- latest jquery-->
    <script src="../assets/js/jquery-3.5.1.min.js"></script>
    <!-- feather icon js-->
    <script src="../assets/js/icons/feather-icon/feather.min.js"></script>
    <script src="../assets/js/icons/feather-icon/feather-icon.js"></script>
    <!-- Sidebar jquery-->
    <script src="../assets/js/sidebar-menu.js"></script>
    <script src="../assets/js/config.js"></script>
    <!-- Bootstrap js-->
    <script src="../assets/js/bootstrap/popper.min.js"></script>
    <script src="../assets/js/bootstrap/bootstrap.min.js"></script>
    <!-- Plugins JS start-->

    <script src="../assets/js/prism/prism.min.js"></script>
    <script src="../assets/js/clipboard/clipboard.min.js"></script>
    <script src="../assets/js/counter/jquery.waypoints.min.js"></script>
    <script src="../assets/js/counter/jquery.counterup.min.js"></script>
    <script src="../assets/js/counter/counter-custom.js"></script>
    <script src="../assets/js/custom-card/custom-card.js"></script>
    <script src="../assets/js/datepicker/date-picker/datepicker.js"></script>
    <script src="../assets/js/datepicker/date-picker/datepicker.en.js"></script>
    <script src="../assets/js/datepicker/date-picker/datepicker.custom.js"></script>
    <script src="../assets/js/owlcarousel/owl.carousel.js"></script>
    <script src="../assets/js/general-widget.js"></script>
    <script src="../assets/js/height-equal.js"></script>
    <script src="../assets/js/tooltip-init.js"></script>
    <script src="../assets/js/popover-custom.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
    
    <!-- Plugins JS Ends-->
    <!-- Theme js-->
    <!-- Plugins JS start-->
    <script src="../assets/js/datatable/datatables/jquery.dataTables.min.js"></script>
    <script src="../assets/js/datatable/datatables/datatable.custom.js"></script>
    <!-- Plugins JS Ends-->
    <script src="../assets/js/script.js"></script>
   <script>
    $(document).ready(function () {
        // Attacher un gestionnaire d'événements au changement de la sélection
        $('#agencySelect').change(function () {
            // Récupérer la valeur sélectionnée
            var selectedAgencyId = $(this).val();

            // Effectuer une requête AJAX
            $.ajax({
                type: 'get',
                url: '/agences/'+selectedAgencyId+'/clients', // Remplacez par votre endpoint
                success: function (data) {
                    // Mettez à jour le contenu de votre tableau avec les résultats
                    $('#basic-1 tbody').html(data);
                },
                error: function () {
                    console.error('Erreur lors de la requête AJAX.');
                }
            });
        });
    });
</script>

    <script src="../assets/js/theme-customizer/customizer.js"></script>
    <!-- Plugin used-->
  </body>

  <!-- Mirrored from laravel.pixelstrap.com/JBank/widgets/general-widget by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 04 Sep 2023 17:12:26 GMT -->
</html>
