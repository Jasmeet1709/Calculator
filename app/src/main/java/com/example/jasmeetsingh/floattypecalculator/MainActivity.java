package com.example.jasmeetsingh.floattypecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textview);
        textView2 = (TextView)findViewById(R.id.textview2);
        Button button = (Button) findViewById(R.id.plus);
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.equalsto);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.minus);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.divide);
        button4.setOnClickListener(this);
        Button button5 = (Button) findViewById(R.id.one);
        button5.setOnClickListener(this);
        Button button6 = (Button) findViewById(R.id.two);
        button6.setOnClickListener(this);
        Button button7 = (Button) findViewById(R.id.three);
        button7.setOnClickListener(this);
        Button button8 = (Button) findViewById(R.id.four);
        button8.setOnClickListener(this);
        Button button9 = (Button) findViewById(R.id.five);
        button9.setOnClickListener(this);
        Button button10 = (Button) findViewById(R.id.six);
        button10.setOnClickListener(this);
        Button button11 = (Button) findViewById(R.id.seven);
        button11.setOnClickListener(this);
        Button button12 = (Button) findViewById(R.id.eight);
        button12.setOnClickListener(this);
        Button button13 = (Button) findViewById(R.id.nine);
        button13.setOnClickListener(this);
        Button button14 = (Button) findViewById(R.id.zero);
        button14.setOnClickListener(this);
        Button button15 = (Button) findViewById(R.id.dot);
        button15.setOnClickListener(this);
        Button button16 = (Button) findViewById(R.id.product);
        button16.setOnClickListener(this);


    }
    double a=0;
    double b=0;
    int previousId=0;
    boolean flag=false;
    @Override
    public void onClick(View v) {

        int id = v.getId();
        if(id==R.id.dot){
            //String s = textView.getText().toString();
            //Double d = Double.parseDouble(s);
            //Double d1=d+0.0;
            //textView.setText(d1+"");
            textView.append(".");
            textView2.append(".");
        }
        else if (id==R.id.one){
            if(flag){
                textView.setText("");
                flag=false;
            }
            textView.append(1+"");
            textView2.append(1+"");
        }
        else if (id==R.id.two){
            if(flag){
                textView.setText("");
                flag=false;
            }
            textView.append(2+"");
            textView2.append(2+"");
        }
        else if (id==R.id.three){
            if(flag){
                textView.setText("");
                flag=false;
            }
            textView.append(3+"");
            textView2.append(3+"");
        }
        else if (id==R.id.four){
            if(flag){
                textView.setText("");
                flag=false;
            }
            textView.append(4+"");
            textView2.append(4+"");
        }
        else if (id==R.id.five){
            if(flag){
                textView.setText("");
                flag=false;
            }
            textView.append(5+"");
            textView2.append((5+""));
        }
        else if (id==R.id.six){
            if(flag){
                textView.setText("");
                flag=false;
            }
            textView.append(6+"");
            textView2.append(6+"");
        }
        else if (id==R.id.seven){
            if(flag){
                textView.setText("");
                flag=false;
            }
            textView.append(7+"");
            textView2.append(7+"");
        }
        else if (id==R.id.eight){
            if(flag){
                textView.setText("");
                flag=false;
            }
            textView.append(8+"");
            textView2.append(8+"");
        }
        else if (id==R.id.nine){
            if(flag){
                textView.setText("");
                flag=false;
            }
            textView.append(9+"");
            textView2.append(9+"");
        }
        else if (id==R.id.zero){
            if(flag){
                textView.setText("");
                flag=false;
            }
            textView.append(0+"");
            textView2.append(0+"");
        }
        else if(textView2.length()==textView.length()) {
            if (id == R.id.plus || id == R.id.minus || id == R.id.product || id == R.id.divide) {
                previousId = id;
                String text = textView.getText().toString();
                //result.setText(text);
                //String res = result.getText().toString();
                a = Double.parseDouble(text);
                textView.setText("");
                if (previousId == R.id.plus) {
                    textView2.append("+");
                } else if (previousId == R.id.minus) {
                    textView2.append("-");
                } else if (previousId == R.id.product) {
                    textView2.append("*");
                } else if (previousId == R.id.divide) {
                    textView2.append("/");
                }


            }
        }
        else  if(id==R.id.plus){
            //textView.setText("");
            if(previousId==R.id.plus) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);

                textView2.append("+");
                Double sum = a + b;
                a = sum;
                textView.setText(sum + "");
            }
            else if(previousId==R.id.minus) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);
                textView2.append("+");
                Double sub = a - b;
                a = sub;
                textView.setText(sub + "");
            }
            else if (previousId==R.id.product) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);

                Double prod = a * b;
                a = prod;
                textView.setText(prod + "");
                textView2.append("+");
            }
            else if (previousId==R.id.divide) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);

                textView2.append("+");
                Double ans = a / b;
                a = ans;
                textView.setText(ans + "");
            }
            else if (previousId==R.id.equalsto){
                textView2.setText(a+"+");
                textView.setText("");
            }
            previousId=id;
            flag=true;

        }
        else if(id==R.id.minus){
            //textView.setText("");
            if(previousId==R.id.plus) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);

                textView2.append("-");
                Double sum = a + b;
                a = sum;
                textView.setText(sum + "");
            }
            else if(previousId==R.id.minus) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);
                textView2.append("-");
                Double sub = a - b;
                a = sub;
                textView.setText(sub + "");
            }
            else if (previousId==R.id.product) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);

                Double prod = a * b;
                a = prod;
                textView.setText(prod + "");
                textView2.append("-");
            }
            else if (previousId==R.id.divide) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);

                textView2.append("-");
                Double ans = a / b;
                a = ans;
                textView.setText(ans + "");
            }
            else if (previousId==R.id.equalsto){
                textView2.setText(a+"-");
                textView.setText("");
            }
            previousId=id;
            flag=true;

        }
        else if(id==R.id.product){
            //textView.setText("");
            if(previousId==R.id.plus) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);

                textView2.append("*");
                Double sum = a + b;
                a = sum;
                textView.setText(sum + "");
            }
            else if(previousId==R.id.minus) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);
                textView2.append("*");
                Double sub = a - b;
                a = sub;
                textView.setText(sub + "");
            }
            else if (previousId==R.id.product) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);

                Double prod = a * b;
                a = prod;
                textView.setText(prod + "");
                textView2.append("*");
            }
            else if (previousId==R.id.divide) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);

                textView2.append("*");
                Double ans = a / b;
                a = ans;
                textView.setText(ans + "");
            }
            else if (previousId==R.id.equalsto){
                textView2.setText(a+"*");
                textView.setText("");
            }
            previousId=id;
            flag=true;

        }
        else if(id==R.id.divide){
            //textView.setText("");
            if(previousId==R.id.plus) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);

                textView2.append("/");
                Double sum = a + b;
                a = sum;
                textView.setText(sum + "");
            }
            else if(previousId==R.id.minus) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);
                textView2.append("/");
                Double sub = a - b;
                a = sub;
                textView.setText(sub + "");
            }
            else if (previousId==R.id.product) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);

                Double prod = a * b;
                a = prod;
                textView.setText(prod + "");
                textView2.append("/");
            }
            else if (previousId==R.id.divide) {
                String text2 = textView.getText().toString();
                b = Double.parseDouble(text2);

                textView2.append("/");
                Double ans = a / b;
                a = ans;
                textView.setText(ans + "");
            }
            else if (previousId==R.id.equalsto){
                textView2.setText(a+"/");
                textView.setText("");
            }
            previousId=id;
            flag=true;

        }
        else if(id==R.id.equalsto){
            if(previousId==R.id.minus){
                String text = textView.getText().toString();
                b=Double.parseDouble(text);

                Double sub=a-b;
                a=sub;
                textView.setText(sub+"");
                textView2.setText("");
                flag=true;

            }
            else if(previousId==R.id.plus){
                String text = textView.getText().toString();
                b=Double.parseDouble(text);

                Double sum=a+b;
                a=sum;
                textView.setText(sum+"");
                textView2.setText("");
                flag=true;
            }
            else if(previousId==R.id.divide){
                String text = textView.getText().toString();
                b=Double.parseDouble(text);

                Double ans=a/b;
                a=ans;
                textView.setText(ans+"");
                textView2.setText("");
                flag=true;
            }
            else if(previousId==R.id.product){
                String text = textView.getText().toString();
                b=Double.parseDouble(text);

                Double prod=a*b;
                a=prod;
                textView.setText(prod+"");
                textView2.setText("");
                flag=true;
            }
            previousId=id;
        }


    }
}
