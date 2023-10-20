package com.example.foodvidhaana;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class add_recipe extends AppCompatActivity {
    EditText name, ingri, cook;
    Button insert, update, delete, view;
    DBHelper1 DB1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);
        name = findViewById(R.id.recipe_name);
        ingri = findViewById(R.id.ingridients);
        cook = findViewById(R.id.instructions);
        insert = findViewById(R.id.add);
        update = findViewById(R.id.update);
        delete = findViewById(R.id.delete);
        view = findViewById(R.id.view);
        DB1 = new DBHelper1(this);
        setStatusBarColor(getResources().getColor(R.color.black));
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String ingriTXT = ingri.getText().toString();
                String cookTXT = cook.getText().toString();

                Boolean checkinsertdata = DB1.insertuserdata(nameTXT, ingriTXT, cookTXT);
                if(checkinsertdata==true)
                    Toast.makeText(add_recipe.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(add_recipe.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
            }        });


        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String contactTXT = ingri.getText().toString();
                String dobTXT = cook.getText().toString();

                Boolean checkupdatedata = DB1.updateuserdata(nameTXT, contactTXT, dobTXT);
                if(checkupdatedata==true)
                    Toast.makeText(add_recipe.this, "Entry Updated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(add_recipe.this, "New Entry Not Updated", Toast.LENGTH_SHORT).show();
            }        });


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                Boolean checkudeletedata = DB1.deletedata(nameTXT);
                if(checkudeletedata==true)
                    Toast.makeText(add_recipe.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(add_recipe.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
            }        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB1.getdata();
                if(res.getCount()==0){
                    Toast.makeText(add_recipe.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("NAME :"+res.getString(0)+"\n\n");
                    buffer.append("INGRIDIENTS :"+res.getString(1)+"\n\n");
                    buffer.append("COOKING INSTRUCTIONS :"+res.getString(2)+"\n\n");
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(add_recipe.this);
                builder.setCancelable(true);
                builder.setTitle("RECIPE DETAILS");
                builder.setMessage(buffer.toString());
                builder.show();
            }        });

    }

    private void setStatusBarColor(int color) {
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(color);
        }
    }
}