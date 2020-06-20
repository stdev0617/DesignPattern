package abstractFactory;

import factory.Factory;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: Java Main Class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TrableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link joins = factory.createLink("중앙일보", "http://www.joins.com");
        Link chosum = factory.createLink("조선:일보", "http://www.joins.com");
    }
}
