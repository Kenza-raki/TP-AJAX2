package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ma.school.service.MachineService;
import ma.school.beans.Machine;
import java.util.List;
import java.util.Date;
import ma.school.beans.Etudiant;
import ma.school.service.EtudiantService;

public final class homeForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/template/header.jsp");
    _jspx_dependants.add("/template/menu.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"script/script.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"script/jsonExemple.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"style/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"style/csslocal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("       \n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("<div class=\"header\" style=\"height:40px; width:100%; background-color: bisque; padding: 10px; border-bottom: 2px solid #ff9900;\">\n");
      out.write("    <img id=\"logo\" src=\"images/Logo_Ensaj.png\" alt=\"logo\" style=\"width:100px;height:40px;\"/> \n");
      out.write("    <fieldset>\n");
      out.write("    <span id=\"horloge\" style=\"font-family:fantasy;animation: cubic-bezier;color: brown; outline-color: #ff9900;text-align: center; width:100%;\"></span>\n");
      out.write("    </fieldset>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("<script src=\"script/horloge.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function showConfirmation2(machineId) {\n");
      out.write("        var result = confirm(\"Do You want to modify this machine ?\");\n");
      out.write("        if (result) {\n");
      out.write("            // L'utilisateur a cliqué sur \"OK\", redirigez vers la servlet pour effectuer la suppression.\n");
      out.write("            window.location.href = \"MachineController?op=update&id=\" + machineId;\n");
      out.write("        } else {\n");
      out.write("            // L'utilisateur a cliqué sur \"Annuler\", ne rien faire.\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("    \n");
      out.write("\n");
      out.write("     <li><a class=\"menu-item\" href=\"homeForm.jsp\" >Home</a></li>\n");
      out.write("        <li><a class=\"menu-item\" href=\"etudiantForm.jsp\">Gestion des étudiants</a></li>\n");
      out.write("        <li><a class=\"menu-item\" href=\"marqueForm.jsp\">Gestion des marques</a></li>\n");
      out.write("        <li><a class=\"menu-item\" href=\"machineForm.jsp\">Gestion des machines</a></li>\n");
      out.write("        <li><a class=\"menu-item\" href=\"machineByMarqueForm.jsp\">Machines par marque</a></li>\n");
      out.write("     <li><a href=\"machineByMarqueForm.jsp\"> </a></li>\n");
      out.write("    <li><a href=\"machineByMarqueForm.jsp\"> </a></li>\n");
      out.write("    <li><a href=\"machineByMarqueForm.jsp\"> </a></li>\n");
      out.write("   \n");
      out.write("  \n");
      out.write("   \n");
      out.write("    <style>\n");
      out.write("        /* Your menu styles here */\n");
      out.write("        .menu-item {\n");
      out.write("            \n");
      out.write("            border: 1px solid #ff9900;\n");
      out.write("            border-radius: 5px;\n");
      out.write("           \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("         .menu {\n");
      out.write("           \n");
      out.write("            position: fixed;\n");
      out.write("            top: 0;\n");
      out.write("    left: 0;\n");
      out.write("            z-index: 1; /* Ensures the menu appears above other content */\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("     <script>\n");
      out.write("        // Get the current page URL\n");
      out.write("        const currentPageURL = window.location.href;\n");
      out.write("\n");
      out.write("        // Get all menu items\n");
      out.write("        const menuItems = document.querySelectorAll('.menu-item');\n");
      out.write("\n");
      out.write("        // Loop through menu items\n");
      out.write("        menuItems.forEach(item => {\n");
      out.write("            // Get the href attribute of the menu item\n");
      out.write("            const itemURL = item.getAttribute('href');\n");
      out.write("\n");
      out.write("            // Check if the current page URL contains the item's URL\n");
      out.write("            if (currentPageURL.includes(itemURL)) {\n");
      out.write("                // If it does, add the \"active\" class\n");
      out.write("                item.classList.add('active');\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("    <animate draggable=\"false\" >\n");
      out.write("\n");
      out.write("</ul>");
      out.write("\n");
      out.write("<!--        < <img  src=\"images/b.jpg\" width=\"1568\" height=\"980\" alt=\"b\" />-->\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <form method=\"GET\" action=\"EtudiantController\">\n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("         <div class=\"chart-title\" >Le nombre des machines par marque</div>\n");
      out.write("          <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\n");
      out.write("         \n");
      out.write("          <canvas id=\"myChart\" width=\"400\" height=\"200\"></canvas>\n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    /* Style the chart container */\n");
      out.write("    #myChart {\n");
      out.write("        width: 100%; /* Make the chart container responsive to its parent */\n");
      out.write("        max-width: 600px; /* Limit the maximum width */\n");
      out.write("       max-height: 450px;\n");
      out.write("        margin: 0 auto; /* Center the chart horizontally */\n");
      out.write("        border: 1px solid #ccc; /* Add a border for clarity */\n");
      out.write("        border-radius: 5px; /* Add rounded corners */\n");
      out.write("       \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("\n");
      out.write("    /* Style the chart title */\n");
      out.write("    .chart-title {\n");
      out.write("        \n");
      out.write("        text-align: center;\n");
      out.write("        font-weight: bold;\n");
      out.write("        color: brown;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Style the chart legend */\n");
      out.write("    .chart-legend {\n");
      out.write("        list-style: none;\n");
      out.write("        padding: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .chart-legend li {\n");
      out.write("        margin-right: 20px;\n");
      out.write("        display: inline-block;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .chart-legend li::before {\n");
      out.write("        content: '\\25A0'; /* Add a square bullet for each legend item */\n");
      out.write("        color: brown; /* Customize the color of the bullet */\n");
      out.write("        margin-right: 5px;\n");
      out.write("    }\n");
      out.write("</style>\n");

MachineService mms = new MachineService();
List<Machine> machineList = mms.findAll();

String l1 = mms.findById(1).getReference();
String l2 = mms.findById(2).getReference();
String l3 = mms.findById(3).getReference();
String l4 = mms.findById(4).getReference();


      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    var labels = [\n");
      out.write("        '");
      out.print( l1 );
      out.write("',\n");
      out.write("        '");
      out.print( l2 );
      out.write("',\n");
      out.write("        '");
      out.print( l3 );
      out.write("',\n");
      out.write("        '");
      out.print( l4 );
      out.write("'\n");
      out.write("    ];\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    var ctx = document.getElementById('myChart').getContext('2d');\n");
      out.write("    var myChart = new Chart(ctx, {\n");
      out.write("        type: 'pie', // Type of chart (e.g., bar, line, pie)\n");
      out.write("        data: {\n");
      out.write("             labels: labels,\n");
      out.write("             \n");
      out.write("            datasets: [{\n");
      out.write("    label: 'Data',\n");
      out.write("    data: [2, 2, 4, 6], // Your chart data\n");
      out.write("    backgroundColor: [\n");
      out.write("        'rgba(255, 99, 132, 0.2)', // Color for the first data point\n");
      out.write("        'rgba(54, 162, 235, 0.2)', // Color for the second data point\n");
      out.write("        'rgba(255, 206, 86, 0.2)', // Color for the third data point\n");
      out.write("        'rgba(75, 192, 192, 0.2)', // Color for the fourth data point\n");
      out.write("    ],\n");
      out.write("    borderColor: [\n");
      out.write("        'rgba(255, 99, 132, 1)',\n");
      out.write("        'rgba(54, 162, 235, 1)',\n");
      out.write("        'rgba(255, 206, 86, 1)',\n");
      out.write("        'rgba(75, 192, 192, 1)',\n");
      out.write("    ],\n");
      out.write("    borderWidth: 1\n");
      out.write("}]\n");
      out.write("\n");
      out.write("        },\n");
      out.write("        options: {\n");
      out.write("            // Chart options and configurations\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("        </form>            \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
