Teacher teacher;
Student student1;
Student student2;

void setup() {
  teacher  = new Teacher("Bob", 55, false);
  student1 = new Student("Hans", 25, false, 1);
  student2 = new Student("Grete",   24, true,  2);

  println("Teacher: " + teacher.name);
  println("Student 1: " + student1.name + " (team " + student1.datamatikerTeam + ")");
  println("Student 2: " + student2.name + " (team " + student2.datamatikerTeam + ")");
}
