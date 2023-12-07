package ua.hillel.zirukin.lessons.lesson4;

public class homeWork5 {

    public void homeWork5(String[] args) {

        int unitsWarriorLi = 860;
        int unitArcherLi = 860;
        int unitHorsemenLI = 860;

        int unitsWarriorsMin = (int) (1.5 * unitsWarriorLi);
        int unitsArchersMin = (int) (1.5 * unitArcherLi);
        int unitsCavalryMin = (int) (1.5 * unitHorsemenLI);

        int attackWarriorLi = 13;
        int attackArcherLi = 24;
        int attackCavalryLi = 46;

        int attackWarriorMin = 9;
        int attackArcherMin = 35;
        int attackCavalryMin = 12;

        int totalAttackMin = unitsWarriorsMin * attackWarriorMin + unitsArchersMin * attackArcherMin + unitsCavalryMin * attackCavalryMin;
        int totalAttackLi = unitsWarriorLi * attackWarriorLi + unitArcherLi * attackArcherLi + unitHorsemenLI * attackCavalryLi;

        System.out.println("Total Attack of Dynasty of Li" + totalAttackLi);
        System.out.println("Total Attack of Dynasty of Min" + totalAttackMin);

    }
}
