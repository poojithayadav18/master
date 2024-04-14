package com.example.pictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Random;

public class Places extends AppCompatActivity {
    Button pg;
    EditText pw;
    ImageButton dw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        pg=findViewById(R.id.placegen);
        pw=findViewById(R.id.placew);
        dw=findViewById(R.id.draw6);
        dw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Places.this,Painting.class);
                startActivity(intent);
            }
        });
        pg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random =new Random();
                String[] P=new String[80];
                P[0]="STATUE OF LIBERTY";
                P[1]="EIFFEL TOWER";
                P[2]="BIG BEN";
                P[3]="LEANING TOWER OF PISA";
                P[4]="COLOSSEUM";
                P[5]="EMPIRE STATE OF BUILDING";
                P[6]="GOLDEN GATE BRIDGE";
                P[7]="NOTRE DAME";
                P[8]="TOKYO TOWER";
                P[9]="LONDON EYE";
                P[10]="GREAT WALL OF CHINA";
                P[11]="SYNDEY OPERA HOUSE";
                P[12]="ARC DE TRIOMPHE";
                P[13]="BERLIN WALL";
                P[14]="STONEHENGE";
                P[15]="TAJ MAHAL";
                P[16]="PYRAMIDS OF GIZA";
                P[17]="TOWER BRIDGE";
                P[18]="MOUNT EVEREST";
                P[19]="BROOKLYN BRIDGE";
                P[20]="BURJ AL ARAB";
                P[21]="ACROPOLIS";
                P[22]="TIMES SQUARE";
                P[23]="THE WHITE HOUSE";
                P[24]="BURJ KHALIFA";
                P[25]="LAS VEGAS";
                P[26]="CENTRAL PARK";
                P[27]="MOUNT FUJI";
                P[28]="SPACE NEEDLE";
                P[29]="VICTORIA FALLS";
                P[30]="MECCA";
                P[31]="DISNEYLAND";
                P[32]="BLUE LAGOON";
                P[33]="PARIS";
                P[34]="LONDON";
                P[35]="TOKYO";
                P[36]="FRANCE";
                P[37]="JAPAN";
                P[38]="SINGAPORE";
                P[39]="KERALA";
                P[40]="NEW YORK";
                P[41]="ISTANBUL";
                P[42]="HONG KONG";
                P[43]="BANGKOK";
                P[44]="THAILAND";
                P[45]="AMSTERDAM";
                P[46]="SYDNEY";
                P[47]="DUBAI";
                P[48]="ROME";
                P[49]="ITALY";
                P[50]="SPAIN";
                P[51]="BERLIN";
                P[52]="GERMANY";
                P[53]="SEOUL";
                P[54]="SAN FRACISCO";
                P[55]="BEIJING";
                P[56]="SHANGHAI";
                P[57]="MOSCOW";
                P[58]="BELGIUM";
                P[59]="DENMARK";
                P[60]="PERU";
                P[61]="DOHA";
                P[62]="MUMBAI";
                P[63]="INDIA";
                P[64]="RISHIKESH";
                P[65]="JODHPUR";
                P[66]="MYSURU";
                P[67]="HAMPI";
                P[68]="COORG";
                P[69]="BENGALURU";
                P[70]="GOA";
                P[71]="AGRA";
                P[72]="RAJASTHAN";
                P[73]="VARANASI";
                P[74]="ANDAMAN";
                P[75]="MANALI";
                P[76]="LEH LADAKH";
                P[77]="UDAIPUR";
                P[78]="SIKKIM";
                P[79]="SHIMLA";
                String str=P[random.nextInt(80)];
                pw.setText(str);
            }
        });
    }
}