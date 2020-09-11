package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText esasEkran;
    TextView elaveEkran;
    Button sil, axirdansil, faiz, bol, yeddi, sekkiz, doqquz, vur, dord, bes, alti, cix, bir, iki, uc, topla, menfi_musbet, sifir, vergul, beraber;

    double birinci, ikinci;
    String reqem="", input="", answer="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        esasEkran=findViewById(R.id.capekran);
        elaveEkran=findViewById(R.id.elaveEkran);


        sil=findViewById(R.id.sil);
        axirdansil=findViewById(R.id.axirdan_sil);
        faiz=findViewById(R.id.faiz);
        bol=findViewById(R.id.bol);
        yeddi=findViewById(R.id.yeddi);
        sekkiz=findViewById(R.id.sekkiz);
        doqquz=findViewById(R.id.doqquz);
        vur=findViewById(R.id.vur);
        dord=findViewById(R.id.dord);
        bes=findViewById(R.id.bes);
        alti=findViewById(R.id.alti);
        cix=findViewById(R.id.cix);
        bir=findViewById(R.id.bir);
        iki=findViewById(R.id.iki);
        uc=findViewById(R.id.uc);
        topla=findViewById(R.id.plus);
        menfi_musbet=findViewById(R.id.menfi_musbet);
        sifir=findViewById(R.id.sifir);
        vergul=findViewById(R.id.vergul);
        beraber=findViewById(R.id.beraber);

        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elaveEkran.setText("");
                esasEkran.setText("");
                input="";
                reqem="";
                //sonDaxiledilenEmel="";
            }
        });

        axirdansil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+=reqem;

                if (input.length()==1) {
                    esasEkran.setText("");
                    elaveEkran.setText("");
                }
                else {
                    input=input.substring(0, input.length()-1);
                    esasEkran.setText(input);
                    elaveEkran.setText(input);
                    }
                reqem="";
            }
        });

        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(reqem.equals("0"))
                    reqem="1";
                else
                    reqem=reqem+"1";

                esasEkran.setText(reqem);
            }
        });

        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(reqem.equals("0"))
                    reqem="2";
                else
                    reqem=reqem+"2";

                esasEkran.setText(reqem);
            }
        });

        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(reqem.equals("0"))
                    reqem="3";
                else
                    reqem=reqem+"3";

                esasEkran.setText(reqem);
            }
        });

        dord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(reqem.equals("0"))
                    reqem="4";
                else
                    reqem=reqem+"4";

                esasEkran.setText(reqem);
            }
        });

        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(reqem.equals("0"))
                    reqem="5";
                else
                    reqem=reqem+"5";

                esasEkran.setText(reqem);
            }
        });

        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(reqem.equals("0"))
                    reqem="6";
                else
                    reqem=reqem+"6";

                esasEkran.setText(reqem);
            }
        });

        yeddi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(reqem.equals("0"))
                    reqem="7";
                else
                    reqem=reqem+"7";

                esasEkran.setText(reqem);
            }
        });

        sekkiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(reqem.equals("0"))
                    reqem="8";
                else
                    reqem=reqem+"8";

                esasEkran.setText(reqem);
            }
        });

        doqquz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(reqem.equals("0"))
                    reqem="9";
                else
                    reqem=reqem+"9";

                esasEkran.setText(reqem);
            }
        });

        sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(reqem.equals("0"))
                    reqem="0";
                else
                    reqem=reqem+"0";

                esasEkran.setText(reqem);
            }
        });

        vergul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int saygac=0;
                for(char a:reqem.toCharArray())
                {
                    if(a=='.')
                        saygac=1;
                }
                if(saygac==0)
                    reqem=reqem+".";

                esasEkran.setText(reqem);
            }
        });


        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer.equals("0"))
                {
                    elaveEkran.setText(elaveEkran.getText().toString()+reqem);
                    input+=reqem;
                    hell();
                    reqem="";
                }else{
                    elaveEkran.setText(reqem);
                    input=esasEkran.getText().toString().substring(1);
                    hell();
                    reqem=""; answer="0";
                }

                if(input.substring(input.length()-1).equals("+") || input.substring(input.length()-1).equals("-") ||
                        input.substring(input.length()-1).equals("*") || input.substring(input.length()-1).equals("/"))
                {
                    input=input.substring(0, input.length()-1) + "+";
                    elaveEkran.setText(input+"+");
                    esasEkran.setText("");
                }
                else{
                    input=input + "+";
                    elaveEkran.setText(elaveEkran.getText().toString()+"+");
                    esasEkran.setText("");
                }


            }
        });

        cix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer.equals("0"))
                {
                    elaveEkran.setText(elaveEkran.getText().toString()+reqem);
                    input+=reqem;
                    hell();
                    reqem="";
                }else{
                    elaveEkran.setText(reqem);
                    input=esasEkran.getText().toString().substring(1);
                    hell();
                    reqem=""; answer="0";
                }

                if(input.substring(input.length()-1).equals("+") || input.substring(input.length()-1).equals("-") ||
                        input.substring(input.length()-1).equals("*") || input.substring(input.length()-1).equals("/"))
                {
                    input=input.substring(0, input.length()-1) + "-";
                    elaveEkran.setText(input+"-");
                    esasEkran.setText("");
                }
                else {
                    input=input + "-";
                    elaveEkran.setText(elaveEkran.getText().toString()+"-");
                    esasEkran.setText("");
                }
            }
        });

        vur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer.equals("0"))
                {
                    elaveEkran.setText(elaveEkran.getText().toString()+reqem);
                    input+=reqem;
                    hell();
                    reqem="";
                }else{
                    elaveEkran.setText(reqem);
                    input=esasEkran.getText().toString().substring(1);
                    hell();
                    reqem=""; answer="0";
                }

                if(input.substring(input.length()-1).equals("+") || input.substring(input.length()-1).equals("-") ||
                        input.substring(input.length()-1).equals("*") || input.substring(input.length()-1).equals("/"))
                {
                    input=input.substring(0, input.length()-1) + "*";
                    elaveEkran.setText(input+"*");
                    esasEkran.setText("");
                }
                else {
                    input=input + "*";
                    elaveEkran.setText(elaveEkran.getText().toString()+"*");
                    esasEkran.setText("");
                }
            }
        });

        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer.equals("0"))
                {
                    elaveEkran.setText(elaveEkran.getText().toString()+reqem);
                    input+=reqem;
                    hell();
                    reqem="";
                }else{
                    elaveEkran.setText(reqem);
                    input=esasEkran.getText().toString().substring(1);
                    hell();
                    reqem=""; answer="0";
                }

                if(input.substring(input.length()-1).equals("+") || input.substring(input.length()-1).equals("-") ||
                        input.substring(input.length()-1).equals("*") || input.substring(input.length()-1).equals("/"))
                {
                    input=input.substring(0, input.length()-1) + "/";
                    elaveEkran.setText(input+"/");
                    esasEkran.setText("");
                }
                else {
                    input=input + "/";
                    elaveEkran.setText(elaveEkran.getText().toString()+"/");
                    esasEkran.setText("");
                }
            }
        });

        faiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double faiz=0;
                if(!input.equals("")) {
                    if (!input.substring(input.length() - 1).equals("+") || !input.substring(input.length() - 1).equals("-") ||
                            !input.substring(input.length() - 1).equals("*") || !input.substring(input.length() - 1).equals("/")) {
                        if (!reqem.equals("") || !reqem.equals("0")) {
                            faiz = Double.parseDouble(reqem);
                            input += String.valueOf(faiz / 100);
                        } else {
                            faiz = Double.parseDouble(input);
                            input = String.valueOf(faiz / 100);
                        }
                        hell();
                        reqem="";
                        answer = "1";
                    }
                }else
                {
                    faiz = Double.parseDouble(reqem);
                    input += String.valueOf(faiz / 100);
                    hell();
                    reqem="";
                    answer = "1";
                }
            }
        });

        menfi_musbet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(reqem.equals("") || !reqem.substring(0,1).equals("-"))
                    reqem="-"+reqem;
                else if(esasEkran.getText().toString().substring(0,1).equals("-"))
                    reqem=reqem.substring(1);

                esasEkran.setText(reqem);
            }
        });

        beraber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    input+=reqem;
                    hell();
                    reqem="";

                if(input.substring(input.length()-1).equals("+") || input.substring(input.length()-1).equals("-") ||
                        input.substring(input.length()-1).equals("*") || input.substring(input.length()-1).equals("/"))
                {
                    input=input.substring(0, input.length()-1);
                    esasEkran.setText("= "+input);
                    elaveEkran.setText(input);
                    answer="1";
                }
            }
        });

    }
    public void hell(){

        if(input.split("\\+").length==2)
        {
            String h[]=input.split("\\+");
            try {
                birinci=Double.parseDouble(h[0]);
                ikinci=Double.parseDouble(h[1]);
                double cem=birinci+ikinci;
                input=String.valueOf(cem);
            }catch (Exception e){
                //
            }

        }else if(input.split("\\*").length==2)
        {
            String h[]=input.split("\\*");
            try {
                birinci=Double.parseDouble(h[0]);
                ikinci=Double.parseDouble(h[1]);
                double hasil=birinci*ikinci;
                input=String.valueOf(hasil);
            }catch (Exception e){
                //
            }

        }
        else if(input.split("/").length==2) {
            String h[] = input.split("/");
            try {
                birinci = Double.parseDouble(h[0]);
                ikinci = Double.parseDouble(h[1]);
                double qismet = birinci / ikinci;
                input = String.valueOf(qismet);
            } catch (Exception e) {
                //
            }
        }else if(input.split("-").length>1)
        {
            String h[]=input.split("-");
            if(h[0]=="" && h.length==2)
                h[0]=0+"";
            try {
                double ferq=0;
                if(h.length==2)
                {
                    birinci=Double.parseDouble(h[0]);
                    ikinci=Double.parseDouble(h[1]);
                    ferq=birinci-ikinci;
                }else if(h.length==3){
                    birinci=Double.parseDouble(h[1]);
                    ikinci=Double.parseDouble(h[2]);
                    ferq=-birinci-ikinci;
                }

                input=String.valueOf(ferq);
            }catch (Exception e){
                //
            }
        }
        String f[]=input.split("\\.");
        if(f.length>1){
            if(f[1].equals("0"))
            {
                input=f[0];
                esasEkran.setText("= "+input);
                elaveEkran.setText(input);
            }
        }

        esasEkran.setText("= "+input);
        elaveEkran.setText(input);
    }

}
