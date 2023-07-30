package curso

// Paso 1: Definir la clase (Plano arquitectónico)
class Casa(var numeroHabitaciones: Int, var tieneJardin: Boolean) {
  // Aquí podemos definir métodos y comportamientos adicionales de la casa
  // ...
}

object Main {
  def main(args: Array[String]): Unit = {
    // Paso 2: Crear un objeto (Instanciar la casa)
    val miCasa = new Casa(4, true)
    // Ahora, miCasa es una instancia de la clase Casa, es decir, una casa con 4 habitaciones y un jardín.

    // Podemos acceder a los atributos de la casa:
    println(miCasa.numeroHabitaciones) // Imprimirá 4
    println(miCasa.tieneJardin) // Imprimirá true
  }
}








