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
	
	private java.util.Set this_getSet (int key) {
		if (key == socialdrink.ORMConstants.KEY_CONSUMER_FAVORITEDRINKS) {
			return ORM_favoriteDrinks;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private socialdrink.City city;
	
	private String firstname;
	
	private String lastname;
	
	private java.util.Date Birthday;
	
	private String profession;
	
	private String sex;
	
	private String[] following;
	
	private java.util.Set ORM_favoriteDrinks = new java.util.HashSet();
	
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
	
	public void setFollowing(String[] value) {
		this.following = value;
	}
	
	public String[] getFollowing() {
		return following;
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
	
	private void setORM_FavoriteDrinks(java.util.Set value) {
		this.ORM_favoriteDrinks = value;
	}
	
	private java.util.Set getORM_FavoriteDrinks() {
		return ORM_favoriteDrinks;
	}
	
	public final socialdrink.DrinkSetCollection favoriteDrinks = new socialdrink.DrinkSetCollection(this, _ormAdapter, socialdrink.ORMConstants.KEY_CONSUMER_FAVORITEDRINKS, socialdrink.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
