package com.mishu.mylistviewexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewPersonProfile;
    ArrayList<Person> persons;
    PersonAdapter personAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewPersonProfile = (ListView) findViewById(R.id.ListView);

        Person person = new Person();

        persons = person.getAllPerson();

        personAdapter = new PersonAdapter(this, persons);

        listViewPersonProfile.setAdapter(personAdapter);
    }
}
