package ProySegundoParcial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author scume
 */
public class PantallaPrincipal extends JFrame implements ActionListener {
  private JMenuBar mb;
  
  private JMenu menu1;
  
  private JMenu menu2;
  
  private JMenuItem miVacaciones;
  
  private JMenuItem mi1;
  
  private JMenuItem miNuevo;
  
  private JLabel label1;
  
  private JLabel label2;
  
  private JLabel labelTitle;
  
  private JLabel label3;
  
  private JLabel labelApellidos;
  
  private JLabel labelDepartamento;
  
  private JLabel labelAntiguedad;
  
  private JLabel labelResultado;
  
  private JLabel labelfooter;
  
  private JTextField txtNombreTrabajador;
  
  private JTextField txtApellidosTrabajador;

  private JComboBox comboDepartamento;
  
  private JComboBox comboAntiguedad;
  
  private JScrollPane scrollpane1;
  
  private JTextArea textarea1;
  
  String nombreAdministrador = "";
  
  public PantallaPrincipal() {
    setLayout((LayoutManager)null);
    setDefaultCloseOperation(3);
    setTitle("Pantalla principal");
    setIconImage((new ImageIcon("C:\\Users\\scume\\Downloads\\logo2.png")).getImage());
    getContentPane().setBackground(new Color(12, 183, 242));
    this.nombreAdministrador = PantallaBienvenida.texto;
    this.mb = new JMenuBar();
    this.mb.setBackground(new Color(0, 0, 255));
    setJMenuBar(this.mb);
    this.menu1 = new JMenu("Opciones");
    this.menu1.setBackground(new Color(0, 0, 0));
    this.menu1.setFont(new Font("Arial", 1, 14));
    this.menu1.setForeground(new Color(255, 255, 255));
    this.mb.add(this.menu1);
    this.menu2 = new JMenu("Calcular");
    this.menu2.setBackground(new Color(0, 0, 0));
    this.menu2.setFont(new Font("Arial", 1, 14));
    this.menu2.setForeground(new Color(255, 255, 255));
    this.mb.add(this.menu2);
    this.miVacaciones = new JMenuItem("Vacaciones");
    this.miVacaciones.setFont(new Font("Arial", 1, 14));
    this.miVacaciones.setForeground(new Color(0, 0, 0));
    this.menu2.add(this.miVacaciones);
    this.miVacaciones.addActionListener(this);
    this.miNuevo = new JMenuItem("Nuevo");
    this.miNuevo.setFont(new Font("Arial", 1, 14));
    this.miNuevo.setForeground(new Color(0, 0, 0));
    this.menu1.add(this.miNuevo);
    this.miNuevo.addActionListener(this);
    this.mi1 = new JMenuItem("Salir");
    this.mi1.setFont(new Font("Arial", 1, 14));
    this.mi1.setForeground(new Color(0, 0, 0));
    this.menu1.add(this.mi1);
    this.mi1.addActionListener(this);
    ImageIcon imageIcon = new ImageIcon("C:\\Users\\scume\\Downloads\\logo2.png");
    Image image = imageIcon.getImage();
    Image scaledImage = image.getScaledInstance(150, 150, Image.SCALE_SMOOTH); 
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    JLabel jLabel1 = new JLabel(scaledIcon);
    jLabel1.setBounds(100, 15, 150, 150);
    add(jLabel1);
    this.label2 = new JLabel("Bienvenido " + this.nombreAdministrador);
    this.label2.setBounds(280, 30, 300, 50);
    this.label2.setFont(new Font("Arial", 1, 32));
    this.label2.setForeground(new Color(255, 255, 255));
    add(this.label2);
    this.labelTitle = new JLabel("Datos para el calculo de vacaciones");
    this.labelTitle.setBounds(275, 110, 800, 25);
    this.labelTitle.setFont(new Font("Arial", 0, 24));
    this.labelTitle.setForeground(new Color(255, 255, 255));
    add(this.labelTitle);
    this.label3 = new JLabel("Nombres:");
    this.label3.setBounds(45, 200, 180, 25);
    this.label3.setFont(new Font("Arial", 1, 12));
    this.label3.setForeground(new Color(255, 255, 255));
    add(this.label3);
    this.txtNombreTrabajador = new JTextField();
    this.txtNombreTrabajador.setBounds(150, 200, 300, 30);
    this.txtNombreTrabajador.setBackground(new Color(255, 255, 255));
    this.txtNombreTrabajador.setFont(new Font("Arial", 1, 18));
    this.txtNombreTrabajador.setForeground(new Color(0, 0, 0));
    add(this.txtNombreTrabajador);
    this.labelApellidos = new JLabel("Apellidos:");
    this.labelApellidos.setBounds(45, 245, 180, 25);
    this.labelApellidos.setFont(new Font("Arial", 1, 12));
    this.labelApellidos.setForeground(new Color(255, 255, 255));
    add(this.labelApellidos);
    this.txtApellidosTrabajador = new JTextField();
    this.txtApellidosTrabajador.setBounds(150, 245, 300, 30);
    this.txtApellidosTrabajador.setBackground(new Color(255, 255, 255));
    this.txtApellidosTrabajador.setFont(new Font("Arial", 1, 18));
    this.txtApellidosTrabajador.setForeground(new Color(0, 0, 0));
    add(this.txtApellidosTrabajador);
    this.labelDepartamento = new JLabel("Selecciona el Departamento:");
    this.labelDepartamento.setBounds(45, 300, 180, 25);
    this.labelDepartamento.setFont(new Font("Arial", 1, 12));
    this.labelDepartamento.setForeground(new Color(255, 255, 255));
    add(this.labelDepartamento);
    this.comboDepartamento = new JComboBox();
    this.comboDepartamento.setBounds(45, 330, 220, 25);
    this.comboDepartamento.setBackground(new Color(255, 255, 255));
    this.comboDepartamento.setFont(new Font("Arial", 1, 14));
    this.comboDepartamento.setForeground(new Color(0, 0, 0));
    add(this.comboDepartamento);
    this.comboDepartamento.addItem("");
    this.comboDepartamento.addItem("Atencion al Cliente");
    this.comboDepartamento.addItem("Logistica");
    this.comboDepartamento.addItem("Gerencia");
    this.labelAntiguedad = new JLabel("Selecciona la Antiguedad");
    this.labelAntiguedad.setBounds(45, 370, 180, 25);
    this.labelAntiguedad.setFont(new Font("Arial", 1, 12));
    this.labelAntiguedad.setForeground(new Color(255, 255, 255));
    add(this.labelAntiguedad);
    this.comboAntiguedad = new JComboBox();
    this.comboAntiguedad.setBounds(45, 400, 220, 25);
    this.comboAntiguedad.setBackground(new Color(255, 255, 255));
    this.comboAntiguedad.setFont(new Font("Arial", 1, 14));
    this.comboAntiguedad.setForeground(new Color(0, 0, 0));
    add(this.comboAntiguedad);
    this.comboAntiguedad.addItem("");
    this.comboAntiguedad.addItem("1 año de servicio");
    this.comboAntiguedad.addItem("2 a 6 años de servicio");
    this.comboAntiguedad.addItem("7 o mas años de servicio");
    this.labelResultado = new JLabel("Resultado del Calculo");
    this.labelResultado.setBounds(420, 300, 180, 25);
    this.labelResultado.setFont(new Font("Arial", 1, 16));
    this.labelResultado.setForeground(new Color(255, 255, 255));
    add(this.labelResultado);
    this.textarea1 = new JTextArea();
    this.textarea1.setEditable(false);
    this.textarea1.setBackground(new Color(255, 255, 255));
    this.textarea1.setFont(new Font("Arial", 1, 16));
    this.textarea1.setForeground(new Color(0, 0, 0));
    this.textarea1.setText("");
    this.scrollpane1 = new JScrollPane(this.textarea1);
    this.scrollpane1.setBounds(290, 330, 450, 150);
    add(this.scrollpane1);
    this.labelfooter = new JLabel("Farmacia Bethesda© -- Sergio Cumez -- Programacion II -- Seccion B");
    this.labelfooter.setBounds(175, 505, 500, 30);
    this.labelfooter.setFont(new Font("Arial", 1, 14));
    this.labelfooter.setForeground(new Color(255, 255, 255));
    add(this.labelfooter);
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() == this.miVacaciones) {
      String str1 = this.txtNombreTrabajador.getText();
      String str2 = this.txtApellidosTrabajador.getText();
      String str3 = this.comboDepartamento.getSelectedItem().toString();
      String str4 = this.comboAntiguedad.getSelectedItem().toString();
      if (str1.equals("") || str2.equals("") || str3.equals("") || str4.equals("")) {
        JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
      } else {
        if (str3.equals("Atencion al Cliente")) {
          if (str4.equals("1 año de servicio"))
            this.textarea1.setText("\n   El trabajador " + str1 + " " + str2 +  "\n   quien labora en " + str3 + " con " + str4 + "\n   recibe 6 dias de vacaciones."); 
          if (str4.equals("2 a 6 años de servicio"))
            this.textarea1.setText("\n   El trabajador " + str1 + " " + str2 +  "\n   quien labora en " + str3 + " con " + str4 + "\n   recibe 14 dias de vacaciones."); 
          if (str4.equals("7 o mas años de servicio"))
            this.textarea1.setText("\n   El trabajador " + str1 + " " + str2 + "\n   quien labora en " + str3 + " con " + str4 + "\n   recibe 20 dias de vacaciones."); 
        } 
        if (str3.equals("Logistica")) {
          if (str4.equals("1 año de servicio"))
            this.textarea1.setText("\n   El trabajador " + str1 + " " + str2 + "\n   quien labora en " + str3 + " con " + str4 + "\n   recibe 7 dias de vacaciones."); 
          if (str4.equals("2 a 6 años de servicio"))
            this.textarea1.setText("\n   El trabajador " + str1 + " " + str2 + "\n   quien labora en " + str3 + " con " + str4 + "\n   recibe 15 dias de vacaciones."); 
          if (str4.equals("7 o mas años de servicio"))
            this.textarea1.setText("\n   El trabajador " + str1 + " " + str2 + "\n   quien labora en " + str3 + " con " + str4 + "\n   recibe 22 dias de vacaciones."); 
        } 
        if (str3.equals("Gerencia")) {
          if (str4.equals("1 año de servicio"))
            this.textarea1.setText("\n   El trabajador " + str1 + " " + str2 + "\n   quien labora en " + str3 + " con " + str4 + "\n   recibe 10 dias de vacaciones."); 
          if (str4.equals("2 a 6 años de servicio"))
            this.textarea1.setText("\n   El trabajador " + str1 + " " + str2 + "\n   quien labora en " + str3 + " con " + str4 + "\n   recibe 20 dias de vacaciones."); 
          if (str4.equals("7 o mas años de servicio"))
            this.textarea1.setText("\n   El trabajador " + str1 + " " + str2 + "\n   quien labora en " + str3 + " con " + str4 + "\n   recibe 30 dias de vacaciones."); 
        } 
      } 
    } 

    if (paramActionEvent.getSource() == this.miNuevo) {
      this.txtNombreTrabajador.setText("");
      this.txtApellidosTrabajador.setText("");
      this.comboDepartamento.setSelectedIndex(0);
      this.comboAntiguedad.setSelectedIndex(0);
      this.textarea1.setText("\n   ");
    } 
    if (paramActionEvent.getSource() == this.mi1) {
      PantallaBienvenida bienvenida = new PantallaBienvenida();
      bienvenida.setBounds(0, 0, 800, 600);
      bienvenida.setVisible(true);
      bienvenida.setResizable(false);
      bienvenida.setLocationRelativeTo((Component)null);
      setVisible(false);
    } 
  }
  
  public static void main(String[] paramArrayOfString) {
    PantallaBienvenida principal = new PantallaBienvenida();
    principal.setBounds(0, 0, 800, 600);
    principal.setVisible(true);
    principal.setResizable(false);
    principal.setLocationRelativeTo((Component)null);
  }
}