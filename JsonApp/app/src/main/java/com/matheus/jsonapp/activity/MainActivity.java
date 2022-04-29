package com.matheus.jsonapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.matheus.jsonapp.R;

public class MainActivity extends AppCompatActivity {

    Button buttonPosts, buttonComments, buttonAlbums, buttonPhotos, buttonTodos, buttonSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPosts = findViewById(R.id.btnPosts);
        buttonComments = findViewById(R.id.btnComments);
        buttonAlbums = findViewById(R.id.btnAlbums);
        buttonPhotos = findViewById(R.id.btnPhotos);
        buttonTodos = findViewById(R.id.btnTodos);
        buttonSair = findViewById(R.id.btnSair);

        buttonPosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent postsActivity = new Intent(getApplicationContext(), PostsActivity.class);
                startActivity(postsActivity);
            }
        });

        buttonComments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent commentsActivity = new Intent(getApplicationContext(), CommentsActivity.class);
                startActivity(commentsActivity);
            }
        });

        buttonAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsActivity = new Intent(getApplicationContext(), AlbumsActivity.class);
                startActivity(albumsActivity);
            }
        });

        buttonPhotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent photosActivity = new Intent(getApplicationContext(), PhotosActivity.class);
                startActivity(photosActivity);
            }
        });

        buttonTodos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent todosActivity = new Intent(getApplicationContext(), TodosActivity.class);
                startActivity(todosActivity);
            }
        });

        buttonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}