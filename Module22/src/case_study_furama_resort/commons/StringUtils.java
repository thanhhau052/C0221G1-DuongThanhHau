
package case_study_furama_resort.commons;

public class StringUtils {
    public static final String COMA = ",";
    public static final String CSV = ".csv";

    public static String concat(String[] content, String coma) {
        StringBuffer outStr = new StringBuffer(content[0]);
        for (int i = 1; i < content.length; i++) {
            outStr.append(coma);
            outStr.append(content[i]);
        }
        return outStr.toString();
    }
}