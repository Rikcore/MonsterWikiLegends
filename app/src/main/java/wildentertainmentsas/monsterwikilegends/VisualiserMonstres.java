package wildentertainmentsas.monsterwikilegends;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

import static wildentertainmentsas.monsterwikilegends.R.string.Eau;
import static wildentertainmentsas.monsterwikilegends.R.string.Firesaur;
import static wildentertainmentsas.monsterwikilegends.R.string.Foudre;
import static wildentertainmentsas.monsterwikilegends.R.string.Genie;
import static wildentertainmentsas.monsterwikilegends.R.string.Lumiere;
import static wildentertainmentsas.monsterwikilegends.R.string.Metal;
import static wildentertainmentsas.monsterwikilegends.R.string.Mort;
import static wildentertainmentsas.monsterwikilegends.R.string.Nature;
import static wildentertainmentsas.monsterwikilegends.R.string.Special;
import static wildentertainmentsas.monsterwikilegends.R.string.Terre;
import static wildentertainmentsas.monsterwikilegends.R.string.element;

public class VisualiserMonstres extends AppCompatActivity {

    Button retour;
    ImageView imageViewMonster;
    ImageView imageViewElement;
    TextView textViewNomOriginal;
    TextView textViewLife;
    TextView textViewStamina;
    TextView textViewPower;
    TextView textViewSpeed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualiser_monstres);
        ImageView imageViewMonster = (ImageView)findViewById(R.id.imageViewMonster);
        ImageView imageViewElement = (ImageView)findViewById(R.id.imageViewElement);
        TextView textViewNomOriginal = (TextView) findViewById(R.id.textViewNomOriginal);
        TextView textViewLife = (TextView) findViewById(R.id.textViewLife);
        TextView textViewStamina = (TextView) findViewById(R.id.textViewStamina);
        TextView textViewPower = (TextView) findViewById(R.id.textViewPower);
        TextView textViewSpeed = (TextView)findViewById(R.id.textViewSpeed);
        RelativeLayout layout =(RelativeLayout)findViewById(R.id.activity_visualiser_monstres);

        Intent godetails = getIntent();
        Monstres obj = godetails.getParcelableExtra("obj");

        setTitle(obj.getName());
        if (obj.getElement().equals("Feu")) {
            imageViewMonster.setImageResource(R.drawable.firesaur_1_burned);
            imageViewElement.setImageResource(R.drawable.feu);
            textViewNomOriginal.setText(getString(Firesaur));
            layout.setBackgroundResource(R.drawable.backgroundfire);


        }
        if (obj.getElement().equals("Magie")){
            imageViewMonster.setImageResource(R.drawable.genie_1_burned);
            imageViewElement.setImageResource(R.drawable.magie);
            textViewNomOriginal.setText(getString(Genie));
            layout.setBackgroundResource(R.drawable.backgroundmagie);
        }
        if (obj.getElement().equals("Lumiere")){
            imageViewMonster.setImageResource(R.drawable.light_spirit_1_burned);
            imageViewElement.setImageResource(R.drawable.lumiere);
            textViewNomOriginal.setText(getString(Lumiere));
            layout.setBackgroundResource(R.drawable.backgroundlumiere);
        }
        if (obj.getElement().equals("Eau")){
            imageViewMonster.setImageResource(R.drawable.mersnake_1_burned);
            imageViewElement.setImageResource(R.drawable.eau);
            textViewNomOriginal.setText(getString(Eau));
            layout.setBackgroundResource(R.drawable.backgroundwater);
        }
        if (obj.getElement().equals("Nature")){
            imageViewMonster.setImageResource(R.drawable.treezard_1_burned);
            imageViewElement.setImageResource(R.drawable.nature);
            textViewNomOriginal.setText(getString(Nature));
            layout.setBackgroundResource(R.drawable.backgroundnature);
        }
        if (obj.getElement().equals("Mort")){
            imageViewMonster.setImageResource(R.drawable.tyrannoking_1_burned);
            imageViewElement.setImageResource(R.drawable.mort);
            textViewNomOriginal.setText(getString(Mort));
            layout.setBackgroundResource(R.drawable.backgroundmort);
            textViewNomOriginal.setTextColor(Color.parseColor("#EFEDE5"));
        }
        if (obj.getElement().equals("Terre")){
            imageViewMonster.setImageResource(R.drawable.rockilla_1_burned);
            imageViewElement.setImageResource(R.drawable.terre);
            textViewNomOriginal.setText(getString(Terre));
            layout.setBackgroundResource(R.drawable.backgroundterre);
        }
        if (obj.getElement().equals("Foudre")){
            imageViewMonster.setImageResource(R.drawable.thunder_eagle_1_burned);
            imageViewElement.setImageResource(R.drawable.foudre);
            textViewNomOriginal.setText(getString(Foudre));
            layout.setBackgroundResource(R.drawable.backgroundthunder);
            textViewNomOriginal.setTextColor(Color.parseColor("#ECD330"));
        }
        if (obj.getElement().equals("Special")){
            imageViewMonster.setImageResource(R.drawable.monster_clutch_1_burned);
            imageViewElement.setImageResource(R.drawable.special);
            textViewNomOriginal.setText(getString(Special));
            layout.setBackgroundResource(R.drawable.backgroundspecial);
        }
        if (obj.getElement().equals("Metal")){
            imageViewMonster.setImageResource(R.drawable.metalsaur_1_burned);
            imageViewElement.setImageResource(R.drawable.metal);
            textViewNomOriginal.setText(getString(Metal));
            layout.setBackgroundResource(R.drawable.backgroundmetal);
        }



        textViewLife.setText(obj.getLife());
        textViewStamina.setText(obj.getStamina());
        textViewPower.setText(obj.getPower());
        textViewSpeed.setText(obj.getSpeed());












        retour = (Button) findViewById(R.id.retour);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
