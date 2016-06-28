/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteSocialDrinkData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = socialdrink.SocialDrinkPersistentManager.instance().getSession().beginTransaction();
		try {
			socialdrink.DAOFactory lDAOFactory = socialdrink.DAOFactory.getDAOFactory();
			socialdrink.dao.BarDAO lsocialdrinkBarDAO = lDAOFactory.getBarDAO();
			socialdrink.Bar lsocialdrinkBar = lsocialdrinkBarDAO.loadBarByQuery(null, null);
			// Delete the persistent object
			lsocialdrinkBarDAO.delete(lsocialdrinkBar);
			socialdrink.dao.AddressDAO lsocialdrinkAddressDAO = lDAOFactory.getAddressDAO();
			socialdrink.Address lsocialdrinkAddress = lsocialdrinkAddressDAO.loadAddressByQuery(null, null);
			// Delete the persistent object
			lsocialdrinkAddressDAO.delete(lsocialdrinkAddress);
			socialdrink.dao.WeekdayDAO lsocialdrinkWeekdayDAO = lDAOFactory.getWeekdayDAO();
			socialdrink.Weekday lsocialdrinkWeekday = lsocialdrinkWeekdayDAO.loadWeekdayByQuery(null, null);
			// Delete the persistent object
			lsocialdrinkWeekdayDAO.delete(lsocialdrinkWeekday);
			socialdrink.dao.CityDAO lsocialdrinkCityDAO = lDAOFactory.getCityDAO();
			socialdrink.City lsocialdrinkCity = lsocialdrinkCityDAO.loadCityByQuery(null, null);
			// Delete the persistent object
			lsocialdrinkCityDAO.delete(lsocialdrinkCity);
			socialdrink.dao.CountryDAO lsocialdrinkCountryDAO = lDAOFactory.getCountryDAO();
			socialdrink.Country lsocialdrinkCountry = lsocialdrinkCountryDAO.loadCountryByQuery(null, null);
			// Delete the persistent object
			lsocialdrinkCountryDAO.delete(lsocialdrinkCountry);
			socialdrink.dao.PhotoDAO lsocialdrinkPhotoDAO = lDAOFactory.getPhotoDAO();
			socialdrink.Photo lsocialdrinkPhoto = lsocialdrinkPhotoDAO.loadPhotoByQuery(null, null);
			// Delete the persistent object
			lsocialdrinkPhotoDAO.delete(lsocialdrinkPhoto);
			socialdrink.dao.DrinkDAO lsocialdrinkDrinkDAO = lDAOFactory.getDrinkDAO();
			socialdrink.Drink lsocialdrinkDrink = lsocialdrinkDrinkDAO.loadDrinkByQuery(null, null);
			// Delete the persistent object
			lsocialdrinkDrinkDAO.delete(lsocialdrinkDrink);
			socialdrink.dao.IngredientDAO lsocialdrinkIngredientDAO = lDAOFactory.getIngredientDAO();
			socialdrink.Ingredient lsocialdrinkIngredient = lsocialdrinkIngredientDAO.loadIngredientByQuery(null, null);
			// Delete the persistent object
			lsocialdrinkIngredientDAO.delete(lsocialdrinkIngredient);
			socialdrink.dao.StepDAO lsocialdrinkStepDAO = lDAOFactory.getStepDAO();
			socialdrink.Step lsocialdrinkStep = lsocialdrinkStepDAO.loadStepByQuery(null, null);
			// Delete the persistent object
			lsocialdrinkStepDAO.delete(lsocialdrinkStep);
			socialdrink.dao.DrinkIngredientDAO lsocialdrinkDrinkIngredientDAO = lDAOFactory.getDrinkIngredientDAO();
			socialdrink.DrinkIngredient lsocialdrinkDrinkIngredient = lsocialdrinkDrinkIngredientDAO.loadDrinkIngredientByQuery(null, null);
			// Delete the persistent object
			lsocialdrinkDrinkIngredientDAO.delete(lsocialdrinkDrinkIngredient);
			socialdrink.dao.EvaluationDAO lsocialdrinkEvaluationDAO = lDAOFactory.getEvaluationDAO();
			socialdrink.Evaluation lsocialdrinkEvaluation = lsocialdrinkEvaluationDAO.loadEvaluationByQuery(null, null);
			// Delete the persistent object
			lsocialdrinkEvaluationDAO.delete(lsocialdrinkEvaluation);
			socialdrink.dao.DrinkTypeDAO lsocialdrinkDrinkTypeDAO = lDAOFactory.getDrinkTypeDAO();
			socialdrink.DrinkType lsocialdrinkDrinkType = lsocialdrinkDrinkTypeDAO.loadDrinkTypeByQuery(null, null);
			// Delete the persistent object
			lsocialdrinkDrinkTypeDAO.delete(lsocialdrinkDrinkType);
			socialdrink.dao.ConsumerDAO lsocialdrinkConsumerDAO = lDAOFactory.getConsumerDAO();
			socialdrink.Consumer lsocialdrinkConsumer = lsocialdrinkConsumerDAO.loadConsumerByQuery(null, null);
			// Delete the persistent object
			lsocialdrinkConsumerDAO.delete(lsocialdrinkConsumer);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteSocialDrinkData deleteSocialDrinkData = new DeleteSocialDrinkData();
			try {
				deleteSocialDrinkData.deleteTestData();
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
