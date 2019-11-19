package MyMenu;

public class RunMenu {
    public static void main(String[] args) {

        for (MyMenu menu: MyMenu.values()) {
            System.out.println("===============" + menu.getId() + "============");
            System.out.println(menu.ordinal());  // 顺序
            System.out.println(menu.name());  // Mingzi
            System.out.println(menu.toString());
        }

        System.out.println(MyMenu.valueOf("abc"));

    }
}
