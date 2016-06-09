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

public class UserCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression photoId;
	public final AssociationExpression photo;
	public final IntegerExpression addressId;
	public final AssociationExpression address;
	public final StringExpression email;
	public final StringExpression password;
	public final StringExpression description;
	public final CollectionExpression drinks;
	
	public UserCriteria(Criteria criteria) {
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
	}
	
	public UserCriteria(PersistentSession session) {
		this(session.createCriteria(User.class));
	}
	
	public UserCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
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
	
	public User uniqueUser() {
		return (User) super.uniqueResult();
	}
	
	public User[] listUser() {
		java.util.List list = super.list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

