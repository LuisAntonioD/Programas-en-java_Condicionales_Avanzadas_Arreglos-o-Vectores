//6.Crea un programa que pida un número al usuario un número de mes (por
//ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes.
//Debes usar un vector. Para simplificarlo vamos a suponer que febrero tiene 28 días.

import java.util.Scanner;
public class Dias_del_mes {

 	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


       int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};//Valor en el arreglo para pa saber en que posicion esta losd dias de cada dia del mes
       int numero;

       System.out.println("Dame un numero del 1 al 12 y te dire que mes es y cuantos dias tiene");//Lectura de datos 
		numero = leer.nextInt();

        if(numero ==1){
            System.out.println("Ese mes es  enero y tiene " + dias[numero-1] + " dias");//Inicia proceso y busca en el arreglo el dia indicado a cada mes
        }
        else if(numero == 2){
            System.out.println("Ese mes es  febrero y tiene " + dias[numero-1] + " dias"); 
        }
        else if(numero == 3){
            System.out.println("Ese mes es  marzo y tiene " + dias[numero-1] + " dias"); 
        }
        else if(numero == 4){
            System.out.println("Ese mes es  abril y tiene " + dias[numero-1] + " dias"); 
        }
        else if(numero == 5){
            System.out.println("Ese mes es  mayo y tiene " + dias[numero-1] + " dias"); 
        }
        else if(numero == 6){
            System.out.println("Ese mes es  junio y tiene " + dias[numero-1] + " dias"); 
        }
        else if(numero == 7){
            System.out.println("Ese mes es  julio y tiene " + dias[numero-1] + " dias"); 
        }
        else if(numero == 8){
            System.out.println("Ese mes es  agosto y tiene " + dias[numero-1] + " dias"); 
        }
        else if(numero == 9){
            System.out.println("Ese mes es  septiembre y tiene " + dias[numero-1] + " dias"); 
        }
        else if(numero == 10){
            System.out.println("Ese mes es  octubre y tiene " + dias[numero-1] + " dias"); 
        }
        else if(numero == 11){
            System.out.println("Ese mes es  noviembre y tiene " + dias[numero-1] + " dias"); 
        }
        else if(numero == 12){
            System.out.println("Ese mes es  diciembre y tiene " + dias[numero-1] + " dias"); 
        }
        else{
            System.out.println("Hay un error,ese número no esta dentro del rando pedido :(");//Finaliza proceso
        }

    }
 
}