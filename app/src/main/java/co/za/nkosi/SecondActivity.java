package co.za.nkosi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.example.nkosi.R;

public class SecondActivity extends AppCompatActivity {

    TextView txtDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        super.setSupportActionBar(toolbar);
        txtDescription = findViewById(R.id.txtDescription);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.overflow,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();


        if (itemId == R.id.action_option1) {
            txtDescription.setText("This is the second interface.");
            return true;
        } else if (itemId == R.id.action_option2) {
            txtDescription.setText("C`est la deuxieme interface");
            return true;
        } else if (itemId == R.id.action_option3) {
            txtDescription.setText("Esta es la segunda interfaz.");
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}