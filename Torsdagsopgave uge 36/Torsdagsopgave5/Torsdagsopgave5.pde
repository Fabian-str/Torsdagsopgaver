// Task 5

void setup() {
  methodOne(); 
  methodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/
void methodOne(){
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 1001;
  
  String output;
  
  if (i > max){
    output = "i is greater than "+max+".";   
  } else {
    output = "i is NOT greater than"+max+".";
  }
  
  println(output);
   
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/

void methodTwo() 
{
  int weekDay = 0; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  
  if (weekDay < 5)
  {
    weekend = false;
  }
  else 
  {
    weekend = true;
  }
  
  // Print the name of the weekday here:
  switch(weekDay){
    case 0: println("Today is Monday."); break;
    case 1: println("Today is Tuesday."); break;
    case 2: println("Today is Wednesday."); break;
    case 3: println("Today is Thursday."); break;  
    case 4: println("Today is Friday."); break;  
    case 5: println("Today is Saturday."); break;  
    case 6: println("Today is Sunday."); break;  
  }    
  // Print if it is weekend here:
  if (weekend){
    println("It's the weekend!");
  }  
}
