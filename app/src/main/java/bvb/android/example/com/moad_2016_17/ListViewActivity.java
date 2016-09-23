package bvb.android.example.com.moad_2016_17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        arrayList=new ArrayList<String>();
        arrayList.add("cloud computing");
        arrayList.add("Moabile Apllication Development");
        arrayList.add("Information security");
        arrayList.add("Data minint");
        arrayList.add("data structures");
        arrayList.add("operating system");

        arrayAdapter=
                new ArrayAdapter<String>
                        (this,R.layout.listview_item,R.id.listItemId,arrayList);
        listView=(ListView)findViewById(R.id.listViewId);
        listView.setAdapter(arrayAdapter);



    }
}
