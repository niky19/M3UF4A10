import java.util.*

interface Juego {
    fun printMisCartas()
    fun crearBaraja(baraja :  MutableList<Carta>, palos : List<String> ) : MutableList<Carta>
    fun mezclar(mazo : MutableList<Carta>): MutableList<Carta>
    fun siguienteCarta(mazo : MutableList<Carta>) : Carta
    fun mostrarCartesDisponibles(mazo : MutableList<Carta>)
    fun pedirCarta(mazo : MutableList<Carta>)
    fun repartir(mazo : MutableList<Carta>, sc : Scanner)
    fun verMazoDevueltas()
    fun almacenarCartasDevueltas(aDevolver: Carta) : MutableList<Carta>
}