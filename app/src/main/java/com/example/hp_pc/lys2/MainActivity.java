package com.example.hp_pc.lys2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout pnl, pnl2;
    LinearLayout.LayoutParams prm, prm2;
    CheckBox chk;
    EditText et;
    Button btn;
    TextView tv;
    String [] dersler = {"Türkçe", "Sosyal", "Matematik", "Fen", "Edebiyat"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listeYap();
        //viewEkle();
        setContentView(pnl);
    }

    private void listeYap() {

        pnl = new LinearLayout(this);
        pnl.setBackgroundColor(Color.LTGRAY);
        pnl.setOrientation(LinearLayout.VERTICAL);
        prm = new LinearLayout.LayoutParams(200, 80);
        et = new EditText(this);
        btn = new Button(this);
        btn.setText("Ekle");
        et.setHint("Listeye Ekle");
        pnl.addView(et);
        pnl.addView(btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pnl2 = new LinearLayout(MainActivity.this);
                pnl2.setOrientation(LinearLayout.HORIZONTAL);
                prm2 = new LinearLayout.LayoutParams(200, 80);
                tv = new TextView(MainActivity.this);
                tv.setTextSize(18);
                tv.setText(et.getText().toString());
                chk = new CheckBox(MainActivity.this);
                et.setText("");
                pnl.addView(pnl2);
                pnl2.addView(chk);
                pnl2.addView(tv);

            }
        });

        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    
                } else {

                }
            }
        });




    }



    private void viewEkle() {

        pnl = new LinearLayout(this);
        pnl.setBackgroundColor(Color.CYAN);
        pnl.setOrientation(LinearLayout.VERTICAL);
        prm = new LinearLayout.LayoutParams(200, 80);


        for (int i=0; i<dersler.length; i++) {


                et = new EditText(this);
                et.setHint(dersler[i] + " netini gir");
                btn = new Button(this);
                btn.setText("Button");
                pnl.addView(et);
                pnl.addView(btn);




        }



    }
}
