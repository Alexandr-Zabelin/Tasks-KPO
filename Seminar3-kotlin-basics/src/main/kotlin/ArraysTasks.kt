fun <T> printArray(arr: Array<T>) = println(arr.joinToString(" "))

/**
    Задание 1: Сформировать целочисленный массив A из N элементов
    при помощи ввода значений с клавиатуры (N вводит пользователь).
    Вывести массив на экран. (1 балл)
 */
fun makeArray(): Array<Int> {
    print("n = ")

    val n = readln().toInt()

    if (n < 0) {
        return arrayOf()
    }

    val arr = Array(n) { readln().toInt() }

    printArray(arr)

    return arr
}

/**
    Задание 2: Написать функцию для сортировки массива по убыванию и его вывода на экран.
    Использовать встроенные функции. (0.5 балла)
 */
fun sortArrayDesc(arr: Array<Int>) {
    arr.sortDescending()
    printArray(arr)
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val arr = makeArray()

    sortArrayDesc(arr)
}

