# Programmtion orienté objets JAVA TP9

Ce dépôt contient le tp9 de poo intitulé jeu de l'oie.
* Auteur : Kaoui Youva
* Groupe : 3 - 4
* Année : 2021 - 2022


## Contenu de ce dépôt

-   Coposition du tp
```bash
├── jeu_de_loie.pdf
├── README.md
├── src
│   └── goosegame
│       ├── BaseCell.java
│       ├── Board.java
│       ├── Cell.java
│       ├── ClassicBoard.java
│       ├── Game.java
│       ├── GameMain.java
│       ├── Goose.java
│       ├── Jump.java
│       ├── Player.java
│       ├── StartCell.java
│       ├── Trap.java
│       └── Wait.java
└── test
    └── goosegame
        ├── BaseCellTest.java
        ├── GameTest.java
        ├── GooseTest.java
        ├── JumpTest.java
        ├── TrapTest.java
        └── WaitTest.java

4 directories, 20 files
```

## présentation du tp
-   Ce tp à pour objectif de reproduire le jeu de l'oie, un jeu assez complexe du fait de la nature des cellules. 

## COMMENT LANCER LE JEU ?:
- /!\ Se placer à la racine du projet (tp9/) pour executer toutes les commandes ci-dessous /!\

- GENERER LA DOCUMENTATION:

```bash
javadoc -sourcepath src -d docs -subpackages goosegame
```

- OUVRIR LA DOCUMENTATION:
```bash
firefox docs/goosegame/package-summary.html 
```
- COMPILER LES CLASSES:
```bash
javac -sourcepath src -d classes src/goosegame/*.java
```

- COMPILER ET EXECUTER LES TESTS:
```bash
compiler les tests : javac -classpath test4poo.jar tests/goosegame/*.java
lancer les tests : java -jar test4poo.jar goosegame."YourClasseName"
```

- LANCER LE JEU !:
```bash
java -classpath classes goosegame.GameMain
```


