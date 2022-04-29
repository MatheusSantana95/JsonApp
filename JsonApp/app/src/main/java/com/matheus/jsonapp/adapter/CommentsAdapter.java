package com.matheus.jsonapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.matheus.jsonapp.R;
import com.matheus.jsonapp.model.Comments;

import java.util.List;

public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.ViewHolder>{

private List<Comments> commentsList;

public CommentsAdapter(List<Comments> commentsList) {
        this.commentsList = commentsList;
        }

@NonNull
@Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
        }

@Override
public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvName.setText(commentsList.get(position).getName());
        holder.tvEmail.setText(commentsList.get(position).getEmail());
        holder.tvBody1.setText(commentsList.get(position).getBody());
        }

@Override
public int getItemCount() {
        return commentsList.size();
        }

public class ViewHolder extends RecyclerView.ViewHolder{

    TextView tvName;
    TextView tvEmail;
    TextView tvBody1;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.tvName);
        tvEmail = itemView.findViewById(R.id.tvEmail);
        tvBody1 = itemView.findViewById(R.id.tvBody1);
    }
}
}
