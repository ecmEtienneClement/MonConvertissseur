package etienne.clement.myconvertion.model;

/**
 * created by ETIENNE CLEMENT MBAYE on 11/28/20.
 */
public class Decimal {
 //declaration de ma variable valeur qui sera saisi par l'utilisateur
    private int myvaleur;
    private String resultat;
    //mise en place de mon constructeur
    public Decimal(int myvaleur) {
        this.myvaleur = myvaleur;
        this.traite_intervale();
    }

    public String getResultat() {
        return resultat;
    }

    /*Ma mthode de degre zero qui retourn la valeur finale la plus basse intervale l'intervale
    inferieure à 16 et superieure à 0....
    */
        private   String degre_zero(int valeur) {
                  if(valeur>=0 && valeur <16) {
                switch (valeur) {
                    case 10 :
                        return ("A");
                    case 11 :
                        return ("B");
                    case 12 :
                        return ("C");
                    case 13 :
                        return ("D");
                    case 14 :
                        return ("E");
                    case 15 :
                        return ("F");
                    default :
                        return (""+valeur);
                }
            }
            return "0";

        }
        private   String degre_un(int valeur) {
            //Transmission des valeurs inferieures au degre un a la methode (degre_zero)
            if(valeur<Math.pow(16, 1)) {
                String  secondresult = degre_zero(valeur);
                return("0_"+secondresult);
            }
            //Verification de la valeur dans l'intervale et choix de la borne
            if(valeur ==16) { return("1_0_");}
            if(valeur>Math.pow(16, 1) && valeur<Math.pow(16,2)) {

                //Division de la valeur par la borne en entier
                int result = (int) ((int)valeur/Math.pow(16, 1));
                //Recuperation du module da la valeur
                int second =(int) (valeur-(result*Math.pow(16, 1)));
                //Traitement des resutats qui ce fera en deux parties

                //appelle de ma methode degre_zero
                String  secondresult = degre_zero(second);{
                    //Traitement des resutats avec ma methode traite_result
                    //Je le passe mon result et mon secondresult

                    return traite_result( result , secondresult);
                }
            }
            return null;
        }

        private   String degre_deux(int valeur) {
            //Transmission des valeurs inferieures au degre deux a la methode (degre_un)
            if(valeur<Math.pow(16, 2)) {
                String  secondresult = degre_un(valeur);
                return("0_"+ secondresult);
            }
            if(valeur ==256) {
                return("1_0_0");
            }
            //Verification de la valeur dans l'intervale et choix de la borne

            if(valeur>Math.pow(16, 2) && valeur<Math.pow(16,3)) {

                //Division de la valeur par la borne en entier
                int result = (int) ((int)valeur/Math.pow(16, 2));
                //Recuperation du module da la valeur
                int second =(int) (valeur-(result*Math.pow(16, 2)));
                //Traitement des resutats qui ce fera en deux parties

                //appelle de ma methode
                String  secondresult = degre_un(second);
                //Traitement des resutats avec ma methode traite_result
                //Je le passe mon result et mon secondresult

                return traite_result( result , secondresult);

            }
            return null;
        }

