package com.mycompany.attending;




import android.app.*;
import java.util.*;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.*;
import android.util.Log;
import java.text.*;
import android.view.*;
import android.widget.*;
import android.graphics.*;

public class student2 extends Activity {
    int tl=0;
    String abc="";
    String name[][] = {
            {
                    "",
                    "HRUSHIKESH SUNIL GORE",
                    "OM SWAMI",
                    "ADITYA RAJ",
                    "KATREDDY PRANAV REDDY",
                    "AYUSHI DHETE",
                    "ABHAY PRASAD",
                    "SATYAM GUPTA",
                    "MAYANK",
                    "GARIKAPATI SAIRAM SHARAN",
                    "THATIKONDA VENKATA SAI TEJESH",
                    "KARAN AGARWAL",
                    "NIMMA AKSHITH REDDY",
                    "PARTH BANDWAL",
                    "JIGYASA JAMRA",
                    "GUNJKAR ADITYA GOPALRAO",
                    "PIYUSH KUMAR",
                    "RADHIKA KALANEE",
                    "SHAURYA KUMAR TRIPATHI",
                    "SWETA KUMARI",
                    "TANISHK KHANDELWAL",
                    "ANURAG YADAV",
                    "PRIYANSHU AGARWAL",
                    "SALONI GUPTA",
                    "KURAPATI VENKATA REVANTH",
                    "SAKSHI SAHU",
                    "TADIKONDA PURNANAGAPHANEENDRA",
                    "PRANAY BURADKAR",
                    "BHUVIKA AGRAWAL",
                    "TANISHQ RAJENDRRAA ASWAR",
                    "RISHIRAJ MUKHERJEE",
                    "HARSHIT RAJ",
                    "AMAN VISHWAKARMA",
                    "SUJAL PRAVIN PRAJAPATI",
                    "KOYYANI NAGA SAI YAAGHNETHA",
                    "ANANYA VARSHNEY",
                    "ANAMIKA KUMARI",
                    "CHAGAPURAM SRIVASTAV",
                    "ABHAY PRATAP  SINGH",
                    "BANAVATH MURALI",
                    "MANEESH SHUKLA",
                    "RISHABH KUSHWAHA",
                    "SALONI",
                    "DHEERAJ O",
                    "VISHAL PARIDA",
                    "NEELESH KUMAR MEENA",
                    "SHUBH AGARWAL",
                    "SARTHAK TIWARI",
                    "YATIN SHARMA",
                    "AYUSH YADAV",
                    "PRINCE YADAV",
                    "MANEESH KUMAR",
                    "HARSHIT MAHESHWARI",
                    "BADA MOKSHA SAI REDDY",
                    "VISHESH SINGH",
                    "ABHAY PRATAP SINGH AHIRWAR",
                    "AKSHITA AGARWAL",
                    "SAI LOKESH REDDY CHINTALAPUDI",
                    "SURAJ KUMAR",
                    "IMRANA SUMBUL"

            },
            {
                    "",
                    "NALLA HITHA SAI SRINATH",
                    "ANKIT",
                    "REBANT PRATAP SINGH",
                    "VIVEK TRIPATHI",
                    "YUWANSH BANSAL",
                    "SANYAM GUPTA",
                    "MULA YUVA HEMASRI",
                    "TAORI SNEHAL MANISH",
                    "SALUSHA",
                    "DEEPANSHI VERMA",
                    "V AKSHAYA",
                    "DEV DARSHAN",
                    "SATYAJIT SAHOO",
                    "ROHAN PRAKASH",
                    "SIDDHARTH SOLANKI",
                    "KURETI NIDHISH",
                    "LAKSHYA PRAJAPATI",
                    "ASHOK KAJI",
                    "AMOLLY CHOUDHARY",
                    "ANADI MEHTA",
                    "SOHAM SUNIL BALWANT",
                    "SANCHITA PATEL",
                    "MAHAMUNI ADITYA RAJESH",
                    "SHIVAM ZHAR",
                    "AJAY",
                    "RAGHVENDRA MISHRA",
                    "KUKKUDAPU SRINIDHI",
                    "YADAV KOUSHIK",
                    "ARSHIA ADHYA",
                    "CHILAMKURI KALYAN",
                    "SANKARAMADDI YAMINI",
                    "SIDDHARTH PALADI",
                    "VAIBHAV RAWAT",
                    "TANISHQ KANCHARLA",
                    "VEDANT SHASHIKANT JADHAV",
                    "NAYAAB ZAMEER QAZI",
                    "PAPPALA SAI SRI CHANDANA",
                    "MOHD HAIDER",
                    "SARTHAK NAYYAR",
                    "HITARTH SINGH RAJPUT",
                    "VINAYAK CHAURASIA",
                    "AKSHAT SINGH",
                    "SIDHARTH KUMAR SINGH",
                    "SUMIT KUMAR",
                    "ARYAM AGARWAL",
                    "BATTHI KARTHIK",
                    "MAYANK MISHRA",
                    "SANGALE SUMIT MAHADEO",
                    "KALVAKUNTLA GANA",
                    "PRANJAL SHARMA",
                    "ARYAN KADIAN",
                    "SATPUTE VISHAL SURYAKANT",
                    "JAGDISH SHANAMWAD",
                    "ANSH AGRAWAL",
                    "KARAMTOT PAVAN",
                    "PRAKASH KUMAR",
                    "M THARUN"
            },
            {
                    "",
                    "SHANTAPPA",
                    "DEORE NACHIKET JAYANT",
                    "PRATHAM DEEPAK HOLE",
                    "AJAY KUMAR BAGHEL",
                    "SPARSH SINHA",
                    "KRITIKA YADAV",
                    "AKSHAY KUMAR",
                    "DANGE RAUNAK ANIL",
                    "RAHUL NASKAR",
                    "UTKARSH GUPTA",
                    "DISHANT GARG",
                    "ANSH BHARGAVA",
                    "UJJWAL GOYAL",
                    "VAIDEHI JOSHI",
                    "KAITHEY HANIKA VASU",
                    "ESHANT GUPTA",
                    "RAJ RAKSHIT SHUKLA",
                    "ANUSHKA",
                    "ARYAN SHARMA",
                    "YEGGONI RANADEEP",
                    "APOORV MITTAL",
                    "TANMAY JANARDAN DESHMUKH",
                    "ASHWIN AVINASH GAJBHIYE",
                    "AKSHAY SHUKLA",
                    "SAHIN KAUSHAR",
                    "ERIN HELGA D SILVA",
                    "DIANA SOLOMON",
                    "HARDEE AMIT PAREKH",
                    "VAIBHAV VERMA",
                    "SHIVANG AGRAHARI",
                    "PRATEEK MISHRA",
                    "GHODINDE GAURAV DEEPAK",
                    "ATUL GOND",
                    "MANISH KUMAR",
                    "LAVISH SHAKYA",
                    "ABINASH NAYAK",
                    "ABHAY SAGAR",
                    "KESHAV PUNDHIR",
                    "PRASHIK HEMRAJ HUMANE",
                    "PESARA PRANILASH REDDY",
                    "RAVULA RAM CHARAN TEJA",
                    "ANJALI MEENA",
                    "BODA BABA",
                    "ANANYA KUCHHAL",
                    "TANISH MORAL",
                    "AMRITANSHU PRIYADARSHI",
                    "RANJNI SINGH RAJPUT",
                    "BHUMIKA WAHANE",
                    "ARUN KUMAR SWAMI",
                    "PIYUSH NAYAK",
                    "AMAN VERMA",
                    "NANERA ANKUR NITINBHAI",
                    "MEDHA BHARDWAJ",
                    "SHRESTH SHARMA",
                    "ADARSH VERMA",
                    "SAMEER ANIL PAZARE",
                    "SAYIMPU LEELA AAKASH",



            },
            {"",
                    "PRANJAY SINGH",
                    "TADUVAI JASWANTH PRUDHVI",
                    "ADITYA SINGH",
                    "CHERIPELLI VEDAMSH",
                    "SAANVI LOHANI",
                    "SHRISHTI DUBEY",
                    "AYUSHI AWASTHI",
                    "SHREYA JAMBHALE",
                    "RIYA PATIL",
                    "DEVISETTY SIRI MAYA LALITHA",
                    "ANJALI",
                    "DIGVIJAY RAHUL DESHMUKH",
                    "TARANG AGRAWAL",
                    "DIVA GOYAL",
                    "NATHAN JOJU THOMAS",
                    "DEVANSH VERMA",
                    "PAPABATTULA RUTHVIK",
                    "ASHUTOSH DAPAKARA",
                    "DEEVI RAHUL BHARADWAZ",
                    "ANNAM RADESH",
                    "AYUSH KUMAR",
                    "AKHAND PRATAP DHIRYAN",
                    "SHASHANK KUMAR",
                    "ANURAG ",
                    "PRASHANT KUMAR YADAV",
                    "ARJUN KUNWAR",
                    "PRIYANSHU SHAH",
                    "ABHINAV SAGAR",
                    "AMAN CHOUDHARY",
                    "MUSKAN AGRAWAL",
                    "SARTHAK KUMAR",
                    "NANDYALA SAI GANESH POSHITH",
                    "MASNE ADITYA RAVINDRA",
                    "UTKARSH SRIVASTAVA",
                    "MOHD KAIF",
                    "ANURAG KUMAR",
                    "ASHWINI KUMAR SINGH",
                    "GAGAN MISHRA",
                    "PRATUSH  SHYAM GUPT",
                    "SAGILI NITHIN",
                    "AKULA NAGASHIVA",
                    "PATIL NAKSHATRA RAJESH",
                    "NARESH KUMAR SIHAG",
                    "BANOTH SREEYA",
                    "VIVEK RATHORE",
                    "ADITYA SINGH CHANDEL",
                    "JOVIAL KANWADIA",
                    "KHUSHAL",
                    "RAHUL KUMAR",
                    "GOUTAM DAWAR",
                    "SHIV KAUSHIK",
                    "SWYAM KUMAR",
                    "SAFIYA NASIR",
                    "PIYUSH KANT",
                    "ABHAY SAHU",
                    "SEGU ROHITH KUMAR",
                    "YENDLURI VEDA AKASH NAIDU",
                    "LAKSHYA AGARWAL",
                    "PAGADALA ROMITH CHENNA KESAV",},


    };


