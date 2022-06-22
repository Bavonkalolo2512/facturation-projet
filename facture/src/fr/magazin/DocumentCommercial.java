package fr.magazin;

public abstract class  DocumentCommercial {

    // ---- attributs ----
    private Long numero;
    private Client client;
    Detail.Ligne detail = new Detail.Ligne();


    // ---- methodes ----
    public double getTotal(){

        return  detail.getPrixTotal();
    }

    public  double getTVA(){
        return 0.16;
    }

    // ---- getters ----
    public Long getNumero() {
        return numero;
    }

    public Client getClient() {
        return client;
    }


    // ----- setter ----
    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
