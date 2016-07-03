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

public abstract class User {
	public User() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == socialdrink.ORMConstants.KEY_USER_DRINKS) {
			return ORM_drinks;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == socialdrink.ORMConstants.KEY_USER_PHOTO) {
			this.photo = (socialdrink.Photo) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private socialdrink.Photo photo;
	
	private String email;
	
	private String password;
	
	private String description;
	
	private String contact;
	
	private java.util.Set ORM_drinks = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setContact(String value) {
		this.contact = value;
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setPhoto(socialdrink.Photo value) {
		this.photo = value;
	}
	
	public socialdrink.Photo getPhoto() {
		return photo;
	}
	
	private void setORM_Drinks(java.util.Set value) {
		this.ORM_drinks = value;
	}
	
	private java.util.Set getORM_Drinks() {
		return ORM_drinks;
	}
	
	public final socialdrink.DrinkSetCollection drinks = new socialdrink.DrinkSetCollection(this, _ormAdapter, socialdrink.ORMConstants.KEY_USER_DRINKS, socialdrink.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
