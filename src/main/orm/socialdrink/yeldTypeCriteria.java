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

public class yeldTypeCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	
	public yeldTypeCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
	}
	
	public yeldTypeCriteria(PersistentSession session) {
		this(session.createCriteria(yeldType.class));
	}
	
	public yeldTypeCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public yeldType uniqueYeldType() {
		return (yeldType) super.uniqueResult();
	}
	
	public yeldType[] listYeldType() {
		java.util.List list = super.list();
		return (yeldType[]) list.toArray(new yeldType[list.size()]);
	}
}

