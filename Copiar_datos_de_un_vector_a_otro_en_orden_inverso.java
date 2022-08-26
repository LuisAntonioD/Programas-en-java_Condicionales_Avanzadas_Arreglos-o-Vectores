//5. Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector
//con datos leídos por el teclado. Copia los elementos del vector en otro vector pero
//en orden inverso, y muéstralo por la pantalla.

import java.util.Scanner;
public class Copiar_datos_de_un_vector_a_otro_en_orden_inverso {

 	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String cadena[]=null;
        int cadena2=5;

        cadena = new String[cadena2];
        for(int i=0;i < cadena2;i+=1){
            System.out.print("Dame una cadena de caracteres: ");////Aqui se ingresa las cadenas de texto que se alamcenaran en el array
            cadena[i]=leer.next();
        }            
        System.out.println("----------------------------------------------------------");  
        System.out.println("ORDEN INVERSO DE LOS CARACTERES INGRESADOS ANTERIORMENTE");
        for(int i=cadena.length - 1; i>=0; i--){           ////Aqui se ejecuta el proceso para poner en orden inverso 
                                                          ////todo lo anterior ingresado como cadena de caracteres

            System.out.print("[ " + cadena[i] + " ]");////Aqui se imprime en pantalla el orden inverso de los caracteres 
          }
          System.out.println("     ");  
          System.out.println("----------------------------------------------------------");  

        
	
    }
 
}