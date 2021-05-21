package com.example.foodrescueapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>
{
	ArrayList<Item> items = new ArrayList<>();
	HomeActivity activity;

	MyAdapter(ArrayList<Item> items, HomeActivity activity)
	{
		this.items.addAll(items);
		this.activity = activity;
	}

	@Override
	public void onBindViewHolder(@NonNull MyViewHolder holder, final int position)
	{
		holder.setContent(items.get(position), activity);
	}

	@Override
	public int getItemCount()
	{
		return items.size();
	}

	@NonNull
	@Override
	public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_food, parent, false));
	}
}