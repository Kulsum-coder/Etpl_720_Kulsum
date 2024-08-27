package cm.evergent.corejava.kulsum.application4;

public class ExtraItemManagement implements ExtraItems{
private static int extraItemCost;
    
    
    public void displayExtraItems() {
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
		
    }
    
    
    public void selectExtraItem(String itemType) {
        switch (itemType) {
            case "LEAVES":
                extraItemCost = 40;
                break;
            case "WRAPPERS":
                extraItemCost = 10;
                break;
            case "RIBBONS":
                extraItemCost = 20;
                break;
            default:
                extraItemCost = 0;
                break;
        }
    }
    //getter method
    public int getExtraItemCost() {
        return extraItemCost;
    }
	

}
