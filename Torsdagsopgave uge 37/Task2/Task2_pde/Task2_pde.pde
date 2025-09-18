boolean happy = true;

 void setup() {
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
   println(sum(5,5));
   println(upperCase("Hello from the uppercase method."));
   println("The first letter of this sentence is uppercase: " + isFirstLetterUpperCase("The"));
}

boolean iAmHappy(){
  // fill out what is missing here: 
  return happy;
}

int sum(int x, int y){
  int sum = x+y;
  return sum;
}

String upperCase(String upperCase){
  upperCase = upperCase.toUpperCase();
  return upperCase;
}

boolean isFirstLetterUpperCase(String upperCaseLetterTemp){
  if (upperCaseLetterTemp.length() == 0){
    return false;
  }
  char firstChar = upperCaseLetterTemp.charAt(0);
  return Character.isUpperCase(firstChar);
}
