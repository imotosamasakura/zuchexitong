package zuchexitong;

public class Vehicle {
	private String CarModel;//车型
	private double Price;//价格
	private int num;//租车数量
	private double VolumeOfCargo;//载货量
	private int NumOfPassenger;//载客量
	//属性的get set方法
	public String getCarModel() {
		return CarModel;
	}
	public void setCarModel(String carModel) {
		CarModel = carModel;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getVolumeOfCargo() {
		return VolumeOfCargo;
	}
	public void setVolumeOfCargo(double volumeOfCargo) {
		VolumeOfCargo = volumeOfCargo;
	}
	public int getNumOfPassenger() {
		return NumOfPassenger;
	}
	public void setNumOfPassenger(int numOfPassenger) {
		NumOfPassenger = numOfPassenger;
	}
	

}
