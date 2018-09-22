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
	//�����ܽ��
	public static double getAllPay(ArrayList<Vehicle> carlist){
		double psum = 0;
		for(int i = 0;i < carlist.size();i++){
			psum = psum + carlist.get(i).getNum() * carlist.get(i).getPrice();
		}
		return psum;
	}
	//�������ػ���
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
	//�������ؿ���
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
		//�ֱ�¼��truck passengercar pickup��Ϣ
		Truck truck = new Truck("truck",500.0,500.0);
		Passengercar passengercar = new Passengercar("passengercar",500.0,50);
		Pickup pickup = new Pickup("pickup",300.0,200.0,20);
		//��������ʼ�⳵������Ϊ0
		truck.setNum(0);
		passengercar.setNum(0);
		pickup.setNum(0);
		carlist.add(truck);
		carlist.add(passengercar);
		carlist.add(pickup);
		while(b == 0){
			c = 0;
			b = 1;
		    System.out.println("1.չʾ���г���");
		    System.out.println("2.�⳵");
		    System.out.println("3.չʾ�⳵�嵥");
		    System.out.println("0.�˳�����");
		    out = new Scanner(System.in);
		    String a = out.next();
		
		    switch(a){
		    case "0":
		    	break;
		    case "1":
			    System.out.println("����"+"\t\t"+"�۸�"+"\t"+"������"+"\t"+"�ؿ���");
			    truck.print();	
			    passengercar.print();
			    pickup.print();
			    System.out.println("���������");
			    d = out.next();		   
			    b = 0;
			    break;
		    case "2":
		    	while(c == 0){
		    		c = 1;
		    		System.out.println("��ѡ�����⳵��");
		    		System.out.println("1.Truck");
		    		System.out.println("2.Passengercar");
		    		System.out.println("3.Pickup");
		    		System.out.println("0.����");
		    		a = out.next();//���⳵��
		    		if(a == "0"){
		    			b = 0;
		    			//System.out.print(b);
		    		}
		    		else{
		    			if(!(a.equals("0")) && !(a.equals("1")) && !(a.equals("2")) && !(a.equals("3"))){
		    				System.out.println("������������1�⳵,���������������ҳ��");
		    				String a3 = out.next();//����1�⳵,���������������ҳ��
		    				if(a3.equals("1")){
		    					c = 0;
		    				}else{
		    					b = 0;
		    				}
		    			}
		    			else{
		    				System.out.println("�������⳵������");
		    				String a2 = out.next();//�⳵������
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
		    					System.out.println("�����ɹ�������1�����⳵�����������������ҳ��");
		    				}
		    				else{
		    					System.out.println("������������1�����⳵�����������������ҳ��");
		    				}
		    				String a3 = out.next();//����1�����⳵�����������������ҳ��
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
			System.out.println("�⳵�嵥");
			System.out.println("����\t\t"+"����");
			for(int i = 0;i < carlist.size(); i++){
				if(i != 1){
					System.out.println(carlist.get(i).getCarModel()+"\t\t"+carlist.get(i).getNum());
				}
				if(i == 1){
					System.out.println(carlist.get(i).getCarModel()+"\t"+carlist.get(i).getNum());
				}
			}
			System.out.println("�ܽ�\t"+ getAllPay(carlist));
			System.out.println("���ػ�����\t"+ getAllVolume(carlist));
			System.out.println("���ؿ�����\t"+ getAllPassenger(carlist));
			System.out.println("���������");
			d = out.next();
		    b = 0;
			break;
		default :
			System.out.println("���������������������");
		    d = out.next();
		    b = 0;
			break;
		    }
		}
	}
}
