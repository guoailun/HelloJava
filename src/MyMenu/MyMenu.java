package MyMenu;

public enum MyMenu {

    Food(1),
    Cook(2),
    abc(3),
    d(3);

    private int id;

    MyMenu(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
