public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676; // стоимость билета в рублях
        int rubPerMile = 20; // кол-во рублей для одной бонусной мили
        int bonus = ticketPrice / rubPerMile; // кол-во выдаваемых бонусных милей

        System.out.println(bonus + " бонусных милей начислено за билет стоимостью " + ticketPrice + "р.");
    }


}
