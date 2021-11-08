class Calculadora {
    fun soma (num1: Int, num2: Int): Int{
        return num1 + num2
    }

    fun subtracao (num1: Int, num2: Int): Int{
        return num1 - num2
    }

    fun multiplicacao (num1: Int, num2: Int): Int{
        return num1 * num2
    }

    fun divisao (num1: Int, num2: Int): Int{
        return num1 / num2
    }


    fun potencia (num1: Int, num2: Int): Double{
        return Math.pow(num1.toDouble(), num2.toDouble())
    }


    fun raizquadrada (num1: Int, num2: Int): Double{
    return Math.sqrt(num1.toDouble())
    }
}