//3. Pediremos los IDs (números) de alumnos de dos clases, álgebra y análisis.
//Queremos mostrar todos los alumnos comunes en las dos asignaturas.
//Estos alumnos se guarden en un tercer arreglo y que sea el que se muestre.
//También indica el numero de alumnos que se repiten.

import java.util.Scanner;
public class Pedir_IDS {

 	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

            int x,r=0,ID=1;
            int IDS1=0,IDS2=0,cantIDS=0;
            int calse1[]=null;
            int clase2[]=null;
            int IDS_guardadas[]=null;



            System.out.println("¿Cuántas IDS por clase agregaras?");//Lectura de datos 
		    cantIDS = leer.nextInt();
            calse1 = new int[cantIDS];
            clase2 = new int[cantIDS];
            IDS_guardadas = new int[cantIDS*2];
        
 
            for(int i=0;i < cantIDS;i++){
                    System.out.println("Dame el ID de la clase de álgebra ");
                    IDS1= leer.nextInt();
                    calse1[i]= IDS1;
            }
            for(int i=0;i < cantIDS;i++){
                    System.out.println("Dame el ID de la clase de análisis ");
                    IDS2= leer.nextInt();
                    clase2[i]= IDS2;
            }

            x=0;
            while(x < cantIDS){//Inicia proceso 
                IDS_guardadas[x] = calse1[x];
                x++;
            }

            while(x < cantIDS*2){
                IDS_guardadas[x] = clase2[r];
                x++;
                r++;
            }

            System.out.println("[Esta es una lista con todas las calificaiones guardadas]");

            x=0;
            while(x <cantIDS*2){
                System.out.println("ALUMNO "+ x + ":" + IDS_guardadas[x]);
                x++;
            }

            if(IDS1 == IDS2){//Aqui las IDS se mostrara que si se puedo dos veces una misma ID la contara como 1 repetida y asi con las demas 
                ID++;
                System.out.println("Hay " + ID + " IDS repetidas :| hay problemas!!!");
            }
 
            else if(IDS1 != IDS2){
                System.out.println("No hay alumnos con la IDS repetidas :)");
            } 
    
    }
}