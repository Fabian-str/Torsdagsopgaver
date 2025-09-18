// Task 6
int red = color(255,0,0);
int yellow = color(255,255,0);
int green = color(0,255,0);
int gray = color(50);
int light1, light2, light3;

void setup(){
  size(500,500);
  background(255);
  rectMode(CENTER);
  ellipseMode(CENTER);
  light1 = red;
  light2 = gray;
  light3 = gray;

}

void draw(){
  fill(100);
  rect(250,250,150,350);
  
  switch(frameCount%400){
    case 0:
      light1 = red;
      light2 = gray;
      light3 = gray;
    break;
    case 150:
      light1 = gray;
      light2 = yellow;
      light3 = gray;
    break;
    case 200:
      light1 = gray;
      light2 = gray;
      light3 = green;
    break;
  }
  
  fill(light1);
  ellipse(250,150,90,90);
  fill(light2);
  ellipse(250,250,90,90);
  fill(light3);
  ellipse(250,350,90,90);

}
