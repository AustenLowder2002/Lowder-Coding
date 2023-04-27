package edu.bsu.cs222;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.net.URL;

public class ErrorsTest {
    @Test
    public void testBlank() {
        String articleSearch = "";
        Boolean resultBool = Errors.errorBlank(articleSearch);
        Assertions.assertTrue(resultBool);
    }

    @Test
    public void testNotBlank() {
        String articleSearch = "D";
        Boolean resultBool = Errors.errorBlank(articleSearch);
        Assertions.assertFalse(resultBool);
    }

    @Test
    public void testPageNotFound() throws IOException {
        String articleSearch = "OogityBoogityBoodlesITookYourNoodles";
        Boolean resultBool = Errors.pageNotFound(articleSearch);
        Assertions.assertTrue(resultBool);
    }

    @Test
    public void testPageFound() throws IOException {
        String articleSearch = "James";
        Boolean resultBool = Errors.pageNotFound(articleSearch);
        Assertions.assertFalse(resultBool);
    }

    @Test
    public void testConnection() throws IOException {
        URL url = new URL("http://www.google.com");
        Boolean resultBool = Errors.connectionError(url);
        Assertions.assertTrue(resultBool);
    }

    @Test
    public void testNoConnection() throws IOException {
        URL url = new URL("http://www.shmoogledoogle.com");
        Boolean resultBool = Errors.connectionError(url);
        Assertions.assertFalse(resultBool);
    }
}

