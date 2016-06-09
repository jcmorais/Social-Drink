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

public class EvaluationDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression userId;
	public final AssociationExpression user;
	public final StringExpression text;
	public final DateExpression date;
	public final IntegerExpression value;
	
	public EvaluationDetachedCriteria() {
		super(socialdrink.Evaluation.class, socialdrink.EvaluationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userId = new IntegerExpression("user.ID", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		value = new IntegerExpression("value", this.getDetachedCriteria());
	}
	
	public EvaluationDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.EvaluationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userId = new IntegerExpression("user.ID", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		value = new IntegerExpression("value", this.getDetachedCriteria());
	}
	
	public ConsumerDetachedCriteria createUserCriteria() {
		return new ConsumerDetachedCriteria(createCriteria("user"));
	}
	
	public Evaluation uniqueEvaluation(PersistentSession session) {
		return (Evaluation) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Evaluation[] listEvaluation(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Evaluation[]) list.toArray(new Evaluation[list.size()]);
	}
}

