package day_38_Static.staticBlock;

public class StaticInit {
  static final int age;
  int counter;

  static {
      age=10;
  }
  private static final int one;
  private static final int two;
  private static final int three=3;
  private static final int four;
  static {
      one=1;
      two=2;
      //three=4;// zaten bir değeri olduğu için değer atayamayız.
      four=4;
  }

}
