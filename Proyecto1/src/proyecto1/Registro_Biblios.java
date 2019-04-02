
package proyecto1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Registro_Biblios extends JDialog implements ActionListener{
    JPanel pri;
    JComboBox<String> opciones;
    JLabel tipo;
    
    
    public Registro_Biblios(){
        
        
        pri=new JPanel();
        pri.setSize(700,500);
        pri.setVisible(true);
        pri.setLayout(null);
        
        tipo=new JLabel();
        tipo.setBounds(20,20,50,40);
        tipo.setFont(new java.awt.Font("Perpetua", 1, 13));
        tipo.setText("Tipo");
        
        opciones=new JComboBox<String>();
        opciones.setBounds(100,20,100,40);
        opciones.setFont(new java.awt.Font("Perpetua", 1, 13));
        opciones.addItem("Seleccione");
        opciones.addItem("Libro");
        opciones.addItem("Revista");
        opciones.addItem("Tesi");
        opciones.setSelectedIndex(0);
        
        pri.add(tipo);
        pri.add(opciones);
        add(pri);
        
        setResizable(false);
        setTitle("Registro");
        setBounds(100,100,700,500);
        setVisible(true);
}
  
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
