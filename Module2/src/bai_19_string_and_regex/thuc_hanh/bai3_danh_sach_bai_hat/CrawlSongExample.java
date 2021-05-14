package bai_19_string_and_regex.thuc_hanh.bai3_danh_sach_bai_hat;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            InputStreamReader inputStreamReader=new InputStreamReader(url.openStream());
            Scanner scanner = new Scanner(inputStreamReader);
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            inputStreamReader.close();

            content = content.replaceAll("\\n+", "");

            Pattern pattern = Pattern.compile("\"name_song\" title=\"(.*?)\" onclick");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}