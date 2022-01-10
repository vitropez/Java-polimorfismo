package polimorfismo;

public class ImprimirDatos  {
	public void imprimirFigura(Figuras figura) {
		System.out.println("el color de la figura es "+figura.getColor() +" y tiene un area de "+figura.CalcularArea());	
	}

	public static void main(String[] args) {
		ImprimirDatos c=new ImprimirDatos();
		ImprimirDatos ci=new ImprimirDatos();
		ImprimirDatos t=new ImprimirDatos();
		
		 ci.imprimirFigura(new Circulo("azul",8));
		 t.imprimirFigura(new Triangulo("verde",4,2));
		c.imprimirFigura(new Cuadrado("rojo",3));
		
		

	}

}