    static int branch=0,branching=0;
    static String absent="";
    boolean at[] = new boolean[60];
    TextView tw[] = new TextView[60];
    int total = 0;
    int s[] = new int[60];
    String abs = "Absentees are : \n";
    Button b[] = new Button[60];
    TextView t[] = new TextView[60],textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        Intent bb=getIntent();






        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
        abc=sharedPreferences.getString("current","");
        textView2=findViewById(R.id.textView2);
        textView2.setText(sharedPreferences.getString("subject",""));


        Log.d("current", abc);

        //branching=bb.getIntExtra("branching",0);
        branching=sharedPreferences.getInt("branch",0);
        if(branching==4)
        {
            branch=1;
        }
        else if(branching==5)
        {
            branch=2;
        }
        else if(branching==6)
        {
            branch=0;
        }
        else  if(branching==7)
        {
            branch=3;
        }
        else
            branch=branching;
        textView=findViewById(R.id.textView);
        textView.setText(new FunUse().br[branch]);
        for (int i = 0; i < 60; i++) {
            s[i] = 0;
            at[i] = true;
        }
        tl=name[branch].length;
        t[1] = findViewById(R.id.t1);
        b[1] = findViewById(R.id.b1);

        t[2] = findViewById(R.id.t2);
        b[2] = findViewById(R.id.b2);

