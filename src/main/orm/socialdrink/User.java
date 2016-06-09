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
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private socialdrink.Photo photo;
	
	private socialdrink.Address address;
	
	private String email;
	
	private String password;
	
	private String description;
	
	private String[] followers;
	
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
	
	public void setFollowers(String[] value) {
		this.followers = value;
	}
	
	public String[] getFollowers() {
		return followers;
	}
	
	public void setAddress(socialdrink.Address value) {
		this.address = value;
	}
	
	public socialdrink.Address getAddress() {
		return address;
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
