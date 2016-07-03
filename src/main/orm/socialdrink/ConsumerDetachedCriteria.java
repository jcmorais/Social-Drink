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

public class ConsumerDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression photoId;
	public final AssociationExpression photo;
	public final StringExpression email;
	public final StringExpression password;
	public final StringExpression description;
	public final StringExpression contact;
	public final CollectionExpression drinks;
	public final IntegerExpression cityId;
	public final AssociationExpression city;
	public final StringExpression firstname;
	public final StringExpression lastname;
	public final DateExpression Birthday;
	public final StringExpression profession;
	public final StringExpression sex;
	public final CollectionExpression favoriteDrinks;
	public final CollectionExpression follow;
	public final CollectionExpression events;
	
	public ConsumerDetachedCriteria() {
		super(socialdrink.Consumer.class, socialdrink.ConsumerCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		photoId = new IntegerExpression("photo.ID", this.getDetachedCriteria());
		photo = new AssociationExpression("photo", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		contact = new StringExpression("contact", this.getDetachedCriteria());
		drinks = new CollectionExpression("ORM_Drinks", this.getDetachedCriteria());
		cityId = new IntegerExpression("city.ID", this.getDetachedCriteria());
		city = new AssociationExpression("city", this.getDetachedCriteria());
		firstname = new StringExpression("firstname", this.getDetachedCriteria());
		lastname = new StringExpression("lastname", this.getDetachedCriteria());
		Birthday = new DateExpression("Birthday", this.getDetachedCriteria());
		profession = new StringExpression("profession", this.getDetachedCriteria());
		sex = new StringExpression("sex", this.getDetachedCriteria());
		favoriteDrinks = new CollectionExpression("ORM_FavoriteDrinks", this.getDetachedCriteria());
		follow = new CollectionExpression("ORM_Follow", this.getDetachedCriteria());
		events = new CollectionExpression("ORM_Events", this.getDetachedCriteria());
	}
	
	public ConsumerDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.ConsumerCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		photoId = new IntegerExpression("photo.ID", this.getDetachedCriteria());
		photo = new AssociationExpression("photo", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		contact = new StringExpression("contact", this.getDetachedCriteria());
		drinks = new CollectionExpression("ORM_Drinks", this.getDetachedCriteria());
		cityId = new IntegerExpression("city.ID", this.getDetachedCriteria());
		city = new AssociationExpression("city", this.getDetachedCriteria());
		firstname = new StringExpression("firstname", this.getDetachedCriteria());
		lastname = new StringExpression("lastname", this.getDetachedCriteria());
		Birthday = new DateExpression("Birthday", this.getDetachedCriteria());
		profession = new StringExpression("profession", this.getDetachedCriteria());
		sex = new StringExpression("sex", this.getDetachedCriteria());
		favoriteDrinks = new CollectionExpression("ORM_FavoriteDrinks", this.getDetachedCriteria());
		follow = new CollectionExpression("ORM_Follow", this.getDetachedCriteria());
		events = new CollectionExpression("ORM_Events", this.getDetachedCriteria());
	}
	
	public CityDetachedCriteria createCityCriteria() {
		return new CityDetachedCriteria(createCriteria("city"));
	}
	
	public DrinkDetachedCriteria createFavoriteDrinksCriteria() {
		return new DrinkDetachedCriteria(createCriteria("ORM_FavoriteDrinks"));
	}
	
	public UserDetachedCriteria createFollowCriteria() {
		return new UserDetachedCriteria(createCriteria("ORM_Follow"));
	}
	
	public EventDetachedCriteria createEventsCriteria() {
		return new EventDetachedCriteria(createCriteria("ORM_Events"));
	}
	
	public PhotoDetachedCriteria createPhotoCriteria() {
		return new PhotoDetachedCriteria(createCriteria("photo"));
	}
	
	public DrinkDetachedCriteria createDrinksCriteria() {
		return new DrinkDetachedCriteria(createCriteria("ORM_Drinks"));
	}
	
	public Consumer uniqueConsumer(PersistentSession session) {
		return (Consumer) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Consumer[] listConsumer(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Consumer[]) list.toArray(new Consumer[list.size()]);
	}
}

