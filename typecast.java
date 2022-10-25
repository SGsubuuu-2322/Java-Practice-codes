class Typecasting{
   public static void main(String [] args){
      int my_int_1 = 3, my_int_2;
      System.out.println("Typecasting for Widening case :");
      double my_double_1 = my_int_1, my_double_2 = 23.45654;
      my_int_2 = (int)my_double_2;
      System.out.println(my_int_1);
      System.out.println(my_double_1);
      System.out.println("Typecasting for Narrowing case :");
      System.out.println(my_double_2);
      System.out.println(my_int_2);
      
   }
}