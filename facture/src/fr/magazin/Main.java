package fr.magazin;


public class Main {
    /* TSHIMUANGA KALOLO BAVON
       TAMUNDELE KASUSULA DANIEL
       YUMBA NKULU JONATHAN
       UZAN MUYUMBA BEN
       THEO BALICK THEOPHILE
       KAMENA KATONDO PAUL

     */

    public static void main(String[] args) {
        Client client_1 = new Client();

        client_1.setNom("terminator");
        client_1.setAdresse(new Personne.Adresse("wesley","193","malabo","kaniama",
                "lubumbashi","Lubumbashi","gabon"));

        Facture client_1fact = new Facture();
        BonDeCommande client_1factbon = new BonDeCommande();
        Devis client_1factdevis = new Devis();

    }
}
