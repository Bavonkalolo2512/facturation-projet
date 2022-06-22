package fr.magazin;
import java.util.*;
public class Produit <T> {
    private String code;
    private String designation ;
    private double prix;
    private T Unitemesure;
    private Date dateExpiration;

    public Produit() {
        this.code = "";
        this.designation = "";
        this.prix = 0.0;
        Unitemesure = null;
        this.dateExpiration = null;
    }
    public Produit(String code, String designation, double prix, T unitemesure, Date dateExpiration) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        Unitemesure = unitemesure;
        this.dateExpiration = dateExpiration;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public T getUnitemesure() {
        return Unitemesure;
    }

    public void setUnitemesure(T unitemesure) {
        Unitemesure = unitemesure;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
}
