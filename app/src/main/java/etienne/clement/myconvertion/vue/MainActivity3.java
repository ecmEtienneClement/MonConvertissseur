package etienne.clement.myconvertion.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import etienne.clement.myconvertion.R;
import etienne.clement.myconvertion.controle.Instance;

public class MainActivity3 extends AppCompatActivity {
    //creation de mes variables pour mes elements de ma vue
    private EditText m_valeur_hexadecimal;
    private Button m_btn_convertir_hexadecimal;
    private Button m_btn_effacer_hexadecimal;
    private EditText m_valeur_binaire;
    private Button m_btn_convertir_binaire;
    private Button m_btn_effacer_binaire;
    private TextView m_resultat;
    private Button m_btn_page1;
    private Button m_btn_page2;
  //Creation de ma variable pour mon instance
    private Instance mInstance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //Recuperation des elements de ma vue
        m_valeur_hexadecimal = (EditText)findViewById(R.id.valeur_decimal);
        m_btn_convertir_hexadecimal = (Button)findViewById(R.id.convertir_decimal);
        m_btn_effacer_hexadecimal = (Button)findViewById(R.id.effacer_decimal);
        m_valeur_binaire = (EditText)findViewById(R.id.valeur_hexadecimal);
        m_btn_convertir_binaire = (Button)findViewById(R.id.convertir_hexadecimal);
        m_btn_effacer_binaire = (Button)findViewById(R.id.effacer_hexadecimal);
        m_resultat = (TextView)findViewById(R.id.valeur_resultat);
        m_btn_page1 = (Button)findViewById(R.id.page2);
        m_btn_page2 = (Button)findViewById(R.id.page3);
        //Mise en place de mon instance unique
        this.mInstance = Instance.getInstance();

        //Desactivation des boutons par defaut
        m_btn_convertir_hexadecimal.setEnabled(false);
        m_btn_convertir_binaire.setEnabled(false);

        //Condition de reactivation des boutons
        m_valeur_hexadecimal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                m_btn_convertir_hexadecimal.setEnabled(charSequence.length()!=0);
                if(charSequence.length() >7){
                    m_btn_convertir_hexadecimal.setEnabled(false);
                    Toast.makeText(MainActivity3.this,"Veillez réduire la valeur saisis",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        m_valeur_binaire.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                m_btn_convertir_binaire.setEnabled(charSequence.length()!=0);
                if(charSequence.length() >26){
                    m_btn_convertir_binaire.setEnabled(false);
                    Toast.makeText(MainActivity3.this,"Veillez réduire la valeur saisis",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        //Mise en place du bouton clear pour effacer le champs hexadecimal
        m_btn_effacer_hexadecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m_valeur_hexadecimal.setText("");
            }
        });
        /*Evenement du click bouton convertir hexadecimal pour convertir la valeur hexadecimal
         * saisis sur le champs EditText avec des verifications preliminaires
         */
        m_btn_convertir_hexadecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                            try {String valeur;
                                 valeur = m_valeur_hexadecimal.getText().toString();
                                String valeur_en_lettre = String.valueOf(valeur);

                                affichageResultatHexadecimal(valeur_en_lettre);

                            }catch (Exception e){
                                Toast.makeText(MainActivity3.this,"Erreur de saisis",Toast.LENGTH_LONG).show();
                            }
            }
        });
        /*Evenement du click bouton convertir binaire pour convertir la valeur binaire
         * saisis sur le champs EditText avec des verifications preliminaires
         */
        m_btn_convertir_binaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String valeur = m_valeur_binaire.getText().toString();
                    afficheResultatBinaire(valeur);
                }     catch (Exception e){
                    Toast.makeText(MainActivity3.this,"Erreur de saisis",Toast.LENGTH_LONG).show();
                }
            }
        });
        //Mise en place de mon bouton clear pour effacer le champs binaire
        m_btn_effacer_binaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m_valeur_binaire.setText("");
            }
        });
        //Mise en place de mes boutons de navigation vers les autres pages
        m_btn_page1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page1 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(page1);
                finish();
                Toast.makeText(MainActivity3.this,"Vous éte sur la page 1",Toast.LENGTH_LONG).show();
            }
        });

        m_btn_page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page2 = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(page2);
                finish();
                Toast.makeText(MainActivity3.this,"Vous éte sur la page 2",Toast.LENGTH_LONG).show();
            }
        });
    }
    //Mise en place de mon profil hexadecimal et affichage du resultat
    private void affichageResultatHexadecimal(String valeur){
        //J'appelle ma methode hexadecimale pour le convertir dabord en decimal
        this.mInstance.profil_hexadecimal(valeur);
        //Mon resultat en decimal
        int result_en_decimal = this.mInstance.getResulatHexadecimal();
        //Verification de mon resultat
        if(result_en_decimal == 0){
            Toast.makeText(MainActivity3.this,"Veillez vérifier les caractères saisis",Toast.LENGTH_LONG).show();
        }
        else {
            //Si la verfication est bonne je passe mon resultat en decimal a mon profil decibinaire
            //pour le convertir en valeur binaire
            this.mInstance.profil_decibinaire(result_en_decimal);
            //Mon resultat en binaire
            String resultat_en_binaire = this.mInstance.getResultatDecibinaire();
            //verificatio de mon resultat
            if(resultat_en_binaire ==null){
                Toast.makeText(MainActivity3.this,"Veillez vérifier les caractères saisis",Toast.LENGTH_LONG).show();
            }
            else if(resultat_en_binaire =="050505")  {
                Toast.makeText(MainActivity3.this,"Veillez vérifier les caractères saisis",Toast.LENGTH_LONG).show();
            }
            else {
                this.m_resultat.setText(String.valueOf(resultat_en_binaire));
            }
        }

    }
    //Mise en place de mon profil binaire et affichage de mon resultat
    private void afficheResultatBinaire(String valeur){
        //j'appelle d'abord ma methode binaire pour le convertir en decimale en premier lieu
        this.mInstance.profil_binaire(valeur);
        //Verification du resultat
        int resultat_en_decimal = this.mInstance.getResultatBinaire();
        if(resultat_en_decimal ==33333){
            Toast.makeText(MainActivity3.this,"Veillez vérifier vos caractères saisis",Toast.LENGTH_LONG).show();
        }
        else if (resultat_en_decimal==22222){
            Toast.makeText(MainActivity3.this,"Désoler vous avez dépaser la valeur max !",Toast.LENGTH_LONG).show();
        }
        else {
            //ma methode decimal pour en dernier lieu convertir en hexadecimal
            this.mInstance.profil_decimal(resultat_en_decimal);
                //Verification du resultat
            String resultat_hexadecimal =this.mInstance.getResultatDecimal();
            this.m_resultat.setText(String. valueOf(resultat_hexadecimal));

        }
    }
}