enum class FR(val color : String) {
    DIAMANTES(RED),
    CORAZONES(RED),
    PICAS(BLACK),
    TREBOLES(BLACK);

    companion object {
        val names = entries.map { it.name to it.color }
    }

    override fun toString(): String {
        TODO()
    }

}