import java.util.Scanner;
	public class HotelGuide {
	public static void main(String[] args) 
	{
		Scanner m = new Scanner(System.in);

	    System.out.println("$$**Welcome to Super Market**$$");
		System.out.println("*Please enter your name*");
		String name = m.nextLine();
		System.out.println("**Welcome @"+name);
		System.out.println("***MARKET-MENU***");
		
             System.out.println("a. Dairy");
			 System.out.println("b. Fruits");
			 System.out.println("c. Vegetables");
			 System.out.println("d. Snacks");
			 System.out.println("e. Stationery");
			 System.out.println("choice item character");
			 char choice = m.next().charAt(0);

		switch (choice)
{
			   case 'a':
			{
				System.out.println("In Dairy products we have:");

				System.out.println("1) Eggs");
				System.out.println("2) Milk");
				System.out.println("3) Paneer 100gm");
				System.out.println("4) Bread");
				System.out.println("5) Butter");
				System.out.println("6) Cheese");
				
				
				System.out.println("Choose Product number");
				int num1 = m.nextInt();
				switch (num1)
				{
					
					 case 1: 
					{  
						 System.out.println("You have selected: Eggs");
						 System.out.println("price=6 Rs..");
						int egg=6;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minuites");
						System.out.println("Your order amount is:="+egg*quantity);
						System.out.println("Thank You Please visit Again");
						break;
					}
					 case 2:
					{    
					    System.out.println("You have selected: Milk");
						System.out.println("price=20 Rs..");
						int mi=20;
					    System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minuites");
						System.out.println("Your order amount is:="+mi*quantity);
						System.out.println("Thank You Please visit Again");
						
						break;
					}
					 case 3:
					{ 
						 System.out.println("You have selected: Paneer 100gm");
						 System.out.println("price=80 Rs..");
						int pnr=80;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
				      System.out.println("Your order will be delivered in 25 minuites");
					    System.out.println("Your order amount is: "+pnr*quantity);
					    System.out.println("Thank You Please visit Again");
						break;
					}
					 case 4:
					{
						System.out.println("You have selected: Bread");
						System.out.println("price=20 Rs..");
						int brd=20;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minuites");
						System.out.println("Your order amount is:="+brd*quantity);
						System.out.println("Thank You Please visit Again");
						break;
					}
					 case 5:
					 {
						 System.out.println("You have selected: Butter");
						 System.out.println("price=50 Rs..");
						int btr=50;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minuites");
						System.out.println("Your order amount is:="+btr*quantity);
						System.out.println("Thank You Please visit Again");
						break;
					 }
					 case 6:
					{
						 System.out.println("You have selected: Cheese");
						 System.out.println("price=35 Rs..");
						int chse=35;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minuites");
						System.out.println("Your order amount is:="+chse*quantity);
						System.out.println("Thank You Please visit Again");
						break;

					}
					}
							
					break;
			}

			   case 'b':
			
			{
				System.out.println("In Fruits we have:");

				System.out.println("1) Alphonso Mango 1 dzn");
				System.out.println("2) Watermelon");
				System.out.println("3) Apple");
				System.out.println("4) Strrawberry");
				System.out.println("5) Pineapple");
				System.out.println("6) Banana 1 dzn");
				
				
				System.out.println("Choose Product number");
				int num2 = m.nextInt();
				switch (num2)
				{
					
					 case 1: 
					{ 
					     System.out.println("You have selected: Alphonso Mango 1 dzn");
						 System.out.println("price=400 Rs..");
						  int am=400;
						 System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minutes");
						System.out.println("Your order amount is: "+am*quantity);
						System.out.println("Thank You Please visit Again");
						break;
					}
					 case 2:
					{
						
					     System.out.println("You have selected: Watermelon");
						 System.out.println("price=70 Rs..");
						  int wtn=70;
						 System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minutes");
						System.out.println("Your order amount is: "+wtn*quantity);
						System.out.println("Thank You Please visit Again");
						break;
					}
					 case 3:
					{
						
					     System.out.println("You have selected: Apple");
						 System.out.println("price=15 Rs..");
						  int apl=15;
						 System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minutes");
						System.out.println("Your order amount is: "+apl*quantity);
						System.out.println("Thank You Please visit Again");
						break;
					}
					 case 4:
					{
						
					     System.out.println("You have selected:  Strrawberry");
						 System.out.println("price=300 Rs..");
						  int sby=300;
						 System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minutes");
						System.out.println("Your order amount is: "+sby*quantity);
						System.out.println("Thank You Please visit Again");
						break;
					}
					 case 5:
					 {
						
					     System.out.println("You have selected: Pineapple");
						 System.out.println("price=120 Rs..");
						  int ple=120;
						 System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minutes");
						System.out.println("Your order amount is: "+ple*quantity);
						System.out.println("Thank You Please visit Again");
						break;
					 }
					 case 6:
					{
						
					     System.out.println("You have selected: Banana 1 dzn");
						 System.out.println("price=50 Rs..");
						  int bna=50;
						 System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minutes");
						System.out.println("Your order amount is: "+bna*quantity);
						System.out.println("Thank You Please visit Again");
						break;
					}
					
						
					}
					break;
			}

               case 'c':
				{
					 System.out.println("Which Vegetables would you like to buy :");

					 System.out.println("1) Onion 1kg");
					 System.out.println("2) Potato 1kg");
					 System.out.println("3) Tomato 1kg");
					 System.out.println("4) Cabbage 1kg");
					 System.out.println("5) Brinjal 500gm");
					 System.out.println("6) Lady Finger 500gm");

					 System.out.println("Select Product Number");
					 int num3=m.nextInt();

					 switch (num3)
					 {
					 case 1:
						 {
						    System.out.println("You have selected: Onion 1kg");
						 System.out.println("price=50 Rs..");
						  int oni=50;
						 System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minutes");
						System.out.println("Your order amount is: "+oni*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
				     case 2 :
						 {  
						 System.out.println("You have selected: Potato 1kg");
						 System.out.println("price=40 Rs..");
						  int pto=40;
						 System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minutes");
						System.out.println("Your order amount is: "+pto*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
					 case 3 :
						 {  
						    System.out.println("You have selected: Tomato 1kg");
						 System.out.println("price=80 Rs..");
						  int tmt=80;
						 System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minutes");
						System.out.println("Your order amount is: "+tmt*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
					 case 4 : 
						 { 
						     System.out.println("You have selected: Cabbage 1kg");
						 System.out.println("price=60 Rs..");
						  int cab=60;
						 System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minutes");
						System.out.println("Your order amount is: "+cab*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
					 case 5 :
						 {
						    System.out.println("You have selected: Brinjal 500gm");
						 System.out.println("price=70 Rs..");
						  int bri=70;
						 System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minutes");
						System.out.println("Your order amount is: "+bri*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
					case 6 :
						 {  
						    System.out.println("You have selected:Lady Finger 500gm");
						 System.out.println("price=30 Rs..");
						  int ldf=30;
						 System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minutes");
						System.out.println("Your order amount is: "+ldf*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
					 
					 }
					 break;
				}

			   case'd':
				{
					 System.out.println("Which Snacks would you like to buy :");

					 System.out.println("1) Lays 300gm");
					 System.out.println("2) Oreo 120gm");
					 System.out.println("3) Popcorn 50gm");
					 System.out.println("4) Soya Sticks 100gm");
					 System.out.println("5) Doritos 500gm");
					 System.out.println("6) Maaza 1 Ltr");

					 System.out.println("Select Product Number");
					 int num4=m.nextInt();

					 switch (num4)
					 {
					 case 1 :
						 { 
						     System.out.println("You have selected: Lays 300gm");
						 System.out.println("price=30 Rs..");
						int lys=30;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minuites");
						System.out.println("Your order amount is:="+lys*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
				     case 2 :
						 {
							 System.out.println("You have selected: Oreo 120gm");
						 System.out.println("price=20 Rs..");
						int oeo=20;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minuites");
						System.out.println("Your order amount is:="+oeo*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
					 case 3 :
						 { 
						      System.out.println("You have selected: Popcorn 50gm");
						 System.out.println("price=25 Rs..");
						int ppn=25;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minuites");
						System.out.println("Your order amount is:="+ppn*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
					 case 4 :
						 {  
						     System.out.println("You have selected: Soyo Sticks 100gm");
						 System.out.println("price=20 Rs..");
						int sts=20;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minuites");
						System.out.println("Your order amount is:="+sts*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
					 case 5 :
						 {
						     System.out.println("You have selected: Doritos 500gm");
						 System.out.println("price=50 Rs..");
						int dori=50;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minuites");
						System.out.println("Your order amount is:="+dori*quantity);
						System.out.println("Thank You Please visit Again");
						System.out.println("Thank You Please visit Again");
						break;
						 }
					case 6 :
						 { 
						     System.out.println("You have selected: Mazza 1 ltr");
						 System.out.println("price=90 Rs..");
						int mza=90;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minuites");
						System.out.println("Your order amount is:="+mza*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
					 
					 }
						break;
				}
				 case'e':
				{
					 System.out.println("Which Stationery would you like to buy :");

					 System.out.println("1) Notebook");
					 System.out.println("2) Markar Pen");
					 System.out.println("3) pencil");
					 System.out.println("4) File Folder");
					 System.out.println("5) Crayon");
					 System.out.println("6)  Eraser");

					 System.out.println("Select Product Number");
					 int num5=m.nextInt();

					 switch (num5)
					 {
					 case 1 :
						 { 
						     System.out.println("You have selected: Notebook");
						 System.out.println("price=50 Rs..");
						int nb=50;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 20 minuites");
						System.out.println("Your order amount is:="+nb*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
				     case 2 :
						 {
							 System.out.println("You have selected:Markar Pen");
						 System.out.println("price=20 Rs..");
						int mkp=20;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 20 minuites");
						System.out.println("Your order amount is:="+mkp*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
					 case 3 :
						 { 
						      System.out.println("You have selected: Pencil");
						 System.out.println("price=10 Rs..");
						int pnl=10;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 20 minuites");
						System.out.println("Your order amount is:="+pnl*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
					 case 4 :
						 {  
						     System.out.println("You have selected: File Folder");
						 System.out.println("price=55 Rs..");
						int ffr=55;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 20 minuites");
						System.out.println("Your order amount is:="+ffr*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
					 case 5 :
						 {
						     System.out.println("You have selected:Crayon");
						 System.out.println("price=80 Rs..");
						int cyn=80;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minuites");
						System.out.println("Your order amount is:="+cyn*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }
					case 6 :
						 { 
						     System.out.println("You have selected: Eraser");
						 System.out.println("price=10 Rs..");
						int er=10;
						System.out.println("Enter your quantity:");
						  int quantity =m.nextInt();
						System.out.println("Your order will be delivered in 25 minuites");
						System.out.println("Your order amount is:="+er*quantity);
						System.out.println("Thank You Please visit Again");
						break;
						 }

					}
					    break;
			    }
}
	}
}  




