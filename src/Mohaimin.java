public class Mohaimin extends Laptop{
    Mohaimin(){
        super.name = "MSi";
    }

    @Override
    void aboutGadget() {
        System.out.println("Welcome");
    }
    public static void main(String[] args){
        Mohaimin obj = new Mohaimin();
        obj.display();
    }
}
