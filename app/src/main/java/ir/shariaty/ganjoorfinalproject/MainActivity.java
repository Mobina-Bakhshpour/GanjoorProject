package ir.shariaty.ganjoorfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView faal;
    private TextView bio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();

        faal.setOnClickListener(this);
        bio.setOnClickListener(this);

    }

    private void bindViews() {
        faal = findViewById(R.id.txt_gfaal);
        bio = findViewById(R.id.txt_gbiography);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.txt_gfaal:
                intent = new Intent(this, FallHafezActivity.class);
                startActivity(intent);
                break;
            case R.id.txt_gbiography:
                intent = new Intent(this, BiographyActivity.class);
                startActivity(intent);
                break;
        }
    }
}