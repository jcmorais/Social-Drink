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

public class StepDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression number;
	public final StringExpression description;
	
	public StepDetachedCriteria() {
		super(socialdrink.Step.class, socialdrink.StepCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		number = new IntegerExpression("number", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
	}
	
	public StepDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.StepCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		number = new IntegerExpression("number", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
	}
	
	public Step uniqueStep(PersistentSession session) {
		return (Step) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Step[] listStep(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Step[]) list.toArray(new Step[list.size()]);
	}
}

