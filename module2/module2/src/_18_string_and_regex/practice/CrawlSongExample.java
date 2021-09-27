package _18_string_and_regex.practice;

import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n", "");
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
////          //  URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
//            InputStream im = new FileInputStream("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
//            DataInputStream  dm = new DataInputStream(im);
//            int url = dm.readByte();
//            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
//            scanner.useDelimiter("\\Z");
//            String content = scanner.next();
//            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
