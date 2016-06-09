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

public class yeldTypeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	
	public yeldTypeDetachedCriteria() {
		super(socialdrink.yeldType.class, socialdrink.yeldTypeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public yeldTypeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.yeldTypeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public yeldType uniqueYeldType(PersistentSession session) {
		return (yeldType) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public yeldType[] listYeldType(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (yeldType[]) list.toArray(new yeldType[list.size()]);
	}
}

