# Programmtion orienté objets JAVA TP6

Ce dépôt contient le tp6 de poo intitulé Image.
* Auteur : Kaoui Youva
* Groupe : 3 - 4
* Année : 2021 - 2022


## Contenu de ce dépôt

-   Coposition du tp
```bash
├── image.jar
├── image.pdf
├── README.md
└── tp6
    ├── Compiler.sh
    ├── DocGenerator.sh
    ├── docs
    │   ├── allclasses-index.html
    │   ├── allpackages-index.html
    │   ├── constant-values.html
    │   ├── deprecated-list.html
    │   ├── element-list
    │   ├── help-doc.html
    │   ├── image
    │   │   ├── ImageInterface.html
    │   │   ├── package-summary.html
    │   │   ├── package-tree.html
    │   │   └── util
    │   │       ├── ImageDisplayer.html
    │   │       ├── ImageLoader.html
    │   │       ├── package-summary.html
    │   │       └── package-tree.html
    │   ├── index-all.html
    │   ├── index.html
    │   ├── member-search-index.js
    │   ├── member-search-index.zip
    │   ├── overview-summary.html
    │   ├── overview-tree.html
    │   ├── package-search-index.js
    │   ├── package-search-index.zip
    │   ├── resources
    │   │   ├── glass.png
    │   │   └── x.png
    │   ├── script-dir
    │   │   ├── external
    │   │   │   └── jquery
    │   │   │       └── jquery.js
    │   │   ├── images
    │   │   │   ├── ui-bg_glass_55_fbf9ee_1x400.png
    │   │   │   ├── ui-bg_glass_65_dadada_1x400.png
    │   │   │   ├── ui-bg_glass_75_dadada_1x400.png
    │   │   │   ├── ui-bg_glass_75_e6e6e6_1x400.png
    │   │   │   ├── ui-bg_glass_95_fef1ec_1x400.png
    │   │   │   ├── ui-bg_highlight-soft_75_cccccc_1x100.png
    │   │   │   ├── ui-icons_222222_256x240.png
    │   │   │   ├── ui-icons_2e83ff_256x240.png
    │   │   │   ├── ui-icons_454545_256x240.png
    │   │   │   ├── ui-icons_888888_256x240.png
    │   │   │   └── ui-icons_cd0a0a_256x240.png
    │   │   ├── jquery-3.4.1.js
    │   │   ├── jquery-ui.css
    │   │   ├── jquery-ui.js
    │   │   ├── jquery-ui.min.css
    │   │   ├── jquery-ui.min.js
    │   │   ├── jquery-ui.structure.css
    │   │   ├── jquery-ui.structure.min.css
    │   │   ├── jszip
    │   │   │   └── dist
    │   │   │       ├── jszip.js
    │   │   │       └── jszip.min.js
    │   │   └── jszip-utils
    │   │       └── dist
    │   │           ├── jszip-utils-ie.js
    │   │           ├── jszip-utils-ie.min.js
    │   │           ├── jszip-utils.js
    │   │           └── jszip-utils.min.js
    │   ├── script.js
    │   ├── search.js
    │   ├── stylesheet.css
    │   ├── system-properties.html
    │   ├── type-search-index.js
    │   └── type-search-index.zip
    ├── images
    │   ├── body.pgm
    │   ├── cameraman.pgm
    │   ├── casablanca.pgm
    │   ├── chat.pgm
    │   ├── frog.pgm
    │   ├── fruit.pgm
    │   ├── hands.pgm
    │   ├── lamp.pgm
    │   ├── saturn.pgm
    │   └── storm.pgm
    └── src
        └── image
            ├── color
            │   └── GrayColor.java
            ├── ImageExampleMain.java
            ├── ImageInterface.java
            ├── Image.java
            ├── ImageMain.java
            ├── Pixel.java
            ├── UnknownPixelException.java
            └── util
                ├── ImageDisplayer.java
                └── ImageLoader.java

18 directories, 78 files
```

## présentation du tp
-   Ce tp à pour objectif de crée et modifier la couleur des images via des classes java, en modifiants les pixels mis en parametre. Il permet également de générer des réctangles de couleur et de longueur passé en parametre.


## Java Doc
La generation des documents .html est disponible dans le dossier **tp6/image/doc**. 

Afin de générer la documentation un sript bash à été mis en place, 
voici les commandes à entrer pour éxécuter le script:

    chmod +x docJava.sh

    ./docJava.sh
    
## Compilation des classes

afin de facilité la compilation des classes un scrip à été mis en place:
voici les commandes à entrer pour éxécuter le script:

    chmod +x luncher.sh

    ./luncher.sh

