package vn.edu.vhu.ltdd.a3_241a010473;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/** Chỉ hiển thị layout dựng bằng ConstraintLayout để so sánh với bản LinearLayout. */
public class ConstraintDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_demo);
        setTitle(R.string.constraint_title);
    }
}
