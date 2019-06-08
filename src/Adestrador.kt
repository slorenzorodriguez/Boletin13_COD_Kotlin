import javax.swing.JOptionPane

class Adestrador(nome: String, apelidos: String, id: Int, edad: Int, var idFederacion: String?) :
    Plantilla(nome, apelidos, id, edad) {

    private fun dirixirPartido() {} //método de la clase
        
    private fun dirixirAdestramento() {} //método de la clase
        
    override fun viaxar() {
        //método heredado de Plantilla
        JOptionPane.showMessageDialog(null, "Viaxa o entrenador: " + super.nome!!)
    }

    override fun toString(): String {
         //método toString que imprime las variables heredadas de la superclase Plantilla y las variables propias
        return "Ficha do adestrador: \n" + super.toString() + "\nIdFederacion = " + idFederacion
    }

}
