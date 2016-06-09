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
	
	private String firstname;
	
	private String lastname;
	
	private java.util.Date Birthday;
	
	private String profession;
	
	private String sex;
	
	private String[] following;
	
	private String[] favoriteDrink;
	
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
	
	public void setFavoriteDrink(String[] value) {
		this.favoriteDrink = value;
	}
	
	public String[] getFavoriteDrink() {
		return favoriteDrink;
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
	
	public String toString() {
		return super.toString();
	}
	
}
