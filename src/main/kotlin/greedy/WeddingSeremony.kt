package greedy

import java.lang.System.`in`
import java.util.*

/**
 * @author jongyunha created on 22. 7. 17.
 */

private fun solution(peopleOfTime: ArrayList<Pair<Int, String>>): Int {
    var result = Int.MIN_VALUE
    var count = 0

    val peopleOfTime = peopleOfTime.sortedWith(compareBy({ it.first }, { it.second }))

    for (p in peopleOfTime) {
        if (p.second.equals("s")) count++
        else count--
        result = Math.max(result, count)
    }
    return result
}

fun main() {
    val scanner = Scanner(`in`)
    val N = scanner.nextInt()

    val peopleOfTime = ArrayList<Pair<Int, String>>()
    for (i in 0 until N * 2) {
        peopleOfTime.add(Pair(scanner.nextInt(), if (i % 2 == 0) "s" else "e"))
    }

    println(solution(peopleOfTime))
}