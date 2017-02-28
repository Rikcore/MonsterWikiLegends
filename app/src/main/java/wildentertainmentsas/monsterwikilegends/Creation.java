package wildentertainmentsas.monsterwikilegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Creation extends AppCompatActivity {



    EditText editTextNom;
    Button retour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation);

        editTextNom = (EditText) findViewById(R.id.editTextNom);
        retour= (Button) findViewById(R.id.retour);
        retour.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Creation.this, Accueil.class));
            }
        });
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
                            String NomDeMonMonstre = editTextNom.getText().toString();
                            String Element = "Foudre";
                            continueCreation.putExtra("NomDeMonMonstre",NomDeMonMonstre);
                            continueCreation.putExtra("Element", Element);
                            startActivity(continueCreation);
                        }
                        break;
                    case R.id.feu :
                        if (editTextNom.length() != 0){
                            String NomDeMonMonstre = editTextNom.getText().toString();
                            String Element = "Feu";
                            continueCreation.putExtra("NomDeMonMonstre",NomDeMonMonstre);
                            continueCreation.putExtra("Element", Element);
                            startActivity(continueCreation);
                        }
                        break;
                    case R.id.eau :
                        if (editTextNom.length() != 0){
                            String NomDeMonMonstre = editTextNom.getText().toString();
                            String Element = "Eau";
                            continueCreation.putExtra("NomDeMonMonstre",NomDeMonMonstre);
                            continueCreation.putExtra("Element", Element);
                            startActivity(continueCreation);
                        }
                        break;
                    case R.id.magie :
                        if (editTextNom.length() != 0){
                            String NomDeMonMonstre = editTextNom.getText().toString();
                            String Element = "Magie";
                            continueCreation.putExtra("NomDeMonMonstre",NomDeMonMonstre);
                            continueCreation.putExtra("Element", Element);
                            startActivity(continueCreation);
                        }
                        break;
                    case R.id.lumiere :
                        if (editTextNom.length() != 0){
                            String NomDeMonMonstre = editTextNom.getText().toString();
                            String Element = "Lumiere";
                            continueCreation.putExtra("NomDeMonMonstre",NomDeMonMonstre);
                            continueCreation.putExtra("Element", Element);
                            startActivity(continueCreation);
                        }
                        break;
                    case R.id.metal :
                        if (editTextNom.length() != 0){
                            String NomDeMonMonstre = editTextNom.getText().toString();
                            String Element = "Metal";
                            continueCreation.putExtra("NomDeMonMonstre",NomDeMonMonstre);
                            continueCreation.putExtra("Element", Element);
                            startActivity(continueCreation);
                        }
                        break;
                    case R.id.nature :
                        if (editTextNom.length() != 0){
                            String NomDeMonMonstre = editTextNom.getText().toString();
                            String Element = "Nature";
                            continueCreation.putExtra("NomDeMonMonstre",NomDeMonMonstre);
                            continueCreation.putExtra("Element", Element);
                            startActivity(continueCreation);
                        }
                        break;
                    case R.id.mort :
                        if (editTextNom.length() != 0){
                            String NomDeMonMonstre = editTextNom.getText().toString();
                            String Element = "Mort";
                            continueCreation.putExtra("NomDeMonMonstre",NomDeMonMonstre);
                            continueCreation.putExtra("Element", Element);
                            startActivity(continueCreation);
                        }
                        break;
                    case R.id.special :
                        if (editTextNom.length() != 0){
                            String NomDeMonMonstre = editTextNom.getText().toString();
                            String Element = "Special";
                            continueCreation.putExtra("NomDeMonMonstre",NomDeMonMonstre);
                            continueCreation.putExtra("Element", Element);
                            startActivity(continueCreation);
                        }
                        break;
                    case R.id.terre :
                        if (editTextNom.length() != 0){
                            String NomDeMonMonstre = editTextNom.getText().toString();
                            String Element = "Terre";
                            continueCreation.putExtra("NomDeMonMonstre",NomDeMonMonstre);
                            continueCreation.putExtra("Element", Element);
                            startActivity(continueCreation);
                        }
                        break;



                }
            }




        }





    }

