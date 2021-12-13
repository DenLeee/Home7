public class Train implements Moveable {
    private int number;   // номер
    private Lokomotiv lokomotiv;
    private Carriage type;        // тип (грузовой, пассажирский)
    private int countCarriege;       //количесвто вагонов
    private String way;     // маршрут от куда - куда

    public Train(Lokomotiv lokomotiv, Carriage type, int countCarriege, String way) {
        this.number ++;
        this.lokomotiv = lokomotiv;
        this.type = type;
        this.countCarriege = countCarriege;
        this.way = way;
        System.out.println("Поезд готов!");
    }


    public int getNumber() {
        return number;
    }

    public Lokomotiv getLokomotiv() {
        return lokomotiv;
    }

    public Carriage getType() {
        return type;
    }

    public int getCountCarriege() {
        return countCarriege;
    }

    public String getWay() {
        return way;
    }


}
