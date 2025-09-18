Student student1;
Student student2;

void setup() {
  student1 = new Student("Hans", 25, false, 1);
  student2 = new Student("Grete", 24, true, 2);


  boolean classmates = isClassmates(student1, student2);

  if (classmates) {
    println(student1.name + " and " + student2.name + " are classmates.");
  } else {
    println(student1.name + " and " + student2.name + " are NOT classmates.");
  }
}

boolean isClassmates(Student s1, Student s2) {
  return s1.datamatikerTeam == s2.datamatikerTeam;
}
