enum OrderStatus {
    PENDING, SHIPPED, DELIVERED, CANCELLED;
}
class Order {
    private int OrderId;
    private OrderStatus OrderStatus;
    public Order(int orderId, OrderStatus orderStatus) {
        this.OrderId = orderId;
        this.OrderStatus=OrderStatus.PENDING;
    }
    public void updateStatus(OrderStatus newStatus) {
        OrderStatus=newStatus;
        System.out.println("Order "+OrderId+" updated to "+newStatus);
    }
}
public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, OrderStatus.PENDING);
        order.updateStatus(OrderStatus.SHIPPED);
        order.updateStatus(OrderStatus.DELIVERED);
        order.updateStatus(OrderStatus.CANCELLED);

    }
}