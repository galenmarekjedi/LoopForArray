import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val array = IntArray(size)
    for (i in 0..array.lastIndex) { array[i] = scanner.nextInt() }
    val M = scanner.nextInt()
    if (M in array) {println("YES")}
    else println("NO")
}
