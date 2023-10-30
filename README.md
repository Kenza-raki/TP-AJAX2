# Application de Gestion des Étudiants

Cette application est une solution complète de gestion des étudiants et des machines, y compris les marques et la possibilité de filtrage par marque. Elle a été conçue pour simplifier la gestion des données liées aux étudiants et aux machines, offrant une plateforme polyvalente et robuste. Pour ce faire, nous avons fait un choix méticuleux de technologies frontend et backend visant à garantir une expérience utilisateur immersive et une gestion efficace des données. Ci-dessous, nous vous présentons un aperçu approfondi de ces technologies :

# Technologies Utilisées
## Backend Technologies
- **Java** : Java alimente notre backend, traitant les demandes des utilisateurs, gérant la logique métier, et facilitant la communication avec la base de données. 
- **Hibernate** : Grâce à Hibernate, nous pouvons créer et manipuler des objets Java, qui sont ensuite automatiquement traduits en requêtes SQL pour interagir avec la base de données. Cela simplifie considérablement le développement et la maintenance du backend.
## Frontend Technologies
- **JSP (JavaServer Pages)** : Côté frontend, nous utilisons JSP (JavaServer Pages) pour créer des pages web dynamiques. JSP permet d'intégrer efficacement du code Java dans les pages web, générant du contenu dynamique en fonction des données du backend. Grâce à JSP, nous offrons une interface utilisateur interactive et réactive.
- **JavaScript** : Pour ajouter de l'interactivité à notre interface utilisateur, nous faisons appel à JavaScript. JavaScript est un langage de programmation côté client qui permet d'ajouter des fonctionnalités interactives telles que des validations de formulaire, des notifications en temps réel et des mises à jour dynamiques.
- **jQuery** :jQuery, une bibliothèque JavaScript populaire, facilite la manipulation du Document Object Model (DOM) et la gestion des événements. Avec jQuery, nous simplifions la gestion de l'interface utilisateur, améliorant ainsi l'expérience utilisateur globale.

 ## Fonctionnalités

L'application  offre les fonctionnalités suivantes :

- **Gestion des Étudiants** : Vous pouvez ajouter, supprimer, mettre à jour et afficher des informations sur les étudiants, y compris leurs noms, prénoms, ville et sexe.
- **Gestion des Machines** : Vous pouvez gérer les informations sur les machines, notamment leurs Id,	Reference, Prix,	Marque,	Date d'achat.
- **Gestion des Marques** : Vous pouvez gérer les informations sur les marques notamment leurs Id,	Code, Libelle.

 ## Les interfaces de l'application 
 ### Page d'Accueil (Home)
- La page d'accueil est la première interface que les utilisateurs voient lorsqu'ils accèdent à l'application. Elle présente un aperçu du système.
- Sur cette page, un **Pie Chart** est affiché pour montrer le nombre total de machines enregistrées dans le système par marque.
  
 <img width="960" alt="image" src="https://github.com/Kenza-raki/TP-AJAX2/assets/116951093/95500669-7748-405d-a61a-e8d21edb7dc8">


  
 ### Gestion des Étudiants
- Cette interface permet aux utilisateurs de gérer les données relatives aux étudiants enregistrés dans le système.
- Elle affiche un tableau contenant des informations sur les étudiants.

  ![image](https://github.com/Kenza-raki/TP-AJAX2/assets/116951093/f88f96cd-c50c-4d17-8113-4cdc8e4640fe)

 #### Supression d'un etudiant 
 
![image](https://github.com/Kenza-raki/TP-AJAX2/assets/116951093/73edea6d-4eab-4a64-80e9-0b30604b2911)

 ![image](https://github.com/Kenza-raki/TP-AJAX2/assets/116951093/02ff0b5f-761f-462f-af9b-fc41059f7d0f)


  #### Modification d'un etudiant 

  ![image](https://github.com/Kenza-raki/TP-AJAX2/assets/116951093/5c64850e-0fcb-48d7-be7a-8a8d48834894)

### Gestion des Machines

- Cette interface est dédiée à la gestion des informations sur les machines.
- Elle présente un tableau affichant des données détaillées sur les machines
  
  ![image](https://github.com/Kenza-raki/TP-AJAX2/assets/116951093/9f873ecc-d050-4276-bb72-50c06692ec2d)

  ### Gestion des Marques
  
  L'interface de gestion des marques est conçue pour permettre aux utilisateurs de gérer les informations sur les marques de machines.

  ![image](https://github.com/Kenza-raki/TP-AJAX2/assets/116951093/c5bcfab7-97f7-4eb4-952f-5431000c2bbb)

    ### Gestion des Machines par Marques
  - Cette interface offre une vue filtrée des machines en fonction de leur marque.
  - Les utilisateurs peuvent sélectionner une marque spécifique dans une liste déroulante ou en utilisant des filtres et voir la liste des machines associées à cette marque.

   <img width="958" alt="image" src="https://github.com/Kenza-raki/TP-AJAX2/assets/116951093/89a42706-78c9-4d4b-b42e-09d1e519ff20">

   ## Comment Démarrer le projet

1. Clonez le dépôt sur votre machine locale.
2. Assurez-vous d'avoir Java et un serveur d'applications compatible JSP  installés.
3. Configurez votre base de données et mettez à jour le fichier de configuration Hibernate.
4. Démarrez votre serveur d'applications.
5. Déployez l'application sur le serveur.
6. Accédez à l'application depuis votre navigateur.







  
