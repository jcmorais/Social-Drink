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
import socialdrink.impl.*;

public class DAOFactoryImpl extends DAOFactory {
	private UserDAO _userDAO = new UserDAOImpl();
	public UserDAO getUserDAO() {
		return _userDAO;
	}
	
	private BarDAO _barDAO = new BarDAOImpl();
	public BarDAO getBarDAO() {
		return _barDAO;
	}
	
	private AddressDAO _addressDAO = new AddressDAOImpl();
	public AddressDAO getAddressDAO() {
		return _addressDAO;
	}
	
	private WeekdayDAO _weekdayDAO = new WeekdayDAOImpl();
	public WeekdayDAO getWeekdayDAO() {
		return _weekdayDAO;
	}
	
	private CityDAO _cityDAO = new CityDAOImpl();
	public CityDAO getCityDAO() {
		return _cityDAO;
	}
	
	private CountryDAO _countryDAO = new CountryDAOImpl();
	public CountryDAO getCountryDAO() {
		return _countryDAO;
	}
	
	private PhotoDAO _photoDAO = new PhotoDAOImpl();
	public PhotoDAO getPhotoDAO() {
		return _photoDAO;
	}
	
	private DrinkDAO _drinkDAO = new DrinkDAOImpl();
	public DrinkDAO getDrinkDAO() {
		return _drinkDAO;
	}
	
	private IngredientDAO _ingredientDAO = new IngredientDAOImpl();
	public IngredientDAO getIngredientDAO() {
		return _ingredientDAO;
	}
	
	private StepDAO _stepDAO = new StepDAOImpl();
	public StepDAO getStepDAO() {
		return _stepDAO;
	}
	
	private DrinkIngredientDAO _drinkIngredientDAO = new DrinkIngredientDAOImpl();
	public DrinkIngredientDAO getDrinkIngredientDAO() {
		return _drinkIngredientDAO;
	}
	
	private EvaluationDAO _evaluationDAO = new EvaluationDAOImpl();
	public EvaluationDAO getEvaluationDAO() {
		return _evaluationDAO;
	}
	
	private DrinkTypeDAO _drinkTypeDAO = new DrinkTypeDAOImpl();
	public DrinkTypeDAO getDrinkTypeDAO() {
		return _drinkTypeDAO;
	}
	
	private AlbumDAO _albumDAO = new AlbumDAOImpl();
	public AlbumDAO getAlbumDAO() {
		return _albumDAO;
	}
	
	private ConsumerDAO _consumerDAO = new ConsumerDAOImpl();
	public ConsumerDAO getConsumerDAO() {
		return _consumerDAO;
	}
	
	private EventDAO _eventDAO = new EventDAOImpl();
	public EventDAO getEventDAO() {
		return _eventDAO;
	}
	
	private EventDrinkDAO _eventDrinkDAO = new EventDrinkDAOImpl();
	public EventDrinkDAO getEventDrinkDAO() {
		return _eventDrinkDAO;
	}
	
	private EventFavoriteDAO _eventFavoriteDAO = new EventFavoriteDAOImpl();
	public EventFavoriteDAO getEventFavoriteDAO() {
		return _eventFavoriteDAO;
	}
	
	private EventEvalDAO _eventEvalDAO = new EventEvalDAOImpl();
	public EventEvalDAO getEventEvalDAO() {
		return _eventEvalDAO;
	}
	
}

