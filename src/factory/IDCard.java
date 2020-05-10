package factory;

public class IDCard extends Product {

    private String owner;
    private Long id;

    IDCard(String owner, Long id) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
        this.id = IdMaker.getInstance().getNextId();
        getIdWithOwner();
    }

    @Override
    public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void getIdWithOwner() {
        System.out.println(owner+"의 ID는 "+id+" 입니다.");
    }

    public String getOwner() {
        return owner;
    }
}
