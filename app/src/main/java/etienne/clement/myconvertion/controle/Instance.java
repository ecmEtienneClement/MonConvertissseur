package etienne.clement.myconvertion.controle;

import etienne.clement.myconvertion.model.Binaire;
import etienne.clement.myconvertion.model.Decibinaire;
import etienne.clement.myconvertion.model.Decimal;
import etienne.clement.myconvertion.model.Hexadecimal;

/**
 * created by ETIENNE CLEMENT MBAYE on 12/1/20.
 */
public final class Instance {
    Decimal mDecimal;
    Hexadecimal mHexadecimal;
    Binaire mBinaire;
    Decibinaire mDecibinaire;
   private static Instance mInstance = null;

    /**
     * constructeur sans parametre qui est declare en privé
     */
    private Instance() {
        super();
    }
    //mise en place de mon pater singleton pour n'avoir qu'une seule seule et unique instance

    /**
     *
     * @return l'intance qui sera unique
     */
    public static final Instance getInstance(){
        if(Instance.mInstance == null){
            Instance.mInstance = new Instance();
        }
        return Instance.mInstance;
    }

    //mise en place de mon instance de Decimal pour creer un profil de type Decimal

    /**
     * creation de mon profil decimal
     * @param valeur
     */
    public void profil_decimal(int valeur){
        this.mDecimal = new Decimal(valeur);
    }
    //mise en place de mon guetteur pour la recuperation de mon resultat du creer profil Decimal

    /**
     *
     * @return le resultat du profil decimal
     */
    public String getResultatDecimal(){
        return mDecimal.getResultat();
    }

    //mise en place de mon instance de Hexadecimal pour creer un profil de type Hexadecimal

    /**
     * creation de mon profil hexadecimal
     * @param valeur
     */
    public void profil_hexadecimal(String valeur){
        this.mHexadecimal = new Hexadecimal(valeur);
    }

    /**
     *
     * @return le resultat du profil hexadecimal
     */
    //mise en place de mon guetteur pour la recuperation de mon resultat de creer profil hexadecimal
    public int getResulatHexadecimal(){
        return mHexadecimal.getResultat();
    }

    /***
     * Creation de mon profil Binaire
     * @param valeur
     */
    public void profil_binaire(String valeur){
        this.mBinaire = new Binaire(valeur);
    }

    /***
     *
     * @return le resultat de mon profil Binaire
     */
    public int getResultatBinaire(){
        return mBinaire.getResultat();
    }

    /***
     * Creation de mon profil decibinaire
     * @param valeur
     */
    public void profil_decibinaire(int valeur){
        this.mDecibinaire = new Decibinaire(valeur);
    }

    /***
     *
     * @return le resultat de mon profil decibinaire
     */
    public String getResultatDecibinaire(){
        return mDecibinaire.getResultat();
    }
}
