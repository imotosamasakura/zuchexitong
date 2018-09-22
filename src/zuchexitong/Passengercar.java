package zuchexitong;

public class Passengercar extends Vehicle implements Print{
	private int numOfPassenger;
	public int getNumOfPassenger() {
		return numOfPassenger;
	}
	public void setNumOfPassenger(int numOfPassenger) {
		this.numOfPassenger = numOfPassenger;
	}
	public Passengercar(String carModel,double price,int numOfPassenger){
		this.setCarModel(carModel);
		this.setPrice(price);
		this.setNumOfPassenger(numOfPassenger);
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(this.getCarModel()+"\t");
		System.out.print(this.getPrice()+"\t");
		System.out.print("Œﬁ∑®‘ÿªı"+"\t");
		System.out.println(this.getNumOfPassenger());
		
	}


}
