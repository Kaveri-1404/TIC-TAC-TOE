package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
public class GameActivity extends AppCompatActivity {
boolean gameActive=true;
    int activePlayer=0;
    int[] gameState={5, 5, 5, 5, 5, 5, 5, 5, 5};
    int[][] winPositions={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{1,4,8},{2,4,6}};

    public void tap(View view){
             ImageView img=(ImageView) view;
            int tappedImage=Integer.parseInt(img.getTag().toString());
        if (!gameActive) {
            gameReset(view);
        }
            if(gameState[tappedImage]==2 && gameActive){
                gameState[tappedImage]=activePlayer;
                img.setTranslationY(-1000f);
                if(activePlayer==0){
                    img.setImageResource(R.drawable.x);
                    activePlayer=1;
                    TextView Turn= findViewById(R.id.Turn);
                    turn.serText("O's Turn");
                }
                else{
                    img.setImageResource(R.drawable.o);
                    activePlayer=0;
                    TextView Turn= findViewById(R.id.Turn);
                    turn.serText("X's Turn");
                }

          img.animate().translationYBy(1000).setDuration(300);}
           for(int[] winningPosition: winPositions) {
              if ( gameState[winPosition[0]]==gameState[winPosition[1]]&&
                      gameState[winPosition[1]]==gameState[winPosition[2]]&&
                      gameState[winPosition[0]]!=2){
                  String winnerStr;
                  if(gameState[winPosition][0]==0){
                      winnerStr="X has won";
                  }
                  else{
                      winnerStr="O has won";
                  }
                  TextView Turn= findViewById(R.id.Turn);
                  turn.serText(winnerStr);
              }
           }

    }
    public void gameReset(View view){
        gameActive=true;
        activePlayer=0;
        for(int i=0; i<gameState.length; i++){
            gameState[i]=2;
        }
        ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
}