package fr.magazin;

import java.util.ArrayList;
import java.util.List;

public final class Detail {
    public List <Ligne> ligne = new ArrayList<>();

    public static class Ligne{
        private int numero;
        private int quantite;
        Produit produit = new Produit<>();

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) {
            this.quantite = quantite;
        }

        public double getPrixTotal(){
            return produit.getPrix() * quantite;
        }


    }

}
