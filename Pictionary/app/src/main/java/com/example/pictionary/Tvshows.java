package com.example.pictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Random;

public class Tvshows extends AppCompatActivity {
    Button tvg;
    EditText tvw;
    ImageButton dw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvshows);
        tvg=findViewById(R.id.tvgen);
        tvw=findViewById(R.id.tvword);
        dw=findViewById(R.id.draw8);
        dw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Tvshows.this,Painting.class);
                startActivity(intent);
            }
        });
        tvg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                String[] TV=new String[100];
                TV[0]="THE VAMPIRE DIARIES";
                TV[1]="THE ORIGINALS";
                TV[2]="SENSE8";
                TV[3]="BREAKING BAD";
                TV[4]="GAME OF THRONES";
                TV[5]="THE WIRE";
                TV[6]="RICK AND MORTY";
                TV[7]="THE SOPRANOS";
                TV[8]="SHERLOCK";
                TV[9]="TRUE DETECTIVE";
                TV[10]="FIREFLY";
                TV[11]="FRIENDS";
                TV[12]="FARGO";
                TV[13]="GRAVITY FALLS";
                TV[14]="LOKI";
                TV[15]="STRANGER THINGS";
                TV[16]="HOUSE OF CARDS";
                TV[17]="THE OFFICE";
                TV[18]="TWIN PEAKS";
                TV[19]="FREAKS AND GEEKS";
                TV[20]="THE WEST WING";
                TV[21]="THE QUEENS GAMBIT";
                TV[22]="HOUSE";
                TV[23]="THE SIMPSONS";
                TV[24]="DARK";
                TV[25]="ROME";
                TV[26]="THE BOYS";
                TV[27]="SIX FEET UNDER";
                TV[28]="NARCOS";
                TV[29]="SEINFELD";
                TV[30]="THE CROWN";
                TV[31]="DRAGON BALL Z";
                TV[32]="BoJACK HORSEMAN";
                TV[33]="THIS IS US";
                TV[34]="SHAMELESS";
                TV[35]="MINDHUNTER";
                TV[36]="SUITS";
                TV[37]="COMMUNITY";
                TV[38]="SILICON VALLEY";
                TV[39]="SUPERNATURAL";
                TV[40]="MODERN FAMILY";
                TV[41]="FRINGE";
                TV[42]="BROOKLYN NINE-NINE";
                TV[43]="PERSON OF INTEREST";
                TV[44]="HOW I MET YOUR MOTHER";
                TV[45]="LOST";
                TV[46]="PRISON BREAK";
                TV[47]="HOMELAND";
                TV[48]="SCRUBS";
                TV[49]="THE BIG BANG THEORY";
                TV[50]="THE WITCHER";
                TV[51]="THE 100";
                TV[52]="MANIFEST";
                TV[53]="GOSSIP GIRL";
                TV[54]="YELLOWSTONE";
                TV[55]="THE WALKING DEAD";
                TV[56]="LUCIFER";
                TV[57]="GREYS ANATOMY";
                TV[58]="VIRGIN RIVER";
                TV[59]="SWEET TOOTH";
                TV[60]="PEAKY BLINDERS";
                TV[61]="CRIMINAL MINDS";
                TV[62]="YOUNG ROYALS";
                TV[63]="REIGN";
                TV[64]="YOUNG SHELDON";
                TV[65]="MOM";
                TV[66]="ARROW";
                TV[67]="PANIC";
                TV[68]="THE GOOD DOCTOR";
                TV[69]="FLEABAG";
                TV[70]="EMILY IN PARIS";
                TV[71]="MARCO POLO";
                TV[72]="CURSED";
                TV[73]="GINNY AND GEORGIA";
                TV[74]="SAFE";
                TV[75]="WANDERLUST";
                TV[76]="DRACULA";
                TV[77]="WATERSHIP DOWN";
                TV[78]="PACIFIC RIM";
                TV[79]="SACRED GAMES";
                TV[80]="THE FAMILY MAN";
                TV[81]="LOST IN SPACE";
                TV[82]="STATELESS";
                TV[83]="LIVING WITH YOURSELF";
                TV[84]="OZARK";
                TV[85]="THE UMBRELLA ACADEMY";
                TV[86]="THE SOCIETY";
                TV[87]="THE SPY";
                TV[88]="ATYPICAL";
                TV[89]="SHADOW AND BONE";
                TV[90]="GILMORE GIRLS";
                TV[91]="BRIDGERTON";
                TV[92]="YOU";
                TV[93]="THE LAST KINGDOM";
                TV[94]="GLOW";
                TV[95]="MONEY HEIST";
                TV[96]="ELITE";
                TV[97]="NEVER HAVE I EVER";
                TV[98]="UNBELIEVABLE";
                TV[99]="DASH AND LILY";
                String str=TV[random.nextInt(100)];
                tvw.setText(str);
            }
        });
    }
}