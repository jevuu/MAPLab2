package net.pandazooka.maplab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnUsr;
    Button btnPwd;
    Button btnUsrPwd;

    EditText userName;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUsr = (Button)findViewById(R.id.btnUsr);
        btnPwd = (Button)findViewById(R.id.btnPwd);
        btnUsrPwd = (Button)findViewById(R.id.btnUsrPwd);

        userName = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);

        btnUsr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("username", userName.getText().toString());

                startActivity(intent);
            }
        });

        btnPwd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("password", password.getText().toString());

                startActivity(intent);
            }
        });

        btnUsrPwd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("username", userName.getText().toString());
                intent.putExtra("password", password.getText().toString());

                startActivity(intent);
                //String UsrPwd = userName.getText() + "-" + password.getText();
                //btnUsrPwd.setText(UsrPwd);
            }
        });
    }
}
