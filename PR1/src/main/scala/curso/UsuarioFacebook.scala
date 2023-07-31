package curso

 class UsuarioFacebook () {

   private var nombre: String = _
   private var correo: String = _
   private var fotoPerfil: String = _
   private var edad: Int = _
   private var genero: String = _
   private var ubicacion: String = _
   private var intereses: String = _

   def imprimir(): Unit = {
     println(s"Tu API Facebook Registro correctamente a $nombre, con email $correo, su foto es pefil es $fotoPerfil, con edad de $edad, genero $genero, con ubicación en $ubicacion y con intereses en $intereses")
   }

   // Constructor auxiliar para autenticarse en otras plataformas
   def this(nombre: String, correo: String, fotoPerfil: String) = {
     this()
     this.nombre = nombre
     this.correo = correo
     this.fotoPerfil = fotoPerfil
   }

   // Constructor auxiliar para compartir con plataformas de marketing
   def this(fotoPerfil: String, edad: Int, genero: String, ubicacion: String, intereses: String) = {
     this()
     this.fotoPerfil = fotoPerfil
     this.edad = edad
     this.ubicacion = ubicacion
     this.intereses = intereses
     this.genero = genero
   }
}

object ApisUsuarios {
  def main (args: Array[String]): Unit = {
    // instancias de Usuario con diferentes constructores
    val usuarioCompleto = new UsuarioFacebook()


    // Instancia de login
    val usuarioLogin =  new UsuarioFacebook(nombre = "Arely", correo = "arely@gmail", fotoPerfil = "arely.jpg")
    usuarioLogin.imprimir() // Tendriamos acceso a los datos exclusivos para login


    // Instancia para marketing
    val usuarioMarketing = new UsuarioFacebook(fotoPerfil = "arely.jpg", edad = 20, genero = "Femenino", ubicacion = "Mexico", intereses = "Redes Sociales")
    usuarioMarketing.imprimir()

    //val usuarioCompleto = new UsuarioFacebook(n)
  }
}
