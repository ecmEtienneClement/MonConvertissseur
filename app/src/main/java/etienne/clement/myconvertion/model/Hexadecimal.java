package etienne.clement.myconvertion.model;

/**
 * created by ETIENNE CLEMENT MBAYE on 11/28/20.
 */
public class Hexadecimal {
    private String my_valeur;
    private int resultat;
    public Hexadecimal(String my_valeur) {
        this.my_valeur = my_valeur;
        this.verification_de_valeur();
    }
    public int getResultat(){
        return resultat;

    }

        /*verification de valeur verifier la validite de la valeur sans spacements interne et externe
         *et convertions de la valeur en Upercase (if*=true) passe valeur a la methode trie d'indice de la valeur*/

        public  int verification_de_valeur() {
            String valeur_no_space = this.my_valeur.trim();
            String valeur_to_upercase  =valeur_no_space.toUpperCase();
            if(valeur_to_upercase.contains(" ")==true) {
                return 0;

            }else {
                this.resultat = trie_indice_de_valeur(valeur_to_upercase);
                return resultat;
            }
        }
        private   int trie_indice_de_valeur(String valeur) {
            int longueur_valeur = valeur.length();
            //declaration et intialisation de mes variables pour l'estokage de mes resultats pour chaque indice
            int indice_aleatoire = 0; int indice_zero = 0; int indice_un = 0; int indice_deux = 0; int indice_trois = 0;
            int indice_quatre = 0; int indice_cinque = 0; int indice_sixe = 0; int indice_sept = 0;
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


                if(indice_aleatoire == longueur_valeur-1) {
                    return verification_second(indice_zero,indice_un,indice_deux,indice_trois,
                            indice_quatre,indice_cinque,indice_sixe ,indice_sept);
                }
                ++indice_aleatoire;
            }
            return 0000;


        }

        /*calcule l'indice en fonction du carectere et de la 1 par raport a la position
         * indice_aleatoire
         */
        private   int calcule_indice (char caractere,int longueur_valeur,int puissance) {
            switch (caractere) {
                case '0':{
                    int result =(int) Math.pow(16,longueur_valeur-puissance);
                    int second = (result*0);
                    return second;
                }
                case'1': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*1);
                    return second;
                }
                case'2': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*2);
                    return second;

                }
                case'3': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*3);
                    return second;
                }
                case'4': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*4);
                    return second;
                }
                case '5': {
                    int result =(int) Math.pow(16,longueur_valeur-puissance);
                    int second = (result*5);
                    return second;
                }
                case'6': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*6);
                    return second;
                }
                case'7': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*7);
                    return second;
                }
                case'8': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*8);
                    return second;
                }
                case'9': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*9);
                    return second;
                }
                case'A': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*10);
                    return second;
                }
                case'B': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*11);
                    return second;
                }
                case'C': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*12);
                    return second;
                }
                case 'D': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*13);
                    return second;
                }
                case'E': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*14);
                    return second;
                }
                case 'F': {
                    int result =(int) Math.pow(16,(longueur_valeur-puissance));
                    int second = (result*15);
                    return second;
                }
                default :{
                    return 01010;
                }
            }

        }

        /*cette methode fait la verification des different valeur de second retourné par les differents indices
         * annulle la sommation si l'une des valeurs de retour est egale à 000;
         * cas contraire si les valeurs sont normale il appelle la methode sommation et lui passe les differentes
         * valeur de second pour le resultat final
         */
        private int verification_second(int indice_zero,int indice_un,int indice_deux,int indice_trois,
                                              int indice_quatre,int indice_cinque,int indice_sixe,int indice_sept) {
            if(indice_zero == 01010 || indice_un==01010 || indice_deux ==01010 || indice_trois==01010 ||
                    indice_quatre == 01010 || indice_cinque == 01010 || indice_sixe == 01010 || indice_sept == 01010 ) {
                return 0;
            }
            else {
                return sommation_second( indice_zero, indice_un, indice_deux, indice_trois,
                        indice_quatre, indice_cinque, indice_sixe, indice_sept);
            }


        }
        //cette methode fait la sommation de tout mes valeurs second retourné par les differents indice...
        private int sommation_second(int indice_zero,int indice_un,int indice_deux,int indice_trois,
                                           int indice_quatre,int indice_cinque,int indice_sixe,int indice_sept) {

            int second_final = indice_zero + indice_un +indice_deux + indice_trois
                    + indice_quatre + indice_cinque + indice_sixe+  indice_sept ;

                return  second_final;
            }
}







