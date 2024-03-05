package funcoes

fun areaCircunferencia(raio: Int): Double {
    val pi = 3.14159 // Valor aproximado de PI
    return pi * raio * raio
}

fun main() {
    val raio = 4
    val area = areaCircunferencia(raio)
    println("A área da circunferência com raio $raio é: $area")
}
