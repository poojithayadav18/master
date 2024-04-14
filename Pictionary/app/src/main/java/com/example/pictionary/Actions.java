package com.example.pictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Random;

public class Actions extends AppCompatActivity {
    Button ag;
    EditText aw;
    ImageButton dw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actions);
        ag=findViewById(R.id.actgen);
        aw=findViewById(R.id.actw);
        dw=findViewById(R.id.draw);
        dw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Actions.this,Painting.class);
                startActivity(intent);
            }
        });
        ag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                String[] A=new String[50];
                A[0]="RIDE";
                A[1]="SIT DOWN";
                A[2]="STAND UP";
                A[3]="FIGHT";
                A[4]="LAUGH";
                A[5]="READ";
                A[6]="PLAY";
                A[7]="LISTEN";
                A[8]="CRY";
                A[9]="THINK";
                A[10]="SING";
                A[11]="WATCH";
                A[12]="DANCE";
                A[13]="RUN";
                A[14]="SWIM";
                A[15]="FLY";
                A[16]="CUT";
                A[17]="SLEEP";
                A[18]="CLOSE";
                A[19]="OPEN";
                A[20]="WRITE";
                A[21]="JUMP";
                A[22]="EAT";
                A[23]="DRINK";
                A[24]="COOK";
                A[25]="WASH";
                A[26]="CLIMB";
                A[27]="TALK";
                A[28]="CRAWL";
                A[29]="DREAM";
                A[30]="DIG";
                A[31]="CLAP";
                A[32]="KNIT";
                A[33]="SEW";
                A[34]="SNORE";
                A[35]="PAINT";
                A[36]="DIVE";
                A[37]="SKI";
                A[38]="SHAKE";
                A[39]="CYCLE";
                A[40]="FISHING";
                A[41]="CATCH";
                A[42]="KICK";
                A[43]="PUSH";
                A[44]="SKIP";
                A[45]="PUNCH";
                A[46]="CLEAN";
                A[47]="SWING";
                A[48]="TIE";
                A[49]="SCRUB";
                String str=A[random.nextInt(50)];
                aw.setText(str);
            }
        });
    }
}