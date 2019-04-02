
package proyecto1;

public class Libro {
    public int tipo;
    public String autor;
    public String titulo;
    public Integer edicion;
    public String clave;
    public String descripcion;
    public String tema;
    public Integer copia;
    public Integer disponible;
    public Integer prestamos;
    
    public Libro(){
        tipo=0;
        autor="";
        titulo="";
        edicion=0;
        clave="";
        descripcion="";
        tema="";
        copia=0;
        disponible=0;
        prestamos=0;
    }

    public Integer getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Integer prestamos) {
        this.prestamos = prestamos;
    }
    //SOBRE CARGA
    public Libro(int tipo1,String autor1,String titulo1,Integer edicion1,String clave1,String descripcion1,String tema1,Integer copia1,Integer disponible1){
        tipo=tipo1;
        autor=autor1;
        titulo=titulo1;
        edicion=edicion1;
        clave=clave1;
        descripcion=descripcion1;
        tema=tema1;
        copia=copia1;
        disponible=disponible1;
    }
    public String getMostrar(){
        return "AUTOR:  "+autor+";   TITULO: "+titulo+";   EDICION: "+edicion+";   PALABRAS CLAVES: "+clave+";   DESCRIPCION: "+descripcion+";   TEMAS RELACIONADOS: "+tema+";   COPIAS: "+copia+";   DISPONIBLES: "+disponible+"\n\n";
    }
    
    public String getUser(){
        return "AUTOR:   "+autor+"; TITULO:   "+titulo+";    EDICON:  "+edicion+";   PALABRAS CLAVES:  "+clave+";   DESCRIPCION:   "+descripcion+";   TEMAS RELACIONADOS: "+tema+"\n\n";
    }
    
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public Integer getEdicion(){
        return edicion;
    }
    public void setEdicion(Integer edicion){
        this.edicion=edicion;
    }
    public String getClave(){
        return autor;
    }
    public void setClave(String clave){
        this.clave=clave;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public String getTema(){
        return tema;
    }
    public void setTema(String tema){
        this.tema=tema;
    }
    public Integer getCopia(){
        return copia;
    }
    public void setCopia(Integer copia){
        this.copia=copia;
    }
    public Integer getDisponible(){
        return disponible;
    }
    public void setDisponible(Integer disponible){
        this.disponible=disponible;
    }
}
