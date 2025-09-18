// Task 4
// 4.a Start a sketch and add a setup function, (set the size of the canvas).
// 4.b Add an array to the sketch that will be holding 10 Circle instances. (Circle being a datatype that you have not yet added)
// 4.c Write a class called Circle with the attributes (fields) xposition and yposition.
// 4.d Add a constructor to the Circle class with parametres for xposition and yposition.
// 4.e Test the class by creating one Circle object from the setup function.
// 4.f Add a method to the Circle class called display(), that will draw an ellipse at the position given by the two arguments, which the instance was created with (xposition and yposition).
// 4.g Test the display() -method by calling it on the instance you created in step 4.e.
  // Hint: circle.display();
// 4.h In the sketch main tab, declare an array in global scope called circles.
// 4.i In the setup function, instead of instantiating only 1 Circle object we need 10. Therefor, use a loop to create the instances. In the call to the constructor, give each instance unique position values, so that they will not be placed at exactly the same spot (experimentation is encouraged).
// 4.j Add the instances to the circles array. You may do this after instantiation or simultaneously.
// 4.k Add a method to the Circle class, called move, that adds a value to the x-position and a value to the y-position of the object, then draws the circle again. The values should be passed as parameters into the method.
// 4.l Test the new method by adding a for-each loop to the draw function, where move is called on each element of the array of Circles.
// 4.m OPTIONAL: Add a new class that draws something more complicated than a circle. It too should have a constructor, display and a move method. See if you can make it behave in roughly the same way as the circles.

Circle[] circles;
int N = 10;

void setup(){
  size(600,400);
  circles = new Circle[N];
  
  for (int i = 0; i < N; i++){
    float x = map(i, 0, N - 1, 50, width - 50);
    float y = height / 2 + sin(TWO_PI * i / N) * 80;
    circles[i] = new Circle(x,y);
  }
}

void draw(){
  background(250);
  
  for (Circle c : circles){
    c.move(random(-1.5, 1.5), random(-1.5, 1.5));
  }
}

class Circle{
  float xPosition;
  float yPosition;
  
  Circle(float xPosition, float yPosition){
    this.xPosition = xPosition;
    this.yPosition = yPosition;
  }

  void display(){
    noStroke();
    fill(30, 144, 255, 200);
    ellipse(xPosition, yPosition, 32, 32);
  }
  
  
  void move(float dx, float dy){
    xPosition += dx;
    yPosition += dy;
    
    xPosition = constrain(xPosition, 16, width - 16);
    yPosition = constrain(yPosition, 16, height - 16);
    
    display();  
  }
}

class Target{

  float x, y;
  Target(float x, float y){
    this.x = x;
    this.y = y;
  }
  void display(){
    noStroke();
    fill(255, 80);
    ellipse(x, y, 40, 40);
    fill(200, 0, 0, 180);
    ellipse(x, y, 18, 18);
  }
  void move(float dx, float dy){
    x += dx;
    y += dy;
    display();
  }
}
