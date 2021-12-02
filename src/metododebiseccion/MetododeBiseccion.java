package metododebiseccion;

//Creamos la Clase Método de Bisección
public class MetododeBiseccion {

    //Creamos el Método Main 
    public static void main(String[] args) {
        
        //Creamos un Objeto en metodo dónde deasrrollamos la lógica del Método de Bisección.
        Metodo metodo = new Metodo();
    
    //Utilizamos nuestro Objeto metodo con el Método .SetFuncion para ingresar la función como String 
    metodo.setFuncion("x^2 - 5");
    
        //Aplicamos la Lógica del Método de Bisección con el Objeto metodo y el Método .biseccion
        //Gracias a que tenemos un Constructor el Método metodo.biseccion nos va a pedir los valores del Límite Inferior, Límite Superior y el Número de Decimales para la Raíz.
        System.out.println("x: " + metodo.biseccion(2, 2.5, 0.001));           
         
    }
    
}
