package com.example.android.cb_studentadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Student> studentArrayList=null;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentArrayList=generateStudents();
        listView=(ListView)findViewById(R.id.lv_students);
        listView.setAdapter(new StudentAdapter(studentArrayList,this));

    }

    static ArrayList<Student> generateStudents(){
        ArrayList<Student> newStudents=new ArrayList<>();

        newStudents.add(new Student("Vardaan","Pandora"));
        newStudents.add(new Student("Pulkit","Elixir"));
        newStudents.add(new Student("Vardaan","Elixir"));
        newStudents.add(new Student("Pulkit","Pandora"));
        newStudents.add(new Student("Vardaan","Pandora"));
        newStudents.add(new Student("Pulkit","Elixir"));
        newStudents.add(new Student("Vardaan","Pandora"));
        newStudents.add(new Student("Pulkit","Elixir"));
        newStudents.add(new Student("Vardaan","Pandora"));
        newStudents.add(new Student("Vardaan","Elixir"));
        newStudents.add(new Student("Pulkit","Pandora"));
        newStudents.add(new Student("Vardaan","Pandora"));
        newStudents.add(new Student("Pulkit","Elixir"));
        newStudents.add(new Student("Vardaan","Elixir"));
        newStudents.add(new Student("Pulkit","Pandora"));
        newStudents.add(new Student("Vardaan","Pandora"));
        newStudents.add(new Student("Pulkit","Pandora"));
        newStudents.add(new Student("Vardaan","Elixir"));
        newStudents.add(new Student("Vardaan","Pandora"));
        newStudents.add(new Student("Pulkit","Pandora"));
        newStudents.add(new Student("Vardaan","Elixir"));
        newStudents.add(new Student("Pulkit","Pandora"));
        newStudents.add(new Student("Vardaan","Pandora"));
        newStudents.add(new Student("Pulkit","Pandora"));
        newStudents.add(new Student("Vardaan","Elixir"));
        newStudents.add(new Student("Pulkit","Pandora"));
        newStudents.add(new Student("Vardaan","Elixir"));
        return newStudents;
    }
}
