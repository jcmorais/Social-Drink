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

public class EventEval extends socialdrink.Event {
	public EventEval() {
	}
	
	private socialdrink.Drink drink;
	
	private socialdrink.Evaluation evaluation;
	
	public void setEvaluation(socialdrink.Evaluation value) {
		this.evaluation = value;
	}
	
	public socialdrink.Evaluation getEvaluation() {
		return evaluation;
	}
	
	public void setDrink(socialdrink.Drink value) {
		this.drink = value;
	}
	
	public socialdrink.Drink getDrink() {
		return drink;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
