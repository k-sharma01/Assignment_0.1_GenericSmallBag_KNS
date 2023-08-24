/**
 * This class represents a generic Item of type T
 * @author Kirin Sharma
 * CS215 Lab 0.1
 * @version 1.0
 *
 */

public class Item<T>
{

	private T e; //holds an item of type T
	
	/**
	 * Setter for e
	 * @param item
	 */
	public void setE(T item)
	{
		e = item;
	} // end setE
	
	/**
	 * Getter for e
	 * @return
	 */
	public T getE()
	{
		return e;
	} // end getE
	
} // end class
