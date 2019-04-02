
package proyecto1;

public class Prestamos {
    private String autor;
    private String titulo;
    private String fecha1;
    private String fecha2;
    private String usuario;
    
    public Prestamos(){
        usuario="";
        autor="";
        titulo="";
        fecha1="";
        fecha2="";
    }
    public Prestamos(String usuarioo,String autor1,String titulo1,String fechas1,String fechas2){
        this.usuario=usuarioo;
        this.autor=autor1;
        this.titulo=titulo1;
        this.fecha1=fechas1;
        this.fecha2=fechas2;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }
    
    
}
