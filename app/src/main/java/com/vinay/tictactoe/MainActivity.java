package com.vinay.tictactoe;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
public class MainActivity extends AppCompatActivity {
    Dialog dialog;
    public AppCompatButton btn[]=new AppCompatButton[9];
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.restart).setOnClickListener(View ->restart());
    }

    public void click(View view)
    {
        AppCompatButton btn=(AppCompatButton) view;
        if(flag==0)
        {
            btn.setText("O");
            btn.setEnabled(false);
            flag=1;
        }
        else
        {
            btn.setText("X");
            flag=0;
            btn.setEnabled(false);
        }
        winningpattern();
    }

    public void winningpattern()
    {
        dialog=new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.winner);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        //dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.winner));
        dialog.findViewById(R.id.restart).setOnClickListener(View->restart());
        dialog.findViewById(R.id.exit).setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                finish();
            }
        });
        dialog.findViewById(R.id.dismiss).setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                dialog.dismiss();
            }
        });
        TextView tv=dialog.findViewById(R.id.tv);
        btn[0]=findViewById(R.id.btn1);
        btn[1]=findViewById(R.id.btn2);
        btn[2]=findViewById(R.id.btn3);
        btn[3]=findViewById(R.id.btn4);
        btn[4]=findViewById(R.id.btn5);
        btn[5]=findViewById(R.id.btn6);
        btn[6]=findViewById(R.id.btn7);
        btn[7]=findViewById(R.id.btn8);
        btn[8]=findViewById(R.id.btn9);
        String b1=btn[0].getText().toString();
        String b2=btn[1].getText().toString();
        String b3=btn[2].getText().toString();
        String b4=btn[3].getText().toString();
        String b5=btn[4].getText().toString();
        String b6=btn[5].getText().toString();
        String b7=btn[6].getText().toString();
        String b8=btn[7].getText().toString();
        String b9=btn[8].getText().toString();
        if(b1.equals(b2)&&b2.equals(b3)&&!b1.equals(""))
        {
            for (int i=0;i<9;i++)
                btn[i].setEnabled(false);
            tv.setText("Congratulation winner is "+b1);
            dialog.show();
        }
        else if(b4.equals(b5)&&b5.equals(b6)&&!b4.equals(""))
        {
            for (int i=0;i<9;i++)
                btn[i].setEnabled(false);
            tv.setText("Congratulation winner is "+b4);
            dialog.show();
        }
        else if(b7.equals(b8)&&b8.equals(b9)&&!b7.equals(""))
        {
            for (int i=0;i<9;i++)
                btn[i].setEnabled(false);
            tv.setText("Congratulation winner is "+b7);
            dialog.show();
        }
        else if(b1.equals(b4)&&b4.equals(b7)&&!b1.equals(""))
        {
            for (int i=0;i<9;i++)
                btn[i].setEnabled(false);
            tv.setText("Congratulation winner is "+b1);
            dialog.show();
        }
        else if(b2.equals(b5)&&b5.equals(b8)&&!b2.equals(""))
        {
            for (int i=0;i<9;i++)
                btn[i].setEnabled(false);
            tv.setText("Congratulation winner is "+b2);
            dialog.show();
        }
        else if(b3.equals(b6)&&b6.equals(b9)&&!b3.equals(""))
        {
            for (int i=0;i<9;i++)
                btn[i].setEnabled(false);
            tv.setText("Congratulation winner is "+b3);
            dialog.show();
        }
        else if(b1.equals(b5)&&b5.equals(b9)&&!b1.equals(""))
        {
            for (int i=0;i<9;i++)
                btn[i].setEnabled(false);tv.setText("Congratulation winner is "+b1);
            dialog.show();
        }
        else if(b3.equals(b5)&&b5.equals(b7)&&!b3.equals(""))
        {
            for (int i=0;i<9;i++)
                btn[i].setEnabled(false);
            tv.setText("Congratulation winner is "+b3);
            dialog.show();
        }

    }
    public void restart()
    {
        btn[0]=findViewById(R.id.btn1);
        btn[1]=findViewById(R.id.btn2);
        btn[2]=findViewById(R.id.btn3);
        btn[3]=findViewById(R.id.btn4);
        btn[4]=findViewById(R.id.btn5);
        btn[5]=findViewById(R.id.btn6);
        btn[6]=findViewById(R.id.btn7);
        btn[7]=findViewById(R.id.btn8);
        btn[8]=findViewById(R.id.btn9);
        for(int i=0;i<9;i++)
        {
            btn[i].setText("");
            btn[i].setEnabled(true);
        }
        flag=0;
        dialog.dismiss();
    }
}