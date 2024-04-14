package com.example.pictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Random;

public class Humans extends AppCompatActivity {
    Button hg;
    EditText hw;
    ImageButton dw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humans);
        hg=findViewById(R.id.humangen);
        hw=findViewById(R.id.humanw);
        dw=findViewById(R.id.draw4);
        dw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Humans.this,Painting.class);
                startActivity(intent);
            }
        });
        hg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                String[] H=new String[50];
                H[0]="EAR";
                H[1]="HEART";
                H[2]="KIDNEY";
                H[3]="EYES";
                H[4]="BRAIN";
                H[5]="LIVER";
                H[6]="LUNG";
                H[7]="MOUTH";
                H[8]="STOMACH";
                H[9]="BONE";
                H[10]="KNEE";
                H[11]="ELBOW";
                H[12]="FACE";
                H[13]="TONGUE";
                H[14]="HAND";
                H[15]="THORAX";
                H[16]="SHOULDER";
                H[17]="ARM";
                H[18]="CHEEK";
                H[19]="NAIL";
                H[20]="FOOT";
                H[21]="NECK";
                H[22]="HAIR";
                H[23]="FINGER";
                H[24]="NERVE";
                H[25]="SKULL";
                H[26]="HEAD";
                H[27]="HAIR";
                H[28]="CHIN";
                H[29]="LIPS";
                H[30]="ANKLE";
                H[31]="MUSCLES";
                H[32]="NOSE";
                H[33]="PHARYNX";
                H[34]="BLOOD VESSELS";
                H[35]="SPINAL CORD";
                H[36]="WRIST";
                H[37]="FOREARM";
                H[38]="ARTERIES";
                H[39]="VEINS";
                H[40]="HIP";
                H[41]="THIGH";
                H[42]="TEETH";
                H[43]="LYMPH";
                H[44]="EYEBALL";
                H[45]="CORNIA";
                H[46]="IRIS";
                H[47]="ABDOMEN";
                H[48]="LARYNX";
                H[49]="INTESTINE";
                String str=H[random.nextInt(50)];
                hw.setText(str);
            }
        });
    }
}