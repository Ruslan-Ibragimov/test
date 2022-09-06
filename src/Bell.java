public class Bell {
    boolean order = true;

    public void sound(){
        if (order) {
            System.out.println("ding");
            order = !order;
        }
        else {
            System.out.println("dong");
            order = !order;
        }
    }
}
