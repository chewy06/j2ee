/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.14
 * Generated at: 2017-05-02 18:53:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import com.gcit.lms.entity.Author;
import com.gcit.lms.service.AdminService;

public final class viewauthors_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/include.html", Long.valueOf(1493749143000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.gcit.lms.service.AdminService");
    _jspx_imports_classes.add("com.gcit.lms.entity.Author");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<!-- saved from url=(0040)http://getbootstrap.com/examples/theme/# -->\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("<link rel=\"icon\"\n");
      out.write("\thref=\"http://54.83.8.59/site/wp-content/uploads/2014/02/favicon.png\">\n");
      out.write("\n");
      out.write("<title>LMS</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write("<link href=\"./template_files/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<!-- Bootstrap theme -->\n");
      out.write("<link href=\"./template_files/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("<link href=\"./template_files/ie10-viewport-bug-workaround.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom styles for this template -->\n");
      out.write("<link href=\"./template_files/theme.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("<!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("<script src=\"./template_files/ie-emulation-modes-warning.js.download\"></script>\n");
      out.write("\n");
      out.write("<!-- Custom styles for this template -->\n");
      out.write("<link href=\"./Admin_files/cover.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<!-- Fixed navbar -->\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\"\n");
      out.write("\t\t\t\t\taria-controls=\"navbar\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"welcome.jsp\">LMS</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"welcome.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"./Menu.jsp?option=Admin\">Administrator</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"./Menu.jsp?option=Librarian\">Librarian</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"./Menu.jsp?option=Borrower\">Borrower</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a\n");
      out.write("\t\t\t\t\t\thref=\"http://getbootstrap.com/examples/theme/#\"\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\"\n");
      out.write("\t\t\t\t\t\taria-haspopup=\"true\" aria-expanded=\"false\">Menu <span\n");
      out.write("\t\t\t\t\t\t\tclass=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./Menu.jsp?option=Admin\">Administrator</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./Menu.jsp?option=Librarian\">Librarian</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./Menu.jsp?option=Borrower\">Borrower</a></li>\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--/.nav-collapse -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t<div class=\"container theme-showcase\" role=\"main\"></div>\n");
      out.write("\t<!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("\t<!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("\t<script src=\"./template_files/jquery.min.js.download\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\twindow.jQuery\n");
      out.write("\t\t\t\t|| document\n");
      out.write("\t\t\t\t\t\t.write('<script src=\"../../assets/js/vendor/jquery.min.js\"><\\/script>')\n");
      out.write("\t</script>\n");
      out.write("\t<script src=\"./template_files/bootstrap.min.js.download\"></script>\n");
      out.write("\t<script src=\"./template_files/docs.min.js.download\"></script>\n");
      out.write("\t<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("\t<script src=\"./template_files/ie10-viewport-bug-workaround.js.download\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"global-zeroclipboard-html-bridge\"\n");
      out.write("\t\tclass=\"global-zeroclipboard-container\"\n");
      out.write("\t\tstyle=\"position: absolute; left: 0px; top: -9999px; width: 15px; height: 15px; z-index: 999999999;\"\n");
      out.write("\t\ttitle=\"\" data-original-title=\"Copy to clipboard\">\n");
      out.write("\t\t<object classid=\"clsid:d27cdb6e-ae6d-11cf-96b8-444553540000\"\n");
      out.write("\t\t\tid=\"global-zeroclipboard-flash-bridge\" width=\"100%\" height=\"100%\">\n");
      out.write("\t\t\t<param name=\"movie\"\n");
      out.write("\t\t\t\tvalue=\"/assets/flash/ZeroClipboard.swf?noCache=1493327754733\">\n");
      out.write("\t\t\t<param name=\"allowScriptAccess\" value=\"sameDomain\">\n");
      out.write("\t\t\t<param name=\"scale\" value=\"exactfit\">\n");
      out.write("\t\t\t<param name=\"loop\" value=\"false\">\n");
      out.write("\t\t\t<param name=\"menu\" value=\"false\">\n");
      out.write("\t\t\t<param name=\"quality\" value=\"best\">\n");
      out.write("\t\t\t<param name=\"bgcolor\" value=\"#ffffff\">\n");
      out.write("\t\t\t<param name=\"wmode\" value=\"transparent\">\n");
      out.write("\t\t\t<param name=\"flashvars\"\n");
      out.write("\t\t\t\tvalue=\"trustedOrigins=getbootstrap.com%2C%2F%2Fgetbootstrap.com%2Chttp%3A%2F%2Fgetbootstrap.com\">\n");
      out.write("\t\t\t<embed src=\"/assets/flash/ZeroClipboard.swf?noCache=1493327754733\"\n");
      out.write("\t\t\t\tloop=\"false\" menu=\"false\" quality=\"best\" bgcolor=\"#ffffff\"\n");
      out.write("\t\t\t\twidth=\"100%\" height=\"100%\" name=\"global-zeroclipboard-flash-bridge\"\n");
      out.write("\t\t\t\tallowscriptaccess=\"sameDomain\" allowfullscreen=\"false\"\n");
      out.write("\t\t\t\ttype=\"application/x-shockwave-flash\" wmode=\"transparent\"\n");
      out.write("\t\t\t\tpluginspage=\"http://www.macromedia.com/go/getflashplayer\"\n");
      out.write("\t\t\t\tflashvars=\"trustedOrigins=getbootstrap.com%2C%2F%2Fgetbootstrap.com%2Chttp%3A%2F%2Fgetbootstrap.com\"\n");
      out.write("\t\t\t\tscale=\"exactfit\">\n");
      out.write("\t\t</object>\n");
      out.write("\t</div>\n");
      out.write("\t<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"1140\" height=\"500\"\n");
      out.write("\t\tviewBox=\"0 0 1140 500\" preserveAspectRatio=\"none\"\n");
      out.write("\t\tstyle=\"display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;\">\n");
      out.write("\t\t<defs>\n");
      out.write("\t\t<style type=\"text/css\"></style></defs>\n");
      out.write("\t\t<text x=\"0\" y=\"57\"\n");
      out.write("\t\t\tstyle=\"font-weight:bold;font-size:57pt;font-family:Arial, Helvetica, Open Sans, sans-serif\">Thirdslide</text></svg>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	AdminService service = new AdminService();
	Integer authorsCount = service.getAuthorsCount();
	Integer numOfPages = 0;
	if (authorsCount % 10 > 0) {
		numOfPages = authorsCount / 10 + 1;
	} else {
		numOfPages = authorsCount / 10;
	}
	List<Author> authors = new ArrayList<>();
	if (request.getAttribute("authors") != null) {
		authors = (List<Author>) request.getAttribute("authors");
	} else {
		authors = service.getAllAuthors(1);
	}

      out.write('\r');
      out.write('\n');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction searchAuthors() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"searchAuthors\",\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\tsearchString : $('#searchString').val()\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}).done(function(data) {\r\n");
      out.write("\t\t\t$('#authorsTable').html(data)\r\n");
      out.write("\t\t})\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"page-header\" align=\"center\">\r\n");
      out.write("\t\t<h1>List of Authors in LMS</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"input-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t<form action=\"searchAuthors\">\r\n");
      out.write("\t\t\t<input type=\"text\" class=\"form-control\" name=\"searchString\"\r\n");
      out.write("\t\t\t\tid=\"searchString\" placeholder=\"Search for...\"\r\n");
      out.write("\t\t\t\toninput=\"searchAuthors()\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<nav aria-label=\"Page navigation\">\r\n");
      out.write("\t\t<ul class=\"pagination\">\r\n");
      out.write("\t\t\t<li><a href=\"#\" aria-label=\"Previous\"> <span\r\n");
      out.write("\t\t\t\t\taria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("\t\t\t</a></li>\r\n");
      out.write("\t\t\t");

				for (int i = 1; i <= numOfPages; i++) {
			
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"pageAuthors?pageNo=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></li>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"#\" aria-label=\"Next\"> <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("\t\t\t</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<table class=\"table\" id=\"authorsTable\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>#</th>\r\n");
      out.write("\t\t\t\t<th>Author Name</th>\r\n");
      out.write("\t\t\t\t<th>Edit</th>\r\n");
      out.write("\t\t\t\t<th>Delete</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t");

				for (Author a : authors) {
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(authors.indexOf(a) + 1);
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(a.getAuthorName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td><button type=\"button\" class=\"btn btn-primary\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"modal\" data-target=\"#editAuthorModal\"\r\n");
      out.write("\t\t\t\t\t\thref=\"editauthor.jsp?authorId=");
      out.print(a.getAuthorId());
      out.write("\">Update</button></td>\r\n");
      out.write("\t\t\t\t<td><button type=\"button\" class=\"btn btn-danger\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"deleteAuthor?authorId=");
      out.print(a.getAuthorId());
      out.write("\">Delete</a>\r\n");
      out.write("\t\t\t\t\t</button></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade bs-example-modal-lg\" id=\"editAuthorModal\"\r\n");
      out.write("\ttabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myLargeModalLabel\">\r\n");
      out.write("\t<div class=\"modal-dialog modal-lg\" role=\"document\">\r\n");
      out.write("\t\t<div class=\"modal-content\">....</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$('.modal').on('hidden.bs.modal', function(e) {\r\n");
      out.write("\t\t\t$(this).removeData();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
