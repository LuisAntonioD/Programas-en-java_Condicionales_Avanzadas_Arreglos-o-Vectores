//1. Crea un array o arreglo unidimensional donde le indiques el tamaño por teclado
//y crear una función que rellene el array o arreglo con los múltiplos de un numero
//pedido por teclado. Por ejemplo, si defino un array de tamaño 5 y eligió un 3 en la
//función, el array contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta.

import java.util.Scanner;
public class Rellenar_con_multiplos {

 	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

 
		int incremento[]=null,T_arreglo=0,incrementoarreglo=0,x=1;
		do{
		System.out.println("¿Cual sera el tamaño del arreglo?");
		T_arreglo = leer.nextInt();
 
		System.out.println("¿De cuanto sera su incremento?");
		incrementoarreglo = leer.nextInt();
        System.out.println("----------------------------");
		if(T_arreglo <= 0 || incrementoarreglo <= 0){
			System.out.println("No puedo comenzar si no me indicas el tamaño y el incremento correctamente");
		}

		}
		while(T_arreglo <= 0 || incrementoarreglo <= 0);//Repite la sentencia hasta que se ingrese un numero mayor a cero

		
		incremento = new int[T_arreglo];//inicia proceso
		for(int p = 0; p < T_arreglo; p+=1){
			incremento[p] = ((incrementoarreglo)*(x+p));
		}

		System.out.println("Los multipos de " + incrementoarreglo + " son...");

		for(int p =0; p < incremento.length; p+=1){
			System.out.println("[ " + incremento[p] + " ]");//finaliza proceso
		}
        System.out.println("----------------------------");

	

	}
 
}


