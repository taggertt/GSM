public class main {
    public static void main(String[] args){
        int account = 100;
        int currentBonus;
        int refill = 1100;
        account = account + refill;

        if (refill>1000) {currentBonus = refill/100; account = account + currentBonus;
        System.out.println("На счёте сейчас - " + account + " рублей. Начислено " + currentBonus + " бонусов.");}
        else {
            System.out.println("На счёте - " + account + " рублей. Бонусы не начислены.");
        }
    }
}
