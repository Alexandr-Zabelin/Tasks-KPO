import kotlin.Double.Companion.NaN
import kotlin.math.pow
import kotlin.math.sqrt

/**
    Задание 1: Функция,спрашивающая у пользователя его ФИО и выводящая его на экране.
    (0.5 балла)
    Формат вывода:
        " Фамилия:
          Имя:
          Отчество:
        "
 */
fun askForInput() {
    print("ФИО: ")

    val titles = arrayOf("Фамилия:", "Имя:", "Отчество:")
    val personInitials = readln().split(" ")

    for (i in 0..<minOf(titles.size, personInitials.size)) {
        println("${titles[i]} ${personInitials[i]}")
    }
}

/**
    Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double, Double>  {
    val discriminant = b.pow(2) - 4 * a * c

    if (discriminant < 0) return NaN to NaN

    val discriminantRoot = sqrt(discriminant)
    val x1 = (-b - discriminantRoot) / (2 * a)
    val x2 = (-b + discriminantRoot) / (2 * a)

    return x1 to x2
}

/**
    Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
    (2 балла)
 */
fun printSameDigitNumbers() {
    for (digit in 1..9) {
        println("$digit".repeat(3))
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    askForInput()

    val roots = quadraticRoots(-5.0, 4.0, 3.0)
    println("X1 = ${roots.first} ; X2 =${roots.second}")

    printSameDigitNumbers()
}