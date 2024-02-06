import java.util.*

/**
 *      Contains utility functions used in the game.
 * The functions are static and can be called from any class.
 * @authors niky19
 */

/**
 *     Checks if the user input is an int.
 * If the input is not an int, the user is asked to input a new value.
 * @param sc Scanner for user input.
 */

fun checkInt(sc: Scanner): Int {
    while (true) {
        if (sc.hasNextInt()) {
            return sc.nextInt()
        } else {
            println("Error. Vuelve a introducir:")
            sc.next()
        }
    }
}

/**
 *     Checks if the user input is a double.
 * If the input is not an int, the user is asked to input a new value.
 * @param sc Scanner for user input.
 */
fun checkDouble(sc: Scanner): Double {
    while (true) {
        if (sc.hasNextDouble()) {
            return sc.nextDouble()
        } else {
            println("Error. Vuelve a introducir:")
            sc.next()
        }
    }
}


/**
 *     Checks if the user input is a yes or no.
 * If the input is not a yes or no, the user is asked to input a new value.
 * @param sc Scanner for user input.
 */
fun getYesOrNo(sc: Scanner): Boolean {
    while (true) {
        val userAnswer = sc.next()
        if (userAnswer == "S" || userAnswer == "N") {
            return userAnswer == "S"
        } else {
            println("Error. Introduce S o N:")
        }
    }
}

/**
 *    Checks if the user input is an int within a given range.
 * If the input is not an int or is not within the range, the user is asked to input a new value.
 * @param startInt The lower bound of the range.
 * @param endInt The upper bound of the range.
 */
fun getIntInRange(startInt: Int, endInt: Int, sc: Scanner): Int {
    while (true) {
        if (sc.hasNextInt()) {
            val userNumber = sc.nextInt()
            if (userNumber in startInt..endInt) {
                return userNumber
            }
            println("Error. Introduce un numero entre $startInt i $endInt:")
        } else {
            println("Error: no es un ente. Introduce un numero entre $startInt i $endInt:")
            sc.next()
        }
    }
}
