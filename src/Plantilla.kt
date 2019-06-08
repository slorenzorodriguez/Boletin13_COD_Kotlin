import javax.swing.JOptionPane

open class Plantilla(var nome: String?, var apelidos: String?, var id: Int, var edad: Int) {
  /*Le damos los valores por defecto para que el programa no de error al dejar campos en blanco; vamos a crear un
    objeto de esta clase sin que sea imprescindible asignarle valores a ninguna variable. Aconsejable asignarle al
    String un valor inicial de comillas en blanco, en vez de null. */

     //constructor por defecto
    init {}
    
  
    //método propio de la clase
    fun concentrarse() {
        JOptionPane.showMessageDialog(null, "Concéntrase a Selección.")
    }
    //método propio de la clase y que se extenderá a las subclases que hereden de esta ("open")
    open fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa a Selección.")
    }
    
    override fun toString(): String {
        return "Nome = $nome\nApelidos = $apelidos\nId = $id\nEdad = $edad"
    }

}
