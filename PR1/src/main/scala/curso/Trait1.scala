/* Un trait es un conjunto de comportamientos que se pueden agregar a las clases, por ejemplo habilidades de idiomas: hablar en español, ingles, frances, japones etc. O Autenticaciónes y sus tipos*/

// 1. Para crearlo clic en new -> scalaclass -> trait

package curso

//2. Definir el tipo de trait(No tiene constructores ni inicializadores)
trait TipoDeAutenticacion {
  def verificarToken(token: String): Boolean

}


class AutenticacionJWT extends TipoDeAutenticacion {
  def verificarToken (token: String): Boolean = {
    true
  }
}

object Main {
  def main(args: Array[String]): Unit = {

    val token: String = "tehbndsinsgsgupoiojtreaknsgfj6783ij37uh"


    val autenticacion = new AutenticacionJWT()
    val resultado: Boolean = autenticacion.verificarToken(token)
    if(resultado){
      println("Hay un token, puedes hacer login")
    } else {
      println("No hay token, no puedes hacer login")
    }
  }
}