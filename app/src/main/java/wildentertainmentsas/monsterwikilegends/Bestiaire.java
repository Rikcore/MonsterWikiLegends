package wildentertainmentsas.monsterwikilegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




public class Bestiaire extends AppCompatActivity {

    Button retour;
    ListView bestiaireListView;
    static List<Monstres> Monstres_list;
    static ArrayAdapter arrayadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestiaire);

        retour = (Button) findViewById(R.id.retour);

        Intent bestiairetotal = getIntent();

        if (Monstres_list== null) {
            Monstres_list = new ArrayList<>();
            this.arrayadapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Monstres_list);
        }


        if (bestiairetotal.hasExtra("name")) {
            final String name = bestiairetotal.getStringExtra("name");
            final String element = bestiairetotal.getStringExtra("element");
            final String life = bestiairetotal.getStringExtra("life");
            final String stamina = bestiairetotal.getStringExtra("stamina");
            final String power = bestiairetotal.getStringExtra("power");
            final String speed = bestiairetotal.getStringExtra("speed");


            Monstres test = new Monstres(name, element, life, stamina, power, speed);

            this.arrayadapter.add(test);


                }

        bestiaireListView = (ListView) findViewById(R.id.bestiaireListView);
        this.bestiaireListView.setAdapter(this.arrayadapter);

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        bestiaireListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Monstres obj = (Monstres) arrayadapter.getItem(position);

                Intent godetails = new Intent(Bestiaire.this, VisualiserMonstres.class);
                godetails.putExtra("obj",obj);
                startActivity(godetails);






            }
        });

        }





    @Override
    protected void onResume(){
        super.onResume();
        this.arrayadapter.notifyDataSetChanged();
    }

}





