package com.example.pizza_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner list;
    String data[]={"Rohit","Dhawan","Virat","Rahul","MS DHONI","Kedar","Hardik","Jadeja","Kuldeep","Bumrah"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(Spinner) findViewById(R.id.list);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,
                android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);
        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // TextView txt=(TextView)view;
                //Toast.makeText(MainActivity.this, txt.getText(),Toast.LENGTH_SHORT).show();

                switch (position)
                {
                    case 0:
                        Toast.makeText(MainActivity.this, "first",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Second",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Third",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Four",
                                Toast.LENGTH_SHORT).show();
                    case 4:
                        Toast.makeText(MainActivity.this, "Five",
                                Toast.LENGTH_SHORT).show();
                    case 5:
                        Toast.makeText(MainActivity.this, "Six",
                                Toast.LENGTH_SHORT).show();
                    case 6:
                        Toast.makeText(MainActivity.this, "Seven",
                                Toast.LENGTH_SHORT).show();
                    case 7:
                        Toast.makeText(MainActivity.this, "Eight",
                                Toast.LENGTH_SHORT).show();
                    case 8:
                        Toast.makeText(MainActivity.this, "Nine",
                                Toast.LENGTH_SHORT).show();
                    case 9:
                        Toast.makeText(MainActivity.this, "Ten",
                                Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//               // TextView txt=(TextView)view;
//                //Toast.makeText(MainActivity.this, txt.getText(),Toast.LENGTH_SHORT).show();
//            switch (position)
//            {
//                case 0:
//                    Toast.makeText(MainActivity.this, "First",
//                            Toast.LENGTH_SHORT).show();
//                    break;
//                case 1:
//                    Toast.makeText(MainActivity.this, "Second",
//                            Toast.LENGTH_SHORT).show();
//                    break;
//                case 2:
//                    Toast.makeText(MainActivity.this, "Third",
//                            Toast.LENGTH_SHORT).show();
//                    break;
//            }
//            }
//        });
    }
}






