package AnotherTry;

import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {

          TreeSet<Comp> ex = new TreeSet<Comp>();

        ex.add(new Comp("������", 10)); 
      	ex.add(new Comp("�������", 20)); 
      	ex.add(new Comp("������", 4));
      	ex.add(new Comp("������", 2));
      	ex.add(new Comp("������", 1000));
      	ex.add(new Comp("������", 1));
      	ex.add(new Comp("��������", 23));   

          for(Comp e : ex) {
                 System.out.println("Pupil: " + e.str + ", mark: " + e.number);
          }
    }
}
