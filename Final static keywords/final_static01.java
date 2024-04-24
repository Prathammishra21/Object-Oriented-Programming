public class final_static01 {
    final void area(){     // generally useed to prevent overriing and inheritance.
        System.out.println("hello world");

    }
}

//When the program is running the overriding determines which one to rub hence it is know as late binding .
/*As the final method cant be overridden a call to one can be resolved at compile time,
 it is called early binding.
*/

/*We can inherit static methods but cant be overridden because the main class is always 
going to be called as static methods does not depends on objects */
