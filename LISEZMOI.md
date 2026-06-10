# GestionVoitures

## Contexte personnel

J'ai l'habitude de faire de l'orienté objet (avec principalement C++, puis un peu Java et Python), donc je connaissais déjà les concepts de classes, encapsulation, polymorphisme etc.

## Conception

La classe `Vehicule` représente un véhicule, et se construit à partir de sa marque (chaîne de caractères), de son année de fabrication (entier) et de sa couleur (chaîne de caractères).  

Elle implémente deux méthodes :
1. `afficherDetails` qui affiche les trois données requises pour instancier la classe
2. `klaxonner` qui affiche un son de klaxon générique (par défaut, `klaxon`)

De `Vehicule` héritent trois classes représentant des véhicules concrets et identifiables :
- `Moto`
- `Voiture`
- `Camion`

`Vehicule` pourrait être une classe abstraite dans ce projet, car elle ne semble exister que pour structurer efficacement les trois classes "métier" citées ci-dessus.  

Chaque classe de véhicule concret va venir surcharger les deux méthodes de `Vehicule` pour les compléter :
- `afficherDetails`: affiche le type de véhicule (moto, voiture, camion) suivi des détails (appelle l'implémentation par défaut de `Vehicule`)
- `klaxonner`: chaque véhicule change le son du klaxon 

## Remarques

1. Il faut bien sûr un temps d'adaptation pour s'approprier la syntaxe du Kotlin
2. Le mot-clef `open` permettant d'interdire <ins>par défaut</ins> la spécialisation des méthodes via `override` était nouveau pour moi
3. Le langage est simple à lire et à comprendre même lorsqu'on débute et qu'on ne le connaît que peu