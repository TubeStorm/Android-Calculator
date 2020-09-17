package favourdiokpo.tuorial1.calculator;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import android.widget.*;
import android.graphics.Color;

import java.util.Vector;


public class MainActivity extends AppCompatActivity {

    EditText result;
    String newResult, newSAVEDNUM;
    ConstraintLayout mainTable;
    TextView txts;
    Button[] bu = new Button[19];
    Button save, recall;
    Float number2, number1;
    private static final char ADDITION = '+';
    private static final char SUBTRACT = '-';
    private static final char MULTIPLY = '*';
    private static final char DIVIDE = '/';
    private char CURRENT_ACTION;
    private Float SAVEDNUM;
    Boolean flag = false;
    Vector history1 = new Vector();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mainTable = findViewById(R.id.mainTable);
        result   = findViewById(R.id.result);
        txts  = findViewById(R.id.history1);

        bu[0]    = findViewById(R.id.zero);
        bu[1]    = findViewById(R.id.one);
        bu[2]    = findViewById(R.id.two);
        bu[3]    = findViewById(R.id.three);
        bu[4]    = findViewById(R.id.four);
        bu[5]    = findViewById(R.id.five);
        bu[6]    = findViewById(R.id.six);
        bu[7]    = findViewById(R.id.seven);
        bu[8]    = findViewById(R.id.eight);
        bu[9]    = findViewById(R.id.nine);
        bu[10]   = findViewById(R.id.plus);
        bu[11]   = findViewById(R.id.minus);
        bu[12]   = findViewById(R.id.divide);
        bu[13]   = findViewById(R.id.multi);
        bu[14]   = findViewById(R.id.clear);
        bu[15]   = findViewById(R.id.back);
        bu[16]   = findViewById(R.id.convert);
        bu[17]   = findViewById(R.id.dot);
        bu[18]   = findViewById(R.id.equal);

        recall   = findViewById(R.id.recall);
        save     = findViewById(R.id.save);



