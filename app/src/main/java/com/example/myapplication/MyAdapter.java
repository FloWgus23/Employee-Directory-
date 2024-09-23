package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.model.Person;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;  // สำหรับใช้งาน Intent
import com.example.myapplication.DetailActivity;  // สำหรับเรียกใช้ DetailActivity


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements Filterable {

    private final Context context;
    private final List<Person> personListFull; // ข้อมูลต้นฉบับเต็ม
    private List<Person> filteredPersonList; // ข้อมูลที่ถูกกรอง
    private final OnItemClickListener onItemClickListener;

    public MyAdapter(Context context, List<Person> items, OnItemClickListener onItemClickListener) {
        this.context = context;
        this.personListFull = new ArrayList<>(items); // เก็บข้อมูลเต็มทั้งหมด
        this.filteredPersonList = new ArrayList<>(items); // กรองจากข้อมูลต้นฉบับ
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Person person = filteredPersonList.get(position);
        holder.nameTextView.setText(person.getPersonName());
        holder.emailTextView.setText(person.getPersonEmail());

        // ใช้ Glide เพื่อโหลดภาพจาก URL
        Glide.with(context).load(person.getPersonImage()).into(holder.imageView);

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("name", person.getPersonName());
            intent.putExtra("email", person.getPersonEmail());
            intent.putExtra("imageUrl", person.getPersonImage());
            intent.putExtra("address", person.getPersonAddress()); // ส่งที่อยู่
            intent.putExtra("country", person.getPersonCountry()); // ส่งประเทศ
            intent.putExtra("phone", person.getPersonPhone()); // ส่งเบอร์โทร
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return filteredPersonList.size(); // ใช้ข้อมูลที่ถูกกรองในการแสดงผล
    }

    @Override
    public Filter getFilter() {
        return personFilter;
    }

    private final Filter personFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Person> filteredList = new ArrayList<>();
            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(personListFull); // ถ้าไม่มีการค้นหา ให้แสดงข้อมูลทั้งหมด
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (Person person : personListFull) {
                    if (person.getPersonName().toLowerCase().contains(filterPattern) ||
                            person.getPersonEmail().toLowerCase().contains(filterPattern)) {
                        filteredList.add(person); // กรองตามชื่อหรืออีเมล
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            filteredPersonList.clear();
            filteredPersonList.addAll((List<Person>) results.values);
            notifyDataSetChanged(); // อัพเดทข้อมูลที่แสดงหลังจากกรองแล้ว
        }
    };

    public interface OnItemClickListener {
        void onItemClick(Person person);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView emailTextView;
        public ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.firstLine);
            emailTextView = itemView.findViewById(R.id.secondLine);
            imageView = itemView.findViewById(R.id.icon);
        }
    }
}


