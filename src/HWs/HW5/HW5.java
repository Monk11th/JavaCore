package HWs.HW5;

public class HW5 {
    public static final String PATH = "src/HWs/HW5/data1.csv";
    public static final String PATH2 = "src/HWs/HW5/data2.csv";

    public static void main(String[] args) {
        String[] headers = { "Value 1", "Value 2", "Value 3" };
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };
        AppData appData = new AppData(headers, data);

        String[] alsoHeaders = { "1st", "2nd", "3rd"};
        int[][] alsoData = {
                {101, 201, 121},
                {301, 401, 501}
        };
        AppData alsoAppData = new AppData(alsoHeaders, alsoData);
        appData.writeToFile(PATH);
        AppData recievedAppData = AppData.readFromFile(PATH);
        System.out.println(recievedAppData);

        alsoAppData.writeToFile(PATH);
        AppData alsoRecievedAppData = AppData.readFromFile(PATH);
        System.out.println(alsoRecievedAppData);

        AppData recievedFromPath2AppData = AppData.readFromFile(PATH2);
        System.out.println(recievedFromPath2AppData);
    }
}
