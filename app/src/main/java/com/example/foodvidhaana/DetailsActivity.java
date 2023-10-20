package com.example.foodvidhaana;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {

    public static final String FRAGMENT_CLASS = "fragment_class";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#000000")); // Add "#" symbol here
        actionBar.setBackgroundDrawable(colorDrawable);

        // Retrieve the fragment class name from the intent extras
        String fragmentClassName = getIntent().getStringExtra(FRAGMENT_CLASS);

        // Use the fragment class name to dynamically display the fragment
        if (fragmentClassName != null)
        {
            try
            {
                Class<? extends Fragment> fragmentClass = (Class<? extends Fragment>) Class.forName(fragmentClassName);
                Fragment fragment = fragmentClass.newInstance();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.containerBox, fragment)
                        .commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}