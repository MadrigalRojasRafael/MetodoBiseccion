package metododebiseccion;

//Creamos la Clase Metodo para desarrollar el Método de Bisección
public class Metodo {
    
    //Creamos los Atributos del Método
    private Funcion fun;
    double raiz;
    int contador;   

    //Creamos un Método sin Parámetros para poder llamarlo en nuestro Método de Bisección.java como un Objeto 
    public Metodo(){
    
    }
    
    //Creamos un Objeto llamado fun en el Método Función (expresion) de Funcion.java
    public Metodo(String expresion){
        fun = new Funcion(expresion);
    }
    
    //Creamos el Método SetFuncion e igualment creamos un Objeto llamado fun en el Método Función (expresion) de Funcion.java
    public void setFuncion(String expresion){
        fun = new Funcion(expresion);
    }
    
    //Creamos el Método biseccion con los Parámetros a, b y t de tipo Double
    //a es el límite inferior del intervalo
    //b es el límite superior del intervalo
    //dec son los decimales que deseamos que tenga de exactitud el cálculo de la ráiz
    public double biseccion(double a, double b, double dec){
        
        //x será la raíz de la función y deberá ser un número natural de Tipo Double 
        this.raiz = Double.NaN;
        
        //El contador nos ayudará a llevar un conteo de las iteraciones que nos llevan hasta los decimales de exactitud que deseamos
        this.contador = 0;
        
        //Utilizamos el Método evaluar para evaluar el límite inferior y almacenarlo en la Variable evaA de tipo Double 
        double evaA = this.fun.evaluar(a);
        
        //Condicionamos que la evaluación de a (evaA) sea un número natural.
        if (!Double.isNaN(evaA)) {
            
            //Utilizamos el Método evaluar para evaluar el límite superior y almacenarlo en la Variable evaB de tipo Double 
            double evaB = this.fun.evaluar(b);
            
            //Empeazamos el planteamiento de la Lógica del Método de Bisección
            //Condicionamos que el producto de las evaluciones de la función en el límite inferior y el límite superior sea menor que 0 dando cumplimiento al Teorema de Bolzano
            if(evaA * evaB < 0){
                
                //Si se cumple la condición hará lo siguiente
                do {    
                    
                    //Nuestra raíz se le aplicará el Teorema de Bolzano
                    this.raiz = (a+b)/2;
                    this.contador++;
                    evaA = this.fun.evaluar(a);
                    evaB = this.fun.evaluar(b);
                    
                    //En caso de que el producto de la función evaluada en el límite inferior a por el valor obtenido de la función evaluada en raíz (Teorema de Bolzano) sea menor que 0 
                    if(evaA * this.fun.evaluar(raiz) < 0){
                        
                        //El valor obtenido en el bloque anterior de b será asignada a nuestra raíz
                        b = this.raiz;
                    
                    //En caso que la condición anterior sea false
                    }else{
                        
                        //El valor obtenido en el bloque anterior de a será asignada a nuestra raíz
                        a = this.raiz;
                    }
                
                //Mientras el valor absoluto de nuestra función evaluada en la raíz asignada en el bloque anterior sea mayor que los decimales que deseamos de exactitud se va a repetir el bloque de instrucciones hasta que se rompa el bucle y nos arroje la x (raíz)
                } while (Math.abs(this.fun.evaluar(raiz)) > dec);
                
                
            }
            
            //Condicionamos que la raíz sea un número natural de tipo Double 
            if(!Double.isNaN(this.raiz)){
                
                //Devolvemos el valor de nuestra raíz
                return this.raiz;
            }
                        
        }

            return Double.NaN;
    }
    
}
