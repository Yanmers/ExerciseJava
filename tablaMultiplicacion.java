//In this chacter we go use a ciclo for.

public class tablaMultiplicacion {
	public static void main(String[] args) {
		for(int contador = 0; contador <= 10; contador++) {
			for( int multiplicador = 0; multiplicador <= 10; multiplicador++) {
				System.out.print(contador * multiplicador);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
