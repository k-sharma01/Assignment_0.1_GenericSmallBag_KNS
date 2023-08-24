/**
 * This class is the application
 * @author Kirin Sharma
 * CS215 Lab 0.1
 * @version 1.0
 *
 */

public class Application 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Instantiates an Item of type String
		Item<String> exampleItem1 = new Item<String>();
		exampleItem1.setE("Kirin Sharma");
		
		// Instantiate an Item of type Integer
		Item<Integer> exampleItem2 = new Item<Integer>();
		exampleItem2.setE(19);
		
		// Instantiates a Small Bag that holds an Item
		SmallBag<Item> mySmallBag = new SmallBag<Item>();
		mySmallBag.setItem(exampleItem1);
		
		// Expected output: Kirin Sharma
		System.out.println(mySmallBag.getItem().getE());
		
		mySmallBag.setItem(exampleItem2);
		// Expected outplut: 19
		System.out.println(mySmallBag.getItem().getE());
		
	} // end main

} // end Application