        t[3] = findViewById(R.id.t3);
        b[3] = findViewById(R.id.b3);

        t[4] = findViewById(R.id.t4);
        b[4] = findViewById(R.id.b4);

        t[5] = findViewById(R.id.t5);
        b[5] = findViewById(R.id.b5);

        t[6] = findViewById(R.id.t6);
        b[6] = findViewById(R.id.b6);

        t[7] = findViewById(R.id.t7);
        b[7] = findViewById(R.id.b7);
        t[7].setText("7 . "+name[branch][7]);

        t[8] = findViewById(R.id.t8);
        b[8] = findViewById(R.id.b8);
        t[8].setText("8 . "+name[branch][8]);


        t[9] = findViewById(R.id.t9);
        b[9] = findViewById(R.id.b9);
        t[9].setText("9 . "+name[branch][9]);

        t[10] = findViewById(R.id.t10);
        b[10] = findViewById(R.id.b10);
        t[10].setText("10 . "+name[branch][10]);

        t[11] = findViewById(R.id.t11);
        b[11] = findViewById(R.id.b11);
        t[11].setText("11 . "+name[branch][11]);

        t[12] = findViewById(R.id.t12);
        b[12] = findViewById(R.id.b12);
        t[12].setText("12 . "+name[branch][12]);

        t[13] = findViewById(R.id.t13);
        b[13] = findViewById(R.id.b13);
        t[13].setText("13 . "+name[branch][13]);

        t[14] = findViewById(R.id.t14);
        b[14] = findViewById(R.id.b14);
        t[14].setText("14 . "+name[branch][14]);

        t[15] = findViewById(R.id.t15);
        b[15] = findViewById(R.id.b15);
        t[15].setText("15 . "+name[branch][15]);

        t[16] = findViewById(R.id.t16);
        b[16] = findViewById(R.id.b16);
        t[16].setText("16 . "+name[branch][16]);

        t[17] = findViewById(R.id.t17);
        b[17] = findViewById(R.id.b17);
        t[17].setText("17 . "+name[branch][17]);

        t[18] = findViewById(R.id.t18);
        b[18] = findViewById(R.id.b18);
        t[18].setText("18 . "+name[branch][18]);

        t[19] = findViewById(R.id.t19);
        b[19] = findViewById(R.id.b19);
        t[19].setText("19 . "+name[branch][19]);

        t[20] = findViewById(R.id.t20);
        b[20] = findViewById(R.id.b20);
        t[20].setText("20 . "+name[branch][20]);


        t[21] = findViewById(R.id.t21);
        b[21] = findViewById(R.id.b21);
        t[21].setText("21 . "+name[branch][21]);


        t[22] = findViewById(R.id.t22);
        b[22] = findViewById(R.id.b22);
        t[22].setText("22 . "+name[branch][22]);

        t[23] = findViewById(R.id.t23);
        b[23] = findViewById(R.id.b23);
        t[23].setText("23 . "+name[branch][23]);

        t[24] = findViewById(R.id.t24);
        b[24] = findViewById(R.id.b24);
        t[24].setText("24 . "+name[branch][24]);

        t[25] = findViewById(R.id.t25);
        b[25] = findViewById(R.id.b25);
        t[25].setText("25 . "+name[branch][25]);


        t[26] = findViewById(R.id.t26);
        b[26] = findViewById(R.id.b26);
        t[26].setText("26 . "+name[branch][26]);

        t[27] = findViewById(R.id.t27);
        b[27] = findViewById(R.id.b27);
        t[27].setText("27 . "+name[branch][27]);


        t[28] = findViewById(R.id.t28);
        b[28] = findViewById(R.id.b28);
        t[28].setText("28 . "+name[branch][28]);


        t[29] = findViewById(R.id.t29);
        b[29] = findViewById(R.id.b29);
        t[29].setText("29 . "+name[branch][29]);


        t[30] = findViewById(R.id.t30);
        b[30] = findViewById(R.id.b30);
        t[30].setText("30 . "+name[branch][30]);


