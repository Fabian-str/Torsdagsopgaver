Teacher teacher;


void setup() {
  teacher  = new Teacher("Bob", 55, false);


  println("First the teachers name was: " + teacher.name);
  
  teacher.changeName("Arne");
  
  println("Now the teachers name is: " + teacher.name);
  
}
