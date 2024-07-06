package com.example.wallo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wallo.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import retrofit2.http.POST;


public class HorizontalAdapter2 extends RecyclerView.Adapter<HorizontalAdapter2.rowHolder> {

    Context context;
    ArrayList<String> txthHorizontalist=new ArrayList<>();
    ArrayList<String> imgHorizontalist=new ArrayList<>();

    public HorizontalAdapter2(Context context, ArrayList<String> txthHorizontalist, ArrayList<String> imgHorizontalist) {
        this.context = context;
        this.txthHorizontalist = txthHorizontalist;
        this.imgHorizontalist = imgHorizontalist;
    }

    @NonNull
    @Override
    public HorizontalAdapter2.rowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view= layoutInflater.inflate(R.layout.recycler_row_horizontal_2,parent,false);
        return new HorizontalAdapter2.rowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalAdapter2.rowHolder holder, int position) {
        Picasso.get().load(imgHorizontalist.get(position)).into(holder.imghorizontal);
        holder.txthorizontal.setText(txthHorizontalist.get(position));

        holder.imghorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "fotoya tıklıyon ameke   :"+imgHorizontalist.get(position), Toast.LENGTH_LONG).show();

            }
        });
        holder.txthorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "fotoya tıklıyon ameke   :"+imgHorizontalist.get(position), Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return imgHorizontalist.size();
    }

    public class rowHolder extends RecyclerView.ViewHolder {
        ImageView imghorizontal;
        TextView txthorizontal;
        public rowHolder(@NonNull View itemView) {
            super(itemView);
            imghorizontal=itemView.findViewById(R.id.imghorizontal);
            txthorizontal=itemView.findViewById(R.id.txthorizontal);
        }
    }
}
