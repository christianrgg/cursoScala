package curso

object SimpleSingleton {
  // Creamos una variable para mantener el estado del contador
  private var counter: Int = 0

  // Método para obtener la instancia única del Singleton
  def getInstance(): SimpleSingleton.type = {
    // Incrementamos el contador cada vez que se llama a este método
    counter += 1
    // Devolvemos la instancia única del Singleton
    SimpleSingleton
  }

  // Método para obtener el valor actual del contador
  def getCounter: Int = counter
}

object Singleton {
  def main(args: Array[String]): Unit = {
    // Obtenemos la instancia del Singleton
    val instance1 = SimpleSingleton.getInstance()
    val instance2 = SimpleSingleton.getInstance()
    val instance3 = SimpleSingleton.getInstance()

    // Imprimimos el valor del contador para ver cuántas veces se creó una instancia
    println("Contador: " + SimpleSingleton.getCounter) // Debería imprimir 3, ya que se han creado 3 instancias
  }
}