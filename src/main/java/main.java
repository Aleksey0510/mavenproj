public class main {

    public static void main(String[] agrs) {
        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(1000, true);
        System.out.println(expected + "== ? ==" + actual);
    }
}
