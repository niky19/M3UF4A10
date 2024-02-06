import java.util.*

class Tablero : Juego {

    override fun crearBaraja(): MutableList<Carta> {
        val baraja = mutableListOf<Carta>()
        val palos = listOf("Oros", "Copas", "Espadas", "Bastos")
        for (palo in palos) {
            for (numero in 1..12) {
                baraja.add(Carta(palo, numero))
            }
        }
        return baraja
    }

    // Mezcla la baraja de cartas
    override fun mezclar(mazo : MutableList<Carta>): MutableList<Carta>{
       val barajaMezclada = mazo.shuffled()
        return barajaMezclada.toMutableList()
    }

    // Devuelve la siguiente carta del mazo
    override fun siguienteCarta(mazo : MutableList<Carta>) : Carta {
        val carta = mazo.random()
        if (mazo.size > 0) {
            mazo.remove(carta)
        }
        else {
            println("No hay cartas disponibles")
        }
        return carta
    }

    // Devuelve el numero de cartas que quedan por repartir
    override fun mostrarCartesDisponibles(mazo : MutableList<Carta>)  {
        println("Quedan ${mazo.size} cartas sin repartir")
    }

    // Reparte n cartas. Si no hay suficientes, avisa al usuario.
    // El usuario devuelve las mismas cartas que pide
    override fun pedirCarta(mazo : MutableList<Carta>){
        val carta = siguienteCarta(mazo)
        println("Carta pedida: $carta")
        almacenarCartasDevueltas(carta)
    }

    override fun almacenarCartasDevueltas(carta: Carta) : MutableList<Carta>  {
        val devueltas = mutableListOf<Carta>()
        devueltas.add(carta)
        return devueltas
    }

    // Reparte n cartas. Si no hay suficientes, avisa al usuario.
    override fun repartir(mazo : MutableList<Carta>, sc : Scanner) {
        println("Indica cuantas cartas quieres repartir:")
        val aRepartir = getIntInRange(1, mazo.size, sc)
        for (i in 1..aRepartir) {
            val carta = siguienteCarta(mazo)
            println("Carta repartida: $carta")
        }
        mostrarCartesDisponibles(mazo)
    }

    // Muestra todas las cartas ya devueltas
    override fun verMazoDevueltas(mazo : MutableList<Carta>) {
    }
}