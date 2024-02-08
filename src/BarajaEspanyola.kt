class BarajaEspanyola : Baraja() {
override val palos = listOf("Oros", "Copas", "Espadas", "Bastos")
override val numPalos = 12
override val baraja = mutableListOf<Carta>()
init {
crearBaraja()
}
}