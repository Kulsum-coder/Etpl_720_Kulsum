package com.evergent.corejava.kulsum.application2;

import java.io.IOException;
import java.util.Scanner;

public class EventManagement_Kulsum {

	enum module1 {ORDER,PAYMENT,INVOICE,EXIT};
	enum submodule1 {FLOWER,ITEMS,EXIT};
	enum submodule2  {BILL,TOTAL_BILL,EXIT};
	enum submodule3  {CHARGE,SUMMARY,EXIT};
	enum flowers_c {ROSE,TULIP,LILY};
	enum extra {LEAVES,WRAPPERS,RIBBONS};
	static int flowercost;
	static int amount;
	static int no_of_flowers;
	static int amountdisc;
	static int extraitemcost;
	public static void main(String[] args) throws IOException {
		  String module = null;
		
		  Scanner br =new Scanner(System.in);
		System.out.println("\n\t\t\t\t\t^^^^^^^^^FLORA STORE^^^^^^^^^");
	    System.out.println("\n\t\t\t\t*********Create your own bouquet**********");
	    System.out.println("\n\t\t\t\t---------LET YOUR DREAMS BLOSSOM----------");
	    
		while(true)
		{
	
	  
	    System.out.println("<><><><><><><><><><><><><><><><><>");
		System.out.println("<><><><><><><><><><><><><><><><><>");
		System.out.println(" \tHOME ");
		System.out.println("<><><><><><><><><><><><><><><><><>");
		System.out.println("<><><><><><><><><><><><><><><><><>");
		System.out.println("ORDER->Order Your Flowers");
		System.out.println("PAYMENT->Payment Details");
		System.out.println("INVOICE->Invoice Details");
		System.out.println("EXIT->Exit");
		System.out.println("<><><><><><><><><><><><><><><><><>");
	    System.out.println("Enter your Module code (ORDER,PAYMENT,INVOICE,EXIT) : ");


module=br.nextLine();
System.out.println("You entered module is  : " );  
switch(module1.valueOf(module))
{

case ORDER:
	
System.out.println(" Order Your Flowers");
System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
System.out.println("FLOWER-To Choose Your Flowers");
System.out.println("ITEMS-To Choose Extra Items");
System.out.println("EXIT-Return to HomePage");
System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
System.out.println("Enter your Module code (FLOWER,ITEMS,EXIT) : ");

	module=br.nextLine();
switch(submodule1.valueOf(module))
{
		case FLOWER:
			
			
			System.out.println("Flowers \t Description \t Charge for 5Flowers ");
			System.out.println("=====================================================");
			System.out.println("ROSE \t\t Red Rose \n \t\t Pink Rose \n\t\t YellowRose \n\t\t white Rose \n\t\t Orange Rose \t\t Rs50.00");
			System.out.println("");
			System.out.println("TULIP \t\t Pink Tulip \n\t\t White Tulip \n\t\t Orange Tulip \n\t\t Red Tulip \n\t\t Yellow Tulip \t\t Rs100.00");
			System.out.println("");
			System.out.println("LILY \t\t White Lily \n\t\t Pink Lily \n\t\t Purple Lily \n\t\t Red Hibiscus \n\t\t Orange Hibiscus \t Rs200.00");
			System.out.println("=====================================================");
			System.out.println("Enter your Menu code (ROSE,TULIP,LILY): ");
			
			
			module=br.nextLine();
			switch(flowers_c.valueOf(module))
			{

			case ROSE:
				flowercost=50;
				break;
			case TULIP:
				flowercost=50;
				break;
			case LILY:
				flowercost=50;
				break;
			}
			
			
			
			System.out.println("Enter No.Of Quantity : ");
			
			no_of_flowers =Integer.parseInt( br.nextLine());
			System.out.println("you selected no of flowers are "+no_of_flowers);
			 amount=flowercost*no_of_flowers;
			
			System.out.println("Amount for flowers before discount is Rs"+amount);
			if(no_of_flowers >= 1 && no_of_flowers <=10) 
				amountdisc=(int) (amount-(amount*0.05));
			if( no_of_flowers>= 26 && no_of_flowers <=50)
				amountdisc=(int) (amount-(amount*0.03));
			else if(no_of_flowers >= 51 && no_of_flowers <=100)
				amountdisc=(int) ((amount-amount*0.05));
			else if(no_of_flowers >= 101 && no_of_flowers <=200)
				amountdisc=(int) ((amount-amount*0.08));
			System.out.println("Amount of flowers after Discount for selected flowersis  Rs"+amountdisc);
			
			
			
		break;
		case ITEMS:
			
			System.out.println("Item \t\tDescription  \t\t Charge per Unit ");
			System.out.println("========================================================================");
			System.out.println("LEAVES \t\tLeaves for\n\t\tBoquet \t\t\tRs 40.00 per unit of 1Bunch ");
			System.out.println("");
			System.out.println("WRAPPERS \tWrapper Covers \t\tRs10.00 per unit of 1 Cover");
			System.out.println("");
			System.out.println("RIBBONS \tRibbons \t\tRs20.00 per unit of 1Ribbon");
			System.out.println("");
			System.out.println("========================================================================");
			System.out.println("Enter your Menu code (LEAVES,WRAPPERS,RIBBONS) : ");
			
			module=br.nextLine();
			
			switch(extra.valueOf(module))
			{

			case LEAVES:
				extraitemcost=40;
				break;
			case WRAPPERS:
				extraitemcost=10;
				break;
			case RIBBONS:
				extraitemcost=20;
				break;
			}
			
			System.out.println("Your Extra Cost : Rs "+extraitemcost);
			
			
		break;
default:
	break;	
		}
		 break;
		 
		case PAYMENT:
			System.out.println("  For Payment ");
			System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
			System.out.println("BILL-To display total amount to be paid");
			System.out.println("TOTAL_BILL-To display amount after discount to be paid");
			System.out.println("EXIT-Return to Main Menu");
			System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
			System.out.println("Enter your Module code (BILL,TOTAL_BILL,EXIT) : ");

			module=br.nextLine();
			switch(submodule2.valueOf(module))
			{

			case BILL:
				System.out.println("Total Amount to be Paid Befre Discount: Rs"+(amount+extraitemcost));
			break;
			case TOTAL_BILL:System.out.println("Amount after Discount: Rs"+(amountdisc+extraitemcost));
			break;
			default:
				break;	
			}
			break;
			
					
		case INVOICE:

		System.out.println(" DETAILS Module");
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println("CHARGE-To Dispaly invoice for Flower Order");
		System.out.println("SUMMARY-To Display the summary of orders and Discounts");
		System.out.println("EXIT-Return to Main Menu");
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println("Enter your Module code (CHARGE,SUMMARY,EXIT) : ");

			module=br.nextLine();
		switch(submodule3.valueOf(module))
		{
		case CHARGE:
		System.out.println("CHARGE Of Ordered flowers");
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println("you selected flowers  cost Rs"+amount);
		System.out.println("you selected no of flowers are "+no_of_flowers);
		System.out.println("Amount for ordered flowers after Discount for selected flowers is  Rs"+amountdisc);
		System.out.println("Your extra Cost : Rs "+extraitemcost);
		System.out.println("Total Amount to be Paid : Rs"+(amount+extraitemcost));
		System.out.println("To Make Payment : Rs"+(amountdisc+extraitemcost));
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>'");
		break;
		case SUMMARY:
		System.out.println("Summary Of Order");
		System.out.println("<><><><><><><><><><><>");
		System.out.println("you selected FLOWERS cost Rs"+amount);
		System.out.println("you selected no of QUANTITY are "+no_of_flowers);
		System.out.println("Amount for ordered FLOWERS after Discount is  Rs"+amountdisc);
		System.out.println("Your EXTRA ITEM Cost : Rs "+extraitemcost);
		System.out.println("\n");
		System.out.println("Total Amount : Rs"+(amount+extraitemcost));
		System.out.println("To Make Payment : Rs"+(amountdisc+extraitemcost));
		System.out.println("<><><><><><><><><><><>");

		break;
		default:
			break;	
		}
		break;
		case EXIT:
		System.out.println("EXIT");
		System.out.println("<><><><><><><><><><><>");
		System.out.println("<><><><><><><><><><><>");
		System.out.println("THANK YOU FOR SHOPPING");
		System.out.println("HAVE A NICE DAY!!!");
		System.exit(0);
			break;
				}
				}
			}

		}
