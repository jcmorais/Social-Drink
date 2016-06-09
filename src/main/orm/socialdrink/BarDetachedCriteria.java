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

public class BarDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public BarDetachedCriteria() {
		super(socialdrink.Bar.class, socialdrink.BarCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		photoId = new IntegerExpression("photo.ID", this.getDetachedCriteria());
		photo = new AssociationExpression("photo", this.getDetachedCriteria());
		addressId = new IntegerExpression("address.ID", this.getDetachedCriteria());
		address = new AssociationExpression("address", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		drinks = new CollectionExpression("ORM_Drinks", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		horary = new CollectionExpression("ORM_Horary", this.getDetachedCriteria());
		contactList = new CollectionExpression("ORM_ContactList", this.getDetachedCriteria());
	}
	
	public BarDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.BarCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		photoId = new IntegerExpression("photo.ID", this.getDetachedCriteria());
		photo = new AssociationExpression("photo", this.getDetachedCriteria());
		addressId = new IntegerExpression("address.ID", this.getDetachedCriteria());
		address = new AssociationExpression("address", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		drinks = new CollectionExpression("ORM_Drinks", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		horary = new CollectionExpression("ORM_Horary", this.getDetachedCriteria());
		contactList = new CollectionExpression("ORM_ContactList", this.getDetachedCriteria());
	}
	
	public WeekdayDetachedCriteria createHoraryCriteria() {
		return new WeekdayDetachedCriteria(createCriteria("ORM_Horary"));
	}
	
	public ContactDetachedCriteria createContactListCriteria() {
		return new ContactDetachedCriteria(createCriteria("ORM_ContactList"));
	}
	
	public PhotoDetachedCriteria createPhotoCriteria() {
		return new PhotoDetachedCriteria(createCriteria("photo"));
	}
	
	public AddressDetachedCriteria createAddressCriteria() {
		return new AddressDetachedCriteria(createCriteria("address"));
	}
	
	public DrinkDetachedCriteria createDrinksCriteria() {
		return new DrinkDetachedCriteria(createCriteria("ORM_Drinks"));
	}
	
	public Bar uniqueBar(PersistentSession session) {
		return (Bar) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Bar[] listBar(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Bar[]) list.toArray(new Bar[list.size()]);
	}
}

