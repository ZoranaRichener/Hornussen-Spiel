package com.hornussen.zoranarichener.hornussen;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ActionBar actionBar;
   //private Toolbar toolbar;
     int counter=0;

    int counter2=0;
    int counter3=0;
    int counter4=0;
    int counter5=0;
    int counter6=0;
    int counter7=0;
    int counter8=0;
    int counter9=0;
    int counter10=0;
    int counter11;
    int counter12=0;
    int counter13=0;
    int counter14=0;
    int counter15=0;
    int counter16=0;
    int counter17=0;
    int counter18=0;
    int counter19=0;
    int counter20=0;

    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,
            textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21,textView22,
            textView23,textView24,textView25,textView26,textView27,textView28,textView29,textView30,textView31,textView32,textView33,
            textView34,textView35,textView36,textView37,textView38,textView39,textView40,textView41,textView42,textView43,textView44,
            textView45,textView46,textView47,textView48,textView49,textView50,textView51,textView52,textView53,textView54,textView55,
            textView56,textView57,textView58,textView59,textView60,textView61,textView62,textView63,textView64,textView65,textView66,
            textView67,textView68,textView69,textView70,textView71,textView72,textView73,textView74,textView75,textView76,textView77,
            textView78,textView79,textView80,textView81,textView82,textView83,textView84,textView85,textView86,textView87,textView88,
            textView89,textView90,textView91,textView92,textView93,textView94,textView95,textView96,textView97,textView98,textView99,
            textView100,textView101,textView102,textView103,textView104,textView105,textView106,textView107,textView108,textView109,
            textView110,textView111;

    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8,editText9,editText10,editText11,
            editText12,editText13,editText14,editText15,editText16,editText17,editText18,editText19,editText20,editText21,editText22,
            editText23,editText24,editText25,editText26,editText27,editText28,editText29,editText30,editText31,editText32,editText33,
            editText34,editText35,editText36,editText37,editText38,editText39,editText40,editText41,editText42,editText43,editText44,
    editText45,editText46,editText47,editText48,editText49,editText50,editText51,editText52,editText53,editText54,editText55,editText56,
    editText57,editText58,editText59,editText60,editText61,editText62,editText63,editText64,editText65,editText66,editText67,editText68,
    editText69,editText70,editText71,editText72,editText73,editText74,editText75,editText76,editText77,editText78,editText79,editText80,
    editText81,editText82,editText83,editText84,editText85,editText86,editText87,editText88,editText89,editText90,editText91,editText92,
            editText93,editText94,editText95,editText96,
    editText97,editText98,editText99,editText100,editText101,editText102,editText103,editText104,editText105,editText106,editText107,
    editText108,editText109,editText110,editText111;

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,
            button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,
             button29, button30,button31,button32,button33,button34,button35,button36,button37,button38,button39,button40,button41,button42,
    button43,button44,button45,button46,button47,button48,button49,button50,button51,button52,button53,button54,button55,button56,button57,
            button58,button59,button60,button61,button62,button63,button64,button65,button66,button67,button68,button69,button70,button71,
            button72,button73,button74,button75,button76,button77,button78,button79,button80,button81,button82,button83,button84,button85,
            button86,button87,button88,button89,button90,button91,button92,button93,button94,button95,button96,button97,button98,button99,
            button100,button101,button102,button103,button104,button105,button106,button107,button108,button109,button110,button111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //** initToolbar();
       // initNavigationMenu();

        int clickcount1=0;
        int clickcount2=0;
        int clickcount3=0;
        int clickcount4=0;
        int clickcount5=0;

        textView1 = (TextView) findViewById(R.id.textView1);
        editText1 = (EditText) findViewById(R.id.editText1);
        button1 = (Button) findViewById(R.id.button1);

        textView2 = (TextView) findViewById(R.id.textView2);
        editText2 = (EditText) findViewById(R.id.editText2);
        button2 = (Button) findViewById(R.id.button2);


        textView3 = (TextView) findViewById(R.id.textView3);
        editText3 = (EditText) findViewById(R.id.editText3);
        button3 = (Button) findViewById(R.id.button3);

        textView4 = (TextView) findViewById(R.id.textView4);
        editText4 = (EditText) findViewById(R.id.editText4);
        button4 = (Button)findViewById(R.id.button4);

        textView5 = (TextView) findViewById(R.id.textView5);
        editText5 = (EditText) findViewById(R.id.editText5);
        button5 = (Button)findViewById(R.id.button5);

        textView6 = (TextView) findViewById(R.id.textView6);
        editText6 = (EditText) findViewById(R.id.editText6);
        button6 = (Button)findViewById(R.id.button6);

        textView7 = (TextView) findViewById(R.id.textView7);
        editText7 = (EditText) findViewById(R.id.editText7);
        button7 = (Button)findViewById(R.id.button7);

        textView8 = (TextView) findViewById(R.id.textView8);
        editText8 = (EditText) findViewById(R.id.editText8);
        button8 = (Button)findViewById(R.id.button8);

        textView9 = (TextView) findViewById(R.id.textView9);
        editText9 = (EditText) findViewById(R.id.editText9);
        button9 = (Button)findViewById(R.id.button9);

        textView10 = (TextView) findViewById(R.id.textView10);
        editText10 = (EditText) findViewById(R.id.editText10);
        button10 = (Button)findViewById(R.id.button10);

        textView11 = (TextView) findViewById(R.id.textView11);
        editText11 = (EditText) findViewById(R.id.editText11);
        button11 = (Button)findViewById(R.id.button11);

        textView12 = (TextView) findViewById(R.id.textView12);
        editText12 = (EditText) findViewById(R.id.editText12);
        button12 = (Button)findViewById(R.id.button12);

        textView13 = (TextView) findViewById(R.id.textView13);
        editText13 = (EditText) findViewById(R.id.editText13);
        button13 = (Button)findViewById(R.id.button13);

        textView14 = (TextView) findViewById(R.id.textView14);
        editText14 = (EditText) findViewById(R.id.editText14);
        button14 = (Button)findViewById(R.id.button14);

        textView15 = (TextView) findViewById(R.id.textView15);
        editText15 = (EditText) findViewById(R.id.editText15);
        button15 = (Button)findViewById(R.id.button15);

        textView16 = (TextView) findViewById(R.id.textView16);
        editText16 = (EditText) findViewById(R.id.editText16);
        button16 = (Button)findViewById(R.id.button16);

        textView17 = (TextView) findViewById(R.id.textView17);
        editText17 = (EditText) findViewById(R.id.editText17);
        button17 = (Button)findViewById(R.id.button17);

        textView18 = (TextView) findViewById(R.id.textView18);
        editText18 = (EditText) findViewById(R.id.editText18);
        button18 = (Button)findViewById(R.id.button18);

        textView19 = (TextView) findViewById(R.id.textView19);
        editText19 = (EditText) findViewById(R.id.editText19);
        button19 = (Button)findViewById(R.id.button19);

        textView20 = (TextView) findViewById(R.id.textView20);
        editText20 = (EditText) findViewById(R.id.editText20);
        button20 = (Button)findViewById(R.id.button20);

        textView21 = (TextView) findViewById(R.id.textView21);
        editText21 = (EditText) findViewById(R.id.editText21);
        button21 = (Button)findViewById(R.id.button21);

        textView22 = (TextView) findViewById(R.id.textView22);
        editText22 = (EditText) findViewById(R.id.editText22);
        button22 = (Button)findViewById(R.id.button22);

        textView23 = (TextView) findViewById(R.id.textView23);
        editText23 = (EditText) findViewById(R.id.editText23);
        button23 = (Button)findViewById(R.id.button23);

        textView24 = (TextView) findViewById(R.id.textView24);
        editText24 = (EditText) findViewById(R.id.editText24);
        button24= (Button)findViewById(R.id.button24);

        textView25 = (TextView) findViewById(R.id.textView25);
        editText25 = (EditText) findViewById(R.id.editText25);
        button25 = (Button)findViewById(R.id.button25);

        textView26 = (TextView) findViewById(R.id.textView26);
        editText26 = (EditText) findViewById(R.id.editText26);
        button26 = (Button)findViewById(R.id.button26);

        textView27 = (TextView) findViewById(R.id.textView27);
        editText27 = (EditText) findViewById(R.id.editText27);
        button27 = (Button)findViewById(R.id.button27);

        textView28 = (TextView) findViewById(R.id.textView28);
        editText28 = (EditText) findViewById(R.id.editText28);
        button28 = (Button)findViewById(R.id.button28);

        textView29 = (TextView) findViewById(R.id.textView29);
        editText29 = (EditText) findViewById(R.id.editText29);
        button29 = (Button)findViewById(R.id.button29);

        textView30 = (TextView) findViewById(R.id.textView30);
        editText30= (EditText) findViewById(R.id.editText30);
        button30 = (Button)findViewById(R.id.button30);

        textView31 = (TextView) findViewById(R.id.textView31);
        editText31= (EditText) findViewById(R.id.editText31);
        button31 = (Button)findViewById(R.id.button31);

        textView32 = (TextView) findViewById(R.id.textView32);
        editText32= (EditText) findViewById(R.id.editText32);
        button32 = (Button)findViewById(R.id.button32);

        textView33 = (TextView) findViewById(R.id.textView33);
        editText33= (EditText) findViewById(R.id.editText33);
        button33 = (Button)findViewById(R.id.button33);

        textView34 = (TextView) findViewById(R.id.textView34);
        editText34= (EditText) findViewById(R.id.editText34);
        button34 = (Button)findViewById(R.id.button34);

        textView35 = (TextView) findViewById(R.id.textView35);
        editText35= (EditText) findViewById(R.id.editText35);
        button35 = (Button)findViewById(R.id.button35);

        textView36 = (TextView) findViewById(R.id.textView36);
        editText36= (EditText) findViewById(R.id.editText36);
        button36 = (Button)findViewById(R.id.button36);

        textView37= (TextView) findViewById(R.id.textView37);
        editText37= (EditText) findViewById(R.id.editText37);
        button37 = (Button)findViewById(R.id.button37);


        textView38 = (TextView) findViewById(R.id.textView38);
        editText38= (EditText) findViewById(R.id.editText38);
        button38 = (Button)findViewById(R.id.button38);


        textView39= (TextView) findViewById(R.id.textView39);
        editText39= (EditText) findViewById(R.id.editText39);
        button39 = (Button)findViewById(R.id.button39);

        textView40= (TextView) findViewById(R.id.textView40);
        editText40= (EditText) findViewById(R.id.editText40);
        button40 = (Button)findViewById(R.id.button40);

        textView41= (TextView) findViewById(R.id.textView41);
        editText41= (EditText) findViewById(R.id.editText41);
        button41 = (Button)findViewById(R.id.button41);

        textView42= (TextView) findViewById(R.id.textView42);
        editText42= (EditText) findViewById(R.id.editText42);
        button42 = (Button)findViewById(R.id.button42);

        textView43= (TextView) findViewById(R.id.textView43);
        editText43= (EditText) findViewById(R.id.editText43);
        button43 = (Button)findViewById(R.id.button43);

        textView44= (TextView) findViewById(R.id.textView44);
        editText44= (EditText) findViewById(R.id.editText44);
        button44 = (Button)findViewById(R.id.button44);

        textView45= (TextView) findViewById(R.id.textView45);
        editText45= (EditText) findViewById(R.id.editText45);
        button45 = (Button)findViewById(R.id.button45);

        textView46= (TextView) findViewById(R.id.textView46);
        editText46= (EditText) findViewById(R.id.editText46);
        button46 = (Button)findViewById(R.id.button46);

        textView47= (TextView) findViewById(R.id.textView47);
        editText47= (EditText) findViewById(R.id.editText47);
        button47 = (Button)findViewById(R.id.button47);


        textView48= (TextView) findViewById(R.id.textView48);
        editText48= (EditText) findViewById(R.id.editText48);
        button48 = (Button)findViewById(R.id.button48);

        textView49= (TextView) findViewById(R.id.textView49);
        editText49= (EditText) findViewById(R.id.editText49);
        button49 = (Button)findViewById(R.id.button49);

        textView50= (TextView) findViewById(R.id.textView50);
        editText50= (EditText) findViewById(R.id.editText50);
        button50 = (Button)findViewById(R.id.button50);

        textView50= (TextView) findViewById(R.id.textView50);
        editText50= (EditText) findViewById(R.id.editText50);
        button50 = (Button)findViewById(R.id.button50);

        textView51= (TextView) findViewById(R.id.textView51);
        editText51= (EditText) findViewById(R.id.editText51);
        button51 = (Button)findViewById(R.id.button51);


        textView52= (TextView) findViewById(R.id.textView52);
        editText52= (EditText) findViewById(R.id.editText52);
        button52 = (Button)findViewById(R.id.button52);

        textView53= (TextView) findViewById(R.id.textView53);
        editText53= (EditText) findViewById(R.id.editText53);
        button53 = (Button)findViewById(R.id.button53);

        textView54= (TextView) findViewById(R.id.textView54);
        editText54= (EditText) findViewById(R.id.editText54);
        button54 = (Button)findViewById(R.id.button54);

        textView55= (TextView) findViewById(R.id.textView55);
        editText55= (EditText) findViewById(R.id.editText55);
        button55 = (Button)findViewById(R.id.button55);

        textView56= (TextView) findViewById(R.id.textView56);
        editText56= (EditText) findViewById(R.id.editText56);
        button56 = (Button)findViewById(R.id.button56);

        textView57= (TextView) findViewById(R.id.textView57);
        editText57= (EditText) findViewById(R.id.editText57);
        button57 = (Button)findViewById(R.id.button57);


        textView58= (TextView) findViewById(R.id.textView58);
        editText58= (EditText) findViewById(R.id.editText58);
        button58= (Button)findViewById(R.id.button58);

        textView59= (TextView) findViewById(R.id.textView59);
        editText59= (EditText) findViewById(R.id.editText59);
        button59 = (Button)findViewById(R.id.button59);

        textView60= (TextView) findViewById(R.id.textView60);
        editText60= (EditText) findViewById(R.id.editText60);
        button60 = (Button)findViewById(R.id.button60);

        textView61= (TextView) findViewById(R.id.textView61);
        editText61= (EditText) findViewById(R.id.editText61);
        button61 = (Button)findViewById(R.id.button61);

        textView62= (TextView) findViewById(R.id.textView62);
        editText62= (EditText) findViewById(R.id.editText62);
        button62 = (Button)findViewById(R.id.button62);

        textView63= (TextView) findViewById(R.id.textView63);
        editText63= (EditText) findViewById(R.id.editText63);
        button63 = (Button)findViewById(R.id.button63);

        textView64= (TextView) findViewById(R.id.textView64);
        editText64= (EditText) findViewById(R.id.editText64);
        button64 = (Button)findViewById(R.id.button64);

        textView65= (TextView) findViewById(R.id.textView65);
        editText65= (EditText) findViewById(R.id.editText65);
        button65 = (Button)findViewById(R.id.button65);

        textView66= (TextView) findViewById(R.id.textView66);
        editText66= (EditText) findViewById(R.id.editText66);
        button66 = (Button)findViewById(R.id.button66);

        textView67= (TextView) findViewById(R.id.textView67);
        editText67= (EditText) findViewById(R.id.editText67);
        button67 = (Button)findViewById(R.id.button67);

        textView68= (TextView) findViewById(R.id.textView68);
        editText68= (EditText) findViewById(R.id.editText68);
        button68 = (Button)findViewById(R.id.button68);


        textView69= (TextView) findViewById(R.id.textView69);
        editText69= (EditText) findViewById(R.id.editText69);
        button69 = (Button)findViewById(R.id.button69);

        textView70= (TextView) findViewById(R.id.textView70);
        editText70= (EditText) findViewById(R.id.editText70);
        button70 = (Button)findViewById(R.id.button70);

        textView71= (TextView) findViewById(R.id.textView71);
        editText71= (EditText) findViewById(R.id.editText71);
        button71 = (Button)findViewById(R.id.button71);

        textView72= (TextView) findViewById(R.id.textView72);
        editText72= (EditText) findViewById(R.id.editText72);
        button72 = (Button)findViewById(R.id.button72);

        textView73= (TextView) findViewById(R.id.textView73);
        editText73= (EditText) findViewById(R.id.editText73);
        button73 = (Button)findViewById(R.id.button73);

        textView74= (TextView) findViewById(R.id.textView74);
        editText74= (EditText) findViewById(R.id.editText74);
        button74 = (Button)findViewById(R.id.button74);

        textView75= (TextView) findViewById(R.id.textView75);
        editText75= (EditText) findViewById(R.id.editText75);
        button75 = (Button)findViewById(R.id.button75);

        textView76= (TextView) findViewById(R.id.textView76);
        editText76= (EditText) findViewById(R.id.editText76);
        button76 = (Button)findViewById(R.id.button76);

        textView77= (TextView) findViewById(R.id.textView77);
        editText77= (EditText) findViewById(R.id.editText77);
        button77 = (Button)findViewById(R.id.button77);

        textView78= (TextView) findViewById(R.id.textView78);
        editText78= (EditText) findViewById(R.id.editText78);
        button78 = (Button)findViewById(R.id.button78);

        textView79= (TextView) findViewById(R.id.textView79);
        editText79= (EditText) findViewById(R.id.editText79);
        button79 = (Button)findViewById(R.id.button79);

        textView70= (TextView) findViewById(R.id.textView70);
        editText70= (EditText) findViewById(R.id.editText70);
        button70 = (Button)findViewById(R.id.button70);


        textView80= (TextView) findViewById(R.id.textView80);
        editText80= (EditText) findViewById(R.id.editText80);
        button80 = (Button)findViewById(R.id.button80);

        textView81= (TextView) findViewById(R.id.textView81);
        editText81= (EditText) findViewById(R.id.editText81);
        button81 = (Button)findViewById(R.id.button81);

        textView82= (TextView) findViewById(R.id.textView82);
        editText82= (EditText) findViewById(R.id.editText82);
        button82 = (Button)findViewById(R.id.button82);

        textView83= (TextView) findViewById(R.id.textView83);
        editText83= (EditText) findViewById(R.id.editText83);
        button83 = (Button)findViewById(R.id.button83);

        textView84= (TextView) findViewById(R.id.textView84);
        editText84= (EditText) findViewById(R.id.editText84);
        button84 = (Button)findViewById(R.id.button84);

        textView85= (TextView) findViewById(R.id.textView85);
        editText85= (EditText) findViewById(R.id.editText85);
        button85 = (Button)findViewById(R.id.button85);

        textView86= (TextView) findViewById(R.id.textView86);
        editText86= (EditText) findViewById(R.id.editText86);
        button86 = (Button)findViewById(R.id.button86);

        textView87= (TextView) findViewById(R.id.textView87);
        editText87= (EditText) findViewById(R.id.editText87);
        button87 = (Button)findViewById(R.id.button87);

        textView88= (TextView) findViewById(R.id.textView88);
        editText88= (EditText) findViewById(R.id.editText88);
        button88 = (Button)findViewById(R.id.button88);

        textView89= (TextView) findViewById(R.id.textView89);
        editText89= (EditText) findViewById(R.id.editText89);
        button89 = (Button)findViewById(R.id.button89);

        textView90= (TextView) findViewById(R.id.textView90);
        editText90= (EditText) findViewById(R.id.editText90);
        button90 = (Button)findViewById(R.id.button90);

        textView91= (TextView) findViewById(R.id.textView91);
        editText91= (EditText) findViewById(R.id.editText91);
        button91 = (Button)findViewById(R.id.button91);

        textView92= (TextView) findViewById(R.id.textView92);
        editText92= (EditText) findViewById(R.id.editText92);
        button92 = (Button)findViewById(R.id.button92);

        textView93= (TextView) findViewById(R.id.textView93);
        editText93= (EditText) findViewById(R.id.editText93);
        button93 = (Button)findViewById(R.id.button93);

        textView94= (TextView) findViewById(R.id.textView94);
        editText94= (EditText) findViewById(R.id.editText94);
        button94 = (Button)findViewById(R.id.button94);

        textView95= (TextView) findViewById(R.id.textView95);
        editText95= (EditText) findViewById(R.id.editText95);
        button95 = (Button)findViewById(R.id.button95);

        textView96= (TextView) findViewById(R.id.textView96);
        editText96= (EditText) findViewById(R.id.editText96);
        button96 = (Button)findViewById(R.id.button96);

        textView97= (TextView) findViewById(R.id.textView97);
        editText97= (EditText) findViewById(R.id.editText97);
        button97 = (Button)findViewById(R.id.button97);

        textView98= (TextView) findViewById(R.id.textView98);
        editText98= (EditText) findViewById(R.id.editText98);
        button98 = (Button)findViewById(R.id.button98);


        textView99= (TextView) findViewById(R.id.textView99);
        editText99= (EditText) findViewById(R.id.editText99);
        button99 = (Button)findViewById(R.id.button99);

        textView100= (TextView) findViewById(R.id.textView100);
        editText100= (EditText) findViewById(R.id.editText100);
        button100 = (Button)findViewById(R.id.button100);

        textView100= (TextView) findViewById(R.id.textView101);
        editText100= (EditText) findViewById(R.id.editText101);
        button100 = (Button)findViewById(R.id.button101);

        textView101= (TextView) findViewById(R.id.textView102);
        editText101= (EditText) findViewById(R.id.editText102);
        button101= (Button)findViewById(R.id.button100);

        textView102= (TextView) findViewById(R.id.textView100);
        editText102= (EditText) findViewById(R.id.editText100);
        button102 = (Button)findViewById(R.id.button102);

        textView103= (TextView) findViewById(R.id.textView103);
        editText103= (EditText) findViewById(R.id.editText103);
        button103 = (Button)findViewById(R.id.button103);


        textView104= (TextView) findViewById(R.id.textView104);
        editText104= (EditText) findViewById(R.id.editText104);
        button104 = (Button)findViewById(R.id.button104);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = editText1.getText().toString();
                textView1.setText(name1);
                editText1.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.INVISIBLE);
                textView2.setText(name1);
                textView1.setText(name1);
                textView3.setText(name1);
                textView4.setText(name1);
                textView5.setText(name1);

            }
        });

