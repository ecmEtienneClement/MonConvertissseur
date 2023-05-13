package etienne.clement.myconvertion.model;

/**
 * created by ETIENNE CLEMENT MBAYE on 12/5/20.
 */
public class Binaire {

    private int resultat;
    private String valeur;

    /***
     * Mise en place de mon constructeur
     * @param valeur
     */
    public Binaire(String valeur) {
        this.valeur = valeur;
        this.verification_de_valeur();
    }
    public int getResultat() {
        return resultat;
    }

        /*verification de valeur verifier la validite de la valeur sans spacements interne et externe
         *et convertions de la valeur en Upercase (if*=true) passe valeur a la methode trie d'indice de la valeur*/
        private int verification_de_valeur() {

            String valeur_no_space = this.valeur.trim();
            if(valeur_no_space.contains(" ")==true) {
                System.out.println("Veillez effacer les espaces entre les caractères");
                return 0;

            }else {
                return trie_indice_de_valeur(this.valeur);
            }
        }
        private int trie_indice_de_valeur(String valeur) {
            int longueur_valeur = valeur.length();
            //declaration et intialisation de mes variables pour l'estokage de mes resultats pour chaque indice
            int indice_aleatoire = 0; int indice_zero = 0; int indice_un = 0; int indice_deux = 0; int indice_trois = 0;
            int indice_quatre = 0; int indice_cinque = 0; int indice_sixe = 0; int indice_sept = 0;
            int indice_huit = 0; int indice_neuf = 0; int indice_dix = 0;
            int indice_11 = 0; int indice_12 = 0; int indice_13 = 0; int indice_14 = 0;
            int indice_15 = 0; int indice_16 = 0; int indice_17 = 0;
            int indice_18 = 0; int indice_19 = 0; int indice_20 = 0; int indice_21 = 0;
            int indice_22 = 0; int indice_23 = 0; int indice_24 = 0;
            int indice_25 = 0; int indice_26 = 0; int indice_27= 0; int indice_28 = 0;
            int indice_29 = 0; int indice_30 = 0; int indice_31 = 0;
            int indice_32 = 0; int indice_33 = 0; int indice_34 = 0; int indice_35 = 0;
            int indice_36 = 0; int indice_37 = 0; int indice_38 = 0;
            int indice_39 = 0; int indice_40 = 0;

            //parcour de mes differente indice de mon valeur et appelle ma methode calcule indice
            while(indice_aleatoire <longueur_valeur) {
                char caractere =valeur.charAt(indice_aleatoire);
                if(indice_aleatoire==0) {
                    indice_zero=calcule_indice (caractere, longueur_valeur,1);
                }
                if(indice_aleatoire==1 ) {
                    indice_un=calcule_indice (caractere, longueur_valeur,2);
                }
                if(indice_aleatoire==2 ) {
                    indice_deux=calcule_indice (caractere, longueur_valeur,3);
                }
                if(indice_aleatoire==3 ) {
                    indice_trois=calcule_indice (caractere, longueur_valeur,4);
                }
                if(indice_aleatoire==4 ) {
                    indice_quatre=calcule_indice (caractere, longueur_valeur,5);
                }
                if(indice_aleatoire==5 ) {
                    indice_cinque=calcule_indice (caractere, longueur_valeur,6);
                }
                if(indice_aleatoire==6 ) {
                    indice_sixe=calcule_indice (caractere, longueur_valeur,7);
                }
                if(indice_aleatoire==7 ) {
                    indice_sept=calcule_indice (caractere, longueur_valeur,8);
                }
                if(indice_aleatoire==8 ) {
                    indice_huit=calcule_indice (caractere, longueur_valeur,9);
                }
                if(indice_aleatoire==9 ) {
                    indice_neuf=calcule_indice (caractere, longueur_valeur,10);
                }
                if(indice_aleatoire==10 ) {
                    indice_dix=calcule_indice (caractere, longueur_valeur,11);
                }
                if(indice_aleatoire==11 ) {
                    indice_11=calcule_indice (caractere, longueur_valeur,12);
                }
                if(indice_aleatoire==12) {
                    indice_12=calcule_indice (caractere, longueur_valeur,13);
                }
                if(indice_aleatoire==13 ) {
                    indice_13=calcule_indice (caractere, longueur_valeur,14);
                }
                if(indice_aleatoire==14 ) {
                    indice_14=calcule_indice (caractere, longueur_valeur,15);
                }
                if(indice_aleatoire==15 ) {
                    indice_15=calcule_indice (caractere, longueur_valeur,16);
                }
                if(indice_aleatoire==16 ) {
                    indice_16=calcule_indice (caractere, longueur_valeur,17);
                }
                if(indice_aleatoire==17 ) {
                    indice_17=calcule_indice (caractere, longueur_valeur,18);
                }
                if(indice_aleatoire==18 ) {
                    indice_18=calcule_indice (caractere, longueur_valeur,19);
                }
                if(indice_aleatoire==19 ) {
                    indice_19=calcule_indice (caractere, longueur_valeur,20);
                }
                if(indice_aleatoire==20) {
                    indice_20=calcule_indice (caractere, longueur_valeur,21);
                }
                if(indice_aleatoire==21 ) {
                    indice_21=calcule_indice (caractere, longueur_valeur,22);
                }
                if(indice_aleatoire==22 ) {
                    indice_22=calcule_indice (caractere, longueur_valeur,23);
                }
                if(indice_aleatoire==23 ) {
                    indice_23=calcule_indice (caractere, longueur_valeur,24);
                }
                if(indice_aleatoire==24 ) {
                    indice_24=calcule_indice (caractere, longueur_valeur,25);
                }
                if(indice_aleatoire==25 ) {
                    indice_25=calcule_indice (caractere, longueur_valeur,26);
                }
                if(indice_aleatoire==26 ) {
                    indice_26=calcule_indice (caractere, longueur_valeur,27);
                }
                if(indice_aleatoire==27 ) {
                    indice_27=calcule_indice (caractere, longueur_valeur,28);
                }
                if(indice_aleatoire==28 ) {
                    indice_28=calcule_indice (caractere, longueur_valeur,29);
                }
                if(indice_aleatoire==29 ) {
                    indice_29=calcule_indice (caractere, longueur_valeur,30);
                }
                if(indice_aleatoire==30 ) {
                    indice_30=calcule_indice (caractere, longueur_valeur,31);
                }
                if(indice_aleatoire==31 ) {
                    indice_31=calcule_indice (caractere, longueur_valeur,32);
                }
                if(indice_aleatoire==32) {
                    indice_32=calcule_indice (caractere, longueur_valeur,33);
                }
                if(indice_aleatoire==33 ) {
                    indice_33=calcule_indice (caractere, longueur_valeur,34);
                }
                if(indice_aleatoire==34 ) {
                    indice_34=calcule_indice (caractere, longueur_valeur,35);
                }
                if(indice_aleatoire==35 ) {
                    indice_35=calcule_indice (caractere, longueur_valeur,36);
                }
                if(indice_aleatoire==36 ) {
                    indice_36=calcule_indice (caractere, longueur_valeur,37);
                }
                if(indice_aleatoire==37 ) {
                    indice_37=calcule_indice (caractere, longueur_valeur,38);
                }
                if(indice_aleatoire==38 ) {
                    indice_38=calcule_indice (caractere, longueur_valeur,39);
                }
                if(indice_aleatoire==39 ) {
                    indice_39=calcule_indice (caractere, longueur_valeur,40);
                }
                if(indice_aleatoire==40) {
                    indice_40=calcule_indice (caractere, longueur_valeur,41);
                }


                if(indice_aleatoire == longueur_valeur-1) {
                    this.resultat =verification_second(indice_zero,indice_un,indice_deux,indice_trois,
                            indice_quatre,indice_cinque,indice_sixe ,indice_sept,indice_huit,indice_neuf,indice_dix ,indice_11,
                            indice_12,indice_13,indice_14 ,indice_15,indice_16,indice_17,indice_18 ,indice_19,
                            indice_20,indice_21,indice_22 ,indice_23,indice_24,indice_25,indice_26 ,indice_27,
                            indice_28,indice_29,indice_30 ,indice_31,indice_32,indice_33,indice_34 ,indice_35,
                            indice_36,indice_37,indice_38,indice_39,indice_40);
                    return resultat;
                }
                ++indice_aleatoire;
            }
            return 0000;

        }

