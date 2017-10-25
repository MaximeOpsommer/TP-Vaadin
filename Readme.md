Ce qu'on fournit :
------------------

Une présentation de Vaadin.

Une archive avec :

	- un package example HelloWorld qui fait une démo des différents composants
	- un package avec le TP à réaliser, on fournit uniquement le model, les classes vides avec les noms des méthodes à implémenter

Un Wiki avec les différents composants qu'il faudra utiliser pendant le TP.

Un guide du TP.

Dans le guide du TP :
---------------------

étapes :

	- Importer le projet :
		- Expliquer comment importer le projet Maven sous Eclipse
	- Faire un 'mvn clean install' pour vérifier que le projet build correctement
	- Faire un 'mvn jetty:run' pour vérifier que le serveur démarre correctement
	  Préciser que le serveur démarre sur le port 8080
	- Visualiser la page HelloWorld pour comprendre le fonctionnement des composants
	- Visualiser la page de Customers pour voir les tâches à faire
	- Implémenter les différentes fonctionnalités :
		- Lister les différents utilisateurs sous forme de tableau
		- Ajouter un filtre des utilisateurs par prénom
		- Ajouter un bouton 'Ajouter un utilisateur' (au dessus du taleau) qui ouvre un formulaire à droite du tableau
		- Le formulaire doit contenir : Nom, Prénom, Email, Date de naissance et un bouton Submit pour créer un nouvel utilisateur
		  L'utilisateur doit être créé et ajouté dans le tableau sans avoir besoin de rafraichir la page
		- Ajouter un évènement de clic sur un utilisateur qui renseignera un champ 'Utilisateur sélectionné' en dessous du tableau
		- Ajouter un moyen de désélectionner un utilisateur (par exemple en cliquant sur 'Ajouter un utilisateur')
		- Ajouter la possibilité d'éditer un utilisateur. Le bouton Submit du formulaire fera un Edit au lieu d'un Save si un utilisateur est sélectionné
		- Ajouter la possibilité de supprimer un utilisateur en affichant un bouton 'Supprimer' à côté de Submit quand un utilisateur est sélectionné


à la fin :

	- Donner le lien d'un mini wiki qui contiendra la liste des objets et méthodes qui seront utiles à la réalisation du TP



Présentation orale :
--------------------

Créé par qui ?
Pourquoi ? Dans quel(s) but(s) ?

Exemple effectué à partir du HelloWorld
Avantages / Inconvénients rencontrés

Expliquer comment créer un projet Vaadin vierge



Pour aller plus loin :
----------------------

Rajouter un sort au filtre


Indiquer la commande pour rebuilder sans lancer le serveur (mvn package, je crois)
