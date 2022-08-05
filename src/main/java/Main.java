import java.io.File;

public class Main {
    public static void main(String[] args) {
        File dir1 = new File("C:\\Users\\alliw\\IdeaProjects\\DietAssistant\\src\\main\\resources");
        Calculator.readFile(new File(dir1, "FoodDataDebug.txt"));
        Calculator.printMealMap();
    }
}
