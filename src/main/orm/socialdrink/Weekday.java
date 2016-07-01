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
	
	private int day;
	
	private String opening;
	
	private String closure;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDay(int value) {
		this.day = value;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setOpening(String value) {
		this.opening = value;
	}
	
	public String getOpening() {
		return opening;
	}
	
	public void setClosure(String value) {
		this.closure = value;
	}
	
	public String getClosure() {
		return closure;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
