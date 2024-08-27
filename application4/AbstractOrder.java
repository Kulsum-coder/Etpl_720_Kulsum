package cm.evergent.corejava.kulsum.application4;

public abstract class AbstractOrder implements FlowerOrder{
	protected static int flowerCost;//using of static and protected keyword
    protected static int amount;
    protected static int noOfFlowers;
    protected static int amountDisc;
    protected static int extraItemCost;
    
   //method 
    public void selectFlower(String flowerType) {
    	//switch case
        switch (flowerType) {
            case "ROSE":
                flowerCost = 50;
                break;
            case "TULIP":
                flowerCost = 100;
                break;
            case "LILY":
                flowerCost = 200;
                break;
            default:
                flowerCost = 0;
                break;
        }
    }
    //method
    protected void calculateDiscount() {
        if (noOfFlowers >= 1 && noOfFlowers <= 10) 
            amountDisc = (int) (amount - (amount * 0.05));
        else if (noOfFlowers >= 26 && noOfFlowers <= 50)
            amountDisc = (int) (amount - (amount * 0.03));
        else if (noOfFlowers >= 51 && noOfFlowers <= 100)
            amountDisc = (int) (amount - (amount * 0.05));
        else if (noOfFlowers >= 101 && noOfFlowers <= 200)
            amountDisc = (int) (amount - (amount * 0.08));
    }

}
