fun isUnique(array: List<String>, elem: String): Boolean = array.indexOf(elem) == array.lastIndexOf(elem)

/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>) = array.map{ if (isUnique(array, it)) it else "blahblah" }


/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int  {
    val array = text.split(" ")
    val predicate: (String) -> Boolean = {isUnique(array, it)}

    return array.count(predicate)
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val text = "abc cde abc abc eft xyz"
    println(uniqueWords(text))

    println(replaceElements(text.split(" ")))
}