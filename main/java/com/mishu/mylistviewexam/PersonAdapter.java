package com.mishu.mylistviewexam;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 16-7-16.
 */
public class PersonAdapter extends ArrayAdapter<Person> {
    Context context;
    ArrayList<Person> persons;
    String phone;

    public PersonAdapter(Context context, ArrayList<Person> persons) {
        super(context, R.layout.list_row, persons);

        this.context = context;
        this.persons = persons;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_row, null, true);

        TextView textViewName = (TextView) convertView.findViewById(R.id.TextViewName);
        final TextView textViewPhone = (TextView) convertView.findViewById(R.id.TextViewNumber);

        ImageButton imageButtonSms = (ImageButton) convertView.findViewById(R.id.ImageViewSms);
        ImageButton imageButtonCall = (ImageButton) convertView.findViewById(R.id.ImageViewCall);

        phone = persons.get(position).getPhone();
        textViewName.setText(persons.get(position).getName());
        textViewPhone.setText(persons.get(position).getPhone());

        imageButtonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = textViewPhone.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                context.startActivity(intent);
            }
        });

        imageButtonSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String body = "hjghasghgh";
                String phone = textViewPhone.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms",phone,null));
                i.putExtra("sms_body",body);
                context.startActivity(i);
            }
        });

        return convertView;
    }

}
