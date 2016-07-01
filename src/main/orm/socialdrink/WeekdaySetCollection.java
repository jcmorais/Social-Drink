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

import org.orm.*;

public class WeekdaySetCollection extends org.orm.util.ORMSet {
	public WeekdaySetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public WeekdaySetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persisten objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMSet
	 * @param value the persistent object
	 */
	public void add(Weekday value) {
		if (value != null) {
			super.add(value, null);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMSet
	 * @param value the persistent object
	 */
	public void remove(Weekday value) {
		super.remove(value, null);
	}
	
	/**
	 * Return true if ORMSet contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(Weekday value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMSet
	 * @return The persistent objects array
	 */
	public Weekday[] toArray() {
		return (Weekday[]) super.toArray(new Weekday[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>day</li>
	 * <li>opening</li>
	 * <li>closure</li>
	 * <li>nameDay</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public Weekday[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>day</li>
	 * <li>opening</li>
	 * <li>closure</li>
	 * <li>nameDay</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public Weekday[] toArray(String propertyName, boolean ascending) {
		return (Weekday[]) super.toArray(new Weekday[size()], propertyName, ascending);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return socialdrink.SocialDrinkPersistentManager.instance();
	}
	
}

