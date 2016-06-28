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

public class Drink {
	public Drink() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == socialdrink.ORMConstants.KEY_DRINK_EVALUATION) {
			return ORM_evaluation;
		}
		else if (key == socialdrink.ORMConstants.KEY_DRINK_INGREDIENTS) {
			return ORM_ingredients;
		}
		else if (key == socialdrink.ORMConstants.KEY_DRINK_STEPS) {
			return ORM_steps;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == socialdrink.ORMConstants.KEY_DRINK_PHOTO) {
			this.photo = (socialdrink.Photo) owner;
		}
		
		else if (key == socialdrink.ORMConstants.KEY_DRINK_TYPEOFDRINK) {
			this.typeOfDrink = (socialdrink.DrinkType) owner;
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
	
	private socialdrink.DrinkType typeOfDrink;
	
	private socialdrink.Photo photo;
	
	private String name;
	
	private String description;
	
	private int timeToPrepate;
	
	private int yeld;
	
	private java.util.Set ORM_evaluation = new java.util.HashSet();
	
	private java.util.Set ORM_ingredients = new java.util.HashSet();
	
	private java.util.Set ORM_steps = new java.util.HashSet();
	
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
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setTimeToPrepate(int value) {
		this.timeToPrepate = value;
	}
	
	public int getTimeToPrepate() {
		return timeToPrepate;
	}
	
	public void setYeld(int value) {
		this.yeld = value;
	}
	
	public int getYeld() {
		return yeld;
	}
	
	public void setPhoto(socialdrink.Photo value) {
		this.photo = value;
	}
	
	public socialdrink.Photo getPhoto() {
		return photo;
	}
	
	private void setORM_Evaluation(java.util.Set value) {
		this.ORM_evaluation = value;
	}
	
	private java.util.Set getORM_Evaluation() {
		return ORM_evaluation;
	}
	
	public final socialdrink.EvaluationSetCollection evaluation = new socialdrink.EvaluationSetCollection(this, _ormAdapter, socialdrink.ORMConstants.KEY_DRINK_EVALUATION, socialdrink.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setTypeOfDrink(socialdrink.DrinkType value) {
		this.typeOfDrink = value;
	}
	
	public socialdrink.DrinkType getTypeOfDrink() {
		return typeOfDrink;
	}
	
	private void setORM_Ingredients(java.util.Set value) {
		this.ORM_ingredients = value;
	}
	
	private java.util.Set getORM_Ingredients() {
		return ORM_ingredients;
	}
	
	public final socialdrink.DrinkIngredientSetCollection ingredients = new socialdrink.DrinkIngredientSetCollection(this, _ormAdapter, socialdrink.ORMConstants.KEY_DRINK_INGREDIENTS, socialdrink.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Steps(java.util.Set value) {
		this.ORM_steps = value;
	}
	
	private java.util.Set getORM_Steps() {
		return ORM_steps;
	}
	
	public final socialdrink.StepSetCollection steps = new socialdrink.StepSetCollection(this, _ormAdapter, socialdrink.ORMConstants.KEY_DRINK_STEPS, socialdrink.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
