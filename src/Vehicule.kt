open class Vehicule(private var marque: String, private var anneeFabrication: Int, private var couleur: String) {
    open fun afficherDetails() {
        println("${marque} ${anneeFabrication} ${couleur}")
    }

    open fun klaxonner() {
        println("klaxon")
    }
}
