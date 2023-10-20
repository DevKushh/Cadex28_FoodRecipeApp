package com.example.foodvidhaana;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomepageActivity extends AppCompatActivity {

    ImageButton biryaniimgbtn, kebabimgbtn, alooparathaimgbtn, matarpaneerimgbtn, gulabjamoonimgbtn, chowmeinimgbtn, dumplingsimgbtn, mapotofuimgbtn, pineapplebunimgbtn, szechuanchickenimgbtn, cevicheimgbtn, guacamoleimgbtn, quesadillasimgbtn,
            salsaimgbtn, tacosimgbtn, lasagnaimgbtn, ossobucoimgbtn, pastaimgbtn, pizzaimgbtn, trufflesimgbtn, cassouletimgbtn, crepesimgbtn, croissantimgbtn, escargotimgbtn, ratatouilleimgbtn;
    Button tbiryanibtn, tpizzabtn, ttrufflesbtn, tcrepesbtn, tkebabbtn;

    @SuppressLint({"WrongViewCast", "MissingInflatedId", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#000000"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);

        biryaniimgbtn = findViewById(R.id.biryaniImgBtn);
        kebabimgbtn = findViewById(R.id.kebabImgBtn);
        alooparathaimgbtn = findViewById(R.id.alooparathaImgBtn);
        matarpaneerimgbtn = findViewById(R.id.matarpaneerImgBtn);
        gulabjamoonimgbtn = findViewById(R.id.gulabjamoonImgBtn);
        chowmeinimgbtn = findViewById(R.id.chowmeinImgBtn);
        dumplingsimgbtn = findViewById(R.id.dumplingsImgBtn);
        mapotofuimgbtn = findViewById(R.id.mapotofuImgBtn);
        pineapplebunimgbtn = findViewById(R.id.pineapplebunImgBtn);
        szechuanchickenimgbtn = findViewById(R.id.szechuanchickenImgBtn);
        cevicheimgbtn = findViewById(R.id.cevicheImgBtn);
        guacamoleimgbtn = findViewById(R.id.guacamoleImgBtn);
        quesadillasimgbtn = findViewById(R.id.quesadillasImgBtn);
        salsaimgbtn = findViewById(R.id.salsaImgBtn);
        tacosimgbtn = findViewById(R.id.tacosImgBtn);
        lasagnaimgbtn = findViewById(R.id.lasagnaImgBtn);
        ossobucoimgbtn = findViewById(R.id.ossobucoImgBtn);
        pastaimgbtn = findViewById(R.id.pastaImgBtn);
        pizzaimgbtn = findViewById(R.id.pizzaImgBtn);
        trufflesimgbtn = findViewById(R.id.trufflesImgBtn);
        cassouletimgbtn = findViewById(R.id.cassouletImgBtn);
        crepesimgbtn = findViewById(R.id.crepesImgBtn);
        croissantimgbtn = findViewById(R.id.croissantImgBtn);
        escargotimgbtn = findViewById(R.id.escargotImgBtn);
        ratatouilleimgbtn = findViewById(R.id.ratatouilleImgBtn);
        tbiryanibtn = findViewById(R.id.TBiryaniBtn);
        tpizzabtn = findViewById(R.id.TPizzaBtn);
        ttrufflesbtn = findViewById(R.id.TTrufflesBtn);
        tcrepesbtn = findViewById(R.id.TCrepesBtn);
        tkebabbtn = findViewById(R.id.TKababBtn);

        biryaniimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(BiryaniFragment.class);
            }
        });
        kebabimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(KebabFragment.class);
            }
        });
        alooparathaimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(AlooparathaFragment.class);
            }
        });
        matarpaneerimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(MatarpaneerFragment.class);
            }
        });
        gulabjamoonimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(GulabjamoonFragment.class);
            }
        });
        chowmeinimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(ChowmeinFragment.class);
            }
        });
        dumplingsimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(DumplingsFragment.class);
            }
        });
        mapotofuimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(MapotofuFragment.class);
            }
        });
        pineapplebunimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(PineapplebunFragment.class);
            }
        });
        szechuanchickenimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(SzechuanchickenFragment.class);
            }
        });
        cevicheimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(CevicheFragment.class);
            }
        });
        guacamoleimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(GuacamoleFragment.class);
            }
        });
        quesadillasimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(QuesadillasFragment.class);
            }
        });
        salsaimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(SalsaFragment.class);
            }
        });
        tacosimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(TacosFragment.class);
            }
        });
        lasagnaimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(LasagnaFragment.class);
            }
        });
        ossobucoimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(OssobucoFragment.class);
            }
        });
        pastaimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(PastaFragment.class);
            }
        });
        pizzaimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(PizzaFragment.class);
            }
        });
        trufflesimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(TrufflesFragment.class);
            }
        });
        cassouletimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(CassouletFragment.class);
            }
        });
        crepesimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(CrepesFragment.class);
            }
        });
        croissantimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(CroissantFragment.class);
            }
        });
        escargotimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(EscargotFragment.class);
            }
        });
        ratatouilleimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(RatatouilleFragment.class);
            }
        });
        tbiryanibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(BiryaniFragment.class);
            }
        });
        tpizzabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(PizzaFragment.class);
            }
        });
        ttrufflesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(TrufflesFragment.class);
            }
        });
        tcrepesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(CrepesFragment.class);
            }
        });
        tkebabbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDetailsActivity(KebabFragment.class);
            }
        });
    }
    private void launchDetailsActivity(Class<? extends Fragment> fragmentClass) {
        Intent intentfragment = new Intent(HomepageActivity.this, DetailsActivity.class);
        intentfragment.putExtra(DetailsActivity.FRAGMENT_CLASS, fragmentClass.getName());
        startActivity(intentfragment);
    }

}