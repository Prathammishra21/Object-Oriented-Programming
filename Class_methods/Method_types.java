package Class_methods;
public class Method_types {
   static void fun1(){
       System.out.println("The boy is enjoying his life");
   }

   public void fun2(){
       System.out.println("The boy is not enjoying his life");
   }

    public static void main(String[] args) {
        fun1();
        Method_types Mt = new Method_types();
        Mt.fun2();
    }
}
