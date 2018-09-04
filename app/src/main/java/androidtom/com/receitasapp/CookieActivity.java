package androidtom.com.receitasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CookieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
