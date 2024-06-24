package Class_methods;

public class Website {
    public void ecommerce(){
        System.out.println("It is a website known for selling products to customer");
    }
    public void irctc(){
        System.out.println("It is used to book tickets for passengers...");
    }

    public static void main(String[] args) {
        Website wt = new Website();
        wt.ecommerce();
        wt.irctc();
    }
}
