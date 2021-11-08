import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


internal class CalculadoraTest {

    val calculadora = Calculadora()
    @Test
    fun soma() {
        assertEquals(6, calculadora.soma(3, 3))
    }

    @Test
    fun subtracao() {
        assertEquals(2, calculadora.subtracao(5,2))
    }

    @Test
    fun multiplicacao() {
        assertEquals(10, calculadora.multiplicacao(2,5))
    }

    @Test
    fun divisao() {
        assertEquals(20, calculadora.divisao(40,2))
    }

    @Test
    fun potencia() {
        assertEquals(36, calculadora.potencia(6, 2))
    }

    @Test
    fun raizquadrada() {
        assertEquals(9.0, calculadora.raizquadrada(81,2))
    }
}