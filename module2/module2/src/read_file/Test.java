package read_file;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Test {
    static int a ;
  String name ;
  static String school = "DN";
  public Test(String name){

      this.name = name ;

  }

    public  void change() {
        System.out.println(name + school);
        int a = 5 ;
    }

    public static void main(String[] args) {
  Test test = new Test("tèo");
  Test.school = "PPT";
  test.change();
        System.out.println(school);
        System.out.println(a);

    }
}
