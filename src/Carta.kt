class Carta(tipo : String, valor : Int) {
    val palo : String
    val numero : Int
    init {
        this.palo = tipo
        this.numero = valor
    }
    override fun toString(): String {
        return "$numero de $palo"
    }

}