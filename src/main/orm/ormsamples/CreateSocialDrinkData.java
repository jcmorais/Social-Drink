/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateSocialDrinkData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = socialdrink.SocialDrinkPersistentManager.instance().getSession().beginTransaction();
		try {
			socialdrink.DAOFactory lDAOFactory = socialdrink.DAOFactory.getDAOFactory();
			socialdrink.dao.BarDAO lsocialdrinkBarDAO = lDAOFactory.getBarDAO();
			socialdrink.Bar lsocialdrinkBar = lsocialdrinkBarDAO.createBar();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : horary
			lsocialdrinkBarDAO.save(lsocialdrinkBar);
			socialdrink.dao.AddressDAO lsocialdrinkAddressDAO = lDAOFactory.getAddressDAO();
			socialdrink.Address lsocialdrinkAddress = lsocialdrinkAddressDAO.createAddress();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : city
			lsocialdrinkAddressDAO.save(lsocialdrinkAddress);
			socialdrink.dao.WeekdayDAO lsocialdrinkWeekdayDAO = lDAOFactory.getWeekdayDAO();
			socialdrink.Weekday lsocialdrinkWeekday = lsocialdrinkWeekdayDAO.createWeekday();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : closure, opening
			lsocialdrinkWeekdayDAO.save(lsocialdrinkWeekday);
			socialdrink.dao.CityDAO lsocialdrinkCityDAO = lDAOFactory.getCityDAO();
			socialdrink.City lsocialdrinkCity = lsocialdrinkCityDAO.createCity();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : country
			lsocialdrinkCityDAO.save(lsocialdrinkCity);
			socialdrink.dao.CountryDAO lsocialdrinkCountryDAO = lDAOFactory.getCountryDAO();
			socialdrink.Country lsocialdrinkCountry = lsocialdrinkCountryDAO.createCountry();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cities
			lsocialdrinkCountryDAO.save(lsocialdrinkCountry);
			socialdrink.dao.PhotoDAO lsocialdrinkPhotoDAO = lDAOFactory.getPhotoDAO();
			socialdrink.Photo lsocialdrinkPhoto = lsocialdrinkPhotoDAO.createPhoto();
			// Initialize the properties of the persistent object here
			lsocialdrinkPhotoDAO.save(lsocialdrinkPhoto);
			socialdrink.dao.DrinkDAO lsocialdrinkDrinkDAO = lDAOFactory.getDrinkDAO();
			socialdrink.Drink lsocialdrinkDrink = lsocialdrinkDrinkDAO.createDrink();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : steps, ingredients, evaluation, ratingVotes, rating, yeld, timeToPrepate, typeOfDrink, album
			lsocialdrinkDrinkDAO.save(lsocialdrinkDrink);
			socialdrink.dao.IngredientDAO lsocialdrinkIngredientDAO = lDAOFactory.getIngredientDAO();
			socialdrink.Ingredient lsocialdrinkIngredient = lsocialdrinkIngredientDAO.createIngredient();
			// Initialize the properties of the persistent object here
			lsocialdrinkIngredientDAO.save(lsocialdrinkIngredient);
			socialdrink.dao.StepDAO lsocialdrinkStepDAO = lDAOFactory.getStepDAO();
			socialdrink.Step lsocialdrinkStep = lsocialdrinkStepDAO.createStep();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : number
			lsocialdrinkStepDAO.save(lsocialdrinkStep);
			socialdrink.dao.DrinkIngredientDAO lsocialdrinkDrinkIngredientDAO = lDAOFactory.getDrinkIngredientDAO();
			socialdrink.DrinkIngredient lsocialdrinkDrinkIngredient = lsocialdrinkDrinkIngredientDAO.createDrinkIngredient();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ingredient
			lsocialdrinkDrinkIngredientDAO.save(lsocialdrinkDrinkIngredient);
			socialdrink.dao.EvaluationDAO lsocialdrinkEvaluationDAO = lDAOFactory.getEvaluationDAO();
			socialdrink.Evaluation lsocialdrinkEvaluation = lsocialdrinkEvaluationDAO.createEvaluation();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : user
			lsocialdrinkEvaluationDAO.save(lsocialdrinkEvaluation);
			socialdrink.dao.DrinkTypeDAO lsocialdrinkDrinkTypeDAO = lDAOFactory.getDrinkTypeDAO();
			socialdrink.DrinkType lsocialdrinkDrinkType = lsocialdrinkDrinkTypeDAO.createDrinkType();
			// Initialize the properties of the persistent object here
			lsocialdrinkDrinkTypeDAO.save(lsocialdrinkDrinkType);
			socialdrink.dao.AlbumDAO lsocialdrinkAlbumDAO = lDAOFactory.getAlbumDAO();
			socialdrink.Album lsocialdrinkAlbum = lsocialdrinkAlbumDAO.createAlbum();
			// Initialize the properties of the persistent object here
			lsocialdrinkAlbumDAO.save(lsocialdrinkAlbum);
			socialdrink.dao.ConsumerDAO lsocialdrinkConsumerDAO = lDAOFactory.getConsumerDAO();
			socialdrink.Consumer lsocialdrinkConsumer = lsocialdrinkConsumerDAO.createConsumer();
			// Initialize the properties of the persistent object here
			lsocialdrinkConsumerDAO.save(lsocialdrinkConsumer);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateSocialDrinkData createSocialDrinkData = new CreateSocialDrinkData();
			try {
				createSocialDrinkData.createTestData();
			}
			finally {
				socialdrink.SocialDrinkPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
