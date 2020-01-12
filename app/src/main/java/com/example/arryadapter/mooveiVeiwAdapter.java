package com.example.arryadapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class mooveiVeiwAdapter extends RecyclerView.Adapter <mooveiVeiwAdapter.VeiwHolder> {

    @NonNull
    @Override
    public VeiwHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.itemmoovi,parent,false);
        return new VeiwHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VeiwHolder holder, int position) {
        holder.onbindSet(mydata.get(position));


    }

    @Override
    public int getItemCount() {
        return mydata.size();
    }

    private LayoutInflater inflater;
    private ArrayList<dataMoovei> mydata;

    public mooveiVeiwAdapter (Context context, ArrayList<dataMoovei> data){
        mydata=data;
        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    public static class VeiwHolder extends RecyclerView.ViewHolder{

        public ImageView imeg;
        public TextView titel;
        public TextView text;

        public VeiwHolder(@NonNull View view) {
            super(view);
            imeg = view.findViewById(R.id.ImageView);
            titel = view.findViewById(R.id.TextViewTitel);
            text = view.findViewById(R.id.TextViewText);
        }

        public void onbindSet (dataMoovei moovei){
            imeg.setImageResource(moovei.getImeg());
            titel.setText(moovei.getTitel());
            text.setText(moovei.getText());
        }
    }
}
