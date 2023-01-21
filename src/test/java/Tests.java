import org.example.Main;
import org.example.ShorteningOfTitle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
    int len = 25;

    @Test
    @DisplayName("Title length above upper border Test")
    public void lenAboveBorderSuccessfulTest() {
        String testString = "Volvo released a new car with the following spec: V6 236HP. It will cost $22647 and going to be sold in New York only";
        String result = "Volvo released a new...";
        Assertions.assertEquals(result, ShorteningOfTitle.shorteningOfTitle(testString, len));
    }
    @Test
    @DisplayName("Title length within border Test")
    public void lenWithinBorderSuccessfulTest() {
        String testString = "Volvo released a car";
        String result = "Volvo released a car";
        Assertions.assertEquals(result, ShorteningOfTitle.shorteningOfTitle(testString, len));
    }
    @Test
    @DisplayName("Title length equal upper border Test")
    public void lenEqualBorderSuccessfulTest() {
        String testString = "Volvo released new carsss";
        String result = "Volvo released new carsss";
        Assertions.assertEquals(result, ShorteningOfTitle.shorteningOfTitle(testString, len));
    }
    @Test
    @DisplayName("Title length equal upper border and last character is space Test")
    public void lenEqualBorderLastCharSpaceSuccessfulTest() {
        String testString = "Volvo released new carss ";
        String result = "Volvo released new carss ";
        Assertions.assertEquals(result, ShorteningOfTitle.shorteningOfTitle(testString, len));
    }
    @Test
    @DisplayName("Enter title on language which different from English Test")
    public void anotherLanguageSuccessfulTest() {
        String testString = "Volvo выпустила новый автомобиль со следующей спецификацией: V6 236HP. Он будет стоить $22647 и будет продаваться только в Нью-Йорке.";
        String result = "Volvo выпустила новый...";
        Assertions.assertEquals(result, ShorteningOfTitle.shorteningOfTitle(testString, len));
    }
    @Test
    @DisplayName("Empty title string Test")
    public void emptyStringUnSuccessfulTest() {
        String testString = "";
        String result = "Empty string, please enter title";
        Assertions.assertEquals(result, ShorteningOfTitle.shorteningOfTitle(testString, len));
    }
    @Test
    @DisplayName("Title string is null Test")
    public void nullStringUnSuccessfulTest() {
        String testString = null;
        String result = "Empty string, please enter title";
        Assertions.assertEquals(result, ShorteningOfTitle.shorteningOfTitle(testString, len));
    }
}
