// Task 3
// 3.a: lav 2 integer variable kaldet a og b. Print "Success!" hvis en af dem har værdien 10 eller hvis summen af de to variable er 10. Hvis ikke, så print "Failure!".
// 3.b: lav 2 integer variable kaldet min og max. Print "Success!" hvis følgende betingelse er opfyldt: summen af dem skal være højere end 10 og et af tallene skal være mindre end eller lig med 5.
// 3.c: lav 3 integer variable kaldet x, y and z. Print "Success!" hvis følgende betingelse er opfyldt: summen af dem er 30, men ingen af dem har værdien 10, 20 eller 30. Ellers print "Failure!".
// 3.d: Test at din kode virker ved at give variablene forskellige værdier og tjek at det printede output er korrekt.

int a = 0; // Step 1 variable
int b = 0; // Step 1 variable
int min = 0; // Step 2 variable
int max = 0; // Step 2 variable
int x = 0; // Step 3 variable
int y = 0; // Step 3 variable
int z = 0; // Step 3 variable

if (a == 10 || b == 10){
  println("Step 1: SUCCESS!");
} else {
  println("Step 1: FAILURE!");
}
if (min+max >= 10 && min <= 5 || max <= 5){
  println("Step 2: SUCCESS!");
} else {
  println("Step 2: FAILURE!");
}
if (x+y+z >= 30 && x != 10 || y != 10 && z != 10 && x != 20 && y != 20 && z != 20 && x != 30 && y != 30 && z != 30){
  print("Step 3: SUCCESS!");
} else {
  print("Step 3: FAILURE!");
}
