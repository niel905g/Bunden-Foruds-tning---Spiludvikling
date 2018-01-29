package com.erikogniels.labyrintspil;

import javax.swing.*;
import java.awt.*;

public class Player extends JPanel {
    int x, y;

    public Player() {
        this.setBackground(Color.getHSBColor(0.3f, 0.3f, 29));
        this.setSize(Maze.panelSize, Maze.panelSize);
    }

    public void moveLeft() {
        if(x > 0 && Maze.map[x-1][y] == 1){
            this.setLocation(this.getX()-25, this.getY());
            x--;
        }
    }

    public void moveRight() {
        if(x < Maze.columns-1 && Maze.map[x+1][y] == 1){
            this.setLocation(this.getX()+25, this.getY());
            x++;
        }
    }

    public void moveUp() {
        if(y > 0 && Maze.map[x][y-1] == 1){
            this.setLocation(this.getX(), this.getY()-25);
            y--;
        }
    }

    public void moveDown() {
        if(y < Maze.rows-1 && Maze.map[x][y+1] == 1){
            this.setLocation(this.getX(), this.getY()+25);
            y++;
        }
    }
}
