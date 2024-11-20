# ConstructionXpert Services - Application de Gestion de Projets de Construction

Cette application de gestion de projets de construction est développée pour **ConstructionXpert Services** en utilisant une architecture **microservices**. L'objectif principal est d'assurer l'évolutivité, la maintenabilité, et la résilience grâce à une séparation claire des responsabilités entre différents services.

## Architecture Microservices

L'application est composée des services suivants :

### 1. Service de Gestion des Projets
**Fonctionnalités** :
- Création d’un nouveau projet (nom, description, date de début, date de fin, budget).
- Affichage de la liste des projets existants avec leurs détails.
- Mise à jour des détails d’un projet existant.
- Suppression d’un projet existant.

### 2. Service de Gestion des Tâches
**Fonctionnalités** :
- Création d’une nouvelle tâche (description, date de début, date de fin, statut, ressources nécessaires).
- Affichage de la liste des tâches associées à un projet.
- Mise à jour des détails d’une tâche existante.
- Suppression d’une tâche existante.

### 3. Service de Gestion des Ressources
**Fonctionnalités** :
- Ajout de nouvelles ressources (nom, type, quantité, informations du fournisseur).
- Affichage de la liste des ressources disponibles.
- Mise à jour des détails d’une ressource existante.
- Suppression d’une ressource existante.

## Technologies Utilisées

- **Backend** : Spring Boot, Spring Cloud (pour les microservices)
- **Base de données** : PostgreSQL/MySQL (chaque service a sa propre base de données)
- **Gestion des migrations** : Flyway
- **Communication** : API RESTful sécurisées
- **Service Registry/Discovery** : Eureka (Netflix OSS)

## Gestion des Bases de Données

Chaque service dispose de sa propre base de données pour assurer :
- L’isolation des données.
- Des évolutions indépendantes.
- Une meilleure sécurité et fiabilité.

Les migrations des schémas sont gérées avec **Flyway**, permettant une application ordonnée et versionnée des changements de schéma.

## Déploiement et Communication

1. **Service Registry/Discovery** :
   - **Eureka** est utilisé comme registre de service, permettant à chaque microservice de s’enregistrer dynamiquement et de découvrir d’autres services.
   - Simplifie la gestion des adresses et permet une communication flexible entre microservices.

2. **API RESTful** :
   - Toutes les interactions entre les services se font via des API REST sécurisées, garantissant l’intégrité et la confidentialité des données échangées.

## Instructions pour Exécuter le Projet

### Prérequis
- Java 17+
- Maven 3.8+
- PostgreSQL/MySQL installé
- Docker (optionnel pour les conteneurs)
- IDE comme IntelliJ IDEA ou VS Code

