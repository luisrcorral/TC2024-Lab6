package mx.itesm.customlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    String[] web = {
            "Facebook",
            "Instagram",
            "Twitter",

    } ;
    Integer[] imageId = {
            R.drawable.facebook_icon,
            R.drawable.instagram_icon,
            R.drawable.twitter_icon,
    };

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList adapter = new CustomList(MainActivity.this, web, imageId);

        list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You Clicked at " + web[position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}