package com.ccamacho.autolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AutoAdapter extends RecyclerView.Adapter<AutoAdapter.AutoHolder> {

    List<AutoModel> autoModelList;

    public AutoAdapter(List<AutoModel> autoModelList) {
        this.autoModelList = autoModelList;
    }

    @NonNull
    @Override
    public AutoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.auto_item, parent, false);
        return new AutoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AutoHolder holder, int position) {
        holder.bind(autoModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return autoModelList != null ? autoModelList.size() : 0;
    }

    static class AutoHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewName;
        TextView textViewPower;
        TextView textViewYear;

        public AutoHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.textView_name);
            textViewPower = itemView.findViewById(R.id.textView_power);
            textViewYear = itemView.findViewById(R.id.textView_year);
        }

        public void bind(AutoModel autoModel) {
            imageView.setBackgroundResource(autoModel.getImageResource());
            textViewName.setText(autoModel.getName());
            textViewPower.setText(autoModel.getPower());
            textViewYear.setText(autoModel.getYear());
        }
    }
}
