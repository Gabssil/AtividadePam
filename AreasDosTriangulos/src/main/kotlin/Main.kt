package funcoes

// Função para calcular a área de um triângulo com base e altura
fun areaTriangulo(base: Int, altura: Int): Double {
    return (base * altura) / 2.0
}

// Função para calcular a área de um triângulo equilátero com base no lado
fun areaTrianguloEquilatero(lado: Int): Double {
    // Fórmula para calcular a área de um triângulo equilátero
    return (lado * lado * Math.sqrt(3.0)) / 4.0
}

// Função para calcular a área de um triângulo isósceles com base e um lado
fun areaTrianguloIsosceles(base: Int, lado: Int): Double {
    // Calcula a altura do triângulo isósceles usando o teorema de Pitágoras
    val altura = Math.sqrt((lado * lado) - ((base / 2) * (base / 2)).toDouble())
    // Retorna a área do triângulo isósceles usando a fórmula padrão
    return (base * altura) / 2.0
}

// Função para calcular a área de um triângulo escaleno com base e dois lados
fun areaTrianguloEscaleno(base: Int, lado1: Int, lado2: Int): Double {
    // Calcula o semiperímetro do triângulo
    val s = (base + lado1 + lado2) / 2.0
    // Retorna a área do triângulo escaleno usando a fórmula de Heron
    return Math.sqrt(s * (s - base) * (s - lado1) * (s - lado2))
}

fun main() {
    // Definição dos valores para os parâmetros dos triângulos
    val base = 6
    val altura = 4
    val ladoEquilatero = 5
    val baseIsosceles = 6
    val ladoIsosceles = 7
    val baseEscaleno = 7
    val lado1Escaleno = 9
    val lado2Escaleno = 10

    // Impressão das áreas dos triângulos usando as funções correspondentes
    println("Área do triângulo com base $base e altura $altura é: ${areaTriangulo(base, altura)}")
    println("Área do triângulo equilátero com lado $ladoEquilatero é: ${areaTrianguloEquilatero(ladoEquilatero)}")
    println("Área do triângulo isósceles com base $baseIsosceles e lado $ladoIsosceles é: ${areaTrianguloIsosceles(baseIsosceles, ladoIsosceles)}")
    println("Área do triângulo escaleno com base $baseEscaleno, lado 1 $lado1Escaleno e lado 2 $lado2Escaleno é: ${areaTrianguloEscaleno(baseEscaleno, lado1Escaleno, lado2Escaleno)}")
}
