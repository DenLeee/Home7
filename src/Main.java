public class Main {
    public static void main(String[] args) {



        Train passagir1 = new Train(Lokomotiv.ELECTRO, new PassagirCarriage(8), 12, "Питер - Москва");

        Train cargo1 = new Train(Lokomotiv.FUEL, new CargoCarriage(12), 25, "ДонБас - ЕКБ");

        Ticked ticked1 = new Ticked("Денис", "Заргишиев", 32, "паспорт", passagir1);

        System.out.println(ticked1.toString());

        Carriage cargo3 = new CargoCarriage(4);




    }
}