        /////////////////////////BUTTONS 0 - 9/////////////////////////
        bu[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == true){
                    result.setText(null);
                    result.setText(result.getText() + "0");
                    flag = false;
                }
                else if(flag == false){
                    result.setText(result.getText() + "0");
                }

            }
        });

        bu[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == true){
                    result.setText(null);
                    result.setText(result.getText() + "1");
                    flag = false;
                }
                else if(flag == false){
                    result.setText(result.getText() + "1");
                }
            }
        });

        bu[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == true){
                    result.setText(null);
                    result.setText(result.getText() + "2");
                    flag = false;
                }
                else if(flag == false){
                    result.setText(result.getText() + "2");
                }
            }
        });

        bu[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == true){
                    result.setText(null);
                    result.setText(result.getText() + "3");
                    flag = false;
                }
                else if(flag == false){
                    result.setText(result.getText() + "3");
                }
            }
        });

        bu[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == true){
                    result.setText(null);
                    result.setText(result.getText() + "4");
                    flag = false;
                }
                else if(flag == false){
                    result.setText(result.getText() + "4");
                }
            }
        });

        bu[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == true){
                    result.setText(null);
                    result.setText(result.getText() + "5");
                    flag = false;
                }
                else if(flag == false){
                    result.setText(result.getText() + "5");
                }
            }
        });

        bu[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == true){
                    result.setText(null);
                    result.setText(result.getText() + "6");
                    flag = false;
                }
                else if(flag == false){
                    result.setText(result.getText() + "6");
                }
            }
        });

        bu[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == true){
                    result.setText(null);
                    result.setText(result.getText() + "7");
                    flag = false;
                }
                else if(flag == false){
                    result.setText(result.getText() + "7");
                }
            }
        });

        bu[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == true){
                    result.setText(null);
                    result.setText(result.getText() + "8");
                    flag = false;
                }
                else if(flag == false){
                    result.setText(result.getText() + "8");
                }
            }
        });

        bu[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == true){
                    result.setText(null);
                    result.setText(result.getText() + "9");
                    flag = false;
                }
                else if(flag == false){
                    result.setText(result.getText() + "9");
                }
            }
        });


        /////////////////////////BUTTONS + - / * CL BK = SW /////////////////////////
        bu[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do the computation of addition
                if (result == null) {
                    result.setText("0");
                } else {
                    number1 = Float.parseFloat(  result.getText() + "");
                    CURRENT_ACTION = ADDITION;
                    result.setText(null);
                    history1.add("+");
                }
            }
        });

        bu[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result == null) {
                    result.setText("0");
                } else {
                    number1 = Float.parseFloat( result.getText() + "");
                    CURRENT_ACTION = SUBTRACT;
                    result.setText(null);
                    history1.add("-");
                }
            }
        });

        bu[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result == null) {
                    result.setText("0");
                } else {
                    number1 = Float.parseFloat( result.getText() + "");
                    CURRENT_ACTION = DIVIDE;
                    result.setText(null);
                    history1.add("/");
                }
            }
        });

        bu[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result == null) {
                    result.setText("0");
                } else {
                    number1 = Float.parseFloat( result.getText() + "");
                    CURRENT_ACTION = MULTIPLY;
                    result.setText(null);
                    history1.add("*");
                }
            }
        });

        bu[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
            }
        });

        bu[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "");

                if(result.getText().length() > 0){
                    CharSequence name = result.getText().toString();
                    result.setText(name.subSequence(0, name.length() - 1));
                    history1.add(result);
                }
            }
        });

        bu[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do later
                String check;
                check = result.getText().toString();
                Boolean press = true;

                Float checker;
                checker = Float.parseFloat(result.getText().toString());

                if(check != "null") {
                    if((press = true) && (checker > 0)) {
                        result.setText(Float.toString(Float.parseFloat(result.getText().toString()) *(-1)));
                        press = false;
                    }
                    else if((press = true) && (checker < 0)){
                        result.setText(Float.toString(Float.parseFloat(result.getText().toString()) *(-1)));
                        press = false;
                    }
                }
                else{
                    result.setText(null);
                }
            }
        });

        bu[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = result.getText().toString();
                char[] characters = name.toCharArray();

                int dotChar = name.indexOf('.');

                if(dotChar < 0){
                    result.setText(result.getText() + ".");
                }
                else if(dotChar >= 0){
                    //result.setText(name.subSequence(0, name.length() - 1));
                }
            }
        });

     /////////////////////////SAVE and RECALL Buttons/////////////////////////
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SAVEDNUM = Float.parseFloat(result.getText() + "");

            }
        });

        recall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(SAVEDNUM + "");
            }
        });

    }


    /////////////////////////MATH COMPUTATIONS/////////////////////////
    public void equalClicked(View v) {
        number2 = Float.parseFloat(result.getText().toString());
        result.setText(null);

        if((v == bu[18]) && (CURRENT_ACTION == ADDITION)) {
            result.setText(number1 + number2 + "");
            txts.setText(txts.getText() + "\n \n"+number1+" + "+number2+"="+result.getText());
            flag = true;
        }
        else if((v == bu[18]) && (CURRENT_ACTION == SUBTRACT)) {
            result.setText(number1 - number2 + "");
            txts.setText(txts.getText() + "\n \n"+number1+" - "+number2+" = "+result.getText());
            flag = true;
        }
        else if((v == bu[18]) && (CURRENT_ACTION == DIVIDE)) {
            result.setText(number1 / number2 + "");
            txts.setText(txts.getText() + "\n \n"+number1+" ÷ "+number2+" = "+result.getText());
            flag = true;
        }
        else if((v == bu[18]) && (CURRENT_ACTION == MULTIPLY)) {
            result.setText(number1 * number2 + "");
            txts.setText(txts.getText() + "\n \n"+number1+" x "+number2+" = "+result.getText());
            flag = true;
        }

    }


    /////////////////////////ROTATE SCREEN/////////////////////////

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        newResult = result.getText().toString();
        //newSAVEDNUM = Float.toString(SAVEDNUM);

        super.onSaveInstanceState(outState);
        outState.putString("myText", newResult);
        // outState.putString("mySAVEDNUM", newSAVEDNUM);d studio
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        newResult = savedInstanceState.getString("myText");
       // newSAVEDNUM = savedInstanceState.getString("mySAVEDNUM");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}


