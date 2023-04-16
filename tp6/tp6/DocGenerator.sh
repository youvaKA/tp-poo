#!/bin/bash
file=`pwd`


echo -e " Ce script va crée la documentation java." 
echo ""
echo " Avant d'éxécuter se script assuré vous d'être dans le dossier racine ../tp6/image"
echo ""
echo "Vous êtes actuelement dans le dossier $file"
read -p "Appuez sur une touche pour lancer l'éxécution... " -n 1 -s


javadoc src/image/*.java -d doc

javadoc src/image/color/*.java -d doc

javadoc src/image/util/*.java -d doc

