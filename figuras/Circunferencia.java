package figuras;

public class Circunferencia {
	private double radio;
	private String color;

	public Circunferencia(double radio)
	    	{
	        this.radio = radio;
	}

	    	public void imprimir()
	    	{
				double area=CalcularArea();
	        String color = "rojo";
	        System.out.println("Di�metro: " + 2* radio);
	        System.out.println("Color: " + color);
	        double area = 2 * 3.1416 * radio * radio;
	        System.out.println(area);
	}

	public boolean esIgual (Circunferencia otro, boolean conDecimales)
	{
	        double radio1 = this.radio;
	        double radio2 = otro.getRad();
	        if (conDecimales)
	        {
	            if (radio1 == radio2) 
	              return true;
	            else
	              return false;
	        }
	        else
	        {
	            if (Math.abs(radio1-radio2)<1)
	                return true;
	            else
	                return false;
	        }
	    }
	}

