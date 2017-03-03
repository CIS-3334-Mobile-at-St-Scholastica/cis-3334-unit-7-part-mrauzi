package css.cis3334.heartratetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvPulse, tvRange;
    String pulse, range;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvPulse = (TextView) findViewById(R.id.textViewPulse);
        tvRange = (TextView) findViewById(R.id.textViewRange);

        Bundle extras = getIntent().getExtras();
        pulse = extras.getSerializable("Pulse").toString();
        range = extras.getSerializable("Range").toString();

        tvPulse.setText("Pulse: " + pulse);
        tvRange.setText("Range: " + range);

    }
}
