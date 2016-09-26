/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

import Exception.FormatMailException;
import Exception.FormatPhoneException;
import Exception.FormatSiretException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Monji
 */
public class Prospect {
    private int cp,tel,numRue,cedex;
    private String enseigne, rue,ville,pays,mail,compAdd,voie, derniereVisite;
    private long siret;

    public Prospect() {
    }

    public Prospect( int cp, int tel, long siret, int numRue, int cedex, String enseigne, String rue, String ville, String pays, String mail, String compAdd, String voie, String derniereVisite) throws FormatMailException, FormatPhoneException, FormatSiretException {
        if(!isEmailAdress(mail) ){
            throw new FormatMailException();
        }else if(!isPhone(String.valueOf(tel)))//convertion int en string
        {
            throw new FormatSiretException();
        }else if(!isSiret(String.valueOf(siret)))//convertion int en string
        {
            throw new FormatSiretException();
        }
        else{
        this.cp = cp;
        this.tel = tel;
        this.siret = siret;
        this.numRue = numRue;
        this.cedex = cedex;
        this.enseigne = enseigne;
        this.rue = rue;
        this.ville = ville;
        this.pays = pays;
        this.mail = mail;
        this.compAdd = compAdd;
        this.voie = voie;
        this.derniereVisite = derniereVisite;
        }
    }

    public long getSiret() {
        return siret;
    }

    public void setSiret(long siret) {
        this.siret = siret;
    }

    public String getDerniereVisite() {
        return derniereVisite;
    }

    public void setDerniereVisite(String derniereVisite) {
        this.derniereVisite = derniereVisite;
    }

    
    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getNumRue() {
        return numRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    public int getCedex() {
        return cedex;
    }

    public void setCedex(int cedex) {
        this.cedex = cedex;
    }

    public String getEnseigne() {
        return enseigne;
    }

    public void setEnseigne(String enseigne) {
        this.enseigne = enseigne;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCompAdd() {
        return compAdd;
    }

    public void setCompAdd(String compAdd) {
        this.compAdd = compAdd;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }
    
    private boolean isEmailAdress(String mail){
        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$");
        Matcher m = p.matcher(mail.toUpperCase());
        return m.matches();
    }
    
    private boolean isPhone(String tel){
        Pattern pattern = Pattern.compile("[0-9]{10}");
        Matcher matcher = pattern.matcher(tel); 
        return matcher.matches();
    }
    
    private boolean isSiret(String siret){
        Pattern pattern1 = Pattern.compile("[0-9]{14}");
        Matcher matcher1 = pattern1.matcher(siret); 
        return matcher1.matches();
    }
    
}
