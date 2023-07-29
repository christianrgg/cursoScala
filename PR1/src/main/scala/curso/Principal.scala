package curso

 class Alumno (nombre:String, apellidos:String){
  // Propiedades en las clases, inicializarla por el valor por defecto que tuviera con guin bajo se hace.
  var edad: Int = _

  //Metodos para hacer funcionar la clase
  def visualizar():Unit = {
    println(nombre)
    println(apellidos)
    println(edad)
  }
}

object Principal {
  def main(args: Array[String]): Unit = {
    var alumno1 = new Alumno("Norma", "Gutierrez")
    print(alumno1)
    println(alumno1.toString)
    //Dar valor a propiedad edad
    alumno1.edad=10
    //Imprimir edad
    println(alumno1.edad)
    alumno1.visualizar()
  }
}