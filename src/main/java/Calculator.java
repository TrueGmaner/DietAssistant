import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Calculator {
    private static HashMap<String ,MealProduct> mealMap= new HashMap<>();

    public static HashMap<String, MealProduct> readFile(File file){
        try {
            CSVParser parser = CSVParser.parse(file, Charset.forName("UTF-8"), CSVFormat.RFC4180.withFirstRecordAsHeader().withSkipHeaderRecord());
            List<CSVRecord> records = parser.getRecords();

            for (CSVRecord record : records) {
                String name = record.get("Название");
                int calories = Integer.parseInt(record.get("КилоКалории/100Грамм"));
                double price = Double.parseDouble(record.get("Цена/100Грамм"));
                if (record.get("ВесШтуки").equals(" ")) {
                    MealProduct obj = new MealProduct(name, calories, null, price);
                    mealMap.put(name, obj);
                }
                else {
                    int weight = Integer.parseInt(record.get("ВесШтуки"));
                    MealProduct obj = new MealProduct(name, calories, weight, price);
                    mealMap.put(name, obj);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return mealMap;
    }

    public static void printMealMap(){
        System.out.println(mealMap);
        System.out.println(mealMap.get("Молоко").getWeightOfOnePiece());
    }
}