        /*calcule l'indice en fonction du carectere et de la 1 par raport a la position
         * indice_aleatoire
         */
        private int calcule_indice (char caractere,int longueur_valeur,int puissance) {
            switch (caractere) {
                case '0':{
                    int result =(int) Math.pow(2,longueur_valeur-puissance);
                    int second = (result*0);
                    return second;
                }
                case'1': {
                    int result =(int) Math.pow(2,(longueur_valeur-puissance));
                    int second = (result*1);
                    return second;
                }

                default :{
                    return 01010;
                }
            }

        }

        /*cette methode fait la verification des different valeur de second retourné par les differents indices
         * annulle la sommation si l'une des valeurs de retour est egale à 01010;
         * cas contraire si les valeurs sont normale il appelle la methode sommation et lui passe les differentes
         * valeur de second pour le resultat final
         */
        private int verification_second(int indice_zero,int indice_un,int indice_deux,int indice_trois,
                                              int indice_quatre,int indice_cinque,int indice_sixe,int indice_sept,
                                              int indice_huit,int indice_neuf,int indice_dix,int indice_11,
                                              int indice_12, int indice_13,int indice_14, int indice_15,int indice_16,int indice_17,int indice_18,
                                              int indice_19,int indice_20,int indice_21,int indice_22,int indice_23,int indice_24,int indice_25,
                                              int indice_26,int indice_27,int indice_28,int indice_29,int indice_30,
                                              int indice_31,int indice_32,int indice_33,int indice_34,int indice_35,int indice_36,int
                                                      indice_37,int indice_38, int indice_39,int indice_40) {
            if(indice_zero == 01010 || indice_un==01010 || indice_deux ==01010 || indice_trois==01010 ||
                    indice_quatre == 01010 || indice_cinque == 01010 || indice_sixe == 01010 || indice_sept == 01010||
                    indice_huit == 01010 || indice_neuf == 01010 || indice_dix == 01010 || indice_11 == 01010||
                    indice_12 == 01010 || indice_13 == 01010 || indice_14 == 01010 || indice_15 == 01010||
                    indice_16 == 01010 || indice_17 == 01010 || indice_18 == 01010 || indice_19 == 01010||
                    indice_20 == 01010 || indice_21 == 01010 || indice_22 == 01010 || indice_23 == 01010||
                    indice_24 == 01010 || indice_25 == 01010 || indice_26 == 01010 || indice_27 == 01010||
                    indice_28 == 01010 || indice_30 == 01010 || indice_31 == 01010 || indice_32 == 01010||
                    indice_33 == 01010 || indice_34 == 01010 || indice_35 == 01010 || indice_36 == 01010||
                    indice_37 == 01010 || indice_38 == 01010 || indice_39 == 01010 || indice_40 == 01010) {
                System.out.println("Veillez vérifier vos caractères saisis");
                return 33333;
            }
            else {
                return sommation_second( indice_zero,indice_un, indice_deux,indice_trois,
                        indice_quatre,indice_cinque, indice_sixe, indice_sept,
                        indice_huit, indice_neuf,indice_dix,indice_11,
                        indice_12,indice_13,indice_14,  indice_15, indice_16,indice_17,indice_18,
                        indice_19,indice_20,indice_21, indice_22, indice_23,indice_24, indice_25,
                        indice_26, indice_27, indice_28, indice_29,indice_30,
                        indice_31,indice_32,indice_33,indice_34, indice_35, indice_36,
                        indice_37, indice_38,  indice_39, indice_40);
            }
        }


