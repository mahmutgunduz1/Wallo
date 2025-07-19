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

import de.hdodenhof.circleimageview.CircleImageView;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.rowHolder>  {

    Context context;
    ArrayList<String> name=new ArrayList<>();
    ArrayList<String> urlla=new ArrayList<>();


    public HorizontalAdapter(Context context, ArrayList<String> name, ArrayList<String> urlla) {
        this.context = context;
        this.name = name;
        this.urlla = urlla;
    }

    @NonNull
    @Override
    public rowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_row_horizontal, parent, false);
        return new HorizontalAdapter.rowHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull rowHolder holder, int position) {
     Picasso.get().load(urlla.get(position)).into(holder.photo);
     holder.profil.setText(name.get(position));
     holder.profil.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Toast.makeText(context, "fotoya tıklıyon ameke   :"+name.get(position), Toast.LENGTH_LONG).show();

         }
     });

    }

    @Override
    public int getItemCount() {
        return urlla.size();
    }

    public static class rowHolder extends RecyclerView.ViewHolder {

        CircleImageView photo;
        TextView profil;
        public rowHolder(@NonNull View itemView) {
            super(itemView);

            photo=itemView.findViewById(R.id.photo);
            profil=itemView.findViewById(R.id.profil);
        }
    }
}
