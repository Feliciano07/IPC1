package proyecto1;
import javax.swing.*;
public class Boton extends JButton  {
    //CARGA MASIVA 
    JButton acepCar;
    JButton atras;
    
    
    //PRINCIPAL
    JButton login;
    JButton acerca;
    //LOGIN
    JButton ingresar;
    JButton cancelar;
    JButton aceptar;
    //ADMINISTRADOR
    JButton logout;
    JButton Reportes;
    
    //USUARIOS
    JButton crear;
    JButton modificar;
    JButton eliminar;
    
    //Mostrar
    JButton mostrar;
    JButton ascendent;
    JButton descendent;
    
    //MODIFICAR
    JButton buscarU;
    JButton cancelarU;
    JButton guardar;
    JButton anular;
    
    //ELIMINAR
    JButton buscar1;
    JButton anular1;
    JButton guardar1;
    
    //BIBLIOGRAFIAS
    JButton crearb;
    JButton modificarb;
    JButton eliminarb;
    JButton mostrarb;
    
    
    
    //REGISTRO_USUARIO
    JButton aceptar1;
    
    
    //REGISTRO BIBLIOS
    JButton acepLibro;
    JButton canLibro;
    JButton acepRevi;
    JButton canRevi;
    JButton acepTesi;
    JButton canTesi;
    
    //Mostrar BiBlios
    JButton mLibro;
    JButton mRevi;
    JButton mTesi;
    
    //Modificar biblios
    JButton mlibro;
    JButton mrevi;
    JButton mtesi;
    
    //PARA USO DE LA VENTANAS DONDE SE INGRESA EL TITULO DEL LIBRO 
    JButton buscarL;
    JButton buscarR;
    JButton buscarT;
    
    JButton canL;
    JButton canR;
    JButton canT;
    
    //PARA USO DE LAS VENTANAS INDIVIDUALES DONDE YA SE HACE LA MODIFICACION
    JButton modL;
    JButton modR;
    JButton modT;
    
    JButton cancL;
    JButton cancR;
    JButton cancT;
    
    //PARA ELIMINAR
    JButton eLibro;
    JButton eRevi;
    JButton eTesi;
    
    JButton Buscarl;
    JButton Buscarr;
    JButton Buscart;
    
    JButton Canl;
    JButton Canr;
    JButton Cant;
    
    JButton eliL;
    JButton eliR;
    JButton eliT;
    
    JButton cancl;
    JButton cancr;
    JButton canct;
    
    
    //**BOTONES PARA USO ESFICICO DEL USUARIO**
    
    
    
    
    //Para añadir biblios del usuario o hacer prestamo
    JButton aL;
    JButton aR;
    JButton aT;
    
    
    JButton prestarBi;
        JButton acep;
        JButton cancPre;
    
    JButton eliminarBi;
        JButton acepB;
        JButton cancB;
        //PARA PRESTAMOS
        JButton misPres;
        JButton devolver;
        JButton reprincipal;
            JButton acePre;
            JButton caPre;
            JButton miprincipal;
    
    //USUARIO
    JButton buscar;
    JButton mibiblio;
    
    
    
    JLabel m1;
    JLabel m2;
    public Boton(String a){//el string en el constructor es para ponerle identificador
        this.setText(a);
        
    }

    /*void addActionListener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
//setFont(new java.awt.Font("Perpetua", 1, 13));