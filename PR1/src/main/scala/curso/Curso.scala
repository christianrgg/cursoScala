package curso

class Persona (private var nombre: String, private var edad: Int, protected var email: String) {
  def imprimirDatos(): Unit = {
    println(s"Nombre: $nombre, Edad: $edad, Email: $email ")
  }

  def cumplirAnios(): Unit = {
    edad += 1
    println(s"Feliz cumpleaños! Ahora tienes $edad años.")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val persona = new Persona("Juan", 30, "juan@example.com")
    persona.imprimirDatos()

    persona.cumplirAnios()

  }
}
