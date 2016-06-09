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

public class StepCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression number;
	public final StringExpression description;
	
	public StepCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		number = new IntegerExpression("number", this);
		description = new StringExpression("description", this);
	}
	
	public StepCriteria(PersistentSession session) {
		this(session.createCriteria(Step.class));
	}
	
	public StepCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public Step uniqueStep() {
		return (Step) super.uniqueResult();
	}
	
	public Step[] listStep() {
		java.util.List list = super.list();
		return (Step[]) list.toArray(new Step[list.size()]);
	}
}

