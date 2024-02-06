import java.util.*

interface Juego {
    fun crearBaraja() : MutableList<Carta>
    fun mezclar(mazo : MutableList<Carta>): MutableList<Carta>
    fun siguienteCarta(mazo : MutableList<Carta>) : Carta
    fun mostrarCartesDisponibles(mazo : MutableList<Carta>)
    fun pedirCarta(mazo : MutableList<Carta>)
    fun repartir(mazo : MutableList<Carta>, sc : Scanner)
    fun verMazoDevueltas(mazo : MutableList<Carta>)
    fun almacenarCartasDevueltas(carta: Carta) : MutableList<Carta>
}