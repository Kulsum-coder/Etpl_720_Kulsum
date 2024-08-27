package cm.evergent.corejava.kulsum.application4;
import java.io.IOException;
import java.util.Scanner;
//main class
public class BoquetServiceApp {
	public static  void main(String[] args) {
		//using scanner
		 Scanner scanner = new Scanner(System.in);
		    System.out.println("\n\t\t\t\t\t^^^^^^^^^FLORA STORE^^^^^^^^^");
		    System.out.println("\n\t\t\t\t*********Create your own bouquet**********");
		    System.out.println("\n\t\t\t\t---------LET YOUR DREAMS BLOSSOM----------");
		    //creation of objects
	        FlowerOrderManagement flowerOrderManagement = new FlowerOrderManagement();
	        ExtraItemManagement extraItemsManagement = new ExtraItemManagement();
	        while (true) { 
	        	//open lines for application
	        	System.out.println("<><><><><><><><><><><><><><><><><>");
	            System.out.println(" \tHOME ");
	            System.out.println("<><><><><><><><><><><><><><><><><>");
	            System.out.println("ORDER -> Order Your Flowers");
	            System.out.println("PAYMENT -> Payment Details");
	            System.out.println("INVOICE -> Invoice Details");
	            System.out.println("EXIT -> Exit");
	            System.out.println("<><><><><><><><><><><><><><><><><>");
	            System.out.println("Enter your Module code (ORDER, PAYMENT, INVOICE, EXIT) : ");
	            
	            String module = scanner.nextLine().toUpperCase();
	            
	            switch (module) {
	                case "ORDER":
	                	flowerOrderManagement.displayFlowers();
	                    System.out.println("Enter flower type (ROSE, TULIP, LILY): ");
	                    String flowerType = scanner.nextLine().toUpperCase();
	                    System.out.println("Enter quantity: ");
	                    int quantity = Integer.parseInt(scanner.nextLine());
	                    flowerOrderManagement.orderFlowers(flowerType, quantity);
	                    System.out.println("Enter extra item (LEAVES, WRAPPERS, RIBBONS) or type EXIT to skip: ");
	                    String extraItem = scanner.nextLine().toUpperCase();
	                    if (!extraItem.equals("EXIT")) {
	                        extraItemsManagement.selectExtraItem(extraItem);
	                    }
	                    
	        
	                    break;
	                
	                case "PAYMENT":
	                	System.out.println("  For Payment ");
	        			System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
	        			System.out.println("BILL-To display total amount to be paid");
	        			System.out.println("TOTAL_BILL-To display amount after discount to be paid");
	        			System.out.println("EXIT-Return to Main Menu");
	        			System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
	        			System.out.println("Enter your Module code (BILL,TOTAL_BILL,EXIT) : ");
	        			int extraCost = extraItemsManagement.getExtraItemCost();
	        			PaymentManagement paymentManagement1 = new PaymentManagement(
	                            AbstractOrder.amount,
	                            extraCost,
	                            AbstractOrder.amountDisc
	                    );
	        			paymentManagement1.displayPaymentDetails();
	                    String paymentChoice1 = scanner.nextLine().toUpperCase();
	                    if (paymentChoice1.equals("BILL")) {
	                        paymentManagement1.displayBill();
	                    } 
	                    else if (paymentChoice1.equals("TOTAL_BILL")) {
	                        paymentManagement1.displayTotal_Bill();
	                    }
	  
	                    break;
	                
	                case "INVOICE":
	                    System.out.println("Details Module");
	                    System.out.println("CHARGE - Display invoice for Flower Order");
	                    System.out.println("SUMMARY - Display the summary of orders and Discounts");
	                    System.out.println("Enter your Module code (CHARGE, SUMMARY) : ");
	                    String invoiceChoice = scanner.nextLine().toUpperCase();
	                    if (invoiceChoice.equals("CHARGE")) {
	                        System.err.println("Charge Of Ordered Flowers");
	                        System.err.println("Selected flowers cost Rs" + AbstractOrder.amount);
	                        System.err.println("Amount after Discount for selected flowers is Rs" + AbstractOrder.amountDisc);
	                        System.err.println("Extra Item Cost: Rs" + extraItemsManagement.getExtraItemCost());
	                        System.err.println("To Make Payment: Rs" + (AbstractOrder.amountDisc + extraItemsManagement.getExtraItemCost()));
	                    } else if (invoiceChoice.equals("SUMMARY")) {
	                        System.err.println("Summary Of Order");
	                        System.err.println("Selected flowers cost Rs" + AbstractOrder.amount);
	                        System.err.println("Quantity: " + AbstractOrder.noOfFlowers);
	                        System.err.println("Amount after Discount: Rs" + AbstractOrder.amountDisc);
	                        System.err.println("Extra Item Cost: Rs" + extraItemsManagement.getExtraItemCost());
	                        System.err.println("Total Amount: Rs" + (AbstractOrder.amountDisc + extraItemsManagement.getExtraItemCost()));
	                    }
	                    break;
	                
	                case "EXIT":
	                    System.out.println("^^^^^^^^^THANK YOU FOR SHOPPING^^^^^^^^^^^");
	                    System.out.println("^^^^^^^^^^^^HAVE A NICE DAY!!!^^^^^^^^^^^^");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid module code.");
	                    break;
	            }
	        }
	}

	}


