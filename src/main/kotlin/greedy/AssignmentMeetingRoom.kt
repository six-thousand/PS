package greedy

import java.util.*

fun solution(intervals: ArrayList<Pair<Int, Int>>): Int {
    intervals.sortWith(compareBy({ it.second }, { it.first }))
    var result = 0
    var endTime = 0

    for (interval in intervals) {
        if (interval.first >= endTime) {
            endTime = interval.second
            result++
        }

    }
    return result
}

fun main() {
    val scanner = Scanner(System.`in`)
    val N = scanner.nextInt()

    val intervals = ArrayList<Pair<Int, Int>>()

    for (i in 0 until N) {
        val pair = Pair(scanner.nextInt(), scanner.nextInt())
        intervals.add(pair)
    }

    println(solution(intervals))
}