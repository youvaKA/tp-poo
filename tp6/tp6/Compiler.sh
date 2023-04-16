
#!/bin/bash
file=`pwd`


echo -e " Ce script va éxécuter la compilation des fichier au format java, \n se trouvant dans le dossier image." 
echo ""
echo " Avant d'éxécuter se script assuré vous d'être dans le dossier racine ../tp6/"
echo ""
echo "Vous êtes actuelement dans le dossier $file"
read -p "Appuez sur une touche pour lancer l'éxécution... " -n 1 -s

javac src/image/*.java  -sourcepath src -d classes
cd classes
java src/image.ImageMain /images/lamp.pgm 5 16
