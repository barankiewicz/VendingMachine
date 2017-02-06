/**
 * 
 */

/**
 * @author fob509
 *
 */
public class VendingItem {
	private String name;
	private int price;
	private int stock;
	private int quant = 0;
	
	public VendingItem(String name, int price, int stock){
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.quant = this.quant + 1;
	}
	
	public String getItemName(){
		return this.name;
	}
	
	public int getItemPrice(){
		return this.price;
	}
	
	public boolean stockLeft(){
		return this.stock != 0;
	}
	
	public String toString(){
		String leftAlignFormat = "| %-3S | %-15S | %-7s | %-7S |";
		return String.format(leftAlignFormat,this.quant,this.name,this.price/100.0, this.stock);
	}
	
	public void buyItem(){
		if (this.stock != 0) {this.stock--;}
	}
	
//	public static void main(String[] args){
//		
//		VendingItem choc = new VendingItem("Chocolate", 5, 2);
//		System.out.println(choc);
//		System.out.println(choc.getItemName());
//		System.out.println(choc.getItemPrice());
//		System.out.println(choc.stockLeft());
//		choc.buyItem();
//		System.out.println(choc);
//		choc.buyItem();
//		System.out.println(choc);
//		System.out.println(choc.stockLeft());
//	}

}
