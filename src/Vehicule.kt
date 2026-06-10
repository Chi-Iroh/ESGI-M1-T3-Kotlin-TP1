open class Vehicule(private var marque: String, private var anneeFarication: Int, private var couleur: String) {
    open fun afficherDetails() {
        println("${marque} ${anneeFarication} ${couleur}")
    }

    open fun klaxonner() {
        println("klaxon")
    }
}
