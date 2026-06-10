class Garage() {
    public var listeVehicules: ArrayList<Vehicule> = ArrayList()
        private set

    fun ajouterVehicule(vehicule: Vehicule) {
        listeVehicules.add(vehicule)
    }

    fun afficherGarage() {
        for (vehicule in listeVehicules) {
            vehicule.afficherDetails()
        }
    }
}