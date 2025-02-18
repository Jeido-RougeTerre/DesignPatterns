# Exercise 1 : Singleton - Configuration Manager

Objective :
Créez une classe Singleton pour gérer les configurations globales d'une application. Cette classe doit permettre :
1. De charger les configurations à partir d'un fichier ou d'un dictionnaire simulé.
2. De récupérer une configuration par clé.
3. D'empêcher la modification directe des configurations après leur chargement.

Tâches :
- Implémentez la classe `ConfigurationManager` en tant que Singleton.
- Chargez une configuration simulée sous forme de dictionnaire.
- Ajoutez une méthode pour récupérer une valeur par clé.
- Testez dans une classe principale que l'unicité de l'instance est respectée.

Exemple de données de configuration :
```
{ "db.host": "localhost", "db.port": "5432", "app.name": "MyApplication" }
```