package service;

import socialdrink.Bar;
import socialdrink.Consumer;
import socialdrink.User;

import java.util.Date;

/**
 * Created by jpp on 22/06/16.
 */
public interface RegisterService {

    public void addConsumer(Consumer consumer);
    public void addConsumer(String email, String password, String primeironome, String ultimonome, String profissao, String cidade, String genero, Date dataNasc, String contacto, String descriçao);

    public void addBar(Bar bar);
    public void addBar(String email, String password, String nome, String morada, String cidade, String contacto, String descricao);
}
