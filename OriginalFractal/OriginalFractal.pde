public void setup() 
{
	size(800, 800);
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