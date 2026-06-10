fun main() {
    var garage = Garage()

    val voiture = Voiture("Citroën", 2005, "bleu")
    val moto = Moto("Yamaha", 2018, "gris")
    val camion = Camion("Tesla", 2023, "vert")

    garage.ajouterVehicule(voiture)
    garage.ajouterVehicule(moto)
    garage.ajouterVehicule(camion)

    garage.afficherGarage()

    for (vehicule in garage.listeVehicules) {
        vehicule.klaxonner()
    }
}
