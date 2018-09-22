package zuchexitong;

public class Truck extends Vehicle implements Print{
	private double volumeOfCargo;
	public double getVolumeOfCargo() {
		return volumeOfCargo;
	}

	public void setVolumeOfCargo(double volumeOfCargo) {
		this.volumeOfCargo = volumeOfCargo;
	}

	public Truck(String carModel,double price,double volumeOfCargo){
		this.setCarModel(carModel);
		this.setPrice(price);
		this.setVolumeOfCargo(volumeOfCargo);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(this.getCarModel()+"\t\t");
		System.out.print(this.getPrice()+"\t");
		System.out.print(this.getVolumeOfCargo()+"\t");
		System.out.println("Œﬁ∑®‘ÿ»À");
		
	}
	
}
