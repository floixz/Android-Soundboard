package kevinprojects.memeboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final MediaPlayer playNoice = MediaPlayer.create(MainActivity.this, R.raw.noice);
        Button Noice = (Button) findViewById(R.id.noice);
        Noice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playNoice.start();
            }
        });

        final MediaPlayer playScream = MediaPlayer.create(MainActivity.this, R.raw.wilhelm);
        Button wilhelmScream = (Button) findViewById(R.id.wilhelm);
        wilhelmScream.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               playScream.start();
           }
        });




    }
}
