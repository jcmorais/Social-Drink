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

import socialdrink.dao.*;

public abstract class DAOFactory {
	private static DAOFactory _factory = new DAOFactoryImpl();
	
	public static DAOFactory getDAOFactory() {
		return _factory;
	}
	
	public abstract UserDAO getUserDAO();
	public abstract BarDAO getBarDAO();
	public abstract AddressDAO getAddressDAO();
	public abstract WeekdayDAO getWeekdayDAO();
	public abstract CityDAO getCityDAO();
	public abstract CountryDAO getCountryDAO();
	public abstract PhotoDAO getPhotoDAO();
	public abstract DrinkDAO getDrinkDAO();
	public abstract IngredientDAO getIngredientDAO();
	public abstract StepDAO getStepDAO();
	public abstract DrinkIngredientDAO getDrinkIngredientDAO();
	public abstract EvaluationDAO getEvaluationDAO();
	public abstract DrinkTypeDAO getDrinkTypeDAO();
	public abstract ConsumerDAO getConsumerDAO();
}

