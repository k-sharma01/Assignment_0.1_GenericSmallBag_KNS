/**
 * This class represents a generic SmallBag
 * @author Kirin Sharma
 * CS215 Lab 0.1
 * @version 1.0
 *
 */

public class SmallBag<T> 
{

	private T item; // holds an item of type T

	/**
	 * Getter for item
	 * @return item
	 */
	public T getItem() 
	{
		return item;
	} // end getItem

	/**
	 * Setter for item
	 * @param item the item to set
	 */
	public void setItem(T item) 
	{
		this.item = item;
	} // end setItem
	
	
} // end class
