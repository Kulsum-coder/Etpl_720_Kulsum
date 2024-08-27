package cm.evergent.corejava.kulsum.application4;

public class PaymentManagement implements Payment{
	private static int amount;
   private static int extraItemCost;
    private static int amountDisc;
    
    public PaymentManagement(int amount, int extraItemCost, int amountDisc) {
    	PaymentManagement.amount = amount;
        PaymentManagement.extraItemCost = extraItemCost;
        PaymentManagement.amountDisc = amountDisc;
    }
    
   
    public void displayPaymentDetails() {
        System.out.println("For Payment");
        System.out.println("BILL - Total amount to be paid before discount");
        System.out.println("TOTAL_BILL - Amount after discount to be paid");
    }
    
    public void displayBill() {
        System.err.println("Total Amount to be Paid Before Discount: Rs" + (amount + extraItemCost));
    }
    
    public void displayTotal_Bill() {
        System.err.println("Amount after Discount: Rs" + (amountDisc + extraItemCost));
    }
	

}
