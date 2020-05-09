package factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("윤영민");
        Product card2 = factory.create("서창원");
        Product card3 = factory.create("최정민");
        card1.use();
        card2.use();
        card3.use();
    }
}
