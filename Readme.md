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
- Un bouton `Add new customer` en bas à droite du tableau , qui fait apparaitre un popin de création d'utilisateur au centre de l'écran.
- Un bouton `Edit customer` a droite du premier bouton, qui permet d'éditer un utilisateur lorsqu'il est selectionné, et s'il est modifiable. (dans le même popin que celui de création)
- Un bouton `Delete customer` a droite du deuxième bouton, qui permet de supprimer un utilisateur lorsqu'il est selectionné, et s'il est modifiable. (avec un popin de confirmation)
- Un bouton `Enable Modification` a droite du troisième bouton, qui permet de rendre un utilisateur modifiable si celui ci n'est pas modifiable. Il n'est visible que lors de la selection d'un utilisateur non modifiable.
- Un bouton `Disable Modification` a droite du troisième bouton, qui permet de rendre un utilisateur non modifiable si celui ci est modifiable. Il n'est visible que lors de la selection d'un utilisateur modifiable.

Vous avez à dispostion :
- Une classe `Customer.java` qui modélise un utilisateur. (Il vous sera demandé d'ajouté un attribut 'modifiable' par la suite)
- Une classe `MyUI.java` qui est la classe où vous pourrez gérer votre interface utilisateur en utilisant des composants Vaadin. Celle-ci contient actuellement le HelloWorld, vous devrez la modifier pour créer l'interface décrite précédemment.
- Une classe `CustomerService.java` qui est toute la partie 'calcul' de vos fonctionnalités. Les méthodes sont pré-créées, il vous faut maintenant ajouter le code adéquat pour faire fonctionner la méthode.
- Une classe `SaveWindow.java` qui concerne le popin de création, et de modification d'un utilisateur.
- Une classe `DeleteWindow.java` qui concerne le popin de suppression d'un utilisateur.

3 utilisateurs sont déjà créés pour vous simplifier le démarrage.


### Mini-Wiki

Pensez à consulter notre [mini-wiki](https://github.com/MaximeOpsommer/TP-Vaadin/wiki) pour vous aider à réaliser le TP


## Réalisation des fonctionnalités

Vous avez désormais tout ce qu'il faut pour démarrer.
Ce guide est très orienté mais tout n'est pas forcement écrit (utilisation des layout par exemple).
Implémenter les différentes fonctionnalités (dans l'ordre) :

- Listez les différents utilisateurs sous forme de tableau
- Ajoutez un bouton 'Add new customer' (en dessous du taleau) qui ouvre un popin au centre de l'écran.
- Le popin doit contenir : Nom, Prénom, Email, Date de naissance ,un bouton Save pour créer un nouvel utilisateur et un bouton Cancel pour tout annuler et fermer le popin. L'utilisateur doit être créé et ajouté dans le tableau sans avoir besoin de rafraichir la page. Le popin ne doit pas être fermable grace à la croix, et ne peux pas être redimensionnable.
- Créez la fonctionnalité permettant de selectionner un utilisateur dans le tableau grace au clic de souris.
- Ajoutez un bouton 'Edit customer' (à droite du tableau) qui ouvre le popin précèdent avec les informations de l'utilisateur selectionné, permettant à celui ci d'être édité.
- Ajoutez au bouton 'Save' le raccourci 'ENTER' et mettez lui le style 'BUTTON_PRIMARY'.
- Rendre le bouton 'Edit customer' disable lorsqu'aucun utilisateur n'est selectionné (et enable lorsqu'un utilisateur est selectionné)
- Ajoutez un bouton 'Delete customer' qui ouvre un popin au centre de l'écran.
- Le popin doit contenir : une phrase de confirmation, un bouton 'Supprimer' qui supprime l'utilisateur sélectionné et un bouton 'Annuler' qui ferme le popin. Le popin ne doit pas être fermable grace à la croix, et ne peux pas être redimensionnable.
- Ajoutez un filtre des utilisateurs par nom et/ou prénom au dessus du tableau
- Lors d'un changement dans le filtre, un évènement change automatiquement les utilisateurs visibles dans le tableau (vous pouvez vous aider des fonctions 'findAll' dans le CustomerService en les complétant).
- Ajoutez un bouton au filtre permettant de vider le filtre.
- Mettez le filtre et le bouton dans un CssLayout et mettez y un style 'LAYOUT_COMPONENT_GROUP'
- Ajoutez un attribut boolean 'modifiable' au Customer, et créer lui le getter 'isModifiable' et le setter 'setModifiable' (attention de bien respecter la nomenclature sinon ça risque de planter).
- Affichez le dans le tableau
- Créez un bouton 'Disable modification' qui permet de rendre l'utilisateur non modifiable.
- Changer le comportement de 'Edit customer' et 'Delete customer' pour les rendre disable lors de la selection d'un utilisateur non modifiable.
- Créez un bouton 'Enable modification' qui permet de rendre l'utilisateur modifiable.
- Changez le comportement de 'Enable modification' et 'Disable modification' pour qu'ils s'affichent uniquement si cela est utile. (Enable quand un utilisateur non modifiable est selectionné, inversement pour Disable, et aucun des deux lorsqu'aucun utilisateur n'est selectionné)

Pour aller plus loin :
----------------------

- Ajoutez une fonctionnalité qui permet de copier un utilisateur en double dans le tableau.
- Séparez le tableau en deux tableaux, un avec les utlisateurs modifiables, l'autre avec les utilisateurs non modifiables, et effectuez les changements appropriés.

TP réalisé par : Maxime Opsommer, Alexandre Delassus et Pierre-Claver Diarra
