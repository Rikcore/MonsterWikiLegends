package wildentertainmentsas.monsterwikilegends;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.SeekBar;


import static android.R.attr.breadCrumbShortTitle;
import static android.R.attr.name;
import static wildentertainmentsas.monsterwikilegends.R.id.image;
import static wildentertainmentsas.monsterwikilegends.R.id.imageView;
import static wildentertainmentsas.monsterwikilegends.R.id.seekBarPower;
import static wildentertainmentsas.monsterwikilegends.R.id.seekBarSpeed;


public class Creation2 extends AppCompatActivity {

    TextView textView;



    TextView editTextLife ;
    EditText editTextStamina;
    EditText editTextPower;
    EditText editTextSpeed;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation2);

        Typeface Chantelli = Typeface.createFromAsset(getAssets(),"fonts/Chantelli_Antiqua.ttf");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setTypeface(Chantelli);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        /*final EditText editTextLife = (EditText) findViewById(R.id.editTextLife);
        final EditText editTextStamina = (EditText) findViewById(R.id.editTextStamina);
        final EditText editTextPower = (EditText) findViewById(R.id.editTextPower);
        final EditText editTextSpeed = (EditText) findViewById(R.id.editTextSpeed); */
        Button valider = (Button) findViewById(R.id.valider);
        valider.setTypeface(Chantelli);

        final SeekBar seekBarLife = (SeekBar)findViewById(R.id.seekBarLife);
        final TextView seekBarValue1 = (TextView)findViewById(R.id.editTextLife);

        final SeekBar seekBarStamina = (SeekBar)findViewById(R.id.seekBarStamina);
        final TextView seekBarValue2 = (TextView)findViewById(R.id.editTextStamina);

        final SeekBar seekBarPower = (SeekBar)findViewById(R.id.seekBarPower);
        final TextView seekBarValue3 = (TextView)findViewById(R.id.editTextPower);

        final SeekBar seekBarSpeed = (SeekBar)findViewById(R.id.seekBarSpeed);
        final TextView seekBarValue4 = (TextView)findViewById(R.id.editTextSpeed);


        seekBarLife.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

                                                   @Override
                                                   public void onProgressChanged(SeekBar seekBar, int progress,
                                                                                 boolean fromUser) {
                                                       // TODO Auto-generated method stub
                                                       seekBarValue1.setText(String.valueOf(progress));
                                                   }

                                                   @Override
                                                   public void onStartTrackingTouch(SeekBar seekBar) {

                                                   }

                                                   @Override
                                                   public void onStopTrackingTouch(SeekBar seekBar) {

                                                   }
                                               });

        seekBarStamina.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue2.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarPower.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue3.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarSpeed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue4.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Intent continueCreation = getIntent();
        final String name = continueCreation.getStringExtra("name");
        final String element = continueCreation.getStringExtra("element");
        final Intent versBestiaireTotal = new Intent(Creation2.this, Bestiaire.class);

        textView.setText(getString(R.string.determine)+" "+ name);

        int oeufElement = continueCreation.getIntExtra("oeufElement", 0);

        switch (oeufElement){
            case 1:
                imageView.setImageResource(R.drawable.thunder_eagle_0);
                break;
            case 2:
                imageView.setImageResource(R.drawable.firesaur_0);
                break;
            case 3:
                imageView.setImageResource(R.drawable.turtle_0);
                break;
            case 4:
                imageView.setImageResource(R.drawable.genie_0);
                break;
            case 5:
                imageView.setImageResource(R.drawable.light_spirit_0);
                break;
            case 6:
                imageView.setImageResource(R.drawable.metalsaur_0);
                break;
            case 7:
                imageView.setImageResource(R.drawable.treezard_0);
                break;
            case 8:
                imageView.setImageResource(R.drawable.tyrannoking_0);
                break;
            case 9:
                imageView.setImageResource(R.drawable.monster_clutch_0);
                break;
            case 10:
                imageView.setImageResource(R.drawable.rockilla_0);
                break;
        }













       valider.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if ( seekBarValue1.length()== 0 || seekBarValue2.length()==0 || seekBarValue3.length()==0 || seekBarValue4.length()==0){
                    Toast.makeText(Creation2.this, getString(R.string.forcestats),
                            Toast.LENGTH_LONG).show();
                }
                else {
                    String stamina = seekBarValue2.getText().toString();
                    String life = seekBarValue1.getText().toString();
                    String power = seekBarValue3.getText().toString();
                    String speed = seekBarValue4.getText().toString();
                    versBestiaireTotal.putExtra("name", name);
                    versBestiaireTotal.putExtra("element", element);
                    versBestiaireTotal.putExtra("life", life);
                    versBestiaireTotal.putExtra("stamina", stamina);
                    versBestiaireTotal.putExtra("power", power);
                    versBestiaireTotal.putExtra("speed", speed);


                    startActivity(versBestiaireTotal);


                }

            }
        });






        }












    }

