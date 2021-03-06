package net.picklez.as.exercises.linkedlists.examples;

import java.util.LinkedList;

import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 * @since 27 Nov 2015 | 13:39:18
 */

public class ShoppingCart {

	/**
	 *  'Can you write a shopping cart application to link different items
	 *  (unit price, quantity, item description, sub total) and link
	 *  them together?
	 */
	public static void main(String[] args) {
		LinkedList<ShoppingItem> basket = new LinkedList<ShoppingItem>();
		basket.add(new ShoppingItem(5.99, 6, "Limited edition ting"));
		basket.add(new ShoppingItem(3.00, 1, "�3 zoot"));
		
		for (ShoppingItem item : basket) {
			System.out.println(item.asString());
		}
	}
}

class ShoppingItem {
	
	private double price;
	private int quant;
	private String desc;
	
	public ShoppingItem(double price, int quantity, String description) {
		this.price = price;
		this.quant = quantity;
		this.desc = description;
	}
	
	public void setPrice(double d) {
		this.price = d;
	}
	
	public void setQuantity(int i) {
		this.quant = i;
	}
	
	public void setDescription(String s) {
		this.desc = s;
	}
	
	public double getOverallPrice() {
		return this.price * this.quant;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quant;
	}
	
	public String getDescription() {
		return this.desc;
	}
	
	public String asString() {
		return StringUtils.formatString("ShoppingItem[Price='{0}', Quantity='{1}', Description='{2}']", this.price, this.quant, this.desc);
	}
}