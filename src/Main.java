public class Main {
    public static void main(String[] args) {

        Hero[] heroes = createHeroes();
        System.out.println("Heroes info:");
        for (Hero hero : heroes) {
            System.out.println(" Health " + hero.getHealth() +
                    " | Damage " + hero.getDamage() +
                    " | SuperPower " + hero.getSuperPower());
        }

        Boss boss = new Boss();
        boss.setHealth(300);
        boss.setDamage(50);
        boss.setProtection("Block");
        System.out.println("Boss info:");
        System.out.println(" Health: " + boss.getHealth() +
                " | Damage: " + boss.getDamage() +
                " | Protect: " + boss.getProtection());
    }

    public static Hero[] createHeroes() {
        Hero Islam = new Hero(70, 100, "Chidori");
        Hero Zypar = new Hero(55, 70);
        Hero Nurdan = new Hero(125, 110, "Rasengan");

        Hero[] heroes = {Islam, Zypar, Nurdan};
        return heroes;
    }
}