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

public class BarCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression photoId;
	public final AssociationExpression photo;
	public final IntegerExpression addressId;
	public final AssociationExpression address;
	public final StringExpression email;
	public final StringExpression password;
	public final StringExpression description;
	public final CollectionExpression drinks;
	public final StringExpression name;
	public final CollectionExpression horary;
	public final CollectionExpression contactList;
	
	public BarCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		photoId = new IntegerExpression("photo.ID", this);
		photo = new AssociationExpression("photo", this);
		addressId = new IntegerExpression("address.ID", this);
		address = new AssociationExpression("address", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		description = new StringExpression("description", this);
		drinks = new CollectionExpression("ORM_Drinks", this);
		name = new StringExpression("name", this);
		horary = new CollectionExpression("ORM_Horary", this);
		contactList = new CollectionExpression("ORM_ContactList", this);
	}
	
	public BarCriteria(PersistentSession session) {
		this(session.createCriteria(Bar.class));
	}
	
	public BarCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public WeekdayCriteria createHoraryCriteria() {
		return new WeekdayCriteria(createCriteria("ORM_Horary"));
	}
	
	public ContactCriteria createContactListCriteria() {
		return new ContactCriteria(createCriteria("ORM_ContactList"));
	}
	
	public PhotoCriteria createPhotoCriteria() {
		return new PhotoCriteria(createCriteria("photo"));
	}
	
	public AddressCriteria createAddressCriteria() {
		return new AddressCriteria(createCriteria("address"));
	}
	
	public DrinkCriteria createDrinksCriteria() {
		return new DrinkCriteria(createCriteria("ORM_Drinks"));
	}
	
	public Bar uniqueBar() {
		return (Bar) super.uniqueResult();
	}
	
	public Bar[] listBar() {
		java.util.List list = super.list();
		return (Bar[]) list.toArray(new Bar[list.size()]);
	}
}

