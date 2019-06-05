import javax.swing.JOptionPane

fun main(args: Array<String>) {
    val obx = Plantilla("Manuel", "Garcia Roo", 30, 32)
    val obxX = Xogador("Martín", "Perez Lorenzo", 6, 24, 10, "Delantero")
    val obxB = Adestrador("Federico", "Martinez Urgal", 45, 57, "3456")
    val obxM = Masaxista("Matías", "Fernandez Vázquez", 65, 46, 22, "Técnico")

    obx.concentrarse()
    obx.viaxar()
    JOptionPane.showMessageDialog(null, obx.toString())
    obxX.viaxar()
    JOptionPane.showMessageDialog(null, obxX.toString())
    obxB.viaxar()
    JOptionPane.showMessageDialog(null, obxB.toString())
    obxM.viaxar()
    JOptionPane.showMessageDialog(null, obxM.toString())
}