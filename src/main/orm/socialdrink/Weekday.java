/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package socialdrink;

public class Weekday {
	public Weekday() {
	}
	
	private int ID;
	
	private String day;
	
	private boolean isOpen;
	
	private int opening;
	
	private int closure;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDay(String value) {
		this.day = value;
	}
	
	public String getDay() {
		return day;
	}
	
	public void setIsOpen(boolean value) {
		this.isOpen = value;
	}
	
	public boolean getIsOpen() {
		return isOpen;
	}
	
	public void setOpening(int value) {
		this.opening = value;
	}
	
	public int getOpening() {
		return opening;
	}
	
	public void setClosure(int value) {
		this.closure = value;
	}
	
	public int getClosure() {
		return closure;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
