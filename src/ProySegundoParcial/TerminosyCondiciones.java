package ProySegundoParcial;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author scume
 */
public class TerminosyCondiciones extends JFrame implements ActionListener, ChangeListener {
  private JLabel label1;
  
  private JCheckBox check1;
  
  private JButton boton1;
  
  private JButton boton2;
  
  private JScrollPane scrollpane1;
  
  private JTextArea textarea1;
  
  String nombre = "";
  
  public TerminosyCondiciones() {
    setLayout((LayoutManager)null);
    setDefaultCloseOperation(3);
    setTitle("Terminos de uso");
    getContentPane().setBackground(new Color(12, 183, 242));
    setIconImage((new ImageIcon("C:\\Users\\scume\\Downloads\\logo2.png")).getImage());
    PantallaBienvenida bienvenida = new PantallaBienvenida();
    this.nombre = PantallaBienvenida.texto;
    this.label1 = new JLabel("Terminos y Condiciones");
    this.label1.setBounds(150, 5, 400, 30);
    this.label1.setFont(new Font("Arial", 1, 24));
    this.label1.setForeground(new Color(0, 0, 0));
    add(this.label1);
    this.textarea1 = new JTextArea();
    this.textarea1.setEditable(false);
    this.textarea1.setFont(new Font("Arial", 0, 12));
    this.textarea1.setText("\n         Terminos y Condiciones    "
            + "\n\n            1.Prohibida su distribucion sin autorizacion      "
            + "\n\n            2.Prohibida la alteracion del programa   "
            + "\n\n\n         Al aceptar estos terminos, me hago responsable de la forma en que sea utilizado este programa"
            + "\n\n         Si no esta de acuerdo con estos terminos y condiciones click en el boton (No Acepto).");
    this.scrollpane1 = new JScrollPane(this.textarea1);
    this.scrollpane1.setBounds(10, 40, 575, 200);
    add(this.scrollpane1);
    this.check1 = new JCheckBox("Yo " + this.nombre + " Acepto");
    this.check1.setBounds(10, 250, 300, 30);
    this.check1.setBackground(new Color(12, 183, 242));
    this.check1.addChangeListener(this);
    add(this.check1);
    this.boton1 = new JButton("Continuar");
    this.boton1.setBounds(10, 290, 100, 30);
    add(this.boton1);
    this.boton1.addActionListener(this);
    this.boton1.setEnabled(false);
    this.boton2 = new JButton("No Acepto");
    this.boton2.setBounds(120, 290, 100, 30);
    add(this.boton2);
    this.boton2.addActionListener(this);
    this.boton2.setEnabled(true);
    ImageIcon imageIcon = new ImageIcon("C:\\Users\\scume\\Downloads\\logo2.png");
    Image image = imageIcon.getImage();
    Image scaledImage = image.getScaledInstance(35, 35, Image.SCALE_SMOOTH); 
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    JLabel jLabel = new JLabel(scaledIcon);
    jLabel.setBounds(100, 4, 35, 35);
    add(jLabel);
  }
  
  @Override
  public void stateChanged(ChangeEvent paramChangeEvent) {
    if (this.check1.isSelected() == true) {
      this.boton1.setEnabled(true);
      this.boton2.setEnabled(false);
    } else {
      this.boton1.setEnabled(false);
      this.boton2.setEnabled(true);
    } 
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() == this.boton1) {
      PantallaPrincipal principal = new PantallaPrincipal();
      principal.setVisible(true);
      principal.setBounds(0, 0, 800, 600);
      principal.setResizable(false);
      principal.setLocationRelativeTo((Component)null);
      setVisible(false);
    } else if (paramActionEvent.getSource() == this.boton2) {
      PantallaBienvenida bienvenida = new PantallaBienvenida();
      bienvenida.setBounds(0, 0, 800, 600);
      bienvenida.setVisible(true);
      bienvenida.setResizable(false);
      bienvenida.setLocationRelativeTo((Component)null);
      setVisible(false);
    } 
  }
  
  public static void main(String[] paramArrayOfString) {
    TerminosyCondiciones licencia = new TerminosyCondiciones();
    licencia.setBounds(0, 0, 800, 600);
    licencia.setVisible(true);
    licencia.setResizable(false);
    licencia.setLocationRelativeTo((Component)null);
  }}  
  
