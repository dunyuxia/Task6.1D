package com.example.foodrescueapp;

import android.database.Cursor;

public class Item
{
	int id;
	String uri;
	String title;
	String description;
	String addtime;
	int pickup;
	double quantity;
	String location;

	Item(Cursor cursor)
	{
		id = cursor.getInt(cursor.getColumnIndex("id"));
		uri = cursor.getString(cursor.getColumnIndex("uri"));
		title = cursor.getString(cursor.getColumnIndex("title"));
		description = cursor.getString(cursor.getColumnIndex("description"));
		addtime = cursor.getString(cursor.getColumnIndex("addtime"));
		pickup = cursor.getInt(cursor.getColumnIndex("pickup"));
		quantity = cursor.getFloat(cursor.getColumnIndex("quantity"));
		location = cursor.getString(cursor.getColumnIndex("location"));
	}
}
