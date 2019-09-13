public class MainClass {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.orderId = 201803120001L;
        shop.customerId = "abc123";
        shop.orderDate = "2018년 3월 12일";
        shop.customerName = "홍길순";
        shop.productId = "PD345-12";
        shop.shippingAddress = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문 번호: " + shop.orderId);
        System.out.println("주문자 아이디: " + shop.customerId);
        System.out.println("주문 날짜: " + shop.orderDate);
        System.out.println("주문자 이름: " + shop.customerName);
        System.out.println("주문 상품 번호: " + shop.productId);
        System.out.println("배송 주소: " + shop.shippingAddress);
    }
}
