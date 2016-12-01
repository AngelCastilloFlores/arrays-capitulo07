import java.util.Scanner;

//Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que se muestra acontinuación.
//Muestra el contenido de todos los elementos del array.
//¿Qué sucede con los valores de los elementos que no han sido inicializados?

public class ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] num; // se define n como un array de enteros 
		num = new int[12]; // se reserva espacio para 4 enteros
		
		num[0] = 80;
		num[2] = 39;
		num[6] = 42;
		num[10] = 23;
		num[8] = 12;
		num[3] = 68;
		
		for (int i = 0; i<=11; i++){
				System.out.printf("num[%2d]: %d\n", i, num[i]);
		}
	
	}

}
