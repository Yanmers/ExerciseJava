
public class tiendaEjemplo {
	public static void main(String[] args) {
		
//		María es propietaria de una tienda de ropa y le gustaría crear un programa 
//		que calcule el valor final del producto después de aplicar un descuento que
//		ofrecería a sus clientes.
		
//		.Si el valor de la compra está entre $100.0 y $199.99, el descuento es del 10%.
//		.Si el valor de la compra está entre $200.0 y $299.99, el descuento es del 15%.
//		.Para compras superiores a $300.0, el descuento es del 20%.
		
		
		double valorCompra = 100.0;
		
		if(valorCompra >= 100.0 && valorCompra <= 199.99) {
			System.out.println("el descuento es del 10%.");
		}else if(valorCompra >= 200.0 && valorCompra <= 299.99) {
			System.out.println("el descuento es del 15%.");
		}else if(valorCompra > 300){
			System.out.println("El descuento es del 20%");
		}
		

	}
}
