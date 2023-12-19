fun main() {
    val sizeOfTable = 9 //

    print("\t\t")
    for (i in 1..sizeOfTable) {
        print("$i\t")
    }
    println()

    for (i in 1..sizeOfTable) {
        print("$i \t| \t")
        for (j in 1..sizeOfTable) {
            print("${i * j}\t")
        }
        println()
    }
}