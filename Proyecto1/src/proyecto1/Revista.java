
package proyecto1;

public class Revista {
    public int tipo;
    public String autor;
    public String titulo;
    public Integer edicion;
    public String clave;
    public String descripcion;
    public String tema;
    public Integer copia;
    public Integer disponible;
    public String frecuencia;
    public Integer ejemplar;
    public Integer prestamos;

    public Integer getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Integer prestamos) {
        this.prestamos = prestamos;
    }
    
    public Revista(){
        tipo=0;
        autor="";
        titulo="";
        edicion=0;
        clave="";
        descripcion="";
        tema="";
        copia=0;
        disponible=0;
        frecuencia="";
        ejemplar=0;
        prestamos=0;
    }
    //SOBRECARGA
    public Revista(int tipo1,String autor2,String titulo2,Integer edicion2,
            String clave2,String descripcion2,String tema2,Integer copia2,Integer disponible2,String frecuencia2,Integer ejemplar2)
    {
        tipo=tipo1;
        autor=autor2;
        titulo=titulo2;
        edicion=edicion2;
        clave=clave2;
        descripcion=descripcion2;
        tema=tema2;
        copia=copia2;
        disponible=disponible2;
        frecuencia=frecuencia2;
        ejemplar=ejemplar2;
        
    }
    public String getMostrar(){
        return "AUTOR:"+autor+";    TITULO:"+titulo+";     EDICION:"+edicion+";    PALABRAS CLAVES:"+clave+";    DESCRIPCION:"+descripcion+";     TEMAS RELACIONADOS:"+tema+";     COPIAS:"+copia+";     DISPONIBLES:"+disponible+";     FRECUENCIA DE PUBLICACION:"+frecuencia+";     EJEMPLARES:"+ejemplar+"\n\n";
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
    public String getFrecuencia(){
        return frecuencia;
    }
    public void setFrecuencia(String frecuencia){
        this.frecuencia=frecuencia;
    }
    public Integer getEjemplar(){
        return ejemplar;
    }
    public void setEjemplar(Integer ejemplar){
        this.ejemplar=ejemplar;
    }
}
