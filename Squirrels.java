// Squirrels.java by Mr. Considine
// 9/17/19

import java.util.*;
import java.io.*;

class Squirrels {

  public static void main(String[] args) {

    System.out.println("\n====== WELCOME TO THE" +
    " SQUIRREL TRACKER ======\n\n");

    ArrayList<String> names = new ArrayList<String>();
    ArrayList<Double> lengths = new ArrayList<Double>();
    ArrayList<Double> weight = new ArrayList<Double>();
//when the squirrel is bigger than a 10,000000 grams then it does an E7 thing
//instead it could display the number in kilagrams
//if the squirrel has two names then the system does not like that, but it is fine with other languages
//shouldn't allow squirrels to be negative
//squirrels shouldn't be non-exisentent 
    try {
      File data = new File("squirrelData.txt");
      Scanner fr = new Scanner(data);

      while (fr.hasNext()) {
        names.add(fr.next());
        lengths.add(Double.parseDouble(fr.next()));
        weight.add(Double.parseDouble(fr.next()));
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    //calculate length
    Double best = 0.0;
    Double worst = 10000.0;
    int b = 0;
    int w = 0;
    for (int i = 0; i < lengths.size(); i++) {
      if (lengths.get(i) > best) {
        best = lengths.get(i);
        b = i;
      }
      if (lengths.get(i) < worst) {
        worst = lengths.get(i);
        w = i;
      }
    }
    System.out.println("The longest squirrel is " +
    names.get(b) + ".\nThis squirrel is " + lengths.get(b) +
    " cm long.\n");
    System.out.println("The shortest squirrel is " +
    names.get(w) + ".\nThis squirrel is " + lengths.get(w) +
    " cm long.\n\n");

    //calculate weight
    Double best2 = 0.0;
    Double worst2 = 10000.0;
    int b2 = 0;
    int w2 = 0;
    for (int i = 0; i < weight.size(); i++) {
      if (weight.get(i) > best2) {
        best2 = weight.get(i);
        b2 = i;
      }
      if (weight.get(i) < worst2) {
        worst2 = weight.get(i);
        w2 = i;
      }
    }
    System.out.println("The heaviest squirrel is " +
    names.get(b2) + ".\nThis squirrel is " + weight.get(b2) +
    " grams.\n");
    System.out.println("The smallest squirrel is " +
    names.get(w2) + ".\nThis squirrel is " + weight.get(w2) +
    " grams.\n\n");

  }
}
