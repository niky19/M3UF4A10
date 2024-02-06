import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    partida(sc)

}

fun partida(sc: Scanner) {
    val juego: Juego = Tablero()
    val mazo = juego.crearBaraja()
    juego.mezclar(mazo)
    juego.mostrarCartesDisponibles(mazo)
    juego.repartir(mazo, sc)
    juego.verMazoDevueltas(mazo)
    
}