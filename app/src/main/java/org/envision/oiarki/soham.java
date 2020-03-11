package org.envision.oiarki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class soham extends AppCompatActivity {



    ListView listView, listView1, listView2;
    FirebaseDatabase firebaseDatabase, firebaseDatabase1, firebaseDatabase2;
    DatabaseReference databaseReference, databaseReference1, databaseReference2;
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;


    ArrayList<String> arrayList1 = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter1;


    ArrayList<String> arrayList2 = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter2;

    String value = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soham);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getString("key");
            //The key argument here must match that used in the other activity
        }


        // ALLERGIES
       firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference(value+"/allergies");


        listView = (ListView) findViewById(R.id.list);

        Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String value=dataSnapshot.getValue(String.class);
                arrayList.add(value);
                arrayAdapter = new ArrayAdapter<String>(soham.this, android.R.layout.simple_list_item_1, arrayList);
                listView.setAdapter(arrayAdapter);

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });




        // dislikes
        firebaseDatabase1 = FirebaseDatabase.getInstance();
        databaseReference1 = firebaseDatabase1.getReference(value+"/dislikes");


        listView1 = (ListView) findViewById(R.id.list1);

        Toast.makeText(this, "ok yoj", Toast.LENGTH_SHORT).show();
        databaseReference1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String value=dataSnapshot.getValue(String.class);
                arrayList1.add(value);
                arrayAdapter1= new ArrayAdapter<String>(soham.this, android.R.layout.simple_list_item_1, arrayList1);
                listView1.setAdapter(arrayAdapter1);

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        // Liking
        firebaseDatabase2 = FirebaseDatabase.getInstance();
        databaseReference2 = firebaseDatabase2.getReference(value+"/likings");


        listView2 = (ListView) findViewById(R.id.list2);

        Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
        databaseReference2.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String value=dataSnapshot.getValue(String.class);
                arrayList2.add(value);
                arrayAdapter2 = new ArrayAdapter<String>(soham.this, android.R.layout.simple_list_item_1, arrayList2);
                listView2.setAdapter(arrayAdapter2);

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



    }
}
