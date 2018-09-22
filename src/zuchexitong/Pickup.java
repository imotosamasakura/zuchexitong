package zuchexitong;

public class Pickup extends Vehicle  implements Print{
	private double volumeOfCargo;
	private int numOfPassenger;
	public double getVolumeOfCargo() {
		return volumeOfCargo;
	}
	public void setVolumeOfCargo(double volumeOfCargo) {
		this.volumeOfCargo = volumeOfCargo;
	}
	public int getNumOfPassenger() {
		return numOfPassenger;
	}
	public void setNumOfPassenger(int numOfPassenger) {
		this.numOfPassenger = numOfPassenger;
	}
	public Pickup(String carModel,double price,double volumeOfCargo,int numOfPassenger){
		this.setCarModel(carModel);
		this.setPrice(price);
		this.setNumOfPassenger(numOfPassenger);
		this.setVolumeOfCargo(volumeOfCargo);
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(this.getCarModel()+"\t\t");
		System.out.print(this.getPrice()+"\t");
		System.out.print(this.getVolumeOfCargo()+"\t");
		System.out.println(this.getNumOfPassenger());
		
	}
}
