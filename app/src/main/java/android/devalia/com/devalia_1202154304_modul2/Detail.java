package android.devalia.com.devalia_1202154304_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {


    TextView detail_food, detail_harga;
    ImageView detail_photos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent(); // mengambil data dari activity sebeleumnya
        String makanan = intent.getStringExtra("makanan");
        Integer harga = intent.getIntExtra("harga",0);
        Integer photos = intent.getIntExtra("photos",0);

        Log.d("getIntExtra", ""+harga+photos);

        detail_food = (TextView)findViewById(R.id.detail_food);
        detail_harga = (TextView)findViewById(R.id.detail_harga);
        detail_photos = (ImageView)findViewById(R.id.detail_gambar);

        detail_food.setText(makanan);
        detail_harga.setText("Rp "+harga);
        detail_photos.setImageResource(photos);
    }
}
