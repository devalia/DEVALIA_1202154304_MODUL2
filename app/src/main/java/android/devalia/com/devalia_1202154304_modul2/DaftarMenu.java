package android.devalia.com.devalia_1202154304_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

public class DaftarMenu extends RecyclerView.Adapter<DaftarMenu.MenuViewHolder>{

    private final LinkedList<String> mFoodList;
    private final LinkedList<Integer> mPriceList;
    private final LinkedList<Integer> mPhotoList;
    private LayoutInflater mInflater;

    public DaftarMenu(Context context, LinkedList<String> foodList, LinkedList<Integer> priceList, LinkedList<Integer> photoList) {
        mInflater = LayoutInflater.from(context);
        this.mFoodList = foodList;
        this.mPriceList = priceList;
        this.mPhotoList = photoList;
    }
    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.daftar_menu, parent, false);
        return new MenuViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        String mCurrentFood = mFoodList.get(position);
        Integer mCurrentPrice = mPriceList.get(position);
        Integer mCurrentPhoto = mPhotoList.get(position);
        holder.foodItemView.setText(mCurrentFood);
        holder.priceItemView.setText("Rp."+mCurrentPrice.toString());
        holder.photoItemView.setImageResource(mCurrentPhoto);
    }

    @Override
    public int getItemCount() {
        return mFoodList.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView foodItemView;
        public final TextView priceItemView;
        public final ImageView photoItemView;

        final MenuAdapter mAdapter;
        public MenuViewHolder(final View itemView, MenuAdapter adapter) {
            super(itemView);
            foodItemView = (TextView)itemView.findViewById(R.id.detail_food);
            priceItemView = (TextView)itemView.findViewById(R.id.detail_harga);
            photoItemView = (ImageView)itemView.findViewById(R.id.detail_gambar);
            photoItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int mPosition = getLayoutPosition();

                    String food = mFoodList.get(mPosition);
                    Integer price = mPriceList.get(mPosition);
                    Integer photo = mPhotoList.get(mPosition);
                    Intent intent = new Intent(itemView.getContext(),Detail.class);
                    intent.putExtra("food",food);
                    intent.putExtra("price",price);
                    intent.putExtra("photo",photo);
                    itemView.getContext().startActivity(intent);
                }
            });
            this.mAdapter = adapter;
        }

        @Override
        public void onClick(View view) {
        }
    }
}



