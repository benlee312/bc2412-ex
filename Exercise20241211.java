public class Exercise20241211 {
  public static void main(String[] args){
    int x12 = 7;
    int y12 = (++x12 + 4) * x12++;
    //x12=7+1 -> then 8+4 -> then 12*8 -> then x12 = 8+1
    System.out.println(y12);
    System.out.println(x12);

    int age = 22;
    char gender = 'M';
    boolean isElderly = age >= 65;
    boolean isChild = age <= 18;
    boolean result = isElderly == true || isChild == true && gender == 'F';
    System.out.println(result);

    double h = 11;
    System.out.println(h %= 3);

    int o = 20;
    int testing = o-- / ++o; //?
    System.out.println(testing);
    System.out.println(o);
    int result4 = (o++ * 4 + o-- / ++o) * o;
    //20*4+(20/(20+1))=81*21=
    System.out.println(result4);
    // o=21
    System.out.println(o);

    
  }
  
}
