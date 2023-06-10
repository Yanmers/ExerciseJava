
public class caracteres {
	public static void main(String[] args) {
		//Method char is a method the only use and support any one character, example.
		
		char caracter = 'a';
		char caracter2 = '1';
		char caracter3 = 'C';
		char caracter4 = '5';
		char caracter5 = '#';
		System.out.println(caracter);
		System.out.println(caracter2);
		System.out.println(caracter3);
		System.out.println(caracter4);
		System.out.println(caracter5);
		
		//The method cast is similar, we use a method in this exercise.
		caracter = 65 + 1;
		System.out.println(caracter);
		//now realize the exercise and use the method.
		char nuevoCaracter = (char) (caracter + 1);
		System.out.println(nuevoCaracter);// this is = 67, in the table 67 is = C.
		
		//The String is similar that use System.out.print, example.
		
		String nombre = "yaniel mercedes";
		System.out.println(nombre);
		// now cancat the other char o nun.
		System.out.println(nombre +" "+ 26);
	}
}
