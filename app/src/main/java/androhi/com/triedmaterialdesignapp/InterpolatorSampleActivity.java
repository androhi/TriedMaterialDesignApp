package androhi.com.triedmaterialdesignapp;

import android.os.Bundle;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;


public class InterpolatorSampleActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpolator_sample);

        ImageView iconA = (ImageView) findViewById(R.id.android_icon_A);
        iconA.setOnClickListener(this);

        ImageView iconB = (ImageView) findViewById(R.id.android_icon_B);
        iconB.setOnClickListener(this);

        ImageView iconC = (ImageView) findViewById(R.id.android_icon_C);
        iconC.setOnClickListener(this);

        ImageView iconD = (ImageView) findViewById(R.id.android_icon_D);
        iconD.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        long duration = getResources().getInteger(android.R.integer.config_mediumAnimTime);
        float tx = 550f;
        switch (view.getId()) {
            case R.id.android_icon_A:
                view.animate().translationX(tx).setDuration(duration).setInterpolator(new FastOutSlowInInterpolator()).start();
                break;
            case R.id.android_icon_B:
                view.animate().translationX(tx).setDuration(duration).setInterpolator(new FastOutLinearInInterpolator()).start();
                break;
            case R.id.android_icon_C:
                view.animate().translationX(tx).setDuration(duration).setInterpolator(new LinearOutSlowInInterpolator()).start();
                break;
            case R.id.android_icon_D:
                view.animate().translationX(tx).setDuration(duration).setInterpolator(new LinearInterpolator()).start();
                break;
        }
    }
}
