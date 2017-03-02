package wildentertainmentsas.monsterwikilegends;

import android.content.Intent;
import android.graphics.Typeface;
import android.icu.text.DisplayContext;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static wildentertainmentsas.monsterwikilegends.R.id.textView;


public class Creation extends AppCompatActivity {



    EditText editTextNom;
    TextView textView3;
    TextView textViewElement;
    Button retour;
    String element;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation);

        editTextNom = (EditText) findViewById(R.id.editTextNom);
        editTextNom.setGravity(Gravity.CENTER_HORIZONTAL);
        textView3 = (TextView)findViewById(R.id.textView3);
        textViewElement = (TextView)findViewById(R.id.textViewElement);
        retour= (Button) findViewById(R.id.retour);
        retour.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
            finish();            }
        });

        Typeface Chantelli = Typeface.createFromAsset(getAssets(),"fonts/Chantelli_Antiqua.ttf");

        textView3.setTypeface(Chantelli);
        textViewElement.setTypeface(Chantelli);
        editTextNom.setTypeface(Chantelli);
        retour.setTypeface(Chantelli);

    }

    public void onClick(View v){
            Intent continueCreation = new Intent(Creation.this, Creation2.class);


            if (editTextNom.length()==0){
                Toast.makeText(Creation.this, getString(R.string.renseigner),
                        Toast.LENGTH_LONG).show();
            }
            else {
                switch (v.getId()){
                    case R.id.foudre :
                        if (editTextNom.length() != 0){
                            String name = editTextNom.getText().toString();
                            String element = "Foudre";
                            int oeufElement = 1;
                            continueCreation.putExtra("name",name);
                            continueCreation.putExtra("element", element);
                            continueCreation.putExtra("oeufElement", oeufElement);
                            startActivity(continueCreation);

                        }
                        break;
                    case R.id.feu :
                        if (editTextNom.length() != 0){
                            String name = editTextNom.getText().toString();
                            String element = "Feu";
                            int oeufElement = 2;
                            continueCreation.putExtra("name",name);
                            continueCreation.putExtra("element", element);
                            continueCreation.putExtra("oeufElement", oeufElement);
                            startActivity(continueCreation);

                        }
                        break;
                    case R.id.eau :
                        if (editTextNom.length() != 0){
                            String name = editTextNom.getText().toString();
                            String element = "Eau";
                            int oeufElement = 3;
                            continueCreation.putExtra("name",name);
                            continueCreation.putExtra("element", element);
                            continueCreation.putExtra("oeufElement", oeufElement);
                            startActivity(continueCreation);
                        }
                        break;
                    case R.id.magie :
                        if (editTextNom.length() != 0){
                            String name = editTextNom.getText().toString();
                            String element = "Magie";
                            int oeufElement = 4;
                            continueCreation.putExtra("name",name);
                            continueCreation.putExtra("element", element);
                            continueCreation.putExtra("oeufElement", oeufElement);
                            startActivity(continueCreation);
                        }
                        break;
                    case R.id.lumiere :
                        if (editTextNom.length() != 0){
                            String name = editTextNom.getText().toString();
                            String element = "Lumiere";
                            int oeufElement = 5;
                            continueCreation.putExtra("name",name);
                            continueCreation.putExtra("element", element);
                            continueCreation.putExtra("oeufElement", oeufElement);
                            startActivity(continueCreation);
                        }
                        break;
                    case R.id.metal :
                        if (editTextNom.length() != 0){
                            String name = editTextNom.getText().toString();
                            String element = "Metal";
                            int oeufElement = 6;
                            continueCreation.putExtra("name",name);
                            continueCreation.putExtra("element", element);
                            continueCreation.putExtra("oeufElement", oeufElement);
                            startActivity(continueCreation);

                        }
                        break;
                    case R.id.nature :
                        if (editTextNom.length() != 0){
                            String name = editTextNom.getText().toString();
                            String element = "Nature";
                            int oeufElement = 7;
                            continueCreation.putExtra("name",name);
                            continueCreation.putExtra("element",element);
                            continueCreation.putExtra("oeufElement", oeufElement);
                            startActivity(continueCreation);

                        }
                        break;
                    case R.id.mort :
                        if (editTextNom.length() != 0){
                            String name = editTextNom.getText().toString();
                            String element = "Mort";
                            int oeufElement = 8;
                            continueCreation.putExtra("name",name);
                            continueCreation.putExtra("element", element);
                            continueCreation.putExtra("oeufElement", oeufElement);
                            startActivity(continueCreation);

                        }
                        break;
                    case R.id.special :
                        if (editTextNom.length() != 0){
                            String name = editTextNom.getText().toString();
                            String element = "Special";
                            int oeufElement = 9;
                            continueCreation.putExtra("name",name);
                            continueCreation.putExtra("element", element);
                            continueCreation.putExtra("oeufElement", oeufElement);
                            startActivity(continueCreation);
                        }
                        break;
                    case R.id.terre :
                        if (editTextNom.length() != 0){
                            String name = editTextNom.getText().toString();
                            String element = "Terre";
                            int oeufElement = 10;
                            continueCreation.putExtra("name",name);
                            continueCreation.putExtra("element", element);
                            continueCreation.putExtra("oeufElement", oeufElement);
                            startActivity(continueCreation);

                        }
                        break;








                }
                }




        }





    }

