/**
 * 
 */
package paquete1;

/**
 * @author Paula
 *
 */
public class Cuadrado {
	double lado;
	
	public Cuadrado() {
		
	}
	
	public Cuadrado(double lado) {
		this.lado=lado;
	}
	
	public double calcularPerimetro() {
		return 4*lado;
	}
}
