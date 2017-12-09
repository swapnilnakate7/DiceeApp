package in.swapnilnakate.dicee;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
         rollButton=(Button) findViewById(R.id.rollbutton);

        final ImageView leftDiece=(ImageView) findViewById(R.id.left_diec);
        final ImageView rightDiece=(ImageView) findViewById(R.id.right_diec);

        final int[] dieceArray={R.drawable.dice1,R.drawable.dice2,
                R.drawable.dice3,R.drawable.dice4,
                R.drawable.dice5,R.drawable.dice6
        };
        rollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("Diecee","Mymsg");

                Random random=new Random();

                int number=random.nextInt(6);

                leftDiece.setImageResource(dieceArray[number]);

                number=random.nextInt(6);
                 rightDiece.setImageResource(dieceArray[number]);

            }
        });

    }
}
