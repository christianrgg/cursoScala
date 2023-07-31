package curso

class Calculadora(val precisionDecimal: Int) {
  // Constructor auxiliar 1 para operación de suma
  def this(precisionDecimal: Int, a: Double, b: Double) = {
    this(precisionDecimal)
    println(s"El resultado de la suma es: ${sumar(a, b)}")
  }

  // Constructor auxiliar 2 para operación de resta
  def this(precisionDecimal: Int, a: Double, b: Double, mostrarResultado: Boolean) = {
    this(precisionDecimal)
    if (mostrarResultado) {
      println(s"El resultado de la resta es: ${restar(a, b)}")
    }
  }

  // Método para redondear el resultado a la precisión deseada
  private def roundToPrecision(value: Double): Double = {
    val factor = Math.pow(10, precisionDecimal)
    (value * factor).round / factor
  }

  // Métodos de operaciones
  def sumar(a: Double, b: Double): Double = roundToPrecision(a + b)
  def restar(a: Double, b: Double): Double = roundToPrecision(a - b)
}

// Extensión para redondear un Double con precisión decimal
object DoubleExtensions {
  implicit class DoubleExtensions(d: Double) {
    def roundToPrecision(precision: Int): Double = {
      BigDecimal(d).setScale(precision, BigDecimal.RoundingMode.HALF_UP).toDouble
    }
  }
}

object CalculadoraFunciona {
  import DoubleExtensions._

  def main(args: Array[String]): Unit = {
    // Crear instancias de la clase Calculadora usando diferentes constructores
    val calculadoraSuma = new Calculadora(2, 5.25, 3.8)
    val calculadoraResta = new Calculadora(3, 10.5, 7.2, mostrarResultado = true)
  }
}
