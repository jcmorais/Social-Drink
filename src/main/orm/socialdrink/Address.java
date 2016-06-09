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

public class Address {
	public Address() {
	}
	
	private int ID;
	
	private socialdrink.City city;
	
	private String street;
	
	private String postalCode;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setStreet(String value) {
		this.street = value;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setPostalCode(String value) {
		this.postalCode = value;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setCity(socialdrink.City value) {
		this.city = value;
	}
	
	public socialdrink.City getCity() {
		return city;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