//        clickcount=clickcount+1;
//        if(clickcount==1)
//        {
//            //first time clicked to do this
//            Toast.makeText(getApplicationContext(),"Button clicked first time!", Toast.LENGTH_LONG).show();
//        }
//        else
//        {
//            //check how many times clicked and so on
//            Toast.makeText(getApplicationContext(),"Button clicked count is"+clickcount, Toast.LENGTH_LONG).show();
//        }

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counter == 0) {

                textView1.setText("TomasK.");
                    counter = counter + 1;

                if (textView2.getText() != "" || textView3.getText() != "" || textView4.getText() != "" || textView5.getText() != "") {
                    textView2.setText("");
                    textView3.setText("");
                    textView4.setText("");
                    textView5.setText("");

                }

                if (editText2.getVisibility() == View.VISIBLE || editText3.getVisibility() == View.VISIBLE || editText4.getVisibility() == View.VISIBLE
                        || editText5.getVisibility() == View.VISIBLE) {
                    editText2.setVisibility(View.INVISIBLE);
                    editText3.setVisibility(View.INVISIBLE);
                    editText4.setVisibility(View.INVISIBLE);
                    editText5.setVisibility(View.INVISIBLE);

                }
                }else {
                    textView1.setText("");
                    counter=0;
                }

            }
        });

        textView1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                textView1.setText("");
                return false;
            }
        });



        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counter == 0) {
                    textView2.setText("ThomasK.");
                    //    counter = counter + 1;

                    if (textView1.getText() != "" || textView3.getText() != "" || textView3.getText() != "" || textView4.getText() != "") {
                        textView1.setText("");
                        textView3.setText("");
                        textView4.setText("");
                        textView5.setText("");

                    }

                    if (editText1.getVisibility() == View.VISIBLE || editText3.getVisibility() == View.VISIBLE || editText4.getVisibility() == View.VISIBLE
                            || editText5.getVisibility() == View.VISIBLE) {
                        editText1.setVisibility(View.INVISIBLE);
                        editText3.setVisibility(View.INVISIBLE);
                        editText4.setVisibility(View.INVISIBLE);
                        editText5.setVisibility(View.INVISIBLE);
                        editText2.setVisibility(View.VISIBLE);
                        button2.setVisibility(View.VISIBLE);
                    }
                } else {
                    textView2.setText("");
                    counter= 0;
                }
            }
        });



        textView2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView2.getText() != "" ) {
                    textView2.setText("");
                    editText2.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name2 = editText2.getText().toString();
                textView2.setText(name2);
                editText2.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
            }
        });




        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter == 0) {

                    textView3.setText("ThomasK.");
                    counter = counter + 1;

                    if (textView1.getText() != "" || textView2.getText() != "" || textView4.getText() != "" || textView5.getText() != "") {
                        textView1.setText("");
                        textView2.setText("");
                        textView4.setText("");
                        textView5.setText("");

                    }

                    if (editText1.getVisibility() == View.VISIBLE || editText2.getVisibility() == View.VISIBLE || editText4.getVisibility() == View.VISIBLE
                            || editText5.getVisibility() == View.VISIBLE) {
                        editText1.setVisibility(View.INVISIBLE);
                        editText2.setVisibility(View.INVISIBLE);
                        editText4.setVisibility(View.INVISIBLE);
                        editText5.setVisibility(View.INVISIBLE);
                        editText5.setVisibility(View.VISIBLE);
                        button5.setVisibility(View.VISIBLE);
                    }
                }else {
                    counter=0;
                    textView3.setText("");
                }
            }
        });

        textView3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView3.getText() != "" ) {
                    textView3.setText("");
                    editText3.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name2 = editText3.getText().toString();
                textView3.setText(name2);
                editText3.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
            }
        });


        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter == 0) {

                    textView4.setText("ThomasK.");
                    counter = counter + 1;

                    if (textView1.getText() != "" || textView2.getText() != "" || textView3.getText() != "" || textView5.getText() != "") {
                        textView1.setText("");
                        textView2.setText("");
                        textView3.setText("");
                        textView5.setText("");

                    }

                    if (editText3.getVisibility() == View.VISIBLE || editText1.getVisibility() == View.VISIBLE || editText2.getVisibility() == View.VISIBLE
                            || editText5.getVisibility() == View.VISIBLE) {
                        editText1.setVisibility(View.INVISIBLE);
                        editText2.setVisibility(View.INVISIBLE);
                        editText3.setVisibility(View.INVISIBLE);
                        editText4.setVisibility(View.INVISIBLE);
                        editText4.setVisibility(View.VISIBLE);
                        button4.setVisibility(View.VISIBLE);
                    }
                }else {
                    textView4.setText("");
                    counter= 0;

                }
            }
        });

        textView4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView4.getText() != "" ) {
                    textView4.setText("");
                    editText4.setVisibility(View.VISIBLE);
                    button4.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name4 = editText4.getText().toString();
                textView4.setText(name4);
                editText4.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);
            }
        });



        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter == 0) {

                    textView5.setText("ThomasK.");
                    counter = counter + 1;

                    if (textView1.getText() != "" || textView2.getText() != "" || textView3.getText() != "" || textView4.getText() != "") {
                        textView1.setText("");
                        textView2.setText("");
                        textView3.setText("");
                        textView4.setText("");

                    }

                    if (editText1.getVisibility() == View.VISIBLE || editText2.getVisibility() == View.VISIBLE || editText3.getVisibility() == View.VISIBLE
                            || editText4.getVisibility() == View.VISIBLE) {
                        editText1.setVisibility(View.INVISIBLE);
                        editText2.setVisibility(View.INVISIBLE);
                        editText3.setVisibility(View.INVISIBLE);
                        editText4.setVisibility(View.INVISIBLE);
                        editText5.setVisibility(View.VISIBLE);
                        button5.setVisibility(View.VISIBLE);
                    }
                }else {
                    textView5.setText("");
                    counter=0;
                }
            }
        });

        textView5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView5.getText() != "" ) {
                    textView5.setText("");
                    editText5.setVisibility(View.VISIBLE);
                    button5.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name5 = editText5.getText().toString();
                textView5.setText(name5);
                editText5.setVisibility(View.INVISIBLE);
                button5.setVisibility(View.INVISIBLE);
            }
        });


        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter6 == 0) {
                    textView6.setText("Mario S.");
                    counter6 = counter6 + 1;

                    if (textView7.getText() != "" || textView8.getText() != "" || textView9.getText() != "" || textView10.getText() != "") {
                        textView7.setText("");
                        textView8.setText("");
                        textView9.setText("");
                        textView10.setText("");

                    }

                }else{
                    textView6.setText("");
                    counter6 = 0;
                }
            }

        });

        textView6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView6.getText() != "" ) {
                    textView6.setText("");
                    editText6.setVisibility(View.VISIBLE);
                    button6.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name6 = editText6.getText().toString();
                textView6.setText(name6);
                editText6.setVisibility(View.INVISIBLE);
                button6.setVisibility(View.INVISIBLE);
            }
        });


        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter7 == 0) {
                    textView7.setText("Mario S.");
                    counter7 = counter7 + 1;

                if (textView6.getText() != "" || textView8.getText() != "" || textView9.getText() != "" || textView10.getText() != "")
                {
                    textView6.setText("");
                    textView8.setText("");
                    textView9.setText("");
                    textView10.setText("");

                }
                }else{
                    textView7.setText("");
                    counter7 = 0;
                }
            }

        });

        textView7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView7.getText() != "" ) {
                    textView7.setText("");
                    editText7.setVisibility(View.VISIBLE);
                    button7.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name7 = editText7.getText().toString();
                textView7.setText(name7);
                editText7.setVisibility(View.INVISIBLE);
                button7.setVisibility(View.INVISIBLE);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name8 = editText8.getText().toString();
                textView8.setText(name8);
                editText8.setVisibility(View.INVISIBLE);
                button8.setVisibility(View.INVISIBLE);
            }
        });

        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter8 == 0) {
                    textView8.setText("Mario S.");
                    counter8 = counter8 + 1;

                if (textView6.getText() != "" || textView7.getText() != "" || textView9.getText() != "" || textView10.getText() != "")
                {
                    textView6.setText("");
                    textView7.setText("");
                    textView9.setText("");
                    textView10.setText("");

                }
                }else{
                    textView8.setText("");
                    counter8 = 0;
                }
            }

        });

        textView8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView8.getText() != "" ) {
                    textView8.setText("");
                    editText8.setVisibility(View.VISIBLE);
                    button8.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name9 = editText9.getText().toString();
                textView9.setText(name9);
                editText9.setVisibility(View.INVISIBLE);
                button9.setVisibility(View.INVISIBLE);
            }
        });

        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter9 == 0) {
                    textView9.setText("Mario S.");
                    counter9 = counter9 + 1;

                if (textView6.getText() != "" || textView8.getText() != "" || textView7.getText() != "" || textView10.getText() != "")
                {
                    textView6.setText("");
                    textView6.setText("");
                    textView8.setText("");
                    textView10.setText("");

                }
                }else{
                    textView9.setText("");
                    counter9 = 0;
                }
            }

        });

        textView9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView9.getText() != "" ) {
                    textView9.setText("");
                    editText9.setVisibility(View.VISIBLE);
                    button9.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name10 = editText10.getText().toString();
                textView10.setText(name10);
                editText10.setVisibility(View.INVISIBLE);
                button10.setVisibility(View.INVISIBLE);
            }
        });

        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter10 == 0) {
                    textView10.setText("Mario S.");
                    counter10 = counter10 + 1;
                if (textView7.getText() != "" || textView8.getText() != "" || textView9.getText() != "" || textView6.getText() != "")
                {
                    textView6.setText("");
                    textView7.setText("");
                    textView8.setText("");
                    textView9.setText("");


                }
                }else{
                    textView10.setText("");
                    counter10 = 0;
                }
            }

        });

        textView10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView10.getText() != "" ) {
                    textView10.setText("");
                    editText10.setVisibility(View.VISIBLE);
                    button10.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name11 = editText11.getText().toString();
                textView11.setText(name11);
                editText11.setVisibility(View.INVISIBLE);
                button11.setVisibility(View.INVISIBLE);
            }
        });

        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView11.setText("Daniel");
                    counter11 = counter11 + 1;

                if (textView12.getText() != "" || textView13.getText() != "" || textView14.getText() != "" || textView15.getText() != "")
                {
                    textView12.setText("");
                    textView13.setText("");
                    textView14.setText("");
                    textView15.setText("");


                }
                }else{
                    textView11.setText("");
                    counter11 = 0;
                }
            }

        });

        textView11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView11.getText() != "" ) {
                    textView11.setText("");
                    editText11.setVisibility(View.VISIBLE);
                    button11.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText12.getText().toString();
                textView12.setText(name12);
                editText12.setVisibility(View.INVISIBLE);
                button12.setVisibility(View.INVISIBLE);
            }
        });

        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView12.setText("Daniel");
                    counter11 = counter11 + 1;


                    if (textView11.getText() != "" || textView13.getText() != "" || textView14.getText() != "" || textView15.getText() != "")
                {
                    textView11.setText("");
                    textView13.setText("");
                    textView14.setText("");
                    textView15.setText("");


                }
                }else{
                    textView12.setText("");
                    counter11 = 0;
                }
            }

        });

        textView12.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView12.getText() != "" ) {
                    textView12.setText("");
                    editText12.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name13 = editText13.getText().toString();
                textView13.setText(name13);
                editText13.setVisibility(View.INVISIBLE);
                button13.setVisibility(View.INVISIBLE);
            }
        });

        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView13.setText("Daniel");
                    counter11 = counter11 + 1;



                    if (textView11.getText() != "" || textView12.getText() != "" || textView14.getText() != "" || textView15.getText() != "")
                {
                    textView11.setText("");
                    textView12.setText("");
                    textView14.setText("");
                    textView15.setText("");


                }
                }else{
                    textView13.setText("");
                    counter11 = 0;
                }
            }

        });

        textView13.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView13.getText() != "" ) {
                    textView13.setText("");
                    editText13.setVisibility(View.VISIBLE);
                    button13.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name14 = editText14.getText().toString();
                textView14.setText(name14);
                editText14.setVisibility(View.INVISIBLE);
                button14.setVisibility(View.INVISIBLE);
            }
        });

        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView14.setText("Daniel");
                    counter11 = counter11 + 1;


                    if (textView11.getText() != "" || textView12.getText() != "" || textView13.getText() != "" || textView15.getText() != "")
                {
                    textView11.setText("");
                    textView12.setText("");
                    textView13.setText("");
                    textView15.setText("");


                }
            }else{
                textView14.setText("");
                counter11 = 0;
            }
        }

    });

        textView14.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView14.getText() != "" ) {
                    textView14.setText("");
                    editText14.setVisibility(View.VISIBLE);
                    button14.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name15 = editText15.getText().toString();
                textView15.setText(name15);
                editText15.setVisibility(View.INVISIBLE);
                button15.setVisibility(View.INVISIBLE);
            }
        });

        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView15.setText("Daniel");
                    counter11 = counter11 + 1;

                if (textView11.getText() != "" || textView13.getText() != "" || textView14.getText() != "" || textView15.getText() != "")
                {
                    textView11.setText("");
                    textView12.setText("");
                    textView14.setText("");
                    textView13.setText("");


                }
                }else{
                    textView15.setText("");
                    counter11 = 0;
                }
            }

        });

        textView15.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView15.getText() != "" ) {
                    textView15.setText("");
                    editText15.setVisibility(View.VISIBLE);
                    button15.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name16 = editText16.getText().toString();
                textView16.setText(name16);
                editText16.setVisibility(View.INVISIBLE);
                button16.setVisibility(View.INVISIBLE);
            }
        });

        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView16.setText("Nils");
                    counter11 = counter11 + 1;


                if (textView17.getText() != "" || textView18.getText() != "" || textView19.getText() != "" || textView20.getText() != "")
                {
                    textView17.setText("");
                    textView18.setText("");
                    textView19.setText("");
                    textView20.setText("");


                }
            }else{
                textView16.setText("");
                counter11 = 0;
            }
        }

    });

        textView16.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView16.getText() != "" ) {
                    textView16.setText("");
                    editText16.setVisibility(View.VISIBLE);
                    button16.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText17.getText().toString();
                textView17.setText(name12);
                editText17.setVisibility(View.INVISIBLE);
                button17.setVisibility(View.INVISIBLE);
            }
        });

        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView17.setText("Nils");
                    counter11 = counter11 + 1;


                    if (textView16.getText() != "" || textView18.getText() != "" || textView19.getText() != "" || textView20.getText() != "")
                {
                    textView16.setText("");
                    textView18.setText("");
                    textView19.setText("");
                    textView20.setText("");


                }
                }else{
                    textView17.setText("");
                    counter11 = 0;
                }
            }

        });

        textView17.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView17.getText() != "" ) {
                    textView17.setText("");
                    editText17.setVisibility(View.VISIBLE);
                    button17.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText18.getText().toString();
                textView18.setText(name12);
                editText18.setVisibility(View.INVISIBLE);
                button18.setVisibility(View.INVISIBLE);
            }
        });

        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView18.setText("Nils");
                    counter11 = counter11 + 1;

                if (textView16.getText() != "" || textView17.getText() != "" || textView19.getText() != "" || textView20.getText() != "")
                {
                    textView16.setText("");
                    textView17.setText("");
                    textView19.setText("");
                    textView20.setText("");


                }
            }else{
                textView18.setText("");
                counter11 = 0;
            }
        }

    });

        textView18.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView18.getText() != "" ) {
                    textView18.setText("");
                    editText18.setVisibility(View.VISIBLE);
                    button18.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText19.getText().toString();
                textView19.setText(name12);
                editText19.setVisibility(View.INVISIBLE);
                button19.setVisibility(View.INVISIBLE);
            }
        });

        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView19.setText("Nils");
                    counter11 = counter11 + 1;

                if (textView16.getText() != "" || textView17.getText() != "" || textView18.getText() != "" || textView20.getText() != "")
                {
                    textView16.setText("");
                    textView17.setText("");
                    textView18.setText("");
                    textView20.setText("");


                }
                }else{
                    textView19.setText("");
                    counter11 = 0;
                }
            }

        });

        textView19.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView19.getText() != "" ) {
                    textView19.setText("");
                    editText19.setVisibility(View.VISIBLE);
                    button19.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText20.getText().toString();
                textView20.setText(name12);
                editText20.setVisibility(View.INVISIBLE);
                button20.setVisibility(View.INVISIBLE);
            }
        });

        textView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (counter11 == 0) {
                        textView20.setText("Nils");
                        counter11 = counter11 + 1;
                if (textView16.getText() != "" || textView18.getText() != "" || textView19.getText() != "" || textView17.getText() != "")
                {
                    textView17.setText("");
                    textView16.setText("");
                    textView19.setText("");
                    textView18.setText("");


                }
                    }else{
                        textView20.setText("");
                        counter11 = 0;
                    }
            }

        });

        textView20.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView20.getText() != "" ) {
                    textView20.setText("");
                    editText20.setVisibility(View.VISIBLE);
                    button20.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText21.getText().toString();
                textView21.setText(name12);
                editText21.setVisibility(View.INVISIBLE);
                button21.setVisibility(View.INVISIBLE);
            }
        });

        textView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counter11 == 0) {
                    textView21.setText("ThomasC.");
                    counter11 = counter11 + 1;

                if (textView25.getText() != "" || textView22.getText() != "" || textView23.getText() != "" || textView24.getText() != "")
                {
                    textView22.setText("");
                    textView23.setText("");
                    textView24.setText("");
                    textView25.setText("");


                }
            }else{
                textView21.setText("");
                counter11 = 0;
            }
        }

    });

        textView21.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView21.getText() != "" ) {
                    textView21.setText("");
                    editText21.setVisibility(View.VISIBLE);
                    button21.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText22.getText().toString();
                textView22.setText(name12);
                editText22.setVisibility(View.INVISIBLE);
                button22.setVisibility(View.INVISIBLE);
            }
        });

        textView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView22.setText("ThomasC");
                    counter11 = counter11 + 1;

                if (textView21.getText() != "" || textView25.getText() != "" || textView23.getText() != "" || textView24.getText() != "")
                {
                    textView21.setText("");
                    textView25.setText("");
                    textView23.setText("");
                    textView24.setText("");


                }
                }else{
                    textView22.setText("");
                    counter11 = 0;
                }
            }

        });

        textView22.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView22.getText() != "" ) {
                    textView22.setText("");
                    editText22.setVisibility(View.VISIBLE);
                    button22.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText23.getText().toString();
                textView23.setText(name12);
                editText23.setVisibility(View.INVISIBLE);
                button23.setVisibility(View.INVISIBLE);
            }
        });

        textView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counter11 == 0) {
                    textView23.setText("ThomasC.");
                    counter11 = counter11 + 1;

                if (textView21.getText() != "" || textView22.getText() != "" || textView25.getText() != "" || textView24.getText() != "")
                {
                    textView21.setText("");
                    textView22.setText("");
                    textView24.setText("");
                    textView25.setText("");


                }

            }else{
                textView23.setText("");
                counter11 = 0;
            }
        }

    });

        textView23.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView23.getText() != "" ) {
                    textView23.setText("");
                    editText23.setVisibility(View.VISIBLE);
                    button23.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText24.getText().toString();
                textView24.setText(name12);
                editText24.setVisibility(View.INVISIBLE);
                button24.setVisibility(View.INVISIBLE);
            }
        });

        textView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counter11 == 0) {
                    textView24.setText("ThomasC.");
                    counter11 = counter11 + 1;

                if (textView21.getText() != "" || textView22.getText() != "" || textView23.getText() != "" || textView25.getText() != "")
                {
                    textView21.setText("");
                    textView22.setText("");
                    textView23.setText("");
                    textView25.setText("");


                }
                }else{
                    textView24.setText("");
                    counter11 = 0;
                }
            }

        });

        textView24.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView24.getText() != "" ) {
                    textView24.setText("");
                    editText24.setVisibility(View.VISIBLE);
                    button24.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText25.getText().toString();
                textView25.setText(name12);
                editText25.setVisibility(View.INVISIBLE);
                button25.setVisibility(View.INVISIBLE);
            }
        });

        textView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView25.setText("ThomasC.");
                    counter11 = counter11 + 1;
                if (textView21.getText() != "" || textView22.getText() != "" || textView23.getText() != "" || textView24.getText() != "")
                {
                    textView21.setText("");
                    textView23.setText("");
                    textView24.setText("");
                    textView22.setText("");


                }
                }else{
                    textView25.setText("");
                    counter11 = 0;
                }
            }

        });

        textView25.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView25.getText() != "" ) {
                    textView25.setText("");
                    editText25.setVisibility(View.VISIBLE);
                    button25.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText26.getText().toString();
                textView26.setText(name12);
                editText26.setVisibility(View.INVISIBLE);
                button26.setVisibility(View.INVISIBLE);
            }
        });

        textView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //textView26.setText("Manfred");
                if (counter11 == 0) {
                    textView26.setText("Manfred.");
                    counter11 = counter11 + 1;

                if (textView27.getText() != "" || textView28.getText() != "" || textView29.getText() != "" || textView30.getText() != "")
                {
                    textView27.setText("");
                    textView28.setText("");
                    textView29.setText("");
                    textView30.setText("");


                }

            }else{
                textView26.setText("");
                counter11 = 0;
            }
        }

    });

        textView26.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView26.getText() != "" ) {
                    textView26.setText("");
                    editText26.setVisibility(View.VISIBLE);
                    button26.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText27.getText().toString();
                textView27.setText(name12);
                editText27.setVisibility(View.INVISIBLE);
                button27.setVisibility(View.INVISIBLE);
            }
        });

        textView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView27.setText("Manfred.");
                    counter11 = counter11 + 1;



                if (textView26.getText() != "" || textView28.getText() != "" || textView29.getText() != "" || textView30.getText() != "")
                {
                    textView26.setText("");
                    textView28.setText("");
                    textView29.setText("");
                    textView30.setText("");


                }

                }else{
                    textView27.setText("");
                    counter11 = 0;
                }
            }

        });

        textView27.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView27.getText() != "" ) {
                    textView27.setText("");
                    editText27.setVisibility(View.VISIBLE);
                    button27.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText28.getText().toString();
                textView28.setText(name12);
                editText28.setVisibility(View.INVISIBLE);
                button28.setVisibility(View.INVISIBLE);
            }
        });

        textView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView28.setText("Manfred.");
                    counter11 = counter11 + 1;

                if (textView26.getText() != "" || textView27.getText() != "" || textView29.getText() != "" || textView30.getText() != "")
                {
                    textView26.setText("");
                    textView27.setText("");
                    textView29.setText("");
                    textView30.setText("");


                }

            }else{
                textView28.setText("");
                counter11 = 0;
            }
        }

    });

        textView28.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView28.getText() != "" ) {
                    textView28.setText("");
                    editText28.setVisibility(View.VISIBLE);
                    button28.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText29.getText().toString();
                textView29.setText(name12);
                editText29.setVisibility(View.INVISIBLE);
                button29.setVisibility(View.INVISIBLE);
            }
        });

        textView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView29.setText("Manfred.");
                    counter11 = counter11 + 1;

                if (textView27.getText() != "" || textView28.getText() != "" || textView26.getText() != "" || textView30.getText() != "")
                {
                    textView27.setText("");
                    textView28.setText("");
                    textView26.setText("");
                    textView30.setText("");


                }

            }else{
                textView29.setText("");
                counter11 = 0;
            }
        }

    });

        textView29.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView29.getText() != "" ) {
                    textView29.setText("");
                    editText29.setVisibility(View.VISIBLE);
                    button29.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText30.getText().toString();
                textView30.setText(name12);
                editText30.setVisibility(View.INVISIBLE);
                button30.setVisibility(View.INVISIBLE);
            }
        });

        textView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView30.setText("Manfred.");
                    counter11 = counter11 + 1;

                if (textView27.getText() != "" || textView28.getText() != "" || textView29.getText() != "" || textView26.getText() != "")
                {
                    textView27.setText("");
                    textView28.setText("");
                    textView29.setText("");
                    textView26.setText("");


                }

                }else{
                    textView30.setText("");
                    counter11 = 0;
                }
            }

        });

        textView30.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView30.getText() != "" ) {
                    textView30.setText("");
                    editText30.setVisibility(View.VISIBLE);
                    button30.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText31.getText().toString();
                textView31.setText(name12);
                editText31.setVisibility(View.INVISIBLE);
                button31.setVisibility(View.INVISIBLE);
            }
        });

        textView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counter11 == 0) {
                    textView31.setText("Sven.");
                    counter11 = counter11 + 1;

                if (textView32.getText() != "" || textView33.getText() != "" || textView34.getText() != "" || textView35.getText() != "")
                {
                    textView32.setText("");
                    textView33.setText("");
                    textView34.setText("");
                    textView35.setText("");


                }

                }else{
                    textView31.setText("");
                    counter11 = 0;
                }
            }

        });

        textView31.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView31.getText() != "" ) {
                    textView31.setText("");
                    editText31.setVisibility(View.VISIBLE);
                    button31.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText32.getText().toString();
                textView32.setText(name12);
                editText32.setVisibility(View.INVISIBLE);
                button32.setVisibility(View.INVISIBLE);
            }
        });

        textView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView32.setText("Sven.");
                    counter11 = counter11 + 1;

                if (textView31.getText() != "" || textView33.getText() != "" || textView34.getText() != "" || textView35.getText() != "")
                {
                    textView31.setText("");
                    textView33.setText("");
                    textView34.setText("");
                    textView35.setText("");


                }

                }else{
                    textView32.setText("");
                    counter11 = 0;
                }
            }

        });

        textView32.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView32.getText() != "" ) {
                    textView32.setText("");
                    editText32.setVisibility(View.VISIBLE);
                    button32.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText33.getText().toString();
                textView33.setText(name12);
                editText33.setVisibility(View.INVISIBLE);
                button33.setVisibility(View.INVISIBLE);
            }
        });

        textView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView33.setText("Sven.");
                    counter11 = counter11 + 1;
                if (textView31.getText() != "" || textView32.getText() != "" || textView34.getText() != "" || textView35.getText() != "")
                {
                    textView32.setText("");
                    textView31.setText("");
                    textView34.setText("");
                    textView35.setText("");


                }

            }else{
                textView33.setText("");
                counter11 = 0;
            }
        }

    });

        textView33.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView33.getText() != "" ) {
                    textView33.setText("");
                    editText33.setVisibility(View.VISIBLE);
                    button33.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText34.getText().toString();
                textView34.setText(name12);
                editText34.setVisibility(View.INVISIBLE);
                button34.setVisibility(View.INVISIBLE);
            }
        });

        textView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView34.setText("Sven.");
                    counter11 = counter11 + 1;

                if (textView31.getText() != "" || textView33.getText() != "" || textView32.getText() != "" || textView35.getText() != "")
                {
                    textView32.setText("");
                    textView33.setText("");
                    textView31.setText("");
                    textView35.setText("");


                }
                }else{
                    textView34.setText("");
                    counter11 = 0;
                }
            }

        });

        textView34.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView34.getText() != "" ) {
                    textView34.setText("");
                    editText34.setVisibility(View.VISIBLE);
                    button34.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText35.getText().toString();
                textView35.setText(name12);
                editText35.setVisibility(View.INVISIBLE);
                button35.setVisibility(View.INVISIBLE);
            }
        });

        textView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView35.setText("Sven.");
                    counter11 = counter11 + 1;


                    if (textView32.getText() != "" || textView33.getText() != "" || textView34.getText() != "" || textView31.getText() != "")
                {
                    textView32.setText("");
                    textView33.setText("");
                    textView34.setText("");
                    textView31.setText("");


                }
            }else{
                textView35.setText("");
                counter11 = 0;
            }
        }

    });

        textView35.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView35.getText() != "" ) {
                    textView35.setText("");
                    editText35.setVisibility(View.VISIBLE);
                    button35.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText36.getText().toString();
                textView36.setText(name12);
                editText36.setVisibility(View.INVISIBLE);
                button36.setVisibility(View.INVISIBLE);
            }
        });

        textView36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView36.setText("Jurg.");
                    counter11 = counter11 + 1;


                    if (textView40.getText() != "" || textView37.getText() != "" || textView38.getText() != "" || textView39.getText() != "")
                {
                    textView40.setText("");
                    textView37.setText("");
                    textView38.setText("");
                    textView39.setText("");


                }
                }else{
                    textView36.setText("");
                    counter11 = 0;
                }
            }

        });

        textView36.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView36.getText() != "" ) {
                    textView36.setText("");
                    editText36.setVisibility(View.VISIBLE);
                    button36.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText37.getText().toString();
                textView37.setText(name12);
                editText37.setVisibility(View.INVISIBLE);
                button37.setVisibility(View.INVISIBLE);
            }
        });

        textView37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView37.setText("Jurg.");
                    counter11 = counter11 + 1;


                    if (textView36.getText() != "" || textView40.getText() != "" || textView38.getText() != "" || textView39.getText() != "")
                {
                    textView40.setText("");
                    textView36.setText("");
                    textView38.setText("");
                    textView39.setText("");


                }
            }else{
                textView37.setText("");
                counter11 = 0;
            }
        }

    });

        textView37.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView37.getText() != "" ) {
                    textView37.setText("");
                    editText37.setVisibility(View.VISIBLE);
                    button37.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText38.getText().toString();
                textView38.setText(name12);
                editText38.setVisibility(View.INVISIBLE);
                button38.setVisibility(View.INVISIBLE);
            }
        });

        textView38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView38.setText("Jurg.");
                    counter11 = counter11 + 1;

                    if (textView36.getText() != "" || textView37.getText() != "" || textView40.getText() != "" || textView39.getText() != "")
                {
                    textView40.setText("");
                    textView36.setText("");
                    textView37.setText("");
                    textView39.setText("");


                }
                }else{
                    textView38.setText("");
                    counter11 = 0;
                }
            }

        });

        textView38.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView38.getText() != "" ) {
                    textView38.setText("");
                    editText38.setVisibility(View.VISIBLE);
                    button38.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText39.getText().toString();
                textView39.setText(name12);
                editText39.setVisibility(View.INVISIBLE);
                button39.setVisibility(View.INVISIBLE);
            }
        });

        textView39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView39.setText("Jurg.");
                    counter11 = counter11 + 1;

                if (textView36.getText() != "" || textView37.getText() != "" || textView40.getText() != "" || textView39.getText() != "")
                {
                    textView36.setText("");
                    textView40.setText("");
                    textView37.setText("");
                    textView38.setText("");


                }
            }else{
                textView39.setText("");
                counter11 = 0;
            }
        }

    });

        textView39.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView39.getText() != "" ) {
                    textView39.setText("");
                    editText39.setVisibility(View.VISIBLE);
                    button39.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText40.getText().toString();
                textView40.setText(name12);
                editText40.setVisibility(View.INVISIBLE);
                button40.setVisibility(View.INVISIBLE);
            }
        });

        textView40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView40.setText("Jurg.");
                    counter11 = counter11 + 1;

                    if (textView36.getText() != "" || textView37.getText() != "" || textView38.getText() != "" || textView39.getText() != "")
                {
                    textView38.setText("");
                    textView36.setText("");
                    textView37.setText("");
                    textView39.setText("");


                }
                }else{
                    textView40.setText("");
                    counter11 = 0;
                }
            }

        });

        textView40.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView40.getText() != "" ) {
                    textView40.setText("");
                    editText40.setVisibility(View.VISIBLE);
                    button40.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText41.getText().toString();
                textView41.setText(name12);
                editText41.setVisibility(View.INVISIBLE);
                button41.setVisibility(View.INVISIBLE);
            }
        });

        textView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView41.setText("Fredi.");
                    counter11 = counter11 + 1;
                if (textView42.getText() != "" || textView43.getText() != "" || textView44.getText() != "" || textView45.getText() != "")
                {
                    textView42.setText("");
                    textView43.setText("");
                    textView44.setText("");
                    textView45.setText("");


                }
            }else{
                textView41.setText("");
                counter11 = 0;
            }
        }

    });

        textView41.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView41.getText() != "" ) {
                    textView41.setText("");
                    editText41.setVisibility(View.VISIBLE);
                    button41.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText42.getText().toString();
                textView42.setText(name12);
                editText42.setVisibility(View.INVISIBLE);
                button42.setVisibility(View.INVISIBLE);
            }
        });

        textView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                textView42.setText("Fredi");
                    counter11 = counter11 + 1;

                if (textView41.getText() != "" || textView43.getText() != "" || textView44.getText() != "" || textView45.getText() != "") {
                    textView41.setText("");
                    textView43.setText("");
                    textView44.setText("");
                    textView45.setText("");

                }


                }else{
                    textView42.setText("");
                    counter11 = 0;
                }

            }
        });

        textView42.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView42.getText() != "" ) {
                    textView42.setText("");
                    editText42.setVisibility(View.VISIBLE);
                    button42.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText43.getText().toString();
                textView43.setText(name12);
                editText43.setVisibility(View.INVISIBLE);
                button43.setVisibility(View.INVISIBLE);
            }
        });

        textView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                textView43.setText("Fredi");
                    counter11 = counter11 + 1;
                if (textView42.getText() != "" || textView41.getText() != "" || textView44.getText() != "" || textView45.getText() != "")
                {
                    textView42.setText("");
                    textView41.setText("");
                    textView44.setText("");
                    textView45.setText("");


                }


            }else{
                textView43.setText("");
                counter11 = 0;
            }
            }
        });

        textView43.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView43.getText() != "" ) {
                    textView43.setText("");
                    editText43.setVisibility(View.VISIBLE);
                    button43.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText44.getText().toString();
                textView44.setText(name12);
                editText44.setVisibility(View.INVISIBLE);
                button44.setVisibility(View.INVISIBLE);
            }
        });

        textView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView44.setText("Fredi");
                    counter11 = counter11 + 1;

                if (textView42.getText() != "" || textView43.getText() != "" || textView41.getText() != "" || textView45.getText() != "")
                {
                    textView42.setText("");
                    textView43.setText("");
                    textView41.setText("");
                    textView45.setText("");


                }

                }else{
                    textView44.setText("");
                    counter11 = 0;
                }
            }
        });

        textView44.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView44.getText() != "" ) {
                    textView44.setText("");
                    editText44.setVisibility(View.VISIBLE);
                    button44.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText45.getText().toString();
                textView45.setText(name12);
                editText45.setVisibility(View.INVISIBLE);
                button45.setVisibility(View.INVISIBLE);
            }
        });

        textView45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView45.setText("Fredi");
                    counter11 = counter11 + 1;

                if (textView42.getText() != "" || textView43.getText() != "" || textView44.getText() != "" || textView41.getText() != "")
                {
                    textView42.setText("");
                    textView43.setText("");
                    textView44.setText("");
                    textView41.setText("");


                }
                }else{
                    textView45.setText("");
                    counter11 = 0;
                }
            }
        });

        textView45.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView45.getText() != "" ) {
                    textView45.setText("");
                    editText45.setVisibility(View.VISIBLE);
                    button45.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText46.getText().toString();
                textView46.setText(name12);
                editText46.setVisibility(View.INVISIBLE);
                button46.setVisibility(View.INVISIBLE);
            }
        });

        textView46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                textView46.setText("Mario R.");
                    counter11 = counter11 + 1;

                if (textView47.getText() != "" || textView48.getText() != "" || textView49.getText() != "" || textView50.getText() != "")
                {
                    textView47.setText("");
                    textView48.setText("");
                    textView49.setText("");
                    textView50.setText("");


                }
                }else{
                    textView46.setText("");
                    counter11 = 0;
                }
            }
        });

        textView46.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView46.getText() != "" ) {
                    textView46.setText("");
                    editText46.setVisibility(View.VISIBLE);
                    button46.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText47.getText().toString();
                textView47.setText(name12);
                editText47.setVisibility(View.INVISIBLE);
                button47.setVisibility(View.INVISIBLE);
            }
        });

        textView47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView47.setText("Mario R.");
                    counter11 = counter11 + 1;

                if (textView46.getText() != "" || textView48.getText() != "" || textView49.getText() != "" || textView50.getText() != "")
                {
                    textView46.setText("");
                    textView48.setText("");
                    textView49.setText("");
                    textView50.setText("");


                }
                }else{
                    textView47.setText("");
                    counter11 = 0;
                }
            }
        });

        textView47.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView47.getText() != "" ) {
                    textView47.setText("");
                    editText47.setVisibility(View.VISIBLE);
                    button47.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText48.getText().toString();
                textView48.setText(name12);
                editText48.setVisibility(View.INVISIBLE);
                button48.setVisibility(View.INVISIBLE);
            }
        });

        textView48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView48.setText("Mario R.");
                    counter11 = counter11 + 1;

                if (textView47.getText() != "" || textView46.getText() != "" || textView49.getText() != "" || textView50.getText() != "")
                {
                    textView47.setText("");
                    textView46.setText("");
                    textView49.setText("");
                    textView50.setText("");


                }
                }else{
                    textView48.setText("");
                    counter11 = 0;
                }
            }
        });

        textView48.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView48.getText() != "" ) {
                    textView48.setText("");
                    editText48.setVisibility(View.VISIBLE);
                    button48.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText49.getText().toString();
                textView49.setText(name12);
                editText49.setVisibility(View.INVISIBLE);
                button49.setVisibility(View.INVISIBLE);
            }
        });

        textView49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView49.setText("Mario R.");
                    counter11 = counter11 + 1;

                if (textView47.getText() != "" || textView48.getText() != "" || textView46.getText() != "" || textView50.getText() != "")
                {
                    textView47.setText("");
                    textView48.setText("");
                    textView46.setText("");
                    textView50.setText("");


                }
                }else{
                    textView49.setText("");
                    counter11 = 0;
                }
            }
        });

        textView49.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView49.getText() != "" ) {
                    textView49.setText("");
                    editText49.setVisibility(View.VISIBLE);
                    button49.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText50.getText().toString();
                textView50.setText(name12);
                editText50.setVisibility(View.INVISIBLE);
                button50.setVisibility(View.INVISIBLE);
            }
        });

        textView50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView50.setText("Mario R.");
                    counter11 = counter11 + 1;

                if (textView47.getText() != "" || textView48.getText() != "" || textView49.getText() != "" || textView46.getText() != "")
                {
                    textView47.setText("");
                    textView48.setText("");
                    textView49.setText("");
                    textView46.setText("");


                }
                }else{
                    textView50.setText("");
                    counter11 = 0;
                }
            }
        });

        textView50.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView50.getText() != "" ) {
                    textView50.setText("");
                    editText50.setVisibility(View.VISIBLE);
                    button50.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText51.getText().toString();
                textView51.setText(name12);
                editText51.setVisibility(View.INVISIBLE);
                button51.setVisibility(View.INVISIBLE);
            }
        });

        textView51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView51.setText("Lucas");
                    counter11 = counter11 + 1;

                if (textView52.getText() != "" || textView53.getText() != "" || textView54.getText() != "" || textView55.getText() != "")
                {
                    textView52.setText("");
                    textView53.setText("");
                    textView54.setText("");
                    textView55.setText("");


                }
                }else{
                    textView51.setText("");
                    counter11 = 0;
                }
            }
        });

        textView51.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView51.getText() != "" ) {
                    textView51.setText("");
                    editText51.setVisibility(View.VISIBLE);
                    button51.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText52.getText().toString();
                textView52.setText(name12);
                editText52.setVisibility(View.INVISIBLE);
                button52.setVisibility(View.INVISIBLE);
            }
        });

        textView52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counter11 == 0) {
                    textView52.setText("Lucas");
                    counter11 = counter11 + 1;

                if (textView51.getText() != "" || textView53.getText() != "" || textView54.getText() != "" || textView55.getText() != "")
                {
                    textView51.setText("");
                    textView53.setText("");
                    textView54.setText("");
                    textView55.setText("");


                }
               }else{
                    textView52.setText("");
                    counter11 = 0;
                }
            }
        });

        textView52.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView52.getText() != "" ) {
                    textView52.setText("");
                    editText52.setVisibility(View.VISIBLE);
                    button52.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText53.getText().toString();
                textView53.setText(name12);
                editText53.setVisibility(View.INVISIBLE);
                button53.setVisibility(View.INVISIBLE);
            }
        });

        textView53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counter11 == 0) {
                    textView53.setText("Lucas");
                    counter11 = counter11 + 1;

                if (textView51.getText() != "" || textView52.getText() != "" || textView54.getText() != "" || textView55.getText() != "")
                {
                    textView51.setText("");
                    textView52.setText("");
                    textView54.setText("");
                    textView55.setText("");


                }

                }else{
                    textView53.setText("");
                    counter11 = 0;
                }
            }
        });

        textView53.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView53.getText() != "" ) {
                    textView53.setText("");
                    editText53.setVisibility(View.VISIBLE);
                    button53.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText54.getText().toString();
                textView54.setText(name12);
                editText54.setVisibility(View.INVISIBLE);
                button54.setVisibility(View.INVISIBLE);
            }
        });

        textView54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView54.setText("Lucas");
                    counter11 = counter11 + 1;

                if (textView51.getText() != "" || textView53.getText() != "" || textView52.getText() != "" || textView55.getText() != "")
                {
                    textView51.setText("");
                    textView53.setText("");
                    textView52.setText("");
                    textView55.setText("");


                }
                }else{
                    textView54.setText("");
                    counter11 = 0;
                }
            }
        });

        textView54.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView54.getText() != "" ) {
                    textView54.setText("");
                    editText54.setVisibility(View.VISIBLE);
                    button54.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText55.getText().toString();
                textView55.setText(name12);
                editText55.setVisibility(View.INVISIBLE);
                button55.setVisibility(View.INVISIBLE);
            }
        });

        textView55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView55.setText("Lucas");
                    counter11 = counter11 + 1;


                    if (textView51.getText() != "" || textView53.getText() != "" || textView54.getText() != "" || textView52.getText() != "")
                {
                    textView51.setText("");
                    textView53.setText("");
                    textView54.setText("");
                    textView52.setText("");


                }
                }else{
                    textView55.setText("");
                    counter11 = 0;
                }
            }
        });

        textView55.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView55.getText() != "" ) {
                    textView55.setText("");
                    editText55.setVisibility(View.VISIBLE);
                    button55.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText56.getText().toString();
                textView56.setText(name12);
                editText56.setVisibility(View.INVISIBLE);
                button56.setVisibility(View.INVISIBLE);
            }
        });

        textView56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView56.setText("Oliver");
                    counter11 = counter11 + 1;
                if (textView57.getText() != "" || textView58.getText() != "" || textView59.getText() != "" || textView60.getText() != ""
                        || textView61.getText() != "" || textView62.getText() != "" )
                {
                    textView57.setText("");
                    textView58.setText("");
                    textView59.setText("");
                    textView61.setText("");
                    textView62.setText("");

                }
                }else{
                    textView56.setText("");
                    counter11 = 0;
                }
            }
        });

        textView56.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView56.getText() != "" ) {
                    textView56.setText("");
                    editText56.setVisibility(View.VISIBLE);
                    button56.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText57.getText().toString();
                textView57.setText(name12);
                editText57.setVisibility(View.INVISIBLE);
                button57.setVisibility(View.INVISIBLE);
            }
        });

        textView57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counter11 == 0) {
                    textView57.setText("Oliver");
                    counter11 = counter11 + 1;

                if (textView56.getText() != "" || textView58.getText() != "" || textView59.getText() != "" || textView60.getText() != ""
                        || textView61.getText() != "" || textView62.getText() != "" )
                {
                    textView56.setText("");
                    textView58.setText("");
                    textView59.setText("");
                    textView61.setText("");
                    textView62.setText("");

                }
                }else{
                    textView57.setText("");
                    counter11 = 0;
                }
            }
        });

        textView57.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView57.getText() != "" ) {
                    textView57.setText("");
                    editText57.setVisibility(View.VISIBLE);
                    button57.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText58.getText().toString();
                textView58.setText(name12);
                editText58.setVisibility(View.INVISIBLE);
                button58.setVisibility(View.INVISIBLE);
            }
        });

        textView58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView58.setText("Oliver");
                    counter11 = counter11 + 1;

                if (textView57.getText() != "" || textView56.getText() != "" || textView59.getText() != "" || textView60.getText() != ""
                        || textView61.getText() != "" || textView62.getText() != "" )
                {
                    textView57.setText("");
                    textView56.setText("");
                    textView59.setText("");
                    textView61.setText("");
                    textView61.setText("");
                    textView62.setText("");

                }
            }else{
                textView58.setText("");
                counter11 = 0;
            }
            }
        });

        textView58.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView58.getText() != "" ) {
                    textView58.setText("");
                    editText58.setVisibility(View.VISIBLE);
                    button58.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText59.getText().toString();
                textView59.setText(name12);
                editText59.setVisibility(View.INVISIBLE);
                button59.setVisibility(View.INVISIBLE);
            }
        });

        textView59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView59.setText("Oliver");
                    counter11 = counter11 + 1;

                if (textView57.getText() != "" || textView56.getText() != "" || textView58.getText() != "" || textView60.getText() != ""
                        || textView61.getText() != "" || textView62.getText() != "" )
                {
                    textView57.setText("");
                    textView56.setText("");
                    textView58.setText("");
                    textView60.setText("");
                    textView61.setText("");
                    textView62.setText("");

                }
                }else{
                    textView59.setText("");
                    counter11 = 0;
                }
            }
        });

        textView59.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView59.getText() != "" ) {
                    textView59.setText("");
                    editText59.setVisibility(View.VISIBLE);
                    button59.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText60.getText().toString();
                textView60.setText(name12);
                editText60.setVisibility(View.INVISIBLE);
                button60.setVisibility(View.INVISIBLE);
            }
        });

        textView60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView60.setText("Oliver");
                    counter11 = counter11 + 1;

                if (textView57.getText() != "" || textView56.getText() != "" || textView59.getText() != "" || textView58.getText() != ""
                        || textView61.getText() != "" || textView62.getText() != "" )
                {
                    textView57.setText("");
                    textView56.setText("");
                    textView59.setText("");
                    textView61.setText("");
                    textView58.setText("");
                    textView62.setText("");

                }
            }else{
                textView60.setText("");
                counter11 = 0;
            }
            }
        });

        textView60.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView60.getText() != "" ) {
                    textView60.setText("");
                    editText60.setVisibility(View.VISIBLE);
                    button60.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText61.getText().toString();
                textView61.setText(name12);
                editText61.setVisibility(View.INVISIBLE);
                button61.setVisibility(View.INVISIBLE);
            }
        });

        textView61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView61.setText("Oliver");
                    counter11 = counter11 + 1;

                if (textView57.getText() != "" || textView56.getText() != "" || textView58.getText() != "" || textView60.getText() != ""
                        || textView59.getText() != "" || textView62.getText() != "" )
                {
                    textView57.setText("");
                    textView56.setText("");
                    textView58.setText("");
                    textView60.setText("");
                    textView59.setText("");
                    textView62.setText("");

                }
                }else{
                    textView61.setText("");
                    counter11 = 0;
                }
            }
        });

        textView61.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView61.getText() != "" ) {
                    textView61.setText("");
                    editText61.setVisibility(View.VISIBLE);
                    button61.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText62.getText().toString();
                textView62.setText(name12);
                editText62.setVisibility(View.INVISIBLE);
                button62.setVisibility(View.INVISIBLE);
            }
        });

        textView62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView62.setText("Oliver");
                    counter11 = counter11 + 1;

                if (textView57.getText() != "" || textView56.getText() != "" || textView58.getText() != "" || textView60.getText() != ""
                        || textView61.getText() != "" || textView59.getText() != "" )
                {
                    textView57.setText("");
                    textView56.setText("");
                    textView58.setText("");
                    textView60.setText("");
                    textView61.setText("");
                    textView59.setText("");

                }
            }else{
                textView62.setText("");
                counter11 = 0;
            }
            }
        });

        textView62.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView62.getText() != "" ) {
                    textView62.setText("");
                    editText62.setVisibility(View.VISIBLE);
                    button62.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText63.getText().toString();
                textView63.setText(name12);
                editText63.setVisibility(View.INVISIBLE);
                button63.setVisibility(View.INVISIBLE);
            }
        });

        textView63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                textView63.setText("Christopher");
                    counter11 = counter11 + 1;

                if (textView64.getText() != "" || textView65.getText() != "" || textView66.getText() != "" || textView67.getText() != ""
                        || textView68.getText() != "" || textView69.getText() != "")
                {
                    textView64.setText("");
                    textView65.setText("");
                    textView66.setText("");
                    textView67.setText("");
                    textView68.setText("");
                    textView69.setText("");
                }
                }else{
                    textView63.setText("");
                    counter11 = 0;
                }
            }
        });

        textView63.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView63.getText() != "" ) {
                    textView63.setText("");
                    editText63.setVisibility(View.VISIBLE);
                    button63.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText64.getText().toString();
                textView64.setText(name12);
                editText64.setVisibility(View.INVISIBLE);
                button64.setVisibility(View.INVISIBLE);
            }
        });

        textView64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView64.setText("Christopher");
                    counter11 = counter11 + 1;

                if (textView63.getText() != "" || textView65.getText() != "" || textView66.getText() != "" || textView67.getText() != ""
                        || textView68.getText() != "" || textView69.getText() != "")
                {
                    textView63.setText("");
                    textView65.setText("");
                    textView66.setText("");
                    textView67.setText("");
                    textView68.setText("");
                    textView69.setText("");
                }
                }else{
                    textView64.setText("");
                    counter11 = 0;
                }
            }
        });

        textView64.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView64.getText() != "" ) {
                    textView64.setText("");
                    editText64.setVisibility(View.VISIBLE);
                    button64.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText65.getText().toString();
                textView65.setText(name12);
                editText65.setVisibility(View.INVISIBLE);
                button65.setVisibility(View.INVISIBLE);
            }
        });

        textView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView65.setText("Christopher");
                    counter11 = counter11 + 1;

                if (textView64.getText() != "" || textView63.getText() != "" || textView66.getText() != "" || textView67.getText() != ""
                        || textView68.getText() != "" || textView69.getText() != "")
                {
                    textView64.setText("");
                    textView63.setText("");
                    textView66.setText("");
                    textView67.setText("");
                    textView68.setText("");
                    textView69.setText("");
                }
            }else{
                textView65.setText("");
                counter11 = 0;
            }
            }
        });

        textView65.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView65.getText() != "" ) {
                    textView65.setText("");
                    editText65.setVisibility(View.VISIBLE);
                    button65.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText66.getText().toString();
                textView66.setText(name12);
                editText66.setVisibility(View.INVISIBLE);
                button66.setVisibility(View.INVISIBLE);
            }
        });

        textView66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView66.setText("Christopher");
                    counter11 = counter11 + 1;

                if (textView64.getText() != "" || textView65.getText() != "" || textView63.getText() != "" || textView67.getText() != ""
                        || textView68.getText() != "" || textView69.getText() != "")
                {
                    textView63.setText("");
                    textView65.setText("");
                    textView64.setText("");
                    textView67.setText("");
                    textView68.setText("");
                    textView69.setText("");
                }
                }else{
                    textView66.setText("");
                    counter11 = 0;
                }
            }
        });

        textView66.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView66.getText() != "" ) {
                    textView66.setText("");
                    editText66.setVisibility(View.VISIBLE);
                    button66.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText67.getText().toString();
                textView67.setText(name12);
                editText67.setVisibility(View.INVISIBLE);
                button67.setVisibility(View.INVISIBLE);
            }
        });

        textView67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView67.setText("Christopher");
                    counter11 = counter11 + 1;

                if (textView64.getText() != "" || textView65.getText() != "" || textView66.getText() != "" || textView63.getText() != ""
                        || textView68.getText() != "" || textView69.getText() != "")
                {
                    textView64.setText("");
                    textView65.setText("");
                    textView66.setText("");
                    textView63.setText("");
                    textView68.setText("");
                    textView69.setText("");
                }
                }else{
                    textView67.setText("");
                    counter11 = 0;
                }
            }
        });

        textView67.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView67.getText() != "" ) {
                    textView67.setText("");
                    editText67.setVisibility(View.VISIBLE);
                    button67.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText68.getText().toString();
                textView68.setText(name12);
                editText68.setVisibility(View.INVISIBLE);
                button68.setVisibility(View.INVISIBLE);
            }
        });

        textView68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView68.setText("Christopher");
                    counter11 = counter11 + 1;

                    if (textView63.getText() != "" || textView65.getText() != "" || textView66.getText() != "" || textView67.getText() != ""
                        || textView64.getText() != "" || textView69.getText() != "")
                {
                    textView63.setText("");
                    textView65.setText("");
                    textView66.setText("");
                    textView67.setText("");
                    textView64.setText("");
                    textView69.setText("");
                }
            }else{
                textView68.setText("");
                counter11 = 0;
            }
            }
        });

        textView68.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView68.getText() != "" ) {
                    textView68.setText("");
                    editText68.setVisibility(View.VISIBLE);
                    button68.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText69.getText().toString();
                textView69.setText(name12);
                editText69.setVisibility(View.INVISIBLE);
                button69.setVisibility(View.INVISIBLE);
            }
        });

        textView69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView69.setText("Christopher");
                    counter11 = counter11 + 1;

                if (textView63.getText() != "" || textView65.getText() != "" || textView66.getText() != "" || textView67.getText() != ""
                        || textView68.getText() != "" || textView64.getText() != "")
                {
                    textView63.setText("");
                    textView65.setText("");
                    textView66.setText("");
                    textView67.setText("");
                    textView68.setText("");
                    textView64.setText("");
                }
                }else{
                    textView69.setText("");
                    counter11 = 0;
                }

            }
        });

        textView69.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView69.getText() != "" ) {
                    textView69.setText("");
                    editText69.setVisibility(View.VISIBLE);
                    button69.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText70.getText().toString();
                textView70.setText(name12);
                editText70.setVisibility(View.INVISIBLE);
                button70.setVisibility(View.INVISIBLE);
            }
        });

        textView70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView70.setText("Roman");
                    counter11 = counter11 + 1;
                if (textView71.getText() != "" || textView72.getText() != "" || textView73.getText() != "" || textView74.getText() != ""
                        || textView75.getText() != "" || textView76.getText() != "")
                {
                    textView71.setText("");
                    textView72.setText("");
                    textView73.setText("");
                    textView74.setText("");
                    textView75.setText("");
                    textView76.setText("");


                }
                }else{
                    textView70.setText("");
                    counter11 = 0;
                }
            }
        });

        textView70.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView70.getText() != "" ) {
                    textView70.setText("");
                    editText70.setVisibility(View.VISIBLE);
                    button70.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText71.getText().toString();
                textView71.setText(name12);
                editText71.setVisibility(View.INVISIBLE);
                button71.setVisibility(View.INVISIBLE);
            }
        });

        textView71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView71.setText("Roman");
                    counter11 = counter11 + 1;
                if (textView70.getText() != "" || textView72.getText() != "" || textView73.getText() != "" || textView74.getText() != ""
                        || textView75.getText() != "" || textView76.getText() != "")
                {
                    textView70.setText("");
                    textView72.setText("");
                    textView73.setText("");
                    textView74.setText("");
                    textView75.setText("");
                    textView76.setText("");


                }
            }else{
                textView71.setText("");
                counter11 = 0;
            }
            }
        });

        textView71.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView71.getText() != "" ) {
                    textView71.setText("");
                    editText71.setVisibility(View.VISIBLE);
                    button71.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText72.getText().toString();
                textView72.setText(name12);
                editText72.setVisibility(View.INVISIBLE);
                button72.setVisibility(View.INVISIBLE);
            }
        });

        textView72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView72.setText("Roman");
                    counter11 = counter11 + 1;

                if (textView71.getText() != "" || textView70.getText() != "" || textView73.getText() != "" || textView74.getText() != ""
                        || textView75.getText() != "" || textView76.getText() != "")
                {
                    textView71.setText("");
                    textView70.setText("");
                    textView73.setText("");
                    textView74.setText("");
                    textView75.setText("");
                    textView76.setText("");


                }
                }else{
                    textView72.setText("");
                    counter11 = 0;
                }
            }
        });

        textView72.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView72.getText() != "" ) {
                    textView72.setText("");
                    editText72.setVisibility(View.VISIBLE);
                    button72.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText73.getText().toString();
                textView73.setText(name12);
                editText73.setVisibility(View.INVISIBLE);
                button73.setVisibility(View.INVISIBLE);
            }
        });

        textView73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView73.setText("Roman");
                    counter11 = counter11 + 1;

                if (textView71.getText() != "" || textView72.getText() != "" || textView70.getText() != "" || textView74.getText() != ""
                        || textView75.getText() != "" || textView76.getText() != "")
                {
                    textView71.setText("");
                    textView72.setText("");
                    textView70.setText("");
                    textView74.setText("");
                    textView75.setText("");
                    textView76.setText("");


                }
                }else{
                    textView73.setText("");
                    counter11 = 0;
                }
            }
        });

        textView73.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView73.getText() != "" ) {
                    textView73.setText("");
                    editText73.setVisibility(View.VISIBLE);
                    button73.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText74.getText().toString();
                textView74.setText(name12);
                editText74.setVisibility(View.INVISIBLE);
                button74.setVisibility(View.INVISIBLE);
            }
        });

        textView74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView74.setText("Roman");
                    counter11 = counter11 + 1;
                if (textView71.getText() != "" || textView72.getText() != "" || textView73.getText() != "" || textView70.getText() != ""
                        || textView75.getText() != "" || textView76.getText() != "")
                {
                    textView71.setText("");
                    textView72.setText("");
                    textView73.setText("");
                    textView74.setText("");
                    textView75.setText("");
                    textView76.setText("");


                }
            }else{
                textView74.setText("");
                counter11 = 0;
            }
            }
        });

        textView74.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView74.getText() != "" ) {
                    textView74.setText("");
                    editText74.setVisibility(View.VISIBLE);
                    button74.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        button75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText75.getText().toString();
                textView75.setText(name12);
                editText75.setVisibility(View.INVISIBLE);
                button75.setVisibility(View.INVISIBLE);
            }
        });

        textView75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView75.setText("Roman");
                    counter11 = counter11 + 1;

                if (textView71.getText() != "" || textView72.getText() != "" || textView73.getText() != "" || textView74.getText() != ""
                        || textView70.getText() != "" || textView76.getText() != "")
                {
                    textView71.setText("");
                    textView72.setText("");
                    textView73.setText("");
                    textView74.setText("");
                    textView70.setText("");
                    textView76.setText("");


                }
                }else{
                    textView75.setText("");
                    counter11 = 0;
                }
            }
        });

        textView75.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView75.getText() != "" ) {
                    textView75.setText("");
                    editText75.setVisibility(View.VISIBLE);
                    button75.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText76.getText().toString();
                textView76.setText(name12);
                editText76.setVisibility(View.INVISIBLE);
                button76.setVisibility(View.INVISIBLE);
            }
        });

        textView76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView76.setText("Roman");
                    counter11 = counter11 + 1;

                if (textView71.getText() != "" || textView72.getText() != "" || textView73.getText() != "" || textView74.getText() != ""
                        || textView75.getText() != "" || textView70.getText() != "")
                {
                    textView71.setText("");
                    textView72.setText("");
                    textView73.setText("");
                    textView74.setText("");
                    textView75.setText("");
                    textView70.setText("");


                }
                }else{
                    textView76.setText("");
                    counter11 = 0;
                }
            }
        });

        textView76.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView76.getText() != "" ) {
                    textView76.setText("");
                    editText76.setVisibility(View.VISIBLE);
                    button76.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText77.getText().toString();
                textView77.setText(name12);
                editText77.setVisibility(View.INVISIBLE);
                button77.setVisibility(View.INVISIBLE);
            }
        });

        textView77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView77.setText("Joel");
                    counter11 = counter11 + 1;


                    if (textView78.getText() != "" || textView79.getText() != "" || textView80.getText() != "" || textView81.getText() != ""
                        || textView82.getText() != "" || textView83.getText() != "")
                {
                    textView78.setText("");
                    textView79.setText("");
                    textView80.setText("");
                    textView81.setText("");
                    textView82.setText("");
                    textView83.setText("");

                }
            }else{
                textView77.setText("");
                counter11 = 0;
            }
            }
        });

        textView77.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView77.getText() != "" ) {
                    textView77.setText("");
                    editText77.setVisibility(View.VISIBLE);
                    button77.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText78.getText().toString();
                textView78.setText(name12);
                editText78.setVisibility(View.INVISIBLE);
                button78.setVisibility(View.INVISIBLE);
            }
        });

        textView78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView78.setText("Joel");
                    counter11 = counter11 + 1;
                if (textView77.getText() != "" || textView79.getText() != "" || textView80.getText() != "" || textView81.getText() != ""
                        || textView82.getText() != "" || textView83.getText() != "")
                {
                    textView77.setText("");
                    textView79.setText("");
                    textView80.setText("");
                    textView81.setText("");
                    textView82.setText("");
                    textView83.setText("");

                }
                }else{
                    textView78.setText("");
                    counter11 = 0;
                }
            }
        });

        textView78.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView78.getText() != "" ) {
                    textView78.setText("");
                    editText78.setVisibility(View.VISIBLE);
                    button78.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText79.getText().toString();
                textView79.setText(name12);
                editText79.setVisibility(View.INVISIBLE);
                button79.setVisibility(View.INVISIBLE);
            }
        });

        textView79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView79.setText("Joel");
                    counter11 = counter11 + 1;

                if (textView77.getText() != "" || textView78.getText() != "" || textView80.getText() != "" || textView81.getText() != ""
                        || textView82.getText() != "" || textView83.getText() != "")
                {
                    textView77.setText("");
                    textView78.setText("");
                    textView80.setText("");
                    textView81.setText("");
                    textView82.setText("");
                    textView83.setText("");

                }
            }else{
                textView79.setText("");
                counter11 = 0;
            }
            }
        });

        textView79.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView79.getText() != "" ) {
                    textView79.setText("");
                    editText79.setVisibility(View.VISIBLE);
                    button79.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText80.getText().toString();
                textView80.setText(name12);
                editText80.setVisibility(View.INVISIBLE);
                button80.setVisibility(View.INVISIBLE);
            }
        });

        textView80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView80.setText("Joel");
                    counter11 = counter11 + 1;

                if (textView78.getText() != "" || textView79.getText() != "" || textView77.getText() != "" || textView81.getText() != ""
                        || textView82.getText() != "" || textView83.getText() != "")
                {
                    textView78.setText("");
                    textView79.setText("");
                    textView77.setText("");
                    textView81.setText("");
                    textView82.setText("");
                    textView83.setText("");

                }
                }else{
                    textView80.setText("");
                    counter11 = 0;
                }
            }
        });

        textView80.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView80.getText() != "" ) {
                    textView80.setText("");
                    editText80.setVisibility(View.VISIBLE);
                    button80.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText81.getText().toString();
                textView81.setText(name12);
                editText81.setVisibility(View.INVISIBLE);
                button81.setVisibility(View.INVISIBLE);
            }
        });

        textView81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView81.setText("Joel");
                    counter11 = counter11 + 1;

                if (textView78.getText() != "" || textView79.getText() != "" || textView80.getText() != "" || textView77.getText() != ""
                        || textView82.getText() != "" || textView83.getText() != "")
                {
                    textView78.setText("");
                    textView79.setText("");
                    textView80.setText("");
                    textView77.setText("");
                    textView82.setText("");
                    textView83.setText("");

                }
            }else{
                textView81.setText("");
                counter11 = 0;
            }
            }
        });

        textView81.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView81.getText() != "" ) {
                    textView81.setText("");
                    editText81.setVisibility(View.VISIBLE);
                    button81.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText82.getText().toString();
                textView82.setText(name12);
                editText82.setVisibility(View.INVISIBLE);
                button82.setVisibility(View.INVISIBLE);
            }
        });

        textView82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView82.setText("Joel");
                    counter11 = counter11 + 1;

                if (textView78.getText() != "" || textView79.getText() != "" || textView80.getText() != "" || textView81.getText() != ""
                        || textView77.getText() != "" || textView83.getText() != "")
                {
                    textView78.setText("");
                    textView79.setText("");
                    textView80.setText("");
                    textView81.setText("");
                    textView77.setText("");
                    textView83.setText("");

                }
                }else{
                    textView82.setText("");
                    counter11 = 0;
                }
            }
        });

        textView82.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView82.getText() != "" ) {
                    textView82.setText("");
                    editText82.setVisibility(View.VISIBLE);
                    button82.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText83.getText().toString();
                textView83.setText(name12);
                editText83.setVisibility(View.INVISIBLE);
                button83.setVisibility(View.INVISIBLE);
            }
        });

        textView83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView83.setText("Joel");
                    counter11 = counter11 + 1;

                if (textView78.getText() != "" || textView79.getText() != "" || textView80.getText() != "" || textView81.getText() != ""
                        || textView82.getText() != "" || textView77.getText() != "")
                {
                    textView78.setText("");
                    textView79.setText("");
                    textView80.setText("");
                    textView81.setText("");
                    textView82.setText("");
                    textView77.setText("");

                }
            }else{
                textView83.setText("");
                counter11 = 0;
            }
            }
        });

        textView83.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView83.getText() != "" ) {
                    textView83.setText("");
                    editText83.setVisibility(View.VISIBLE);
                    button83.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText84.getText().toString();
                textView84.setText(name12);
                editText84.setVisibility(View.INVISIBLE);
                button84.setVisibility(View.INVISIBLE);
            }
        });

        textView84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView84.setText("Roger");
                    counter11 = counter11 + 1;
                if (textView85.getText() != "" || textView86.getText() != "" || textView87.getText() != "" || textView88.getText() != ""
                        || textView89.getText() != "" || textView90.getText() != "")
                {
                    textView85.setText("");
                    textView86.setText("");
                    textView87.setText("");
                    textView88.setText("");
                    textView89.setText("");
                    textView90.setText("");

                }
                }else{
                    textView84.setText("");
                    counter11 = 0;
                }
            }
        });

        textView84.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView84.getText() != "" ) {
                    textView84.setText("");
                    editText84.setVisibility(View.VISIBLE);
                    button84.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText85.getText().toString();
                textView85.setText(name12);
                editText85.setVisibility(View.INVISIBLE);
                button85.setVisibility(View.INVISIBLE);
            }
        });

        textView85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView85.setText("Roger");
                    counter11 = counter11 + 1;
                if (textView84.getText() != "" || textView86.getText() != "" || textView87.getText() != "" || textView88.getText() != ""
                        || textView89.getText() != "" || textView90.getText() != "")
                {
                    textView84.setText("");
                    textView86.setText("");
                    textView87.setText("");
                    textView88.setText("");
                    textView89.setText("");
                    textView90.setText("");

                }
            }else{
                textView85.setText("");
                counter11 = 0;
            }
            }
        });

        textView85.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView85.getText() != "" ) {
                    textView85.setText("");
                    editText85.setVisibility(View.VISIBLE);
                    button85.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText86.getText().toString();
                textView86.setText(name12);
                editText86.setVisibility(View.INVISIBLE);
                button86.setVisibility(View.INVISIBLE);
            }
        });

        textView86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView86.setText("Roger");
                    counter11 = counter11 + 1;

                if (textView85.getText() != "" || textView84.getText() != "" || textView87.getText() != "" || textView88.getText() != ""
                        || textView89.getText() != "" || textView90.getText() != "")
                {
                    textView85.setText("");
                    textView84.setText("");
                    textView87.setText("");
                    textView88.setText("");
                    textView89.setText("");
                    textView90.setText("");

                }
                }else{
                    textView86.setText("");
                    counter11 = 0;
                }
            }
        });

        textView86.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView86.getText() != "" ) {
                    textView86.setText("");
                    editText86.setVisibility(View.VISIBLE);
                    button86.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText87.getText().toString();
                textView87.setText(name12);
                editText87.setVisibility(View.INVISIBLE);
                button87.setVisibility(View.INVISIBLE);
            }
        });

        textView87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView87.setText("Roger");
                    counter11 = counter11 + 1;

                if (textView85.getText() != "" || textView86.getText() != "" || textView84.getText() != "" || textView88.getText() != ""
                        || textView89.getText() != "" || textView90.getText() != "")
                {
                    textView85.setText("");
                    textView86.setText("");
                    textView84.setText("");
                    textView88.setText("");
                    textView89.setText("");
                    textView90.setText("");

                }
            }else{
                textView87.setText("");
                counter11 = 0;
            }
            }
        });

        textView87.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView87.getText() != "" ) {
                    textView87.setText("");
                    editText87.setVisibility(View.VISIBLE);
                    button87.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText88.getText().toString();
                textView88.setText(name12);
                editText88.setVisibility(View.INVISIBLE);
                button88.setVisibility(View.INVISIBLE);
            }
        });

        textView88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView88.setText("Roger");
                    counter11 = counter11 + 1;

                if (textView85.getText() != "" || textView86.getText() != "" || textView87.getText() != "" || textView84.getText() != ""
                        || textView89.getText() != "" || textView90.getText() != "")
                {
                    textView85.setText("");
                    textView86.setText("");
                    textView87.setText("");
                    textView84.setText("");
                    textView89.setText("");
                    textView90.setText("");

                }
                }else{
                    textView88.setText("");
                    counter11 = 0;
                }
            }
        });

        textView88.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView88.getText() != "" ) {
                    textView88.setText("");
                    editText88.setVisibility(View.VISIBLE);
                    button88.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });



        button89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText89.getText().toString();
                textView89.setText(name12);
                editText89.setVisibility(View.INVISIBLE);
                button89.setVisibility(View.INVISIBLE);
            }
        });

        textView89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView89.setText("Roger");
                    counter11 = counter11 + 1;

                if (textView85.getText() != "" || textView86.getText() != "" || textView87.getText() != "" || textView88.getText() != ""
                        || textView84.getText() != "" || textView90.getText() != "")
                {
                    textView85.setText("");
                    textView86.setText("");
                    textView87.setText("");
                    textView88.setText("");
                    textView84.setText("");
                    textView90.setText("");

                }
            }else{
                textView89.setText("");
                counter11 = 0;
            }
            }
        });

        textView89.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView89.getText() != "" ) {
                    textView89.setText("");
                    editText89.setVisibility(View.VISIBLE);
                    button89.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText90.getText().toString();
                textView90.setText(name12);
                editText90.setVisibility(View.INVISIBLE);
                button90.setVisibility(View.INVISIBLE);
            }
        });

        textView90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView90.setText("Roger");
                    counter11 = counter11 + 1;

                if (textView85.getText() != "" || textView86.getText() != "" || textView87.getText() != "" || textView88.getText() != ""
                        || textView89.getText() != "" || textView84.getText() != "")
                {
                    textView85.setText("");
                    textView86.setText("");
                    textView87.setText("");
                    textView88.setText("");
                    textView89.setText("");
                    textView84.setText("");

                }
                }else{
                    textView90.setText("");
                    counter11 = 0;
                }
            }
        });

        textView90.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView90.getText() != "" ) {
                    textView90.setText("");
                    editText90.setVisibility(View.VISIBLE);
                    button90.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText91.getText().toString();
                textView91.setText(name12);
                editText91.setVisibility(View.INVISIBLE);
                button91.setVisibility(View.INVISIBLE);
            }
        });

        textView91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView91.setText("Pedro");
                    counter11 = counter11 + 1;

                if (textView92.getText() != "" || textView93.getText() != "" || textView94.getText() != "" || textView95.getText() != ""
                        || textView96.getText() != "" || textView97.getText() != "")
                {
                    textView92.setText("");
                    textView93.setText("");
                    textView94.setText("");
                    textView95.setText("");
                    textView96.setText("");
                    textView97.setText("");


                }
            }else{
                textView91.setText("");
                counter11 = 0;
            }
            }
        });

        textView91.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView91.getText() != "" ) {
                    textView91.setText("");
                    editText91.setVisibility(View.VISIBLE);
                    button91.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText92.getText().toString();
                textView92.setText(name12);
                editText92.setVisibility(View.INVISIBLE);
                button92.setVisibility(View.INVISIBLE);
            }
        });

        textView92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView92.setText("Pedro");
                    counter11 = counter11 + 1;

                if (textView91.getText() != "" || textView93.getText() != "" || textView94.getText() != "" || textView95.getText() != ""
                        || textView96.getText() != "" || textView97.getText() != "")
                {
                    textView91.setText("");
                    textView93.setText("");
                    textView94.setText("");
                    textView95.setText("");
                    textView96.setText("");
                    textView97.setText("");


                }
                }else{
                    textView92.setText("");
                    counter11 = 0;
                }
            }
        });

        textView92.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView92.getText() != "" ) {
                    textView92.setText("");
                    editText92.setVisibility(View.VISIBLE);
                    button92.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText93.getText().toString();
                textView93.setText(name12);
                editText93.setVisibility(View.INVISIBLE);
                button93.setVisibility(View.INVISIBLE);
            }
        });

        textView93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView93.setText("Pedro");
                    counter11 = counter11 + 1;

                if (textView92.getText() != "" || textView91.getText() != "" || textView94.getText() != "" || textView95.getText() != ""
                        || textView96.getText() != "" || textView97.getText() != "")
                {
                    textView92.setText("");
                    textView91.setText("");
                    textView94.setText("");
                    textView95.setText("");
                    textView96.setText("");
                    textView97.setText("");


                }
            }else{
                textView93.setText("");
                counter11 = 0;
            }
            }
        });

        textView93.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView93.getText() != "" ) {
                    textView93.setText("");
                    editText93.setVisibility(View.VISIBLE);
                    button93.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


        button94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText94.getText().toString();
                textView94.setText(name12);
                editText94.setVisibility(View.INVISIBLE);
                button94.setVisibility(View.INVISIBLE);
            }
        });

        textView94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView94.setText("Pedro");
                    counter11 = counter11 + 1;

                if (textView92.getText() != "" || textView93.getText() != "" || textView91.getText() != "" || textView95.getText() != ""
                        || textView96.getText() != "" || textView97.getText() != "")
                {
                    textView92.setText("");
                    textView93.setText("");
                    textView91.setText("");
                    textView95.setText("");
                    textView96.setText("");
                    textView97.setText("");


                }
                }else{
                    textView94.setText("");
                    counter11 = 0;
                }
            }
        });

        textView94.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView94.getText() != "" ) {
                    textView94.setText("");
                    editText94.setVisibility(View.VISIBLE);
                    button94.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText95.getText().toString();
                textView95.setText(name12);
                editText95.setVisibility(View.INVISIBLE);
                button95.setVisibility(View.INVISIBLE);
            }
        });

        textView95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView95.setText("Pedro");
                    counter11 = counter11 + 1;

                if (textView92.getText() != "" || textView93.getText() != "" || textView94.getText() != "" || textView91.getText() != ""
                        || textView96.getText() != "" || textView97.getText() != "")
                {
                    textView92.setText("");
                    textView93.setText("");
                    textView94.setText("");
                    textView91.setText("");
                    textView96.setText("");
                    textView97.setText("");


                }
            }else{
                textView95.setText("");
                counter11 = 0;
            }
            }
        });

        textView95.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView95.getText() != "" ) {
                    textView95.setText("");
                    editText95.setVisibility(View.VISIBLE);
                    button95.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText96.getText().toString();
                textView96.setText(name12);
                editText96.setVisibility(View.INVISIBLE);
                button96.setVisibility(View.INVISIBLE);
            }
        });

        textView96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counter11 == 0) {
                    textView96.setText("Pedro");
                    counter11 = counter11 + 1;

                if (textView92.getText() != "" || textView93.getText() != "" || textView94.getText() != "" || textView95.getText() != ""
                        || textView91.getText() != "" || textView97.getText() != "")
                {
                    textView92.setText("");
                    textView93.setText("");
                    textView94.setText("");
                    textView95.setText("");
                    textView91.setText("");
                    textView97.setText("");


                }

                }else{
                    textView96.setText("");
                    counter11 = 0;
                }
            }
        });

        textView96.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView96.getText() != "" ) {
                    textView96.setText("");
                    editText96.setVisibility(View.VISIBLE);
                    button96.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText97.getText().toString();
                textView97.setText(name12);
                editText97.setVisibility(View.INVISIBLE);
                button97.setVisibility(View.INVISIBLE);
            }
        });

        textView97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView97.setText("Pedro");
                    counter11 = counter11 + 1;

                if (textView92.getText() != "" || textView93.getText() != "" || textView94.getText() != "" || textView95.getText() != ""
                        || textView96.getText() != "" || textView91.getText() != "")
                {
                    textView92.setText("");
                    textView93.setText("");
                    textView94.setText("");
                    textView95.setText("");
                    textView96.setText("");
                    textView91.setText("");


                }
            }else{
                textView97.setText("");
                counter11 = 0;
            }
            }
        });

        textView97.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView97.getText() != "" ) {
                    textView97.setText("");
                    editText97.setVisibility(View.VISIBLE);
                    button97.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText98.getText().toString();
                textView98.setText(name12);
                editText98.setVisibility(View.INVISIBLE);
                button98.setVisibility(View.INVISIBLE);
            }
        });

        textView98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView98.setText("Klaus");
                    counter11 = counter11 + 1;


                    if (textView99.getText() != "" || textView100.getText() != "" || textView101.getText() != "" || textView102.getText() != ""
                        || textView103.getText() != "" || textView104.getText() != "")
                {
                    textView99.setText("");
                    textView100.setText("");
                    textView101.setText("");
                    textView102.setText("");
                    textView103.setText("");
                    textView104.setText("");


                }
                }else{
                    textView98.setText("");
                    counter11 = 0;
                }
            }
        });

        textView98.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView98.getText() != "" ) {
                    textView98.setText("");
                    editText98.setVisibility(View.VISIBLE);
                    button98.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText99.getText().toString();
                textView99.setText(name12);
                editText99.setVisibility(View.INVISIBLE);
                button99.setVisibility(View.INVISIBLE);
            }
        });

        textView99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView99.setText("Klaus");
                    counter11 = counter11 + 1;

                if (textView98.getText() != "" || textView100.getText() != "" || textView101.getText() != "" || textView102.getText() != ""
                        || textView103.getText() != "" || textView104.getText() != "")
                {
                    textView98.setText("");
                    textView100.setText("");
                    textView101.setText("");
                    textView102.setText("");
                    textView103.setText("");
                    textView104.setText("");


                }
            }else{
                textView99.setText("");
                counter11 = 0;
            }
            }
        });

        textView99.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView99.getText() != "" ) {
                    textView99.setText("");
                    editText99.setVisibility(View.VISIBLE);
                    button99.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText100.getText().toString();
                textView100.setText(name12);
                editText100.setVisibility(View.INVISIBLE);
                button100.setVisibility(View.INVISIBLE);
            }
        });

        textView100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView100.setText("Klaus");
                    counter11 = counter11 + 1;

                if (textView99.getText() != "" || textView98.getText() != "" || textView101.getText() != "" || textView102.getText() != ""
                        || textView103.getText() != "" || textView104.getText() != "")
                {
                    textView99.setText("");
                    textView98.setText("");
                    textView101.setText("");
                    textView102.setText("");
                    textView103.setText("");
                    textView104.setText("");


                }
        }else{
            textView100.setText("");
            counter11 = 0;
        }
            }
        });

        textView100.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView100.getText() != "" ) {
                    textView100.setText("");
                    editText100.setVisibility(View.VISIBLE);
                    button100.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText101.getText().toString();
                textView101.setText(name12);
                editText101.setVisibility(View.INVISIBLE);
                button101.setVisibility(View.INVISIBLE);
            }
        });

        textView101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counter11 == 0) {
                    textView101.setText("Klaus");
                    counter11 = counter11 + 1;

                if (textView99.getText() != "" || textView100.getText() != "" || textView98.getText() != "" || textView102.getText() != ""
                        || textView103.getText() != "" || textView104.getText() != "")
                {
                    textView99.setText("");
                    textView100.setText("");
                    textView98.setText("");
                    textView102.setText("");
                    textView103.setText("");
                    textView104.setText("");


                }
                }else{
                    textView101.setText("");
                    counter11 = 0;
                }
            }
        });

        textView101.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView101.getText() != "" ) {
                    textView101.setText("");
                    editText101.setVisibility(View.VISIBLE);
                    button101.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText102.getText().toString();
                textView102.setText(name12);
                editText102.setVisibility(View.INVISIBLE);
                button102.setVisibility(View.INVISIBLE);
            }
        });

        textView102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (counter11 == 0) {
                    textView102.setText("Klaus");
                    counter11 = counter11 + 1;

                if (textView99.getText() != "" || textView100.getText() != "" || textView101.getText() != "" || textView98.getText() != ""
                        || textView103.getText() != "" || textView104.getText() != "")
                {
                    textView99.setText("");
                    textView100.setText("");
                    textView101.setText("");
                    textView98.setText("");
                    textView103.setText("");
                    textView104.setText("");


                }
            }else{
                textView102.setText("");
                counter11 = 0;
            }
            }
        });

        textView102.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView102.getText() != "" ) {
                    textView102.setText("");
                    editText102.setVisibility(View.VISIBLE);
                    button102.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText103.getText().toString();
                textView103.setText(name12);
                editText103.setVisibility(View.INVISIBLE);
                button103.setVisibility(View.INVISIBLE);
            }
        });

        textView103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter11 == 0) {
                    textView103.setText("Klaus");
                    counter11 = counter11 + 1;

                if (textView99.getText() != "" || textView100.getText() != "" || textView101.getText() != "" || textView102.getText() != ""
                        || textView98.getText() != "" || textView104.getText() != "")
                {
                    textView99.setText("");
                    textView100.setText("");
                    textView101.setText("");
                    textView102.setText("");
                    textView98.setText("");
                    textView104.setText("");


                }
                }else{
                    textView103.setText("");
                    counter11 = 0;
                }
            }
        });

        textView103.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView103.getText() != "" ) {
                    textView103.setText("");
                    editText103.setVisibility(View.VISIBLE);
                    button103.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name12 = editText104.getText().toString();
                textView104.setText(name12);
                editText104.setVisibility(View.INVISIBLE);
                button104.setVisibility(View.INVISIBLE);
            }
        });

        textView104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (counter11 == 0) {
                        textView104.setText("Klaus");
                        counter11 = counter11 + 1;

                if (textView99.getText() != "" || textView100.getText() != "" || textView101.getText() != "" || textView102.getText() != ""
                        || textView103.getText() != "" || textView98.getText() != "")
                {
                    textView99.setText("");
                    textView100.setText("");
                    textView101.setText("");
                    textView102.setText("");
                    textView103.setText("");
                    textView98.setText("");


                }
                    }else{
                        textView104.setText("");
                        counter11 = 0;
                    }
            }
        });

        textView104.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (textView104.getText() != "" ) {
                    textView104.setText("");
                    editText104.setVisibility(View.VISIBLE);
                    button104.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

//        button105.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name12 = editText105.getText().toString();
//                textView105.setText(name12);
//                editText105.setVisibility(View.INVISIBLE);
//                button105.setVisibility(View.INVISIBLE);
//            }
//        });
//
//        textView105.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                editText105.setVisibility(View.VISIBLE);
//                button105.setVisibility(View.VISIBLE);
//            }
//        });
//
//        button106.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name12 = editText106.getText().toString();
//                textView106.setText(name12);
//                editText106.setVisibility(View.INVISIBLE);
//                button106.setVisibility(View.INVISIBLE);
//            }
//        });
//
//        textView106.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                editText106.setVisibility(View.VISIBLE);
//                button106.setVisibility(View.VISIBLE);
//            }
//        });
//
//        button107.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name12 = editText107.getText().toString();
//                textView107.setText(name12);
//                editText107.setVisibility(View.INVISIBLE);
//                button107.setVisibility(View.INVISIBLE);
//            }
//        });
//
//        textView107.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                editText107.setVisibility(View.VISIBLE);
//                button107.setVisibility(View.VISIBLE);
//            }
//        });
//
//        button108.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name12 = editText108.getText().toString();
//                textView108.setText(name12);
//                editText108.setVisibility(View.INVISIBLE);
//                button108.setVisibility(View.INVISIBLE);
//            }
//        });
//
//        textView108.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                editText108.setVisibility(View.VISIBLE);
//                button108.setVisibility(View.VISIBLE);
//            }
//        });
//
//        button109.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name12 = editText109.getText().toString();
//                textView109.setText(name12);
//                editText109.setVisibility(View.INVISIBLE);
//                button109.setVisibility(View.INVISIBLE);
//            }
//        });
//
//        textView109.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                editText109.setVisibility(View.VISIBLE);
//                button109.setVisibility(View.VISIBLE);
//            }
//        });
//
//        button110.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name12 = editText110.getText().toString();
//                textView110.setText(name12);
//                editText110.setVisibility(View.INVISIBLE);
//                button110.setVisibility(View.INVISIBLE);
//            }
//        });
//
//        textView110.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                editText110.setVisibility(View.VISIBLE);
//                button110.setVisibility(View.VISIBLE);
//            }
//        });
//
//
//        button111.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name12 = editText111.getText().toString();
//                textView111.setText(name12);
//                editText111.setVisibility(View.INVISIBLE);
//                button111.setVisibility(View.INVISIBLE);
//            }
//        });
//
//        textView111.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                editText111.setVisibility(View.VISIBLE);
//                button111.setVisibility(View.VISIBLE);
//            }
//        });




    }

//    private void initToolbar() {
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
//        actionBar.setHomeButtonEnabled(true);
//        actionBar.setTitle("HORNUSSEN APP");
//        //Tools.setSystemBarColor(this, R.color.light_green_700);
//    }

//    private void initNavigationMenu() {
//        NavigationView nav_view = (NavigationView) findViewById(R.id.nav_view);
//        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
//            public void onDrawerOpened(View drawerView) {
//                super.onDrawerOpened(drawerView);
//            }
//        };
//        drawer.setDrawerListener(toggle);
//        toggle.syncState();
//        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(final MenuItem item) {
//                Toast.makeText(getApplicationContext(), item.getTitle() + " Selected", Toast.LENGTH_SHORT).show();
//                actionBar.setTitle(item.getTitle());
//                drawer.closeDrawers();
//                return true;
//            }
//        });
//
//        // open drawer at start
//        drawer.openDrawer(GravityCompat.START);
//    }

    public void countClick(View v){

        counter++;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search_setting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != android.R.id.home) {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
