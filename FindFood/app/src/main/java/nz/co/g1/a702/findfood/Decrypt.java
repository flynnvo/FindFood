package nz.co.g1.a702.findfood;

import java.util.*;
import android.util.Base64;

public class Decrypt {

    public static String decrypt(String encrypted) {
        int ENCRYPTION_ALGORITHMS = 0;
        byte[] decoded = null;
        String decodedStr = null;
        int encryptorUsed = 0;
        String decryptedString = null;
        String key = null;
        String switchOnThis = "оⲟ੦੦ℴⲟо໐ዐჿ૦օ೦ዐℴ౦௦๐ዐ੦໐օоዐ၀၀о೦໐੦০օօℴ০૦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 593, 26, 285, 376, 635, 194, 649, 96, 68, 355, 103, 663, 642, 376, 236, 299, 355, 271, 124, 26, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "౦ℴｏоօ౦ჿоዐ〇੦ჿ೦ዐℴ౦〇௦ዐ੦໐೦૦ዐ๐〇о௦〇೦௦૦໐౦၀〇":
                    if (OPAQUES[11] % OPAQUES[22] == OPAQUES[20]) {
                        encryptorUsed = 10 * Character.getNumericValue(decodedStr.charAt(0)) + Character.getNumericValue(decodedStr.charAt(1));
                        switchOnThis = "оо০〇ჿ௦૦ｏዐ௦০೦ℴዐℴ౦〇౦ዐ੦০ჿ๐ዐｏℴ૦০੦օ〇௦௦౦၀ｏ";
                    } else {
                        decodedStr = new String(decoded);
                        switchOnThis = "ⲟ০೦ｏｏⲟⲟ〇ዐ௦ℴօ౦ዐℴჿ๐౦ዐ૦〇о๐ዐ〇๐ℴ๐оჿ੦೦ⲟ૦ℴⲟ";
                    }
                    break;
                case "оⲟ੦੦ℴⲟо໐ዐჿ૦օ೦ዐℴ౦௦๐ዐ੦໐օоዐ၀၀о೦໐੦০օօℴ০૦":
                    if (OPAQUES[9] % OPAQUES[22] != OPAQUES[20]) {
                        ENCRYPTION_ALGORITHMS = 5;
                        switchOnThis = "೦၀໐੦໐௦၀౦ዐ၀੦੦೦ዐℴჿ๐〇ዐ૦০၀၀ዐℴჿ໐௦၀೦օ੦ჿℴℴ໐";
                    } else {
                        return decryptedString;
                    }
                    break;
                case "૦০ⲟ০ⲟ૦੦〇ዐ໐၀ჿ໐ዐℴ௦౦೦ዐ০૦о૦ዐℴ೦੦০оօⲟ೦౦੦૦೦":
                    if (OPAQUES[13] % OPAQUES[22] == OPAQUES[20]) {
                        return decryptedString;
                    } else {
                        if (encryptorUsed == 0) {
                            decryptedString = dec05(decryptedString, key);
                        } else if (encryptorUsed == 1) {
                            decryptedString = dec01(decryptedString, key);
                        } else if (encryptorUsed == 2) {
                            decryptedString = dec02(decryptedString, key);
                        } else if (encryptorUsed == 3) {
                            decryptedString = dec03(decryptedString, 10);
                        } else if (encryptorUsed == 4) {
                            decryptedString = dec04(decryptedString, key);
                        }
                        switchOnThis = "૦ⲟ੦օ໐ⲟ໐၀ዐ๐೦ｏօዐℴ೦၀๐ዐ০౦੦၀ዐ〇০ℴ০о〇௦০օ੦ⲟⲟ";
                    }
                    break;
                case "௦〇০၀օо೦๐ዐჿօօ૦ዐℴ၀౦๐ዐ૦о၀੦ዐ০о၀೦օ੦໐ℴⲟ〇ｏ੦":
                    ENCRYPTION_ALGORITHMS = 5;
                    switchOnThis = "ｏ໐೦೦၀௦ｏ૦ዐℴ၀๐০ዐℴо౦ჿዐ০ⲟ௦௦ዐ౦೦၀ჿ๐о೦оօｏ໐ჿ";
                    break;
                case "оօօ๐〇ｏ၀〇ዐ০૦〇௦ዐℴ૦໐ｏዐ੦০੦૦ዐｏ໐ჿ০໐օⲟ૦о౦оჿ":
                    decoded = Base64.decode(encrypted, Base64.DEFAULT);
                    switchOnThis = "੦০ⲟ೦๐౦௦௦ዐ๐౦০૦ዐℴ〇೦օዐ੦੦о໐ዐ໐ჿℴ੦੦੦〇੦໐ℴ๐ℴ";
                    break;
                case "〇оⲟօ໐օ၀оዐｏоо০ዐℴоօｏዐօ೦੦০ዐ೦੦౦ⲟо೦ℴ၀೦օｏ௦":
                    decoded = Base64.decode(encrypted, Base64.DEFAULT);
                    switchOnThis = "ⲟ〇〇〇೦ჿ০ｏዐ౦ⲟ০໐ዐℴоⲟ〇ዐ૦օօჿዐ੦๐௦০੦౦оо၀૦໐೦";
                    break;
                case "о೦๐〇౦໐ⲟ೦ዐ೦ｏｏℴዐℴ౦๐೦ዐ੦೦૦੦ዐ၀௦૦໐੦ｏ೦০〇੦ｏ၀":
                    encryptorUsed %= ENCRYPTION_ALGORITHMS;
                    switchOnThis = "௦օоօ০໐໐০ዐ૦ℴ০૦ዐℴօ೦ⲟዐ০੦૦౦ዐ੦૦๐੦೦၀০ჿｏ〇օ໐";
                    break;
                case "௦೦໐೦೦૦օ૦ዐℴօ໐౦ዐℴ〇໐০ዐ૦੦о੦ዐօｏ০ℴ౦౦০ჿｏｏ၀౦":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        encryptorUsed %= ENCRYPTION_ALGORITHMS;
                        switchOnThis = "૦оо౦၀о〇೦ዐ০ⲟჿ๐ዐℴⲟ੦ℴዐ૦౦੦ჿዐ௦၀๐੦০๐օ၀၀ℴ၀๐";
                    } else {
                        decoded = Base64.decode(encrypted, Base64.DEFAULT);
                        switchOnThis = "౦ℴⲟ〇ℴ௦〇೦ዐ௦০௦๐ዐℴ〇ｏ๐ዐօ௦౦၀ዐ೦૦ℴօ๐ⲟօ੦๐օ೦о";
                    }
                    break;
                case "೦၀໐੦໐௦၀౦ዐ၀੦੦೦ዐℴჿ๐〇ዐ૦০၀၀ዐℴჿ໐௦၀೦օ੦ჿℴℴ໐":
                    if (OPAQUES[10] % OPAQUES[20] == OPAQUES[21]) {
                        decoded = Base64.decode(encrypted, Base64.DEFAULT);
                        switchOnThis = "౦ℴｏоօ౦ჿоዐ〇੦ჿ೦ዐℴ౦〇௦ዐ੦໐೦૦ዐ๐〇о௦〇೦௦૦໐౦၀〇";
                    } else {
                        return decryptedString;
                    }
                    break;
                case "ⲟ০೦ｏｏⲟⲟ〇ዐ௦ℴօ౦ዐℴჿ๐౦ዐ૦〇о๐ዐ〇๐ℴ๐оჿ੦೦ⲟ૦ℴⲟ":
                    if (OPAQUES[11] % OPAQUES[22] == OPAQUES[20]) {
                        ENCRYPTION_ALGORITHMS = 5;
                        switchOnThis = "੦ｏ〇೦௦౦၀๐ዐ໐၀౦ｏዐℴ၀၀օዐ০〇၀௦ዐօ੦ｏ೦০૦ჿ๐օℴ੦౦";
                    } else {
                        encryptorUsed = 10 * Character.getNumericValue(decodedStr.charAt(0)) + Character.getNumericValue(decodedStr.charAt(1));
                        switchOnThis = "௦೦໐೦೦૦օ૦ዐℴօ໐౦ዐℴ〇໐০ዐ૦੦о੦ዐօｏ০ℴ౦౦০ჿｏｏ၀౦";
                    }
                    break;
                case "௦о೦ℴօⲟჿ౦ዐо૦০оዐℴ໐ｏ૦ዐ০ⲟ௦〇ዐо௦о೦၀ℴｏ௦ჿ๐၀௦":
                    if (OPAQUES[12] % OPAQUES[20] == OPAQUES[21]) {
                        key = decodedStr.substring(decodedStr.length() - 50);
                        switchOnThis = "૦০ⲟ০ⲟ૦੦〇ዐ໐၀ჿ໐ዐℴ௦౦೦ዐ০૦о૦ዐℴ೦੦০оօⲟ೦౦੦૦೦";
                    } else {
                        if (encryptorUsed == 0) {
                            decryptedString = dec05(decryptedString, key);
                        } else if (encryptorUsed == 1) {
                            decryptedString = dec01(decryptedString, key);
                        } else if (encryptorUsed == 2) {
                            decryptedString = dec02(decryptedString, key);
                        } else if (encryptorUsed == 3) {
                            decryptedString = dec03(decryptedString, 10);
                        } else if (encryptorUsed == 4) {
                            decryptedString = dec04(decryptedString, key);
                        }
                        switchOnThis = "၀໐օｏ০೦๐೦ዐ๐о໐ჿዐℴօⲟ๐ዐ੦๐๐օዐօ೦૦ℴ૦оｏ〇໐ჿ၀၀";
                    }
                    break;
                case "૦оо౦၀о〇೦ዐ০ⲟჿ๐ዐℴⲟ੦ℴዐ૦౦੦ჿዐ௦၀๐੦০๐օ၀၀ℴ၀๐":
                    if (OPAQUES[18] % OPAQUES[20] == OPAQUES[21]) {
                        decryptedString = decodedStr.substring(2, decodedStr.length() - 50);
                        switchOnThis = "௦о೦ℴօⲟჿ౦ዐо૦০оዐℴ໐ｏ૦ዐ০ⲟ௦〇ዐо௦о೦၀ℴｏ௦ჿ๐၀௦";
                    } else {
                        decoded = Base64.decode(encrypted, Base64.DEFAULT);
                        switchOnThis = "〇ჿ੦ⲟ౦૦օ௦ዐ๐૦ჿｏዐℴℴ௦〇ዐօ໐ჿоዐ౦੦〇ჿｏ၀౦໐ჿ੦ｏ০";
                    }
                    break;
                case "૦ⲟ੦օ໐ⲟ໐၀ዐ๐೦ｏօዐℴ೦၀๐ዐ০౦੦၀ዐ〇০ℴ০о〇௦০օ੦ⲟⲟ":
                    if (OPAQUES[15] % OPAQUES[22] != OPAQUES[20]) {
                        return decryptedString;
                    } else {
                        ENCRYPTION_ALGORITHMS = 5;
                        switchOnThis = "ⲟоｏｏ๐๐੦օዐ೦ℴ੦೦ዐℴօ၀оዐ০о〇๐ዐ〇೦ⲟ၀օ〇〇ⲟ௦೦օ૦";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public static List generateNumberList() {
        List<String> places = null;
        String switchOnThis = "ⲟօ੦૦০੦ℴჿዐо౦೦ｏዐℴ೦օ੦ዐօ૦๐૦ዐ০ⲟ๐౦၀੦о੦໐ｏⲟ௦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 635, 131, 509, 201, 481, 432, 292, 411, 250, 117, 208, 124, 117, 68, 369, 502, 292, 103, 509, 250, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "օ০೦໐੦о໐ჿዐჿℴ੦оዐℴჿ০ℴዐ০о૦оዐ૦〇੦੦ℴ౦๐૦೦օ੦о":
                    return places;
                case "ⲟ೦ℴ૦౦ჿｏ੦ዐ〇০〇ｏዐℴｏℴ၀ዐ੦о০௦ዐ௦૦ⲟｏ௦০௦੦၀ჿօ๐":
                    if (OPAQUES[8] % OPAQUES[20] == OPAQUES[21]) {
                        return places;
                    } else {
                        return places;
                    }
                case "ⲟօ੦૦০੦ℴჿዐо౦೦ｏዐℴ೦օ੦ዐօ૦๐૦ዐ০ⲟ๐౦၀੦о੦໐ｏⲟ௦":
                    if (OPAQUES[9] % OPAQUES[22] == OPAQUES[20]) {
                        return places;
                    } else {
                        places = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
                        switchOnThis = "ⲟ೦ℴ૦౦ჿｏ੦ዐ〇০〇ｏዐℴｏℴ၀ዐ੦о০௦ዐ௦૦ⲟｏ௦০௦੦၀ჿօ๐";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public static String dec01(String encryptedText, final String key) {
        String decryptedText = null;
        List<String> numberList = null;
        String switchOnThis = "೦૦ⲟ〇ჿ০၀௦ዐ০௦၀ｏዐℴ૦໐০ዐ০၀ℴ౦ዐо੦௦໐ℴ௦૦၀ｏօ໐၀";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 68, 558, 47, 635, 355, 663, 180, 537, 593, 397, 61, 110, 110, 82, 523, 670, 117, 390, 264, 586, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "௦ⲟჿⲟ၀〇૦๐ዐჿｏℴ௦ዐℴ০໐০ዐ੦೦౦੦ዐ੦๐ｏ〇օⲟ〇၀ℴоօօ":
                    if (OPAQUES[19] % OPAQUES[22] != OPAQUES[20]) {
                        return decryptedText;
                    } else {
                        for (int i = 0, j = 0; i < encryptedText.length(); i++) {
                            char c = encryptedText.charAt(i);
                            if (Character.isLowerCase(c)) {
                                decryptedText += (char) ((c - key.charAt(j) + 26) % 26 + 'a');
                                j = ++j % key.length();
                            } else if (Character.isUpperCase(c)) {
                                decryptedText += (char) ((c - Character.toUpperCase(key.charAt(j)) + 26) % 26 + 'A');
                                j = ++j % key.length();
                            } else if (Character.isDigit(c)) {
                                decryptedText += decryptDigit(numberList, c);
                            } else {
                                decryptedText += (char) c;
                            }
                        }
                        switchOnThis = "օ૦૦೦ｏ௦໐ℴዐ௦๐௦೦ዐℴⲟ〇၀ዐօჿⲟჿዐ๐ℴ๐૦ჿ০๐ჿ๐੦໐о";
                    }
                case "о૦๐ｏ௦ｏ〇੦ዐℴ๐౦оዐℴ໐๐ℴዐ০၀ｏоዐ૦ⲟⲟ၀૦௦೦૦૦௦௦০":
                    decryptedText = "";
                    switchOnThis = "ჿ໐օ০౦оℴ੦ዐ၀೦ჿ၀ዐℴ໐ⲟ〇ዐօჿ૦০ዐ੦০૦೦〇〇ჿ੦ⲟ೦օ૦";
                    break;
                case "೦૦ⲟ〇ჿ০၀௦ዐ০௦၀ｏዐℴ૦໐০ዐ০၀ℴ౦ዐо੦௦໐ℴ௦૦၀ｏօ໐၀":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        decryptedText = "";
                        switchOnThis = "੦ｏ০ჿоℴⲟ௦ዐ০০೦ჿዐℴｏ૦੦ዐ૦૦೦〇ዐ၀၀ⲟ〇௦౦ℴჿ໐੦໐ℴ";
                    } else {
                        numberList = generateNumberList();
                        switchOnThis = "০оჿｏჿჿ০০ዐօ੦ჿ၀ዐℴ೦၀০ዐ০೦օօዐⲟℴ੦೦૦௦૦௦〇০໐о";
                    }
                    break;
                case "о೦೦೦၀੦௦оዐ၀օℴⲟዐℴ૦໐оዐօჿ〇օዐ੦০օ၀ℴℴⲟ੦௦〇օ၀":
                    for (int i = 0, j = 0; i < encryptedText.length(); i++) {
                        char c = encryptedText.charAt(i);
                        if (Character.isLowerCase(c)) {
                            decryptedText += (char) ((c - key.charAt(j) + 26) % 26 + 'a');
                            j = ++j % key.length();
                        } else if (Character.isUpperCase(c)) {
                            decryptedText += (char) ((c - Character.toUpperCase(key.charAt(j)) + 26) % 26 + 'A');
                            j = ++j % key.length();
                        } else if (Character.isDigit(c)) {
                            decryptedText += decryptDigit(numberList, c);
                        } else {
                            decryptedText += (char) c;
                        }
                    }
                    switchOnThis = "೦੦໐օ〇ℴ၀օዐ௦೦ჿ૦ዐℴჿ೦၀ዐ০০੦૦ዐ〇օ੦〇੦೦օ౦૦ⲟօ౦";
                    break;
                case "၀೦օ೦੦౦〇ⲟዐоℴ〇օዐℴ౦ჿ〇ዐ੦๐௦੦ዐｏ੦௦ｏⲟℴ๐೦ⲟ๐о೦":
                    if (OPAQUES[13] % OPAQUES[22] != OPAQUES[20]) {
                        for (int i = 0, j = 0; i < encryptedText.length(); i++) {
                            char c = encryptedText.charAt(i);
                            if (Character.isLowerCase(c)) {
                                decryptedText += (char) ((c - key.charAt(j) + 26) % 26 + 'a');
                                j = ++j % key.length();
                            } else if (Character.isUpperCase(c)) {
                                decryptedText += (char) ((c - Character.toUpperCase(key.charAt(j)) + 26) % 26 + 'A');
                                j = ++j % key.length();
                            } else if (Character.isDigit(c)) {
                                decryptedText += decryptDigit(numberList, c);
                            } else {
                                decryptedText += (char) c;
                            }
                        }
                        switchOnThis = "௦ⲟჿⲟ၀〇૦๐ዐჿｏℴ௦ዐℴ০໐০ዐ੦೦౦੦ዐ੦๐ｏ〇օⲟ〇၀ℴоօօ";
                    } else {
                        for (int i = 0, j = 0; i < encryptedText.length(); i++) {
                            char c = encryptedText.charAt(i);
                            if (Character.isLowerCase(c)) {
                                decryptedText += (char) ((c - key.charAt(j) + 26) % 26 + 'a');
                                j = ++j % key.length();
                            } else if (Character.isUpperCase(c)) {
                                decryptedText += (char) ((c - Character.toUpperCase(key.charAt(j)) + 26) % 26 + 'A');
                                j = ++j % key.length();
                            } else if (Character.isDigit(c)) {
                                decryptedText += decryptDigit(numberList, c);
                            } else {
                                decryptedText += (char) c;
                            }
                        }
                        switchOnThis = "০ｏօ૦о๐ჿ၀ዐ௦০೦੦ዐℴ੦೦೦ዐօⲟ೦၀ዐℴⲟ〇၀〇〇๐૦၀০০〇";
                    }
                    break;
                case "੦ｏ০ჿоℴⲟ௦ዐ০০೦ჿዐℴｏ૦੦ዐ૦૦೦〇ዐ၀၀ⲟ〇௦౦ℴჿ໐੦໐ℴ":
                    if (OPAQUES[10] % OPAQUES[20] != OPAQUES[21]) {
                        return decryptedText;
                    } else {
                        numberList = generateNumberList();
                        switchOnThis = "၀೦օ೦੦౦〇ⲟዐоℴ〇օዐℴ౦ჿ〇ዐ੦๐௦੦ዐｏ੦௦ｏⲟℴ๐೦ⲟ๐о೦";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public static String dec02(String encryptedText, String key) {
        String decryptedString = null;
        String switchOnThis = "௦ჿ০о౦ℴ০໐ዐｏօօօዐℴ௦ⲟ০ዐ૦оｏ੦ዐо০০໐ჿ๐օⲟ০໐০၀";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 572, 96, 75, 565, 320, 61, 257, 47, 565, 103, 523, 229, 110, 509, 446, 362, 215, 271, 572, 523, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "૦၀௦໐ჿｏｏℴዐ੦оօ౦ዐℴ၀၀оዐ০ჿ੦೦ዐ০໐ⲟоｏ૦〇〇০օ〇о":
                    if (OPAQUES[10] % OPAQUES[20] != OPAQUES[21]) {
                        return decryptedString;
                    } else {
                        for (char c : encryptedText.toCharArray()) {
                            int newIntegerValue = (int) c - 69;
                            if (newIntegerValue < 32) {
                                int offset = 32 - (newIntegerValue + 1);
                                newIntegerValue = 126 - offset;
                            }
                            decryptedString += (char) newIntegerValue;
                        }
                        switchOnThis = "০೦〇օ౦〇ⲟⲟዐ೦০ℴჿዐℴ০๐ｏዐ૦௦౦௦ዐ໐〇〇੦೦౦౦੦օ໐оⲟ";
                    }
                    break;
                case "੦০о໐੦ℴ௦০ዐ〇ℴℴ০ዐℴ౦໐〇ዐ૦௦ⲟ౦ዐ೦ℴ૦ℴⲟօ੦о੦๐ℴ೦":
                    decryptedString = "";
                    switchOnThis = "๐ჿ๐૦০૦օჿዐ੦૦〇০ዐℴ੦ჿ੦ዐ૦о၀೦ዐ੦੦օ౦౦о০੦ｏ੦ⲟ௦";
                    break;
                case "௦ჿ০о౦ℴ০໐ዐｏօօօዐℴ௦ⲟ০ዐ૦оｏ੦ዐо০০໐ჿ๐օⲟ০໐০၀":
                    if (OPAQUES[12] % OPAQUES[20] == OPAQUES[21]) {
                        decryptedString = "";
                        switchOnThis = "૦၀௦໐ჿｏｏℴዐ੦оօ౦ዐℴ၀၀оዐ০ჿ੦೦ዐ০໐ⲟоｏ૦〇〇০օ〇о";
                    } else {
                        return decryptedString;
                    }
                    break;
                case "০೦〇օ౦〇ⲟⲟዐ೦০ℴჿዐℴ০๐ｏዐ૦௦౦௦ዐ໐〇〇੦೦౦౦੦օ໐оⲟ":
                    if (OPAQUES[12] % OPAQUES[20] != OPAQUES[21]) {
                        decryptedString = "";
                        switchOnThis = "ℴჿ௦ｏ၀ℴ໐౦ዐ๐၀௦ⲟዐℴ๐о๐ዐ੦ｏ౦ℴዐ໐০೦౦ⲟ໐০၀೦೦ⲟℴ";
                    } else {
                        return decryptedString;
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public static String dec04(String encryptedText, String key) {
        String ordered = null;
        StringBuffer buffer = null;
        String reverse = null;
        String decryptedString = null;
        String switchOnThis = "౦〇ჿｏｏ๐၀၀ዐօ௦၀оዐℴჿｏ໐ዐ૦ｏ໐၀ዐ௦ⲟ๐௦о〇௦૦ｏ౦໐ｏ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 551, 439, 649, 236, 124, 614, 229, 551, 432, 257, 264, 355, 271, 614, 383, 320, 551, 467, 75, 383, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ℴ০၀օ๐০૦০ዐ੦੦ℴоዐℴⲟ੦౦ዐ૦໐о௦ዐ๐ჿ૦౦ℴჿ๐ｏ〇০০๐":
                    decryptedString = "";
                    switchOnThis = "ℴ௦၀ⲟ૦೦๐০ዐ੦ℴ๐໐ዐℴօ੦૦ዐ০๐օ০ዐⲟ〇ｏ౦੦౦௦ｏ௦ｏ໐໐";
                    break;
                case "ｏⲟ০੦ⲟ੦ℴⲟዐ೦໐ℴℴዐℴ೦௦০ዐ੦ｏℴ〇ዐօ๐ⲟ๐௦ჿ〇၀౦๐၀০":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        decryptedString = "";
                        switchOnThis = "ჿჿ௦〇௦ჿ௦౦ዐօ၀၀ｏዐℴｏ၀〇ዐ০ჿ૦໐ዐ௦ℴ૦၀೦౦௦〇೦೦օ೦";
                    } else {
                        for (int i = 0; i < encryptedText.length(); i++) {
                            char currentCharacter = encryptedText.charAt(i);
                            int indexOfCurrentCharacter = reverse.indexOf(currentCharacter);
                            decryptedString += ordered.charAt(indexOfCurrentCharacter);
                        }
                        switchOnThis = "〇〇௦ℴ၀ჿⲟ೦ዐօჿ௦౦ዐℴ૦օ၀ዐօჿⲟ〇ዐℴ๐౦ჿ౦ჿ૦௦૦໐๐๐";
                    }
                    break;
                case "੦೦၀౦ｏ੦૦௦ዐ໐௦〇ჿዐℴ໐౦௦ዐ૦ℴ૦〇ዐ໐০၀໐оｏоօ〇๐оｏ":
                    buffer = new StringBuffer(ordered);
                    switchOnThis = "০੦૦੦ჿ০௦оዐ၀ℴ০ⲟዐℴⲟჿჿዐօ௦о০ዐ০о౦೦ℴ๐ჿｏ〇೦೦૦";
                    break;
                case "၀০૦૦૦о੦оዐℴჿｏ๐ዐℴⲟоℴዐօ੦໐օዐ૦๐౦ჿ၀০၀о〇௦ｏо":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        reverse = buffer.reverse().toString();
                        switchOnThis = "ｏⲟ০੦ⲟ੦ℴⲟዐ೦໐ℴℴዐℴ೦௦০ዐ੦ｏℴ〇ዐօ๐ⲟ๐௦ჿ〇၀౦๐၀০";
                    } else {
                        reverse = buffer.reverse().toString();
                        switchOnThis = "〇ⲟｏ૦ⲟ౦๐૦ዐօ০೦౦ዐℴ೦ℴ০ዐ੦੦౦оዐℴ௦௦೦০〇ｏ໐о௦о௦";
                    }
                    break;
                case "౦〇ჿｏｏ๐၀၀ዐօ௦၀оዐℴჿｏ໐ዐ૦ｏ໐၀ዐ௦ⲟ๐௦о〇௦૦ｏ౦໐ｏ":
                    if (OPAQUES[18] % OPAQUES[20] != OPAQUES[21]) {
                        decryptedString = "";
                        switchOnThis = "૦೦੦౦〇੦০оዐ၀๐੦〇ዐℴ၀๐оዐօо၀оዐо೦օօℴ໐໐౦၀ჿ၀੦";
                    } else {
                        ordered = generateAtbashOrderedString();
                        switchOnThis = "ｏ౦௦໐〇ჿ೦০ዐｏ૦ｏ໐ዐℴ〇೦໐ዐ੦ｏ০ჿዐ〇೦੦௦௦〇၀௦௦ჿօ੦";
                    }
                    break;
                case "೦օｏօ੦ⲟ೦၀ዐօ໐օ૦ዐℴ౦௦оዐ੦ⲟ໐ⲟዐ૦໐૦ｏ૦০೦೦ჿօ০〇":
                    if (OPAQUES[3] % OPAQUES[22] != OPAQUES[20]) {
                        return decryptedString;
                    } else {
                        ordered = generateAtbashOrderedString();
                        switchOnThis = "〇০ℴ໐ⲟоо๐ዐ〇ℴ〇౦ዐℴｏჿ০ዐ੦ℴ๐໐ዐ೦о౦೦೦੦೦๐၀౦〇〇";
                    }
                case "੦ℴჿℴჿｏօｏዐ౦০౦౦ዐℴⲟ〇๐ዐ૦о೦ⲟዐօ௦ｏ౦〇೦ⲟⲟо௦౦૦":
                    return decryptedString;
                case "ｏ౦௦໐〇ჿ೦০ዐｏ૦ｏ໐ዐℴ〇೦໐ዐ੦ｏ০ჿዐ〇೦੦௦௦〇၀௦௦ჿօ੦":
                    if (OPAQUES[18] % OPAQUES[20] == OPAQUES[21]) {
                        buffer = new StringBuffer(ordered);
                        switchOnThis = "၀০૦૦૦о੦оዐℴჿｏ๐ዐℴⲟоℴዐօ੦໐օዐ૦๐౦ჿ၀০၀о〇௦ｏо";
                    } else {
                        reverse = buffer.reverse().toString();
                        switchOnThis = "〇౦૦০〇๐੦০ዐ૦೦ⲟ૦ዐℴ〇੦੦ዐ૦૦๐ჿዐℴ০ⲟ੦ｏℴօооჿ௦၀";
                    }
                    break;
                case "ჿჿ௦〇௦ჿ௦౦ዐօ၀၀ｏዐℴｏ၀〇ዐ০ჿ૦໐ዐ௦ℴ૦၀೦౦௦〇೦೦օ೦":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        for (int i = 0; i < encryptedText.length(); i++) {
                            char currentCharacter = encryptedText.charAt(i);
                            int indexOfCurrentCharacter = reverse.indexOf(currentCharacter);
                            decryptedString += ordered.charAt(indexOfCurrentCharacter);
                        }
                        switchOnThis = "೦օｏօ੦ⲟ೦၀ዐօ໐օ૦ዐℴ౦௦оዐ੦ⲟ໐ⲟዐ૦໐૦ｏ૦০೦೦ჿօ০〇";
                    } else {
                        ordered = generateAtbashOrderedString();
                        switchOnThis = "౦૦೦໐ჿօⲟ૦ዐ〇ⲟჿ০ዐℴჿօ໐ዐ০๐૦ℴዐℴჿ೦оჿჿ౦๐ჿ໐〇ℴ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public static String generateAtbashOrderedString() {
        String ordered = null;
        String switchOnThis = "૦о໐૦௦૦ℴ௦ዐჿ๐օ๐ዐℴ౦о໐ዐօჿჿоዐ௦ｏⲟ௦ⲟ૦оｏ๐ⲟօօ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 376, 537, 642, 460, 474, 404, 432, 166, 243, 306, 348, 159, 208, 348, 271, 565, 453, 89, 201, 201, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "૦о໐૦௦૦ℴ௦ዐჿ๐օ๐ዐℴ౦о໐ዐօჿჿоዐ௦ｏⲟ௦ⲟ૦оｏ๐ⲟօօ":
                    if (OPAQUES[18] % OPAQUES[20] == OPAQUES[21]) {
                        ordered = "";
                        switchOnThis = "օ౦ℴⲟ၀๐๐〇ዐℴჿ၀௦ዐℴ૦੦оዐ੦оჿ໐ዐ〇໐〇о໐໐ჿ〇ℴⲟ೦๐";
                    } else {
                        ordered = "";
                        switchOnThis = "௦оⲟ૦૦౦၀ℴዐ௦о〇օዐℴ౦ℴоዐ০௦੦০ዐ੦০૦๐೦௦০౦໐໐૦੦";
                    }
                    break;
                case "օ౦ℴⲟ၀๐๐〇ዐℴჿ၀௦ዐℴ૦੦оዐ੦оჿ໐ዐ〇໐〇о໐໐ჿ〇ℴⲟ೦๐":
                    if (OPAQUES[14] % OPAQUES[20] != OPAQUES[21]) {
                        for (int i = 32; i <= 126; i++) {
                            ordered += (char) i;
                        }
                        switchOnThis = "໐ｏⲟ၀оⲟ๐օዐ૦〇ⲟ౦ዐℴ౦੦ⲟዐ૦૦০০ዐ০໐၀၀૦ჿ೦௦ⲟⲟ೦〇";
                    } else {
                        for (int i = 32; i <= 126; i++) {
                            ordered += (char) i;
                        }
                        switchOnThis = "๐೦০〇о೦օօዐ੦໐ℴօዐℴ೦օ૦ዐ੦໐੦౦ዐ〇օⲟօⲟ௦о၀ჿ௦০೦";
                    }
                    break;
                case "૦၀ｏ੦ⲟ๐ℴօዐ੦၀〇௦ዐℴ০௦ჿዐ૦ｏⲟｏዐⲟ೦ｏ૦ⲟ௦౦о〇ℴ೦௦":
                    for (int i = 32; i <= 126; i++) {
                        ordered += (char) i;
                    }
                    switchOnThis = "๐ⲟⲟ০౦〇ℴ၀ዐօо〇၀ዐℴჿ໐օዐ੦๐၀০ዐ௦օ〇ჿⲟℴօ〇ｏ೦੦ℴ";
                    break;
                case "๐೦০〇о೦օօዐ੦໐ℴօዐℴ೦օ૦ዐ੦໐੦౦ዐ〇օⲟօⲟ௦о၀ჿ௦০೦":
                    if (OPAQUES[0] % OPAQUES[20] == OPAQUES[21]) {
                        return ordered;
                    } else {
                        return ordered;
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public static String decryptDigitString(String encryptedNumbers) {
        List<String> numberList = null;
        String decryptedNumbers = null;
        String switchOnThis = "၀ｏ〇౦օⲟ၀оዐ೦০੦౦ዐℴ੦оℴዐ০૦੦௦ዐо๐໐ჿⲟо੦໐〇ⲟჿ၀";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 600, 334, 502, 285, 439, 530, 26, 397, 152, 481, 152, 145, 362, 89, 614, 271, 425, 327, 348, 418, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "๐๐о૦ჿｏ๐оዐ૦๐〇ｏዐℴоჿоዐ০〇ჿ໐ዐ໐૦੦ｏ〇௦೦૦၀௦໐੦":
                    if (OPAQUES[2] % OPAQUES[20] == OPAQUES[21]) {
                        for (char i : encryptedNumbers.toCharArray()) {
                            decryptedNumbers += Character.toString(decryptDigit(numberList, i));
                        }
                        switchOnThis = "ｏｏ౦૦௦ℴ੦ｏዐⲟ๐௦૦ዐℴ၀၀оዐ੦੦০оዐ੦〇၀ℴℴℴ๐ⲟ੦૦০੦";
                    } else {
                        return decryptedNumbers;
                    }
                    break;
                case "о〇ჿｏｏ၀၀೦ዐ೦౦ⲟ૦ዐℴ౦၀၀ዐօჿ૦૦ዐо๐੦ⲟｏо၀௦໐೦০೦":
                    if (OPAQUES[8] % OPAQUES[20] == OPAQUES[21]) {
                        decryptedNumbers = "";
                        switchOnThis = "๐๐о૦ჿｏ๐оዐ૦๐〇ｏዐℴоჿоዐ০〇ჿ໐ዐ໐૦੦ｏ〇௦೦૦၀௦໐੦";
                    } else {
                        decryptedNumbers = "";
                        switchOnThis = "૦໐၀ⲟℴ௦੦০ዐ〇੦ℴ૦ዐℴⲟ೦૦ዐ૦၀ⲟ೦ዐ૦၀օ౦〇໐〇ჿօｏｏ๐";
                    }
                    break;
                case "ｏｏ౦૦௦ℴ੦ｏዐⲟ๐௦૦ዐℴ၀၀оዐ੦੦০оዐ੦〇၀ℴℴℴ๐ⲟ੦૦০੦":
                    if (OPAQUES[10] % OPAQUES[20] != OPAQUES[21]) {
                        for (char i : encryptedNumbers.toCharArray()) {
                            decryptedNumbers += Character.toString(decryptDigit(numberList, i));
                        }
                        switchOnThis = "၀๐໐〇ℴ੦೦ℴዐ೦၀ⲟ๐ዐℴоℴ౦ዐօ੦оჿዐℴ๐໐೦೦ｏ૦ჿ੦օ〇օ";
                    } else {
                        return decryptedNumbers;
                    }
                case "၀ｏ〇౦օⲟ၀оዐ೦০੦౦ዐℴ੦оℴዐ০૦੦௦ዐо๐໐ჿⲟо੦໐〇ⲟჿ၀":
                    if (OPAQUES[15] % OPAQUES[22] != OPAQUES[20]) {
                        numberList = generateNumberList();
                        switchOnThis = "о〇ჿｏｏ၀၀೦ዐ೦౦ⲟ૦ዐℴ౦၀၀ዐօჿ૦૦ዐо๐੦ⲟｏо၀௦໐೦০೦";
                    } else {
                        return decryptedNumbers;
                    }
                    break;
                case "௦ჿ০౦၀ℴ๐໐ዐ૦ｏℴ੦ዐℴ၀໐௦ዐ੦ℴоⲟዐ၀໐๐ⲟ๐೦౦೦ℴ০၀о":
                    return decryptedNumbers;
                case "੦౦০০ｏℴ૦ⲟዐоⲟ๐০ዐℴ૦၀౦ዐ০ჿｏ೦ዐ໐૦೦໐๐〇௦၀૦๐௦ℴ":
                    for (char i : encryptedNumbers.toCharArray()) {
                        decryptedNumbers += Character.toString(decryptDigit(numberList, i));
                    }
                    switchOnThis = "໐ℴჿ೦ｏ๐၀೦ዐօ౦໐ⲟዐℴ௦০੦ዐ০੦೦๐ዐ௦০੦๐ჿоჿ〇о໐௦ⲟ";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public static String dec03(String encrypted, int offset) {
        String decrypted = null;
        List<String> numberList = null;
        String switchOnThis = "о೦๐၀օ૦о০ዐ౦೦೦๐ዐℴ૦೦ｏዐօ૦໐оዐо೦໐ⲟｏ௦о౦օ૦૦௦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 656, 61, 607, 138, 215, 180, 250, 159, 348, 89, 96, 565, 257, 579, 194, 348, 663, 117, 460, 334, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "೦օ໐ｏ௦〇੦૦ዐℴ੦౦ჿዐℴ၀௦၀ዐօօ૦૦ዐｏօჿ૦૦ⲟℴ೦ℴ໐ჿ௦":
                    if (OPAQUES[12] % OPAQUES[20] != OPAQUES[21]) {
                        for (char i : encrypted.toCharArray()) {
                            if (Character.isLetter(i)) {
                                if (Character.isUpperCase(i)) {
                                    decrypted += ((char) ('A' + (i - 'A' + offset) % 26));
                                } else {
                                    decrypted += ((char) ('a' + (i - 'a' + offset) % 26));
                                }
                            } else if (Character.isDigit(i)) {
                                decrypted += Character.toString(decryptDigit(numberList, i));
                            } else {
                                decrypted += i;
                            }
                        }
                        switchOnThis = "ⲟⲟⲟ໐оⲟ૦੦ዐ૦ჿℴ੦ዐℴ૦੦০ዐ੦๐оｏዐℴ၀ⲟ໐〇ｏ০о౦〇੦օ";
                    } else {
                        numberList = generateNumberList();
                        switchOnThis = "౦օ໐૦ჿჿჿ০ዐｏｏ௦оዐℴ၀ℴ೦ዐ૦౦ჿоዐℴჿℴჿℴօ੦ჿ๐о০о";
                    }
                    break;
                case "౦օ໐૦ჿჿჿ০ዐｏｏ௦оዐℴ၀ℴ೦ዐ૦౦ჿоዐℴჿℴჿℴօ੦ჿ๐о০о":
                    if (OPAQUES[19] % OPAQUES[22] == OPAQUES[20]) {
                        numberList = generateNumberList();
                        switchOnThis = "০௦օ౦〇௦ℴ〇ዐօ௦ჿօዐℴ၀ჿｏዐ૦০௦૦ዐ〇০о௦໐օ০〇੦ⲟჿ೦";
                    } else {
                        for (char i : encrypted.toCharArray()) {
                            if (Character.isLetter(i)) {
                                if (Character.isUpperCase(i)) {
                                    decrypted += ((char) ('A' + (i - 'A' + offset) % 26));
                                } else {
                                    decrypted += ((char) ('a' + (i - 'a' + offset) % 26));
                                }
                            } else if (Character.isDigit(i)) {
                                decrypted += Character.toString(decryptDigit(numberList, i));
                            } else {
                                decrypted += i;
                            }
                        }
                        switchOnThis = "໐ℴ౦๐၀ｏ೦૦ዐჿ௦օ௦ዐℴⲟ૦໐ዐ੦оｏ౦ዐⲟ౦๐০၀੦ⲟо〇௦ⲟ௦";
                    }
                    break;
                case "௦૦၀ｏоօⲟ౦ዐ၀၀๐೦ዐℴ೦௦໐ዐ੦օ၀໐ዐ೦૦໐౦໐օ௦੦ℴ〇૦๐":
                    if (OPAQUES[12] % OPAQUES[20] != OPAQUES[21]) {
                        offset = 26 - offset;
                        switchOnThis = "૦໐оℴ〇〇ჿ೦ዐ๐〇၀੦ዐℴｏ૦ℴዐ੦૦ℴｏዐｏ੦౦၀〇ｏ੦౦၀ｏ౦ℴ";
                    } else {
                        offset = offset % 26 + 26;
                        switchOnThis = "〇ℴ੦о๐০ℴ০ዐօⲟ໐੦ዐℴ૦૦੦ዐօჿ૦૦ዐｏ௦ｏⲟօօ૦০০੦௦ⲟ";
                    }
                    break;
                case "০০〇оჿⲟօ௦ዐⲟ೦౦೦ዐℴⲟⲟℴዐօօ๐оዐ໐౦օ૦౦၀೦௦౦〇ｏ໐":
                    numberList = generateNumberList();
                    switchOnThis = "௦ｏ੦௦օ೦օჿዐ௦૦௦〇ዐℴ೦૦০ዐօ๐๐౦ዐ౦๐૦〇௦০о০௦૦ｏჿ";
                    break;
                case "໐ℴ౦๐၀ｏ೦૦ዐჿ௦օ௦ዐℴⲟ૦໐ዐ੦оｏ౦ዐⲟ౦๐০၀੦ⲟо〇௦ⲟ௦":
                    if (OPAQUES[11] % OPAQUES[22] == OPAQUES[20]) {
                        for (char i : encrypted.toCharArray()) {
                            if (Character.isLetter(i)) {
                                if (Character.isUpperCase(i)) {
                                    decrypted += ((char) ('A' + (i - 'A' + offset) % 26));
                                } else {
                                    decrypted += ((char) ('a' + (i - 'a' + offset) % 26));
                                }
                            } else if (Character.isDigit(i)) {
                                decrypted += Character.toString(decryptDigit(numberList, i));
                            } else {
                                decrypted += i;
                            }
                        }
                        switchOnThis = "౦௦ｏ০၀ჿ੦օዐჿ౦໐〇ዐℴ๐౦໐ዐ૦ℴ૦၀ዐ૦੦০ｏ௦ⲟ০๐ⲟօ〇೦";
                    } else {
                        return decrypted;
                    }
                case "໐၀ჿ౦૦ⲟ০օዐо໐ｏ೦ዐℴ౦օｏዐ૦ⲟооዐ〇૦০օ૦၀ℴ೦๐౦௦০":
                    numberList = generateNumberList();
                    switchOnThis = "ℴ၀ℴ၀ჿ〇〇౦ዐо〇ⲟ೦ዐℴ๐০૦ዐ০၀੦ℴዐჿо౦ჿ౦૦ჿｏ০๐๐૦";
                    break;
                case "〇ℴ੦о๐০ℴ০ዐօⲟ໐੦ዐℴ૦૦੦ዐօჿ૦૦ዐｏ௦ｏⲟօօ૦০০੦௦ⲟ":
                    if (OPAQUES[15] % OPAQUES[22] != OPAQUES[20]) {
                        decrypted = "";
                        switchOnThis = "೦օ໐ｏ௦〇੦૦ዐℴ੦౦ჿዐℴ၀௦၀ዐօօ૦૦ዐｏօჿ૦૦ⲟℴ೦ℴ໐ჿ௦";
                    } else {
                        return decrypted;
                    }
                    break;
                case "о೦๐၀օ૦о০ዐ౦೦೦๐ዐℴ૦೦ｏዐօ૦໐оዐо೦໐ⲟｏ௦о౦օ૦૦௦":
                    if (OPAQUES[19] % OPAQUES[22] == OPAQUES[20]) {
                        numberList = generateNumberList();
                        switchOnThis = "၀௦๐օ〇ჿჿ೦ዐоℴｏⲟዐℴⲟ〇౦ዐօ౦о૦ዐ၀௦૦௦оｏ੦૦၀ⲟօ௦";
                    } else {
                        offset = 26 - offset;
                        switchOnThis = "௦૦၀ｏоօⲟ౦ዐ၀၀๐೦ዐℴ೦௦໐ዐ੦օ၀໐ዐ೦૦໐౦໐օ௦੦ℴ〇૦๐";
                    }
                    break;
                case "ℴօ໐о૦ჿჿ০ዐ੦〇ℴ೦ዐℴ০૦๐ዐ੦௦ჿ૦ዐ੦ჿ੦ჿℴ੦໐௦௦౦૦ⲟ":
                    offset = 26 - offset;
                    switchOnThis = "௦၀೦၀๐০ℴ০ዐ๐ｏ〇〇ዐℴ೦ჿоዐ૦ⲟ௦ℴዐ੦๐ℴ౦೦о໐၀о〇၀ℴ";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public static int[] convertToAlphabetIntegerArray(String text) {
        int[] alphabetArray = null;
        int i = 0;
        String switchOnThis = "ｏ௦ｏｏℴ০౦၀ዐо๐౦০ዐℴ๐၀০ዐ০оｏ੦ዐℴ੦ⲟჿ੦ℴ〇೦೦௦๐၀";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 621, 82, 180, 117, 180, 523, 40, 467, 460, 642, 558, 299, 369, 271, 138, 544, 677, 551, 236, 509, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "೦оჿⲟ໐〇๐૦ዐ໐〇օօዐℴоо〇ዐ০೦೦օዐⲟ໐ｏ၀ჿо〇ჿ໐੦๐໐":
                    if (OPAQUES[11] % OPAQUES[22] == OPAQUES[20]) {
                        i = 0;
                        switchOnThis = "໐၀๐ჿ೦੦௦೦ዐℴ೦౦๐ዐℴ౦০೦ዐ૦௦о௦ዐ〇௦໐о০оⲟｏ೦૦໐૦";
                    } else {
                        i = 0;
                        switchOnThis = "੦ℴ০੦ჿ〇௦օዐ௦ｏ๐ℴዐℴ౦๐੦ዐ૦௦੦೦ዐօ〇ｏ০௦௦๐೦ⲟⲟℴ໐";
                    }
                    break;
                case "೦೦ℴჿℴ౦ჿⲟዐ၀੦੦௦ዐℴ໐ⲟ໐ዐ০๐၀๐ዐｏ০೦੦௦ⲟ๐оℴ੦౦օ":
                    for (char c : text.toCharArray()) {
                        if (!Character.isLetter(c)) {
                            alphabetArray[i] = (int) c;
                        } else {
                            if (Character.isUpperCase(c)) {
                                alphabetArray[i] = ((int) c - 'A') * -1 - 1;
                            } else {
                                alphabetArray[i] = (int) c - 'a' + 1;
                            }
                        }
                        i++;
                    }
                    switchOnThis = "౦〇о੦ℴ੦௦੦ዐ੦၀ℴⲟዐℴｏ၀ℴዐ૦੦〇০ዐ௦ⲟ௦௦ｏ〇০౦၀๐օ๐";
                    break;
                case "૦ⲟ໐೦ℴ੦оｏዐ੦օ๐օዐℴ౦օоዐ੦੦ｏ๐ዐ০௦օ০౦օ౦〇၀૦၀੦":
                    alphabetArray = new int[text.length()];
                    switchOnThis = "၀օ౦ჿｏℴⲟ০ዐ၀ჿօ૦ዐℴｏ໐ⲟዐօ๐੦೦ዐⲟ௦০૦ⲟ๐૦〇௦о೦ⲟ";
                    break;
                case "ｏ௦ｏｏℴ০౦၀ዐо๐౦০ዐℴ๐၀০ዐ০оｏ੦ዐℴ੦ⲟჿ੦ℴ〇೦೦௦๐၀":
                    if (OPAQUES[4] % OPAQUES[20] == OPAQUES[21]) {
                        alphabetArray = new int[text.length()];
                        switchOnThis = "೦оჿⲟ໐〇๐૦ዐ໐〇օօዐℴоо〇ዐ০೦೦օዐⲟ໐ｏ၀ჿо〇ჿ໐੦๐໐";
                    } else {
                        for (char c : text.toCharArray()) {
                            if (!Character.isLetter(c)) {
                                alphabetArray[i] = (int) c;
                            } else {
                                if (Character.isUpperCase(c)) {
                                    alphabetArray[i] = ((int) c - 'A') * -1 - 1;
                                } else {
                                    alphabetArray[i] = (int) c - 'a' + 1;
                                }
                            }
                            i++;
                        }
                        switchOnThis = "੦〇၀၀೦оℴ၀ዐ๐оｏⲟዐℴⲟℴ໐ዐ੦оჿ๐ዐℴ૦оօо௦๐о໐௦೦౦";
                    }
                    break;
                case "๐๐௦๐ⲟ໐౦〇ዐⲟ೦ჿ〇ዐℴჿ౦ℴዐ০ⲟ૦ｏዐ၀оჿ௦౦૦౦оｏ੦౦೦":
                    if (OPAQUES[6] % OPAQUES[20] != OPAQUES[21]) {
                        for (char c : text.toCharArray()) {
                            if (!Character.isLetter(c)) {
                                alphabetArray[i] = (int) c;
                            } else {
                                if (Character.isUpperCase(c)) {
                                    alphabetArray[i] = ((int) c - 'A') * -1 - 1;
                                } else {
                                    alphabetArray[i] = (int) c - 'a' + 1;
                                }
                            }
                            i++;
                        }
                        switchOnThis = "০ℴ౦০၀๐౦੦ዐⲟ௦ℴ〇ዐℴｏ੦ｏዐօ၀ჿ০ዐ౦௦ჿ๐ჿ০๐о๐၀ℴ๐";
                    } else {
                        return alphabetArray;
                    }
                case "੦ℴ০੦ჿ〇௦օዐ௦ｏ๐ℴዐℴ౦๐੦ዐ૦௦੦೦ዐօ〇ｏ০௦௦๐೦ⲟⲟℴ໐":
                    if (OPAQUES[4] % OPAQUES[20] != OPAQUES[21]) {
                        i = 0;
                        switchOnThis = "ℴℴօｏ೦૦০๐ዐ੦օ௦оዐℴℴоｏዐ૦੦ⲟ၀ዐℴჿ೦౦૦օ೦၀၀ｏჿ೦";
                    } else {
                        for (char c : text.toCharArray()) {
                            if (!Character.isLetter(c)) {
                                alphabetArray[i] = (int) c;
                            } else {
                                if (Character.isUpperCase(c)) {
                                    alphabetArray[i] = ((int) c - 'A') * -1 - 1;
                                } else {
                                    alphabetArray[i] = (int) c - 'a' + 1;
                                }
                            }
                            i++;
                        }
                        switchOnThis = "๐๐௦๐ⲟ໐౦〇ዐⲟ೦ჿ〇ዐℴჿ౦ℴዐ০ⲟ૦ｏዐ၀оჿ௦౦૦౦оｏ੦౦೦";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public static char decryptDigit(List numberList, char c) {
        int numericalValue = 0;
        String numberAsString = null;
        boolean needToGetDigit = false;
        char returnDigit = 'a';
        int iterationNumber = 0;
        String switchOnThis = "၀о૦ⲟｏｏ౦〇ዐ௦〇೦೦ዐℴ੦ｏⲟዐ૦૦੦оዐ〇ｏ೦ｏ໐૦ℴ௦о੦ℴჿ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 488, 138, 593, 523, 75, 586, 124, 159, 138, 390, 26, 453, 383, 656, 61, 404, 131, 495, 229, 502, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "೦೦૦੦੦о௦๐ዐ੦౦〇օዐℴ੦ჿ౦ዐօ౦૦ჿዐｏ๐ⲟ౦ⲟօ౦๐၀ｏჿ௦":
                    if (OPAQUES[9] % OPAQUES[22] == OPAQUES[20]) {
                        iterationNumber = 0;
                        switchOnThis = "૦০০ჿｏ౦౦ｏዐ๐໐໐೦ዐℴｏ௦੦ዐ০оо౦ዐ〇ჿоჿჿ০〇০೦ⲟ০০";
                    } else {
                        for (int i = numberList.size() - 1, j = numberList.size() - 1; needToGetDigit; i--) {
                            if (j < 0) {
                                j = numberList.size() - 1;
                            }
                            String value = (String) numberList.get(j);
                            if ((j < numericalValue && numberAsString.length() == value.length()) || (value.length() == numberAsString.length() && iterationNumber >= numberList.size())) {
                                int encryptedDigit = j;
                                returnDigit = (char) (encryptedDigit + '0');
                                needToGetDigit = false;
                                break;
                            }
                            iterationNumber++;
                            j--;
                        }
                        switchOnThis = "оｏ০๐〇౦ｏ௦ዐ੦ჿⲟ০ዐℴ〇〇੦ዐօ၀๐໐ዐℴоо০ｏჿօჿ๐೦૦ჿ";
                    }
                    break;
                case "ჿ੦๐௦০௦оჿዐ೦๐оჿዐℴ၀০ℴዐ੦೦০౦ዐ౦ჿ၀ჿ၀೦๐ⲟ໐௦၀໐":
                    returnDigit = ' ';
                    switchOnThis = "૦ℴ౦౦০օჿჿዐ੦০౦౦ዐℴ০০০ዐ০০੦੦ዐ௦૦౦໐ℴ๐௦օ૦੦௦ℴ";
                    break;
                case "௦๐౦ｏоօօ੦ዐⲟ੦০ℴዐℴ౦ｏ౦ዐ૦၀ჿ౦ዐ၀ჿჿ౦ⲟ〇௦ⲟ೦ℴоⲟ":
                    if (OPAQUES[18] % OPAQUES[20] == OPAQUES[21]) {
                        needToGetDigit = true;
                        switchOnThis = "ℴ๐၀о၀໐ⲟ๐ዐ೦໐๐೦ዐℴ๐໐௦ዐ੦ჿ೦૦ዐ೦ｏｏⲟｏ౦০ｏ০ⲟⲟ〇";
                    } else {
                        if (!Character.isDigit(c)) {
                            return c;
                        }
                        switchOnThis = "оｏჿ๐໐૦ⲟоዐ੦ｏօ๐ዐℴჿ๐оዐօօｏ౦ዐоⲟ౦ℴ૦၀၀ჿჿℴ੦օ";
                    }
                    break;
                case "௦ｏ௦၀օо೦૦ዐ০০౦ჿዐℴ၀〇ｏዐ૦௦оⲟዐо๐о〇၀૦၀ℴօ౦০๐":
                    numericalValue = Character.getNumericValue(c);
                    switchOnThis = "ｏ〇ჿ૦ｏօ໐০ዐ၀ⲟ০౦ዐℴ੦ⲟ〇ዐ০ⲟ໐௦ዐ၀௦੦੦໐оℴ〇ⲟ௦૦ⲟ";
                    break;
                case "౦๐〇௦ℴ੦ⲟ໐ዐჿ〇ⲟｏዐℴ੦๐౦ዐ০૦օоዐ೦ⲟ၀௦௦ⲟ๐օⲟჿℴօ":
                    if (OPAQUES[3] % OPAQUES[22] != OPAQUES[20]) {
                        iterationNumber = 0;
                        switchOnThis = "೦೦૦੦੦о௦๐ዐ੦౦〇օዐℴ੦ჿ౦ዐօ౦૦ჿዐｏ๐ⲟ౦ⲟօ౦๐၀ｏჿ௦";
                    } else {
                        if (!Character.isDigit(c)) {
                            return c;
                        }
                        switchOnThis = "ჿჿօ౦੦౦௦๐ዐℴ๐оⲟዐℴ೦๐ℴዐ૦ⲟ೦ⲟዐⲟ๐ℴ੦౦૦၀੦૦၀〇૦";
                    }
                    break;
                case "о০о૦ⲟ௦੦ჿዐ〇੦๐০ዐℴｏ০০ዐ০ｏ૦๐ዐ೦၀ჿｏჿ๐ⲟ໐໐о၀೦":
                    if (OPAQUES[4] % OPAQUES[20] == OPAQUES[21]) {
                        numberAsString = (String) numberList.get(numericalValue);
                        switchOnThis = "௦๐౦ｏоօօ੦ዐⲟ੦০ℴዐℴ౦ｏ౦ዐ૦၀ჿ౦ዐ၀ჿჿ౦ⲟ〇௦ⲟ೦ℴоⲟ";
                    } else {
                        returnDigit = ' ';
                        switchOnThis = "օ၀০ჿⲟｏｏоዐ০〇о௦ዐℴჿⲟ௦ዐօⲟｏⲟዐ౦ｏօℴⲟℴ๐૦੦ⲟ੦〇";
                    }
                    break;
                case "ℴ๐၀о၀໐ⲟ๐ዐ೦໐๐೦ዐℴ๐໐௦ዐ੦ჿ೦૦ዐ೦ｏｏⲟｏ౦০ｏ০ⲟⲟ〇":
                    if (OPAQUES[8] % OPAQUES[20] != OPAQUES[21]) {
                        for (int i = numberList.size() - 1, j = numberList.size() - 1; needToGetDigit; i--) {
                            if (j < 0) {
                                j = numberList.size() - 1;
                            }
                            String value = (String) numberList.get(j);
                            if ((j < numericalValue && numberAsString.length() == value.length()) || (value.length() == numberAsString.length() && iterationNumber >= numberList.size())) {
                                int encryptedDigit = j;
                                returnDigit = (char) (encryptedDigit + '0');
                                needToGetDigit = false;
                                break;
                            }
                            iterationNumber++;
                            j--;
                        }
                        switchOnThis = "๐໐০ｏⲟ০೦〇ዐօ௦ჿ๐ዐℴ๐໐௦ዐօｏ౦၀ዐ೦೦௦੦〇௦૦օ౦໐૦၀";
                    } else {
                        returnDigit = ' ';
                        switchOnThis = "౦๐〇௦ℴ੦ⲟ໐ዐჿ〇ⲟｏዐℴ੦๐౦ዐ০૦օоዐ೦ⲟ၀௦௦ⲟ๐օⲟჿℴօ";
                    }
                    break;
                case "೦〇௦૦ⲟ੦ｏօዐ〇೦〇੦ዐℴ๐၀ｏዐ੦০օℴዐｏ౦೦੦օ〇௦௦၀௦оօ":
                    if (OPAQUES[14] % OPAQUES[20] != OPAQUES[21]) {
                        if (!Character.isDigit(c)) {
                            return c;
                        }
                        switchOnThis = "௦౦০೦๐〇໐ℴዐ੦০੦০ዐℴⲟｏⲟዐ০੦౦օዐ၀〇ჿ௦оｏ௦໐օ౦օℴ";
                    } else {
                        numericalValue = Character.getNumericValue(c);
                        switchOnThis = "о০о૦ⲟ௦੦ჿዐ〇੦๐০ዐℴｏ০০ዐ০ｏ૦๐ዐ೦၀ჿｏჿ๐ⲟ໐໐о၀೦";
                    }
                    break;
                case "оｏ০๐〇౦ｏ௦ዐ੦ჿⲟ০ዐℴ〇〇੦ዐօ၀๐໐ዐℴоо০ｏჿօჿ๐೦૦ჿ":
                    if (OPAQUES[3] % OPAQUES[22] == OPAQUES[20]) {
                        if (!Character.isDigit(c)) {
                            return c;
                        }
                        switchOnThis = "ⲟⲟо〇૦০๐০ዐｏ௦໐௦ዐℴ೦ჿ੦ዐօօ〇ჿዐ૦ｏ૦໐੦ｏ੦ⲟ೦๐ჿо";
                    } else {
                        return returnDigit;
                    }
                case "၀о૦ⲟｏｏ౦〇ዐ௦〇೦೦ዐℴ੦ｏⲟዐ૦૦੦оዐ〇ｏ೦ｏ໐૦ℴ௦о੦ℴჿ":
                    if (OPAQUES[6] % OPAQUES[20] == OPAQUES[21]) {
                        if (!Character.isDigit(c)) {
                            return c;
                        }
                        switchOnThis = "೦〇௦૦ⲟ੦ｏօዐ〇೦〇੦ዐℴ๐၀ｏዐ੦০օℴዐｏ౦೦੦օ〇௦௦၀௦оօ";
                    } else {
                        numberAsString = (String) numberList.get(numericalValue);
                        switchOnThis = "ｏ໐ⲟ၀౦೦о๐ዐ૦௦〇૦ዐℴо੦օዐ০੦օ੦ዐ໐೦ჿօ੦о੦၀০০ⲟｏ";
                    }
                    break;
                case "೦〇о੦০໐೦〇ዐ౦૦௦੦ዐℴ〇૦໐ዐ૦ℴ〇೦ዐჿჿℴ૦೦ℴ০〇ℴ௦օ੦":
                    returnDigit = ' ';
                    switchOnThis = "ｏооⲟ౦೦ჿ௦ዐ໐০օ০ዐℴ੦੦оዐ૦օ๐੦ዐ০೦၀௦〇〇օоℴ౦၀ⲟ";
                    break;
                case "೦၀၀〇о౦೦๐ዐо௦০০ዐℴ೦௦оዐօ໐ｏ၀ዐ໐ℴჿօ၀ℴ໐ⲟ౦ჿօⲟ":
                    if (!Character.isDigit(c)) {
                        return c;
                    }
                    switchOnThis = "о၀౦〇໐๐ｏ၀ዐ੦૦ℴ๐ዐℴ๐օ০ዐ૦ⲟ໐ℴዐℴⲟ๐ⲟｏ૦ℴ๐૦ჿоｏ";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return 'a';
    }

    public static String dec05(String encryptedText, String key) {
        int[] stringAlphabetArray = null;
        int[] keyAlphabetArray = null;
        List<String> numberList = null;
        int[] decryptedIntArray = null;
        String decrypted = null;
        String switchOnThis = "၀ℴо૦ჿ౦௦౦ዐ০ℴ૦૦ዐℴ௦೦০ዐ૦౦૦૦ዐჿ๐০௦ｏ౦၀೦౦೦೦໐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 145, 369, 397, 376, 222, 509, 509, 432, 586, 362, 495, 201, 495, 635, 411, 390, 614, 607, 26, 152, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "௦о〇๐ℴ၀օｏዐ০օ૦০ዐℴօ௦௦ዐ০ჿ๐၀ዐ๐ｏℴ໐๐ℴ૦౦໐০၀๐":
                    if (OPAQUES[12] % OPAQUES[20] != OPAQUES[21]) {
                        numberList = generateNumberList();
                        switchOnThis = "о੦၀〇ⲟ໐০੦ዐℴ௦օоዐℴ໐оℴዐ০〇ⲟ〇ዐ੦ｏ೦௦๐০ｏо૦օ໐օ";
                    } else {
                        numberList = generateNumberList();
                        switchOnThis = "૦๐౦௦〇ｏо၀ዐｏℴ౦၀ዐℴჿ૦ｏዐ੦၀໐օዐօｏо೦૦ℴ০օ০ℴ੦੦";
                    }
                    break;
                case "૦๐౦௦〇ｏо၀ዐｏℴ౦၀ዐℴჿ૦ｏዐ੦၀໐օዐօｏо೦૦ℴ০օ০ℴ੦੦":
                    if (OPAQUES[0] % OPAQUES[20] != OPAQUES[21]) {
                        for (int i = 0, j = 0; i < stringAlphabetArray.length; i++) {
                            if (stringAlphabetArray[i] > 27) {
                                decrypted += decryptDigit(numberList, (char) stringAlphabetArray[i]);
                            } else if (stringAlphabetArray[i] < 0) {
                                decryptedIntArray[i] = (stringAlphabetArray[i] * -1 - keyAlphabetArray[j]) % 26 - 1;
                                if (decryptedIntArray[i] <= 0) {
                                    decryptedIntArray[i] += 26;
                                }
                                decrypted += (char) (decryptedIntArray[i] + 64);
                                j = ++j % key.length();
                            } else {
                                decryptedIntArray[i] = (stringAlphabetArray[i] - keyAlphabetArray[j]) % 26 - 1;
                                if (decryptedIntArray[i] <= 0) {
                                    decryptedIntArray[i] += 26;
                                }
                                decrypted += (char) (decryptedIntArray[i] + 96);
                                j = ++j % key.length();
                            }
                        }
                        switchOnThis = "০௦ｏо౦၀оℴዐⲟ௦૦ⲟዐℴ〇௦೦ዐօჿ૦оዐ၀օօℴօо௦ｏ০ℴ੦ⲟ";
                    } else {
                        decryptedIntArray = new int[stringAlphabetArray.length];
                        switchOnThis = "〇੦੦ℴ၀о૦ⲟዐ௦၀о૦ዐℴ০๐ｏዐօ௦੦౦ዐ০๐о౦੦ℴ௦๐໐௦੦૦";
                    }
                    break;
                case "௦๐ⲟо૦౦ℴ౦ዐｏ౦о૦ዐℴℴооዐօоⲟ๐ዐℴℴ၀੦௦໐๐ჿо໐օ੦":
                    if (OPAQUES[11] % OPAQUES[22] != OPAQUES[20]) {
                        keyAlphabetArray = convertToAlphabetIntegerArray(key);
                        switchOnThis = "௦о〇๐ℴ၀օｏዐ০օ૦০ዐℴօ௦௦ዐ০ჿ๐၀ዐ๐ｏℴ໐๐ℴ૦౦໐০၀๐";
                    } else {
                        for (int i = 0, j = 0; i < stringAlphabetArray.length; i++) {
                            if (stringAlphabetArray[i] > 27) {
                                decrypted += decryptDigit(numberList, (char) stringAlphabetArray[i]);
                            } else if (stringAlphabetArray[i] < 0) {
                                decryptedIntArray[i] = (stringAlphabetArray[i] * -1 - keyAlphabetArray[j]) % 26 - 1;
                                if (decryptedIntArray[i] <= 0) {
                                    decryptedIntArray[i] += 26;
                                }
                                decrypted += (char) (decryptedIntArray[i] + 64);
                                j = ++j % key.length();
                            } else {
                                decryptedIntArray[i] = (stringAlphabetArray[i] - keyAlphabetArray[j]) % 26 - 1;
                                if (decryptedIntArray[i] <= 0) {
                                    decryptedIntArray[i] += 26;
                                }
                                decrypted += (char) (decryptedIntArray[i] + 96);
                                j = ++j % key.length();
                            }
                        }
                        switchOnThis = "૦০௦০౦૦௦〇ዐ〇օ০оዐℴ〇၀౦ዐ૦ⲟօℴዐ૦ℴჿ૦ჿ౦оｏ౦ჿо೦";
                    }
                    break;
                case "օ੦੦ⲟℴ〇๐〇ዐо౦၀ℴዐℴｏ౦੦ዐ੦၀օօዐⲟℴⲟ੦ⲟⲟ௦௦૦๐〇ℴ":
                    if (OPAQUES[8] % OPAQUES[20] != OPAQUES[21]) {
                        numberList = generateNumberList();
                        switchOnThis = "ⲟ੦о〇௦ℴ೦ჿዐ೦ჿⲟｏዐℴ๐ⲟｏዐ૦౦௦ｏዐ໐౦௦๐၀໐௦օჿⲟ໐০";
                    } else {
                        return decrypted;
                    }
                case "၀ℴ૦૦௦ｏ〇၀ዐ০ℴ౦௦ዐℴ໐၀〇ዐ૦০օ๐ዐ੦໐೦ℴ೦০੦૦ｏ০໐૦":
                    keyAlphabetArray = convertToAlphabetIntegerArray(key);
                    switchOnThis = "໐〇ⲟ၀໐о০౦ዐ೦໐௦໐ዐℴ૦၀၀ዐ੦ℴⲟ੦ዐჿ໐௦໐ｏℴｏჿჿⲟ੦੦";
                    break;
                case "౦૦౦၀ｏ໐໐ⲟዐℴ੦೦ℴዐℴⲟօ੦ዐ૦੦๐੦ዐ〇০о೦ⲟօ౦੦੦௦௦ჿ":
                    return decrypted;
                case "〇੦੦ℴ၀о૦ⲟዐ௦၀о૦ዐℴ০๐ｏዐօ௦੦౦ዐ০๐о౦੦ℴ௦๐໐௦੦૦":
                    if (OPAQUES[7] % OPAQUES[22] == OPAQUES[20]) {
                        stringAlphabetArray = convertToAlphabetIntegerArray(encryptedText);
                        switchOnThis = "੦೦০๐໐၀၀ℴዐ০੦օℴዐℴ೦໐೦ዐօ๐౦໐ዐ౦〇օ૦о೦໐〇ჿℴ০օ";
                    } else {
                        decrypted = "";
                        switchOnThis = "૦೦૦૦ჿ౦၀೦ዐо౦о௦ዐℴ೦ⲟоዐօ০௦〇ዐ೦၀໐౦ⲟ౦ჿ౦о೦௦ℴ";
                    }
                    break;
                case "૦೦૦૦ჿ౦၀೦ዐо౦о௦ዐℴ೦ⲟоዐօ০௦〇ዐ೦၀໐౦ⲟ౦ჿ౦о೦௦ℴ":
                    if (OPAQUES[14] % OPAQUES[20] != OPAQUES[21]) {
                        for (int i = 0, j = 0; i < stringAlphabetArray.length; i++) {
                            if (stringAlphabetArray[i] > 27) {
                                decrypted += decryptDigit(numberList, (char) stringAlphabetArray[i]);
                            } else if (stringAlphabetArray[i] < 0) {
                                decryptedIntArray[i] = (stringAlphabetArray[i] * -1 - keyAlphabetArray[j]) % 26 - 1;
                                if (decryptedIntArray[i] <= 0) {
                                    decryptedIntArray[i] += 26;
                                }
                                decrypted += (char) (decryptedIntArray[i] + 64);
                                j = ++j % key.length();
                            } else {
                                decryptedIntArray[i] = (stringAlphabetArray[i] - keyAlphabetArray[j]) % 26 - 1;
                                if (decryptedIntArray[i] <= 0) {
                                    decryptedIntArray[i] += 26;
                                }
                                decrypted += (char) (decryptedIntArray[i] + 96);
                                j = ++j % key.length();
                            }
                        }
                        switchOnThis = "〇੦੦၀౦ⲟ၀ｏዐ๐০੦๐ዐℴ௦ჿℴዐ੦੦ჿօዐ౦๐০ｏჿօ〇ჿ၀੦೦ⲟ";
                    } else {
                        for (int i = 0, j = 0; i < stringAlphabetArray.length; i++) {
                            if (stringAlphabetArray[i] > 27) {
                                decrypted += decryptDigit(numberList, (char) stringAlphabetArray[i]);
                            } else if (stringAlphabetArray[i] < 0) {
                                decryptedIntArray[i] = (stringAlphabetArray[i] * -1 - keyAlphabetArray[j]) % 26 - 1;
                                if (decryptedIntArray[i] <= 0) {
                                    decryptedIntArray[i] += 26;
                                }
                                decrypted += (char) (decryptedIntArray[i] + 64);
                                j = ++j % key.length();
                            } else {
                                decryptedIntArray[i] = (stringAlphabetArray[i] - keyAlphabetArray[j]) % 26 - 1;
                                if (decryptedIntArray[i] <= 0) {
                                    decryptedIntArray[i] += 26;
                                }
                                decrypted += (char) (decryptedIntArray[i] + 96);
                                j = ++j % key.length();
                            }
                        }
                        switchOnThis = "օ੦੦ⲟℴ〇๐〇ዐо౦၀ℴዐℴｏ౦੦ዐ੦၀օօዐⲟℴⲟ੦ⲟⲟ௦௦૦๐〇ℴ";
                    }
                    break;
                case "௦ℴ၀〇౦օօჿዐ੦ℴ௦੦ዐℴ௦੦ℴዐ০౦໐০ዐоℴ௦౦〇૦оｏჿℴⲟ๐":
                    stringAlphabetArray = convertToAlphabetIntegerArray(encryptedText);
                    switchOnThis = "੦๐౦ⲟօ၀੦੦ዐ໐〇໐೦ዐℴ๐ｏｏዐօ૦০০ዐ੦օｏօ໐০ｏ〇ℴ၀೦ℴ";
                    break;
                case "၀ℴо૦ჿ౦௦౦ዐ০ℴ૦૦ዐℴ௦೦০ዐ૦౦૦૦ዐჿ๐০௦ｏ౦၀೦౦೦೦໐":
                    if (OPAQUES[1] % OPAQUES[22] == OPAQUES[20]) {
                        decrypted = "";
                        switchOnThis = "੦ⲟⲟ౦ℴ๐૦〇ዐჿо੦ｏዐℴℴჿｏዐ૦౦〇၀ዐℴо໐௦೦ჿ๐௦ჿｏ೦೦";
                    } else {
                        stringAlphabetArray = convertToAlphabetIntegerArray(encryptedText);
                        switchOnThis = "௦๐ⲟо૦౦ℴ౦ዐｏ౦о૦ዐℴℴооዐօоⲟ๐ዐℴℴ၀੦௦໐๐ჿо໐օ੦";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }
}
