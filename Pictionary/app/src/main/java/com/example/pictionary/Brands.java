package com.example.pictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Random;

public class Brands extends AppCompatActivity {
    Button bg;
    EditText bw;
    ImageButton dw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brands);
        bg=findViewById(R.id.brandgen);
        bw=findViewById(R.id.brandw);
        dw=findViewById(R.id.draw2);
        dw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Brands.this,Painting.class);
                startActivity(intent);
            }
        });
        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                String[] B=new String[80];
                B[0]="APPLE";
                B[1]="COCA COLA";
                B[2]="THE WALT DISNEY";
                B[3]="GOOGLE";
                B[4]="MICROSOFT";
                B[5]="AMAZON";
                B[6]="FACEBOOK";
                B[7]="VISA";
                B[8]="MASTERCARD";
                B[9]="HERSHEY";
                B[10]="TWITTER";
                B[11]="HARLEY DAVIDSON";
                B[12]="NIKE";
                B[13]="MCDONALDS";
                B[14]="STARBUCKS";
                B[15]="FORD";
                B[16]="INTEL";
                B[17]="NETFLIX";
                B[18]="MARRIOTT";
                B[19]="CHEVRON";
                B[20]="GAP";
                B[21]="HP";
                B[22]="PAYPAL";
                B[23]="SAMSUNG";
                B[24]="LOUIS VUITTON";
                B[25]="CISCO";
                B[26]="ORACLE";
                B[27]="MERCEDES-BENZ";
                B[28]="BMW";
                B[29]="HONDA";
                B[30]="LOREAL";
                B[31]="GUCCI";
                B[32]="PEPSI";
                B[33]="ZARA";
                B[34]="AUDI";
                B[35]="SONY";
                B[36]="CHASE";
                B[37]="ADIDAS";
                B[38]="CHANEL";
                B[39]="SIEMENS";
                B[40]="EBAY";
                B[41]="H&M";
                B[42]="ROLEX";
                B[43]="HYUNDAI";
                B[44]="LEGO";
                B[45]="KFC";
                B[46]="BURGER KING";
                B[47]="VOLKSWAGAN";
                B[48]="ADOBE";
                B[49]="ESPN";
                B[50]="HCL";
                B[51]="AIRTEL";
                B[52]="JIO";
                B[53]="HERO";
                B[54]="RELIANCE";
                B[55]="PARLE";
                B[56]="AXIS";
                B[57]="MYNTRA";
                B[58]="FLIPKART";
                B[59]="PRADA";
                B[60]="LEVIS";
                B[61]="CALVIN KLEIN";
                B[62]="TOMMY HILFIGER";
                B[63]="SAINT LAURENT";
                B[64]="SKECHERS";
                B[65]="RAYBAN";
                B[66]="LEE";
                B[67]="VICTORIAS SECRET";
                B[68]="PUMA";
                B[69]="HUSH PUPPIES";
                B[70]="DIOR";
                B[71]="ONLY";
                B[72]="ALLEN SOLLY";
                B[73]="UGG";
                B[74]="CLARKS";
                B[74]="MAC";
                B[75]="MAYBELLINE";
                B[76]="NIVEA";
                B[77]="GARNIER";
                B[78]="DELL";
                B[79]="LENOVO";
                String str=B[random.nextInt(80)];
                bw.setText(str);
            }
        });
    }
}