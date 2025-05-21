package access.ex;

public class ShoppingCart {
    Item items[] = new Item[10];
    private int i = 0;
    void addItem(Item item){
        items[i] = item;
        i++;
    }

    void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int j = 0 ; j<i ; j++){
            Item item = items[j];
            System.out.println("상품명: "+item.getName()+", 합계: "+item.getPrice());
        }
        System.out.println("전체 가격 합: "+totalPrice());
    }

    private int totalPrice(){
        int total = 0;
        for (int k = 0 ; k<i ; k++){
            Item item = items[k];
            total += item.getPrice();
        }
        return total;
    }
}
