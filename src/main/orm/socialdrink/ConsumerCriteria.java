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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ConsumerCriteria extends AbstractORMCriteria {
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
	
	public ConsumerCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		photoId = new IntegerExpression("photo.ID", this);
		photo = new AssociationExpression("photo", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		description = new StringExpression("description", this);
		contact = new StringExpression("contact", this);
		drinks = new CollectionExpression("ORM_Drinks", this);
		cityId = new IntegerExpression("city.ID", this);
		city = new AssociationExpression("city", this);
		firstname = new StringExpression("firstname", this);
		lastname = new StringExpression("lastname", this);
		Birthday = new DateExpression("Birthday", this);
		profession = new StringExpression("profession", this);
		sex = new StringExpression("sex", this);
	}
	
	public ConsumerCriteria(PersistentSession session) {
		this(session.createCriteria(Consumer.class));
	}
	
	public ConsumerCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public CityCriteria createCityCriteria() {
		return new CityCriteria(createCriteria("city"));
	}
	
	public PhotoCriteria createPhotoCriteria() {
		return new PhotoCriteria(createCriteria("photo"));
	}
	
	public DrinkCriteria createDrinksCriteria() {
		return new DrinkCriteria(createCriteria("ORM_Drinks"));
	}
	
	public Consumer uniqueConsumer() {
		return (Consumer) super.uniqueResult();
	}
	
	public Consumer[] listConsumer() {
		java.util.List list = super.list();
		return (Consumer[]) list.toArray(new Consumer[list.size()]);
	}
}

