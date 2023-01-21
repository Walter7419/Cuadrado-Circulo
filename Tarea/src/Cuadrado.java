public class Cuadrado {
	public int lado;
	public int ID;
	public Cuadrado(int ID, int lado) {
			this.lado = lado;
			this.ID = ID;

	}
	public int calculaPerimetro() {
		return lado*4;
}
	public int calculaArea() {
		return lado*lado;
}
	public double calculaDiametro() {
		return(double) Math.sqrt(2*(lado*lado));
}
}