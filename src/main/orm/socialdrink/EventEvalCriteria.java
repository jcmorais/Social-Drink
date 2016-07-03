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

public class EventEvalCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression drinkId;
	public final AssociationExpression drink;
	public final IntegerExpression evaluationId;
	public final AssociationExpression evaluation;
	
	public EventEvalCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		drinkId = new IntegerExpression("drink.ID", this);
		drink = new AssociationExpression("drink", this);
		evaluationId = new IntegerExpression("evaluation.ID", this);
		evaluation = new AssociationExpression("evaluation", this);
	}
	
	public EventEvalCriteria(PersistentSession session) {
		this(session.createCriteria(EventEval.class));
	}
	
	public EventEvalCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public DrinkCriteria createDrinkCriteria() {
		return new DrinkCriteria(createCriteria("drink"));
	}
	
	public EvaluationCriteria createEvaluationCriteria() {
		return new EvaluationCriteria(createCriteria("evaluation"));
	}
	
	public EventEval uniqueEventEval() {
		return (EventEval) super.uniqueResult();
	}
	
	public EventEval[] listEventEval() {
		java.util.List list = super.list();
		return (EventEval[]) list.toArray(new EventEval[list.size()]);
	}
}

