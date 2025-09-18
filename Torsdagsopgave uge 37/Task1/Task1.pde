void setup (){
  printmethod();
  printString("Hello from the String.");
  myNameIs("Bob", 42);

}


void printmethod(){
  println("Hello from the method.");
}

void printString(String printStringTemp){
  println(printStringTemp);
}

void myNameIs(String name, int age){
  println("My name is " + name + ", I am " + age + " years old.");
}
