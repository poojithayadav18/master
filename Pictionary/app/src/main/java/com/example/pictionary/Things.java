package com.example.pictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Random;

public class Things extends AppCompatActivity {
    Button tg;
    EditText tw;
    ImageButton dw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things);
        tg=findViewById(R.id.thingen);
        tw=findViewById(R.id.thingsw);
        dw=findViewById(R.id.draw7);
        dw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Things.this,Painting.class);
                startActivity(intent);
            }
        });
        tg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                String[] T=new String[80];
                T[0]="STAPLER";
                T[1]="DESK";
                T[2]="PHONE";
                T[3]="PAPER";
                T[4]="LIGHT";
                T[5]="CHAIR";
                T[6]="NOTEPAD";
                T[7]="CALCULATOR";
                T[8]="PENS";
                T[9]="PENCIL";
                T[10]="BOOK";
                T[11]="CHAIR";
                T[12]="GLUE";
                T[13]="CHOCOLATE";
                T[14]="LAPTOP";
                T[15]="PANT";
                T[16]="CANDY";
                T[17]="CREAM";
                T[18]="BASEBALL";
                T[19]="BAT";
                T[20]="T-SHIRT";
                T[21]="BROOM";
                T[22]="WATER BOTTLE";
                T[23]="NEWSPAPER";
                T[24]="CAMERA";
                T[25]="UMBRELLA";
                T[26]="BASKET";
                T[27]="TEDDY BEAR";
                T[28]="BOWL";
                T[29]="TREE";
                T[30]="ICE";
                T[31]="BUBBLE";
                T[32]="TOOTH";
                T[33]="LEAF";
                T[34]="PLANE";
                T[35]="TRAIN";
                T[36]="PAINT";
                T[37]="CUP";
                T[38]="PLATE";
                T[39]="CUSHION";
                T[40]="SOFA";
                T[41]="SHIRT";
                T[42]="CANDLE";
                T[43]="DRESS";
                T[44]="PILLOW";
                T[45]="HOME";
                T[46]="GUITAR";
                T[47]="GLASS";
                T[48]="TOWEL";
                T[49]="PIANO";
                T[50]="SHOE";
                T[51]="SOCKS";
                T[52]="JEANS";
                T[53]="JACKET";
                T[54]="TIE";
                T[55]="SCARF";
                T[56]="CELL PHONE";
                T[57]="CORK";
                T[58]="SKECTCH";
                T[59]="KETCHUP";
                T[60]="SLIPPER";
                T[61]="CAR";
                T[62]="STAIRS";
                T[63]="ARROW";
                T[64]="TRUCK";
                T[65]="BOAT";
                T[66]="SKATE";
                T[67]="CLOCK";
                T[68]="KITE";
                T[69]="KEY";
                T[70]="LOCK";
                T[71]="SAW";
                T[72]="DUSTBIN";
                T[73]="SPEAKER";
                T[74]="COMPUTER";
                T[75]="FAN";
                T[76]="RACK";
                T[77]="SHELF";
                T[78]="CHARGER";
                T[79]="BATTERY";
                String str=T[random.nextInt(80)];
                tw.setText(str);
            }
        });
    }
}