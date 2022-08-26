//2. Buscar un elemento dentro de un arreglo que nosotros le pedimos por teclado.
//Indicar la posición donde se encuentra. Si hay más de uno, indicar igualmente la posición.

import java.util.Scanner;
public class Buscar_un_elemnto {

 	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int incremento[]=null,T_arreglo,num;
        boolean bandera = false;

        System.out.println("¿Cual sera el tamaño del arreglo?");//Lectura de datos 
		T_arreglo = leer.nextInt();

        incremento = new int[T_arreglo];
        for(int i=0;i < T_arreglo;i+=1){
            System.out.print("Dame un número x: ");
            incremento[i]=leer.nextInt();
        }

        System.out.println("¿Cuál es el número que quieres buscar?");
        num=leer.nextInt();
        System.out.println("-------------------------------------------");

        for(int i=0;i < incremento.length;i+=1){//Inicia proceso
            if (num == incremento[i]){
                System.out.println("El número esta en la posicion [ " + i + " ]");
                bandera = true;
            }
        }
        System.out.println("-------------------------------------------");
            if(bandera == false){
                System.out.println("El número no existe");//Aqui se mostrara este mensaje en caso de que ingreses un
                                                          //numero que no agregaste cuando lo leiste ya que no existiria no hay una pocicion verdadera.
            }
	
    }
 
}