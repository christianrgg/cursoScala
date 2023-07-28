package curso

// Plantilla "Ejemp: Jugador" que define la estructura y comportamiento de un objeto.
class Alumno (nombre:String, apellidos:String)

object Principal {
  def main(args: Array[String]): Unit = {
    var alumno1 = new Alumno("Norma", "Gutierrez")
    print(alumno1)
    //Lo anterior imprimira un id
  }
}