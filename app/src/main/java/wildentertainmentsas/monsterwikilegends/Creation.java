package wildentertainmentsas.monsterwikilegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Creation extends AppCompatActivity {

    private

    Button retour;
    Button valider;
    EditText nommer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation);

        retour = (Button) findViewById(R.id.retour);
        valider = (Button) findViewById(R.id.valider);
        nommer = (EditText) findViewById(R.id.edittextnommer);



        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Creation.this, Accueil.class));
            }
        });
    }
}
