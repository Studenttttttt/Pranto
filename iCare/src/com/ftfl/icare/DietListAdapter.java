package com.ftfl.icare;



import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DietListAdapter extends ArrayAdapter<String> {
  private final Activity context;
 
  private ArrayList<String> names;
  private ArrayList<String> times;
  private ArrayList<String> menus;
  static class ViewHolder {
    public TextView name,time,menu;
    public ImageView image;
  }

  public DietListAdapter(Activity context, ArrayList<String> names,ArrayList<String> times,ArrayList<String> menus) {
    super(context, R.layout.diel_list_items, names);
    this.context = context;
    this.names = names;
    this.times = times;
    this.menus = menus;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View rowView = convertView;
    // reuse views
    if (rowView == null) {
      LayoutInflater inflater = context.getLayoutInflater();
      rowView = inflater.inflate(R.layout.diel_list_items, null);
      // configure view holder
      ViewHolder viewHolder = new ViewHolder();
      viewHolder.name = (TextView) rowView.findViewById(R.id.dietName);
      viewHolder.time = (TextView) rowView.findViewById(R.id.dietTime);
      viewHolder.menu = (TextView) rowView.findViewById(R.id.dietMenu);
     
      rowView.setTag(viewHolder);
    }

    // fill data
    ViewHolder holder = (ViewHolder) rowView.getTag();
    String name = names.get(position);
    String time = times.get(position);
    String menu = menus.get(position);
     holder.name.setText(name);
     holder.time.setText(time);
     holder.menu.setText(menu.trim());

     
  

    return rowView;
  }
} 

