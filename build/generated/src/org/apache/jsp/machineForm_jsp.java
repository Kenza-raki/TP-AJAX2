package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ma.school.beans.Machine;
import ma.school.service.MachineService;
import ma.school.beans.Marque;
import ma.school.service.MarqueService;
import java.util.Date;
import ma.school.beans.Etudiant;
import ma.school.service.EtudiantService;

public final class machineForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"script/script.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"style/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"style/csslocal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write(" <script>\n");
      out.write("    function showConfirmation(etudiantId) {\n");
      out.write("        var result = confirm(\"Êtes-vous sûr de vouloir supprimer cette machine ?\");\n");
      out.write("        if (result) {\n");
      out.write("            // L'utilisateur a cliqué sur \"OK\", redirigez vers la servlet pour effectuer la suppression.\n");
      out.write("            window.location.href = \"MachineController?op=supprimer&id=\" + etudiantId;\n");
      out.write("        } else {\n");
      out.write("            // L'utilisateur a cliqué sur \"Annuler\", ne rien faire.\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function showConfirmation2(machineId) {\n");
      out.write("        var result = confirm(\"Êtes-vous sûr de vouloir modifier cette machine ?\");\n");
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
      out.write("        <div class=\"content\">\n");
      out.write("            <form method=\"GET\" action=\"MachineController\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Informations Machine</legend>\n");
      out.write("                    <table border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Reference</td>\n");
      out.write("                            <td><input id=\"ref\" type=\"text\" name=\"ref\" value=\"\"  required=\"\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Prix</td>\n");
      out.write("                            <td><input id=\"prix\" type=\"text\" name=\"prix\" value=\"\" required=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Marque</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select id=\"marque\" name=\"marque\">\n");
      out.write("                                    ");

                                        MarqueService ms = new MarqueService();
                                        for(Marque m : ms.findAll()){
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(m.getId());
      out.write('"');
      out.write('>');
      out.print(m.getLibelle());
      out.write("</option>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Date Achat</td>\n");
      out.write("                            <td><input id=\"date\" type=\"date\" name=\"dateAchat\" value=\"\" required=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td>\n");
      out.write("                                <input name=\"op\" type=\"submit\" value=\"Envoyer\" />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("            ");

                MachineService mms = new MachineService();
            
      out.write("\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Liste des Machines</legend>\n");
      out.write("\n");
      out.write("                <table border=\"1\" class=\"tab\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Id</th>\n");
      out.write("                            <th>Reference <br>\n");
      out.write("                                <input id=\"f\" type=\"text\" name=\"f\" value=\"\" /></th>\n");
      out.write("                            <th>Prix</th>\n");
      out.write("                            <th>Marque</th>\n");
      out.write("                            <th>Date d'achat</th>\n");
      out.write("                       \n");
      out.write("                            <th>Supprimer</th>\n");
      out.write("                            <th>Modifier</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            for (Machine mm : mms.findAll()) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(mm.getId());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(mm.getReference());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(mm.getPrix());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(mm.getMarque().getLibelle());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(mm.getDateAchat());
      out.write("</td>\n");
      out.write("                          <td><a class=\"bndelete\" href=\"MachineController?op=delete&id=");
      out.print(mm.getId());
      out.write("\" onclick=\"showConfirmation(");
      out.print(mm.getId());
      out.write(")\">Supprimer</a></td>\n");
      out.write("                           \n");
      out.write("                          \n");
      out.write("                            <td><a class=\"bndelete\" onclick=\"showConfirmation2(");
      out.print(mm.getId());
      out.write(")\" href=\"MachineController?op=update&id=");
      out.print( mm.getId());
      out.write("\" >Modifier</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("        </form>            \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
