package com.example.pictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Random;

public class Foods extends AppCompatActivity {
    Button fg;
    EditText fw;
    ImageButton dw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);
        fg=findViewById(R.id.foodgen);
        fw=findViewById(R.id.foodw);
        dw=findViewById(R.id.draw3);
        dw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Foods.this,Painting.class);
                startActivity(intent);
            }
        });
        fg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                String F[]=new String[100];
                F[0]="PASTA";
                F[1]="FRENCH FRIES";
                F[2]="ICE CREAM";
                F[3]="BREAD";
                F[4]="FRIED RICE";
                F[5]="PANCAKES";
                F[6]="BURGER";
                F[7]="PIZZA";
                F[8]="PIE";
                F[9]="APPLE PIE";
                F[10]="BANANA";
                F[11]="MUFFINS";
                F[12]="CHEESECAKE";
                F[13]="CHEESE";
                F[14]="POTATO CHIPS";
                F[15]="CHEETOS";
                F[16]="TACOS";
                F[17]="BROCCOLI";
                F[18]="CHOCOLATE";
                F[19]="KIWI";
                F[20]="TOMATO";
                F[21]="HOT DOGS";
                F[22]="EGG";
                F[23]="SAUSAGE";
                F[24]="BROWNIES";
                F[25]="COOKIES";
                F[26]="DONUTS";
                F[27]="TURKEY";
                F[28]="CRANBERRY";
                F[29]="MAC AND CHEESE";
                F[30]="SOUP";
                F[32]="HAM";
                F[33]="SUSHI";
                F[34]="POPCORN";
                F[35]="LASAGNA";
                F[36]="PUDDING";
                F[37]="NACHOS";
                F[38]="CHOCOLATE CAKE";
                F[39]="FRENCH TOAST";
                F[40]="CHICKEN NUGGETS";
                F[41]="SWEET POTATO";
                F[42]="CANTALOPE";
                F[43]="APPLE";
                F[44]="ORANGE";
                F[45]="STRAWBERRY";
                F[46]="PEACHES";
                F[47]="GARLIC BREAD";
                F[48]="MANGO";
                F[49]="RASPBERRY";
                F[50]="BLUEBERRY";
                F[51]="CORN";
                F[52]="MOJITO";
                F[53]="SALAD";
                F[54]="CHEESEBURGER";
                F[55]="SANDWICH";
                F[56]="MILK SHAKE";
                F[57]="NOODLES";
                F[58]="CHERRY";
                F[59]="PEAR";
                F[60]="POMEGRANATE";
                F[61]="STARFRUIT";
                F[62]="PLUM";
                F[63]="JACKFRUIT";
                F[64]="PAPAYA";
                F[65]="APRICOT";
                F[66]="MELON";
                F[67]="GRAPEFRUIT";
                F[68]="MELON";
                F[69]="PINEAPPLE";
                F[70]="CARROT";
                F[71]="PUMPKIN";
                F[72]="CABBAGE";
                F[73]="EGGPLANT";
                F[74]="ONION";
                F[75]="COFFEE";
                F[76]="TEA";
                F[77]="WAFFLE";
                F[78]="OMELET";
                F[79]="KEBAB";
                F[80]="HOT CHOCOLATE";
                F[81]="SMOOTHIE";
                F[82]="LEMONADE";
                F[83]="WINE";
                F[84]="PANIPURI";
                F[85]="JALEBI";
                F[86]="DHOKLA";
                F[87]="ALOO PARANTHA";
                F[88]="BIRYANI";
                F[89]="MOMO";
                F[90]="DOSA";
                F[91]="PULAO";
                F[92]="PAV BHAJI";
                F[93]="MYSORE PAK";
                F[94]="CHOLE";
                F[95]="TANDOORI";
                F[96]="COCKTAIL";
                F[98]="MOCKTAIL";
                F[99]="SAMOSA";
                String str=F[random.nextInt(100)];
                fw.setText(str);
            }
        });
    }
}