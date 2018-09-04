package androidtom.com.receitasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button_bolo;
    private Button button_cookie;
    private Button button_torta;
    private Button button_sorvete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_bolo = (Button)findViewById(R.id.button_bolo);
        button_bolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BoloActivity.class);
                startActivity(intent);

            }
        });

        button_cookie = (Button)findViewById(R.id.button_cookie);
        button_cookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CookieActivity.class);
                startActivity(intent);
            }
        });

        button_torta = (Button)findViewById(R.id.button_torta);
        button_torta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TortaActivity.class);
                startActivity(intent);
            }
        });

        button_sorvete = (Button)findViewById(R.id.button_sorvete);
        button_sorvete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SorveteActivity.class);
                startActivity(intent);
            }
        });
    }

}
