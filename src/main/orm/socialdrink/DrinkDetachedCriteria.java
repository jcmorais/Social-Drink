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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class DrinkDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression albumId;
	public final AssociationExpression album;
	public final IntegerExpression typeOfDrinkId;
	public final AssociationExpression typeOfDrink;
	public final IntegerExpression photoId;
	public final AssociationExpression photo;
	public final StringExpression name;
	public final StringExpression description;
	public final IntegerExpression timeToPrepate;
	public final IntegerExpression yeld;
	public final IntegerExpression rating;
	public final IntegerExpression ratingVotes;
	public final CollectionExpression evaluation;
	public final CollectionExpression ingredients;
	public final CollectionExpression steps;
	
	public DrinkDetachedCriteria() {
		super(socialdrink.Drink.class, socialdrink.DrinkCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		albumId = new IntegerExpression("album.ID", this.getDetachedCriteria());
		album = new AssociationExpression("album", this.getDetachedCriteria());
		typeOfDrinkId = new IntegerExpression("typeOfDrink.ID", this.getDetachedCriteria());
		typeOfDrink = new AssociationExpression("typeOfDrink", this.getDetachedCriteria());
		photoId = new IntegerExpression("photo.ID", this.getDetachedCriteria());
		photo = new AssociationExpression("photo", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		timeToPrepate = new IntegerExpression("timeToPrepate", this.getDetachedCriteria());
		yeld = new IntegerExpression("yeld", this.getDetachedCriteria());
		rating = new IntegerExpression("rating", this.getDetachedCriteria());
		ratingVotes = new IntegerExpression("ratingVotes", this.getDetachedCriteria());
		evaluation = new CollectionExpression("ORM_Evaluation", this.getDetachedCriteria());
		ingredients = new CollectionExpression("ORM_Ingredients", this.getDetachedCriteria());
		steps = new CollectionExpression("ORM_Steps", this.getDetachedCriteria());
	}
	
	public DrinkDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.DrinkCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		albumId = new IntegerExpression("album.ID", this.getDetachedCriteria());
		album = new AssociationExpression("album", this.getDetachedCriteria());
		typeOfDrinkId = new IntegerExpression("typeOfDrink.ID", this.getDetachedCriteria());
		typeOfDrink = new AssociationExpression("typeOfDrink", this.getDetachedCriteria());
		photoId = new IntegerExpression("photo.ID", this.getDetachedCriteria());
		photo = new AssociationExpression("photo", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		timeToPrepate = new IntegerExpression("timeToPrepate", this.getDetachedCriteria());
		yeld = new IntegerExpression("yeld", this.getDetachedCriteria());
		rating = new IntegerExpression("rating", this.getDetachedCriteria());
		ratingVotes = new IntegerExpression("ratingVotes", this.getDetachedCriteria());
		evaluation = new CollectionExpression("ORM_Evaluation", this.getDetachedCriteria());
		ingredients = new CollectionExpression("ORM_Ingredients", this.getDetachedCriteria());
		steps = new CollectionExpression("ORM_Steps", this.getDetachedCriteria());
	}
	
	public AlbumDetachedCriteria createAlbumCriteria() {
		return new AlbumDetachedCriteria(createCriteria("album"));
	}
	
	public DrinkTypeDetachedCriteria createTypeOfDrinkCriteria() {
		return new DrinkTypeDetachedCriteria(createCriteria("typeOfDrink"));
	}
	
	public PhotoDetachedCriteria createPhotoCriteria() {
		return new PhotoDetachedCriteria(createCriteria("photo"));
	}
	
	public EvaluationDetachedCriteria createEvaluationCriteria() {
		return new EvaluationDetachedCriteria(createCriteria("ORM_Evaluation"));
	}
	
	public DrinkIngredientDetachedCriteria createIngredientsCriteria() {
		return new DrinkIngredientDetachedCriteria(createCriteria("ORM_Ingredients"));
	}
	
	public StepDetachedCriteria createStepsCriteria() {
		return new StepDetachedCriteria(createCriteria("ORM_Steps"));
	}
	
	public Drink uniqueDrink(PersistentSession session) {
		return (Drink) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Drink[] listDrink(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Drink[]) list.toArray(new Drink[list.size()]);
	}
}

