package sg.edu.np.mad.madpratical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView alert = findViewById(R.id.image);

        alert.setOnClickListener(v -> {
            Random number = new Random();
            Integer ns = number.nextInt(999999999);

            AlertDialog.Builder build = new AlertDialog.Builder(ListActivity.this);

            build.setTitle("Profile");
            build.setMessage("MADness");
            build.setPositiveButton("View", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int id){
                    Intent i2 = new Intent(ListActivity.this, MainActivity.class);
                    i2.putExtra("Number", ns);
                    startActivity(i2);
                }
            });
            build.setNegativeButton("Close", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int id){
                }
            });

            build.show();
        });
    }
}

