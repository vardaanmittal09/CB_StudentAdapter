package com.example.android.cb_studentadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lenovo on 6/13/2017.
 */

public class StudentAdapter extends BaseAdapter {
    ArrayList<Student> studentArrayList;
    Context context;

    public StudentAdapter(ArrayList<Student> studentArrayList, Context context) {
        this.studentArrayList = studentArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return studentArrayList.size();
    }

    @Override
    public Student getItem(int position) {
        return studentArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        if(studentArrayList.get(position).getCourse().toString().equals("Pamdora")){
            return 0;
        }
        return 1;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Student thisStudent=getItem(position);
        if(convertView==null){
            if(studentArrayList.get(position).getCourse().toString().equals("Pandora")){
                convertView=li.inflate(R.layout.pandora,null);
                ((TextView)convertView.findViewById(R.id.tvnamepan)).setText(thisStudent.getName().toString());
                ((TextView)convertView.findViewById(R.id.tvcoursepan)).setText(thisStudent.getCourse().toString());
            }else{
                convertView=li.inflate(R.layout.tupple_layout,null);
                ((TextView)convertView.findViewById(R.id.tvName)).setText(thisStudent.getName().toString());
                ((TextView)convertView.findViewById(R.id.tvcourse)).setText(thisStudent.getCourse().toString());
            }
        }

        return convertView;
    }
}
