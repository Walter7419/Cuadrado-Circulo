public class Circulo {
	public int ID;
	public Circulo(int ID) {
			this.ID = ID;

	}
	public double calculaPerimetro() {
		return(double) (2*3.14*ID);
}
	public double calculaArea() {
		return (double) (Math.pow(2, ID));
}

}