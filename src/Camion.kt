class Camion(private var marque: String, private var anneeFarication: Int, private var couleur: String): Vehicule(marque,anneeFarication, couleur) {
    override fun afficherDetails() {
        print("Camion: ")
        super.afficherDetails()
    }

    override fun klaxonner() {
        print("BIIIIIP")
    }
}