        t[31] = findViewById(R.id.t31);
        b[31] = findViewById(R.id.b31);
        t[31].setText("31 . "+name[branch][31]);



        t[32] = findViewById(R.id.t32);
        b[32] = findViewById(R.id.b32);
        t[32].setText("32 . "+name[branch][32]);



        t[33] = findViewById(R.id.t33);
        b[33] = findViewById(R.id.b33);
        t[33].setText("33 . "+name[branch][33]);



        t[34] = findViewById(R.id.t34);
        b[34] = findViewById(R.id.b34);
        t[34].setText("34 . "+name[branch][34]);



        t[35] = findViewById(R.id.t35);
        b[35] = findViewById(R.id.b35);
        t[35].setText("35 . "+name[branch][35]);



        t[36] = findViewById(R.id.t36);
        b[36] = findViewById(R.id.b36);
        t[36].setText("36 . "+name[branch][36]);



        t[37] = findViewById(R.id.t37);
        b[37] = findViewById(R.id.b37);
        t[37].setText("37 . "+name[branch][37]);



        t[38] = findViewById(R.id.t38);
        b[38] = findViewById(R.id.b38);
        t[38].setText("38 . "+name[branch][38]);



        t[39] = findViewById(R.id.t39);
        b[39] = findViewById(R.id.b39);
        t[39].setText("39 . "+name[branch][39]);



        t[40] = findViewById(R.id.t40);
        b[40] = findViewById(R.id.b40);
        t[40].setText("40 . "+name[branch][40]);



        t[41] = findViewById(R.id.t41);
        b[41] = findViewById(R.id.b41);
        t[41].setText("41 . "+name[branch][41]);



        t[42] = findViewById(R.id.t42);
        b[42] = findViewById(R.id.b42);
        t[42].setText("42 . "+name[branch][42]);



        t[43] = findViewById(R.id.t43);
        b[43] = findViewById(R.id.b43);
        t[43].setText("43 . "+name[branch][43]);



        t[44] = findViewById(R.id.t44);
        b[44] = findViewById(R.id.b44);
        t[44].setText("44 . "+name[branch][44]);



        t[45] = findViewById(R.id.t45);
        b[45] = findViewById(R.id.b45);
        t[45].setText("45 . "+name[branch][45]);



        t[46] = findViewById(R.id.t46);
        b[46] = findViewById(R.id.b46);
        t[46].setText("46 . "+name[branch][46]);



        t[47] = findViewById(R.id.t47);
        b[47] = findViewById(R.id.b47);
        t[47].setText("47 . "+name[branch][47]);



        t[48] = findViewById(R.id.t48);
        b[48] = findViewById(R.id.b48);
        t[48].setText("48 . "+name[branch][48]);



        t[49] = findViewById(R.id.t49);
        b[49] = findViewById(R.id.b49);
        t[49].setText("49 . "+name[branch][49]);



        t[50] = findViewById(R.id.t50);
        b[50] = findViewById(R.id.b50);
        t[50].setText("50 . "+name[branch][50]);



        t[51] = findViewById(R.id.t51);
        b[51] = findViewById(R.id.b51);
        t[51].setText("51 . "+name[branch][51]);



        t[52] = findViewById(R.id.t52);
        b[52] = findViewById(R.id.b52);
        t[52].setText("52 . "+name[branch][52]);



        t[53] = findViewById(R.id.t53);
        b[53] = findViewById(R.id.b53);
        t[53].setText("53 . "+name[branch][53]);



        t[54] = findViewById(R.id.t54);
        b[54] = findViewById(R.id.b54);
        t[54].setText("54 . "+name[branch][54]);



        t[55] = findViewById(R.id.t55);
        b[55] = findViewById(R.id.b55);
        t[55].setText("55 . "+name[branch][55]);



        t[56] = findViewById(R.id.t56);
        b[56] = findViewById(R.id.b56);
        t[56].setText("56 . "+name[branch][56]);



        t[57] = findViewById(R.id.t57);
        b[57] = findViewById(R.id.b57);
        t[57].setText("57 . "+name[branch][57]);





        if(name[branch].length<59)
        {
            LinearLayout lay=findViewById(R.id.lay);
            lay.removeAllViewsInLayout();
        }
        else {
            t[58] = findViewById(R.id.t58);
            b[58] = findViewById(R.id.b58);
            t[58].setText("58 . "+name[branch][58]);



            t[59] = findViewById(R.id.t59);
            b[59] = findViewById(R.id.b59);
            t[59].setText("59 . "+name[branch][59]);
        }
        b[0] = findViewById(R.id.b0);
























