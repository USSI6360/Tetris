package com.example.tetris;
import com.nompor.gtk.APITypu;
import com.nompor.gtk.GTK;
import com.nompor.gtk.GTKColor;
import com.nompor.gtk.GTDView;
import com.nompor.gtk.draw.GTDGraphics;

public class Tetris {

    public static void main(String[] args) {
        GTK.start("TETRIS",250,500,new GTKView(){

            static final int BLOCK_SIZE=25;

            GTKColor red;
            GTKColor sky;
            GTKColor black;

            public void start(){
                red = GTK.createIntColor(255,0,0);
                sky = GTK.createIntColor(100,255,255);
                black = GTK.createIntColor(0,0,0);
            }

            int[][] fields = {
                 {0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}//5
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}//10
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}//15
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{0,0,0,0,0,0,0,0,0,0}
                ,{1,2,1,2,1,1,1,1,1,2}//20
            };

            static final int RED = 1;
            static final int SKYBLUE =2;

            public void draw(GTKGraphics g) {
                g.setColor(black);
                g.fillRect(0,0,GTK.getWith(),GTK.getHeight());
                for (int i = 0;i<fields;i++){
                    for(int j = 0; j< filds[i].length;j++){
                        swich(fields[i][j]){
                            case RED:g.setColor(red);break;
                            case SKYBLUE:g.setColor(sky);break;
                        }
                        if (fields[i][j] != 0){
                            g.fillRect(j*BLOCK_SIZE, i*BLOCK_SIZE,BLOCK_SIZE,BLOCK_SIZE);
                            g.setColor(black);
                            g.fdrawRect(j*BLOCK_SIZE, i*BLOCK_SIZE,BLOCK_SIZE,BLOCK_SIZE);
                        }
                    }
                }
            }
        },APIType.SWING);
    }
}
