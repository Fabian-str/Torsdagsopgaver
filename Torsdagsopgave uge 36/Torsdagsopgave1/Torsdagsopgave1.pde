// Task 1
// 1. Lav variable: month og day.
// 2. Lav switch-case.
// 3. Udskriv måned og tilfældig dag.

String month = "April";
int day = 0;

void draw(){
  switch(month){
    case "Januar":
      day = (int) random(1, 31);
      println("Det er " + month + " d. " + day);
    break;
    case "Februar":
      day = (int) random(1, 28);
      println("Det er " + month + " d. " + day);
    break;
    case "Marts":
      day = (int) random(1, 31);
      println("Det er " + month + " d. " + day);
    break;
    case "April":
      day = (int) random(1, 30);
      println("Det er " + month + " d. " + day);
    break;
    case "Maj":
      day = (int) random(1, 31);
      println("Det er " + month + " d. " + day);
    break;
    case "Juni":
      day = (int) random(1, 30);
      println("Det er " + month + " d. " + day);
    break;
    case "Juli":
      day = (int) random(1, 31);
      println("Det er " + month + " d. " + day);
    break;
    case "August":
      day = (int) random(1, 31);
      println("Det er " + month + " d. " + day);
    break;
    case "September":
      day = (int) random(1, 30);
      println("Det er " + month + " d. " + day);
    break;
    case "Oktober":
      day = (int) random(1, 31);
      println("Det er " + month + " d. " + day);
    break;
    case "November":
      day = (int) random(1, 30);
      println("Det er " + month + " d. " + day);
    break;
    case "December":
      day = (int) random(1, 31);
      println("Det er " + month + " d. " + day);
    break;
  }
  noLoop();
}
