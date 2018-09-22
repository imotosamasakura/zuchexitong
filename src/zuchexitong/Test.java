package zuchexitong;
import java.util.Scanner;
import java.util.ArrayList;
public class Test {
	private static Scanner out;
	public static boolean isNumeric(String str){
		    for (int i = str.length();--i>=0;){  
		        if (!Character.isDigit(str.charAt(i))){
		            return false;
		        }
		    }
		    return true;
		 }
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
			if(carlist.get(i) instanceof Truck){
				Truck truck1 = (Truck)carlist.get(i);
				vsum = vsum + truck1.getNum() * truck1.getVolumeOfCargo();
			}
			if(carlist.get(i) instanceof Pickup){
				Pickup pickup1 = (Pickup)carlist.get(i);
				vsum = vsum + pickup1.getNum() * pickup1.getVolumeOfCargo();
			}
		}
		return vsum;
	}
	//计算总载客量
	public static int getAllPassenger(ArrayList<Vehicle> carlist){
		int pasum = 0;
		for(int i = 0;i < carlist.size();i++){
			if(carlist.get(i) instanceof Passengercar){
				Passengercar passengercar1 = (Passengercar)carlist.get(i);
				pasum = pasum + passengercar1.getNum() * passengercar1.getNumOfPassenger();
			}
			if(carlist.get(i) instanceof Pickup){
				Pickup pickup1 = (Pickup)carlist.get(i);
				pasum = pasum + pickup1.getNum() * pickup1.getNumOfPassenger();
			}
		}
			return pasum;
	}

	public static void main(String []args){
		int b = 0,c = 0;
		String d;
		ArrayList<Vehicle> carlist = new ArrayList<Vehicle>();
		//分别录入truck passengercar pickup信息
		Truck truck = new Truck("truck",500.0,500.0);
		Passengercar passengercar = new Passengercar("passengercar",500.0,50);
		Pickup pickup = new Pickup("pickup",300.0,200.0,20);
		//将车辆初始租车数量设为0
		truck.setNum(0);
		passengercar.setNum(0);
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
		    System.out.println("0.退出程序");
		    out = new Scanner(System.in);
		    String a = out.next();
		
		    switch(a){
		    case "0":
		    	break;
		    case "1":
			    System.out.println("车型"+"\t\t"+"价格"+"\t"+"载重量"+"\t"+"载客量");
			    truck.print();	
			    passengercar.print();
			    pickup.print();
			    System.out.println("任意键返回");
			    d = out.next();		   
			    b = 0;
			    break;
		    case "2":
		    	while(c == 0){
		    		c = 1;
		    		System.out.println("请选择所租车型");
		    		System.out.println("1.Truck");
		    		System.out.println("2.Passengercar");
		    		System.out.println("3.Pickup");
		    		System.out.println("0.返回");
		    		a = out.next();//所租车型
		    		if(a == "0"){
		    			b = 0;
		    			//System.out.print(b);
		    		}
		    		else{
		    			if(!(a.equals("0")) && !(a.equals("1")) && !(a.equals("2")) && !(a.equals("3"))){
		    				System.out.println("输入有误，输入1租车,输入其他返回最初页面");
		    				String a3 = out.next();//输入1租车,输入其他返回最初页面
		    				if(a3.equals("1")){
		    					c = 0;
		    				}else{
		    					b = 0;
		    				}
		    			}
		    			else{
		    				System.out.println("请输入租车数量：");
		    				String a2 = out.next();//租车的数量
		    				if(isNumeric(a2) && Integer.parseInt(a2) > 0){
		    					if(a.equals("1")){
		    						truck.setNum(truck.getNum() + Integer.parseInt(a2));
		    					}
		    					if(a.equals("2")){
		    						passengercar.setNum(passengercar.getNum() + Integer.parseInt(a2));
		    					}
		    					if(a.equals("3")){
		    						pickup.setNum(pickup.getNum() + Integer.parseInt(a2));
		    					}
		    					System.out.println("操作成功，输入1继续租车，输入其他返回最初页面");
		    				}
		    				else{
		    					System.out.println("输入有误，输入1继续租车，输入其他返回最初页面");
		    				}
		    				String a3 = out.next();//输入1继续租车，输入其他返回最初页面
		    				if(a3.equals("1")){
		    					c = 0;
		    				}
		    				else{
		    					b = 0;
		    				}
		    			}
		    		}
		    	}
			break;
		case "3":
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
