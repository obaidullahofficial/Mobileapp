package com.example.taskmanager.view;

import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taskmanager.R;
import com.example.taskmanager.model.Task;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {
    
    private List<Task> tasks = new ArrayList<>();
    private OnItemClickListener itemClickListener;
    private OnDeleteClickListener deleteClickListener;
    
    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_task, parent, false);
        return new TaskViewHolder(itemView);
    }
    
    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task currentTask = tasks.get(position);
        holder.titleText.setText(currentTask.getTitle());
        holder.descriptionText.setText(currentTask.getDescription());
        
        // Format timestamp
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.getDefault());
        holder.timestampText.setText(sdf.format(new Date(currentTask.getTimestamp())));
        
        // Show image if available
        if (currentTask.getImagePath() != null && !currentTask.getImagePath().isEmpty()) {
            holder.taskImage.setVisibility(View.VISIBLE);
            holder.taskImage.setImageBitmap(
                BitmapFactory.decodeFile(currentTask.getImagePath())
            );
        } else {
            holder.taskImage.setVisibility(View.GONE);
        }
        
        // Handle completed state
        if (currentTask.isCompleted()) {
            holder.titleText.setPaintFlags(holder.titleText.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        } else {
            holder.titleText.setPaintFlags(holder.titleText.getPaintFlags() & ~Paint.STRIKE_THRU_TEXT_FLAG);
        }
    }
    
    @Override
    public int getItemCount() {
        return tasks.size();
    }
    
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
        notifyDataSetChanged();
    }
    
    public Task getTaskAt(int position) {
        return tasks.get(position);
    }
    
    class TaskViewHolder extends RecyclerView.ViewHolder {
        private TextView titleText;
        private TextView descriptionText;
        private TextView timestampText;
        private ImageView taskImage;
        private ImageButton deleteButton;
        
        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.text_view_title);
            descriptionText = itemView.findViewById(R.id.text_view_description);
            timestampText = itemView.findViewById(R.id.text_view_timestamp);
            taskImage = itemView.findViewById(R.id.image_view_task);
            deleteButton = itemView.findViewById(R.id.button_delete);
            
            itemView.setOnClickListener(v -> {
                int position = getAdapterPosition();
                if (itemClickListener != null && position != RecyclerView.NO_POSITION) {
                    itemClickListener.onItemClick(tasks.get(position));
                }
            });
            
            deleteButton.setOnClickListener(v -> {
                int position = getAdapterPosition();
                if (deleteClickListener != null && position != RecyclerView.NO_POSITION) {
                    deleteClickListener.onDeleteClick(tasks.get(position));
                }
            });
        }
    }
    
    public interface OnItemClickListener {
        void onItemClick(Task task);
    }
    
    public interface OnDeleteClickListener {
        void onDeleteClick(Task task);
    }
    
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.itemClickListener = listener;
    }
    
    public void setOnDeleteClickListener(OnDeleteClickListener listener) {
        this.deleteClickListener = listener;
    }
}
