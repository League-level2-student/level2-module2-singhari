package _08_LeagueSnake;

import processing.core.PApplet;
/*
 * This class will be used to represent each part of the moving snake.
 * 
 * 1. Add x and y member variables.
 *    They will hold the corner location of each segment of the snake.
 * 
 * 2. Add a constructor with parameters to initialize each variable.
 */
public class Segment extends PApplet{
    float x;
    float y;
    
    public Segment(float x, float y) {
    	this.x = x;
    	this.y=y;
    	rect(x,y,10f,10f);
    }
	
}
