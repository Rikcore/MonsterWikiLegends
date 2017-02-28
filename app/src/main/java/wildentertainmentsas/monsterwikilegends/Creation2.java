package wildentertainmentsas.monsterwikilegends;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import static wildentertainmentsas.monsterwikilegends.R.drawable.fire_lion_0;

public class Creation2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation2);
        Intent continueCreation = getIntent();
        String NomDeMonMonstre = continueCreation.getStringExtra("NomDeMonMponstre");
        String Element = continueCreation.getStringExtra("Element");

        if (Element.equals("Feu")){

        }

    }
}
