package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int x = scanner.nextInt();
        ProductOrder[] productOrders = new ProductOrder[x];
        scanner.nextLine();

        for(int i = 1; i<= productOrders.length; i++){
            System.out.println(i + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String name = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            productOrders[i-1] = createOrder(name, price, quantity);
        }
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
