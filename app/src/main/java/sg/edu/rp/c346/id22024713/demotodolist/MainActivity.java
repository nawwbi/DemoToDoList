package sg.edu.rp.c346.id22024713.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvItem;
    ArrayList<ToDoItem> al;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItem = findViewById(R.id.listView);
        al = new ArrayList<>();

        Calendar date = Calendar.getInstance();
        date.set(2020, 8, 1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2020,8,2);

        al.add(new ToDoItem("Go to movies", date));
        al.add(new ToDoItem("Get a haircut", date2));

        adapter = new CustomAdapter(MainActivity.this, R.layout.row, al);
        lvItem.setAdapter(adapter);

    }
}