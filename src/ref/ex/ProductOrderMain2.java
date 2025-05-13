package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);
        printOrder(productOrders);
        getTotalAmount(productOrders);
        
        

    }

    static ProductOrder createOrder(String name, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = name;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrder(ProductOrder[] productOrders){
        for(int i = 0 ; i<productOrders.length; i++){
            System.out.println("상품명: "+productOrders[i].productName+", 가격: "+productOrders[i].price+", 수량: "+productOrders[i].quantity);
        }
    }
    static void getTotalAmount(ProductOrder[] productOrders){
        int sum = 0 ;
        for(int i = 0 ; i<productOrders.length; i++){
            sum+=productOrders[i].price*productOrders[i].quantity;
        }
        System.out.println("총 결제 금액: "+sum);
    }
}
