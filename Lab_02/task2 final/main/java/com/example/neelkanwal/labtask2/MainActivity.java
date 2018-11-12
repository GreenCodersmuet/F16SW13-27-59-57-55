package com.example.neelkanwal.labtask2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int counter=0;
    String name[] = {"Gallon", "Dudley", "Rikuo"};
    String game[] = {"Vampire Savior", "3rd Strike", "Vampire Hunter"};
    String mail[] = {"j.tailban@darkstalkers.com", "guttertrash@3rdstrike.com", "rikuo@vampirehunter.com"};
    int image[] = {R.drawable.gallon, R.drawable.dudley, R.drawable.rikuo};
    TextView nameview, gameview, emailview;
    ImageView iv;
    Button prev, next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.imageView);
        nameview=findViewById(R.id.textView);
        gameview=findViewById(R.id.textView2);
        emailview=findViewById(R.id.textView3);
        prev=findViewById(R.id.button);
        next=findViewById(R.id.button2);
    }
    public void prevpress(View v){
        counter--;
        if (counter<0){
            counter=name.length-1;
        }
        nameview.setText(name[counter]);
        gameview.setText(game[counter]);
        emailview.setText(mail[counter]);
        iv.setImageResource(image[counter]);
    }
    public void nextpress(View v){
        counter++;
                if(counter==name.length) {
                    counter = 0;
                }
        nameview.setText(name[counter]);
        gameview.setText(game[counter]);
        emailview.setText(mail[counter]);
        iv.setImageResource(image[counter]);
    }
}

