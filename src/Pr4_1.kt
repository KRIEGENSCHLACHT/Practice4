fun main()
{
    println(examsFunc())
}


fun examsFunc ()
{
    val exams = listOf("Русский", "Музыка", "Технология")

    println("Введите имя: ")
    val student = readln()

    exams.forEach { exam ->
        val grade = (0..10).random()
        println("$student сдал $exam на следующий балл: $grade")
        if (grade >=6)
            println("Студент хорошо подготовился к экзамену следующей дисциплины: $exam ")
        else
            println("Студент плохо подготовился к этому экзамену.")
    }

}