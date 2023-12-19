import kotlin.random.Random
fun main() {
    val totalShots = 3
    val totalTargets = 3
    var totalScore = 0
    for (shot in 1..totalShots) {
        println("Выстрел $shot:")
        var shotScore = 0
        for (target in 1..totalTargets) {
            val hit = Random.nextBoolean()
            if (hit) {
                println("Мишень $target: Попадание в цель")
                shotScore++
            } else {
                println("Мишень $target: Промах")
            }
        }
        totalScore += shotScore
        println("Баллов за выстрел $shot: $shotScore\n")
    }
    println("Итоговый результат за выстрелы: $totalScore баллов")
}