# TP Vaadin


[Lien vers le diapo](https://docs.google.com/presentation/d/1maZxeP5xKTTBtN_I6FAkEYrCPSAE38AJUFEvYUx-yNU/edit#slide=id.g2930d59c00_0_0)


Vous trouverez dans ce TP :

- Le code source du TP
- Un Wiki avec les différents composants qu'il faudra utiliser pendant le TP.
- Un guide du TP.

## Mise en place du TP :

### Cloner le projet

Dans le répertoire de votre choix, exécutez la commande suivante :

	git clone https://github.com/MaximeOpsommer/TP-Vaadin.git

### Importer le projet (sous Eclipse)

Pour importer le TP sous Eclipse, allez dans :

	File > Import

Puis sélectionnez :

	Maven > Existing Maven Projects

Et sélectionnez le projet à l'endroit où vous l'avez cloné.

### Build le projet

Vérifiez que le projet maven build correctement en exécutant la commande suivante à la racine du projet :

	mvn clean install
	
### Lancement du serveur

Pour démarrer votre serveur, exécutez la commande suivante :

	mvn jetty:run

L'URL de la page principale de votre serveur est par défaut :

	localhost:8080

Notez que la plupart des sources se rechargeront automatiquement.
Pour les autres vous pouvez exécutez la commande suivante (dans un second terminal) :

	mvn package

## Guide du TP

Vous avez par défaut un HelloWorld à disposition.
Prenez le temps de regarder les différents composants Vaadin qui ont été utilisés pour réaliser ce HelloWorld

Le but du TP est de réaliser une page de gestion d'utilisateurs qui ressemble au plus à ceci :

![alt text](https://github.com/MaximeOpsommer/TP-Vaadin/blob/master/apercu_final.png "Aperçu du TP à réaliser")

### Description de l'interface et fonctionnalités à réaliser

Avec les éléments mis à votre disposition, vous devez créer avec Vaadin une page telle que présentée ci-dessus avec :
- Un tableau qui liste les informations de l'ensemble des utilisateurs
- Un filtrage par Nom et/ou Prénom au dessus tu tableau
- Un bouton `Add new customer` à droite du filtre, qui fait apparaitre un formulaire de création d'utilisateur à droite du tableau. (Vous devrez gérer le redimensionnement automatique du tableau)
- Possibilité de modifier un utilisateur en cliquant dessus dans le tableau (ce qui ouvre le formulaire avec ses infos actuelles) et de le modifier.
- Possibilité de supprimer un utilisateur en cliquand dessus dans le tableau (ce qui ouvre le formualaire avec ses infos actuelles et faire apparait un bouton `Delete`) et de le supprimer

Vous avez à dispostion :
- Une classe `Customer.java` qui modélise un utilisateur. (Pas besoin de modifier cette classe sauf si vous voulez ajouter des fonctionnalités supplémentaires à celles proposées)
- Une classe `MyUI.java` qui est la classe où vous pourrez gérer votre interface utilisateur en utilisant des composants Vaadin. Celle-ci contient actuellement le HelloWorld, vous devrez la modifier pour créer l'interface décrite précédemment.
- Une classe `CustomerService.java` qui est toute la partie 'calcul' de vos fonctionnalités. Les méthodes sont pré-créées, il vous faut maintenant ajouter le code adéquat pour faire fonctionner la méthode.
- Une classe `CustomerForm.java` qui concerne les actions du formulaire (à droite) pour ajouter, éditer et supprimer des utilisateurs.


### Mini-Wiki

Pensez à consulter notre [mini-wiki](https://github.com/MaximeOpsommer/TP-Vaadin/wiki) pour vous aider à réaliser le TP


## Réalisation des fonctionnalités

Vous avez désormais tout ce qu'il faut pour démarrer.
Implémenter les différentes fonctionnalités (dans l'ordre) :

- Lister les différents utilisateurs sous forme de tableau
- Ajouter un filtre des utilisateurs par nom et/ou prénom
- Ajouter un bouton 'Ajouter un utilisateur' (au dessus du taleau) qui ouvre un formulaire à droite du tableau
- Le formulaire doit contenir : Nom, Prénom, Email, Date de naissance et un bouton Submit pour créer un nouvel utilisateur. L'utilisateur doit être créé et ajouté dans le tableau sans avoir besoin de rafraichir la page
- Ajouter un évènement de clic sur un utilisateur qui renseignera un champ 'Utilisateur sélectionné' en dessous du tableau
- Ajouter un moyen de désélectionner un utilisateur (par exemple en cliquant sur 'Ajouter un utilisateur')
- Ajouter la possibilité d'éditer un utilisateur. Le bouton Submit du formulaire fera un Edit au lieu d'un Save si un utilisateur est sélectionné
- Ajouter la possibilité de supprimer un utilisateur en affichant un bouton 'Supprimer' à côté de Submit quand un utilisateur est sélectionné




Pour aller plus loin :
----------------------

- Rajouter un tri au filtre





TP réalisé par : Maxime Opsommer, Alexandre Delassus et Pierre-Claver Diarra