        t[1].setText("1 . "+name[branch][1]);
        t[2].setText("2 . "+name[branch][2]);
        t[3].setText("3 . "+name[branch][3]);
        t[4].setText("4 . "+name[branch][4]);
        t[5].setText("5 . "+name[branch][5]);
        t[6].setText("6 . "+name[branch][6]);




    }
    public void allab(View n) {

        if (s[0]++ % 2 == 0) {
            b[0].setText("Mark all Present");
            for(int i=1;i<tl;i++) {
                s[i]++;
                b[i].setBackgroundColor(Color.RED);
                b[i].setText("ABSENT");
                at[i]=false;

            }



        } else {
            b[0].setText("Mark all Absent");
            for(int i=1;i<tl;i++) {
                s[i]++;
                b[i].setBackgroundColor(Color.GREEN);
                b[i].setText("PRESENT");
                at[i] = true;
            }


        }
    }
    public void b1(View n) {
        if (s[1]++ % 2 == 0) {
            b[1].setBackgroundColor(Color.RED);
            b[1].setText("ABSENT");  at[1]=false;
            at[1]=false;


        } else {
            b[1].setBackgroundColor(Color.GREEN);
            b[1].setText("PRESENT");
            at[1]=true;



        }
    }

    public void b2(View n) {
        if (s[2]++ % 2 == 0) {
            b[2].setBackgroundColor(Color.RED);
            b[2].setText("ABSENT");  at[2]=false;



        } else {
            b[2].setBackgroundColor(Color.GREEN);
            b[2].setText("PRESENT"); at[2]=true;


        }
    }

    public void b3(View n) {
        if (s[3]++ % 2 == 0) {
            b[3].setBackgroundColor(Color.RED);
            b[3].setText("ABSENT");  at[3]=false;


        } else {
            b[3].setBackgroundColor(Color.GREEN);
            b[3].setText("PRESENT"); at[3]=true;


        }
    }

    public void b4(View n) {
        if (s[4]++ % 2 == 0) {
            b[4].setBackgroundColor(Color.RED);
            b[4].setText("ABSENT");  at[4]=false;


        } else {
            b[4].setBackgroundColor(Color.GREEN);
            b[4].setText("PRESENT"); at[4]=true;


        }
    }

    public void b5(View n) {
        if (s[5]++ % 2 == 0) {
            b[5].setBackgroundColor(Color.RED);
            b[5].setText("ABSENT");  at[5]=false;


        } else {
            b[5].setBackgroundColor(Color.GREEN);
            b[5].setText("PRESENT"); at[5]=true;


        }
    }
    public void b6(View n) {
        if (s[6]++ % 2 == 0) {
            b[6].setBackgroundColor(Color.RED);
            b[6].setText("ABSENT");  at[6]=false;
        } else {
            b[6].setBackgroundColor(Color.GREEN);
            b[6].setText("PRESENT"); at[6]=true;


        }
    }
    public void b7(View n) {
        if (s[7]++ % 2 == 0) {
            b[7].setBackgroundColor(Color.RED);
            b[7].setText("ABSENT");  at[7]=false;


        } else {
            b[7].setBackgroundColor(Color.GREEN);
            b[7].setText("PRESENT"); at[7]=true;


        }
    }
    public void b8(View n) {
        if (s[8]++ % 2 == 0) {
            b[8].setBackgroundColor(Color.RED);
            b[8].setText("ABSENT");  at[8]=false;


        } else {
            b[8].setBackgroundColor(Color.GREEN);
            b[8].setText("PRESENT"); at[8]=true;


        }
    } public void b9(View n) {
        if (s[9]++ % 2 == 0) {
            b[9].setBackgroundColor(Color.RED);
            b[9].setText("ABSENT");  at[9]=false;


        } else {
            b[9].setBackgroundColor(Color.GREEN);
            b[9].setText("PRESENT"); at[9]=true;


        }
    } public void b10(View n) {
        if (s[10]++ % 2 == 0) {
            b[10].setBackgroundColor(Color.RED);
            b[10].setText("ABSENT");  at[10]=false;


        } else {
            b[10].setBackgroundColor(Color.GREEN);
            b[10].setText("PRESENT"); at[10]=true;


        }
    } public void b11(View n) {
        if (s[11]++ % 2 == 0) {
            b[11].setBackgroundColor(Color.RED);
            b[11].setText("ABSENT");  at[11]=false;


        } else {
            b[11].setBackgroundColor(Color.GREEN);
            b[11].setText("PRESENT"); at[11]=true;


        }
    } public void b12(View n) {
        if (s[12]++ % 2 == 0) {
            b[12].setBackgroundColor(Color.RED);
            b[12].setText("ABSENT");  at[12]=false;


        } else {
            b[12].setBackgroundColor(Color.GREEN);
            b[12].setText("PRESENT"); at[12]=true;


        }
    } public void b13(View n) {
        if (s[13]++ % 2 == 0) {
            b[13].setBackgroundColor(Color.RED);
            b[13].setText("ABSENT");  at[13]=false;


        } else {
            b[13].setBackgroundColor(Color.GREEN);
            b[13].setText("PRESENT"); at[13]=true;


        }
    } public void b14(View n) {
        if (s[14]++ % 2 == 0) {
            b[14].setBackgroundColor(Color.RED);
            b[14].setText("ABSENT");  at[14]=false;


        } else {
            b[14].setBackgroundColor(Color.GREEN);
            b[14].setText("PRESENT"); at[14]=true;


        }
    } public void b15(View n) {
        if (s[15]++ % 2 == 0) {
            b[15].setBackgroundColor(Color.RED);
            b[15].setText("ABSENT");  at[15]=false;


        } else {
            b[15].setBackgroundColor(Color.GREEN);
            b[15].setText("PRESENT"); at[15]=true;


        }
    } public void b16(View n) {
        if (s[16]++ % 2 == 0) {
            b[16].setBackgroundColor(Color.RED);
            b[16].setText("ABSENT");  at[16]=false;


        } else {
            b[16].setBackgroundColor(Color.GREEN);
            b[16].setText("PRESENT"); at[16]=true;


        }
    } public void b17(View n) {
        if (s[17]++ % 2 == 0) {
            b[17].setBackgroundColor(Color.RED);
            b[17].setText("ABSENT");  at[17]=false;


        } else {
            b[17].setBackgroundColor(Color.GREEN);
            b[17].setText("PRESENT"); at[17]=true;


        }
    } public void b18(View n) {
        if (s[18]++ % 2 == 0) {
            b[18].setBackgroundColor(Color.RED);
            b[18].setText("ABSENT");  at[18]=false;


        } else {
            b[18].setBackgroundColor(Color.GREEN);
            b[18].setText("PRESENT"); at[18]=true;


        }
    } public void b19(View n) {
        if (s[19]++ % 2 == 0) {
            b[19].setBackgroundColor(Color.RED);
            b[19].setText("ABSENT");  at[19]=false;


        } else {
            b[19].setBackgroundColor(Color.GREEN);
            b[19].setText("PRESENT"); at[19]=true;


        }
    } public void b20(View n) {
        if (s[20]++ % 2 == 0) {
            b[20].setBackgroundColor(Color.RED);
            b[20].setText("ABSENT");  at[20]=false;


        } else {
            b[20].setBackgroundColor(Color.GREEN);
            b[20].setText("PRESENT"); at[20]=true;


        }
    } public void b21(View n) {
        if (s[21]++ % 2 == 0) {
            b[21].setBackgroundColor(Color.RED);
            b[21].setText("ABSENT");  at[21]=false;


        } else {
            b[21].setBackgroundColor(Color.GREEN);
            b[21].setText("PRESENT"); at[21]=true;


        }
    }
    public void b22(View n) {
        if (s[22]++ % 2 == 0) {
            b[22].setBackgroundColor(Color.RED);
            b[22].setText("ABSENT");  at[22]=false;


        } else {
            b[22].setBackgroundColor(Color.GREEN);
            b[22].setText("PRESENT"); at[22]=true;


        }
    }
    public void b23(View n) {
        if (s[23]++ % 2 == 0) {
            b[23].setBackgroundColor(Color.RED);
            b[23].setText("ABSENT");  at[23]=false;


        } else {
            b[23].setBackgroundColor(Color.GREEN);
            b[23].setText("PRESENT"); at[23]=true;


        }
    }
    public void b24(View n) {
        if (s[24]++ % 2 == 0) {
            b[24].setBackgroundColor(Color.RED);
            b[24].setText("ABSENT");  at[24]=false;


        } else {
            b[24].setBackgroundColor(Color.GREEN);
            b[24].setText("PRESENT"); at[24]=true;


        }
    }
    public void b25(View n) {
        if (s[25]++ % 2 == 0) {
            b[25].setBackgroundColor(Color.RED);
            b[25].setText("ABSENT");  at[25]=false;


        } else {
            b[25].setBackgroundColor(Color.GREEN);
            b[25].setText("PRESENT"); at[25]=true;


        }
    }
    public void b26(View n) {
        if (s[26]++ % 2 == 0) {
            b[26].setBackgroundColor(Color.RED);
            b[26].setText("ABSENT");  at[26]=false;


        } else {
            b[26].setBackgroundColor(Color.GREEN);
            b[26].setText("PRESENT"); at[26]=true;


        }
    }
    public void b27(View n) {
        if (s[27]++ % 2 == 0) {
            b[27].setBackgroundColor(Color.RED);
            b[27].setText("ABSENT");  at[27]=false;


        } else {
            b[27].setBackgroundColor(Color.GREEN);
            b[27].setText("PRESENT"); at[27]=true;


        }
    }

    public void b28(View n) {
        if (s[28]++ % 2 == 0) {
            b[28].setBackgroundColor(Color.RED);
            b[28].setText("ABSENT");  at[28]=false;


        } else {
            b[28].setBackgroundColor(Color.GREEN);
            b[28].setText("PRESENT"); at[28]=true;


        }
    }
    public void b29(View n) {
        if (s[29]++ % 2 == 0) {
            b[29].setBackgroundColor(Color.RED);
            b[29].setText("ABSENT");  at[29]=false;


        } else {
            b[29].setBackgroundColor(Color.GREEN);
            b[29].setText("PRESENT"); at[29]=true;


        }
    }

    public void b30(View n) {
        if (s[30]++ % 2 == 0) {
            b[30].setBackgroundColor(Color.RED);
            b[30].setText("ABSENT");  at[30]=false;


        } else {
            b[30].setBackgroundColor(Color.GREEN);
            b[30].setText("PRESENT"); at[30]=true;


        }
    }
    public void b31(View n) {
        if (s[31]++ % 2 == 0) {
            b[31].setBackgroundColor(Color.RED);
            b[31].setText("ABSENT");  at[31]=false;


        } else {
            b[31].setBackgroundColor(Color.GREEN);
            b[31].setText("PRESENT"); at[31]=true;


        }
    }


    public void b32(View n) {
        if (s[32]++ % 2 == 0) {
            b[32].setBackgroundColor(Color.RED);
            b[32].setText("ABSENT");  at[32]=false;


        } else {
            b[32].setBackgroundColor(Color.GREEN);
            b[32].setText("PRESENT"); at[32]=true;


        }
    }

    public void b33(View n) {
        if (s[33]++ % 2 == 0) {
            b[33].setBackgroundColor(Color.RED);
            b[33].setText("ABSENT");  at[33]=false;


        } else {
            b[33].setBackgroundColor(Color.GREEN);
            b[33].setText("PRESENT"); at[33]=true;


        }
    }

    public void b34(View n) {
        if (s[34]++ % 2 == 0) {
            b[34].setBackgroundColor(Color.RED);
            b[34].setText("ABSENT");  at[34]=false;


        } else {
            b[34].setBackgroundColor(Color.GREEN);
            b[34].setText("PRESENT"); at[34]=true;


        }
    }

    public void b35(View n) {
        if (s[35]++ % 2 == 0) {
            b[35].setBackgroundColor(Color.RED);
            b[35].setText("ABSENT");  at[35]=false;


        } else {
            b[35].setBackgroundColor(Color.GREEN);
            b[35].setText("PRESENT"); at[35]=true;


        }
    }

    public void b36(View n) {
        if (s[36]++ % 2 == 0) {
            b[36].setBackgroundColor(Color.RED);
            b[36].setText("ABSENT");  at[36]=false;


        } else {
            b[36].setBackgroundColor(Color.GREEN);
            b[36].setText("PRESENT"); at[36]=true;


        }
    }

    public void b37(View n) {
        if (s[37]++ % 2 == 0) {
            b[37].setBackgroundColor(Color.RED);
            b[37].setText("ABSENT");  at[37]=false;


        } else {
            b[37].setBackgroundColor(Color.GREEN);
            b[37].setText("PRESENT"); at[37]=true;


        }
    }

    public void b38(View n) {
        if (s[38]++ % 2 == 0) {
            b[38].setBackgroundColor(Color.RED);
            b[38].setText("ABSENT");  at[38]=false;


        } else {
            b[38].setBackgroundColor(Color.GREEN);
            b[38].setText("PRESENT"); at[38]=true;


        }
    }

    public void b39(View n) {
        if (s[39]++ % 2 == 0) {
            b[39].setBackgroundColor(Color.RED);
            b[39].setText("ABSENT");  at[39]=false;


        } else {
            b[39].setBackgroundColor(Color.GREEN);
            b[39].setText("PRESENT"); at[39]=true;


        }
    }

    public void b40(View n) {
        if (s[40]++ % 2 == 0) {
            b[40].setBackgroundColor(Color.RED);
            b[40].setText("ABSENT");  at[40]=false;


        } else {
            b[40].setBackgroundColor(Color.GREEN);
            b[40].setText("PRESENT"); at[40]=true;


        }
    }

    public void b41(View n) {
        if (s[41]++ % 2 == 0) {
            b[41].setBackgroundColor(Color.RED);
            b[41].setText("ABSENT");  at[41]=false;


        } else {
            b[41].setBackgroundColor(Color.GREEN);
            b[41].setText("PRESENT"); at[41]=true;


        }
    }

    public void b42(View n) {
        if (s[42]++ % 2 == 0) {
            b[42].setBackgroundColor(Color.RED);
            b[42].setText("ABSENT");  at[42]=false;


        } else {
            b[42].setBackgroundColor(Color.GREEN);
            b[42].setText("PRESENT"); at[42]=true;


        }
    }

    public void b43(View n) {
        if (s[43]++ % 2 == 0) {
            b[43].setBackgroundColor(Color.RED);
            b[43].setText("ABSENT");  at[43]=false;


        } else {
            b[43].setBackgroundColor(Color.GREEN);
            b[43].setText("PRESENT"); at[43]=true;


        }
    }

    public void b44(View n) {
        if (s[44]++ % 2 == 0) {
            b[44].setBackgroundColor(Color.RED);
            b[44].setText("ABSENT");  at[44]=false;


        } else {
            b[44].setBackgroundColor(Color.GREEN);
            b[44].setText("PRESENT"); at[44]=true;


        }
    }

    public void b45(View n) {
        if (s[45]++ % 2 == 0) {
            b[45].setBackgroundColor(Color.RED);
            b[45].setText("ABSENT");  at[45]=false;


        } else {
            b[45].setBackgroundColor(Color.GREEN);
            b[45].setText("PRESENT"); at[45]=true;


        }
    }

    public void b46(View n) {
        if (s[46]++ % 2 == 0) {
            b[46].setBackgroundColor(Color.RED);
            b[46].setText("ABSENT");  at[46]=false;


        } else {
            b[46].setBackgroundColor(Color.GREEN);
            b[46].setText("PRESENT"); at[46]=true;


        }
    }

    public void b47(View n) {
        if (s[47]++ % 2 == 0) {
            b[47].setBackgroundColor(Color.RED);
            b[47].setText("ABSENT");  at[47]=false;


        } else {
            b[47].setBackgroundColor(Color.GREEN);
            b[47].setText("PRESENT"); at[47]=true;


        }
    }

    public void b48(View n) {
        if (s[48]++ % 2 == 0) {
            b[48].setBackgroundColor(Color.RED);
            b[48].setText("ABSENT");  at[48]=false;


        } else {
            b[48].setBackgroundColor(Color.GREEN);
            b[48].setText("PRESENT"); at[48]=true;


        }
    }

    public void b49(View n) {
        if (s[49]++ % 2 == 0) {
            b[49].setBackgroundColor(Color.RED);
            b[49].setText("ABSENT");  at[49]=false;


        } else {
            b[49].setBackgroundColor(Color.GREEN);
            b[49].setText("PRESENT"); at[49]=true;


        }
    }

    public void b50(View n) {
        if (s[50]++ % 2 == 0) {
            b[50].setBackgroundColor(Color.RED);
            b[50].setText("ABSENT");  at[50]=false;


        } else {
            b[50].setBackgroundColor(Color.GREEN);
            b[50].setText("PRESENT"); at[50]=true;


        }
    }

    public void b51(View n) {
        if (s[51]++ % 2 == 0) {
            b[51].setBackgroundColor(Color.RED);
            b[51].setText("ABSENT");  at[51]=false;


        } else {
            b[51].setBackgroundColor(Color.GREEN);
            b[51].setText("PRESENT"); at[51]=true;


        }
    }

    public void b52(View n) {
        if (s[52]++ % 2 == 0) {
            b[52].setBackgroundColor(Color.RED);
            b[52].setText("ABSENT");  at[52]=false;


        } else {
            b[52].setBackgroundColor(Color.GREEN);
            b[52].setText("PRESENT"); at[52]=true;


        }
    }

    public void b53(View n) {
        if (s[53]++ % 2 == 0) {
            b[53].setBackgroundColor(Color.RED);
            b[53].setText("ABSENT");  at[53]=false;


        } else {
            b[53].setBackgroundColor(Color.GREEN);
            b[53].setText("PRESENT"); at[53]=true;


        }
    }

    public void b54(View n) {
        if (s[54]++ % 2 == 0) {
            b[54].setBackgroundColor(Color.RED);
            b[54].setText("ABSENT");  at[54]=false;


        } else {
            b[54].setBackgroundColor(Color.GREEN);
            b[54].setText("PRESENT"); at[54]=true;


        }
    }

    public void b55(View n) {
        if (s[55]++ % 2 == 0) {
            b[55].setBackgroundColor(Color.RED);
            b[55].setText("ABSENT");  at[55]=false;


        } else {
            b[55].setBackgroundColor(Color.GREEN);
            b[55].setText("PRESENT"); at[55]=true;


        }
    }

    public void b56(View n) {
        if (s[56]++ % 2 == 0) {
            b[56].setBackgroundColor(Color.RED);
            b[56].setText("ABSENT");  at[56]=false;


        } else {
            b[56].setBackgroundColor(Color.GREEN);
            b[56].setText("PRESENT"); at[56]=true;


        }
    }

    public void b57(View n) {
        if (s[57]++ % 2 == 0) {
            b[57].setBackgroundColor(Color.RED);
            b[57].setText("ABSENT");  at[57]=false;


        } else {
            b[57].setBackgroundColor(Color.GREEN);
            b[57].setText("PRESENT"); at[57]=true;


        }
    }
    public void b58(View n) {
        if (s[58]++ % 2 == 0) {
            b[58].setBackgroundColor(Color.RED);
            b[58].setText("ABSENT");  at[58]=false;


        } else {
            b[58].setBackgroundColor(Color.GREEN);
            b[58].setText("PRESENT"); at[58]=true;


        }
    }

    public void b59(View n) {
        if (s[59]++ % 2 == 0) {
            b[59].setBackgroundColor(Color.RED);
            b[59].setText("ABSENT");  at[59]=false;


        } else {
            b[59].setBackgroundColor(Color.GREEN);
            b[59].setText("PRESENT"); at[59]=true;


        }
    }




    public void done(View v) {

        if(branching<4){
            abc+="\n";
            switch(branch)
            {
                case 0:
                    abc+="\nI.T. ABSENTEES ARE  : ";
                    break;
                case 1:
                    abc+="\nC.S. ABSENTEES ARE  : ";
                    break;
                case 2:
                    abc+="\nC.S.B. ABSENTEES ARE  : ";
                    break;
                case 3:
                    abc+="\nC.S.A.I. ABSENTEES ARE  : ";
                    break;
            }
            //abc="DATE: "+formattedDate+"\n"+ abc;
            for(int i=1;i< name[branch].length;i++)
            {
                if(!at[i])
                {
                    abc+=""+i+", ";
                }
            }

            SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
            //abc=new FunUse().remove(abc,49,branch,0);
            abc=abc.substring(0,abc.length()-2);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("current",abc);
            editor.apply();






            Intent i = new Intent(this, stats.class);
            i.putExtra("true",at);
            i.putExtra("branch",branch);
            startActivity(i);
        }
        if(branching==4)
        {
            SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
            //abc=new FunUse().remove(abc,49,branch,0);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt("branch",0);
            branching=0;
            Intent j=new Intent(this, students.class);
            startActivity(j);







            editor.apply();




        }
    }

    public String reabs() {
        return abs;
    }
}

