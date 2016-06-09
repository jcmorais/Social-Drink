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

public class Evaluation {
	public Evaluation() {
	}
	
	private int ID;
	
	private socialdrink.Consumer user;
	
	private String text;
	
	private java.util.Date date;
	
	private Integer value;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setText(String value) {
		this.text = value;
	}
	
	public String getText() {
		return text;
	}
	
	public void setDate(java.util.Date value) {
		this.date = value;
	}
	
	public java.util.Date getDate() {
		return date;
	}
	
	public void setValue(int value) {
		setValue(new Integer(value));
	}
	
	public void setValue(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public void setUser(socialdrink.Consumer value) {
		this.user = value;
	}
	
	public socialdrink.Consumer getUser() {
		return user;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
