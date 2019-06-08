import javax.swing.JOptionPane


class Xogador(nome: String, apelidos: String, id: Int, edad: Int, var dorsal: Int, var demarcacion: String?) :
    Plantilla(nome, apelidos, id, edad) {

    private fun xogarPartido() {} //método propio de la clase
        
    private fun entrenar() {} //método propio de la clase
        
    override fun viaxar() { //método heredado de Seleccion
        JOptionPane.showMessageDialog(null, "Viaxan os xogadores: " + super.nome!!)
    }

    override fun toString(): String {
        //método toString que imprime las variables propias y heredadas de la superclase Plantilla
        return "Ficha do xogador: \n" + super.toString() + "\nDorsal = " + dorsal + "\nDemarcacion = " + demarcacion
    }

}
