package module1;

import java.util.Scanner;

public class Assignment {
	

	public static void main(String args[]) {
		
		double subtotal=0,Discount=0,After=0,gst=0,Amount=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------GROCERY BILL CALCULATOR-----------");
		System.out.println("Enter Customer Name:");
		String name=sc.next();
		System.out.println("Enter the number of Grocery items to be purchased:");
		int item=sc.nextInt();
		String[] itemname = new String[item];
		double[] total=new double[item];
		double[] price=new double[item];
		int[] quant=new int[item];
		
		
		for(int i=0;i<item;i++) {
			System.out.println("Enter Item"+(i+1)+" Name:");
			 itemname[i]=sc.next();
			 while(true) {
			System.out.println("Enter Quantity:");
			quant[i]=sc.nextInt();
			if(quant[i]>0) {
				break;
			}	
			
			else {
				System.out.println("Invalid quantity");
				}
			}
			 while(true) {
			System.out.println("Enter price:");
			 price[i]=sc.nextDouble();
			 if(price[i]>0) {
				 
				 break;
			 }
			 else {
				 System.out.println("invalid price");
				 }
			 }
			 total[i]=quant[i]*price[i];
			
		}
		
		
		System.out.println("=========================================================");
		System.out.println("                     GROCERY BILL                        ");
		System.out.println("=========================================================");
		System.out.println(" Customer Name:"+name);
		System.out.println("   Item  "+" "+"   Quantity   "+" "+"   Price   "+" "+"  Total   ");
		System.out.println("----------------------------------------------------------");
		for(int i=0;i<item;i++) {
			System.out.println(itemname[i]+"          "+quant[i]+"                  "+price[i]+"           "+total[i]);
			subtotal+=total[i];
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("Subtotal:"+subtotal);
		if(subtotal<1000) {
			System.out.println("Discount(0%):0");
		}
		if((subtotal>=1000)&&(subtotal<=4999)) {
			Discount=(subtotal*5)/100;
			System.out.println("Discount(5%):"+Discount);
			
		}
		if((subtotal>=5000)&&(subtotal<=9999)) {
			Discount=(subtotal*10)/100;
			System.out.println("Discount(10%):"+Discount);
		}
		if(subtotal>=10000) {
			Discount=(subtotal*15)/100;
			System.out.println("Discount(15%):"+Discount);
		}
		
		After=subtotal-Discount;
		System.out.println(" Amount After Discount :"+After);
		gst=(After*18)/100;
		System.out.println(" GST(18%) :"+gst);
		System.out.println("----------------------------------------------------------");
		
		Amount=gst+After;
		System.out.println(" Final Payble Amount :"+Amount);
		System.out.println("=========================================================");
		System.out.println(" ----------THANKOU FOR SHOPPING--------------------");
			
		
			
		
		
		
		
		
		
	}

}



