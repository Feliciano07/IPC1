
package estructuras;

public class Estructuras {

    
    public static void main(String[] args) {
        //Iniciamos la pila e ingresamos datos
        MiPila pila=new MiPila();
        pila.Push("Juan");
        pila.Push("Fulano");
        pila.Push("Fulana");
        pila.Push("Mengana");
        //Mostramos la pila
        pila.MostarPila();
        
        System.out.println("");
        //Sacamos el el ultimo elmento que ingreso a la pila 
        pila.Pop();
        //Mostramos nuevamente
        pila.MostarPila();
        
        
        System.out.println("");
        //EJEMPLOS DE COLA
        MiCola colita=new MiCola();
        colita.Encolar("Fernando");
        colita.Encolar("Ana");
        colita.Encolar("Mishell");
        colita.Encolar("Sindy");
        colita.Encolar("Nelson");
        
        System.out.println("Mostramos la cola original");
        colita.Mostar();
        System.out.println("");
        System.out.println("Quitamos los primeros 2 elmentos");
        colita.Desencolar();
        colita.Desencolar();
        
        System.out.println("");
        System.out.println("Mostramos la cola nuevamente");
        
        colita.Mostar();
        
        
        System.out.println("");
        
        
        
        //EJEMPLOS DE LISTA SIMPLE
        ListaEnlazada lista=new ListaEnlazada();
        lista.AgregarFin("Fernando");
        lista.AgregarFin("Mishel");
        lista.AgregarFin("Andrea");
        lista.AgregarFin("Willian");
        lista.AgregarFin("Luis");
        
        System.out.println("Mostramos los elementos que agregamos al final");
        lista.Mostrar();
        
        lista.AgregarInicio("Fulana");
        lista.AgregarInicio("Mengana");
        lista.AgregarInicio("Carlos");
        lista.AgregarInicio("Maria");
        
        System.out.println("");
        System.out.println("Mostramos la lista nuevamente pero con elmentos agregados al principio");
        lista.Mostrar();
        
        
        //Buscamos un nombre
        System.out.println("");
        System.out.println("Buscamos un nodo");
        String nombre="Fulana";
        lista.Buscar(nombre);
    }
    
}
