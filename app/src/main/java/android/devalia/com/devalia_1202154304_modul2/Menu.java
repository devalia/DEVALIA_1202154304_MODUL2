package android.devalia.com.devalia_1202154304_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> makanan = new LinkedList<>();
    private final LinkedList<Integer> harga = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;

    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        iniData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, makanan, harga, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void iniData() {
        for (int i = 0; i < 3; i++) {
            // memberi & memanggil nama untuk data yang akan ditampilkan
            makanan.add("Spaghetti Aglio oLIO");
            makanan.add("Chicken Grilled Rosemary");
            makanan.add("Chicken Steak");
            makanan.add("Deep Fried Calamary");
            makanan.add("Mushroom Soup");
            makanan.add("Tenderloin Steak");
            makanan.add("Chicken Rice Bowl");
            makanan.add("Chamomile Tea");
            makanan.add("Fruit Punch");
            makanan.add("Orange Juice");
            makanan.add("Mineral Water");
            makanan.add("Strawberry Milkshake");


            // mamanggil harga
            harga.add(35000);
            harga.add(50000);
            harga.add(45000);
            harga.add(30000);
            harga.add(25000);
            harga.add(75000);
            harga.add(35000);
            harga.add(13000);
            harga.add(15000);
            harga.add(15000);
            harga.add(8000);
            harga.add(15000);

            photos.add(R.drawable.aglioolio);
            photos.add(R.drawable.chickenrosemary);
            photos.add(R.drawable.chickensteak);
            photos.add(R.drawable.deepfriedcalamary);
            photos.add(R.drawable.mushroomsoup);
            photos.add(R.drawable.tenderloinsteak);
            photos.add(R.drawable.ricebowlchicken);
            photos.add(R.drawable.chamomiletea);
            photos.add(R.drawable.fruitpunch);
            photos.add(R.drawable.orangejuice);
            photos.add(R.drawable.mineralwater);
            photos.add(R.drawable.strawberrymilkshake);

        }
    }
}
