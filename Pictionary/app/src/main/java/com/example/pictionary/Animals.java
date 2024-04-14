package com.example.pictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Random;

public class Animals extends AppCompatActivity {
    Button ang;
    EditText anw;
    ImageButton dw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        ang=findViewById(R.id.anigen);
        anw=findViewById(R.id.aniw);
        dw=findViewById(R.id.draw1);
        dw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Animals.this,Painting.class);
                startActivity(intent);
            }
        });
        ang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                String[] AN=new String[60];
                AN[0]="DOG";
                AN[1]="PUPPY";
                AN[2]="TURTLE";
                AN[3]="RABBIT";
                AN[4]="PARROT";
                AN[5]="CAT";
                AN[6]="GOLDFISH";
                AN[7]="MOUSE";
                AN[8]="HAMSTER";
                AN[9]="COW";
                AN[10]="RABBIT";
                AN[11]="DUCK";
                AN[12]="SHRIMP";
                AN[13]="PIG";
                AN[14]="GOAT";
                AN[15]="CRAB";
                AN[16]="DEER";
                AN[17]="BEE";
                AN[19]="SHEEP";
                AN[20]="FISH";
                AN[21]="TURKEY";
                AN[22]="DOVE";
                AN[23]="CHICKEN";
                AN[24]="HORSE";
                AN[25]="SQUIRREL";
                AN[26]="CHIMPANZEE";
                AN[27]="OX";
                AN[28]="LION";
                AN[29]="PANDA";
                AN[30]="KANGAROO";
                AN[31]="MONKEY";
                AN[32]="KOALA";
                AN[33]="MOLE";
                AN[34]="ELEPHANT";
                AN[35]="LEOPARD";
                AN[36]="HIPPOPOTAMUS";
                AN[37]="GIRAFFE";
                AN[38]="FOX";
                AN[39]="WOODPECKER";
                AN[40]="STARFISH";
                AN[41]="RACCOON";
                AN[42]="WOLF";
                AN[43]="BLUE WHALE";
                AN[44]="CAMEL";
                AN[45]="ALLIGATOR";
                AN[46]="OWL";
                AN[47]="BEAR";
                AN[48]="CROCODILE";
                AN[49]="DOLPHINE";
                AN[50]="SNAKE";
                AN[51]="FROG";
                AN[52]="SEA LION";
                AN[53]="WHALE";
                AN[54]="BEE";
                AN[55]="BUTTERFLY";
                AN[56]="ANT";
                AN[57]="BEETLE";
                AN[58]="COCKROACH";
                AN[59]="POLAR BEAR";
                String str=AN[random.nextInt(60)];
                anw.setText(str);


            }
        });

    }
}