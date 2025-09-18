// Task 8
// 100 tilfældigt farvede og tilfældigt placerede cirkler. Skab et lignende billede med et while-loop. Koden skal hverken indeholde setup() eller draw() funktion.

size(500,500);
background(255);

int counter = 0;

while (counter <= 100){
  int size = int(random(5,150));
  int x = int(random(0, width));
  int y = int(random(0, height));
  int colors = color(random(0,255),random(0,255),random(0,255));
  fill(colors);
  ellipse(x,y,size,size);
  counter++;
}
