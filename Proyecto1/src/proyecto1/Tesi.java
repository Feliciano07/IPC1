
package proyecto1;

public class Tesi {
    public int tipo;
    public String autor;
    public String titulo;
    public Integer edicion;
    public String clave;
    public String descripcion;
    public String tema;
    public Integer copia;
    public Integer disponible;
    public String area;
    public Integer prestamos;

    public Integer getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Integer prestamos) {
        this.prestamos = prestamos;
    }
    
    //CONSTRUCTOR NORMAL
    public Tesi(){
        tipo=0;
        autor="";
        titulo="";
        edicion=0;
        clave="";
        descripcion="";
        tema="";
        copia=0;
        disponible=0;
        area="";
    }
    //SOBRECARGA DE METODOS
    public Tesi(int tipo1,String autor3,String titulo3,int edicion3,String clave3,String descripcion3,String tema3,
            int copia3,int disponible3,String area3)
    {
        tipo=tipo1;
        autor=autor3;
        titulo=titulo3;
        edicion=edicion3;
        clave=clave3;
        descripcion=descripcion3;
        tema=tema3;
        copia=copia3;
        disponible=disponible3;
        area=area3;
    }
    public String getMostrar(){
        return " AUTOR:"+autor+";     TITULO:"+titulo+";     EDICION:"+edicion+";     PALABRAS CLAVES:"+clave+";     DESCRIPCION:"+descripcion+";     TEMAS RELACIONADOS:"+tema+";     COPIAS:"+copia+";     DISPONIBLES:"+disponible+";     AREA:"+area+"\n\n";
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
    public int getCopia(){
        return copia;
    }
    public void setCopia(int copia){
        this.copia=copia;
    }
    public Integer getDisponible(){
        return disponible;
    }
    public void setDisponible(Integer disponible){
        this.disponible=disponible;
    }
    public String getArea(){
        return area;
    }
    public void setArea(String area){
        this.area=area;
    }
    
}
