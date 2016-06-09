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

public class Contact {
	public Contact() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == socialdrink.ORMConstants.KEY_CONTACT_CONTACTTYPE) {
			this.contactType = (socialdrink.contactType) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private socialdrink.contactType contactType;
	
	private String contact;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setContact(String value) {
		this.contact = value;
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContactType(socialdrink.contactType value) {
		this.contactType = value;
	}
	
	public socialdrink.contactType getContactType() {
		return contactType;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
