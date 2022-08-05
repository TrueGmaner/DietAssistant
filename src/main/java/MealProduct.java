public class MealProduct {
    private String name;
    private Integer kilocaloriesInHundredGrams;
    private Integer weightOfOnePiece;
    private double valueOfHundredGrams;

    public MealProduct(String name, Integer kilocaloriesInHundredGrams, Integer weightOfOnePiece, double valueOfHundredGrams) {
        this.name = name;
        this.kilocaloriesInHundredGrams = kilocaloriesInHundredGrams;
        this.weightOfOnePiece = weightOfOnePiece;
        this.valueOfHundredGrams = valueOfHundredGrams;
    }

    public MealProduct(String name, Integer kilocaloriesInHundredGrams, double valueOfHundredGrams) {
        this.name = name;
        this.kilocaloriesInHundredGrams = kilocaloriesInHundredGrams;
        this.weightOfOnePiece = null;
        this.valueOfHundredGrams = valueOfHundredGrams;
    }

    public String getName() {
        return name;
    }

    public Integer getKilocaloriesInHundredGrams() {
        return kilocaloriesInHundredGrams;
    }

    public Integer getWeightOfOnePiece() {
        return weightOfOnePiece;
    }

    public double getValueOfHundredGrams() {
        return valueOfHundredGrams;
    }
}
