package com.example.adriel.gerenceapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class ProjectsListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    public ItemProjectsAdapter adapter;
    public ArrayList<Projects> projectses = new ArrayList<>();
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects_list);

        projectses.add(new Projects("ROla", "39482342"));
        projectses.add(new Projects("PENIS", "JFDSFS"));
        projectses.add(new Projects("FSDKJFLSD", "3948HK42342342"));
        projectses.add(new Projects("FSDKJFLSD", "3948HK42342342"));
        projectses.add(new Projects("FSDKJFLSD", "3948HK42342342"));
        projectses.add(new Projects("FSDKJFLSD", "3948HK42342342"));
        projectses.add(new Projects("FSDKJFLSD", "3948HK42342342"));
        projectses.add(new Projects("FSDKJFLSD", "3948HK42342342"));
        projectses.add(new Projects("FSDKJFLSD", "3948HK42342342"));
        projectses.add(new Projects("FSDKJFLSD", "3948HK42342342"));
        projectses.add(new Projects("FSDKJFLSD", "3948HK42342342"));
        projectses.add(new Projects("FSDKJFLSD", "3948HK42342342"));
        projectses.add(new Projects("FSDKJFLSD", "3948HK42342342"));
        projectses.add(new Projects("FSDKJFLSD", "3948HK42342342"));

        //Toolbar
        SetToolbar();

        //Recycler - ListView
        SetRecycler();


    }

    private void SetRecycler(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewProjects);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ItemProjectsAdapter(this, projectses);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        adapter.setOnItemClickListener(new ItemProjectsAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Projects item) {

            }
        });
    }


    private void SetToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarSelectProjects);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            actionBar = getSupportActionBar();
            actionBar.setTitle(R.string.ProjectsListActivity);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
