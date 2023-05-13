package etienne.clement.myconvertion.model;

/**
 * created by ETIENNE CLEMENT MBAYE on 12/6/20.
 */
public class Decibinaire {
    private int valeur;
    private String resultat;

    /***
     * Mise en place de mon constructeur
     * @param valeur
     */
    public Decibinaire(int valeur) {
        this.valeur = valeur;
        this.demarage();
    }
    public String getResultat() {
        return resultat;
    }
    /***
     *
     * @return
     * Ma methode demarage consiste a determiner le nombre de fois va etre diviser la valeur par
     * deux afin de pouvoir trier nos variables
     */
        private  String demarage() {
            //copie la valeur afin de pouvoir la passeé a la methode tri_indice sans perte de donneé
            int copie_valeur = this.valeur;
            int nbr_division =0;
            while(valeur >1) {
                int result_division = this.valeur /2;
                ++nbr_division;
                //Nouvelle valeur de valeur apres chaque division
                this.valeur = result_division;
            }
            /***
             *appelle de ma methode trie_indice qui prend la valeur et le nbr_division comme parametres
             */
            this.resultat = tri_indice(copie_valeur,nbr_division);
            return resultat;
        }

    /***
     *
     * @param valeur
     * @param nbr_division
     * @return
     * Cette methode calcule le modulo de chaque valeur de division qu'il stock dans les diferents variables
     */
        private String tri_indice(int valeur, int nbr_division) {
            /*Mise en place de nos variables pour stocker nos differents resultat issus a chaque indice aleatoire
            * de type String*/
            int indice_aleatoire = 1; String indice_un = "_";  String indice_deux = "_";  String indice_trois = "_";
            String indice_quatre = "_";  String indice_cinque ="_";  String indice_sixe = "_";  String indice_sept = "_";
            String indice_huit = "_";  String indice_neuf = "_";String indice_dix = "_";
            String indice_11 = "_";  String indice_12 = "_";  String indice_13 = "_";  String indice_14 = "_";
            String indice_15 = "_";  String indice_16 = "_";  String indice_17 = "_";
            String indice_18 = "_";  String indice_19 = "_";  String indice_20 = "_";  String indice_21 = "_";
            String indice_22 = "_";  String indice_23 = "_";  String indice_24 = "_";
            String indice_25 = "_";  String indice_26 = "_";  String indice_27= "_";  String indice_28 = "_";
            String indice_29 = "_";  String indice_30 = "_";  String indice_31 = "_";
            String indice_32 = "_";  String indice_33 = "_";  String indice_34 = "_"; String indice_35 = "_";
            String indice_36 = "_";  String indice_37 = "_";  String indice_38 = "_";
            String indice_39 = "_";  String indice_40 = "_";

            while(valeur >1 &&  indice_aleatoire<=nbr_division) {
                int result_division = valeur /2;
                int modulo_valeur = valeur %2;
                if(indice_aleatoire==1) {
                    indice_un = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==2) {
                    indice_deux = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==3) {
                    indice_trois = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==4) {
                    indice_quatre = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==5) {
                    indice_cinque = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==6) {
                    indice_sixe = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==7) {
                    indice_sept = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==8) {
                    indice_huit = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==9) {
                    indice_neuf = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==10) {
                    indice_dix = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==11) {
                    indice_11 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==12) {
                    indice_12 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==13) {
                    indice_13 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==14) {
                    indice_14 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==15) {
                    indice_15 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==16) {
                    indice_16 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==17) {
                    indice_17 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==18) {
                    indice_18 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==19) {
                    indice_19 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==20) {
                    indice_20 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==21) {
                    indice_21 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==22) {
                    indice_22= result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==23) {
                    indice_23 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==24) {
                    indice_24 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==25) {
                    indice_25 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==26) {
                    indice_26 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==27) {
                    indice_27 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==28) {
                    indice_28 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==29) {
                    indice_29 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==30) {
                    indice_30 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==31) {
                    indice_31 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==32) {
                    indice_32 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==33) {
                    indice_33 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==34) {
                    indice_34 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==35) {
                    indice_35 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==36) {
                    indice_36 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==37) {
                    indice_37 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==38) {
                    indice_38 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==39) {
                    indice_39 = result_modulo_valeur(modulo_valeur);
                }
                if(indice_aleatoire==40) {
                    indice_40 = result_modulo_valeur(modulo_valeur);
                }
                //Nouvelle valeur de valeur a pres chaque tour par rapport a l'indice aleatoir
                valeur = result_division;
                indice_aleatoire++;
                //condition du return result car indice_aleatoir ne doit pas depasser nbr_division
                if(indice_aleatoire > nbr_division) {
                    String result;
                    /**en premier mettre 1 au debut car si valeur est egal a 1 elle ne poura pas rentrez
                     * dans la boucle or il fait parti du resultat raison pour la quelle je l'est ajouter
                     * car il y'auta toujour 1
                     * et enfi le renversement du resultat apres le calcul le resultat doit etre presenté d'une
                     * maniere renverser car on a utiliser la methode de la division
                     */

                    result =  "1"+""+indice_40+""+indice_39+""+indice_38+""+indice_37+""+indice_36+""+indice_35+""+
                            indice_34+""+indice_33+""+indice_32+""+indice_31+""+indice_30+""+indice_29+""+indice_28+""+
                            indice_27+""+indice_26+""+indice_25+""+indice_24+""+indice_23+""+indice_22+""+indice_21+""+
                            indice_20+""+indice_19+""+indice_18+""+indice_17+""+indice_16+""+indice_15+""+indice_14+""+
                            indice_13+""+indice_12+""+indice_11+""+indice_dix+""+indice_neuf+""+indice_huit+""+indice_sept+""+
                            indice_sixe+""+indice_cinque+""+indice_quatre+""+indice_trois+""+indice_deux+""+indice_un;
                    //effacement de des tirets "_" pour bien presenter le resultat
                    String result_no_space= result.replace("_", "");
                    return result_no_space;
                }
            }
            return null;
        }

    /***
     *
     * @param modulo_valeur
     * @return les deux types de resultat possible le un ou le zero
     */
    private String result_modulo_valeur(int modulo_valeur) {
            if(modulo_valeur==0) {
                return "0";
            }

            if(modulo_valeur==1) {
                return "1";
            }
            else {
                return "050505";
            }
        }
    }


