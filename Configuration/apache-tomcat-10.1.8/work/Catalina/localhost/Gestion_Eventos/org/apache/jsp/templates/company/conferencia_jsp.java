/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.8
 * Generated at: 2023-05-19 09:19:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.company;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class conferencia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Logistics</title>\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("    <meta content=\"\" name=\"keywords\">\n");
      out.write("    <meta content=\"\" name=\"description\">\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link href=\"../../static/img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("    <!-- Google Web Fonts -->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <!-- Icon Font Stylesheet -->\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Libraries Stylesheet -->\n");
      out.write("    <link href=\"../../static/lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../../static/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("    <link href=\"../../static/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Template Stylesheet -->\n");
      out.write("    <link href=\"../../static/css/style.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container-xxl position-relative bg-white d-flex p-0\">\n");
      out.write("        <!-- Spinner Start -->\n");
      out.write("        <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\n");
      out.write("            <div class=\"spinner-border text-primary\" style=\"width: 3rem; height: 3rem;\" role=\"status\">\n");
      out.write("                <span class=\"sr-only\">Cargando...</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Spinner End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Sidebar Start -->\n");
      out.write("        <div class=\"sidebar pe-4 pb-3\">\n");
      out.write("            <nav class=\"navbar bg-light navbar-light\">\n");
      out.write("                <a href=\"index.html\" class=\"navbar-brand mx-4 mb-3\">\n");
      out.write("                    <h3 class=\"text-primary\"><i class=\"fa me-2\"></i>Logistics</h3>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"d-flex align-items-center ms-4 mb-4\">\n");
      out.write("                    <div class=\"position-relative\">\n");
      out.write("                        <img class=\"rounded-circle\" src=\"../../static/img/user.jpg\" alt=\"\" style=\"width: 40px; height: 40px;\">\n");
      out.write("                        <div class=\"bg-success rounded-circle border border-2 border-white position-absolute end-0 bottom-0 p-1\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"ms-3\">\n");
      out.write("                        <h6 class=\"mb-0\">Jhon Doe</h6>\n");
      out.write("                        <span>Admin</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"navbar-nav w-100\">\n");
      out.write("                    <a href=\"evento.jsp\" class=\"nav-item nav-link active\"><i class=\"bi bi-calendar-plus me-2\"></i>Eventos</a>\n");
      out.write("                    <!--<div class=\"nav-item dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\"><i class=\"fa fa-laptop me-2\"></i>Elements</a>\n");
      out.write("                        <div class=\"dropdown-menu bg-transparent border-0\">\n");
      out.write("                            <a href=\"button.html\" class=\"dropdown-item\">Buttons</a>\n");
      out.write("                            <a href=\"typography.html\" class=\"dropdown-item\">Typography</a>\n");
      out.write("                            <a href=\"element.html\" class=\"dropdown-item\">Other Elements</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>-->\n");
      out.write("                    <a href=\"conferencia.jsp\" class=\"nav-item nav-link\"><i class=\"fas fa-users-cog me-2\"></i>Conferencias</a>\n");
      out.write("                    <div class=\"nav-item dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\"><i class=\"fas fa-users-cog me-2\"></i>Gestion</a>\n");
      out.write("                        <div class=\"dropdown-menu bg-transparent border-0\">\n");
      out.write("                            <a href=\"salon.jsp\" class=\"dropdown-item\">Salon</a>\n");
      out.write("                            <a href=\"typography.html\" class=\"dropdown-item\">Conferencistas</a>\n");
      out.write("                            <a href=\"element.html\" class=\"dropdown-item\">Material conferencistas</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"Clientes.html\" class=\"nav-item nav-link\"><i class=\"fas fa-user-plus me-2\"></i>Clientes</a>\n");
      out.write("                    <a href=\"Certificados.html\" class=\"nav-item nav-link\"><i class=\"fas fa-certificate me-2\"></i>Certificados</a>\n");
      out.write("                    <!--<a href=\"chart.html\" class=\"nav-item nav-link\"><i class=\"fa fa-chart-bar me-2\"></i>Charts</a>\n");
      out.write("                    <div class=\"nav-item dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\"><i class=\"far fa-file-alt me-2\"></i>Pages</a>\n");
      out.write("                        <div class=\"dropdown-menu bg-transparent border-0\">\n");
      out.write("                            <a href=\"signin.html\" class=\"dropdown-item\">Sign In</a>\n");
      out.write("                            <a href=\"signup.html\" class=\"dropdown-item\">Sign Up</a>\n");
      out.write("                            <a href=\"404.html\" class=\"dropdown-item\">404 Error</a>\n");
      out.write("                            <a href=\"blank.html\" class=\"dropdown-item\">Blank Page</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>-->\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <!-- Sidebar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Content Start -->\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <!-- Navbar Start -->\n");
      out.write("            <nav class=\"navbar navbar-expand bg-light navbar-light sticky-top px-4 py-0\">\n");
      out.write("                <a href=\"index.html\" class=\"navbar-brand d-flex d-lg-none me-4\">\n");
      out.write("                    <h2 class=\"text-primary mb-0\"><i class=\"fa fa-hashtag\"></i></h2>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"sidebar-toggler flex-shrink-0\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </a>\n");
      out.write("                <form class=\"d-none d-md-flex ms-4\">\n");
      out.write("                    <input class=\"form-control border-0\" type=\"search\" placeholder=\"Buscar\">\n");
      out.write("                </form>\n");
      out.write("                <div class=\"navbar-nav align-items-center ms-auto\">                    \n");
      out.write("                    <div class=\"nav-item dropdown\"></div>                    \n");
      out.write("                    <div class=\"nav-item dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">\n");
      out.write("                            <img class=\"rounded-circle me-lg-2\" src=\"../../static/img/user.jpg\" alt=\"\" style=\"width: 40px; height: 40px;\">\n");
      out.write("                            <span class=\"d-none d-lg-inline-flex\">Admin</span>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">Mi perfil</a>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">Configuración</a>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">Cerrar sesión</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <!-- Navbar End -->\n");
      out.write("\n");
      out.write("            <!-- Recent Sales Start -->\n");
      out.write("            <div class=\"container-fluid pt-4 px-4\">\n");
      out.write("                <div class=\"bg-light text-center rounded p-4\">\n");
      out.write("                    <div class=\"d-flex align-items-center justify-content-between mb-4\">\n");
      out.write("                        <h1 class=\"mb-0\">Conferencias</h6>\n");
      out.write("                        <a class=\"btn btn-success m-2\" href=\"crearEvento.jsp\">Crear conferencia</a>\n");
      out.write("                    </div>\n");
      out.write("                    <form class=\"d-flex align-items-center justify-content-between mb-4\">\n");
      out.write("                        <input class=\"form-control border-0\" type=\"search\" placeholder=\"Buscar\">\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"table-responsive\">\n");
      out.write("                        <table class=\"table text-start align-middle table-bordered table-hover mb-0\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr class=\"text-dark\">  \n");
      out.write("                                    <th scope=\"col\">#</th>\n");
      out.write("                                    <th scope=\"col\">Nombre</th>\n");
      out.write("                                    <th scope=\"col\">Fecha</th>\n");
      out.write("                                    <th scope=\"col\">Hora inicio</th>\n");
      out.write("                                    <th scope=\"col\">Hora fin</th>\n");
      out.write("                                    <th scope=\"col\">Acciones</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>1</td>\n");
      out.write("                                    <td>Feria informatica</td>\n");
      out.write("                                    <td>01 Jun 2023</td>\n");
      out.write("                                    <td>9:00</td>\n");
      out.write("                                    <td>11:00</td>\n");
      out.write("                                    <td><a class=\"btn btn-primary rounded-pill m-2\" href=\"\">Modificar</a>    \n");
      out.write("                                        <a class=\"btn btn-danger rounded-pill m-2\" href=\"\">Eliminar</a></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>2</td>\n");
      out.write("                                    <td>Feria del libro</td>\n");
      out.write("                                    <td>09 Jun 2023</td>\n");
      out.write("                                    <td>9:00</td>\n");
      out.write("                                    <td>11:00</td>\n");
      out.write("                                    <td><a class=\"btn btn-primary rounded-pill m-2\" href=\"\">Modificar</a>    \n");
      out.write("                                        <a class=\"btn btn-danger rounded-pill m-2\" href=\"\">Eliminar</a></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>3</td>\n");
      out.write("                                    <td>Feria de las dos ruedas</td>\n");
      out.write("                                    <td>20 Jun 2023</td>\n");
      out.write("                                    <td>9:00</td>\n");
      out.write("                                    <td>11:00</td>\n");
      out.write("                                    <td><a class=\"btn btn-primary rounded-pill m-2\" href=\"\">Modificar</a>    \n");
      out.write("                                        <a class=\"btn btn-danger rounded-pill m-2\" href=\"\">Eliminar</a></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>4</td>\n");
      out.write("                                    <td>Feria de gastronomia</td>\n");
      out.write("                                    <td>01 Jul 2023</td>\n");
      out.write("                                    <td>9:00</td>\n");
      out.write("                                    <td>11:00</td>\n");
      out.write("                                    <td><a class=\"btn btn-primary rounded-pill m-2\" href=\"\">Modificar</a>    \n");
      out.write("                                        <a class=\"btn btn-danger rounded-pill m-2\" href=\"\">Eliminar</a></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>5</td>\n");
      out.write("                                    <td>Feria de negocios internacionales</td>\n");
      out.write("                                    <td>14 Jul 2023</td>\n");
      out.write("                                    <td>9:00</td>\n");
      out.write("                                    <td>11:00</td>\n");
      out.write("                                    <td><a class=\"btn btn-primary rounded-pill m-2\" href=\"\">Modificar</a>    \n");
      out.write("                                        <a class=\"btn btn-danger rounded-pill m-2\" href=\"\">Eliminar</a></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Recent Sales End -->\n");
      out.write("            \n");
      out.write("            <!-- Footer Start -->\n");
      out.write("            <div class=\"container-fluid pt-4 px-4\">\n");
      out.write("                <div class=\"bg-light rounded-top p-4\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12 col-sm-6 text-center text-sm-start\">\n");
      out.write("                            &copy; <a href=\"#\">Logistics</a>, Todos los derechos reservados. \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12 col-sm-6 text-center text-sm-end\">\n");
      out.write("                            <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\n");
      out.write("                            Diseñado por <a href=\"https://htmlcodex.com\">HTML Codex</a>\n");
      out.write("                        </br>\n");
      out.write("                        Diseñado por <a class=\"border-bottom\" href=\"https://themewagon.com\" target=\"_blank\">ThemeWagon</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Footer End -->\n");
      out.write("        </div>\n");
      out.write("        <!-- Content End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Back to Top -->\n");
      out.write("        <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- JavaScript Libraries -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"../../static/lib/chart/chart.min.js\"></script>\n");
      out.write("    <script src=\"../../static/lib/easing/easing.min.js\"></script>\n");
      out.write("    <script src=\"../../static/lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"../../static/lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"../../static/lib/tempusdominus/js/moment.min.js\"></script>\n");
      out.write("    <script src=\"../../static/lib/tempusdominus/js/moment-timezone.min.js\"></script>\n");
      out.write("    <script src=\"../../static/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Template Javascript -->\n");
      out.write("    <script src=\"../../static/js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
