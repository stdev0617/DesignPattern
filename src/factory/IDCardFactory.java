package factory;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List owners = new ArrayList<>();
    public static Long id = IdMaker.getInstance().getNextId();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, id);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    public List getOwners() {
        return owners;
    }
}
