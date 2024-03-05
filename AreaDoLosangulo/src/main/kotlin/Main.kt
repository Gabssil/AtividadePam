package funcoes

fun areaLosango(diagonalMaior: Int, diagonalMenor: Int): Int {
    return (diagonalMaior * diagonalMenor) / 2
}

fun main() {
    val diagonalMaior = 10
    val diagonalMenor = 10
    val area = areaLosango(diagonalMaior, diagonalMenor)
    println("A área do losango com diagonais $diagonalMaior e $diagonalMenor é: $area")
}
