package com.example.sessionlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    Button btn;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.userid);
        editText2=findViewById(R.id.password);
        btn=findViewById(R.id.saveDataBtn);
        sharedPreferences=getSharedPreferences("Mypreference",MODE_PRIVATE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1.getText().toString().equals("") || editText2.getText().toString().equals(""))

                {
                    Toast.makeText(MainActivity.this,"hello",Toast.LENGTH_LONG).show();
                }
                else {
                    DoLogin(editText1.getText().toString(),editText2.getText().toString());
                }
            }
        });
    }
    private void DoLogin(String name,String password) {
        if (password.equals("123")) {
            editor = sharedPreferences.edit(







                    
            );
            editor.putString("name", name);
            editor.commit();
            Toast.makeText(this,"DATA added",Toast.LENGTH_LONG).show();
        } else
        {
            Toast.makeText(this,"Password doesnot match",Toast.LENGTH_LONG).show();
        }
    }
}