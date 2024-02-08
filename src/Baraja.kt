abstract class Baraja() {
    abstract val palos: List<String>
    abstract val numPalos: Int
    abstract val baraja : MutableList<Carta>
    fun crearBaraja(): MutableList<Carta> {
        for (palo in palos) {
            for (numero in 1..numPalos) {
                baraja.add(Carta(palo, numero))
            }
        }
        return baraja
    }

    override fun toString(): String {
        return "$baraja"
    }
}