package com.hp.realtimedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
Button btn;

    FirebaseDatabase database;
    DatabaseReference reference;//reference is like a category like i myntra app women and men department
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button2);//id is button2 coz firebase has its own button whose id is button
database=FirebaseDatabase.getInstance();
        reference=database.getReference("message");//consider reference as table name
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="Welcome ";
                reference.setValue(msg);
                Toast.makeText(MainActivity.this, "Data saved.....", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
