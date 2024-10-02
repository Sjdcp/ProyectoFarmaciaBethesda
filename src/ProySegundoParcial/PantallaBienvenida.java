package ProySegundoParcial;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author scume
 */
public class PantallaBienvenida extends JFrame implements ActionListener {
  private JTextField textfield1;
  
  private JLabel label1;
  
  private JButton boton1;
  
  public static String texto = "";
  
  public PantallaBienvenida() {
    setLayout((LayoutManager)null);
    setDefaultCloseOperation(3);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(12, 183, 242));
    setIconImage((new ImageIcon("C:\\Users\\scume\\Downloads\\logo2.png")).getImage());
    ImageIcon imageIcon = new ImageIcon("C:\\Users\\scume\\Downloads\\logo2.png");
    Image image = imageIcon.getImage();
    Image scaledImage = image.getScaledInstance(250, 250, Image.SCALE_SMOOTH); 
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    JLabel jLabel1 = new JLabel(scaledIcon);
    jLabel1.setBounds(275, 15, 250, 250);
    add(jLabel1);
    JLabel jLabel2 = new JLabel("Sistema de Control Vacacional");
    jLabel2.setBounds(225, 265, 350, 30);
    jLabel2.setFont(new Font("Arial", 3, 24));
    jLabel2.setForeground(new Color(255, 255, 255));
    add(jLabel2);
    this.label1 = new JLabel("Ingrese su nombre:");
    this.label1.setBounds(310, 295, 200, 30);
    this.label1.setFont(new Font("Arial", 1, 20));
    this.label1.setForeground(new Color(0, 0, 0));
    add(this.label1);
    this.textfield1 = new JTextField();
    this.textfield1.setBounds(275, 330, 250, 30);
    this.textfield1.setBackground(new Color(255, 255, 255));
    this.textfield1.setFont(new Font("Arial", 1, 20));
    this.textfield1.setForeground(new Color(0, 0, 0));
    add(this.textfield1);
    this.boton1 = new JButton("Ingresar");
    this.boton1.setBounds(325, 375, 150, 30);
    this.boton1.setBackground(new Color(255, 255, 255));
    this.boton1.setFont(new Font("Arial", 1, 20));
    this.boton1.setForeground(new Color(0, 0, 255));
    add(this.boton1);
    this.boton1.addActionListener(this);
    JLabel jLabel3 = new JLabel("Farmacia Bethesda© -- Sergio Cumez -- Programacion II -- Seccion B");
    jLabel3.setBounds(150, 500, 500, 30);
    jLabel3.setFont(new Font("Arial", 1, 14));
    jLabel3.setForeground(new Color(255, 255, 255));
    add(jLabel3);
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() == this.boton1) {
      texto = this.textfield1.getText().trim();
      if (texto.equals("")) {
        JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
      } else {
        TerminosyCondiciones TerminosyCondiciones = new TerminosyCondiciones();
        TerminosyCondiciones.setVisible(true);
        TerminosyCondiciones.setBounds(0, 0, 610, 370);
        TerminosyCondiciones.setResizable(false);
        TerminosyCondiciones.setLocationRelativeTo((Component)null);
        setVisible(false);
      } 
    } 
  }
  
  public static void main(String[] paramArrayOfString) {
    PantallaBienvenida bienvenida = new PantallaBienvenida();
    bienvenida.setBounds(0, 0, 800, 600);
    bienvenida.setVisible(true);
    bienvenida.setResizable(false);
    bienvenida.setLocationRelativeTo((Component)null);
  }
}