package template;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world!");
        AbstractDisplay d3 = new StringDisplay("안녕하슈");
        AbstractDisplay d4 = new StringDisplay("정민아");
        AbstractDisplay d5 = new StringDisplay("조금만");
        AbstractDisplay d6 = new StringDisplay("더 하면");
        AbstractDisplay d7 = new StringDisplay("된다.");

        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();
        d6.display();
        d7.display();

        d1.close();
        d2.close();
        d3.close();
        d4.close();
        d5.close();
        d6.close();
        d7.close();
    }
}