        //cette methode fait la sommation de tout mes valeurs second retourné par les differents indice...
        private int sommation_second(int indice_zero,int indice_un,int indice_deux,int indice_trois,
                                           int indice_quatre,int indice_cinque,int indice_sixe,int indice_sept,
                                           int indice_huit,int indice_neuf,int indice_dix,int indice_11,
                                           int indice_12, int indice_13,int indice_14, int indice_15,int indice_16,int indice_17,int indice_18,
                                           int indice_19,int indice_20,int indice_21,int indice_22,int indice_23,int indice_24,int indice_25,
                                           int indice_26,int indice_27,int indice_28,int indice_29,int indice_30,
                                           int indice_31,int indice_32,int indice_33,int indice_34,int indice_35,int indice_36,int
                                                   indice_37,int indice_38, int indice_39,int indice_40)
        {

            int second_final =indice_zero+indice_un+indice_deux+indice_trois+
                    indice_quatre+indice_cinque+indice_sixe +indice_sept+indice_huit+indice_neuf+indice_dix+
                    indice_11+indice_12+indice_13+indice_14 +indice_15+indice_16+indice_17+indice_18 +indice_19+
                    indice_20+indice_21+indice_22+indice_23+indice_24+indice_25+indice_26+indice_27+
                    indice_28+indice_29+indice_30+indice_31+indice_32+indice_33+indice_34+indice_35+
                    indice_36+indice_37+indice_38+indice_39+indice_40;
            if(second_final >268435455) {
                System.out.println("Désoler vous avez dépaser la valeur max !");
                return 22222;
            }
            else if(second_final < 0) {
                System.out.println("Désoler vous pas dépaser la valeur max !");
                return 22222;
            }
            else {
                return  second_final;
            }
        }

    }









