package service;

import org.orm.PersistentException;
import org.springframework.stereotype.Service;
import socialdrink.*;

import java.util.Date;

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

    public void addConsumer(String email, String password, String primeironome, String ultimonome, String profissao, String cidade, String genero, Date dataNasc, String contacto, String descriçao) {
        try {
            Consumer consumer = facade.createConsumer();
            consumer.setEmail(email);
            consumer.setPassword(password);
            consumer.setFirstname(primeironome);
            consumer.setLastname(ultimonome);
            consumer.setProfession(profissao);

            City city = new City();
            city.setName(cidade);

            Address address = new Address();
            address.setCity(city);

            consumer.setAddress(address);
            consumer.setSex(genero);
            consumer.setBirthday(dataNasc);
            //TODO: Contacto???
            consumer.setDescription(descriçao);

            facade.save(consumer);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public void addBar(Bar bar) {

    }

    public void addBar(String email, String password, String nome, String morada, String cidade, String contacto, String descricao) {
        try {
            Bar bar = facade.createBar();
            bar.setEmail(email);
            bar.setPassword(password);
            bar.setName(nome);

            City city = new City();
            city.setName(cidade);

            Address address = new Address();
            address.setStreet(morada);
            address.setCity(city);

            bar.setAddress(address);
            //TODO: Set contact
            bar.setDescription(descricao);

            facade.save(bar);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

}
