package com.example.pictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Random;

public class Movies extends AppCompatActivity {
    Button mg;
    EditText mw;
    ImageButton dw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        mg=findViewById(R.id.movgen);
        mw=findViewById(R.id.movw);
        dw=findViewById(R.id.draw5);
        dw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Movies.this,Painting.class);
                startActivity(intent);
            }
        });
        mg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                String[] M=new String[100];
                M[0]="THE DARK KNIGHT";
                M[1]="ANGRY ME";
                M[2]="THE LORD OF THE RINGS";
                M[3]="FORREST GUMP";
                M[4]="INCEPTION";
                M[5]="STAR WARS";
                M[6]="THE MATRIX";
                M[7]="SEVEN SAMURAI";
                M[8]="LIFE IS BEAUTIFUL";
                M[9]="SPIRITED AWAY";
                M[10]="INTERSTELLER";
                M[11]="PARASITE";
                M[12]="BACK TO THE FUTURE";
                M[13]="TERMINATOR";
                M[14]="THE LION KING";
                M[15]="ALIEN";
                M[16]="AVENGERS";
                M[17]="JOKER";
                M[18]="SPIDER-MAN";
                M[19]="CAPERNAUM";
                M[20]="TOY STORY";
                M[21]="3 IDIOTS";
                M[22]="A SPACE ODYSSEY";
                M[23]="DANGAL";
                M[24]="UP";
                M[25]="CASINO";
                M[26]="INSIDE OUT";
                M[27]="FINDING NEMO";
                M[28]="CATCH ME IF YOU CAN";
                M[29]="GONE GIRL";
                M[30]="ANDHADHUN";
                M[31]="FORD V FERRARI";
                M[32]="HOW TO TRAIN A DRAGON";
                M[33]="BLACK PANTHER";
                M[34]="CALL ME BY YOUR NAME";
                M[35]="MISSION IMPOSSIBLE";
                M[36]="NOW YOU SEE ME";
                M[37]="AVATAR";
                M[38]="TITANIC";
                M[39]="JURASSIC WORLD";
                M[40]="MARVELS";
                M[41]="INCREDIBLES";
                M[42]="ROGUE ONE";
                M[43]="BEAUTY AND THE BEAST";
                M[44]="FORZEN";
                M[45]="SHREK";
                M[46]="CAPTAIN MARVEL";
                M[47]="PIRATES OF THE CARIBBEAN";
                M[48]="IRON MAN";
                M[49]="GUARDIANS OF THE GALAXY";
                M[50]="DESPICABLE ME";
                M[51]="ALADDIN";
                M[52]="FAST AND FURIOUS";
                M[53]="ZOOTOPIA";
                M[54]="AQUAMAN";
                M[55]="MINIONS";
                M[56]="ALICE IN WONDERLAND";
                M[57]="IT";
                M[58]="JUMANJI";
                M[59]="THOR";
                M[60]="HARRY POTTER";
                M[61]="SKYFALL";
                M[62]="MONSTERS";
                M[63]="THE TWILIGTH";
                M[64]="MAN OF STEEL";
                M[65]="TRANSFORMERS";
                M[66]="SUICIDE SQUAD";
                M[67]="DEADPOOL";
                M[68]="THE CONJURING";
                M[69]="STUART LITTLE";
                M[70]="THE PURSUIT OF HAPPINESS";
                M[71]="FIFTY SHADES";
                M[72]="HACHI";
                M[73]="LA LA LAND";
                M[74]="THE RINGS";
                M[75]="2012";
                M[76]="EVIL DEAD";
                M[77]="RUN";
                M[78]="ALIVE";
                M[79]="HOST";
                M[80]="PARANORMAL ACTIVITIES";
                M[81]="A QUIET PLACE";
                M[82]="ORPHAN";
                M[83]="THE WRETCHED";
                M[84]="REMEMBER ME";
                M[85]="THE FAULT IN OUR STARS";
                M[86]="AFTER WE COLLIDED";
                M[87]="FIVE FEET APART";
                M[88]="CINDERALLA";
                M[89]="THE NOTEBOOK";
                M[90]="THE VOW";
                M[91]="SMALLFOOT";
                M[92]="THE BOSS BABY";
                M[93]="OVER THE MOON";
                M[94]="SCOOB";
                M[95]="THE ANGRY BIRDS";
                M[96]="COCO";
                M[97]="MOANA";
                M[98]="THE LITTLE MERMAID";
                M[99]="A BUGS LIFE";
                String str=M[random.nextInt(100)];
                mw.setText(str);
            }
        });

    }
}