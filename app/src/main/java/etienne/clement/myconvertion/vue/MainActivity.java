package etienne.clement.myconvertion.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
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

public class MainActivity extends AppCompatActivity {
//creation de mes variables pour mes elements de ma vue..
    private Button m_btn_info;
    private EditText m_valeur_decimal;
    private EditText m_valeur_hexadecimal;
    private Button m_btn_convertir_decimal;
    private Button m_btn_effacer_decimal;
    private Button m_btn_convertir_hexadecimal;
    private  Button m_btn_effacer_hexadecimal;
    private TextView m_resultat;
    private Button m_btn_page2;
    private Button m_btn_page3;

    //Recuperation de ma classe instance
    private Instance mInstance;
    //Recuperation de mon instance de cette MainActivity elle meme pour mon alertdialog
    MainActivity mMainActivity;
// @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperation de mes elements sur la vue avec leur identifiants
        m_btn_info = (Button)findViewById(R.id.info);
        m_valeur_decimal = (EditText) findViewById(R.id.valeur_decimal);
        m_valeur_hexadecimal = (EditText) findViewById(R.id.valeur_hexadecimal);
        m_btn_convertir_decimal = (Button) findViewById(R.id.convertir_decimal);
        m_btn_effacer_decimal = (Button) findViewById(R.id.effacer_decimal);
        m_btn_convertir_hexadecimal = (Button) findViewById(R.id.convertir_hexadecimal);
        m_btn_effacer_hexadecimal = (Button) findViewById(R.id.effacer_hexadecimal);
        m_resultat = (TextView)findViewById(R.id.valeur_resultat);
        m_btn_page2 = (Button) findViewById(R.id.page2);
        m_btn_page3 = (Button)findViewById(R.id.page3);

        //Recuperation de mon instance MainActivite
        this.mMainActivity = this;
        //Recuperation de mon instance
        this.mInstance= Instance.getInstance();

        // Presentation sur l'information de  l'application
        m_btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder my_info = new AlertDialog.Builder(mMainActivity);
                my_info.setTitle("Bienvenue sur MyConversion ");
                my_info.setMessage("MyConversion est développée par ETIENNE CLEMENT MBAYE de la promotion 7 en " +
                        "IDA sous le nom de ECM.FANTÔME, celle-ci est la première version. Cette application fait la conversion en Décimal, Binaire, et " +
                        "en Hexadécimal des valeurs saisis, et pour des questions de sécurités myConversion n'accéde à aucune de vos" +
                        " données personnelles. Et pour plus d'informations ou erreurs " +
                        " vous pouvez me le signaler sur ce e-mail : ecmbayeclement@gmail.com ");
                my_info.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Etienne Clement vous remercie",Toast.LENGTH_SHORT).show();
                    }
                });
                my_info.show();
            }
        });

        //Desactivation des boutons par defaut
        m_btn_convertir_decimal.setEnabled(false);
        m_btn_convertir_hexadecimal.setEnabled(false);

        //Condition de reactivation des boutons lors de saisis d'une valeur
        m_valeur_decimal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
              m_btn_convertir_decimal.setEnabled(charSequence.length() !=0 );

              if(charSequence.length() >9){
                  m_btn_convertir_decimal.setEnabled(false);
                  Toast.makeText(MainActivity.this,"Veillez réduire la valeur saisis",Toast.LENGTH_LONG).show();
              }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        m_valeur_hexadecimal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            m_btn_convertir_hexadecimal.setEnabled(charSequence.length()!=0);
                if(charSequence.length() >7){
                    m_btn_convertir_hexadecimal.setEnabled(false);
                    Toast.makeText(MainActivity.this,"Veillez réduire la valeur saisis",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        /*Evenement du click bouton convertir decimal pour convertir la valeur decimal
        * saisis sur le champs EditText avec des verifications preliminaires
        */
        m_btn_convertir_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //Recupration de ma valeur saisis et convertion de cette valeur
                    String valeur;
                    valeur = m_valeur_decimal.getText().toString();
                    Integer valeur_chiffre = Integer.valueOf(valeur);
                    //Verification de la validite de cette valeur
                    if(valeur_chiffre <=0){
                        Toast.makeText(MainActivity.this,"Veillez saisir une valeur supérieur a 0",Toast.LENGTH_LONG).show();
                    }
                    else if(valeur_chiffre >268435455){
                        Toast.makeText(MainActivity.this,"Erreur vous avez dépasser la valeur max !",Toast.LENGTH_LONG).show();
                    }
                    else {
                        affiche_resultat_decimal(valeur_chiffre);
                    }
                }catch (Exception e){
                        Toast.makeText(MainActivity.this,"Erreur de saisis",Toast.LENGTH_LONG).show();
                }
            }
        });
        m_btn_convertir_hexadecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //Recupration de ma valeur saisis et convertion de cette valeur
                    String valeur;
                    valeur = m_valeur_hexadecimal.getText().toString();
                    String valeur_lettre = String.valueOf(valeur);
                    //Verification de la validite de cette valeur

                        affiche_resultat_hexadecimal(valeur_lettre);

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Erreur de saisis",Toast.LENGTH_LONG).show();
                }
            }
        });

        //Mise en place de mon bouton clear pour effacer le champ de valeur decimal
        m_btn_effacer_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             m_valeur_decimal.setText("");
            }
        });

        //Mise en place de mon bouton clear pour effacer le champs de valeur decimal
        m_btn_effacer_hexadecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_valeur_hexadecimal.setText("");
            }
        });

        //Mise en place de mes boutons de navigation vers les autres pages

        m_btn_page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent page2 = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(page2);
            finish();
            Toast.makeText(MainActivity.this,"Vous éte sur la page 2",Toast.LENGTH_LONG).show();
            }
        });

        m_btn_page3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page3 = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(page3);
                finish();
                Toast.makeText(MainActivity.this,"Vous éte sur la page 3",Toast.LENGTH_LONG).show();
            }
        });


    }
    //Ma methode creation de profil et affiche resultat pour ma valeur decimal
    private void affiche_resultat_decimal(int valeur){
        //Appelle de ma methode profil decimal de la classe control
        this.mInstance.profil_decimal(valeur);
        //Appelle de ma methode getResultatDecimal de ma classe control
        String resultat = this.mInstance.getResultatDecimal();
        //Affichage du resultat
        this.m_resultat.setText(String.valueOf(resultat));
    }
    //Ma methode creation de profil et affiche pour ma valeur hexadecimal
    private void affiche_resultat_hexadecimal(String valeur){

        //Appelle de ma methode profil hexadecimal de la classe control
        this.mInstance.profil_hexadecimal(valeur);

        //Appelle de ma methode getResultatHexadecimal de ma classe control
        int resultat = this.mInstance.getResulatHexadecimal();
        //Affichage du resultat
        if(resultat == 0){
            Toast.makeText(MainActivity.this,"Veillez vérifier les caractères saisis",Toast.LENGTH_LONG).show();
        }

        else {
        this.m_resultat.setText(String.valueOf(resultat));
        }
    }

}