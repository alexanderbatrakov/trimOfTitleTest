package org.example;

public class ShorteningOfTitle {

    public static String shorteningOfTitle(String title, int len) {

    if (title != null && !(title.equals("")) && title.length() <= len) {
        return title;
    } else if (title != null && !(title.equals("")) && title.length() > len) {
        String shortTitle = title.substring(0, len);
        if ((shortTitle.substring(len - 2).equals(" "))) {
            return (shortTitle + "...");
        } else {
            String[] splitShortString = shortTitle.split(" ");
            String resultString = "";
            for (int i = 0; i < splitShortString.length - 1; i++) {
                resultString = resultString + splitShortString[i] + " ";
            }
            return resultString.trim() + "...";
        }

    } else
        return "Empty string, please enter title";
    }
}

