// Task 6
// In this task you will create an integer array with 2 dimensions, that holds values of 0, 1, 0, 1, etc. The instructions below will help you get started.
// 6.a Create a double int called board[][] with the length of 8 in both arrays.
// 6.b In setup() create a double for loop that loops through the board and alternates between assigning the value of 0 and 1 (e.g. board[x][y] = 0;).
  // Hint
    // use the modulus operator
// 6.c In draw() create a double for loop that loops through the board and draws a rect for each element with the sideLength of 40 (e.g. rect(x * sideLength, y * sideLength, sideLength, sideLength); )
// 6.d Before drawing the rect in the previous step, add a fill() statement, that fills with the value of 0 if the board[x][y] == 0 and 255 if the the board[x][y] == 1.

int[][] board = new int[8][8];
int sideLength = 40;

void settings() {
  size(8 * sideLength, 8 * sideLength);
}

void setup() {
  size(8 * sideLength, 8 * sideLength);
  noStroke();

  for (int y = 0; y < 8; y++) {
    for (int x = 0; x < 8; x++) {
      board[x][y] = (x + y) % 2;
    }
  }
}

void draw() {
  for (int y = 0; y < 8; y++) {
    for (int x = 0; x < 8; x++) {
      if (board[x][y] == 0) fill(0);
      else fill(255);
      rect(x * sideLength, y * sideLength, sideLength, sideLength);
    }
  }
}
