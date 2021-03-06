package wildentertainmentsas.monsterwikilegends;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Accueil extends AppCompatActivity {

    Button creer;
    Button liste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        creer = (Button) findViewById(R.id.creer);
        liste = (Button) findViewById(R.id.liste);

        Typeface Chantelli = Typeface.createFromAsset(getAssets(),"fonts/Chantelli_Antiqua.ttf");
        creer.setTypeface(Chantelli);
        liste.setTypeface(Chantelli);





        creer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Accueil.this, Creation.class));

            }
        });



        liste.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Accueil.this, Bestiaire.class));

            }
        });
    }
}
