import javax.swing.JOptionPane

fun main(args: Array<String>) {
    
    //añadimos Xogador,Adestrador, Masaxista y Plantilla
    val plant = Plantilla("Manuel", "Garcia Roo", 30, 32)
    val xoga = Xogador("Martín", "Perez Lorenzo", 6, 24, 10, "Delantero")
    val adestra = Adestrador("Federico", "Martinez Urgal", 45, 57, "3456")
    val masax = Masaxista("Matías", "Fernandez Vázquez", 65, 46, 22, "Técnico")

    plant.concentrarse()
    plant.viaxar()
    JOptionPane.showMessageDialog(null, plant.toString())
    xoga.viaxar()
    JOptionPane.showMessageDialog(null, xoga.toString())
    adestra.viaxar()
    JOptionPane.showMessageDialog(null, adestra.toString())
    masax.viaxar()
    JOptionPane.showMessageDialog(null, masax.toString())
}
