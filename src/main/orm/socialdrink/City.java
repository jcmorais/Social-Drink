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

public class City {
	public City() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == socialdrink.ORMConstants.KEY_CITY_COUNTRY) {
			this.country = (socialdrink.Country) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private socialdrink.Country country;
	
	private String name;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCountry(socialdrink.Country value) {
		if (country != null) {
			country.cities.remove(this);
		}
		if (value != null) {
			value.cities.add(this);
		}
	}
	
	public socialdrink.Country getCountry() {
		return country;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Country(socialdrink.Country value) {
		this.country = value;
	}
	
	private socialdrink.Country getORM_Country() {
		return country;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
