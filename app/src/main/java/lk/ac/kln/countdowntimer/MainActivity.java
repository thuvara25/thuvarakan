package lk.ac.kln.countdowntimer;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private int counter =99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count_down();
    }
private void count_down(){
    final TextView textview= findViewById(R.id."+id/textView" )_;
    final Handler handler = new handler();
    handler.post(new Runnable(){
        @Override
        public void run (){
                textview.setText(Integer.toString(counter));
                counter--;
                handler.postDelayed(r.this_delayMillis:1000_);