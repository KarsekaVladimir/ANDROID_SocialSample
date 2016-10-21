package com.econcalendar.econcalendar;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

//Adapter Class For Binding data to ListView
public class BindingData extends BaseAdapter {

    ArrayList<String> title;
    ArrayList<String> country;
    ArrayList<String> date;
    LayoutInflater inflater;

    public BindingData() {
    }

    public BindingData(Activity act, ArrayList<String> title,
                       ArrayList<String> country, ArrayList<String> date) {
        this.title = title;
        this.country = country;
        this.date = date;
        inflater = (LayoutInflater) act
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return title.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = inflater.inflate(R.layout.listrow, null);
            holder.txtTitle = (TextView) convertView.findViewById(R.id.title);
            holder.txtCountry = (TextView) convertView
                    .findViewById(R.id.country);
            holder.txtDate = (TextView) convertView.findViewById(R.id.date);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
        holder.txtTitle.setText(Html.fromHtml("" + title.get(position)));
        holder.txtCountry.setText(Html.fromHtml("<b>Country : </b>"
                + country.get(position)));
        holder.txtDate.setText(Html.fromHtml("<b>Date : </b>"
                + date.get(position)));

        return convertView;
    }

    private class Holder {

        TextView txtTitle, txtCountry, txtDate;
    }
}