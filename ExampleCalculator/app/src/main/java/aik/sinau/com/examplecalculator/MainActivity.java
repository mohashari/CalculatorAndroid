package aik.sinau.com.examplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {

    Button btn0 , btn1 , btn2 , btn3 , btn4 , btn5, btn6 , btn7, btn8, btn9, btn10, btnc , btnmod,btnadd, btndiv, btnequal, btnSub;
            EditText edt1;
    float mValueOne , mValueTwo;
    boolean mAddition, mSubtract, mMultiplication, mDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn0 = (Button) findViewById(R.id.btn0);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btn10=(Button)  findViewById(R.id.btn10);
        btnadd=(Button) findViewById(R.id.btnadd);
        btndiv=(Button) findViewById(R.id.btndiv);
        btnmod=(Button) findViewById(R.id.btnmull);
        btnequal=(Button) findViewById(R.id.btnequl);
        edt1=(EditText) findViewById(R.id.edt1);
        btnc=(Button) findViewById(R.id.btnc);
        btnSub=(Button) findViewById(R.id.btnsub);


        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edt1.setText(edt1.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edt1.setText(edt1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1==null){
                    edt1.setText("");
                }else {
                    mValueOne=Float.parseFloat(edt1.getText()+"");
                    mAddition=true;
                    edt1.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne=Float.parseFloat(edt1.getText()+"");
                mSubtract=true;
                edt1.setText(null);
            }
        });
        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mValueOne=Float.parseFloat(edt1.getText()+"");
                mMultiplication=true;
                edt1.setText(null);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne=Float.parseFloat(edt1.getText()+"");
                mDivision=true;
                edt1.setText(null);
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo=Float.parseFloat(edt1.getText()+"");

                if(mAddition == true){
                    edt1.setText(mValueOne+mValueTwo+"");
                    mAddition=false;

                }

                if(mSubtract == true){
                    edt1.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;

                }
                if(mMultiplication ==true){
                    edt1.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }
                if (mDivision == true){
                    edt1.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });
    }
}
