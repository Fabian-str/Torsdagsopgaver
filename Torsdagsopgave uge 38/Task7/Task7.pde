ArrayList<Integer> intList = new ArrayList<Integer>();
ArrayList<String> strList = new ArrayList<String>();
ArrayList<Boolean> booList = new ArrayList<Boolean>();

void printList(ArrayList<String> listToPrint) {
  for (String s : listToPrint) {
    print(s + ", ");  
  }
}

int sumList(ArrayList<Integer> numbers) {
  int sum = 0;
  for (int n : numbers) {
    sum += n;
  }
  return sum;
}

double averageList(ArrayList<Integer> numbers) {
  if (numbers.isEmpty()) return 0.0;
  return sumList(numbers) / (double) numbers.size();
}
void setup() {
  
  intList.add(5);
  intList.add(10);
  intList.add(20);
  
  strList.add("København");
  strList.add("Roskilde");
  strList.add("Holbæk");
  
  booList.add(true);
  booList.add(false);
  booList.add(true);
  
  print("String: ");
  printList(strList);
  
  int total = sumList(intList);
  println("\nSum: " + total + ".");
  
  double avg = averageList(intList);
  println("Average: " + avg + ".");
}
