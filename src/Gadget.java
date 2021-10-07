public class Gadget {
    String name;
    int price;
    Gadget(){
        name = "";
        price = 0;
    }
    public Gadget(String name, int price){
        this.name = name;
        this.price = price;
    }
    void aboutGadget(){
        System.out.println("Welcome...");
    }
    void display(){
        System.out.println("Name of the laptop = "+name);
        System.out.println("Price of the laptop = "+price);
    }
}
