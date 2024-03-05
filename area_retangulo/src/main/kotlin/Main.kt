package funcoes

fun calcularAreaRetangulo(comprimento: Int, largura: Int): Int {
    return comprimento * largura
}

fun main() {
    val comprimento = 4
    val largura = 5
    val area = calcularAreaRetangulo(comprimento, largura)
    println("A área do retângulo é: $area")
}


