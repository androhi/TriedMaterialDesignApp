package androhi.com.triedmaterialdesignapp;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class StyleSampleActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style_sample);

        findViewById(R.id.v7alert_dialog_button).setOnClickListener(this);
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
