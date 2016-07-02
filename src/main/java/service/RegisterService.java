package service;

import org.springframework.web.multipart.MultipartFile;
import socialdrink.Bar;
import socialdrink.Consumer;
import socialdrink.User;

import java.util.Date;

/**
 * Created by jpp on 22/06/16.
 */
public interface RegisterService {

    public void addConsumer(Consumer consumer);
    public void addConsumer(String email, String password, MultipartFile photoFile, String primeironome, String ultimonome, String profissao,
                            String cidade, String genero, Date dataNasc, String contacto, String descriçao);

    public void addBar(Bar bar);
    public void addBar(String email, String password, MultipartFile photoFile, String nome, String morada, String codpostal, String cidade, String contacto,
                       String descricao, String check1, String open1, String close1, String check2, String open2,
                       String close2, String check3, String open3, String close3, String check4, String open4,
                       String close4, String check5, String open5, String close5, String check6, String open6,
                       String close6, String check7, String open7, String close7);
}
