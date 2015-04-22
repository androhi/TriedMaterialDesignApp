package androhi.com.triedmaterialdesignapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class StartActivity extends AppCompatActivity implements AbsListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("メニュー");
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));

        String[] menuStringArray = getResources().getStringArray(R.array.menu_strings);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, menuStringArray);
        ListView menuList = (ListView) findViewById(R.id.menu_list);
        menuList.setAdapter(adapter);
        menuList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(this, StyleSampleActivity.class));
                break;
            case 1:
                break;
            case 2:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}
