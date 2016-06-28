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
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private socialdrink.Address address;
	
	private String name;
	
	private java.util.Set ORM_horary = new java.util.HashSet();
	
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
	
	public void setAddress(socialdrink.Address value) {
		this.address = value;
	}
	
	public socialdrink.Address getAddress() {
		return address;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
