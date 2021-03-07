package com.example.table_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private boolean table_lyt = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Table(View view) {
        TableLayout table = findViewById(R.id.table);
        Button btndetail = findViewById(R.id.btndetail);

        table.setColumnCollapsed(1, table_lyt);
        table.setColumnCollapsed(2, table_lyt);

        if (table_lyt) {
            table_lyt = false;
            btndetail.setText("Show Detail");
        }
        else {
            table_lyt = true;
            btndetail.setText("Hide` Detail");
        }
    }
}