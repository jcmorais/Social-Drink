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

public class EventEvalDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression drinkId;
	public final AssociationExpression drink;
	public final IntegerExpression evaluationId;
	public final AssociationExpression evaluation;
	
	public EventEvalDetachedCriteria() {
		super(socialdrink.EventEval.class, socialdrink.EventEvalCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		drinkId = new IntegerExpression("drink.ID", this.getDetachedCriteria());
		drink = new AssociationExpression("drink", this.getDetachedCriteria());
		evaluationId = new IntegerExpression("evaluation.ID", this.getDetachedCriteria());
		evaluation = new AssociationExpression("evaluation", this.getDetachedCriteria());
	}
	
	public EventEvalDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.EventEvalCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		drinkId = new IntegerExpression("drink.ID", this.getDetachedCriteria());
		drink = new AssociationExpression("drink", this.getDetachedCriteria());
		evaluationId = new IntegerExpression("evaluation.ID", this.getDetachedCriteria());
		evaluation = new AssociationExpression("evaluation", this.getDetachedCriteria());
	}
	
	public DrinkDetachedCriteria createDrinkCriteria() {
		return new DrinkDetachedCriteria(createCriteria("drink"));
	}
	
	public EvaluationDetachedCriteria createEvaluationCriteria() {
		return new EvaluationDetachedCriteria(createCriteria("evaluation"));
	}
	
	public EventEval uniqueEventEval(PersistentSession session) {
		return (EventEval) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EventEval[] listEventEval(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EventEval[]) list.toArray(new EventEval[list.size()]);
	}
}

