package polimorfismo;

public class Triangulo extends Figuras{
	
	private double base;
	private double altura;
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	@Override
	public double CalcularArea() {
		double area=base*altura;
		return area;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	

		

}
