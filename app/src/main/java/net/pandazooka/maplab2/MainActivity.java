package net.pandazooka.maplab2;

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
            public void onClick(View v) {
                btnUsr.setText(userName.getText());
            }
        });

        btnPwd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                btnPwd.setText(password.getText());
            }
        });

        btnUsrPwd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String UsrPwd = userName.getText() + "-" + password.getText();
                btnUsrPwd.setText(UsrPwd);
            }
        });
    }
}
