package www.develpoeramit.progressdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import www.develpoeramit.mprogressdialog.ProgressDialogBuilder;
import www.develpoeramit.mprogressdialog.ProgressStyle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onProgrssOne(View view) {
        new ProgressDialogBuilder(this)
                .setProgressStyle(ProgressStyle.STYLE_1)
                .show();
    }

    public void onProgrssTwo(View view) {
        new ProgressDialogBuilder(this)
                .setProgressStyle(ProgressStyle.STYLE_2)
                .show();
    }

    public void onProgrssThree(View view) {
        new ProgressDialogBuilder(this)
                .setProgressStyle(ProgressStyle.STYLE_3)
                .show();
    }

    public void onProgrss(View view) {
        new ProgressDialogBuilder(this)
                .show();
    }
}
