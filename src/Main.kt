//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var maVoiture = Voiture("Toyota", "Corolla", 2020)
    println("${maVoiture.getMarque()} ${maVoiture.getModele()} ${maVoiture.getAnnee()}")

    maVoiture.setMarque("Honda")
    maVoiture.setModele("Civic")
    maVoiture.setAnnee(2021)
    println("Après modification: ${maVoiture.getMarque()} ${maVoiture.getModele()} ${maVoiture.getAnnee()}")

    val maVoiture2 = Voiture("Honda", "Civic", 2021)
    val maVoiture3 = Voiture("Ford", "Mustang", 1969)
    println("Ma 2ème voiture : ${maVoiture2.getMarque()} ${maVoiture2.getModele()} ${maVoiture2.getAnnee()}")
    println("Ma 3ème voiture : ${maVoiture3.getMarque()} ${maVoiture3.getModele()} ${maVoiture3.getAnnee()}")

    println("Nombre total de voitures : ${Voiture.nombreDeVoitures}")
}
