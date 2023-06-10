
public class condicionales2 {
public static void main(String[] args) {
	
	//In this chacter we going use the operator and condicional, OR ||, AND &&, 
	// >=, <=, ==, !=, ===, and Booleans.
		
		int edad = 16;
		
		int cantidadPersona = 2;
		
		boolean esPareja = false;
		
		// example with OR ||.
		if(edad >= 18 || cantidadPersona >=2) {
			System.out.println("Puede pasar");
		}else {
			System.out.println("Ud es menor, Preso");
		}
		
		//Example with AND &&.
		if(edad >= 18 && cantidadPersona >=2) {
			System.out.println("Puede pasar");
		}else {
			System.out.println("Ud es menor, Preso");
		}
		
		//Example with conditional boolean TRUE or FALSE.
		if(edad >= 18 && esPareja) {
			System.out.println("Puede pasar");
		}else {
			System.out.println("Ud es menor, Preso");
		}
		
	}
}
