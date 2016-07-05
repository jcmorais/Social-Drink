package service;

import org.orm.PersistentException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import socialdrink.*;
import socialdrink.dao.PhotoDAO;
import socialdrink.impl.PhotoDAOImpl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;

/**
 * Created by jpp on 22/06/16.
 */
@Service("registerService")
public class RegisterServiceImpl implements RegisterService {
    private Facade facade;

    public RegisterServiceImpl() {
        this.facade = new Facade();
    }

    public void addConsumer(Consumer consumer) {

    }

    public void addConsumer(String email, String password, MultipartFile photoFile, String primeironome, String ultimonome, String profissao,
                            String cidade, String genero, Date dataNasc, String contacto, String descriçao) {
        try {
            Consumer consumer = facade.createConsumer();
            consumer.setEmail(email);
            consumer.setPassword(password);
            consumer.setFirstname(primeironome);
            consumer.setLastname(ultimonome);
            consumer.setProfession(profissao);

            Country country = facade.createCountry();
            country.setName("Portugal");
            facade.save(country);

            City city = new City();
            city.setName(cidade);
            city.setCountry(country);
            facade.save(city);

            consumer.setCity(city);
            consumer.setSex(genero);
            consumer.setBirthday(dataNasc);
            consumer.setContact(contacto);
            consumer.setDescription(descriçao);

            Photo photo = this.facade.createPhoto();
            photo.setFilePath("/images/user/default.png");
            photo.setName("");

            if(photo != null) consumer.setPhoto(photo);

            facade.save(consumer);
            setUserPhoto(consumer.getID(), consumer, photoFile);
            facade.save(consumer);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public void addBar(Bar bar) {

    }

    public void addBar(String email, String password, MultipartFile photoFile, String nome, String morada, String codpostal, String cidade, String contacto,
                       String descricao, String check1, String open1, String close1, String check2, String open2,
                       String close2, String check3, String open3, String close3, String check4, String open4,
                       String close4, String check5, String open5, String close5, String check6, String open6,
                       String close6, String check7, String open7, String close7) {
        try {
            Bar bar = facade.createBar();
            bar.setEmail(email);
            bar.setPassword(password);
            bar.setName(nome);

            Country country = facade.createCountry();
            country.setName("Portugal");
            facade.save(country);

            City city = facade.createCity();
            city.setName(cidade);
            city.setCountry(country);
            facade.save(city);

            Address address = facade.createAddress();
            address.setStreet(morada);
            address.setCity(city);
            address.setPostalCode(codpostal);
            facade.save(address);

            bar.setAddress(address);
            bar.setContact(contacto);
            bar.setDescription(descricao);

            Photo photo = this.facade.createPhoto();
            photo.setFilePath("/images/user/default.png");
            photo.setName("");
            bar.setPhoto(photo);

            if(check1.equals("1,0")) {
                Weekday monday = facade.createWeekday();
                monday.setDay(1);
                monday.setNameDay("Segunda-Feira");
                monday.setOpening(open1);
                monday.setClosure(close1);
                bar.horary.add(monday);
            }

            if(check2.equals("1,0")) {
                Weekday tuesday = facade.createWeekday();
                tuesday.setDay(2);
                tuesday.setNameDay("Terça-Feira");
                tuesday.setOpening(open2);
                tuesday.setClosure(close2);
                bar.horary.add(tuesday);
            }

            if(check3.equals("1,0")) {
                Weekday wednesday = facade.createWeekday();
                wednesday.setDay(3);
                wednesday.setNameDay("Quarta-Feira");
                wednesday.setOpening(open3);
                wednesday.setClosure(close3);
                bar.horary.add(wednesday);
            }

            if(check4.equals("1,0")) {
                Weekday thursday = facade.createWeekday();
                thursday.setDay(4);
                thursday.setNameDay("Quinta-Feira");
                thursday.setOpening(open4);
                thursday.setClosure(close4);
                bar.horary.add(thursday);
            }

            if(check5.equals("1,0")) {
                Weekday friday = facade.createWeekday();
                friday.setDay(5);
                friday.setNameDay("Sexta-Feira");
                friday.setOpening(open5);
                friday.setClosure(close5);
                bar.horary.add(friday);
            }

            if(check6.equals("1,0")) {
                Weekday saturday = facade.createWeekday();
                saturday.setDay(6);
                saturday.setNameDay("Sábado");
                saturday.setOpening(open6);
                saturday.setClosure(close6);
                bar.horary.add(saturday);
            }

            if(check7.equals("1,0")) {
                Weekday sunday = facade.createWeekday();
                sunday.setDay(7);
                sunday.setNameDay("Domingo");
                sunday.setOpening(open7);
                sunday.setClosure(close7);
                bar.horary.add(sunday);
            }

            facade.save(bar);
            setUserPhoto(bar.getID(), bar, photoFile);
            facade.save(bar);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public void setUserPhoto(int userId, User user, MultipartFile photoFile) {
        if (!photoFile.isEmpty()) {
            try {
                byte[] bytes = photoFile.getBytes();
                String photoName = photoFile.getOriginalFilename();

                // Creating the directory to store file
                File dir = new File(System.getProperty("jboss.server.data.dir") + "/images/user/" + userId);

                if (!dir.exists())
                    dir.mkdirs();

                // Create the file on server
                String[] aux = photoFile.getOriginalFilename().split("\\.");
                File serverFile = new File(dir.getAbsolutePath()
                        + File.separator + "profile." + aux[aux.length - 1]);
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();


                //save de path on the DB
                Photo photo = user.getPhoto();
                photo.setFilePath("/images/user/" + userId + "/profile." + aux[aux.length - 1]);
                photo.setName("profile." + aux[aux.length - 1]);
                user.setPhoto(photo);

            } catch (Exception e) {
            }
        }
    }
}
