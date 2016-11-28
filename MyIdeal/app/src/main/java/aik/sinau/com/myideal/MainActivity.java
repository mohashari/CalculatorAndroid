package aik.sinau.com.myideal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnProses;
    EditText edtBerat, edtTinggi;
    TextView txtHasil;
int vBerat,vTinggi ,hasil   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         edtBerat= (EditText) findViewById(R.id.editBerat);
         edtTinggi= (EditText) findViewById(R.id.editTinggi);
         btnProses= (Button) findViewById(R.id.btnProces);
        txtHasil=(TextView) findViewById(R.id.txtHasil);
    btnProses.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
       vBerat=Integer.parseInt(edtBerat.getText()+"");
            vTinggi=Integer.parseInt(edtTinggi.getText()+"");
            hasil=vBerat/vTinggi*vTinggi;
         txtHasil.setText(Integer.valueOf(hasil));
        }
    });
    }


    }

