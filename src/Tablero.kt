import java.util.*

class Tablero : Juego {
    var resto: MutableList<Carta> = mutableListOf()
    var misCartas = mutableListOf<Carta>()

    override fun printMisCartas() {
        println("Mis cartas:")
        for (carta in misCartas) {
            println(carta)
        }
    }

    // Crea una baraja de cartas de 12 cartas por palo
    override fun crearBaraja(baraja: MutableList<Carta>, palos: List<String>): MutableList<Carta> {
        for (palo in palos) {
            for (numero in 1..12) {
                baraja.add(Carta(palo, numero))
            }
        }
        return baraja
    }


    // Mezcla la baraja de cartas
    override fun mezclar(mazo: MutableList<Carta>): MutableList<Carta> {
        val barajaMezclada = mazo.shuffled()
        return barajaMezclada.toMutableList()
    }

    // Devuelve la siguiente carta del mazo
    override fun siguienteCarta(mazo: MutableList<Carta>): Carta {
        val carta = mazo.random()
        if (mazo.size > 0) {
            mazo.remove(carta)
            misCartas.add(carta)
        } else {
            println("No hay cartas disponibles")
        }
        return carta
    }

    // Devuelve el número de cartas que quedan por repartir
    override fun mostrarCartesDisponibles(mazo: MutableList<Carta>) {
        println("Quedan ${mazo.size} cartas sin repartir")
    }

    // Reparte n cartas. Si no hay suficientes, avisa al usuario.
    // El usuario devuelve las mismas cartas que pide
    override fun pedirCarta(mazo: MutableList<Carta>) {
        val nuevaCarta = siguienteCarta(mazo)
        println("Carta conseguida: $nuevaCarta")

        //almacenarCartasDevueltas(nuevaCarta)
    }

    // Almacena las cartas devueltas por el usuario
    override fun almacenarCartasDevueltas(aDevolver: Carta): MutableList<Carta> {
        misCartas.remove(aDevolver)
        resto.add(aDevolver)
        return resto
    }

    // Reparte n cartas. Si no hay suficientes, avisa al usuario.
    override fun repartir(mazo: MutableList<Carta>, sc: Scanner) {
        println("Indica cuantas cartas quieres repartir:")
        val aRepartir = getIntInRange(1, mazo.size, sc)
        println("Cartas repartidas:")
        for (i in 1..aRepartir) {
            val carta = siguienteCarta(mazo)
            println(carta)
        }
        //mostrarCartesDisponibles(mazo)
    }

    // Muestra todas las cartas ya devueltas
    override fun verMazoDevueltas() {
        println("Cartas devueltas:")
        for (carta in resto) {
            println(carta)
        }
    }
}