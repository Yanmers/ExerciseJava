
public class matrisTriangular {
	public static void main(String[] args) {
		
		
		for(int columnas = 0; columnas <= 10; columnas ++) {
			for(int filas = 0; filas <= 10; filas ++) {
				if(columnas < filas) {
					break;
				}
				System.out.print(" * ");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	
}
