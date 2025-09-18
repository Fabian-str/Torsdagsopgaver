// Task 2
//2.a Lav en metode, printPartOfWord(), med tre parametre
  // 1. ordet der skal findes et udsnit af.
  // 2. start-index: tallet for det sted udsnittet skal starte
  // 3. slut-index: tallet for det sted udsnittet skal slutte
// Ex: argumenterne "København", 0 og 3 skal give outputtet "Køb".
// 2.b Kald metoden fra setup() med passende argumenter og se om den virker.
// 2.d Find ud af hvordan du skal ændre kaldet for at få de sidste 4 bogstaver i en hvilken som helst string.
// 2.e Tjek hvad der sker hvis man kalder metoden med negative værdier. Eller hvor start-index er højere end end slut index. Nu skal du sikre at metoden giver en passende besked, hvis man kommer til at kalde den med sådanne "forkerte" argumenter.

String lastFourCharacters(String word){
  if (word == null)
    return "Error: No word present.";
  if (word.length() < 4)
    return "Error: Word most be at least 4 characters in length.";
  int startIndex = word.length() - 4;
  int endIndex = word.length();
  String output = word.substring(startIndex, endIndex);
  return output;
}

String printPartOfWord(String word, int startIndex, int endIndex) { 
  if (word == null)
    return "Error: No word present.";
  if (startIndex < 0 || endIndex < 0)
    return "Error: Can not use negative numbers.";
  if (startIndex > endIndex)
    return "Error: Start-index can not be larger than end-index.";
  if (startIndex == endIndex)
    return "Error: Start-index and end-index can not share the same value.";
  String output = word.substring(startIndex, endIndex);  
  return output;
}

void setup(){
  println(printPartOfWord("København", 0, 3));
  println(lastFourCharacters("København"));
}
