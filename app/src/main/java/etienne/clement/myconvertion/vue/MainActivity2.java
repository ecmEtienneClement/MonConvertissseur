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

public class MainActivity2 extends AppCompatActivity {
    //creation de mes variables pour mes elements de ma vue
    private EditText m_valeur_decimal;
    private Button m_btn_convertir_decimal;
    private Button m_btn_effacer_decimal;
    private EditText m_valeur_binaire;
    private Button m_btn_convertir_binaire;
    private Button m_btn_effacer_binaire;
    private TextView m_resultat;
    private Button m_btn_page1;
    private Button m_btn_page3;
    //Creation de ma variable pour l'instance
    private Instance mInstance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        /*Recuperation des elements de ma vue
        NB : les ID sont dans page principale tout les autres pages garderons les même ID
        ce definis par la page principal y faire attention ETIENNE CLEMENT..
        */
        m_valeur_decimal = (EditText)findViewById(R.id.valeur_decimal);
        m_btn_convertir_decimal = (Button)findViewById(R.id.convertir_decimal);
        m_btn_effacer_decimal = (Button)findViewById(R.id.effacer_decimal);
        m_valeur_binaire = (EditText) findViewById(R.id.valeur_hexadecimal);
        m_btn_convertir_binaire = (Button)findViewById(R.id.convertir_hexadecimal);
        m_btn_effacer_binaire = (Button)findViewById(R.id.effacer_hexadecimal);
        m_resultat = (TextView) findViewById(R.id.valeur_resultat);
        m_btn_page1 = (Button)findViewById(R.id.page2);
        m_btn_page3 = (Button)findViewById(R.id.page3);

        //Mise en place de mon instance
        this.mInstance = Instance.getInstance();

        //Desactivation de mes bouton par defaut
        m_btn_convertir_decimal.setEnabled(false);
        m_btn_convertir_binaire.setEnabled(false);

        //Condition de reactivation des boutons
        m_valeur_decimal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                m_btn_convertir_decimal.setEnabled(charSequence.length()!=0);
                if(charSequence.length() >10){
                    m_btn_convertir_decimal.setEnabled(false);
                    Toast.makeText(MainActivity2.this,"Veillez réduire la valeur saisis",Toast.LENGTH_LONG).show();
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
                if(charSequence.length() >30){
                    m_btn_convertir_binaire.setEnabled(false);
                    Toast.makeText(MainActivity2.this,"Veillez réduire la valeur saisis",Toast.LENGTH_LONG).show();
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
                            String valeur = m_valeur_decimal.getText().toString();
                            int valeur_chiffre = Integer.valueOf(valeur);

                                   afficheResultatDecimal(valeur_chiffre);
                         }
                    catch (Exception e){
                           Toast.makeText(MainActivity2.this,"Erreur vous avez dépasser la valeur max !",Toast.LENGTH_LONG).show();
                         }
                }
            });

            /*Evenement du click bouton convertir binaire pour convertir la valeur binaire
            saisis sur le champs valeur binaire avec verification preliminaire
            */
        m_btn_convertir_binaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    try {
                        String valeur = m_valeur_binaire.getText().toString();
                         afficheResultatBinaire(valeur);
                    }     catch (Exception e){
                        Toast.makeText(MainActivity2.this,"Erreur de saisis",Toast.LENGTH_LONG).show();
                    }
            }
        });
        //Mise place de mon bouton clear pour effacer le champs decimal
        m_btn_effacer_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_valeur_decimal.setText("");
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
                  Toast.makeText(MainActivity2.this,"Vous éte sur la page 1",Toast.LENGTH_LONG).show();
                finish();
            }
        });

        m_btn_page3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page3 = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(page3);
                  Toast.makeText(MainActivity2.this,"Vous éte sur la page 3",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
     //Mise en place de mon profil decimal et affichage de mon resultat decimale
    private void afficheResultatDecimal(int valeur){

      this.mInstance.profil_decibinaire(valeur);
      //Affichage du resultat
       String result= this.mInstance.getResultatDecibinaire();
       if(result ==null){
        Toast.makeText(MainActivity2.this,"Veillez vérifier les caractères saisis",Toast.LENGTH_LONG).show();
       }
       else if(result =="050505")  {
        Toast.makeText(MainActivity2.this,"Veillez vérifier les caractères saisis",Toast.LENGTH_LONG).show();
       }
       else {
        this.m_resultat.setText(String.valueOf(result));
       }
    }
    //Mise en place de mon profil binaire et affichage de mon resultat binaire
    private void afficheResultatBinaire(String valeur){
        this.mInstance.profil_binaire(valeur);
        int result = this.mInstance.getResultatBinaire();
        if(result ==33333){
         Toast.makeText(MainActivity2.this,"Veillez vérifier vos caractères saisis",Toast.LENGTH_LONG).show();
        }
        else if (result==22222){
            Toast.makeText(MainActivity2.this,"Désoler vous avez dépaser la valeur max !",Toast.LENGTH_LONG).show();
        }
        else {
            this.m_resultat.setText(String.valueOf(result));
        }
    }
}