# Calculatrice REST — Spring Boot

Une API REST de calculatrice construite avec Spring Boot, organisée en architecture Controller → Service → Model.

## Prérequis

- Java 23+
- Maven 3.8+
- Spring Boot 3

## Installation et lancement

```bash
# Cloner le projet
git clone https://github.com/G-ibrahima/calculatrice-rest.git
cd calculatrice-rest

# Lancer l'application
./mvnw spring-boot:run
```

L'application démarre sur **http://localhost:8080**

---

## Endpoints disponibles

### Opérations de base

| Méthode | Endpoint | Description | Exemple |
|---------|----------|-------------|---------|
| GET | `/calculator/add` | Addition | `?valeurX=5&valeurY=3` |
| GET | `/calculator/subtract` | Soustraction | `?valeurX=5&valeurY=3` |
| GET | `/calculator/multiply` | Multiplication | `?valeurX=5&valeurY=3` |
| GET | `/calculator/divide` | Division | `?valeurX=10&valeurY=2` |

### Opérations scientifiques

| Méthode | Endpoint | Description | Exemple |
|---------|----------|-------------|---------|
| GET | `/calculator/science/sqrt` | Racine carrée | `?valeurX=16` |
| GET | `/calculator/science/power` | Puissance | `?valeurX=2&valeurY=8` |

### Informations

| Méthode | Endpoint | Description |
|---------|----------|-------------|
| GET | `/calculator/info` | Infos de l'application |

---

## Exemples de réponses

### Opération réussie
```json
{
    "valeurX": 10.0,
    "valeurY": 2.0,
    "resultat": 5.0,
    "operation": "division"
}
```

### Erreur — Division par zéro
```json
{
    "message": "Division par zéro impossible !",
    "status": 400
}
```

### Erreur — Paramètre invalide
```json
{
    "message": "Paramètre invalide : veuillez entrer un nombre !",
    "status": 400
}
```

---

## Architecture du projet

```
src/main/java/calculatrice/claculatriceREST/
├── controller/
│   ├── CalculatriceController.java          (endpoints de base)
│   ├── CalculatriceScientifiqueController.java  (sqrt, power)
│   └── InfoController.java                  (infos application)
├── service/
│   ├── CalculatriceService.java             (interface)
│   ├── CalculatriceServiceImpl.java         (@Primary)
│   └── CalculatriceServiceScientifique.java (@Qualifier)
├── model/
│   ├── CalculatriceResult.java              (modèle de réponse)
│   └── ErrorResponse.java                  (modèle d'erreur)
├── config/
│   ├── CalculatriceConfig.java              (@ConfigurationProperties)
│   └── GlobalException.java                (@RestControllerAdvice)
├── exception/
│   └── CalculatriceException.java          (exception personnalisée)
└── ClaculatriceRestApplication.java
```

### Rôle de chaque couche

- **Controller** : reçoit les requêtes HTTP, extrait les paramètres, retourne le JSON
- **Service** : contient la logique métier (les calculs)
- **Model** : représente les données échangées (requête/réponse)

---

## Configuration

Les propriétés se trouvent dans `src/main/resources/application.properties` :

```properties
calculatrice.message=Bienvenue sur la Calculatrice REST
calculatrice.version=1.0
calculatrice.nom=Calculatrice REST
calculatrice.auteur=G-ibrahima
calculatrice.precision=2
```

---

## Concepts Spring Boot utilisés

| Concept | Utilisation |
|---------|-------------|
| `@RestController` | Déclare les controllers REST |
| `@Service` | Déclare les services |
| `@ConfigurationProperties` | Groupe les propriétés de config |
| `@Primary` | Service injecté par défaut |
| `@Qualifier` | Sélectionne un service spécifique |
| `@RestControllerAdvice` | Gestion globale des erreurs |
| `@ExceptionHandler` | Intercepte un type d'exception |
| `ResponseEntity` | Contrôle le code HTTP retourné |
| Lombok (`@Data`, `@AllArgsConstructor`) | Génère getters/setters/constructeurs |

---

## Auteur

**G-ibrahima** — Projet réalisé dans le cadre de la Phase 1 — Fondations Spring Boot