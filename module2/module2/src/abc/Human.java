package abc;

import java.util.ArrayList;

public class Human<E> {
    private String name ;
    private int old ;
    private String hobbit ;

    public Human(String name, int old, String hobbit) {
        this.name = name;
        this.old = old;
        this.hobbit = hobbit;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void fly(){
        System.out.println("fly");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", hobbit='" + hobbit + '\'' +
                '}';
    }
//    public void show(E e ){
//            for (int i = 0; i < E.size(); i++) {
//                System.out.println(i + 1 + ":" + E.get(i));
//            }
//        }

}
