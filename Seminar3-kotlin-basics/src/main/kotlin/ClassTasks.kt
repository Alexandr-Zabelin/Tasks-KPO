import kotlin.math.PI
import kotlin.math.pow

/**
 * Задание 1: Объявите классы Circle и Square – наследников базового (Point).
 * Реализуйте readonly свойство, вычисляющее площадь каждой фигуры, а также функцию display()
 * для вывода информации о фигуре на экран.
 *
 * (3 балла)
 */

open class Point(private val x: Double, private val y: Double) {
    constructor(x: Int, y: Int) : this(x.toDouble(), y.toDouble())

    open val area get() = 0.0

    fun display() {
        println("S = ${this.area}, X = $x, Y = $y")
    }
}

class Circle(x: Double, y: Double, private val r: Double) : Point(x, y) {
    constructor(x: Int, y: Int, r: Int) : this(x.toDouble(), y.toDouble(), r.toDouble())
    override val area get() = PI * r.pow(2)
}

class Square(x: Double, y: Double, private val l: Double) : Point(x, y) {
    constructor(x: Int, y: Int, l: Int) : this(x.toDouble(), y.toDouble(), l.toDouble())
    override val area get() = l.pow(2)
}


// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val p = Point(34, 56)
    val c = Circle(46, 34, 7)
    val s = Square(46, 34, 8)
    p.display()
    c.display()
    s.display()
}