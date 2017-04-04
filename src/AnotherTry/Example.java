package AnotherTry;

import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {

          TreeSet<Comp> ex = new TreeSet<Comp>();

        ex.add(new Comp("Петров", 10)); 
      	ex.add(new Comp("Сидоров", 20)); 
      	ex.add(new Comp("Вазаев", 4));
      	ex.add(new Comp("Газуев", 2));
      	ex.add(new Comp("Иванов", 1000));
      	ex.add(new Comp("Пучков", 1));
      	ex.add(new Comp("Колобков", 23));   

          for(Comp e : ex) {
                 System.out.println("Pupil: " + e.str + ", mark: " + e.number);
          }
    }
}
