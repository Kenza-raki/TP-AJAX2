<%@page import="java.util.Date"%>
<%@page import="ma.school.beans.Etudiant"%>
<%@page import="ma.school.service.EtudiantService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="script/script.js" type="text/javascript"></script>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="script/jsonExemple.js" type="text/javascript"></script>
        <link href="style/css.css" rel="stylesheet" type="text/css"/>
        <link href="style/csslocal.css" rel="stylesheet" type="text/css"/>
       
         
    </head>
    <body>
        

        <%@include file="template/header.jsp" %>
        <%@include file="template/menu.jsp" %>
<!--        < <img  src="images/b.jpg" width="1568" height="980" alt="b" />-->

        <div class="content">
            <form method="GET" action="EtudiantController">
                <fieldset>
                    <legend>Informations Etudiant</legend>
                    <table border="0">
                        <tr>
                            <td>Nom</td>
                            <td><input id="nom" type="text" name="nom" value=""  required=""/></td>
                        </tr>
                        <tr>
                            <td>Prenom</td>
                            <td><input id="prenom" type="text" name="prenom" value="" required="" /></td>
                        </tr>
                        <tr>
                            <td>Ville</td>
                            <td>
                                <select id="ville" name="ville">
                                    <option value="Rabat">Rabat</option>
                                    <option value="Fes">Fes</option>
                                    <option value="Marakech">Marrakech</option>

                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Date de naissance</td>
                            <td><input id="date" type="date" name="dateNaissance" value="" required="" /></td>
                        </tr>
                        <tr>
                            <td>Sexe</td>
                            <td>M<input id="m" type="radio" name="sexe" value="homme" />
                                F<input id="f" type="radio" name="sexe" value="femme" checked="checked" /></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                                <input name="op" type="submit" value="Envoyer" />
                             
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </form>
           
            <%
                EtudiantService es = new EtudiantService();
            %>
            <fieldset>
                
                <legend>Liste des étudiants</legend>

                <table border="1" class="tab">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nom <br>
                                <input id="f" type="text" name="f" value="" /></th>
                            <th>Prenom</th>
                            <th>Ville</th>
                            <th>Date de naissance</th>
                            <th>Sexe</th>
                            <th>Supprimer</th>
                            <th>Modifier</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Etudiant e : es.findAll()) {
                        %>
                        <tr>
                            <td><%=e.getId()%></td>
                            <td><%=e.getNom()%></td>
                            <td><%=e.getPrenom()%></td>
                            <td><%=e.getVille()%></td>
                            <td><%=e.getDateNaissance()%></td>
                            <td><%=e.getSexe()%></td>
                            <td><a class="bndelete" href="EtudiantController?op=delete&id=<%=e.getId()%>" onclick="showConfirmation(<%=e.getId()%>)"href="EtudiantController?op=delete&id=<%=e.getId()%>">Supprimer</a></td>
                           
                          
                             <td><a class="bnupdate" href="EtudiantController?op=update&id=<%=e.getId()%>" onclick="editRow(this); return false;">Modifier</a></td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>

            </fieldset>
        </form>  
        <link rel="stylesheet" type="text/css" href="css.css">
<script>
    function showConfirmation(etudiantId) {
        Swal.fire({
            title: 'Confirm Deletion',
            text: 'Do you want to delete this machine?',
            icon: 'warning', // You can change the icon
            showCancelButton: true,
            confirmButtonText: 'Yes',
            cancelButtonText: 'No',
        }).then((result) => {
            if (result.isConfirmed) {
                // If the user clicks "Yes," perform the delete action
                Swal.fire({
                    title: 'Deleting Machine...',
                    allowOutsideClick: false,
                    onBeforeOpen: () => {
                        // You can show a loading spinner or message here
                    },
                });

                // Perform the deletion here
                // You can use AJAX or other methods to delete the element
                // Replace this with your desired action
                
            }
        });window.location.href = `MachineController?op=supprimer&id=${etudiantId}`;
    }
</script>

<script>
    function editRow(link) {
        const url = link.getAttribute('href');
        const urlParams = new URLSearchParams(url.split('?')[1]);
        const id = urlParams.get('id');

        Swal.fire({
            title: 'Can you please enter the Student Info',
            html: `
                <div class="input-container">
                    <input type="text" id="nom" class="swal2-input" placeholder="Nom">
                    <input type="text" id="prenom" class="swal2-input" placeholder="Prenom">
                    <input type="text" id="ville" class="swal2-input" placeholder="Ville">
                    <input type="text" id="date" class="swal2-input" placeholder="Date">
                    <input type="text" id="sexe" class="swal2-input" placeholder="Sexe">
                </div>`,
            showConfirmButton: true, // Hide the default confirm button
            showCancelButton: true, // Hide the default cancel button
            allowOutsideClick: true, // Prevent closing the dialog by clicking outside
            showCloseButton: true, // Show a custom close button
            onOpen: () => {
                // Add custom buttons to the header
                Swal.getContent().parentNode.querySelector('header').innerHTML = `
                    <button class="custom-button" id="custom-cancel">Cancel</button>
                    <button class="custom-button" id="custom-confirm">Submit</button>`;
                
                // Handle button click events
                document.getElementById('custom-cancel').addEventListener('click', () => {
                    Swal.close();
                });

                document.getElementById('custom-confirm').addEventListener('click', () => {
                    const nom = document.getElementById('nom').value;
                    const prenom = document.getElementById('prenom').value;
                    const ville = document.getElementById('ville').value;
                    const date = document.getElementById('date').value;
                    const sexe = document.getElementById('sexe').value;

                    // Construct the new URL with the updated parameters
                    const newURL = `EtudiantController?op=update&id=${id}&nom=${nom}&prenom=${prenom}&ville=${ville}&date=${date}&sexe=${sexe}`;

                    // Redirect the user to the new URL
                    window.location.href = newURL;
                });
            }
        });
    }
</script>
</body>
</html>