        private   String degre_trois(int valeur) {
            //Transmission des valeurs inferieures au degre trois a la methode (degre_deux)
            if(valeur<Math.pow(16, 3)) {
                String  secondresult = degre_deux(valeur);
                return("0_"+secondresult);
            }

            if(valeur ==4096) {
                return("1_0_0_0");
            }
            //Verification de la valeur dans l'intervale et choix de la borne
            if(valeur>Math.pow(16, 3) && valeur<Math.pow(16,4)) {

                //Division de la valeur par la borne en entier
                int result = (int) ((int)valeur/Math.pow(16, 3));
                //Recuperation du module da la valeur
                int second =(int) (valeur-(result*Math.pow(16, 3)));
                //Traitement des resutats qui ce fera en deux parties
                //appelle de ma methode
                String  secondresult = degre_deux(second);
                //Traitement des resutats avec ma methode traite_result
                //Je le passe mon result et mon secondresult

                return traite_result( result , secondresult);
            }
            return null;
        }
        private String degre_quatre(int valeur) {
            //Transmission des valeurs inferieures au degre quatre a la methode (degre_trois)
            if(valeur<Math.pow(16, 4)) {
                String  secondresult = degre_trois(valeur);
                return("0_"+secondresult);
            }
            if(valeur ==65536) {
                return("1_0_0_0_0");
            }
            //Verification de la valeur dans l'intervale et choix de la borne
            if(valeur>Math.pow(16, 4) && valeur<Math.pow(16,5)) {

                //Division de la valeur par la borne en entier
                int result = (int) ((int)valeur/Math.pow(16, 4));
                //Recuperation du module da la valeur
                int second =(int) (valeur-(result*Math.pow(16, 4)));
                //Traitement des resutats qui ce fera en deux parties

                //appelle de ma methode
                String  secondresult = degre_trois(second);
                //Traitement des resutats avec ma methode traite_result
                //Je le passe mon result et mon secondresult
                return traite_result( result , secondresult);

            }
            return null;
        }
        private String degre_cinque(int valeur) {
            //Transmission des valeurs inferieures au degre quatre a la methode (degre_trois)
            if(valeur<Math.pow(16, 5)) {
                String  secondresult = degre_quatre(valeur);
                return("0_"+secondresult);
            }
            if(valeur ==1048576) {
                return("1_0_0_0_0_0");
            }
            //Verification de la valeur dans l'intervale et choix de la borne
            if(valeur>Math.pow(16, 5) && valeur<Math.pow(16,6)) {

                //Division de la valeur par la borne en entier
                int result = (int) ((int)valeur/Math.pow(16, 5));
                //Recuperation du module da la valeur
                int second =(int) (valeur-(result*Math.pow(16, 5)));
                //Traitement des resutats qui ce fera en deux parties

                //appelle de ma methode
                String  secondresult = degre_quatre(second);
                //Traitement des resutats avec ma methode traite_result
                //Je le passe mon result et mon secondresult
                return traite_result( result , secondresult);

            }
            return null;
        }
        private String degre_six(int valeur) {
            //Transmission des valeurs inferieures au degre quatre a la methode (degre_trois)
            if(valeur<Math.pow(16, 6)) {
                String  secondresult = degre_cinque(valeur);
                return("0_"+secondresult);
            }
            if(valeur ==16777216) {
                return("1_0_0_0_0_0_0");
            }
            //Verification de la valeur dans l'intervale et choix de la borne
            if(valeur>Math.pow(16, 6) && valeur<Math.pow(16,7)) {

                //Division de la valeur par la borne en entier
                int result = (int) ((int)valeur/Math.pow(16, 6));
                //Recuperation du module da la valeur
                int second =(int) (valeur-(result*Math.pow(16, 6)));
                //Traitement des resutats qui ce fera en deux parties

                //appelle de ma methode
                String  secondresult = degre_cinque(second);
                //Traitement des resutats avec ma methode traite_result
                //Je le passe mon result et mon secondresult
                return traite_result( result , secondresult);

            }
            return null;
        }
        private String degre_sept(int valeur) {
            //Transmission des valeurs inferieures au degre quatre a la methode (degre_trois)
            if(valeur<Math.pow(16, 7)) {
                String  secondresult = degre_six(valeur);
                return("0_"+secondresult);
            }
            if(valeur ==268435456) {
                return("1_0_0_0_0_0_0_0");
            }
            //Verification de la valeur dans l'intervale et choix de la borne
            if(valeur>Math.pow(16, 7) && valeur<Math.pow(16,8)) {

                //Division de la valeur par la borne en entier
                int result = (int) ((int)valeur/Math.pow(16, 7));
                //Recuperation du module da la valeur
                int second =(int) (valeur-(result*Math.pow(16, 7)));
                //Traitement des resutats qui ce fera en deux parties

                //appelle de ma methode
                String  secondresult = degre_six(second);
                //Traitement des resutats avec ma methode traite_result
                //Je le passe mon result et mon secondresult
                return traite_result( result , secondresult);

            }
            return null;
        }
        private String traite_result(int result ,String secondresult) {
            switch (result) {

                /*Ma methode comporte deux parties
                 * Premiere Partie
                 *Cas ou result est superieur à dix
                 */
                case 10:

                    return("A"+"_"+secondresult);
                case 11:

                    return("B"+"_"+secondresult);
                case 12:

                    return("C"+"_"+secondresult);
                case 13:

                    return("D"+"_"+secondresult);
                case 14:

                    return("E"+"_"+secondresult);
                case 15:

                    return("F"+"_"+secondresult);
                default :
                    /*
                     *Cas ou result est inferieur à dix
                     */
                    return(result+"_"+secondresult);

            }

        }
        public  String traite_intervale() {

            if(this.myvaleur<Math.pow(16, 1)) {
                this.resultat =degre_zero(this.myvaleur);
                return resultat;
            }
            if(this.myvaleur>Math.pow(16, 1) && this.myvaleur<Math.pow(16,2)) {
                this.resultat =degre_un(this.myvaleur);
                return resultat;
            }
            if(this.myvaleur>Math.pow(16, 2) && this.myvaleur<Math.pow(16,3)) {
                this.resultat =degre_deux(this.myvaleur);
                return resultat;
            }
            if(this.myvaleur>Math.pow(16, 3) && this.myvaleur<Math.pow(16,4)) {
                this.resultat = degre_trois(this.myvaleur);
                 return resultat;
            }
            if(this.myvaleur>Math.pow(16, 4) && this.myvaleur<Math.pow(16,5)) {
                this.resultat = degre_quatre(this.myvaleur);
                return resultat;
            }
            if(this.myvaleur>Math.pow(16, 5) && this.myvaleur<Math.pow(16,6)) {
                this.resultat = degre_cinque(this.myvaleur);
                return resultat;
            }
            if(this.myvaleur>Math.pow(16, 6) && this.myvaleur<Math.pow(16,7)) {
                this.resultat = degre_six(this.myvaleur);
                return resultat;
            }
            if(this.myvaleur>Math.pow(16, 7) && this.myvaleur<Math.pow(16,8)) {
                this.resultat = degre_sept(this.myvaleur);
                return resultat;
            }
            return"Erreur verifier la valeure saisi";
        }

    }
