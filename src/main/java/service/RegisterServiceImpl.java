package service;

import org.orm.PersistentException;
import org.springframework.stereotype.Service;
import socialdrink.Bar;
import socialdrink.Consumer;
import socialdrink.Facade;
import socialdrink.User;

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
            //TODO: String cidade to address
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

    public void addBar() {

    }
}
