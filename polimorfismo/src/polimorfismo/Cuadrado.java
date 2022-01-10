package polimorfismo;

public class Cuadrado extends Figuras {
private	double lado;

	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double CalcularArea() {
		double area=lado*lado;
		return area;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	

}
