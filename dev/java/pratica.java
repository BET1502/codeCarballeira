import java.util.Scanner;

public class pratica {
	public static void main (String [] args) {
		int numero1;
		int numero2;
		int division;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce el primer numero");
		numero1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		numero2 = teclado.nextInt();
		division = numero1 / numero2;
		System.out.println( "El resultado es" + division);
	}
}
