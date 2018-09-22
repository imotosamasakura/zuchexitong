package zuchexitong;
import java.util.Scanner;
import java.util.ArrayList;
public class Test {
	private static Scanner out;
	//计算总金额
	public static double getAllPay(ArrayList<Vehicle> carlist){
		double psum = 0;
		for(int i = 0;i < carlist.size();i++){
			psum = psum + carlist.get(i).getNum() * carlist.get(i).getPrice();
		}
		return psum;
	}
	//计算总载货量
	public static double getAllVolume(ArrayList<Vehicle> carlist){
		double vsum = 0;
		for(int i = 0;i < carlist.size();i++){
			vsum = vsum + carlist.get(i).getNum() * carlist.get(i).getVolumeOfCargo();
		}
		return vsum;
	}
	//计算总载客量
	public static int getAllPassenger(ArrayList<Vehicle> carlist){
		int pasum = 0;
		for(int i = 0;i < carlist.size();i++){
			pasum = pasum + carlist.get(i).getNum() * carlist.get(i).getNumOfPassenger();
		}
		return pasum;
	}

	public static void main(String []args){
		int b = 0,c = 0;
		String d;
		ArrayList<Vehicle> carlist = new ArrayList<Vehicle>();
		Print print = new PrintImpl();
		Truck truck = new Truck();
		Passengercar passengercar = new Passengercar();
		Pickup pickup = new Pickup();
		//分别录入truck passengercar pickup信息
		truck.setCarModel("truck");
		truck.setPrice(500.0);
		truck.setVolumeOfCargo(500.0);
		truck.setNumOfPassenger(0);
		truck.setNum(0);
		passengercar.setCarModel("passengercar");
		passengercar.setPrice(500.0);
		passengercar.setNumOfPassenger(50);
		passengercar.setVolumeOfCargo(0);
		passengercar.setNum(0);
		pickup.setCarModel("pickup");
		pickup.setPrice(300.0);
		pickup.setVolumeOfCargo(200.0);
		pickup.setNumOfPassenger(0);
		pickup.setNum(0);
		carlist.add(truck);
		carlist.add(passengercar);
		carlist.add(pickup);
		while(b == 0){
			c = 0;
			b = 1;
		    System.out.println("1.展示所有车辆");
		    System.out.println("2.租车");
		    System.out.println("3.展示租车清单");
		    out = new Scanner(System.in);
		    int a = out.nextInt();
		
		    switch(a){
		    case 1:
			    System.out.println("车型"+"\t\t"+"价格"+"\t"+"载重量"+"\t"+"载客量");
			    print.print((Truck)truck);		
			    print.print((Passengercar)passengercar);
			    print.print((Pickup)pickup);
			    System.out.println("任意键返回");
			    d = out.next();		   
			    b = 0;
			    break;
		    case 2:
		    	while(c == 0){
		    		c = 1;
		    		System.out.println("请选择所租车型");
		    		System.out.println("1.Truck");
		    		System.out.println("2.Passengercar");
		    		System.out.println("3.Pickup");
		    		System.out.println("0.返回");
		    		a = out.nextInt();
		    		switch(a){
		    		case 0:
		    			b = 0;
		    			//System.out.print(b);
		    			break;
		    		case 1:
		    			System.out.println("请输入租车数量：");
		    			a = out.nextInt();
		    			truck.setNum(truck.getNum() + a);
		    			System.out.println("操作成功，输入0返回最初页面，输入1继续租车");
		    			a = out.nextInt();
		    			if(a == 0){
		    				b = 0;
		    			}
		    			if(a == 1){
		    				c = 0;
		    			}
		    			break;
		    		case 2:
		    			System.out.println("请输入租车数量：");
		    			a = out.nextInt();
		    			passengercar.setNum(passengercar.getNum() + a);
		    			System.out.println("操作成功，输入0返回最初页面，输入1继续租车");
		    			a = out.nextInt();
		    			if(a == 0){
		    				b = 0;
		    			}
		    			if(a == 1){
		    				c = 0;
		    			}
		    			break;
		    		case 3:
		    			System.out.println("请输入租车数量：");
		    			a = out.nextInt();
		    			pickup.setNum(pickup.getNum() + a);
		    			System.out.println("操作成功，输入0返回最初页面，输入1继续租车");
		    			a = out.nextInt();
		    			if(a == 0){
		    				b = 0;
		    			}
		    			if(a == 1){
		    				c = 0;
		    			}
		    			break;
		    	default:
		    		System.out.println("输入有误，输入0返回最初页面，输入1租车");
		    		a = out.nextInt();
		    		if(a == 0){
	    				b = 0;
	    			}
		    		if(a == 1){
	    				c = 0;
	    			}
		    		break;
		    	}
		    }
			break;
			
		case 3:
			System.out.println("租车清单");
			System.out.println("车型\t\t"+"数量");
			for(int i = 0;i < carlist.size(); i++){
				if(i != 1){
					System.out.println(carlist.get(i).getCarModel()+"\t\t"+carlist.get(i).getNum());
				}
				if(i == 1){
					System.out.println(carlist.get(i).getCarModel()+"\t"+carlist.get(i).getNum());
				}
			}
			System.out.println("总金额：\t"+ getAllPay(carlist));
			System.out.println("总载货量：\t"+ getAllVolume(carlist));
			System.out.println("总载客量：\t"+ getAllPassenger(carlist));
			System.out.println("任意键返回");
			d = out.next();
		    b = 0;
			break;
		default :
			System.out.println("您的输入有误，任意键返回");
		    d = out.next();
		    b = 0;
			break;
		    }
		}
	}

}
