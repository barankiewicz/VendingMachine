/**
 * @author fob509
 *
 */
public class VendingSystem {

	/**
	 * @param args
	 */
	static VendingItem chocolate = new VendingItem("Chocolate", 57, 5);
	static VendingItem cola = new VendingItem("Cola", 71, 3);
	static VendingItem crisps = new VendingItem("Crisps", 34, 4);
	static VendingItem curryPot = new VendingItem("Curry Pot", 349, 1);
	static private int STARTING_MONEY = 500;
	private int change;
	private int cost;
	private String receipt;
	
	public static void main(String[] args) {
		VendingSystem.doMenu();
		VendingSystem.buyItem(curryPot);
		VendingSystem.doMenu();
		VendingSystem.buyItem(curryPot);
		VendingSystem.doMenu();
		VendingSystem.buyItem(curryPot);
		VendingSystem.doMenu();
		

	}
	public static void doMenu(){
		System.out.println("+-------------------------------------------+");
		System.out.println("|  #  |  Menu Item      |  Price  |  Stock  |");
		System.out.println("+-------------------------------------------+");
		System.out.println(VendingSystem.chocolate);
		System.out.println(VendingSystem.cola);
		System.out.println(VendingSystem.crisps);
		System.out.println(VendingSystem.curryPot);
		System.out.println("+-------------------------------------------+");
	}
	
	private static void buyItem(VendingItem item){
		if (item.stockLeft()){
			if(STARTING_MONEY - item.getItemPrice() >= 0) {
				item.buyItem();
				STARTING_MONEY -= item.getItemPrice();
			} else {
				System.out.println("You have no money for that!");
			}	
			
		} else {
			System.out.println("There is no more items left!");
		}
	}

}
