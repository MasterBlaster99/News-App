package com.example.feednews;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    Context context;
    ArrayList<ModelClass> modelClassArrayList;

    public NewsAdapter(Context context, ArrayList<ModelClass> modelClassArrayList) {
        this.context = context;
        this.modelClassArrayList = modelClassArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.news_item,null,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( NewsAdapter.ViewHolder holder, int position) {


        holder.heading.setText(modelClassArrayList.get(position).getTitle());
        holder.content.setText(modelClassArrayList.get(position).getDescription());
        holder.author.setText(modelClassArrayList.get(position).getAuthor());
        holder.time.setText(modelClassArrayList.get(position).getPublishedAt());
        Glide.with(context).load(modelClassArrayList.get(position).getUrlToImage()).into(holder.imageView);
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,WebView.class);
                intent.putExtra("url",modelClassArrayList.get(position).getUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView heading,content,author,time;
        ImageView imageView;
        ConstraintLayout constraintLayout;

        public ViewHolder( View itemView) {
            super(itemView);
            heading = itemView.findViewById(R.id.titleHead);
            content = itemView.findViewById(R.id.description);
            author = itemView.findViewById(R.id.author);
            imageView = itemView.findViewById(R.id.image);
            time = itemView.findViewById(R.id.time);
            constraintLayout = itemView.findViewById(R.id.conLayout);
        }
    }
}
