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

public class DrinkIngredient {
	public DrinkIngredient() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == socialdrink.ORMConstants.KEY_DRINKINGREDIENT_INGREDIENT) {
			this.ingredient = (socialdrink.Ingredient) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private socialdrink.Ingredient ingredient;
	
	private String amount;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setAmount(String value) {
		this.amount = value;
	}
	
	public String getAmount() {
		return amount;
	}
	
	public void setIngredient(socialdrink.Ingredient value) {
		this.ingredient = value;
	}
	
	public socialdrink.Ingredient getIngredient() {
		return ingredient;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
