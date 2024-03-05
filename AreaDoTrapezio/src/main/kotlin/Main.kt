package funcoes

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun areaTrapezio(baseMaior: Int, baseMenor: Int, altura: Int): Int {
    return ((baseMaior + baseMenor) * altura) / 2
}

fun main() {
    val baseMaior = 10
    val baseMenor = 6
    val altura = 4
    val area = areaTrapezio(baseMaior, baseMenor, altura)
    println("A área do trapézio com bases $baseMaior e $baseMenor e altura $altura é: $area")
}
