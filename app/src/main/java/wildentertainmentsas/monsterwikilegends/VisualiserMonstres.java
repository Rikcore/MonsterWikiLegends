package wildentertainmentsas.monsterwikilegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VisualiserMonstres extends AppCompatActivity {

    Button retour;
    TextView textview2;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualiser_monstres);
        textview2 = (TextView) findViewById(R.id.textView2);
        Intent godetails = getIntent();
        Monstres obj = (Monstres) godetails.getParcelableExtra("obj");


        textview2.setText(obj.getName());




        retour = (Button) findViewById(R.id.retour);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VisualiserMonstres.this, Accueil.class));
            }
        });
    }
}
