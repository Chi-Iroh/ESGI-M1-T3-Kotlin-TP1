class Moto(private var marque: String, private var anneeFarication: Int, private var couleur: String): Vehicule(marque,anneeFarication, couleur) {
    override fun afficherDetails() {
        print("Moto: ")
        super.afficherDetails()
    }

    override fun klaxonner() {
        print("bip")
    }
}