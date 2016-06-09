/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateSocialDrinkData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = socialdrink.SocialDrinkPersistentManager.instance().getSession().beginTransaction();
		try {
			socialdrink.DAOFactory lDAOFactory = socialdrink.DAOFactory.getDAOFactory();
			socialdrink.dao.ConsumerDAO lsocialdrinkConsumerDAO = lDAOFactory.getConsumerDAO();
			socialdrink.Consumer lsocialdrinkConsumer = lsocialdrinkConsumerDAO.loadConsumerByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkConsumerDAO.save(lsocialdrinkConsumer);
			socialdrink.dao.BarDAO lsocialdrinkBarDAO = lDAOFactory.getBarDAO();
			socialdrink.Bar lsocialdrinkBar = lsocialdrinkBarDAO.loadBarByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkBarDAO.save(lsocialdrinkBar);
			socialdrink.dao.AddressDAO lsocialdrinkAddressDAO = lDAOFactory.getAddressDAO();
			socialdrink.Address lsocialdrinkAddress = lsocialdrinkAddressDAO.loadAddressByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkAddressDAO.save(lsocialdrinkAddress);
			socialdrink.dao.ContactDAO lsocialdrinkContactDAO = lDAOFactory.getContactDAO();
			socialdrink.Contact lsocialdrinkContact = lsocialdrinkContactDAO.loadContactByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkContactDAO.save(lsocialdrinkContact);
			socialdrink.dao.WeekdayDAO lsocialdrinkWeekdayDAO = lDAOFactory.getWeekdayDAO();
			socialdrink.Weekday lsocialdrinkWeekday = lsocialdrinkWeekdayDAO.loadWeekdayByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkWeekdayDAO.save(lsocialdrinkWeekday);
			socialdrink.dao.CityDAO lsocialdrinkCityDAO = lDAOFactory.getCityDAO();
			socialdrink.City lsocialdrinkCity = lsocialdrinkCityDAO.loadCityByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkCityDAO.save(lsocialdrinkCity);
			socialdrink.dao.CountryDAO lsocialdrinkCountryDAO = lDAOFactory.getCountryDAO();
			socialdrink.Country lsocialdrinkCountry = lsocialdrinkCountryDAO.loadCountryByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkCountryDAO.save(lsocialdrinkCountry);
			socialdrink.dao.PhotoDAO lsocialdrinkPhotoDAO = lDAOFactory.getPhotoDAO();
			socialdrink.Photo lsocialdrinkPhoto = lsocialdrinkPhotoDAO.loadPhotoByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkPhotoDAO.save(lsocialdrinkPhoto);
			socialdrink.dao.DrinkDAO lsocialdrinkDrinkDAO = lDAOFactory.getDrinkDAO();
			socialdrink.Drink lsocialdrinkDrink = lsocialdrinkDrinkDAO.loadDrinkByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkDrinkDAO.save(lsocialdrinkDrink);
			socialdrink.dao.contactTypeDAO lsocialdrinkcontactTypeDAO = lDAOFactory.getcontactTypeDAO();
			socialdrink.contactType lsocialdrinkcontactType = lsocialdrinkcontactTypeDAO.loadContactTypeByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkcontactTypeDAO.save(lsocialdrinkcontactType);
			socialdrink.dao.IngredientDAO lsocialdrinkIngredientDAO = lDAOFactory.getIngredientDAO();
			socialdrink.Ingredient lsocialdrinkIngredient = lsocialdrinkIngredientDAO.loadIngredientByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkIngredientDAO.save(lsocialdrinkIngredient);
			socialdrink.dao.StepDAO lsocialdrinkStepDAO = lDAOFactory.getStepDAO();
			socialdrink.Step lsocialdrinkStep = lsocialdrinkStepDAO.loadStepByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkStepDAO.save(lsocialdrinkStep);
			socialdrink.dao.DrinkIngredientDAO lsocialdrinkDrinkIngredientDAO = lDAOFactory.getDrinkIngredientDAO();
			socialdrink.DrinkIngredient lsocialdrinkDrinkIngredient = lsocialdrinkDrinkIngredientDAO.loadDrinkIngredientByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkDrinkIngredientDAO.save(lsocialdrinkDrinkIngredient);
			socialdrink.dao.MeasureDAO lsocialdrinkMeasureDAO = lDAOFactory.getMeasureDAO();
			socialdrink.Measure lsocialdrinkMeasure = lsocialdrinkMeasureDAO.loadMeasureByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkMeasureDAO.save(lsocialdrinkMeasure);
			socialdrink.dao.EvaluationDAO lsocialdrinkEvaluationDAO = lDAOFactory.getEvaluationDAO();
			socialdrink.Evaluation lsocialdrinkEvaluation = lsocialdrinkEvaluationDAO.loadEvaluationByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkEvaluationDAO.save(lsocialdrinkEvaluation);
			socialdrink.dao.DosageDAO lsocialdrinkDosageDAO = lDAOFactory.getDosageDAO();
			socialdrink.Dosage lsocialdrinkDosage = lsocialdrinkDosageDAO.loadDosageByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkDosageDAO.save(lsocialdrinkDosage);
			socialdrink.dao.yeldTypeDAO lsocialdrinkyeldTypeDAO = lDAOFactory.getyeldTypeDAO();
			socialdrink.yeldType lsocialdrinkyeldType = lsocialdrinkyeldTypeDAO.loadYeldTypeByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkyeldTypeDAO.save(lsocialdrinkyeldType);
			socialdrink.dao.drinkTypeDAO lsocialdrinkdrinkTypeDAO = lDAOFactory.getdrinkTypeDAO();
			socialdrink.drinkType lsocialdrinkdrinkType = lsocialdrinkdrinkTypeDAO.loadDrinkTypeByQuery(null, null);
			// Update the properties of the persistent object
			lsocialdrinkdrinkTypeDAO.save(lsocialdrinkdrinkType);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Consumer by ConsumerCriteria");
		socialdrink.ConsumerCriteria lsocialdrinkConsumerCriteria = new socialdrink.ConsumerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkConsumerCriteria.ID.eq();
		System.out.println(lsocialdrinkConsumerCriteria.uniqueConsumer());
		
		System.out.println("Retrieving Bar by BarCriteria");
		socialdrink.BarCriteria lsocialdrinkBarCriteria = new socialdrink.BarCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkBarCriteria.ID.eq();
		System.out.println(lsocialdrinkBarCriteria.uniqueBar());
		
		System.out.println("Retrieving Address by AddressCriteria");
		socialdrink.AddressCriteria lsocialdrinkAddressCriteria = new socialdrink.AddressCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkAddressCriteria.ID.eq();
		System.out.println(lsocialdrinkAddressCriteria.uniqueAddress());
		
		System.out.println("Retrieving Contact by ContactCriteria");
		socialdrink.ContactCriteria lsocialdrinkContactCriteria = new socialdrink.ContactCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkContactCriteria.ID.eq();
		System.out.println(lsocialdrinkContactCriteria.uniqueContact());
		
		System.out.println("Retrieving Weekday by WeekdayCriteria");
		socialdrink.WeekdayCriteria lsocialdrinkWeekdayCriteria = new socialdrink.WeekdayCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkWeekdayCriteria.ID.eq();
		System.out.println(lsocialdrinkWeekdayCriteria.uniqueWeekday());
		
		System.out.println("Retrieving City by CityCriteria");
		socialdrink.CityCriteria lsocialdrinkCityCriteria = new socialdrink.CityCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkCityCriteria.ID.eq();
		System.out.println(lsocialdrinkCityCriteria.uniqueCity());
		
		System.out.println("Retrieving Country by CountryCriteria");
		socialdrink.CountryCriteria lsocialdrinkCountryCriteria = new socialdrink.CountryCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkCountryCriteria.ID.eq();
		System.out.println(lsocialdrinkCountryCriteria.uniqueCountry());
		
		System.out.println("Retrieving Photo by PhotoCriteria");
		socialdrink.PhotoCriteria lsocialdrinkPhotoCriteria = new socialdrink.PhotoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkPhotoCriteria.ID.eq();
		System.out.println(lsocialdrinkPhotoCriteria.uniquePhoto());
		
		System.out.println("Retrieving Drink by DrinkCriteria");
		socialdrink.DrinkCriteria lsocialdrinkDrinkCriteria = new socialdrink.DrinkCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkDrinkCriteria.ID.eq();
		System.out.println(lsocialdrinkDrinkCriteria.uniqueDrink());
		
		System.out.println("Retrieving contactType by contactTypeCriteria");
		socialdrink.contactTypeCriteria lsocialdrinkcontactTypeCriteria = new socialdrink.contactTypeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkcontactTypeCriteria.ID.eq();
		System.out.println(lsocialdrinkcontactTypeCriteria.uniqueContactType());
		
		System.out.println("Retrieving Ingredient by IngredientCriteria");
		socialdrink.IngredientCriteria lsocialdrinkIngredientCriteria = new socialdrink.IngredientCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkIngredientCriteria.ID.eq();
		System.out.println(lsocialdrinkIngredientCriteria.uniqueIngredient());
		
		System.out.println("Retrieving Step by StepCriteria");
		socialdrink.StepCriteria lsocialdrinkStepCriteria = new socialdrink.StepCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkStepCriteria.ID.eq();
		System.out.println(lsocialdrinkStepCriteria.uniqueStep());
		
		System.out.println("Retrieving DrinkIngredient by DrinkIngredientCriteria");
		socialdrink.DrinkIngredientCriteria lsocialdrinkDrinkIngredientCriteria = new socialdrink.DrinkIngredientCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkDrinkIngredientCriteria.ID.eq();
		System.out.println(lsocialdrinkDrinkIngredientCriteria.uniqueDrinkIngredient());
		
		System.out.println("Retrieving Measure by MeasureCriteria");
		socialdrink.MeasureCriteria lsocialdrinkMeasureCriteria = new socialdrink.MeasureCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkMeasureCriteria.ID.eq();
		System.out.println(lsocialdrinkMeasureCriteria.uniqueMeasure());
		
		System.out.println("Retrieving Evaluation by EvaluationCriteria");
		socialdrink.EvaluationCriteria lsocialdrinkEvaluationCriteria = new socialdrink.EvaluationCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkEvaluationCriteria.ID.eq();
		System.out.println(lsocialdrinkEvaluationCriteria.uniqueEvaluation());
		
		System.out.println("Retrieving Dosage by DosageCriteria");
		socialdrink.DosageCriteria lsocialdrinkDosageCriteria = new socialdrink.DosageCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkDosageCriteria.ID.eq();
		System.out.println(lsocialdrinkDosageCriteria.uniqueDosage());
		
		System.out.println("Retrieving yeldType by yeldTypeCriteria");
		socialdrink.yeldTypeCriteria lsocialdrinkyeldTypeCriteria = new socialdrink.yeldTypeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkyeldTypeCriteria.ID.eq();
		System.out.println(lsocialdrinkyeldTypeCriteria.uniqueYeldType());
		
		System.out.println("Retrieving drinkType by drinkTypeCriteria");
		socialdrink.drinkTypeCriteria lsocialdrinkdrinkTypeCriteria = new socialdrink.drinkTypeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsocialdrinkdrinkTypeCriteria.ID.eq();
		System.out.println(lsocialdrinkdrinkTypeCriteria.uniqueDrinkType());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateSocialDrinkData retrieveAndUpdateSocialDrinkData = new RetrieveAndUpdateSocialDrinkData();
			try {
				retrieveAndUpdateSocialDrinkData.retrieveAndUpdateTestData();
				//retrieveAndUpdateSocialDrinkData.retrieveByCriteria();
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