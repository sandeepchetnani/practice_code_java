package OlaApp.Amazon;

public class Amazon {
    private Order order;
    public Order getter(){
       return order;
    }
    void doOrder(Order order){
        this.order=order;
        order.thanks();
    }

}
