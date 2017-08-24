package com.example.adriel.gerenceapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adriel on 24/08/2017.
 */

public class ItemProjectsAdapter extends RecyclerView.Adapter<ItemProjectsAdapter.ProjectsListHolder>{

     List<Projects> projects = new ArrayList<>();
     private LayoutInflater mInflater;

    public ItemProjectsAdapter(Context context, ArrayList projects) {
        this.projects = projects;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public ProjectsListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.items_projects_list, parent, false);
        ProjectsListHolder viewHolder = new ProjectsListHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ProjectsListHolder holder, int position) {
        holder.nameText.setText(projects.get(position).getName());
        holder.dueDateText.setText(projects.get(position).getDueDate());
    }

    @Override
    public int getItemCount() {
        return projects.size();
    }


    public class ProjectsListHolder extends RecyclerView.ViewHolder {


        public TextView nameText, dueDateText;

        public ProjectsListHolder(View itemView) {
            super(itemView);

            nameText = (TextView) itemView.findViewById(R.id.itemNameProjectsList);
            dueDateText = (TextView) itemView.findViewById(R.id.itemDueDateProjectsList);
        }

    }

    public interface OnItemClickListener {
        void onItemClick(Projects item);
    }

    private OnItemClickListener onItemClickListener;

    public OnItemClickListener getOnItemClickListener() {
        return onItemClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void updateList(Projects project) {
        InsertItem(project);
    }

    // Método responsável por inserir um novo usuário na lista e notificar que há novos itens.
    private void InsertItem(Projects project) {
        projects.add(project);
        notifyItemInserted(getItemCount());
    }

    private void UpdateItem(int position) {
        Projects proj = projects.get(position);
        //Changes...  proj.setAlgumaCoisa
        notifyItemChanged(position);
    }

    private void RemoveItem(int position) {
        projects.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, projects.size());
    }
}
