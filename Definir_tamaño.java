//4.Pedir por teclado el tamaño de un arreglo de números y pedir los valores
//numéricos con los que se rellena. Los valores no se pueden repetir, por lo tanto
//deberá de encargarse de buscar cada número que lea y verificar que no se haya
//leído antes. Mostrar el arreglo con los valores al final.

import java.util.Scanner;
public class Definir_tamaño {

 	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numeros[]=null,T_arreglo;
        int e = 0,num=0;
        boolean bandera=true;

        System.out.println("¿Cual sera el tamaño del arreglo?");
		T_arreglo = leer.nextInt();

        numeros = new int[T_arreglo];
        while(num < T_arreglo){
            System.out.println("Dame un número x ***que no sea repetido***: ");////Ejecuta proceso para ingresar valores
            e = leer.nextInt();
            for(int s=0;s < num -1;s++){////Iicia proceso...
                if(e == numeros[s]){
                    bandera=false;
                }
            }
            if(bandera == true){
                numeros[num] = e;
                num++;
            }
            else{
                System.out.println("---------------------------------");
                System.out.println("Este numero ya fue ingresado...");////Aqui se verifica que el valor ingresado no se halla repetido en caso
                                                                      ////de que sea repetido se mostrara este mensaje de advertencia.
                System.out.println("---------------------------------");
            }
            bandera = true;
            }

        System.out.println("----------------------------");
        System.out.println("ESTOS SON LOS VALORES DEL ARRAY INGRESADO....");/////Se imprime en pantalla todos los valores ingresados por el usuario
        for (int i=0 ;i< T_arreglo;i++){ 
            System.out.println("[ " + numeros[i] + " ]");
            } 
            System.out.println("----------------------------");
 
	
    }
 
}

