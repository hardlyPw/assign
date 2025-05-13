package ProductOrder;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        for(int i = 0; i<3; i++){
            productOrders[i] = new ProductOrder();
        }
        productOrders[0].price = 2000;
        productOrders[0].productName = "두부";
        productOrders[0].quantity = 2;

        productOrders[1].price = 5000;
        productOrders[1].productName = "김치";
        productOrders[1].quantity = 1;

        productOrders[2].price = 1500;
        productOrders[2].productName = "콜라";
        productOrders[2].quantity = 2;
        int sum = 0;
        for(int j =0; j<3; j++){
            System.out.println("상품명: "+productOrders[j].productName+", 가격: "+productOrders[j].price+", 수량: "+productOrders[j].quantity);
            sum+=productOrders[j].price*productOrders[j].quantity;
        }
        System.out.println("총 결제 금액: "+sum);
    }
}
