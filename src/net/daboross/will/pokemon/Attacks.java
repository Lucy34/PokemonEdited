package net.daboross.will.pokemon;

public class Attacks {

    private String move;
    private int type;
    private int pp = 10;
    private int cur_pp;
    private int damage;
    private int cur_damage;

    public Attacks(String name) {
        move = name;
        cur_pp = pp;
    }

    public int getCurrentDamage() {
        return cur_damage;
    }

    public int getDamage(Monsters enemy) {
        if ("Growl".equals(move)) {
            if (enemy.cur_attack <= 0) {
                System.out.println("It had no effect!");
            } else {
                enemy.cur_attack = enemy.cur_attack - 1;
                System.out.println(enemy.name + "'s attack has been lowered to " + enemy.cur_attack + " / " + enemy.attack);
            }
            return 0;
        }
        if ("Tail Whip".equals(move)) {
            if (enemy.cur_def <= 0) {
                System.out.println("It had no effect!");
            } else {
                enemy.cur_def = enemy.cur_def - 1;
                System.out.println(enemy.name + "'s defense has been lowered to " + enemy.cur_def + " / " + enemy.def);
            }
            return 0;
        }
        if ("Thunderwave".equals(move)) {
            if (enemy.statusEffect == 1) {
                System.out.println("It had no effect!");
            } else {
                enemy.statusEffect = 1;
                System.out.println(enemy.name + " has been paralyzed");
            }
            return 0;
        }
        if ("Toxic".equals(move)) {
            if (enemy.statusEffect == 3) {
                System.out.println("It had no effect!");
            } else {
                enemy.statusEffect = 3;
                System.out.println(enemy.name + " has been posioned");
            }
            return 0;
        }
        if ("Sleep Powder".equals(move)) {
            if (enemy.statusEffect == 4) {
                System.out.println("It had no effect!");
            } else {
                enemy.statusEffect = 4;
                System.out.println(enemy.name + " has fallen asleep");
            }
            return 0;
        }
        if ("Fire Spin".equals(move)) {
            if (enemy.statusEffect == 2) {
                return 4;
            } else {
                enemy.statusEffect = 2;
                System.out.println(enemy.name + " has been burned");
                return 3;
            }
        }
        if ("Peck".equals(move)) {
            return 4;
        }
        if ("Pursuit".equals(move)) {
            return 4;
        }
        if ("Tackle".equals(move)) {
            return 5;
        }
        if ("Quick Attack".equals(move)) {
            return 6;
        }
        if ("Dig".equals(move)) {
            return 7;
        }
        if ("Ember".equals(move)) {
            return 5;
        }
        if ("Scratch".equals(move)) {
            return 7;
        }
        if ("Icy Wind".equals(move)) {
            return 6;
        }
        if ("Thundershock".equals(move)) {
            return 5;
        }
        if ("Water Gun".equals(move)) {
            return 7;
        }
        return 7;
    }

    public int getPP() {
        return pp;
    }

    public int getCurrentPP() {
        return cur_pp;
    }

    public int getType() {
        return type;
    }

    public String getDescription() {
        return "A Damaging Attack";
    }
}