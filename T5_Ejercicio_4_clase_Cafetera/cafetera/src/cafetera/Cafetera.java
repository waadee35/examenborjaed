package cafetera;
//T5_Ejercicio_4_clase_cafetera

public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;
	
	public Cafetera()
	{
		this.capacidadMaxima=1000;
		this.cantidadActual=0;
	}
	
	public Cafetera(int cap)
	{
		this.capacidadMaxima=cap;
		this.cantidadActual=0;
	}
	
	public Cafetera(int capMax, int capAct)
	{
		this.capacidadMaxima=capMax;
		this.cantidadActual=capAct;
		if (capAct>capMax)
		{
			capAct=capMax;
		}
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	public void llenarCafetera()
	{
		this.cantidadActual=this.capacidadMaxima;
	}
	
	public void vaciarCafetera()
	{
		this.cantidadActual=0;
	}
	
	public void agregarCafe(int cant)
	{
		if ((this.cantidadActual+cant)>=this.capacidadMaxima)
		{
			this.cantidadActual=this.capacidadMaxima;
		}
		else
		{
			this.cantidadActual=this.cantidadActual+cant;
		}
	}
	public void servirTaza(int taza)
	{
		if (this.cantidadActual>=taza)
		{
			this.cantidadActual=this.cantidadActual-taza;
		}
		else
		{
			System.out.println("Se ha servido una taza con: "+this.cantidadActual+" cc de café");
			this.cantidadActual=0;
		}
	}

}
