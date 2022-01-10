package polimorfismo;

public abstract class Figuras {
	private String color;
	

	public Figuras(String color) {
		
		this.color = color;
	}
	public abstract double CalcularArea()
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
