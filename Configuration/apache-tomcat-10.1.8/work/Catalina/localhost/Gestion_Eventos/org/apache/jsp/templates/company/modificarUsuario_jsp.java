/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.8
 * Generated at: 2023-05-23 07:47:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.company;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class modificarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/spinner.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Spinner End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Sidebar Start -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/sidebar.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Sidebar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Content Start -->\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <!-- Navbar Start -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/navbar.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Navbar End -->\n");
      out.write("\n");
      out.write("            <!-- Recent Sales Start -->\n");
      out.write("            <div class=\"container-fluid pt-4 px-4\">\n");
      out.write("                <div class=\"bg-light text-center rounded p-4\">\n");
      out.write("                    <div class=\"d-flex align-items-center justify-content-between mb-4\">\n");
      out.write("                        <h1 class=\"mb-0\">Usuario</h6>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row g-4\">\n");
      out.write("                        <div class=\"col-sm-12 col-xl-6\">\n");
      out.write("                            <div class=\"bg-light rounded h-100 p-4\" >\n");
      out.write("                                <form>\n");
      out.write("                                    <div class=\"form-floating mb-3\">\n");
      out.write("                                        <input type=\"nombre\" class=\"form-control\" id=\"floatingInput\"\n");
      out.write("                                            placeholder=\"\">\n");
      out.write("                                        <label for=\"floatingInput\">Cedula</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-floating mb-3\">\n");
      out.write("                                        <input type=\"nombre\" class=\"form-control\" id=\"floatingInput\"\n");
      out.write("                                            placeholder=\"\">\n");
      out.write("                                        <label for=\"floatingInput\">Nombre</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-floating mb-3\">\n");
      out.write("                                        <input type=\"nombre\" class=\"form-control\" id=\"floatingInput\"\n");
      out.write("                                            placeholder=\"\">\n");
      out.write("                                        <label for=\"floatingInput\">Apellido</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-floating mb-3\">\n");
      out.write("                                        <input type=\"nombre\" class=\"form-control\" id=\"floatingInput\"\n");
      out.write("                                            placeholder=\"\">\n");
      out.write("                                        <label for=\"floatingInput\">Telefono</label>\n");
      out.write("                                    </div>                                                                                                                                                \n");
      out.write("                                </form>\n");
      out.write("                            </div>                     \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-12 col-xl-6\">\n");
      out.write("                            <div class=\"bg-light rounded h-100 p-4\" >\n");
      out.write("                                <div class=\"form-floating mb-3\">\n");
      out.write("                                    <input type=\"nombre\" class=\"form-control\" id=\"floatingInput\"\n");
      out.write("                                        placeholder=\"\">\n");
      out.write("                                    <label for=\"floatingInput\">Correo</label>\n");
      out.write("                                </div> \n");
      out.write("                                <div class=\"form-floating mb-3\">\n");
      out.write("                                    <input type=\"nombre\" class=\"form-control\" id=\"floatingInput\"\n");
      out.write("                                        placeholder=\"\">\n");
      out.write("                                    <label for=\"floatingInput\">Contraseña</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-floating mb-3\">\n");
      out.write("                                    <select class=\"form-select\" id=\"floatingSelect\"\n");
      out.write("                                        aria-label=\"Floating label select example\">\n");
      out.write("                                        <option selected></option>\n");
      out.write("                                        <option value=\"1\">AUTO</option>\n");
      out.write("                                        <option value=\"2\">ADMIN</option>\n");
      out.write("                                        <option value=\"3\">ASESOR</option>\n");
      out.write("                                    </select>\n");
      out.write("                                    <label for=\"floatingSelect\">Tipo</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"bg-light rounded h-100 p-4\">\n");
      out.write("                                    <div class=\"m-n2\">\n");
      out.write("                                        <a class=\"btn btn-lg btn-primary w-100\" href=\"Usuarios.jsp\">Modificar</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Recent Sales End -->\n");
      out.write("            \n");
      out.write("            <!-- Footer Start -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/footer.jsp", out, false);
      out.write("\n");
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
