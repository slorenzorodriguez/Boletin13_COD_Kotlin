
import javax.swing.JOptionPane

class Masaxista(nome: String, apelidos: String, id: Int, edad: Int, var anosExperiencia: Int, var titulacion: String?) :
    Plantilla(nome, apelidos, id, edad) {

    override fun viaxar() {
        //método heredade de Plantilla
        JOptionPane.showMessageDialog(null, "Viaxa o masaxista: " + super.nome!!)
    }

    fun darMasaxes() {}
        //método de la clase

    override fun toString(): String {
        ////método toString que imprime las variables heredadas de la superclase Plantilla y las variables propias
        return "Datos masaxista: \n " + super.toString() + "\nAnosExperiencia = " + anosExperiencia + "\nTitulacion = " + titulacion
    }


}
