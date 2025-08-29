String address = "Firskovvej 18";
int a = 10;
int b = 5;
int sum = a+b;
int division = a/b;
String messege = "Hello World";

void setup(){
  println("Her er en adresse: "+address);
  println("Her er summen af 10 og 5: "+sum);
  println("Her er 10 divideret med 5: "+division);
  println("Her er en besked: "+"messege");
  address+=": 2800 Lyngby";
  b+=1;
  println("Her er den nye adresse: "+address);
  println("Her er variablen a og b: "+a+" "+b);
  a+=1;
  b+=1;
  println("Her er variablen a og b+1: "+a+" "+b);
  a+=3;
  b+=3;
  println("Her er variablen a og b+3: "+a+" "+b);
  a-=1;
  b-=1;
  println("Her er variablen a og b-1: "+a+" "+b);
}
