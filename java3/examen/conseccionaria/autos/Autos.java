package examen.conseccionaria.autos;

public class Autos extends Main{
	private String marca;
	private String modelo;
	private int a�oFabricacion;
	private String placa;
	private int Kilometraje;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getA�oFabricacion() {
		return a�oFabricacion;
	}
	public void setA�oFabricacion(int a�oFabricacion) {
		this.a�oFabricacion = a�oFabricacion;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getKilometraje() {
		return Kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		Kilometraje = kilometraje;
	}
	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", modelo=" + modelo + ", a�oFabricacion=" + a�oFabricacion + ", placa="
				+ placa + ", Kilometraje=" + Kilometraje + "]";
	}

	

}
