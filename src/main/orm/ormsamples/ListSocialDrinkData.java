/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListSocialDrinkData {
	private static final int ROW_COUNT = 100;
	
public void listTestData() throws PersistentException {
		socialdrink.DAOFactory lDAOFactory = socialdrink.DAOFactory.getDAOFactory();
		System.out.println("Listing Bar...");
		socialdrink.Bar[] socialdrinkBars = lDAOFactory.getBarDAO().listBarByQuery(null, null);
		int length = Math.min(socialdrinkBars.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkBars[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Address...");
		socialdrink.Address[] socialdrinkAddresses = lDAOFactory.getAddressDAO().listAddressByQuery(null, null);
		length = Math.min(socialdrinkAddresses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkAddresses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Weekday...");
		socialdrink.Weekday[] socialdrinkWeekdays = lDAOFactory.getWeekdayDAO().listWeekdayByQuery(null, null);
		length = Math.min(socialdrinkWeekdays.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkWeekdays[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing City...");
		socialdrink.City[] socialdrinkCitys = lDAOFactory.getCityDAO().listCityByQuery(null, null);
		length = Math.min(socialdrinkCitys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkCitys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Country...");
		socialdrink.Country[] socialdrinkCountrys = lDAOFactory.getCountryDAO().listCountryByQuery(null, null);
		length = Math.min(socialdrinkCountrys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkCountrys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Photo...");
		socialdrink.Photo[] socialdrinkPhotos = lDAOFactory.getPhotoDAO().listPhotoByQuery(null, null);
		length = Math.min(socialdrinkPhotos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkPhotos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Drink...");
		socialdrink.Drink[] socialdrinkDrinks = lDAOFactory.getDrinkDAO().listDrinkByQuery(null, null);
		length = Math.min(socialdrinkDrinks.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkDrinks[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Ingredient...");
		socialdrink.Ingredient[] socialdrinkIngredients = lDAOFactory.getIngredientDAO().listIngredientByQuery(null, null);
		length = Math.min(socialdrinkIngredients.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkIngredients[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Step...");
		socialdrink.Step[] socialdrinkSteps = lDAOFactory.getStepDAO().listStepByQuery(null, null);
		length = Math.min(socialdrinkSteps.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkSteps[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing DrinkIngredient...");
		socialdrink.DrinkIngredient[] socialdrinkDrinkIngredients = lDAOFactory.getDrinkIngredientDAO().listDrinkIngredientByQuery(null, null);
		length = Math.min(socialdrinkDrinkIngredients.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkDrinkIngredients[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Evaluation...");
		socialdrink.Evaluation[] socialdrinkEvaluations = lDAOFactory.getEvaluationDAO().listEvaluationByQuery(null, null);
		length = Math.min(socialdrinkEvaluations.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkEvaluations[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing DrinkType...");
		socialdrink.DrinkType[] socialdrinkDrinkTypes = lDAOFactory.getDrinkTypeDAO().listDrinkTypeByQuery(null, null);
		length = Math.min(socialdrinkDrinkTypes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkDrinkTypes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Album...");
		socialdrink.Album[] socialdrinkAlbums = lDAOFactory.getAlbumDAO().listAlbumByQuery(null, null);
		length = Math.min(socialdrinkAlbums.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkAlbums[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Consumer...");
		socialdrink.Consumer[] socialdrinkConsumers = lDAOFactory.getConsumerDAO().listConsumerByQuery(null, null);
		length = Math.min(socialdrinkConsumers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(socialdrinkConsumers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Bar by Criteria...");
		socialdrink.BarCriteria lsocialdrinkBarCriteria = new socialdrink.BarCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkBarCriteria.ID.eq();
		lsocialdrinkBarCriteria.setMaxResults(ROW_COUNT);
		socialdrink.Bar[] socialdrinkBars = lsocialdrinkBarCriteria.listBar();
		int length =socialdrinkBars== null ? 0 : Math.min(socialdrinkBars.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkBars[i]);
		}
		System.out.println(length + " Bar record(s) retrieved."); 
		
		System.out.println("Listing Address by Criteria...");
		socialdrink.AddressCriteria lsocialdrinkAddressCriteria = new socialdrink.AddressCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkAddressCriteria.ID.eq();
		lsocialdrinkAddressCriteria.setMaxResults(ROW_COUNT);
		socialdrink.Address[] socialdrinkAddresses = lsocialdrinkAddressCriteria.listAddress();
		length =socialdrinkAddresses== null ? 0 : Math.min(socialdrinkAddresses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkAddresses[i]);
		}
		System.out.println(length + " Address record(s) retrieved."); 
		
		System.out.println("Listing Weekday by Criteria...");
		socialdrink.WeekdayCriteria lsocialdrinkWeekdayCriteria = new socialdrink.WeekdayCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkWeekdayCriteria.ID.eq();
		lsocialdrinkWeekdayCriteria.setMaxResults(ROW_COUNT);
		socialdrink.Weekday[] socialdrinkWeekdays = lsocialdrinkWeekdayCriteria.listWeekday();
		length =socialdrinkWeekdays== null ? 0 : Math.min(socialdrinkWeekdays.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkWeekdays[i]);
		}
		System.out.println(length + " Weekday record(s) retrieved."); 
		
		System.out.println("Listing City by Criteria...");
		socialdrink.CityCriteria lsocialdrinkCityCriteria = new socialdrink.CityCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkCityCriteria.ID.eq();
		lsocialdrinkCityCriteria.setMaxResults(ROW_COUNT);
		socialdrink.City[] socialdrinkCitys = lsocialdrinkCityCriteria.listCity();
		length =socialdrinkCitys== null ? 0 : Math.min(socialdrinkCitys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkCitys[i]);
		}
		System.out.println(length + " City record(s) retrieved."); 
		
		System.out.println("Listing Country by Criteria...");
		socialdrink.CountryCriteria lsocialdrinkCountryCriteria = new socialdrink.CountryCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkCountryCriteria.ID.eq();
		lsocialdrinkCountryCriteria.setMaxResults(ROW_COUNT);
		socialdrink.Country[] socialdrinkCountrys = lsocialdrinkCountryCriteria.listCountry();
		length =socialdrinkCountrys== null ? 0 : Math.min(socialdrinkCountrys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkCountrys[i]);
		}
		System.out.println(length + " Country record(s) retrieved."); 
		
		System.out.println("Listing Photo by Criteria...");
		socialdrink.PhotoCriteria lsocialdrinkPhotoCriteria = new socialdrink.PhotoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkPhotoCriteria.ID.eq();
		lsocialdrinkPhotoCriteria.setMaxResults(ROW_COUNT);
		socialdrink.Photo[] socialdrinkPhotos = lsocialdrinkPhotoCriteria.listPhoto();
		length =socialdrinkPhotos== null ? 0 : Math.min(socialdrinkPhotos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkPhotos[i]);
		}
		System.out.println(length + " Photo record(s) retrieved."); 
		
		System.out.println("Listing Drink by Criteria...");
		socialdrink.DrinkCriteria lsocialdrinkDrinkCriteria = new socialdrink.DrinkCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkDrinkCriteria.ID.eq();
		lsocialdrinkDrinkCriteria.setMaxResults(ROW_COUNT);
		socialdrink.Drink[] socialdrinkDrinks = lsocialdrinkDrinkCriteria.listDrink();
		length =socialdrinkDrinks== null ? 0 : Math.min(socialdrinkDrinks.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkDrinks[i]);
		}
		System.out.println(length + " Drink record(s) retrieved."); 
		
		System.out.println("Listing Ingredient by Criteria...");
		socialdrink.IngredientCriteria lsocialdrinkIngredientCriteria = new socialdrink.IngredientCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkIngredientCriteria.ID.eq();
		lsocialdrinkIngredientCriteria.setMaxResults(ROW_COUNT);
		socialdrink.Ingredient[] socialdrinkIngredients = lsocialdrinkIngredientCriteria.listIngredient();
		length =socialdrinkIngredients== null ? 0 : Math.min(socialdrinkIngredients.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkIngredients[i]);
		}
		System.out.println(length + " Ingredient record(s) retrieved."); 
		
		System.out.println("Listing Step by Criteria...");
		socialdrink.StepCriteria lsocialdrinkStepCriteria = new socialdrink.StepCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkStepCriteria.ID.eq();
		lsocialdrinkStepCriteria.setMaxResults(ROW_COUNT);
		socialdrink.Step[] socialdrinkSteps = lsocialdrinkStepCriteria.listStep();
		length =socialdrinkSteps== null ? 0 : Math.min(socialdrinkSteps.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkSteps[i]);
		}
		System.out.println(length + " Step record(s) retrieved."); 
		
		System.out.println("Listing DrinkIngredient by Criteria...");
		socialdrink.DrinkIngredientCriteria lsocialdrinkDrinkIngredientCriteria = new socialdrink.DrinkIngredientCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkDrinkIngredientCriteria.ID.eq();
		lsocialdrinkDrinkIngredientCriteria.setMaxResults(ROW_COUNT);
		socialdrink.DrinkIngredient[] socialdrinkDrinkIngredients = lsocialdrinkDrinkIngredientCriteria.listDrinkIngredient();
		length =socialdrinkDrinkIngredients== null ? 0 : Math.min(socialdrinkDrinkIngredients.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkDrinkIngredients[i]);
		}
		System.out.println(length + " DrinkIngredient record(s) retrieved."); 
		
		System.out.println("Listing Evaluation by Criteria...");
		socialdrink.EvaluationCriteria lsocialdrinkEvaluationCriteria = new socialdrink.EvaluationCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkEvaluationCriteria.ID.eq();
		lsocialdrinkEvaluationCriteria.setMaxResults(ROW_COUNT);
		socialdrink.Evaluation[] socialdrinkEvaluations = lsocialdrinkEvaluationCriteria.listEvaluation();
		length =socialdrinkEvaluations== null ? 0 : Math.min(socialdrinkEvaluations.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkEvaluations[i]);
		}
		System.out.println(length + " Evaluation record(s) retrieved."); 
		
		System.out.println("Listing DrinkType by Criteria...");
		socialdrink.DrinkTypeCriteria lsocialdrinkDrinkTypeCriteria = new socialdrink.DrinkTypeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkDrinkTypeCriteria.ID.eq();
		lsocialdrinkDrinkTypeCriteria.setMaxResults(ROW_COUNT);
		socialdrink.DrinkType[] socialdrinkDrinkTypes = lsocialdrinkDrinkTypeCriteria.listDrinkType();
		length =socialdrinkDrinkTypes== null ? 0 : Math.min(socialdrinkDrinkTypes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkDrinkTypes[i]);
		}
		System.out.println(length + " DrinkType record(s) retrieved."); 
		
		System.out.println("Listing Album by Criteria...");
		socialdrink.AlbumCriteria lsocialdrinkAlbumCriteria = new socialdrink.AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkAlbumCriteria.ID.eq();
		lsocialdrinkAlbumCriteria.setMaxResults(ROW_COUNT);
		socialdrink.Album[] socialdrinkAlbums = lsocialdrinkAlbumCriteria.listAlbum();
		length =socialdrinkAlbums== null ? 0 : Math.min(socialdrinkAlbums.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkAlbums[i]);
		}
		System.out.println(length + " Album record(s) retrieved."); 
		
		System.out.println("Listing Consumer by Criteria...");
		socialdrink.ConsumerCriteria lsocialdrinkConsumerCriteria = new socialdrink.ConsumerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsocialdrinkConsumerCriteria.ID.eq();
		lsocialdrinkConsumerCriteria.setMaxResults(ROW_COUNT);
		socialdrink.Consumer[] socialdrinkConsumers = lsocialdrinkConsumerCriteria.listConsumer();
		length =socialdrinkConsumers== null ? 0 : Math.min(socialdrinkConsumers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(socialdrinkConsumers[i]);
		}
		System.out.println(length + " Consumer record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListSocialDrinkData listSocialDrinkData = new ListSocialDrinkData();
			try {
				listSocialDrinkData.listTestData();
				//listSocialDrinkData.listByCriteria();
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
