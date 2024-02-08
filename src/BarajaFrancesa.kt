class BarajaFrancesa : Baraja() {
    override val palos: List<String> = FR.entries.map { it.toString() }
    override val numPalos = 13
    override val baraja = mutableListOf<Carta>()
    init {
        crearBaraja()
    }
}