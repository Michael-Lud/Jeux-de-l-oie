# TP8 - Programmation Orientée Objet (POO)

## Etudiants
- TANKEU BIGNA Michael

## Sujet du TP
## Jeu de l'oie - Description du tp



---
## Structure du tp

```
.
├── Makefile
├── classes
│   └── goosegame
│       └── cells
├── junit-console.jar
├── readme.md
├── src
│   └── goosegame
│       ├── Board.java
│       ├── Cell.java
│       ├── ClassicalBoard.java
│       ├── Game.java
│       ├── MainOie.java
│       ├── Player.java
│       └── cells
│           ├── cellGoose.java
│           ├── cellTeleport.java
│           ├── cellTrap.java
│           └── cellWaiting.java
└── test
    └── goosegame
        ├── BoardTest.java
        ├── CellTest.java
        ├── GameTest.java
        └── cells

```

## Générer la documentation

Se placer dans le dossier `tp8/` et exécuter la commande si dessous pour générer la documentation du package `goosegame` et ses sous package :

```bash
make doc
```
Aprés l'exécution de la commande ouvrir le dossier `docs` crée et cliquez sur le fichier `index.html` pour consulter la documentation du package.

## Compilation des sources du projet

Se placer dans le dossier `tp8/` et exécuter la commande si dessous pour compiler tous les fichier java présent dans le package `goosegame` et ses sous package :

```bash
make compile
```

## Compilation et exécution des tests

Se placer dans le dossier `tp8/` et exécuter la commande si dessous pour compiler tous les fichier de test présent du package `goosegame` et ses sous package :

```bash
make test
```

## Générer le fichier jar exécutable

Se placer dans le dossier `tp8/` et exécuter la commande si dessous pour générer le jar exécutable du package `goosegame` :

```bash
make jar
```

## Exécution du programme sans le jar exécutable

Se placer dans le dossier `tp8/` et exécuter la commande si dessous pour exécuter le programme :

```bash
make run [args]
```

## Exécution du programme avec le jar exécutable

Se placer dans le dossier `tp8/` et exécuter la commande si dessous pour exécuter le programme :

```bash
make runjar [args]
```
## Nettoyage

Se placer dans le dossier `tp8/` et exécuter la commande si dessous pour nettoyer le projet ie supprimer tous les fichiers générés automatiquement pour repartire à zéro :

```bash
make clean
```
