import javax.swing.JOptionPane

fun main(args: Array<String>) {
    
    //añadimos Xogador,Adestrador, Masaxista y Plantilla
    val obx = Plantilla("Manuel", "Garcia Roo", 30, 32)
    val obxX = Xogador("Martín", "Perez Lorenzo", 6, 24, 10, "Delantero")
    val obxB = Adestrador("Federico", "Martinez Urgal", 45, 57, "3456")
    val obxM = Masaxista("Matías", "Fernandez Vázquez", 65, 46, 22, "Técnico")

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
