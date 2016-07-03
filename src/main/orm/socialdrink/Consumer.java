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

public class Consumer extends socialdrink.User {
	public Consumer() {
	}
	
	private java.util.List this_getList (int key) {
		if (key == socialdrink.ORMConstants.KEY_CONSUMER_FAVORITEDRINKS) {
			return ORM_favoriteDrinks;
		}
		
		return null;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == socialdrink.ORMConstants.KEY_CONSUMER_FOLLOW) {
			return ORM_follow;
		}
		else if (key == socialdrink.ORMConstants.KEY_CONSUMER_EVENTS) {
			return ORM_events;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public java.util.List getList(int key) {
			return this_getList(key);
		}
		
	};
	
	private socialdrink.City city;
	
	private String firstname;
	
	private String lastname;
	
	private java.util.Date Birthday;
	
	private String profession;
	
	private String sex;
	
	private java.util.List ORM_favoriteDrinks = new java.util.ArrayList();
	
	private java.util.Set ORM_follow = new java.util.HashSet();
	
	private java.util.Set ORM_events = new java.util.HashSet();
	
	public void setFirstname(String value) {
		this.firstname = value;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setLastname(String value) {
		this.lastname = value;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setBirthday(java.util.Date value) {
		this.Birthday = value;
	}
	
	public java.util.Date getBirthday() {
		return Birthday;
	}
	
	public void setProfession(String value) {
		this.profession = value;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public void setSex(String value) {
		this.sex = value;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setCity(socialdrink.City value) {
		this.city = value;
	}
	
	public socialdrink.City getCity() {
		return city;
	}
	
	private void setORM_FavoriteDrinks(java.util.List value) {
		this.ORM_favoriteDrinks = value;
	}
	
	private java.util.List getORM_FavoriteDrinks() {
		return ORM_favoriteDrinks;
	}
	
	public final socialdrink.DrinkListCollection favoriteDrinks = new socialdrink.DrinkListCollection(this, _ormAdapter, socialdrink.ORMConstants.KEY_CONSUMER_FAVORITEDRINKS, socialdrink.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Follow(java.util.Set value) {
		this.ORM_follow = value;
	}
	
	private java.util.Set getORM_Follow() {
		return ORM_follow;
	}
	
	public final socialdrink.UserSetCollection follow = new socialdrink.UserSetCollection(this, _ormAdapter, socialdrink.ORMConstants.KEY_CONSUMER_FOLLOW, socialdrink.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Events(java.util.Set value) {
		this.ORM_events = value;
	}
	
	private java.util.Set getORM_Events() {
		return ORM_events;
	}
	
	public final socialdrink.EventSetCollection events = new socialdrink.EventSetCollection(this, _ormAdapter, socialdrink.ORMConstants.KEY_CONSUMER_EVENTS, socialdrink.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
