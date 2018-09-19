import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScraper {
    public static void main(String[] unused) {
       String story = urlToString("http://erdani.com/tdpl/hamlet.txt");
       System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt"));
       System.out.println(story);
       System.out.println(uniqueWordCounter(story, "Hamlet"));
    }

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static int wordCount(String input) {
        String[] lines = input.split("\\s+");
        int sum = lines.length;
        return sum;
    }

    public static int uniqueWordCounter(String input, String word) {
        String[] lines = input.split("\\s+");
        int counter = 0;
        for (int i = 0; i < lines.length; i++){
            if(lines[i].equals(word)){
                counter++;
            }
        }
        return counter;
    }
}
