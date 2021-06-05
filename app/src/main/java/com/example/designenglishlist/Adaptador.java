package com.example.designenglishlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {
    private Context mContext;
    private List<Frutas> mData;

    public Adaptador(Context mContext, List<Frutas> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        View view  = mInflater.inflate(R.cardview_listas, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        holder.nomefruta.setText(mData.get(position).getName());
        holder.imgfruta.setImageResource(mData.get(position).getMiniatura());
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nomefruta;
            ImageView imgfruta;
            CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
