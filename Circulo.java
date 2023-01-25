
public class Circulo {
	public int ID;
	
	Circulo(){
		this(176770);
	}
	
	public Circulo(int rad) {
			this.ID = rad;
	}
	
	public double cPCi() {
		return(double) (2*3.14*ID);
	}
	

	
	public double cACi() {
		return (double) ID * ID * 3.14;
	}
}