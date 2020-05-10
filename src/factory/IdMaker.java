package factory;

import singleton.Singleton;

public class IdMaker {

    private static IdMaker idMaker = new IdMaker();
    private static Long id = 0l;

    private IdMaker(){

    }

    public static IdMaker getInstance() {
        return idMaker;
    }

    public Long getNextId() {
        return id++;
    }

}
