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

public class Bar extends socialdrink.User {
	public Bar() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == socialdrink.ORMConstants.KEY_BAR_HORARY) {
			return ORM_horary;
		}
		else if (key == socialdrink.ORMConstants.KEY_BAR_CONTACTLIST) {
			return ORM_contactList;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String name;
	
	private java.util.Set ORM_horary = new java.util.HashSet();
	
	private java.util.Set ORM_contactList = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	private void setORM_Horary(java.util.Set value) {
		this.ORM_horary = value;
	}
	
	private java.util.Set getORM_Horary() {
		return ORM_horary;
	}
	
	public final socialdrink.WeekdaySetCollection horary = new socialdrink.WeekdaySetCollection(this, _ormAdapter, socialdrink.ORMConstants.KEY_BAR_HORARY, socialdrink.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_ContactList(java.util.Set value) {
		this.ORM_contactList = value;
	}
	
	private java.util.Set getORM_ContactList() {
		return ORM_contactList;
	}
	
	public final socialdrink.ContactSetCollection contactList = new socialdrink.ContactSetCollection(this, _ormAdapter, socialdrink.ORMConstants.KEY_BAR_CONTACTLIST, socialdrink.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
