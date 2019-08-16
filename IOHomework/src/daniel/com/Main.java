package daniel.com;

public class Main {

    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader();
        csvReader.reader("C:\\Users\\Daniel\\Desktop\\Challenges Udemy\\IOHomework\\src\\daniel\\com\\Competitors.csv");
        csvReader.list();
        csvReader.calculateTheTime();
        csvReader.sortListByTime();

        System.out.println("The Winner is: " + csvReader.athletes.get(0) + "\nThe Runner-up is: " +
                csvReader.athletes.get(1) + "\nThird Place is: " +
                csvReader.athletes.get(2));
    }

}

