package net.pandazooka.maplab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView    txtDisplay;
    Button      btnHome;
    String      strDisplay = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
        if (intent.hasExtra("username")){
            strDisplay = "Username is " + intent.getStringExtra("username");
        }
        if (intent.hasExtra("password")){
            if(strDisplay != "")
                strDisplay = strDisplay + "\n";
            strDisplay = strDisplay + "Password is " + intent.getStringExtra("password");
        }

        txtDisplay = (TextView)findViewById(R.id.txtDisplay);
        btnHome = (Button)findViewById(R.id.btnHome);

        txtDisplay.setText(strDisplay);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            finish();
            }
        });
    }
}
