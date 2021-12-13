public class Ticked {
    String name;
    String secondName;
    int age;
    String document;
    Train train;

    public Ticked(String name, String secondName, int age, String document, Train train) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.document = document;
        this.train = train;
        System.out.println("Билет куплен на поезд №" + train.getNumber());
    }


    @Override
    public String toString() {
        return "Билет{" +
                "имя='" + name + '\'' +
                ", Фамилия='" + secondName + '\'' +
                ", document='" + document + '\'' +
                ", '" + train.getWay() + '\'' +
                ", поезд №'" + train.getNumber() + '\'' +
                '}';
    }
}
