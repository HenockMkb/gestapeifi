# Installation du projet `GestAppEifi`

Suivez les étapes ci-dessous pour installer le projet Java sur n'importe quel IDE.

## Prérequis

-   Java 8 ou version ultérieure doit être installé sur votre ordinateur.
-   Un serveur prenant en charge phpMyAdmin doit être installé sur votre ordinateur, par exemple XAMPP, WAMP ou Laragon.

## Étape 1: Cloner le projet

Tout d'abord, clonez le projet en utilisant Git ou téléchargez-le sous forme d'archive ZIP et extrayez-le sur votre ordinateur.

    git clone https://github.com/HenockMkb/gestapeifi.git
## Étape 2: Configuration de la base de données

-   Créez une base de données nommée `eifi`.
-   Importez les données en utilisant le fichier `eifi.sql`.
- 
## Étape 3: Installation du pilote JDBC

-   Copiez le fichier `mysql-connector-java-8.0.26.jar` situé dans le dossier `driver` du projet.
-   Collez le fichier dans le dossier des bibliothèques de votre IDE.
- Tester la connexion avec la base de donnée.

## Étape 4: Importation du projet dans l'IDE

-   Ouvrez votre IDE et importez le projet en utilisant l'option "Importer un projet existant" ou "Importer depuis Git".
-   Sélectionnez le dossier du projet que vous avez cloné ou téléchargé à l'étape 1.
## Étape 5: Exécution du projet

-   Exécutez le fichier `Main.java` situé dans le dossier `src`.
-   Le projet devrait maintenant s'exécuter correctement.

# Conclusion

C'est tout ! Vous avez maintenant installé et configuré avec succès le projet Java sur votre ordinateur en utilisant n'importe quel IDE.