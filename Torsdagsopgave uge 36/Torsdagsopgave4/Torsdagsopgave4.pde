// Task 4
// 4.a print tallene fra 0 til 20 ved hjælp af et for-loop.
// 4.b print alle lige tal fra 0 til 20 ved hjælp af et for-loop.
// 4.c Lav en variabel kaldet start og tildel den en int værdi. Lav et for-loop, som tæller 1 ned fra værdien af variablen start. Når dit for-loop når til 0, skal den printe "Take Off!"
// 4.d I det samme for-loop skal du tilføje kode, så tallene 3, 2 og 1 bliver printet som ord ("three", "two", "one").

void setup() {
  // Task 4.a
  print("Task 4.a: ");
  for (int i=1; i<=20; i++){
    print(i + ", ");
  }

  // Task 4.b
  print("\nTask 4.b: ");
  for (int i=0; i<=20; i++){
    if (i % 2 == 0){
      print(i + ", ");
    }
  }

  // Task 4.c
  int start = 10;
  print("\nTask 4.c: ");
  for (int i = start; i >= 0; i--){
    print(i + ", ");
    if (i == 0){
      print("Take Off!");
    }
  }

  // Task 4.d
  print("\nTask 4.d: ");
  String counter = "";
  start = 10;

  for (int i = start; i >= 0; i--){
    switch(i){
      case 3: counter = "three"; 
      break;
      case 2: counter = "two";   
      break;
      case 1: counter = "one";  
      break;
      default: counter = str(i); 
      break;
    }

    if (i == 0){
      println("Take Off!");
    } else {
      print(counter + " ");
    }
  }
}
