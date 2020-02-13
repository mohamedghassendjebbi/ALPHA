/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author mahdi
 */
public class localisation {
    private String idLocation,adresseDebut,addresseFin,CIN_tn;
    private Date date ;

    public localisation(String idLocation, String adresseDebut, String addresseFin, Date date,String CIN_tn ) {
        this.idLocation = idLocation;
        this.adresseDebut = adresseDebut;
        this.addresseFin = addresseFin;
        this.date = date;
        this.CIN_tn=CIN_tn;
    }

    public localisation() {
    }

    public String getIdLocation() {
        return idLocation;
    }

    public String getAdresseDebut() {
        return adresseDebut;
    }

    public String getAddresseFin() {
        return addresseFin;
    }

    public Date getDate() {
        return date;
    }

    public void setIdLocation(String idLocation) {
        this.idLocation = idLocation;
    }

    public void setAdresseDebut(String adresseDebut) {
        this.adresseDebut = adresseDebut;
    }

    public void setAddresseFin(String addresseFin) {
        this.addresseFin = addresseFin;
    }

    public String getCIN_tn() {
        return CIN_tn;
    }

    public void setCIN_tn(String CIN_tn) {
        this.CIN_tn = CIN_tn;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "localisation{" + "idLocation=" + idLocation + ", adresseDebut=" + adresseDebut + ", addresseFin=" + addresseFin + ", CIN_tn=" + CIN_tn + ", date=" + date + '}';
    }

 
    
    
}
