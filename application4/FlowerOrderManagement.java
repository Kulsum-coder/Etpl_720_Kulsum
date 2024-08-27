package cm.evergent.corejava.kulsum.application4;

public class FlowerOrderManagement extends AbstractOrder{
	public void displayFlowers() {

		System.out.println("Flowers \t Description \t Charge for 5Flowers ");
		System.out.println("=====================================================");
		System.out.println("ROSE \t\t Red Rose \n \t\t Pink Rose \n\t\t YellowRose \n\t\t white Rose \n\t\t Orange Rose \t\t Rs50.00");
		System.out.println("");
		System.out.println("TULIP \t\t Pink Tulip \n\t\t White Tulip \n\t\t Orange Tulip \n\t\t Red Tulip \n\t\t Yellow Tulip \t\t Rs100.00");
		System.out.println("");
		System.out.println("LILY \t\t White Lily \n\t\t Pink Lily \n\t\t Purple Lily \n\t\t Red Hibiscus \n\t\t Orange Hibiscus \t Rs200.00");
		System.out.println("=====================================================");
		
    }
    
    public void orderFlowers(String flowerType, int quantity) {
        selectFlower(flowerType);
        noOfFlowers = quantity;
        amount = flowerCost * noOfFlowers;
        calculateDiscount();
    }
	
}
