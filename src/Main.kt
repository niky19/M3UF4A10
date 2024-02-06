import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    partida(sc)
}

fun partida(sc: Scanner) {
    val juego: Juego = Tablero()
    val espanyola = listOf("Oros", "Copas", "Espadas", "Bastos")
    val mazo = juego.crearBaraja(mutableListOf(), espanyola)
    juego.printMisCartas()
    juego.mezclar(mazo)
    juego.repartir(mazo, sc)
    juego.pedirCarta(mazo)
    juego.printMisCartas()
    juego.verMazoDevueltas()


}