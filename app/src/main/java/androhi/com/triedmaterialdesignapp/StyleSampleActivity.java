package androhi.com.triedmaterialdesignapp;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.ArrayAdapter;


public class StyleSampleActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style_sample);

        findViewById(R.id.v7alert_dialog_button).setOnClickListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]{"Android JellyBean", "Android KitKat", "Android Lollipop", "Android M"});
        ((AppCompatAutoCompleteTextView) findViewById(R.id.appcompat_autocomplete_text))
                .setAdapter(adapter);

        AppCompatSpinner spinner = (AppCompatSpinner) findViewById(R.id.appcompat_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.v7alert_dialog_button:
                showV7AlertDialog();
                break;
        }
    }

    private void showV7AlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("Title")
                .setMessage("Welcome to DroidKaigi.")
                .setPositiveButton("ok", null)
                .setNegativeButton("cancel", null);
        builder.show();
    }
}
