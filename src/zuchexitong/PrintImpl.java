package zuchexitong;

public class PrintImpl implements Print {

	@Override
	public void print(Passengercar passengercar) {
		// TODO Auto-generated method stub
		System.out.print(passengercar.getCarModel()+"\t");
		System.out.print(passengercar.getPrice()+"\t");
		System.out.print(passengercar.getVolumeOfCargo()+"\t");

		System.out.println(passengercar.getNumOfPassenger());

	}

	@Override
	public void print(Truck truck) {
		// TODO Auto-generated method stub
		System.out.print(truck.getCarModel()+"\t\t");
		System.out.print(truck.getPrice()+"\t");
		System.out.print(truck.getVolumeOfCargo()+"\t");
		System.out.println(truck.getNumOfPassenger());
		
		
	}

	@Override
	public void print(Pickup pickup) {
		// TODO Auto-generated method stub
		System.out.print(pickup.getCarModel()+"\t\t");
		System.out.print(pickup.getPrice()+"\t");
		System.out.print(pickup.getVolumeOfCargo()+"\t");
		System.out.println(pickup.getNumOfPassenger());
	}

}
