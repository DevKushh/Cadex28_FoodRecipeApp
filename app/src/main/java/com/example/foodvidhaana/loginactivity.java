package com.example.foodvidhaana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {
    Button in;
    EditText n,p;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        in=findViewById(R.id.log);
        n=findViewById(R.id.name);
        p=findViewById(R.id.pass);
        DB = new DBHelper(this);
        setStatusBarColor(getResources().getColor(R.color.black));
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = n.getText().toString();
                String pass = p.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(loginactivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if(checkuserpass==true){
                        Toast.makeText(loginactivity.this, "Sign in successfull", Toast.LENGTH_SHORT).show();
                        Intent intent  = new Intent(getApplicationContext(), home_page.class);

                        startActivity(intent);
                    }else{
                        Toast.makeText(loginactivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }

    private void setStatusBarColor(int color) {
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(color);
        }
    }
}