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


// Reset
const val RESET: String = "\u001b[0m" // Text Reset

// Regular Colors
const val BLACK: String = "\u001b[0;30m" // BLACK
const val RED: String = "\u001b[0;31m" // RED
const val GREEN: String = "\u001b[0;32m" // GREEN
const val YELLOW: String = "\u001b[0;33m" // YELLOW
const val BLUE: String = "\u001b[0;34m" // BLUE
const val PURPLE: String = "\u001b[0;35m" // PURPLE
const val CYAN: String = "\u001b[0;36m" // CYAN
const val WHITE: String = "\u001b[0;37m" // WHITE

// Bold
const val BLACK_BOLD: String = "\u001b[1;30m" // BLACK
const val RED_BOLD: String = "\u001b[1;31m" // RED
const val GREEN_BOLD: String = "\u001b[1;32m" // GREEN
const val YELLOW_BOLD: String = "\u001b[1;33m" // YELLOW
const val BLUE_BOLD: String = "\u001b[1;34m" // BLUE
const val PURPLE_BOLD: String = "\u001b[1;35m" // PURPLE
const val CYAN_BOLD: String = "\u001b[1;36m" // CYAN
const val WHITE_BOLD: String = "\u001b[1;37m" // WHITE

// Underline
const val BLACK_UNDERLINED: String = "\u001b[4;30m" // BLACK
const val RED_UNDERLINED: String = "\u001b[4;31m" // RED
const val GREEN_UNDERLINED: String = "\u001b[4;32m" // GREEN
const val YELLOW_UNDERLINED: String = "\u001b[4;33m" // YELLOW
const val BLUE_UNDERLINED: String = "\u001b[4;34m" // BLUE
const val PURPLE_UNDERLINED: String = "\u001b[4;35m" // PURPLE
const val CYAN_UNDERLINED: String = "\u001b[4;36m" // CYAN
const val WHITE_UNDERLINED: String = "\u001b[4;37m" // WHITE

// Background
const val BLACK_BACKGROUND: String = "\u001b[40m" // BLACK
const val RED_BACKGROUND: String = "\u001b[41m" // RED
const val GREEN_BACKGROUND: String = "\u001b[42m" // GREEN
const val YELLOW_BACKGROUND: String = "\u001b[43m" // YELLOW
const val BLUE_BACKGROUND: String = "\u001b[44m" // BLUE
const val PURPLE_BACKGROUND: String = "\u001b[45m" // PURPLE
const val CYAN_BACKGROUND: String = "\u001b[46m" // CYAN
const val WHITE_BACKGROUND: String = "\u001b[47m" // WHITE

// High Intensity
const val BLACK_BRIGHT: String = "\u001b[0;90m" // BLACK
const val RED_BRIGHT: String = "\u001b[0;91m" // RED
const val GREEN_BRIGHT: String = "\u001b[0;92m" // GREEN
const val YELLOW_BRIGHT: String = "\u001b[0;93m" // YELLOW
const val BLUE_BRIGHT: String = "\u001b[0;94m" // BLUE
const val PURPLE_BRIGHT: String = "\u001b[0;95m" // PURPLE
const val CYAN_BRIGHT: String = "\u001b[0;96m" // CYAN
const val WHITE_BRIGHT: String = "\u001b[0;97m" // WHITE

// Bold High Intensity
const val BLACK_BOLD_BRIGHT: String = "\u001b[1;90m" // BLACK
const val RED_BOLD_BRIGHT: String = "\u001b[1;91m" // RED
const val GREEN_BOLD_BRIGHT: String = "\u001b[1;92m" // GREEN
const val YELLOW_BOLD_BRIGHT: String = "\u001b[1;93m" // YELLOW
const val BLUE_BOLD_BRIGHT: String = "\u001b[1;94m" // BLUE
const val PURPLE_BOLD_BRIGHT: String = "\u001b[1;95m" // PURPLE
const val CYAN_BOLD_BRIGHT: String = "\u001b[1;96m" // CYAN
const val WHITE_BOLD_BRIGHT: String = "\u001b[1;97m" // WHITE

// High Intensity backgrounds
const val BLACK_BACKGROUND_BRIGHT: String = "\u001b[0;100m" // BLACK
const val RED_BACKGROUND_BRIGHT: String = "\u001b[0;101m" // RED
const val GREEN_BACKGROUND_BRIGHT: String = "\u001b[0;102m" // GREEN
const val YELLOW_BACKGROUND_BRIGHT: String = "\u001b[0;103m" // YELLOW
const val BLUE_BACKGROUND_BRIGHT: String = "\u001b[0;104m" // BLUE
const val PURPLE_BACKGROUND_BRIGHT: String = "\u001b[0;105m" // PURPLE
const val CYAN_BACKGROUND_BRIGHT: String = "\u001b[0;106m" // CYAN
const val WHITE_BACKGROUND_BRIGHT: String = "\u001b[0;107m" // WHITE