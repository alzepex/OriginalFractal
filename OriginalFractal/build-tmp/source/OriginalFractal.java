import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup() 
{
	
}
public void draw() 
{
	background(255);
	fractal(200, 200, 200);
	fractal(400, 400, 200);
	fractal(600, 600, 200);
	fractal(200, 600, 200);
	fractal(600, 200, 200);
}
public void fractal(int x, int y, int len) 
{
	if(len < 20){
		ellipse(x, y, len, len);
	}
	else{
		stroke(15, 25, 100);
		noFill();
		fractal(x + 50 + len / 4, y, len / 2);
		fractal(x, y + 50 + len / 4, len / 2);
		fractal(x - 50 - len / 4, y, len / 2);
		fractal(x, y - 50 - len / 4, len / 2);
		ellipse(x, y, len, len);


	}
}
  public void settings() { 	size(800, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
