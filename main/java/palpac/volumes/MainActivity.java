package palpac.volumes;


import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String text;
    TextView Vtextv1;
    TextView Vtextv2;
    TextView Vtextv3;
    TextView Vtextv4;
    TextView Vtextv5;
    TextView Vtextv6;
    TextView Vtextv7;
    TextView Vtextv8;
    SeekBar VseekBar1;
    SeekBar VseekBar2;
    SeekBar VseekBar3;
    SeekBar VseekBar4;
    SeekBar VseekBar5;
    SeekBar VseekBar6;
    SeekBar VseekBar7;
    SeekBar VseekBar8;
    public int progress_value1;
    public int progress_value2;
    public int progress_value3;
    public int progress_value4;
    public int progress_value5;
    public int progress_value6;
    public int progress_value7;
    public int progress_value8;
    public int progress_max1;
    public int progress_max2;
    public int progress_max3;
    public int progress_max4;
    public int progress_max5;
    public int progress_max6;
    public int progress_max7;
    public int progress_max8;
    AudioManager audioManager;
    android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(getApplicationContext(), "Resume", Toast.LENGTH_SHORT).show();
        update_seekbars();
    }

    // onDestroy see below

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Vtextv1 = findViewById(R.id.textv1);
        Vtextv2 = findViewById(R.id.textv2);
        Vtextv3 = findViewById(R.id.textv3);
        Vtextv4 = findViewById(R.id.textv4);
        Vtextv5 = findViewById(R.id.textv5);
        Vtextv6 = findViewById(R.id.textv6);
        Vtextv7 = findViewById(R.id.textv7);
        Vtextv8 = findViewById(R.id.textv8);
        VseekBar1 = findViewById(R.id.seekBar1);
        VseekBar2 = findViewById(R.id.seekBar2);
        VseekBar3 = findViewById(R.id.seekBar3);
        VseekBar4 = findViewById(R.id.seekBar4);
        VseekBar5 = findViewById(R.id.seekBar5);
        VseekBar6 = findViewById(R.id.seekBar6);
        VseekBar7 = findViewById(R.id.seekBar7);
        VseekBar8 = findViewById(R.id.seekBar8);
        audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        update_seekbars();

        VseekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean user) {
                progress_value1 = progress;
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress_value1, 0);
                update_seekbars();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {            }
        });
        VseekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean user) {
                progress_value2 = progress;
                audioManager.setStreamVolume(AudioManager.STREAM_RING, progress_value2, 0);
                update_seekbars();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {            }
        });
        VseekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean user) {
                progress_value3 = progress;
                audioManager.setStreamVolume(AudioManager.STREAM_NOTIFICATION, progress_value3, 0);
                update_seekbars();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {            }
        });
        VseekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean user) {
                progress_value4 = progress;
                audioManager.setStreamVolume(AudioManager.STREAM_ALARM, progress_value4, 0);
                update_seekbars();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {            }
        });
        VseekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean user) {
                progress_value5 = progress;
                audioManager.setStreamVolume(AudioManager.STREAM_VOICE_CALL, progress_value5, 0);
                update_seekbars();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {            }
        });
        VseekBar6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean user) {
                progress_value6 = progress;
                audioManager.setStreamVolume(AudioManager.STREAM_ACCESSIBILITY, progress_value6, 0);
                update_seekbars();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {            }
        });
        VseekBar7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean user) {
                progress_value7 = progress;
                audioManager.setStreamVolume(AudioManager.STREAM_DTMF, progress_value7, 0);
                update_seekbars();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {            }
        });
        VseekBar8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean user) {
                progress_value8 = progress;
                audioManager.setStreamVolume(AudioManager.STREAM_SYSTEM, progress_value8, 0);
                update_seekbars();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {            }
        });

    }

    public void update_seekbars() {
        progress_value1 = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        progress_value2 = audioManager.getStreamVolume(AudioManager.STREAM_RING);
        progress_value3 = audioManager.getStreamVolume(AudioManager.STREAM_NOTIFICATION);
        progress_value4 = audioManager.getStreamVolume(AudioManager.STREAM_ALARM);
        progress_value5 = audioManager.getStreamVolume(AudioManager.STREAM_VOICE_CALL);
        progress_value6 = audioManager.getStreamVolume(AudioManager.STREAM_ACCESSIBILITY);
        progress_value7 = audioManager.getStreamVolume(AudioManager.STREAM_DTMF);
        progress_value8 = audioManager.getStreamVolume(AudioManager.STREAM_SYSTEM);

        progress_max1 = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        progress_max2 = audioManager.getStreamMaxVolume(AudioManager.STREAM_RING);
        progress_max3 = audioManager.getStreamMaxVolume(AudioManager.STREAM_NOTIFICATION);
        progress_max4 = audioManager.getStreamMaxVolume(AudioManager.STREAM_ALARM);
        progress_max5 = audioManager.getStreamMaxVolume(AudioManager.STREAM_VOICE_CALL);
        progress_max6 = audioManager.getStreamMaxVolume(AudioManager.STREAM_ACCESSIBILITY);
        progress_max7 = audioManager.getStreamMaxVolume(AudioManager.STREAM_DTMF);
        progress_max8 = audioManager.getStreamMaxVolume(AudioManager.STREAM_SYSTEM);

        VseekBar1.setMax(progress_max1);
        VseekBar2.setMax(progress_max2);
        VseekBar3.setMax(progress_max3);
        VseekBar4.setMax(progress_max4);
        VseekBar5.setMax(progress_max5);
        VseekBar6.setMax(progress_max6);
        VseekBar7.setMax(progress_max7);
        VseekBar8.setMax(progress_max8);
        VseekBar1.setProgress(progress_value1);
        VseekBar2.setProgress(progress_value2);
        VseekBar3.setProgress(progress_value3);
        VseekBar4.setProgress(progress_value4);
        VseekBar5.setProgress(progress_value5);
        VseekBar6.setProgress(progress_value6);
        VseekBar7.setProgress(progress_value7);
        VseekBar8.setProgress(progress_value8);

        Vtextv1.setText("Volume MUSIC = " + progress_value1 + " / " + progress_max1);
        Vtextv2.setText("Volume RING = " + progress_value2 + " / " + progress_max2);
        Vtextv3.setText("Volume NOTIFICATION = " + progress_value3 + " / " + progress_max3);
        Vtextv4.setText("Volume ALARM = " + progress_value4 + " / " + progress_max4);
        Vtextv5.setText("Volume VOICE CALL = " + progress_value5 + " / " + progress_max5);
        Vtextv6.setText("Volume ACCESSIBILITY = " + progress_value6 + " / " + progress_max6);
        Vtextv7.setText("Volume DTMF = " + progress_value7 + " / " + progress_max7);
        Vtextv8.setText("Volume SYSTEM = " + progress_value8 + " / " + progress_max8);

        //Toast.makeText(getApplicationContext(), "Updated seekbar values !", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { // Menu void 1 inflate
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) { // Menu void 2 item touch
        int res_id = item.getItemId();
        if (res_id == R.id.action_1)
        {
            update_seekbars(); // Update seekbars if sync icon pressed
        }
        return true;
    }

}
