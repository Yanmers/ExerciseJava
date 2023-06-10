//This unid, we use a method Switch.
public class testMes {
	public static void main(String[] args) {
		
		//have a diferent posibility in this case not recomending use a if,else, the method Switch
		// is the best method we use in this situations.
		
		int mes = 0;
		
		switch(mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		default:
			System.out.println("Mes no encontrado");
			break;
		}
	}

}
