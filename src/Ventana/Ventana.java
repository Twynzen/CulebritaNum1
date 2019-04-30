package Ventana;


import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
    public JPanel panel;
    public JLabel etiqueta, respuesta;
    public JTextField caja;
    public JButton boton1;
    public JTextArea areaTexto;
    
    
    public Ventana() { //Constructor //Se revisa la api para ver bien como funcionan los metodos
        this.setSize(500, 500);//Esto establece el tamaño de la ventana
         setTitle("Titulo de ventana"); // Establrece e titulo de la ventana
        //Metodo para cerrar la ventana y que se termine el programa
         
         
         setLocationRelativeTo(null);//Al usar este por defecto ejecuta la ventana en el centro
         
        //setLocation(700,300);//por medio de plano cartesiano ubica la aparición de la ventana
        
        //setBounds(700,300,500,500);//Establece la posicion de apareicion y el tamaño de la ventana
       
        iniciarComponentes();
        
        //this.getContentPane().setBackground(Color.blue); // color de ventana    

       setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        //colocarEtiquetas();
        //colocarBotones();

    }
    
       private void colocarPaneles(){
        panel = new JPanel();   //Creacion de un panel
        //panel.setBackground(Color.BLUE); // color del panel
        panel.setLayout(null); //Desactivando el diseño por defecto
        this.getContentPane().add(panel);//Se coloca el panel sobre la ventana
         
    }
}

  