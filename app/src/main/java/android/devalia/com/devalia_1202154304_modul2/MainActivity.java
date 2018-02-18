package android.devalia.com.devalia_1202154304_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showOrder(View view) {
        if (((RadioButton)findViewById(R.id.radio_dine)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);
            Toast.makeText(this, "Dine In", Toast.LENGTH_SHORT).show();
            startActivity(intent);

        }else if (((RadioButton)findViewById(R.id.radio_take)).isChecked()){
            Intent intent = new Intent(this, TakeAway.class);
            Toast.makeText(this, "Take Away", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }else{
            Toast.makeText(this,"Harus pilih salah satu",Toast.LENGTH_SHORT).show();
        }

    }
}
