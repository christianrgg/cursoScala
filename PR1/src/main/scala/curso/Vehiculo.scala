package curso

class Jetta {
  // Definir las propiedades
  var modeloJetta: String = _
  var tipo: String = _
  var noPuertas: Number =_
  var potencia: Number =_
  var transmision: String =_

  // definir metodo
  def mostrarCaracteristicas (): Unit = {
    println(s"El Jetta $modeloJetta es un $tipo con $noPuertas puertas, $potencia caballos de fuerza y viene con transmision $transmision.")
  }
}

  class modelo extends Jetta {
    //Definir propiedad de la subclase

    var equipamiento: String = _

    def caracteriticaseDeModelo(): Unit = {
      println(s"Cuenta con $equipamiento")
    }
}

object Principal {
  def main(args: Array[String]): Unit = {
    var JettaTSI = new modelo()

    JettaTSI.tipo = "Sedan"
    JettaTSI.noPuertas = 4
    JettaTSI.transmision = "Automatica o manual"
    JettaTSI.potencia = 150
    JettaTSI.modeloJetta = "Comfortline"
    JettaTSI.equipamiento = "Aire acondicionado, sistema de audio, conectividad, entre otros."
    JettaTSI.mostrarCaracteristicas()
    JettaTSI.caracteriticaseDeModelo()
  }
}


