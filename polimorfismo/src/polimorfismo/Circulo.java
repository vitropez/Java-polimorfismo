package polimorfismo;

public class Circulo extends Figuras {
	
	private double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double CalcularArea() {
	double area=Math.PI*Math.pow(radio, 2);
		return area;
	}



	

}
