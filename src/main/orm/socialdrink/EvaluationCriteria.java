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

public class EvaluationCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression userId;
	public final AssociationExpression user;
	public final StringExpression text;
	public final DateExpression date;
	public final IntegerExpression value;
	
	public EvaluationCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		userId = new IntegerExpression("user.ID", this);
		user = new AssociationExpression("user", this);
		text = new StringExpression("text", this);
		date = new DateExpression("date", this);
		value = new IntegerExpression("value", this);
	}
	
	public EvaluationCriteria(PersistentSession session) {
		this(session.createCriteria(Evaluation.class));
	}
	
	public EvaluationCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public ConsumerCriteria createUserCriteria() {
		return new ConsumerCriteria(createCriteria("user"));
	}
	
	public Evaluation uniqueEvaluation() {
		return (Evaluation) super.uniqueResult();
	}
	
	public Evaluation[] listEvaluation() {
		java.util.List list = super.list();
		return (Evaluation[]) list.toArray(new Evaluation[list.size()]);
	}
}

