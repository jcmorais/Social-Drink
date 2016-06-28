package socialdrink;

import org.hibernate.LockMode;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import socialdrink.*;
import socialdrink.dao.*;
import socialdrink.impl.*;

import java.util.Iterator;
import java.util.List;

/**
 * Created by carlosmorais on 13/06/16.
 */
public class Facade {
    private DrinkDAO drinkDAO;
    private UserDAO userDAO;
    private AddressDAO addressDAO;
    private BarDAO barDAO;
    private ConsumerDAO consumerDAO;
    private PhotoDAO photoDAO;
    private DrinkTypeDAO drinkTypeDAO;
    private IngredientDAO ingredientDAO;
    private StepDAO stepDAO;
    private DrinkIngredientDAO drinkIngredientDAO;
    private CountryDAO countryDAO;
    private CityDAO cityDAO;
    private WeekdayDAO weekdayDAO;


    public Drink loadDrinkByORMID(int ID) throws PersistentException {
        return drinkDAO.loadDrinkByORMID(ID);
    }

    public Drink[] listDrinkByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkDAO.listDrinkByQuery(condition, orderBy, lockMode);
    }

    public Iterator iterateDrinkByQuery(String condition, String orderBy) throws PersistentException {
        return drinkDAO.iterateDrinkByQuery(condition, orderBy);
    }

    public Drink loadDrinkByCriteria(DrinkCriteria drinkCriteria) {
        return drinkDAO.loadDrinkByCriteria(drinkCriteria);
    }

    public Drink[] listDrinkByCriteria(DrinkCriteria drinkCriteria) {
        return drinkDAO.listDrinkByCriteria(drinkCriteria);
    }

    public Drink[] listDrinkByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkDAO.listDrinkByQuery(session, condition, orderBy, lockMode);
    }

    public Drink getDrinkByORMID(int ID, LockMode lockMode) throws PersistentException {
        return drinkDAO.getDrinkByORMID(ID, lockMode);
    }

    public Drink getDrinkByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return drinkDAO.getDrinkByORMID(session, ID, lockMode);
    }

    public Drink loadDrinkByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkDAO.loadDrinkByQuery(condition, orderBy, lockMode);
    }

    public Drink createDrink() {
        return drinkDAO.createDrink();
    }

    public Drink loadDrinkByQuery(String condition, String orderBy) throws PersistentException {
        return drinkDAO.loadDrinkByQuery(condition, orderBy);
    }

    public Drink getDrinkByORMID(PersistentSession session, int ID) throws PersistentException {
        return drinkDAO.getDrinkByORMID(session, ID);
    }

    public boolean delete(Drink drink) throws PersistentException {
        return drinkDAO.delete(drink);
    }

    public List queryDrink(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return drinkDAO.queryDrink(session, condition, orderBy);
    }

    public boolean refresh(Drink drink) throws PersistentException {
        return drinkDAO.refresh(drink);
    }

    public Drink loadDrinkByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return drinkDAO.loadDrinkByORMID(session, ID, lockMode);
    }

    public Drink loadDrinkByORMID(int ID, LockMode lockMode) throws PersistentException {
        return drinkDAO.loadDrinkByORMID(ID, lockMode);
    }

    public Iterator iterateDrinkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return drinkDAO.iterateDrinkByQuery(session, condition, orderBy);
    }

    public Drink loadDrinkByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkDAO.loadDrinkByQuery(session, condition, orderBy, lockMode);
    }

    public Drink getDrinkByORMID(int ID) throws PersistentException {
        return drinkDAO.getDrinkByORMID(ID);
    }

    public boolean evict(Drink drink) throws PersistentException {
        return drinkDAO.evict(drink);
    }

    public Iterator iterateDrinkByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkDAO.iterateDrinkByQuery(session, condition, orderBy, lockMode);
    }

    public boolean save(Drink drink) throws PersistentException {
        return drinkDAO.save(drink);
    }

    public Drink loadDrinkByORMID(PersistentSession session, int ID) throws PersistentException {
        return drinkDAO.loadDrinkByORMID(session, ID);
    }

    public Drink[] listDrinkByQuery(String condition, String orderBy) throws PersistentException {
        return drinkDAO.listDrinkByQuery(condition, orderBy);
    }

    public List queryDrink(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkDAO.queryDrink(session, condition, orderBy, lockMode);
    }

    public List queryDrink(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkDAO.queryDrink(condition, orderBy, lockMode);
    }

    public Iterator iterateDrinkByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkDAO.iterateDrinkByQuery(condition, orderBy, lockMode);
    }

    public Drink[] listDrinkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return drinkDAO.listDrinkByQuery(session, condition, orderBy);
    }

    public List queryDrink(String condition, String orderBy) throws PersistentException {
        return drinkDAO.queryDrink(condition, orderBy);
    }

    public Drink loadDrinkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return drinkDAO.loadDrinkByQuery(session, condition, orderBy);
    }

    public User loadUserByORMID(int ID) throws PersistentException {
        return userDAO.loadUserByORMID(ID);
    }

    public List queryUser(String condition, String orderBy) throws PersistentException {
        return userDAO.queryUser(condition, orderBy);
    }

    public boolean delete(User user) throws PersistentException {
        return userDAO.delete(user);
    }

    public User getUserByORMID(int ID) throws PersistentException {
        return userDAO.getUserByORMID(ID);
    }

    public User[] listUserByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return userDAO.listUserByQuery(condition, orderBy, lockMode);
    }

    public User[] listUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return userDAO.listUserByQuery(session, condition, orderBy);
    }

    public User loadUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return userDAO.loadUserByQuery(session, condition, orderBy);
    }

    public Iterator iterateUserByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return userDAO.iterateUserByQuery(condition, orderBy, lockMode);
    }

    public User loadUserByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return userDAO.loadUserByORMID(session, ID, lockMode);
    }

    public User getUserByORMID(int ID, LockMode lockMode) throws PersistentException {
        return userDAO.getUserByORMID(ID, lockMode);
    }

    public List queryUser(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return userDAO.queryUser(condition, orderBy, lockMode);
    }

    public User[] listUserByQuery(String condition, String orderBy) throws PersistentException {
        return userDAO.listUserByQuery(condition, orderBy);
    }

    public User loadUserByQuery(String condition, String orderBy) throws PersistentException {
        return userDAO.loadUserByQuery(condition, orderBy);
    }

    public Iterator iterateUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return userDAO.iterateUserByQuery(session, condition, orderBy);
    }

    public boolean refresh(User user) throws PersistentException {
        return userDAO.refresh(user);
    }

    public boolean evict(User user) throws PersistentException {
        return userDAO.evict(user);
    }

    public User loadUserByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return userDAO.loadUserByQuery(session, condition, orderBy, lockMode);
    }

    public List queryUser(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return userDAO.queryUser(session, condition, orderBy, lockMode);
    }

    public boolean save(User user) throws PersistentException {
        return userDAO.save(user);
    }

    public User loadUserByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return userDAO.loadUserByQuery(condition, orderBy, lockMode);
    }

    public List queryUser(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return userDAO.queryUser(session, condition, orderBy);
    }

    public User[] listUserByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return userDAO.listUserByQuery(session, condition, orderBy, lockMode);
    }

    public Iterator iterateUserByQuery(String condition, String orderBy) throws PersistentException {
        return userDAO.iterateUserByQuery(condition, orderBy);
    }

    public User loadUserByCriteria(UserCriteria userCriteria) {
        return userDAO.loadUserByCriteria(userCriteria);
    }

    public User getUserByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return userDAO.getUserByORMID(session, ID, lockMode);
    }

    public User loadUserByORMID(int ID, LockMode lockMode) throws PersistentException {
        return userDAO.loadUserByORMID(ID, lockMode);
    }

    public User loadUserByORMID(PersistentSession session, int ID) throws PersistentException {
        return userDAO.loadUserByORMID(session, ID);
    }

    public User[] listUserByCriteria(UserCriteria userCriteria) {
        return userDAO.listUserByCriteria(userCriteria);
    }

    public User getUserByORMID(PersistentSession session, int ID) throws PersistentException {
        return userDAO.getUserByORMID(session, ID);
    }

    public Iterator iterateUserByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return userDAO.iterateUserByQuery(session, condition, orderBy, lockMode);
    }

    public Address loadAddressByORMID(int ID) throws PersistentException {
        return addressDAO.loadAddressByORMID(ID);
    }

    public Iterator iterateAddressByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return addressDAO.iterateAddressByQuery(condition, orderBy, lockMode);
    }

    public List queryAddress(String condition, String orderBy) throws PersistentException {
        return addressDAO.queryAddress(condition, orderBy);
    }

    public Address[] listAddressByCriteria(AddressCriteria addressCriteria) {
        return addressDAO.listAddressByCriteria(addressCriteria);
    }

    public boolean delete(Address address) throws PersistentException {
        return addressDAO.delete(address);
    }

    public Address loadAddressByCriteria(AddressCriteria addressCriteria) {
        return addressDAO.loadAddressByCriteria(addressCriteria);
    }

    public Address loadAddressByORMID(PersistentSession session, int ID) throws PersistentException {
        return addressDAO.loadAddressByORMID(session, ID);
    }

    public boolean evict(Address address) throws PersistentException {
        return addressDAO.evict(address);
    }

    public Address getAddressByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return addressDAO.getAddressByORMID(session, ID, lockMode);
    }

    public Address loadAddressByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return addressDAO.loadAddressByQuery(session, condition, orderBy, lockMode);
    }

    public Address getAddressByORMID(PersistentSession session, int ID) throws PersistentException {
        return addressDAO.getAddressByORMID(session, ID);
    }

    public Address[] listAddressByQuery(String condition, String orderBy) throws PersistentException {
        return addressDAO.listAddressByQuery(condition, orderBy);
    }

    public Address[] listAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return addressDAO.listAddressByQuery(session, condition, orderBy);
    }

    public Iterator iterateAddressByQuery(String condition, String orderBy) throws PersistentException {
        return addressDAO.iterateAddressByQuery(condition, orderBy);
    }

    public Iterator iterateAddressByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return addressDAO.iterateAddressByQuery(session, condition, orderBy, lockMode);
    }

    public Address loadAddressByORMID(int ID, LockMode lockMode) throws PersistentException {
        return addressDAO.loadAddressByORMID(ID, lockMode);
    }

    public Address createAddress() {
        return addressDAO.createAddress();
    }

    public List queryAddress(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return addressDAO.queryAddress(session, condition, orderBy, lockMode);
    }

    public Address loadAddressByQuery(String condition, String orderBy) throws PersistentException {
        return addressDAO.loadAddressByQuery(condition, orderBy);
    }

    public Address[] listAddressByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return addressDAO.listAddressByQuery(condition, orderBy, lockMode);
    }

    public Address getAddressByORMID(int ID, LockMode lockMode) throws PersistentException {
        return addressDAO.getAddressByORMID(ID, lockMode);
    }

    public List queryAddress(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return addressDAO.queryAddress(session, condition, orderBy);
    }

    public List queryAddress(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return addressDAO.queryAddress(condition, orderBy, lockMode);
    }

    public Address loadAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return addressDAO.loadAddressByQuery(session, condition, orderBy);
    }

    public boolean refresh(Address address) throws PersistentException {
        return addressDAO.refresh(address);
    }

    public Address loadAddressByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return addressDAO.loadAddressByQuery(condition, orderBy, lockMode);
    }

    public Address getAddressByORMID(int ID) throws PersistentException {
        return addressDAO.getAddressByORMID(ID);
    }

    public Iterator iterateAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return addressDAO.iterateAddressByQuery(session, condition, orderBy);
    }

    public Address loadAddressByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return addressDAO.loadAddressByORMID(session, ID, lockMode);
    }

    public Address[] listAddressByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return addressDAO.listAddressByQuery(session, condition, orderBy, lockMode);
    }

    public boolean save(Address address) throws PersistentException {
        return addressDAO.save(address);
    }

    public Bar loadBarByORMID(int ID) throws PersistentException {
        return barDAO.loadBarByORMID(ID);
    }

    public Bar createBar() {
        return barDAO.createBar();
    }

    public List queryBar(String condition, String orderBy) throws PersistentException {
        return barDAO.queryBar(condition, orderBy);
    }

    public Bar loadBarByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return barDAO.loadBarByORMID(session, ID, lockMode);
    }

    public Bar loadBarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return barDAO.loadBarByQuery(session, condition, orderBy);
    }

    public Bar loadBarByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return barDAO.loadBarByQuery(session, condition, orderBy, lockMode);
    }

    public boolean save(Bar bar) throws PersistentException {
        return barDAO.save(bar);
    }

    public Bar getBarByORMID(PersistentSession session, int ID) throws PersistentException {
        return barDAO.getBarByORMID(session, ID);
    }

    public Iterator iterateBarByQuery(String condition, String orderBy) throws PersistentException {
        return barDAO.iterateBarByQuery(condition, orderBy);
    }

    public List queryBar(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return barDAO.queryBar(condition, orderBy, lockMode);
    }

    public Bar loadBarByQuery(String condition, String orderBy) throws PersistentException {
        return barDAO.loadBarByQuery(condition, orderBy);
    }

    public Iterator iterateBarByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return barDAO.iterateBarByQuery(condition, orderBy, lockMode);
    }

    public Bar loadBarByCriteria(BarCriteria barCriteria) {
        return barDAO.loadBarByCriteria(barCriteria);
    }

    public Iterator iterateBarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return barDAO.iterateBarByQuery(session, condition, orderBy);
    }

    public boolean refresh(Bar bar) throws PersistentException {
        return barDAO.refresh(bar);
    }

    public Bar[] listBarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return barDAO.listBarByQuery(session, condition, orderBy);
    }

    public List queryBar(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return barDAO.queryBar(session, condition, orderBy);
    }

    public Iterator iterateBarByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return barDAO.iterateBarByQuery(session, condition, orderBy, lockMode);
    }

    public Bar getBarByORMID(int ID) throws PersistentException {
        return barDAO.getBarByORMID(ID);
    }

    public Bar getBarByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return barDAO.getBarByORMID(session, ID, lockMode);
    }

    public Bar[] listBarByQuery(String condition, String orderBy) throws PersistentException {
        return barDAO.listBarByQuery(condition, orderBy);
    }

    public Bar getBarByORMID(int ID, LockMode lockMode) throws PersistentException {
        return barDAO.getBarByORMID(ID, lockMode);
    }

    public boolean delete(Bar bar) throws PersistentException {
        return barDAO.delete(bar);
    }

    public List queryBar(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return barDAO.queryBar(session, condition, orderBy, lockMode);
    }

    public Bar loadBarByORMID(int ID, LockMode lockMode) throws PersistentException {
        return barDAO.loadBarByORMID(ID, lockMode);
    }

    public Bar[] listBarByCriteria(BarCriteria barCriteria) {
        return barDAO.listBarByCriteria(barCriteria);
    }

    public Bar loadBarByORMID(PersistentSession session, int ID) throws PersistentException {
        return barDAO.loadBarByORMID(session, ID);
    }

    public Bar[] listBarByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return barDAO.listBarByQuery(condition, orderBy, lockMode);
    }

    public Bar[] listBarByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return barDAO.listBarByQuery(session, condition, orderBy, lockMode);
    }

    public Bar loadBarByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return barDAO.loadBarByQuery(condition, orderBy, lockMode);
    }

    public boolean evict(Bar bar) throws PersistentException {
        return barDAO.evict(bar);
    }

    public Consumer loadConsumerByORMID(int ID) throws PersistentException {
        return consumerDAO.loadConsumerByORMID(ID);
    }

    public Consumer[] listConsumerByQuery(String condition, String orderBy) throws PersistentException {
        return consumerDAO.listConsumerByQuery(condition, orderBy);
    }

    public boolean save(Consumer consumer) throws PersistentException {
        return consumerDAO.save(consumer);
    }

    public Consumer[] listConsumerByCriteria(ConsumerCriteria consumerCriteria) {
        return consumerDAO.listConsumerByCriteria(consumerCriteria);
    }

    public boolean delete(Consumer consumer) throws PersistentException {
        return consumerDAO.delete(consumer);
    }

    public Consumer getConsumerByORMID(int ID) throws PersistentException {
        return consumerDAO.getConsumerByORMID(ID);
    }

    public Iterator iterateConsumerByQuery(String condition, String orderBy) throws PersistentException {
        return consumerDAO.iterateConsumerByQuery(condition, orderBy);
    }

    public Consumer loadConsumerByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return consumerDAO.loadConsumerByORMID(session, ID, lockMode);
    }

    public Consumer loadConsumerByORMID(int ID, LockMode lockMode) throws PersistentException {
        return consumerDAO.loadConsumerByORMID(ID, lockMode);
    }

    public Consumer loadConsumerByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return consumerDAO.loadConsumerByQuery(condition, orderBy, lockMode);
    }

    public Iterator iterateConsumerByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return consumerDAO.iterateConsumerByQuery(session, condition, orderBy, lockMode);
    }

    public Consumer loadConsumerByQuery(String condition, String orderBy) throws PersistentException {
        return consumerDAO.loadConsumerByQuery(condition, orderBy);
    }

    public Consumer loadConsumerByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return consumerDAO.loadConsumerByQuery(session, condition, orderBy, lockMode);
    }

    public boolean refresh(Consumer consumer) throws PersistentException {
        return consumerDAO.refresh(consumer);
    }

    public List queryConsumer(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return consumerDAO.queryConsumer(session, condition, orderBy, lockMode);
    }

    public Iterator iterateConsumerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return consumerDAO.iterateConsumerByQuery(session, condition, orderBy);
    }

    public Consumer getConsumerByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return consumerDAO.getConsumerByORMID(session, ID, lockMode);
    }

    public Consumer loadConsumerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return consumerDAO.loadConsumerByQuery(session, condition, orderBy);
    }

    public Iterator iterateConsumerByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return consumerDAO.iterateConsumerByQuery(condition, orderBy, lockMode);
    }

    public Consumer[] listConsumerByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return consumerDAO.listConsumerByQuery(session, condition, orderBy, lockMode);
    }

    public List queryConsumer(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return consumerDAO.queryConsumer(session, condition, orderBy);
    }

    public boolean evict(Consumer consumer) throws PersistentException {
        return consumerDAO.evict(consumer);
    }

    public List queryConsumer(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return consumerDAO.queryConsumer(condition, orderBy, lockMode);
    }

    public Consumer[] listConsumerByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return consumerDAO.listConsumerByQuery(condition, orderBy, lockMode);
    }

    public Consumer getConsumerByORMID(PersistentSession session, int ID) throws PersistentException {
        return consumerDAO.getConsumerByORMID(session, ID);
    }

    public Consumer getConsumerByORMID(int ID, LockMode lockMode) throws PersistentException {
        return consumerDAO.getConsumerByORMID(ID, lockMode);
    }

    public List queryConsumer(String condition, String orderBy) throws PersistentException {
        return consumerDAO.queryConsumer(condition, orderBy);
    }

    public Consumer[] listConsumerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return consumerDAO.listConsumerByQuery(session, condition, orderBy);
    }

    public Consumer createConsumer() {
        return consumerDAO.createConsumer();
    }

    public Consumer loadConsumerByORMID(PersistentSession session, int ID) throws PersistentException {
        return consumerDAO.loadConsumerByORMID(session, ID);
    }

    public Consumer loadConsumerByCriteria(ConsumerCriteria consumerCriteria) {
        return consumerDAO.loadConsumerByCriteria(consumerCriteria);
    }

    public DrinkType loadDrinkTypeByORMID(int ID) throws PersistentException {
        return drinkTypeDAO.loadDrinkTypeByORMID(ID);
    }

    public DrinkType[] listDrinkTypeByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkTypeDAO.listDrinkTypeByQuery(condition, orderBy, lockMode);
    }

    public DrinkType loadDrinkTypeByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkTypeDAO.loadDrinkTypeByQuery(condition, orderBy, lockMode);
    }

    public List queryDrinkType(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkTypeDAO.queryDrinkType(condition, orderBy, lockMode);
    }

    public DrinkType loadDrinkTypeByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return drinkTypeDAO.loadDrinkTypeByORMID(session, ID, lockMode);
    }

    public List queryDrinkType(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkTypeDAO.queryDrinkType(session, condition, orderBy, lockMode);
    }

    public DrinkType loadDrinkTypeByCriteria(DrinkTypeCriteria drinkTypeCriteria) {
        return drinkTypeDAO.loadDrinkTypeByCriteria(drinkTypeCriteria);
    }

    public boolean evict(DrinkType drinkType) throws PersistentException {
        return drinkTypeDAO.evict(drinkType);
    }

    public DrinkType getDrinkTypeByORMID(int ID, LockMode lockMode) throws PersistentException {
        return drinkTypeDAO.getDrinkTypeByORMID(ID, lockMode);
    }

    public DrinkType loadDrinkTypeByORMID(int ID, LockMode lockMode) throws PersistentException {
        return drinkTypeDAO.loadDrinkTypeByORMID(ID, lockMode);
    }

    public DrinkType[] listDrinkTypeByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkTypeDAO.listDrinkTypeByQuery(session, condition, orderBy, lockMode);
    }

    public Iterator iterateDrinkTypeByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkTypeDAO.iterateDrinkTypeByQuery(condition, orderBy, lockMode);
    }

    public Iterator iterateDrinkTypeByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkTypeDAO.iterateDrinkTypeByQuery(session, condition, orderBy, lockMode);
    }

    public DrinkType loadDrinkTypeByORMID(PersistentSession session, int ID) throws PersistentException {
        return drinkTypeDAO.loadDrinkTypeByORMID(session, ID);
    }

    public boolean refresh(DrinkType drinkType) throws PersistentException {
        return drinkTypeDAO.refresh(drinkType);
    }

    public Iterator iterateDrinkTypeByQuery(String condition, String orderBy) throws PersistentException {
        return drinkTypeDAO.iterateDrinkTypeByQuery(condition, orderBy);
    }

    public DrinkType loadDrinkTypeByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkTypeDAO.loadDrinkTypeByQuery(session, condition, orderBy, lockMode);
    }

    public DrinkType[] listDrinkTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return drinkTypeDAO.listDrinkTypeByQuery(session, condition, orderBy);
    }

    public List queryDrinkType(String condition, String orderBy) throws PersistentException {
        return drinkTypeDAO.queryDrinkType(condition, orderBy);
    }

    public boolean save(DrinkType drinkType) throws PersistentException {
        return drinkTypeDAO.save(drinkType);
    }

    public DrinkType getDrinkTypeByORMID(PersistentSession session, int ID) throws PersistentException {
        return drinkTypeDAO.getDrinkTypeByORMID(session, ID);
    }

    public DrinkType getDrinkTypeByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return drinkTypeDAO.getDrinkTypeByORMID(session, ID, lockMode);
    }

    public DrinkType[] listDrinkTypeByQuery(String condition, String orderBy) throws PersistentException {
        return drinkTypeDAO.listDrinkTypeByQuery(condition, orderBy);
    }

    public DrinkType getDrinkTypeByORMID(int ID) throws PersistentException {
        return drinkTypeDAO.getDrinkTypeByORMID(ID);
    }

    public DrinkType loadDrinkTypeByQuery(String condition, String orderBy) throws PersistentException {
        return drinkTypeDAO.loadDrinkTypeByQuery(condition, orderBy);
    }

    public DrinkType createDrinkType() {
        return drinkTypeDAO.createDrinkType();
    }

    public boolean delete(DrinkType drinkType) throws PersistentException {
        return drinkTypeDAO.delete(drinkType);
    }

    public Iterator iterateDrinkTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return drinkTypeDAO.iterateDrinkTypeByQuery(session, condition, orderBy);
    }

    public DrinkType loadDrinkTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return drinkTypeDAO.loadDrinkTypeByQuery(session, condition, orderBy);
    }

    public DrinkType[] listDrinkTypeByCriteria(DrinkTypeCriteria drinkTypeCriteria) {
        return drinkTypeDAO.listDrinkTypeByCriteria(drinkTypeCriteria);
    }

    public List queryDrinkType(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return drinkTypeDAO.queryDrinkType(session, condition, orderBy);
    }

    public Photo loadPhotoByORMID(int ID) throws PersistentException {
        return photoDAO.loadPhotoByORMID(ID);
    }

    public Photo[] listPhotoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return photoDAO.listPhotoByQuery(session, condition, orderBy);
    }

    public Photo[] listPhotoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return photoDAO.listPhotoByQuery(session, condition, orderBy, lockMode);
    }

    public Iterator iteratePhotoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return photoDAO.iteratePhotoByQuery(session, condition, orderBy);
    }

    public boolean refresh(Photo photo) throws PersistentException {
        return photoDAO.refresh(photo);
    }

    public Photo loadPhotoByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return photoDAO.loadPhotoByORMID(session, ID, lockMode);
    }

    public Photo loadPhotoByCriteria(PhotoCriteria photoCriteria) {
        return photoDAO.loadPhotoByCriteria(photoCriteria);
    }

    public Photo[] listPhotoByCriteria(PhotoCriteria photoCriteria) {
        return photoDAO.listPhotoByCriteria(photoCriteria);
    }

    public Photo loadPhotoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return photoDAO.loadPhotoByQuery(session, condition, orderBy);
    }

    public List queryPhoto(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return photoDAO.queryPhoto(session, condition, orderBy);
    }

    public boolean delete(Photo photo) throws PersistentException {
        return photoDAO.delete(photo);
    }

    public Photo loadPhotoByORMID(int ID, LockMode lockMode) throws PersistentException {
        return photoDAO.loadPhotoByORMID(ID, lockMode);
    }

    public Photo[] listPhotoByQuery(String condition, String orderBy) throws PersistentException {
        return photoDAO.listPhotoByQuery(condition, orderBy);
    }

    public Photo createPhoto() {
        return photoDAO.createPhoto();
    }

    public Photo loadPhotoByQuery(String condition, String orderBy) throws PersistentException {
        return photoDAO.loadPhotoByQuery(condition, orderBy);
    }

    public Photo getPhotoByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return photoDAO.getPhotoByORMID(session, ID, lockMode);
    }

    public boolean evict(Photo photo) throws PersistentException {
        return photoDAO.evict(photo);
    }

    public Photo loadPhotoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return photoDAO.loadPhotoByQuery(condition, orderBy, lockMode);
    }

    public Iterator iteratePhotoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return photoDAO.iteratePhotoByQuery(session, condition, orderBy, lockMode);
    }

    public Photo getPhotoByORMID(int ID) throws PersistentException {
        return photoDAO.getPhotoByORMID(ID);
    }

    public Photo getPhotoByORMID(int ID, LockMode lockMode) throws PersistentException {
        return photoDAO.getPhotoByORMID(ID, lockMode);
    }

    public Photo loadPhotoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return photoDAO.loadPhotoByQuery(session, condition, orderBy, lockMode);
    }

    public Iterator iteratePhotoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return photoDAO.iteratePhotoByQuery(condition, orderBy, lockMode);
    }

    public Photo getPhotoByORMID(PersistentSession session, int ID) throws PersistentException {
        return photoDAO.getPhotoByORMID(session, ID);
    }

    public List queryPhoto(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return photoDAO.queryPhoto(condition, orderBy, lockMode);
    }

    public List queryPhoto(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return photoDAO.queryPhoto(session, condition, orderBy, lockMode);
    }

    public Photo loadPhotoByORMID(PersistentSession session, int ID) throws PersistentException {
        return photoDAO.loadPhotoByORMID(session, ID);
    }

    public List queryPhoto(String condition, String orderBy) throws PersistentException {
        return photoDAO.queryPhoto(condition, orderBy);
    }

    public boolean save(Photo photo) throws PersistentException {
        return photoDAO.save(photo);
    }

    public Photo[] listPhotoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return photoDAO.listPhotoByQuery(condition, orderBy, lockMode);
    }

    public Iterator iteratePhotoByQuery(String condition, String orderBy) throws PersistentException {
        return photoDAO.iteratePhotoByQuery(condition, orderBy);
    }

    public Ingredient loadIngredientByORMID(int ID) throws PersistentException {
        return ingredientDAO.loadIngredientByORMID(ID);
    }

    public Ingredient loadIngredientByORMID(PersistentSession session, int ID) throws PersistentException {
        return ingredientDAO.loadIngredientByORMID(session, ID);
    }

    public Ingredient loadIngredientByCriteria(IngredientCriteria ingredientCriteria) {
        return ingredientDAO.loadIngredientByCriteria(ingredientCriteria);
    }

    public Ingredient createIngredient() {
        return ingredientDAO.createIngredient();
    }

    public Ingredient[] listIngredientByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return ingredientDAO.listIngredientByQuery(condition, orderBy, lockMode);
    }

    public Iterator iterateIngredientByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return ingredientDAO.iterateIngredientByQuery(session, condition, orderBy, lockMode);
    }

    public Ingredient getIngredientByORMID(int ID) throws PersistentException {
        return ingredientDAO.getIngredientByORMID(ID);
    }

    public Ingredient loadIngredientByORMID(int ID, LockMode lockMode) throws PersistentException {
        return ingredientDAO.loadIngredientByORMID(ID, lockMode);
    }

    public List queryIngredient(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return ingredientDAO.queryIngredient(condition, orderBy, lockMode);
    }

    public Ingredient[] listIngredientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return ingredientDAO.listIngredientByQuery(session, condition, orderBy);
    }

    public boolean delete(Ingredient ingredient) throws PersistentException {
        return ingredientDAO.delete(ingredient);
    }

    public Ingredient loadIngredientByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return ingredientDAO.loadIngredientByQuery(session, condition, orderBy, lockMode);
    }

    public Ingredient getIngredientByORMID(int ID, LockMode lockMode) throws PersistentException {
        return ingredientDAO.getIngredientByORMID(ID, lockMode);
    }

    public Ingredient getIngredientByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return ingredientDAO.getIngredientByORMID(session, ID, lockMode);
    }

    public Ingredient[] listIngredientByQuery(String condition, String orderBy) throws PersistentException {
        return ingredientDAO.listIngredientByQuery(condition, orderBy);
    }

    public Ingredient loadIngredientByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return ingredientDAO.loadIngredientByQuery(condition, orderBy, lockMode);
    }

    public Iterator iterateIngredientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return ingredientDAO.iterateIngredientByQuery(session, condition, orderBy);
    }

    public Iterator iterateIngredientByQuery(String condition, String orderBy) throws PersistentException {
        return ingredientDAO.iterateIngredientByQuery(condition, orderBy);
    }

    public List queryIngredient(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return ingredientDAO.queryIngredient(session, condition, orderBy, lockMode);
    }

    public List queryIngredient(String condition, String orderBy) throws PersistentException {
        return ingredientDAO.queryIngredient(condition, orderBy);
    }

    public Ingredient getIngredientByORMID(PersistentSession session, int ID) throws PersistentException {
        return ingredientDAO.getIngredientByORMID(session, ID);
    }

    public Ingredient loadIngredientByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return ingredientDAO.loadIngredientByORMID(session, ID, lockMode);
    }

    public Ingredient loadIngredientByQuery(String condition, String orderBy) throws PersistentException {
        return ingredientDAO.loadIngredientByQuery(condition, orderBy);
    }

    public Ingredient[] listIngredientByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return ingredientDAO.listIngredientByQuery(session, condition, orderBy, lockMode);
    }

    public boolean evict(Ingredient ingredient) throws PersistentException {
        return ingredientDAO.evict(ingredient);
    }

    public Iterator iterateIngredientByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return ingredientDAO.iterateIngredientByQuery(condition, orderBy, lockMode);
    }

    public Ingredient loadIngredientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return ingredientDAO.loadIngredientByQuery(session, condition, orderBy);
    }

    public boolean save(Ingredient ingredient) throws PersistentException {
        return ingredientDAO.save(ingredient);
    }

    public Ingredient[] listIngredientByCriteria(IngredientCriteria ingredientCriteria) {
        return ingredientDAO.listIngredientByCriteria(ingredientCriteria);
    }

    public List queryIngredient(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return ingredientDAO.queryIngredient(session, condition, orderBy);
    }

    public boolean refresh(Ingredient ingredient) throws PersistentException {
        return ingredientDAO.refresh(ingredient);
    }

    public Step loadStepByORMID(int ID) throws PersistentException {
        return stepDAO.loadStepByORMID(ID);
    }

    public Step[] listStepByCriteria(StepCriteria stepCriteria) {
        return stepDAO.listStepByCriteria(stepCriteria);
    }

    public Step loadStepByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return stepDAO.loadStepByQuery(condition, orderBy, lockMode);
    }

    public Step loadStepByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return stepDAO.loadStepByQuery(session, condition, orderBy, lockMode);
    }

    public List queryStep(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return stepDAO.queryStep(condition, orderBy, lockMode);
    }

    public Step getStepByORMID(int ID, LockMode lockMode) throws PersistentException {
        return stepDAO.getStepByORMID(ID, lockMode);
    }

    public List queryStep(String condition, String orderBy) throws PersistentException {
        return stepDAO.queryStep(condition, orderBy);
    }

    public Step getStepByORMID(PersistentSession session, int ID) throws PersistentException {
        return stepDAO.getStepByORMID(session, ID);
    }

    public List queryStep(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return stepDAO.queryStep(session, condition, orderBy, lockMode);
    }

    public Step getStepByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return stepDAO.getStepByORMID(session, ID, lockMode);
    }

    public Step[] listStepByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return stepDAO.listStepByQuery(condition, orderBy, lockMode);
    }

    public Step createStep() {
        return stepDAO.createStep();
    }

    public Iterator iterateStepByQuery(String condition, String orderBy) throws PersistentException {
        return stepDAO.iterateStepByQuery(condition, orderBy);
    }

    public Step loadStepByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return stepDAO.loadStepByORMID(session, ID, lockMode);
    }

    public boolean evict(Step step) throws PersistentException {
        return stepDAO.evict(step);
    }

    public Step loadStepByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return stepDAO.loadStepByQuery(session, condition, orderBy);
    }

    public List queryStep(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return stepDAO.queryStep(session, condition, orderBy);
    }

    public boolean save(Step step) throws PersistentException {
        return stepDAO.save(step);
    }

    public Step loadStepByCriteria(StepCriteria stepCriteria) {
        return stepDAO.loadStepByCriteria(stepCriteria);
    }

    public Step getStepByORMID(int ID) throws PersistentException {
        return stepDAO.getStepByORMID(ID);
    }

    public Step loadStepByORMID(int ID, LockMode lockMode) throws PersistentException {
        return stepDAO.loadStepByORMID(ID, lockMode);
    }

    public Iterator iterateStepByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return stepDAO.iterateStepByQuery(session, condition, orderBy);
    }

    public Step loadStepByQuery(String condition, String orderBy) throws PersistentException {
        return stepDAO.loadStepByQuery(condition, orderBy);
    }

    public boolean delete(Step step) throws PersistentException {
        return stepDAO.delete(step);
    }

    public Step[] listStepByQuery(String condition, String orderBy) throws PersistentException {
        return stepDAO.listStepByQuery(condition, orderBy);
    }

    public Step loadStepByORMID(PersistentSession session, int ID) throws PersistentException {
        return stepDAO.loadStepByORMID(session, ID);
    }

    public Iterator iterateStepByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return stepDAO.iterateStepByQuery(condition, orderBy, lockMode);
    }

    public boolean refresh(Step step) throws PersistentException {
        return stepDAO.refresh(step);
    }

    public Step[] listStepByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return stepDAO.listStepByQuery(session, condition, orderBy);
    }

    public Step[] listStepByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return stepDAO.listStepByQuery(session, condition, orderBy, lockMode);
    }

    public Iterator iterateStepByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return stepDAO.iterateStepByQuery(session, condition, orderBy, lockMode);
    }

    public DrinkIngredient loadDrinkIngredientByORMID(int ID) throws PersistentException {
        return drinkIngredientDAO.loadDrinkIngredientByORMID(ID);
    }

    public Iterator iterateDrinkIngredientByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkIngredientDAO.iterateDrinkIngredientByQuery(condition, orderBy, lockMode);
    }

    public List queryDrinkIngredient(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkIngredientDAO.queryDrinkIngredient(condition, orderBy, lockMode);
    }

    public Iterator iterateDrinkIngredientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return drinkIngredientDAO.iterateDrinkIngredientByQuery(session, condition, orderBy);
    }

    public List queryDrinkIngredient(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return drinkIngredientDAO.queryDrinkIngredient(session, condition, orderBy);
    }

    public boolean evict(DrinkIngredient drinkIngredient) throws PersistentException {
        return drinkIngredientDAO.evict(drinkIngredient);
    }

    public DrinkIngredient loadDrinkIngredientByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkIngredientDAO.loadDrinkIngredientByQuery(condition, orderBy, lockMode);
    }

    public DrinkIngredient loadDrinkIngredientByCriteria(DrinkIngredientCriteria drinkIngredientCriteria) {
        return drinkIngredientDAO.loadDrinkIngredientByCriteria(drinkIngredientCriteria);
    }

    public DrinkIngredient[] listDrinkIngredientByQuery(String condition, String orderBy) throws PersistentException {
        return drinkIngredientDAO.listDrinkIngredientByQuery(condition, orderBy);
    }

    public DrinkIngredient[] listDrinkIngredientByCriteria(DrinkIngredientCriteria drinkIngredientCriteria) {
        return drinkIngredientDAO.listDrinkIngredientByCriteria(drinkIngredientCriteria);
    }

    public DrinkIngredient getDrinkIngredientByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return drinkIngredientDAO.getDrinkIngredientByORMID(session, ID, lockMode);
    }

    public DrinkIngredient createDrinkIngredient() {
        return drinkIngredientDAO.createDrinkIngredient();
    }

    public boolean delete(DrinkIngredient drinkIngredient) throws PersistentException {
        return drinkIngredientDAO.delete(drinkIngredient);
    }

    public List queryDrinkIngredient(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkIngredientDAO.queryDrinkIngredient(session, condition, orderBy, lockMode);
    }

    public Iterator iterateDrinkIngredientByQuery(String condition, String orderBy) throws PersistentException {
        return drinkIngredientDAO.iterateDrinkIngredientByQuery(condition, orderBy);
    }

    public DrinkIngredient loadDrinkIngredientByQuery(String condition, String orderBy) throws PersistentException {
        return drinkIngredientDAO.loadDrinkIngredientByQuery(condition, orderBy);
    }

    public Iterator iterateDrinkIngredientByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkIngredientDAO.iterateDrinkIngredientByQuery(session, condition, orderBy, lockMode);
    }

    public DrinkIngredient getDrinkIngredientByORMID(int ID, LockMode lockMode) throws PersistentException {
        return drinkIngredientDAO.getDrinkIngredientByORMID(ID, lockMode);
    }

    public boolean save(DrinkIngredient drinkIngredient) throws PersistentException {
        return drinkIngredientDAO.save(drinkIngredient);
    }

    public DrinkIngredient[] listDrinkIngredientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return drinkIngredientDAO.listDrinkIngredientByQuery(session, condition, orderBy);
    }

    public DrinkIngredient[] listDrinkIngredientByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkIngredientDAO.listDrinkIngredientByQuery(session, condition, orderBy, lockMode);
    }

    public DrinkIngredient loadDrinkIngredientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return drinkIngredientDAO.loadDrinkIngredientByQuery(session, condition, orderBy);
    }

    public boolean refresh(DrinkIngredient drinkIngredient) throws PersistentException {
        return drinkIngredientDAO.refresh(drinkIngredient);
    }

    public DrinkIngredient loadDrinkIngredientByORMID(PersistentSession session, int ID) throws PersistentException {
        return drinkIngredientDAO.loadDrinkIngredientByORMID(session, ID);
    }

    public DrinkIngredient getDrinkIngredientByORMID(PersistentSession session, int ID) throws PersistentException {
        return drinkIngredientDAO.getDrinkIngredientByORMID(session, ID);
    }

    public DrinkIngredient getDrinkIngredientByORMID(int ID) throws PersistentException {
        return drinkIngredientDAO.getDrinkIngredientByORMID(ID);
    }

    public DrinkIngredient loadDrinkIngredientByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return drinkIngredientDAO.loadDrinkIngredientByORMID(session, ID, lockMode);
    }

    public List queryDrinkIngredient(String condition, String orderBy) throws PersistentException {
        return drinkIngredientDAO.queryDrinkIngredient(condition, orderBy);
    }

    public DrinkIngredient[] listDrinkIngredientByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkIngredientDAO.listDrinkIngredientByQuery(condition, orderBy, lockMode);
    }

    public DrinkIngredient loadDrinkIngredientByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return drinkIngredientDAO.loadDrinkIngredientByQuery(session, condition, orderBy, lockMode);
    }

    public DrinkIngredient loadDrinkIngredientByORMID(int ID, LockMode lockMode) throws PersistentException {
        return drinkIngredientDAO.loadDrinkIngredientByORMID(ID, lockMode);
    }

    public Country loadCountryByORMID(int ID) throws PersistentException {
        return countryDAO.loadCountryByORMID(ID);
    }

    public Country[] listCountryByCriteria(CountryCriteria countryCriteria) {
        return countryDAO.listCountryByCriteria(countryCriteria);
    }

    public Iterator iterateCountryByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return countryDAO.iterateCountryByQuery(session, condition, orderBy, lockMode);
    }

    public Country loadCountryByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return countryDAO.loadCountryByQuery(condition, orderBy, lockMode);
    }

    public boolean save(Country country) throws PersistentException {
        return countryDAO.save(country);
    }

    public boolean refresh(Country country) throws PersistentException {
        return countryDAO.refresh(country);
    }

    public List queryCountry(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return countryDAO.queryCountry(condition, orderBy, lockMode);
    }

    public List queryCountry(String condition, String orderBy) throws PersistentException {
        return countryDAO.queryCountry(condition, orderBy);
    }

    public Iterator iterateCountryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return countryDAO.iterateCountryByQuery(session, condition, orderBy);
    }

    public Country loadCountryByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return countryDAO.loadCountryByQuery(session, condition, orderBy, lockMode);
    }

    public boolean deleteAndDissociate(Country country, PersistentSession session) throws PersistentException {
        return countryDAO.deleteAndDissociate(country, session);
    }

    public Country loadCountryByQuery(String condition, String orderBy) throws PersistentException {
        return countryDAO.loadCountryByQuery(condition, orderBy);
    }

    public Country createCountry() {
        return countryDAO.createCountry();
    }

    public Iterator iterateCountryByQuery(String condition, String orderBy) throws PersistentException {
        return countryDAO.iterateCountryByQuery(condition, orderBy);
    }

    public Country[] listCountryByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return countryDAO.listCountryByQuery(condition, orderBy, lockMode);
    }

    public Country loadCountryByORMID(PersistentSession session, int ID) throws PersistentException {
        return countryDAO.loadCountryByORMID(session, ID);
    }

    public Country loadCountryByCriteria(CountryCriteria countryCriteria) {
        return countryDAO.loadCountryByCriteria(countryCriteria);
    }

    public Country getCountryByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return countryDAO.getCountryByORMID(session, ID, lockMode);
    }

    public Country loadCountryByORMID(int ID, LockMode lockMode) throws PersistentException {
        return countryDAO.loadCountryByORMID(ID, lockMode);
    }

    public Iterator iterateCountryByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return countryDAO.iterateCountryByQuery(condition, orderBy, lockMode);
    }

    public List queryCountry(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return countryDAO.queryCountry(session, condition, orderBy);
    }

    public Country getCountryByORMID(int ID, LockMode lockMode) throws PersistentException {
        return countryDAO.getCountryByORMID(ID, lockMode);
    }

    public Country[] listCountryByQuery(String condition, String orderBy) throws PersistentException {
        return countryDAO.listCountryByQuery(condition, orderBy);
    }

    public boolean delete(Country country) throws PersistentException {
        return countryDAO.delete(country);
    }

    public List queryCountry(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return countryDAO.queryCountry(session, condition, orderBy, lockMode);
    }

    public boolean evict(Country country) throws PersistentException {
        return countryDAO.evict(country);
    }

    public Country getCountryByORMID(int ID) throws PersistentException {
        return countryDAO.getCountryByORMID(ID);
    }

    public Country getCountryByORMID(PersistentSession session, int ID) throws PersistentException {
        return countryDAO.getCountryByORMID(session, ID);
    }

    public Country[] listCountryByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return countryDAO.listCountryByQuery(session, condition, orderBy, lockMode);
    }

    public Country loadCountryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return countryDAO.loadCountryByQuery(session, condition, orderBy);
    }

    public Country loadCountryByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return countryDAO.loadCountryByORMID(session, ID, lockMode);
    }

    public boolean deleteAndDissociate(Country country) throws PersistentException {
        return countryDAO.deleteAndDissociate(country);
    }

    public Country[] listCountryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return countryDAO.listCountryByQuery(session, condition, orderBy);
    }

    public City loadCityByORMID(int ID) throws PersistentException {
        return cityDAO.loadCityByORMID(ID);
    }

    public City getCityByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return cityDAO.getCityByORMID(session, ID, lockMode);
    }

    public boolean deleteAndDissociate(City city, PersistentSession session) throws PersistentException {
        return cityDAO.deleteAndDissociate(city, session);
    }

    public City[] listCityByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return cityDAO.listCityByQuery(condition, orderBy, lockMode);
    }

    public boolean deleteAndDissociate(City city) throws PersistentException {
        return cityDAO.deleteAndDissociate(city);
    }

    public City loadCityByORMID(PersistentSession session, int ID) throws PersistentException {
        return cityDAO.loadCityByORMID(session, ID);
    }

    public City loadCityByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return cityDAO.loadCityByQuery(condition, orderBy, lockMode);
    }

    public City getCityByORMID(int ID, LockMode lockMode) throws PersistentException {
        return cityDAO.getCityByORMID(ID, lockMode);
    }

    public Iterator iterateCityByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return cityDAO.iterateCityByQuery(condition, orderBy, lockMode);
    }

    public boolean refresh(City city) throws PersistentException {
        return cityDAO.refresh(city);
    }

    public City getCityByORMID(int ID) throws PersistentException {
        return cityDAO.getCityByORMID(ID);
    }

    public List queryCity(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return cityDAO.queryCity(session, condition, orderBy, lockMode);
    }

    public boolean evict(City city) throws PersistentException {
        return cityDAO.evict(city);
    }

    public City createCity() {
        return cityDAO.createCity();
    }

    public City[] listCityByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return cityDAO.listCityByQuery(session, condition, orderBy, lockMode);
    }

    public City loadCityByQuery(String condition, String orderBy) throws PersistentException {
        return cityDAO.loadCityByQuery(condition, orderBy);
    }

    public List queryCity(String condition, String orderBy) throws PersistentException {
        return cityDAO.queryCity(condition, orderBy);
    }

    public List queryCity(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return cityDAO.queryCity(session, condition, orderBy);
    }

    public City[] listCityByCriteria(CityCriteria cityCriteria) {
        return cityDAO.listCityByCriteria(cityCriteria);
    }

    public City loadCityByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return cityDAO.loadCityByQuery(session, condition, orderBy, lockMode);
    }

    public Iterator iterateCityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return cityDAO.iterateCityByQuery(session, condition, orderBy);
    }

    public City loadCityByORMID(int ID, LockMode lockMode) throws PersistentException {
        return cityDAO.loadCityByORMID(ID, lockMode);
    }

    public City[] listCityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return cityDAO.listCityByQuery(session, condition, orderBy);
    }

    public City loadCityByCriteria(CityCriteria cityCriteria) {
        return cityDAO.loadCityByCriteria(cityCriteria);
    }

    public Iterator iterateCityByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return cityDAO.iterateCityByQuery(session, condition, orderBy, lockMode);
    }

    public City getCityByORMID(PersistentSession session, int ID) throws PersistentException {
        return cityDAO.getCityByORMID(session, ID);
    }

    public City[] listCityByQuery(String condition, String orderBy) throws PersistentException {
        return cityDAO.listCityByQuery(condition, orderBy);
    }

    public Iterator iterateCityByQuery(String condition, String orderBy) throws PersistentException {
        return cityDAO.iterateCityByQuery(condition, orderBy);
    }

    public boolean save(City city) throws PersistentException {
        return cityDAO.save(city);
    }

    public boolean delete(City city) throws PersistentException {
        return cityDAO.delete(city);
    }

    public City loadCityByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return cityDAO.loadCityByORMID(session, ID, lockMode);
    }

    public City loadCityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return cityDAO.loadCityByQuery(session, condition, orderBy);
    }

    public List queryCity(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return cityDAO.queryCity(condition, orderBy, lockMode);
    }

    public Weekday loadWeekdayByORMID(int ID) throws PersistentException {
        return weekdayDAO.loadWeekdayByORMID(ID);
    }

    public List queryWeekday(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return weekdayDAO.queryWeekday(condition, orderBy, lockMode);
    }

    public boolean evict(Weekday weekday) throws PersistentException {
        return weekdayDAO.evict(weekday);
    }

    public Weekday getWeekdayByORMID(int ID, LockMode lockMode) throws PersistentException {
        return weekdayDAO.getWeekdayByORMID(ID, lockMode);
    }

    public Weekday[] listWeekdayByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return weekdayDAO.listWeekdayByQuery(session, condition, orderBy);
    }

    public Weekday[] listWeekdayByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return weekdayDAO.listWeekdayByQuery(condition, orderBy, lockMode);
    }

    public Weekday loadWeekdayByORMID(int ID, LockMode lockMode) throws PersistentException {
        return weekdayDAO.loadWeekdayByORMID(ID, lockMode);
    }

    public Iterator iterateWeekdayByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return weekdayDAO.iterateWeekdayByQuery(session, condition, orderBy, lockMode);
    }

    public Weekday loadWeekdayByCriteria(WeekdayCriteria weekdayCriteria) {
        return weekdayDAO.loadWeekdayByCriteria(weekdayCriteria);
    }

    public Weekday[] listWeekdayByQuery(String condition, String orderBy) throws PersistentException {
        return weekdayDAO.listWeekdayByQuery(condition, orderBy);
    }

    public Weekday createWeekday() {
        return weekdayDAO.createWeekday();
    }

    public List queryWeekday(String condition, String orderBy) throws PersistentException {
        return weekdayDAO.queryWeekday(condition, orderBy);
    }

    public boolean save(Weekday weekday) throws PersistentException {
        return weekdayDAO.save(weekday);
    }

    public Weekday getWeekdayByORMID(int ID) throws PersistentException {
        return weekdayDAO.getWeekdayByORMID(ID);
    }

    public Iterator iterateWeekdayByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return weekdayDAO.iterateWeekdayByQuery(condition, orderBy, lockMode);
    }

    public Weekday loadWeekdayByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return weekdayDAO.loadWeekdayByORMID(session, ID, lockMode);
    }

    public Iterator iterateWeekdayByQuery(String condition, String orderBy) throws PersistentException {
        return weekdayDAO.iterateWeekdayByQuery(condition, orderBy);
    }

    public Weekday getWeekdayByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
        return weekdayDAO.getWeekdayByORMID(session, ID, lockMode);
    }

    public Weekday loadWeekdayByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return weekdayDAO.loadWeekdayByQuery(session, condition, orderBy, lockMode);
    }

    public Iterator iterateWeekdayByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return weekdayDAO.iterateWeekdayByQuery(session, condition, orderBy);
    }

    public Weekday[] listWeekdayByCriteria(WeekdayCriteria weekdayCriteria) {
        return weekdayDAO.listWeekdayByCriteria(weekdayCriteria);
    }

    public Weekday[] listWeekdayByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return weekdayDAO.listWeekdayByQuery(session, condition, orderBy, lockMode);
    }

    public Weekday getWeekdayByORMID(PersistentSession session, int ID) throws PersistentException {
        return weekdayDAO.getWeekdayByORMID(session, ID);
    }

    public List queryWeekday(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return weekdayDAO.queryWeekday(session, condition, orderBy);
    }

    public boolean delete(Weekday weekday) throws PersistentException {
        return weekdayDAO.delete(weekday);
    }

    public boolean refresh(Weekday weekday) throws PersistentException {
        return weekdayDAO.refresh(weekday);
    }

    public Weekday loadWeekdayByQuery(String condition, String orderBy) throws PersistentException {
        return weekdayDAO.loadWeekdayByQuery(condition, orderBy);
    }

    public List queryWeekday(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return weekdayDAO.queryWeekday(session, condition, orderBy, lockMode);
    }

    public Weekday loadWeekdayByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        return weekdayDAO.loadWeekdayByQuery(condition, orderBy, lockMode);
    }

    public Weekday loadWeekdayByORMID(PersistentSession session, int ID) throws PersistentException {
        return weekdayDAO.loadWeekdayByORMID(session, ID);
    }

    public Weekday loadWeekdayByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        return weekdayDAO.loadWeekdayByQuery(session, condition, orderBy);
    }

    public Facade(){
        this.drinkDAO = new DrinkDAOImpl();
        this.userDAO = new UserDAOImpl();
        this.addressDAO = new AddressDAOImpl();
        this.barDAO = new BarDAOImpl();
        this.consumerDAO = new ConsumerDAOImpl();
        this.drinkTypeDAO = new DrinkTypeDAOImpl();
        this.photoDAO = new PhotoDAOImpl();
        this.ingredientDAO = new IngredientDAOImpl();
        this.stepDAO = new StepDAOImpl();
        this.drinkIngredientDAO = new DrinkIngredientDAOImpl();
        this.countryDAO = new CountryDAOImpl();
        this.cityDAO = new CityDAOImpl();
        this.weekdayDAO = new WeekdayDAOImpl();
    }

}
