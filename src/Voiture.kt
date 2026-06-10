class Voiture(private var marque: String, private var anneeFabrication: Int, private var couleur: String): Vehicule(marque, anneeFabrication, couleur) {
    override fun afficherDetails() {
        print("Voiture: ")
        super.afficherDetails()
    }

    override fun klaxonner() {
        println("BIP")
    }
}