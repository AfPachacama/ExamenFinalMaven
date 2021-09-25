package examen.conseccionaria.autos;

public class Autos extends Main{
	private String marca;
	private String modelo;
	private int añoFabricacion;
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
	public int getAñoFabricacion() {
		return añoFabricacion;
	}
	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
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
		return "Autos [marca=" + marca + ", modelo=" + modelo + ", añoFabricacion=" + añoFabricacion + ", placa="
				+ placa + ", Kilometraje=" + Kilometraje + "]";
	}

	

}
