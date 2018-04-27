package rotacsufbo.encrypt;

import java.util.*;

public class Decrypt {

    public static String decrypt(String encrypted) {
        int ENCRYPTION_ALGORITHMS = 0;
        byte[] decoded = null;
        String decodedStr = null;
        int encryptorUsed = 0;
        String decryptedString = null;
        String key = null;
        String switchOnThis = "੦ℴ๐௦ⲟ੦ჿ੦ዐ੦௦౦ｏዐℴ௦о๐ዐ૦০০ჿዐ੦օ௦〇೦о೦ჿℴჿⲟо";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 166, 40, 418, 68, 502, 180, 89, 152, 635, 194, 411, 334, 502, 61, 243, 579, 439, 187, 348, 96, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "೦оⲟჿ૦೦౦௦ዐｏ૦০౦ዐℴｏօ౦ዐօ๐ℴ౦ዐჿჿ૦օⲟ੦੦ｏ౦౦௦օ":
                    if (OPAQUES[5] % OPAQUES[22] == OPAQUES[20]) {
                        return decryptedString;
                        switchOnThis = "೦〇ｏ〇௦໐о௦ዐ౦੦ｏօዐℴ੦੦౦ዐ০ｏ௦օዐ௦౦౦օ໐ℴჿ๐౦๐੦০";
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
                        switchOnThis = "౦૦ⲟ০௦ⲟ〇ｏዐ೦ℴ౦૦ዐℴօ০ｏዐ০ｏ૦ჿዐо০೦ℴо੦օჿо〇ｏօ";
                    }
                    break;
                case "০૦ℴ౦ℴօ౦০ዐо૦໐੦ዐℴⲟ০ℴዐ੦ⲟ০໐ዐ౦〇໐оｏℴ၀੦౦о〇ｏ":
                    if (OPAQUES[17] % OPAQUES[22] == OPAQUES[20]) {
                        encryptorUsed %= ENCRYPTION_ALGORITHMS;
                        switchOnThis = "ℴ๐০૦໐ⲟ〇๐ዐჿ〇೦૦ዐℴ௦ℴｏዐ૦օ੦〇ዐ๐๐੦๐၀໐೦੦〇๐๐౦";
                    } else {
                        encryptorUsed %= ENCRYPTION_ALGORITHMS;
                        switchOnThis = "๐၀օℴ౦௦о০ዐℴℴ੦૦ዐℴჿ໐ⲟዐ૦ｏⲟ০ዐ૦໐૦੦၀၀๐၀၀๐০૦";
                    }
                    break;
                case "௦ⲟⲟօ໐০ჿⲟዐ໐օ໐оዐℴ๐ჿ๐ዐ০〇໐๐ዐ໐ჿⲟо೦ჿⲟ〇၀೦௦੦":
                    if (OPAQUES[0] % OPAQUES[20] != OPAQUES[21]) {
                        decodedStr = new String(decoded);
                        switchOnThis = "౦০оօ૦೦၀၀ዐ໐௦օ૦ዐℴ໐օ૦ዐ૦௦੦оዐ೦૦௦ჿⲟ౦〇੦౦ｏ૦໐";
                    } else {
                        decoded = Base64.getDecoder().decode(encrypted);
                        switchOnThis = "๐оⲟ೦૦ｏ໐ჿዐℴℴჿ૦ዐℴ০໐၀ዐ੦๐ⲟ০ዐо੦೦੦໐ｏ೦օ໐૦օ০";
                    }
                    break;
                case "๐оⲟ೦૦ｏ໐ჿዐℴℴჿ૦ዐℴ০໐၀ዐ੦๐ⲟ০ዐо੦೦੦໐ｏ೦օ໐૦օ০":
                    if (OPAQUES[0] % OPAQUES[20] != OPAQUES[21]) {
                        return decryptedString;
                        switchOnThis = "ℴ૦০ℴ੦၀օоዐℴ໐๐оዐℴօ೦оዐօ૦๐௦ዐ၀ⲟ೦໐ｏ੦૦০໐ჿⲟⲟ";
                    } else {
                        decodedStr = new String(decoded);
                        switchOnThis = "೦౦੦ℴｏօｏ೦ዐ௦ⲟ০ｏዐℴჿ੦ⲟዐօⲟℴоዐ০૦ｏоⲟｏｏ౦০௦ჿ೦";
                    }
                    break;
                case "ⲟ໐౦ℴⲟ০ℴ౦ዐ๐૦೦оዐℴ໐օℴዐ૦ｏⲟ๐ዐ၀ℴօ௦ℴℴ໐〇၀ｏⲟⲟ":
                    encryptorUsed %= ENCRYPTION_ALGORITHMS;
                    switchOnThis = "໐၀໐ｏ੦೦օჿዐ๐௦ｏ๐ዐℴоℴ๐ዐ૦ｏ၀໐ዐоℴ೦၀ⲟ໐о๐о၀໐〇";
                    break;
                case "໐๐ჿ〇০০〇೦ዐ〇оჿ〇ዐℴ๐〇੦ዐօ૦о〇ዐ〇ｏჿ๐օ০૦ℴⲟ〇ℴ০":
                    decodedStr = new String(decoded);
                    switchOnThis = "ჿօⲟｏℴ౦၀૦ዐ௦੦ჿ০ዐℴօ๐ⲟዐ૦০օ੦ዐℴ੦೦ⲟ೦੦૦ჿ౦০௦о";
                    break;
                case "ℴ၀ⲟօ၀੦〇ｏዐ໐೦௦೦ዐℴ௦૦ჿዐ੦๐೦໐ዐ૦૦໐౦໐௦૦ჿօօℴ၀":
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
                    switchOnThis = "੦౦೦૦ℴ௦ჿоዐ໐ℴ໐ⲟዐℴ௦০〇ዐօ௦௦၀ዐօ௦о๐ℴ૦๐ｏ௦০օ੦";
                    break;
                case "౦૦ⲟ০௦ⲟ〇ｏዐ೦ℴ౦૦ዐℴօ০ｏዐ০ｏ૦ჿዐо০೦ℴо੦օჿо〇ｏօ":
                    if (OPAQUES[3] % OPAQUES[22] != OPAQUES[20]) {
                        return decryptedString;
                        switchOnThis = "૦໐০〇૦೦օоዐօ໐ℴℴዐℴ໐оⲟዐ੦〇〇ｏዐ໐၀о௦о໐੦๐ჿ೦๐ℴ";
                    } else {
                        decodedStr = new String(decoded);
                        switchOnThis = "ⲟо၀о໐၀о౦ዐ໐੦օ೦ዐℴ૦੦೦ዐ੦ｏ၀օዐ੦੦੦০၀๐〇೦౦௦ჿ૦";
                    }
                case "੦ℴ๐௦ⲟ੦ჿ੦ዐ੦௦౦ｏዐℴ௦о๐ዐ૦০০ჿዐ੦օ௦〇೦о೦ჿℴჿⲟо":
                    if (OPAQUES[15] % OPAQUES[22] == OPAQUES[20]) {
                        encryptorUsed %= ENCRYPTION_ALGORITHMS;
                        switchOnThis = "০೦ჿ௦௦ℴｏჿዐⲟⲟ૦๐ዐℴｏ๐໐ዐ০໐ℴｏዐ০૦〇օօⲟ૦ⲟ০၀௦໐";
                    } else {
                        ENCRYPTION_ALGORITHMS = 5;
                        switchOnThis = "௦ⲟⲟօ໐০ჿⲟዐ໐օ໐оዐℴ๐ჿ๐ዐ০〇໐๐ዐ໐ჿⲟо೦ჿⲟ〇၀೦௦੦";
                    }
                    break;
                case "၀〇೦๐೦〇၀๐ዐჿ၀௦оዐℴ௦ⲟ౦ዐ০௦ⲟоዐ౦౦೦௦〇౦ⲟօｏ໐೦օ":
                    if (OPAQUES[10] % OPAQUES[20] != OPAQUES[21]) {
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
                        switchOnThis = "০০ℴ౦ჿⲟ၀ｏዐ〇ჿ౦໐ዐℴ၀૦੦ዐ૦૦౦೦ዐⲟ০၀оჿо၀໐੦੦௦ℴ";
                    } else {
                        key = decodedStr.substring(decodedStr.length() - 50);
                        switchOnThis = "೦оⲟჿ૦೦౦௦ዐｏ૦০౦ዐℴｏօ౦ዐօ๐ℴ౦ዐჿჿ૦օⲟ੦੦ｏ౦౦௦օ";
                    }
                    break;
                case "օℴ০оჿ૦໐၀ዐ౦ℴ೦оዐℴ๐ℴⲟዐ੦౦օⲟዐｏօ໐ｏ〇〇౦〇০ｏ০օ":
                    encryptorUsed %= ENCRYPTION_ALGORITHMS;
                    switchOnThis = "๐੦০໐ℴ๐о〇ዐⲟℴ০оዐℴ૦〇ｏዐ૦ⲟ໐ⲟዐ௦০ｏ๐ჿ໐೦ｏ૦ｏօ০";
                    break;
                case "೦౦੦ℴｏօｏ೦ዐ௦ⲟ০ｏዐℴჿ੦ⲟዐօⲟℴоዐ০૦ｏоⲟｏｏ౦০௦ჿ೦":
                    if (OPAQUES[1] % OPAQUES[22] == OPAQUES[20]) {
                        decryptedString = decodedStr.substring(2, decodedStr.length() - 50);
                        switchOnThis = "օ〇౦ⲟｏ೦੦೦ዐｏｏ໐૦ዐℴ೦〇ℴዐ૦੦օօዐ໐௦੦๐೦໐ჿℴ੦௦০૦";
                    } else {
                        encryptorUsed = 10 * Character.getNumericValue(decodedStr.charAt(0)) + Character.getNumericValue(decodedStr.charAt(1));
                        switchOnThis = "০૦ℴ౦ℴօ౦০ዐо૦໐੦ዐℴⲟ০ℴዐ੦ⲟ০໐ዐ౦〇໐оｏℴ၀੦౦о〇ｏ";
                    }
                    break;
                case "๐၀օℴ౦௦о০ዐℴℴ੦૦ዐℴჿ໐ⲟዐ૦ｏⲟ০ዐ૦໐૦੦၀၀๐၀၀๐০૦":
                    if (OPAQUES[17] % OPAQUES[22] != OPAQUES[20]) {
                        decryptedString = decodedStr.substring(2, decodedStr.length() - 50);
                        switchOnThis = "၀〇೦๐೦〇၀๐ዐჿ၀௦оዐℴ௦ⲟ౦ዐ০௦ⲟоዐ౦౦೦௦〇౦ⲟօｏ໐೦օ";
                    } else {
                        encryptorUsed %= ENCRYPTION_ALGORITHMS;
                        switchOnThis = "ℴℴ〇০௦௦ⲟ౦ዐ〇೦೦੦ዐℴ໐ჿ೦ዐօ০౦೦ዐ૦๐ⲟо၀〇໐೦օоჿо";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public static List generateNumberList() {
        List<String> places = null;
        String switchOnThis = "೦ჿჿ๐оⲟℴⲟዐ૦〇౦ℴዐℴჿ೦〇ዐ੦೦ⲟｏዐℴ〇〇౦ჿ௦౦ⲟ໐ℴ੦౦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 26, 173, 663, 159, 397, 418, 642, 348, 313, 621, 586, 264, 579, 642, 670, 677, 243, 495, 593, 201, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "೦ჿჿ๐оⲟℴⲟዐ૦〇౦ℴዐℴჿ೦〇ዐ੦೦ⲟｏዐℴ〇〇౦ჿ௦౦ⲟ໐ℴ੦౦":
                    if (OPAQUES[7] % OPAQUES[22] != OPAQUES[20]) {
                        places = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
                        switchOnThis = "௦௦๐〇〇੦ⲟ૦ዐ০૦〇০ዐℴ၀০ⲟዐ০ｏჿօዐჿ০о૦૦〇௦оℴჿ౦ჿ";
                    } else {
                        places = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
                        switchOnThis = "ⲟ೦၀ⲟ০օօｏዐ၀о૦օዐℴоℴｏዐ০০০੦ዐ੦о೦ℴ০〇౦〇੦ჿ੦о";
                    }
                    break;
                case "〇օ๐ℴօℴ੦〇ዐჿ౦ℴ໐ዐℴ੦໐০ዐ০оℴ౦ዐо೦૦ℴ০๐օჿｏ၀૦օ":
                    places = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
                    switchOnThis = "ⲟоⲟо০໐〇໐ዐ௦ｏｏ೦ዐℴ໐၀౦ዐ০೦о౦ዐ੦ℴ೦੦๐௦ｏ೦օ〇၀૦";
                    break;
                case "௦௦๐〇〇੦ⲟ૦ዐ০૦〇০ዐℴ၀০ⲟዐ০ｏჿօዐჿ০о૦૦〇௦оℴჿ౦ჿ":
                    if (OPAQUES[14] % OPAQUES[20] != OPAQUES[21]) {
                        places = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
                        switchOnThis = "๐౦〇ｏჿ੦૦〇ዐօօჿ௦ዐℴჿ๐໐ዐ੦๐ⲟⲟዐⲟ౦ⲟｏჿ၀೦໐၀ჿ૦օ";
                    } else {
                        return places;
                        switchOnThis = "о੦օⲟჿ౦೦௦ዐｏჿⲟоዐℴჿ〇૦ዐ০ჿ௦оዐ໐օ০ℴ၀о໐໐೦ⲟ೦ℴ";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public static String dec01(String encryptedText, final String key) {
        String decryptedText = null;
        List<String> numberList = null;
        String switchOnThis = "௦ⲟ౦၀၀೦ℴ૦ዐ૦ჿ೦౦ዐℴ၀๐ｏዐ০၀〇〇ዐ੦௦о໐૦໐ℴ૦ℴ໐〇೦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 432, 593, 537, 19, 446, 320, 131, 495, 677, 96, 593, 278, 537, 75, 124, 243, 250, 663, 418, 96, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "௦ⲟ౦၀၀೦ℴ૦ዐ૦ჿ೦౦ዐℴ၀๐ｏዐ০၀〇〇ዐ੦௦о໐૦໐ℴ૦ℴ໐〇೦":
                    if (OPAQUES[15] % OPAQUES[22] == OPAQUES[20]) {
                        decryptedText = "";
                        switchOnThis = "ჿ੦〇ჿօо౦၀ዐ၀ℴ໐〇ዐℴ೦ℴ੦ዐ૦೦௦оዐ૦၀ჿ౦օ໐ｏ௦੦೦౦օ";
                    } else {
                        decryptedText = "";
                        switchOnThis = "〇๐০૦ⲟօｏჿዐо૦оⲟዐℴ၀օｏዐ০ჿｏⲟዐℴо೦੦໐ჿჿօ௦૦০о";
                    }
                    break;
                case "օ૦໐ｏℴ૦০ჿዐｏоⲟℴዐℴ౦оｏዐ૦օｏоዐ〇০௦ℴℴ〇ჿ੦ⲟℴℴ໐":
                    decryptedText = "";
                    switchOnThis = "օⲟօ〇౦໐౦օዐჿჿօ೦ዐℴⲟｏℴዐ੦๐૦౦ዐ၀໐೦૦〇〇੦০ⲟ๐ⲟ০";
                    break;
                case "〇๐০૦ⲟօｏჿዐо૦оⲟዐℴ၀օｏዐ০ჿｏⲟዐℴо೦੦໐ჿჿօ௦૦০о":
                    if (OPAQUES[18] % OPAQUES[20] != OPAQUES[21]) {
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
                        switchOnThis = "๐ℴ੦૦௦၀ｏｏዐ๐〇๐૦ዐℴ౦ℴჿዐօℴ౦ℴዐ੦௦௦౦೦௦૦૦ჿℴ੦о";
                    } else {
                        numberList = generateNumberList();
                        switchOnThis = "ⲟ〇ｏօ၀ℴ௦౦ዐ၀౦০օዐℴ௦ℴｏዐ০௦௦၀ዐо௦૦௦๐〇〇௦ｏօ૦೦";
                    }
                    break;
                case "ⲟ૦໐௦၀ⲟօ௦ዐ౦੦௦၀ዐℴⲟ೦〇ዐ০೦੦੦ዐ౦౦ｏ೦օ၀〇၀০ℴⲟ০":
                    return decryptedText;
                case "ⲟ〇ｏօ၀ℴ௦౦ዐ၀౦০օዐℴ௦ℴｏዐ০௦௦၀ዐо௦૦௦๐〇〇௦ｏօ૦೦":
                    if (OPAQUES[17] % OPAQUES[22] == OPAQUES[20]) {
                        return decryptedText;
                        switchOnThis = "੦໐౦૦౦๐о೦ዐ੦ｏ๐੦ዐℴ੦੦оዐ૦೦ｏℴዐ໐૦օ੦௦๐ｏօჿоⲟо";
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
                        switchOnThis = "օ〇๐ⲟℴ೦օ੦ዐ೦ჿｏ௦ዐℴ௦ⲟ〇ዐօℴ〇໐ዐℴ০ｏ০〇০ⲟо૦೦೦೦";
                    }
                    break;
                case "օ〇๐ⲟℴ೦օ੦ዐ೦ჿｏ௦ዐℴ௦ⲟ〇ዐօℴ〇໐ዐℴ০ｏ০〇০ⲟо૦೦೦೦":
                    if (OPAQUES[11] % OPAQUES[22] == OPAQUES[20]) {
                        numberList = generateNumberList();
                        switchOnThis = "о໐оⲟо〇௦ⲟዐօ০๐ⲟዐℴℴ〇໐ዐ੦օ၀੦ዐ๐౦ｏჿоо၀ჿ౦օ೦၀";
                    } else {
                        return decryptedText;
                        switchOnThis = "၀౦௦੦ℴ০〇੦ዐ೦օⲟ౦ዐℴ௦௦ⲟዐ০ⲟⲟ೦ዐⲟо૦ℴ໐օօℴօ૦〇ჿ";
                    }
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public static String dec02(String encryptedText, String key) {
        String decryptedString = null;
        String switchOnThis = "௦ჿ໐০օо၀০ዐ੦о੦ჿዐℴ၀໐๐ዐ૦๐ⲟоዐ೦օ౦໐ⲟⲟօⲟℴ౦ℴ૦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 509, 502, 411, 607, 481, 96, 439, 642, 131, 544, 306, 320, 621, 40, 117, 103, 278, 271, 481, 460, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "౦ⲟоｏℴ〇௦೦ዐ〇ჿ০օዐℴ๐౦௦ዐօ௦ℴ০ዐ০၀๐௦ჿｏｏ೦໐оｏ੦":
                    if (OPAQUES[7] % OPAQUES[22] == OPAQUES[20]) {
                        for (char c : encryptedText.toCharArray()) {
                            int newIntegerValue = (int) c - 69;
                            if (newIntegerValue < 32) {
                                int offset = 32 - (newIntegerValue + 1);
                                newIntegerValue = 126 - offset;
                            }
                            decryptedString += (char) newIntegerValue;
                        }
                        switchOnThis = "੦໐໐〇੦૦૦၀ዐ๐օℴ๐ዐℴ௦੦๐ዐ૦๐ჿ೦ዐ೦ჿ০ჿ೦૦ჿ੦ⲟօⲟ၀";
                    } else {
                        for (char c : encryptedText.toCharArray()) {
                            int newIntegerValue = (int) c - 69;
                            if (newIntegerValue < 32) {
                                int offset = 32 - (newIntegerValue + 1);
                                newIntegerValue = 126 - offset;
                            }
                            decryptedString += (char) newIntegerValue;
                        }
                        switchOnThis = "օ၀၀੦ｏⲟ૦੦ዐ౦๐၀ⲟዐℴօ੦౦ዐ੦౦ჿｏዐჿ〇ⲟჿ๐௦ჿ౦օ౦ｏ੦";
                    }
                    break;
                case "օ၀၀੦ｏⲟ૦੦ዐ౦๐၀ⲟዐℴօ੦౦ዐ੦౦ჿｏዐჿ〇ⲟჿ๐௦ჿ౦օ౦ｏ੦":
                    if (OPAQUES[5] % OPAQUES[22] != OPAQUES[20]) {
                        return decryptedString;
                        switchOnThis = "ჿｏ௦ℴℴჿօ০ዐоо௦০ዐℴօօ੦ዐ০օ໐ｏዐ೦〇օ০౦ჿ০໐೦০০০";
                    } else {
                        return decryptedString;
                        switchOnThis = "೦೦௦౦๐օ૦ჿዐ૦೦о໐ዐℴ೦૦ⲟዐօ໐໐〇ዐⲟ೦໐೦о໐ჿ೦ℴ௦〇೦";
                    }
                case "〇〇০օ๐໐օℴዐ૦ჿ೦೦ዐℴօｏ௦ዐ০૦о੦ዐ๐о૦օ౦о〇〇၀௦о০":
                    return decryptedString;
                case "௦ჿ໐০օо၀০ዐ੦о੦ჿዐℴ၀໐๐ዐ૦๐ⲟоዐ೦օ౦໐ⲟⲟօⲟℴ౦ℴ૦":
                    if (OPAQUES[4] % OPAQUES[20] != OPAQUES[21]) {
                        decryptedString = "";
                        switchOnThis = "૦ｏ໐ⲟｏ૦૦ｏዐо〇〇ჿዐℴօ௦օዐ૦০໐ℴዐо০ⲟ౦оჿ০օ೦๐о૦";
                    } else {
                        decryptedString = "";
                        switchOnThis = "౦ⲟоｏℴ〇௦೦ዐ〇ჿ০օዐℴ๐౦௦ዐօ௦ℴ০ዐ০၀๐௦ჿｏｏ೦໐оｏ੦";
                    }
                    break;
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
        String switchOnThis = "੦੦๐໐๐໐ⲟ੦ዐ౦೦ჿ၀ዐℴⲟ๐ℴዐ૦૦০ჿዐⲟｏ೦ｏоｏ๐௦౦౦ჿօ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 250, 390, 341, 208, 145, 250, 124, 572, 551, 334, 334, 390, 544, 250, 159, 166, 460, 628, 271, 19, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "๐ჿ੦оⲟ〇௦օዐℴօ๐ⲟዐℴ૦౦ჿዐ੦ℴ੦௦ዐ௦〇໐๐௦੦ℴ০੦০၀๐":
                    if (OPAQUES[9] % OPAQUES[22] == OPAQUES[20]) {
                        decryptedString = "";
                        switchOnThis = "оⲟℴ০၀๐ⲟ໐ዐ၀๐၀ჿዐℴ૦০օዐօⲟ૦օዐℴ໐〇໐੦о๐০໐〇೦օ";
                    } else {
                        reverse = buffer.reverse().toString();
                        switchOnThis = "〇௦০〇ｏ੦〇၀ዐ๐০о๐ዐℴ〇๐૦ዐ੦੦๐ჿዐ௦໐౦ｏჿ〇૦૦๐〇ჿ〇";
                    }
                    break;
                case "๐〇ჿоⲟⲟｏℴዐⲟⲟ๐੦ዐℴℴ๐๐ዐ০ჿⲟ๐ዐ౦ⲟ〇০০ｏ໐ℴ૦၀໐ｏ":
                    if (OPAQUES[1] % OPAQUES[22] != OPAQUES[20]) {
                        return decryptedString;
                        switchOnThis = "ⲟჿօօ๐౦ⲟ০ዐ૦੦օ೦ዐℴⲟ੦௦ዐ੦੦၀૦ዐⲟჿоℴ೦੦ⲟ౦〇〇০ⲟ";
                    } else {
                        decryptedString = "";
                        switchOnThis = "ⲟօ၀૦০೦〇০ዐ௦੦ⲟ೦ዐℴօⲟ૦ዐ੦੦оｏዐ၀০০ჿℴ໐໐੦๐๐೦௦";
                    }
                case "੦੦๐໐๐໐ⲟ੦ዐ౦೦ჿ၀ዐℴⲟ๐ℴዐ૦૦০ჿዐⲟｏ೦ｏоｏ๐௦౦౦ჿօ":
                    if (OPAQUES[18] % OPAQUES[20] != OPAQUES[21]) {
                        decryptedString = "";
                        switchOnThis = "о໐ｏჿоⲟо੦ዐჿℴℴⲟዐℴ౦ⲟ௦ዐ੦ℴჿℴዐ೦૦໐๐〇ｏ๐ｏ০໐оჿ";
                    } else {
                        ordered = generateAtbashOrderedString();
                        switchOnThis = "၀оօ૦೦౦௦ⲟዐ০௦૦๐ዐℴ૦೦౦ዐ૦૦౦ｏዐｏ০૦ｏ೦ℴℴℴо੦૦๐";
                    }
                    break;
                case "၀оօ૦೦౦௦ⲟዐ০௦૦๐ዐℴ૦೦౦ዐ૦૦౦ｏዐｏ০૦ｏ೦ℴℴℴо੦૦๐":
                    if (OPAQUES[4] % OPAQUES[20] == OPAQUES[21]) {
                        buffer = new StringBuffer(ordered);
                        switchOnThis = "๐ჿ੦оⲟ〇௦օዐℴօ๐ⲟዐℴ૦౦ჿዐ੦ℴ੦௦ዐ௦〇໐๐௦੦ℴ০੦০၀๐";
                    } else {
                        for (int i = 0; i < encryptedText.length(); i++) {
                            char currentCharacter = encryptedText.charAt(i);
                            int indexOfCurrentCharacter = reverse.indexOf(currentCharacter);
                            decryptedString += ordered.charAt(indexOfCurrentCharacter);
                        }
                        switchOnThis = "〇௦ｏ၀ჿооⲟዐ໐о၀ⲟዐℴ໐ｏ૦ዐօჿ໐౦ዐ໐૦๐〇௦ჿ೦๐օｏоօ";
                    }
                    break;
                case "օօ੦௦໐ｏ૦๐ዐооօ໐ዐℴⲟ০၀ዐ০੦೦૦ዐо๐օ੦੦ⲟℴ೦໐೦೦၀":
                    ordered = generateAtbashOrderedString();
                    switchOnThis = "о၀оℴ০၀๐օዐ೦๐೦օዐℴｏ౦๐ዐ૦๐၀໐ዐ၀౦০၀০໐೦০໐ｏ੦ⲟ";
                    break;
                case "ჿℴ໐੦౦ℴооዐⲟ೦օ੦ዐℴჿჿ〇ዐ০০〇ჿዐ০〇০௦ჿⲟｏо೦оｏｏ":
                    decryptedString = "";
                    switchOnThis = "০૦〇၀௦੦〇๐ዐ໐օ๐೦ዐℴჿჿჿዐ০ჿℴօዐօ૦੦๐၀ჿ೦౦ჿ〇ⲟօ";
                    break;
                case "๐օｏ၀ℴ০〇૦ዐｏℴ௦౦ዐℴ౦໐০ዐ੦௦၀ჿዐ໐ℴ〇ｏ౦ჿ০၀ⲟℴ౦օ":
                    if (OPAQUES[0] % OPAQUES[20] != OPAQUES[21]) {
                        reverse = buffer.reverse().toString();
                        switchOnThis = "ჿℴ૦〇๐о೦ჿዐоｏⲟօዐℴⲟⲟｏዐ০੦օ໐ዐｏо๐໐૦೦੦૦೦ჿ੦о";
                    } else {
                        for (int i = 0; i < encryptedText.length(); i++) {
                            char currentCharacter = encryptedText.charAt(i);
                            int indexOfCurrentCharacter = reverse.indexOf(currentCharacter);
                            decryptedString += ordered.charAt(indexOfCurrentCharacter);
                        }
                        switchOnThis = "๐〇ჿоⲟⲟｏℴዐⲟⲟ๐੦ዐℴℴ๐๐ዐ০ჿⲟ๐ዐ౦ⲟ〇০০ｏ໐ℴ૦၀໐ｏ";
                    }
                    break;
                case "૦০оօ০௦ⲟ০ዐо௦ｏоዐℴ੦০੦ዐ০ჿ〇೦ዐ੦ⲟ౦ⲟჿჿօ૦၀০๐੦":
                    decryptedString = "";
                    switchOnThis = "၀௦၀໐၀੦ⲟ૦ዐჿ〇౦ℴዐℴℴჿ౦ዐօ౦೦ჿዐℴ૦௦о੦๐૦๐ⲟ೦௦೦";
                    break;
                case "〇௦০〇ｏ੦〇၀ዐ๐০о๐ዐℴ〇๐૦ዐ੦੦๐ჿዐ௦໐౦ｏჿ〇૦૦๐〇ჿ〇":
                    if (OPAQUES[10] % OPAQUES[20] != OPAQUES[21]) {
                        reverse = buffer.reverse().toString();
                        switchOnThis = "〇օ੦о௦၀௦੦ዐჿ೦௦օዐℴｏ໐໐ዐ০໐੦ჿዐ૦౦૦௦০၀๐օ၀ⲟჿ๐";
                    } else {
                        decryptedString = "";
                        switchOnThis = "๐օｏ၀ℴ০〇૦ዐｏℴ௦౦ዐℴ౦໐০ዐ੦௦၀ჿዐ໐ℴ〇ｏ౦ჿ০၀ⲟℴ౦օ";
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
        String switchOnThis = "௦၀૦ⲟℴℴ౦ⲟዐⲟ০ⲟ೦ዐℴ௦໐૦ዐ૦૦໐๐ዐ໐〇၀໐〇ℴ০௦໐ⲟ૦௦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 607, 649, 425, 180, 460, 236, 264, 411, 187, 257, 194, 75, 614, 516, 327, 586, 677, 313, 432, 509, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "૦૦ჿℴ০ⲟ၀ჿዐ௦๐〇ｏዐℴ၀ℴℴዐ০၀૦໐ዐ০օ੦੦๐〇ℴℴ੦၀ჿ〇":
                    if (OPAQUES[5] % OPAQUES[22] == OPAQUES[20]) {
                        return ordered;
                        switchOnThis = "૦๐໐၀౦౦౦оዐ੦〇〇๐ዐℴо૦ⲟዐ੦૦၀๐ዐ০௦ℴ௦၀о໐๐оօℴ๐";
                    } else {
                        return ordered;
                        switchOnThis = "ჿ੦ჿｏ੦ｏ௦૦ዐ၀၀ჿჿዐℴ၀ⲟ๐ዐ০౦໐০ዐჿჿ໐ℴ੦օ〇๐ｏ౦๐૦";
                    }
                case "௦၀૦ⲟℴℴ౦ⲟዐⲟ০ⲟ೦ዐℴ௦໐૦ዐ૦૦໐๐ዐ໐〇၀໐〇ℴ০௦໐ⲟ૦௦":
                    if (OPAQUES[0] % OPAQUES[20] == OPAQUES[21]) {
                        ordered = "";
                        switchOnThis = "о〇੦౦〇੦௦ⲟዐ௦ℴ௦০ዐℴ໐૦ჿዐ০〇௦ｏዐ໐〇о௦๐օ౦ｏℴօ๐ｏ";
                    } else {
                        for (int i = 32; i <= 126; i++) {
                            ordered += (char) i;
                        }
                        switchOnThis = "০૦ｏ໐ｏℴ๐ⲟዐ౦ⲟｏօዐℴｏ૦௦ዐօ౦ℴоዐ๐੦౦ⲟ০ℴ౦၀ⲟ೦೦௦";
                    }
                    break;
                case "օ০௦੦о૦૦ჿዐ๐၀օօዐℴ๐০၀ዐօ๐ⲟ໐ዐ೦ჿ০౦ｏ၀၀ℴ໐০ℴ੦":
                    return ordered;
                case "о〇੦౦〇੦௦ⲟዐ௦ℴ௦০ዐℴ໐૦ჿዐ০〇௦ｏዐ໐〇о௦๐օ౦ｏℴօ๐ｏ":
                    if (OPAQUES[0] % OPAQUES[20] == OPAQUES[21]) {
                        for (int i = 32; i <= 126; i++) {
                            ordered += (char) i;
                        }
                        switchOnThis = "૦૦ჿℴ০ⲟ၀ჿዐ௦๐〇ｏዐℴ၀ℴℴዐ০၀૦໐ዐ০օ੦੦๐〇ℴℴ੦၀ჿ〇";
                    } else {
                        return ordered;
                        switchOnThis = "〇૦ჿჿ໐ℴჿ૦ዐօℴ၀၀ዐℴ੦໐၀ዐօо၀ჿዐ೦๐ℴⲟ০оℴ〇ℴⲟ೦օ";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }

    public static String decryptDigitString(String encryptedNumbers) {
        List<String> numberList = null;
        String decryptedNumbers = null;
        String switchOnThis = "౦໐о๐૦๐о๐ዐⲟо೦௦ዐℴℴჿｏዐ০ℴ౦໐ዐჿ၀〇೦ⲟⲟ໐ჿｏჿօჿ";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 460, 292, 138, 551, 544, 82, 103, 47, 586, 537, 551, 397, 131, 236, 75, 544, 642, 523, 411, 229, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "ℴ০૦օｏ೦๐၀ዐ੦໐〇௦ዐℴ૦௦౦ዐ૦ⲟⲟｏዐℴ౦ｏⲟ၀ｏо௦օ໐ჿо":
                    if (OPAQUES[9] % OPAQUES[22] == OPAQUES[20]) {
                        return decryptedNumbers;
                        switchOnThis = "ｏℴ০〇ჿⲟ၀ⲟዐⲟ௦ｏ၀ዐℴ๐೦〇ዐօℴ੦໐ዐℴ೦ჿჿ๐〇૦о໐оჿ௦";
                    } else {
                        for (char i : encryptedNumbers.toCharArray()) {
                            decryptedNumbers += Character.toString(decryptDigit(numberList, i));
                        }
                        switchOnThis = "૦০০০੦ჿооዐ૦оо೦ዐℴℴ௦оዐ૦〇๐օዐ౦੦〇ℴⲟօ೦၀ℴ௦ｏ૦";
                    }
                    break;
                case "૦০০০੦ჿооዐ૦оо೦ዐℴℴ௦оዐ૦〇๐օዐ౦੦〇ℴⲟօ೦၀ℴ௦ｏ૦":
                    if (OPAQUES[17] % OPAQUES[22] != OPAQUES[20]) {
                        return decryptedNumbers;
                        switchOnThis = "໐๐ℴｏ๐০૦૦ዐоჿ๐૦ዐℴჿℴ๐ዐ০ｏｏⲟዐօ০ⲟօ໐๐௦၀၀ℴ๐໐";
                    } else {
                        return decryptedNumbers;
                        switchOnThis = "౦ჿｏ〇ℴ০ℴ૦ዐ౦ⲟօ೦ዐℴⲟо০ዐ૦੦ⲟ০ዐ০೦௦໐๐໐ｏ၀๐ⲟ௦૦";
                    }
                case "໐૦〇੦ｏℴℴ၀ዐօⲟ໐ⲟዐℴ০ℴℴዐ০௦ｏ๐ዐ೦ჿ၀௦০๐၀ⲟ၀૦ჿ〇":
                    if (OPAQUES[13] % OPAQUES[22] != OPAQUES[20]) {
                        decryptedNumbers = "";
                        switchOnThis = "ℴ০૦օｏ೦๐၀ዐ੦໐〇௦ዐℴ૦௦౦ዐ૦ⲟⲟｏዐℴ౦ｏⲟ၀ｏо௦օ໐ჿо";
                    } else {
                        return decryptedNumbers;
                        switchOnThis = "໐ℴ੦ჿօ〇೦૦ዐ๐০ℴ໐ዐℴ০о੦ዐ੦〇೦օዐо〇๐೦૦๐о੦໐ⲟ໐௦";
                    }
                    break;
                case "౦໐о๐૦๐о๐ዐⲟо೦௦ዐℴℴჿｏዐ০ℴ౦໐ዐჿ၀〇೦ⲟⲟ໐ჿｏჿօჿ":
                    if (OPAQUES[18] % OPAQUES[20] != OPAQUES[21]) {
                        return decryptedNumbers;
                        switchOnThis = "ჿ໐௦๐ｏо૦౦ዐ໐〇໐੦ዐℴ০ｏ੦ዐօⲟｏℴዐℴℴⲟ๐օо০о౦ⲟ௦օ";
                    } else {
                        numberList = generateNumberList();
                        switchOnThis = "໐૦〇੦ｏℴℴ၀ዐօⲟ໐ⲟዐℴ০ℴℴዐ০௦ｏ๐ዐ೦ჿ၀௦০๐၀ⲟ၀૦ჿ〇";
                    }
                    break;
                case "〇ℴօ〇ჿ๐〇ⲟዐ໐໐ⲟⲟዐℴ〇০௦ዐ૦૦০၀ዐ௦օⲟ૦၀ჿ໐೦〇੦௦ⲟ":
                    return decryptedNumbers;
                case "ｏ೦ⲟ၀౦ℴ๐೦ዐօ〇๐૦ዐℴ〇০ჿዐ০၀૦௦ዐ၀ⲟ໐၀౦ⲟо౦оⲟ০౦":
                    decryptedNumbers = "";
                    switchOnThis = "օ੦౦௦০〇ⲟℴዐ౦໐ｏ૦ዐℴⲟ၀০ዐօ૦๐ℴዐ௦๐౦၀оℴօⲟ০ⲟ০ჿ";
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
        String switchOnThis = "೦ｏ၀੦о၀ｏ໐ዐ૦о〇၀ዐℴ౦০০ዐ০๐೦ჿዐ౦ｏℴ੦օ೦௦ｏ೦օｏ૦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 467, 208, 488, 369, 649, 628, 607, 124, 649, 180, 292, 600, 89, 355, 180, 376, 453, 152, 635, 68, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "௦੦௦੦ⲟჿჿ੦ዐ০০ⲟⲟዐℴ૦௦૦ዐօｏⲟ೦ዐ௦ჿⲟ௦০оｏ০௦૦о໐":
                    if (OPAQUES[17] % OPAQUES[22] == OPAQUES[20]) {
                        numberList = generateNumberList();
                        switchOnThis = "০ჿ೦๐๐೦оｏዐ০օ০၀ዐℴ੦০૦ዐօℴо೦ዐ௦օⲟⲟ೦ჿ௦о௦੦೦๐";
                    } else {
                        offset = offset % 26 + 26;
                        switchOnThis = "〇о௦০၀০০੦ዐⲟℴ〇ｏዐℴ౦௦оዐ੦໐๐օዐ೦ჿоჿ௦ℴ০౦๐೦〇օ";
                    }
                    break;
                case "〇௦໐૦੦ｏ੦ⲟዐ〇〇௦ℴዐℴ੦ｏｏዐ૦оｏｏዐ໐၀ℴ๐੦౦ℴ௦ჿℴⲟ௦":
                    decrypted = "";
                    switchOnThis = "〇௦ⲟ๐ｏჿ੦ℴዐ〇〇〇೦ዐℴ〇૦໐ዐ੦〇〇૦ዐ௦օ၀၀〇၀০๐ℴо౦૦";
                    break;
                case "೦ｏ၀੦о၀ｏ໐ዐ૦о〇၀ዐℴ౦০০ዐ০๐೦ჿዐ౦ｏℴ੦օ೦௦ｏ೦օｏ૦":
                    if (OPAQUES[11] % OPAQUES[22] != OPAQUES[20]) {
                        offset = 26 - offset;
                        switchOnThis = "௦੦௦੦ⲟჿჿ੦ዐ০০ⲟⲟዐℴ૦௦૦ዐօｏⲟ೦ዐ௦ჿⲟ௦০оｏ০௦૦о໐";
                    } else {
                        numberList = generateNumberList();
                        switchOnThis = "૦૦ｏ೦оℴⲟⲟዐｏо০оዐℴ০๐оዐ੦ｏо໐ዐ௦〇ℴ০໐೦ⲟჿ০੦၀ℴ";
                    }
                    break;
                case "౦օℴօоｏооዐ০౦౦০ዐℴ੦໐ｏዐօ〇〇оዐ೦๐ⲟ၀০ｏℴօｏⲟօ౦":
                    decrypted = "";
                    switchOnThis = "ჿ๐〇ჿｏⲟ૦௦ዐ੦ⲟ໐૦ዐℴჿ೦ჿዐ০௦〇ჿዐ〇೦౦໐ჿ০ჿоℴ૦೦๐";
                    break;
                case "〇ｏ૦౦ჿ๐ｏ၀ዐо೦௦ｏዐℴｏ๐օዐ૦໐ჿօዐ০૦ჿ௦ｏ০೦ℴ௦ⲟօⲟ":
                    if (OPAQUES[2] % OPAQUES[20] == OPAQUES[21]) {
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
                        switchOnThis = "ℴ೦օ૦௦၀௦௦ዐ૦๐ｏⲟዐℴօ೦೦ዐ০ჿ௦၀ዐ၀੦௦ჿօ౦০ჿ০໐ℴ௦";
                    } else {
                        offset = offset % 26 + 26;
                        switchOnThis = "օ০〇օ໐ⲟჿ૦ዐ〇ｏ০๐ዐℴ௦໐੦ዐ੦օ೦০ዐ໐૦ჿ௦໐〇૦໐ⲟ০օ౦";
                    }
                    break;
                case "๐ℴℴｏ໐〇ℴ〇ዐ௦ℴ೦੦ዐℴ೦ჿ၀ዐ੦০೦ჿዐ๐௦〇ჿ௦০౦о০၀௦๐":
                    if (OPAQUES[2] % OPAQUES[20] != OPAQUES[21]) {
                        numberList = generateNumberList();
                        switchOnThis = "੦೦ℴօⲟ੦ｏｏዐ๐ⲟ໐၀ዐℴ੦੦〇ዐ૦౦૦ｏዐჿ௦ｏ౦๐૦౦ｏ૦౦ⲟ๐";
                    } else {
                        numberList = generateNumberList();
                        switchOnThis = "〇ｏ૦౦ჿ๐ｏ၀ዐо೦௦ｏዐℴｏ๐օዐ૦໐ჿօዐ০૦ჿ௦ｏ০೦ℴ௦ⲟօⲟ";
                    }
                    break;
                case "໐০౦௦๐ℴⲟ၀ዐ০ℴℴｏዐℴ೦ｏｏዐ০〇౦০ዐ౦೦ℴօｏ੦๐೦๐๐о〇":
                    decrypted = "";
                    switchOnThis = "ჿ௦๐ｏ၀໐ℴჿዐօ૦০໐ዐℴօჿ၀ዐ০໐ჿ๐ዐჿｏ೦ⲟօ໐੦૦ｏ〇၀૦";
                    break;
                case "ℴ೦օ૦௦၀௦௦ዐ૦๐ｏⲟዐℴօ೦೦ዐ০ჿ௦၀ዐ၀੦௦ჿօ౦০ჿ০໐ℴ௦":
                    if (OPAQUES[19] % OPAQUES[22] == OPAQUES[20]) {
                        offset = 26 - offset;
                        switchOnThis = "о০໐ⲟ໐౦໐၀ዐჿ၀๐໐ዐℴℴℴჿዐ০೦ჿ૦ዐⲟჿоօ੦ჿ၀੦ｏ೦ⲟ০";
                    } else {
                        return decrypted;
                        switchOnThis = "௦૦௦о೦ⲟ໐೦ዐ๐೦ჿ౦ዐℴօоℴዐ০໐၀оዐ௦၀ⲟⲟ೦၀೦ჿ૦օ௦૦";
                    }
                case "〇о௦০၀০০੦ዐⲟℴ〇ｏዐℴ౦௦оዐ੦໐๐օዐ೦ჿоჿ௦ℴ০౦๐೦〇օ":
                    if (OPAQUES[18] % OPAQUES[20] == OPAQUES[21]) {
                        decrypted = "";
                        switchOnThis = "๐ℴℴｏ໐〇ℴ〇ዐ௦ℴ೦੦ዐℴ೦ჿ၀ዐ੦০೦ჿዐ๐௦〇ჿ௦০౦о০၀௦๐";
                    } else {
                        decrypted = "";
                        switchOnThis = "օⲟ౦ｏｏ໐ℴ੦ዐｏｏ০໐ዐℴⲟ௦ⲟዐ০ⲟоℴዐℴ০〇ⲟⲟ〇໐๐૦౦〇੦";
                    }
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
        String switchOnThis = "๐၀ℴ੦၀ℴჿօዐ૦〇੦ჿዐℴօ๐оዐ੦೦૦〇ዐ੦౦੦ⲟօ〇੦૦ჿ๐૦੦";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 488, 614, 173, 299, 558, 82, 579, 229, 208, 460, 236, 348, 96, 89, 166, 47, 19, 194, 26, 586, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "๐၀ℴ੦၀ℴჿօዐ૦〇੦ჿዐℴօ๐оዐ੦೦૦〇ዐ੦౦੦ⲟօ〇੦૦ჿ๐૦੦":
                    if (OPAQUES[14] % OPAQUES[20] != OPAQUES[21]) {
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
                        switchOnThis = "০օｏ〇оⲟ౦௦ዐ〇ჿ০ⲟዐℴ੦оჿዐ০૦௦օዐ〇ჿ೦〇ჿｏℴ๐๐օ౦๐";
                    } else {
                        alphabetArray = new int[text.length()];
                        switchOnThis = "၀೦౦໐੦ｏ၀၀ዐօ〇ℴჿዐℴ০૦૦ዐօօо౦ዐ૦о๐౦૦ჿоⲟ௦೦〇օ";
                    }
                    break;
                case "੦௦೦оⲟ๐၀০ዐ০೦ⲟⲟዐℴℴ০ჿዐօℴ௦௦ዐօ௦໐૦ℴ〇ⲟ౦ｏ০০о":
                    i = 0;
                    switchOnThis = "໐ℴ〇౦ჿ၀ｏ〇ዐ၀੦ⲟ๐ዐℴ௦೦๐ዐ੦ⲟ૦၀ዐ೦օ০〇໐ℴ๐๐о௦օо";
                    break;
                case "օ೦၀੦໐๐౦૦ዐｏ੦ჿ౦ዐℴ๐ℴⲟዐ૦оо၀ዐჿ੦ჿ၀ⲟ၀ｏօ〇ｏ၀〇":
                    if (OPAQUES[11] % OPAQUES[22] != OPAQUES[20]) {
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
                        switchOnThis = "೦໐௦০૦ⲟჿჿዐ၀০ооዐℴօ௦๐ዐ੦ჿ૦໐ዐ௦၀ℴℴ໐೦໐၀໐໐ⲟ〇";
                    } else {
                        return alphabetArray;
                        switchOnThis = "੦০၀၀၀০௦օዐ၀ჿ০໐ዐℴ〇০၀ዐօ૦౦೦ዐｏⲟо౦၀೦૦໐௦૦০௦";
                    }
                    break;
                case "೦໐௦০૦ⲟჿჿዐ၀০ооዐℴօ௦๐ዐ੦ჿ૦໐ዐ௦၀ℴℴ໐೦໐၀໐໐ⲟ〇":
                    if (OPAQUES[16] % OPAQUES[20] != OPAQUES[21]) {
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
                        switchOnThis = "໐၀௦૦ⲟ০೦౦ዐ౦০೦௦ዐℴ໐੦౦ዐօ૦〇၀ዐⲟⲟ૦੦ⲟо๐೦੦໐օо";
                    } else {
                        return alphabetArray;
                        switchOnThis = "ⲟ౦օօ໐〇೦໐ዐ໐௦௦ⲟዐℴｏ๐๐ዐ০໐০໐ዐ০ⲟ౦໐௦౦౦๐ℴℴჿℴ";
                    }
                case "၀օ০০೦〇௦〇ዐⲟ౦ⲟ೦ዐℴ๐օ௦ዐ০ℴｏⲟዐ૦၀௦ｏℴоｏ౦ⲟ၀๐〇":
                    i = 0;
                    switchOnThis = "௦〇〇ℴ௦ｏｏｏዐ೦೦օℴዐℴ౦๐ｏዐ০૦ℴჿዐօо૦౦๐ჿ〇օ೦ჿо০";
                    break;
                case "၀೦౦໐੦ｏ၀၀ዐօ〇ℴჿዐℴ০૦૦ዐօօо౦ዐ૦о๐౦૦ჿоⲟ௦೦〇օ":
                    if (OPAQUES[7] % OPAQUES[22] != OPAQUES[20]) {
                        i = 0;
                        switchOnThis = "օ೦၀੦໐๐౦૦ዐｏ੦ჿ౦ዐℴ๐ℴⲟዐ૦оо၀ዐჿ੦ჿ၀ⲟ၀ｏօ〇ｏ၀〇";
                    } else {
                        alphabetArray = new int[text.length()];
                        switchOnThis = "౦օ๐〇၀оჿ০ዐ໐ჿօ੦ዐℴ౦๐ｏዐ০૦౦ჿዐⲟჿ੦〇〇೦௦၀๐೦ｏｏ";
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
        char returnDigit = a;
        int iterationNumber = 0;
        String switchOnThis = "౦օ০օ໐੦ｏօዐ੦໐੦ｏዐℴ〇о੦ዐ੦೦〇〇ዐℴ০ჿ〇૦๐೦ℴჿⲟჿ๐";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 229, 600, 222, 460, 397, 579, 145, 82, 362, 110, 628, 509, 320, 446, 509, 558, 117, 236, 460, 138, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "օо໐օօօ〇໐ዐ၀೦၀၀ዐℴⲟⲟ੦ዐ૦๐о௦ዐ၀ჿⲟ௦੦〇၀օｏ௦૦ⲟ":
                    needToGetDigit = true;
                    switchOnThis = "੦੦၀၀ℴ੦০೦ዐ০੦၀૦ዐℴ౦౦〇ዐ০੦໐໐ዐ੦౦၀௦ℴо౦ｏⲟ௦ｏ௦";
                    break;
                case "ｏ๐౦ⲟ௦౦೦օዐօℴо໐ዐℴ໐০০ዐ੦о〇೦ዐ〇௦օօⲟℴ௦၀ℴჿ০੦":
                    needToGetDigit = true;
                    switchOnThis = "ⲟｏ〇ℴⲟ੦໐੦ዐⲟｏ০ჿዐℴⲟо౦ዐ০೦ооዐ〇૦๐౦૦૦օо〇օⲟ௦";
                    break;
                case "೦ჿ੦ℴ௦೦၀ⲟዐ໐ｏ૦ⲟዐℴ૦౦ⲟዐ੦০௦օዐ౦๐௦ℴ၀೦ჿ০੦օ၀ჿ":
                    if (OPAQUES[7] % OPAQUES[22] != OPAQUES[20]) {
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
                        switchOnThis = "૦၀ⲟ၀օ၀௦օዐ໐ℴօ௦ዐℴ೦๐օዐ૦օօօዐ೦၀၀ჿ๐ⲟℴ০օ౦๐೦";
                    } else {
                        numberAsString = (String) numberList.get(numericalValue);
                        switchOnThis = "੦၀ჿ〇ｏо໐૦ዐ໐၀໐օዐℴ੦౦੦ዐ০௦〇੦ዐ೦౦၀೦၀௦౦૦౦ℴоℴ";
                    }
                    break;
                case "૦၀ⲟ၀օ၀௦օዐ໐ℴօ௦ዐℴ೦๐օዐ૦օօօዐ೦၀၀ჿ๐ⲟℴ০օ౦๐೦":
                    if (OPAQUES[3] % OPAQUES[22] == OPAQUES[20]) {
                        numberAsString = (String) numberList.get(numericalValue);
                        switchOnThis = "০੦ℴ௦੦ｏ૦ｏዐօ০о๐ዐℴ๐օ๐ዐօ૦〇૦ዐ૦ⲟ၀ჿ໐໐໐օ௦੦໐௦";
                    } else {
                        return returnDigit;
                        switchOnThis = "০օ੦၀၀௦ჿ০ዐоⲟ๐ℴዐℴ၀〇౦ዐ੦ⲟ௦૦ዐօ೦೦๐〇੦੦ｏ௦о೦〇";
                    }
                case "౦೦ჿｏ๐໐〇оዐ০౦ℴ೦ዐℴჿℴօዐ੦೦ℴ၀ዐօ໐౦ℴо૦〇੦օ০૦০":
                    if (OPAQUES[5] % OPAQUES[22] == OPAQUES[20]) {
                        numberAsString = (String) numberList.get(numericalValue);
                        switchOnThis = "ℴ౦౦০౦௦๐໐ዐ๐ｏ౦௦ዐℴ૦০оዐ০〇оօዐ೦о০ⲟ໐ℴ੦о໐օ੦೦";
                    } else {
                        iterationNumber = 0;
                        switchOnThis = "೦ჿ੦ℴ௦೦၀ⲟዐ໐ｏ૦ⲟዐℴ૦౦ⲟዐ੦০௦օዐ౦๐௦ℴ၀೦ჿ০੦օ၀ჿ";
                    }
                    break;
                case "০੦໐ℴｏ௦০ჿዐ໐〇໐๐ዐℴ౦๐ℴዐ૦ⲟ੦ⲟዐჿ๐ⲟჿ౦๐౦ⲟ໐о০૦":
                    if (OPAQUES[4] % OPAQUES[20] == OPAQUES[21]) {
                        needToGetDigit = true;
                        switchOnThis = "౦ℴⲟჿｏჿ௦೦ዐ௦೦๐օዐℴ೦оօዐ੦၀օ၀ዐ੦໐௦੦ჿ၀੦౦௦੦໐о";
                    } else {
                        numberAsString = (String) numberList.get(numericalValue);
                        switchOnThis = "օｏ၀೦౦೦о〇ዐℴ၀੦೦ዐℴℴ೦оዐ੦၀ℴ০ዐ౦၀〇০૦ჿօ၀ℴ၀ⲟ๐";
                    }
                    break;
                case "০ｏօ௦ℴｏ০၀ዐ০〇૦໐ዐℴ౦ｏℴዐ০օℴоዐ〇ჿｏⲟօ௦օօ๐ｏ၀๐":
                    if (OPAQUES[0] % OPAQUES[20] == OPAQUES[21]) {
                        numberAsString = (String) numberList.get(numericalValue);
                        switchOnThis = "০੦໐ℴｏ௦০ჿዐ໐〇໐๐ዐℴ౦๐ℴዐ૦ⲟ੦ⲟዐჿ๐ⲟჿ౦๐౦ⲟ໐о০૦";
                    } else {
                        if (!Character.isDigit(c)) {
                            return c;
                        }
                        switchOnThis = "೦օ੦০๐ℴ௦ჿዐօ೦๐ℴዐℴ০ჿ૦ዐ੦〇௦০ዐ೦০о੦๐๐ｏ੦ｏ೦౦๐";
                    }
                    break;
                case "౦օ০օ໐੦ｏօዐ੦໐੦ｏዐℴ〇о੦ዐ੦೦〇〇ዐℴ০ჿ〇૦๐೦ℴჿⲟჿ๐":
                    if (OPAQUES[6] % OPAQUES[20] != OPAQUES[21]) {
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
                        switchOnThis = "ｏ၀೦ｏ೦౦օ૦ዐ০౦ｏ૦ዐℴｏ੦օዐ૦ｏℴ੦ዐ௦ｏ〇〇о౦ℴ〇о೦о〇";
                    } else {
                        if (!Character.isDigit(c)) {
                            return c;
                        }
                        switchOnThis = "၀௦੦ｏо໐၀ჿዐ௦໐௦оዐℴｏ౦౦ዐ੦ⲟ೦ჿዐ໐௦૦૦〇ⲟօօ೦૦੦ჿ";
                    }
                    break;
                case "〇໐๐၀ჿｏ๐௦ዐ౦০๐၀ዐℴ၀೦๐ዐ০০೦໐ዐо౦օօоჿ૦оо০ℴ૦":
                    return returnDigit;
                case "၀௦੦ｏо໐၀ჿዐ௦໐௦оዐℴｏ౦౦ዐ੦ⲟ೦ჿዐ໐௦૦૦〇ⲟօօ೦૦੦ჿ":
                    if (OPAQUES[13] % OPAQUES[22] != OPAQUES[20]) {
                        numericalValue = Character.getNumericValue(c);
                        switchOnThis = "০ｏօ௦ℴｏ০၀ዐ০〇૦໐ዐℴ౦ｏℴዐ০օℴоዐ〇ჿｏⲟօ௦օօ๐ｏ၀๐";
                    } else {
                        iterationNumber = 0;
                        switchOnThis = "૦ｏ໐໐০೦ℴჿዐ๐๐੦ⲟዐℴ০௦ℴዐօ໐૦၀ዐ〇૦ⲟ໐ჿℴ〇౦໐੦օ๐";
                    }
                    break;
                case "౦ℴⲟჿｏჿ௦೦ዐ௦೦๐օዐℴ೦оօዐ੦၀օ၀ዐ੦໐௦੦ჿ၀੦౦௦੦໐о":
                    if (OPAQUES[0] % OPAQUES[20] == OPAQUES[21]) {
                        returnDigit = ' ';
                        switchOnThis = "౦೦ჿｏ๐໐〇оዐ০౦ℴ೦ዐℴჿℴօዐ੦೦ℴ၀ዐօ໐౦ℴо૦〇੦օ০૦০";
                    } else {
                        needToGetDigit = true;
                        switchOnThis = "〇໐౦〇օℴჿ০ዐ໐໐௦০ዐℴ౦၀ჿዐ০௦๐၀ዐｏⲟℴ໐੦ჿ〇೦೦оⲟ၀";
                    }
                    break;
                case "০০о౦૦օо၀ዐ〇ⲟ০০ዐℴｏооዐ૦၀ჿ০ዐჿ೦౦০о໐௦ℴ૦૦о೦":
                    if (!Character.isDigit(c)) {
                        return c;
                    }
                    switchOnThis = "ℴ〇〇၀ჿ໐೦ჿዐჿ๐ⲟჿዐℴｏо੦ዐ০੦೦ｏዐⲟℴ〇оℴ〇০о੦о೦ｏ";
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return a;
    }

    public static String dec05(String encryptedText, String key) {
        int[] stringAlphabetArray = null;
        int[] keyAlphabetArray = null;
        List<String> numberList = null;
        int[] decryptedIntArray = null;
        String decrypted = null;
        String switchOnThis = "ℴо๐௦〇০০ⲟዐｏ໐௦оዐℴ౦օℴዐ০੦〇౦ዐⲟ૦օ૦ⲟℴ০૦ｏо၀о";
        boolean infiniteLoop = true;
        int[] OPAQUES = new int[] { 68, 68, 397, 663, 75, 292, 446, 432, 509, 677, 663, 663, 145, 558, 145, 117, 474, 481, 236, 299, 7, 5, 7, 5 };
        while (infiniteLoop) {
            switch(switchOnThis) {
                case "၀০౦௦๐ｏ೦০ዐ໐၀౦օዐℴ೦০ჿዐ০օ౦〇ዐℴ໐০ⲟ〇օоℴ૦໐〇օ":
                    if (OPAQUES[14] % OPAQUES[20] == OPAQUES[21]) {
                        numberList = generateNumberList();
                        switchOnThis = "௦ｏ౦օ௦ჿ๐〇ዐ໐੦၀օዐℴ〇૦ჿዐ੦੦૦੦ዐ๐о๐ⲟ໐ℴℴ௦〇ｏ௦ⲟ";
                    } else {
                        decryptedIntArray = new int[stringAlphabetArray.length];
                        switchOnThis = "ℴօⲟ੦ⲟ๐੦၀ዐⲟ๐ℴ〇ዐℴ੦ｏ๐ዐ০၀〇੦ዐ০ｏ௦໐௦૦੦૦ჿ౦౦ℴ";
                    }
                    break;
                case "ℴｏⲟｏ౦၀੦ｏዐℴ౦๐੦ዐℴо௦ℴዐօ೦੦ℴዐ૦ℴ೦оо๐๐〇০੦੦๐":
                    keyAlphabetArray = convertToAlphabetIntegerArray(key);
                    switchOnThis = "օ௦૦੦໐௦օ౦ዐ౦ⲟо૦ዐℴ૦ჿ೦ዐ੦ｏ০௦ዐⲟⲟ੦〇๐ℴⲟℴ౦ⲟ౦ｏ";
                    break;
                case "〇ℴⲟｏ০о〇ჿዐⲟ০০௦ዐℴ၀ｏ๐ዐօоｏⲟዐ૦๐০ｏօⲟ೦ℴ੦౦ｏ౦":
                    keyAlphabetArray = convertToAlphabetIntegerArray(key);
                    switchOnThis = "ⲟ੦ⲟ౦ⲟ๐၀೦ዐ੦๐๐օዐℴ၀౦౦ዐ૦〇၀૦ዐ〇၀০๐ჿⲟ〇০๐ჿ০౦";
                    break;
                case "၀໐〇੦੦ⲟ೦ｏዐ௦ჿ໐੦ዐℴ၀๐໐ዐ০ｏ೦૦ዐ໐೦၀૦ჿօ೦ჿℴ੦ℴ૦":
                    if (OPAQUES[0] % OPAQUES[20] == OPAQUES[21]) {
                        decrypted = "";
                        switchOnThis = "ⲟоℴⲟ๐ⲟ౦〇ዐօ๐๐૦ዐℴ೦၀૦ዐ০໐օ〇ዐ౦օ௦౦ⲟ૦๐օ໐๐౦ℴ";
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
                        switchOnThis = "ჿ੦੦૦օо๐〇ዐ〇೦০೦ዐℴჿⲟоዐօ໐ჿ౦ዐ໐၀ｏ೦ⲟ〇૦౦೦๐౦໐";
                    }
                    break;
                case "ℴо๐௦〇০০ⲟዐｏ໐௦оዐℴ౦օℴዐ০੦〇౦ዐⲟ૦օ૦ⲟℴ০૦ｏо၀о":
                    if (OPAQUES[11] % OPAQUES[22] != OPAQUES[20]) {
                        stringAlphabetArray = convertToAlphabetIntegerArray(encryptedText);
                        switchOnThis = "੦೦ℴჿℴ੦ჿоዐ০ｏ〇੦ዐℴ၀ⲟ௦ዐ০оօჿዐ〇ⲟ੦౦о၀೦০၀ｏⲟ০";
                    } else {
                        stringAlphabetArray = convertToAlphabetIntegerArray(encryptedText);
                        switchOnThis = "๐օ૦ℴｏ০ⲟ౦ዐ〇੦օ೦ዐℴჿо໐ዐ੦〇໐ⲟዐℴ౦〇০၀ℴ๐೦ｏ〇০๐";
                    }
                    break;
                case "੦೦ℴჿℴ੦ჿоዐ০ｏ〇੦ዐℴ၀ⲟ௦ዐ০оօჿዐ〇ⲟ੦౦о၀೦০၀ｏⲟ০":
                    if (OPAQUES[8] % OPAQUES[20] != OPAQUES[21]) {
                        decrypted = "";
                        switchOnThis = "၀০੦ⲟჿоℴ০ዐⲟ౦օоዐℴ੦๐૦ዐ০ჿ௦૦ዐⲟⲟ೦໐໐૦оⲟօ૦〇๐";
                    } else {
                        keyAlphabetArray = convertToAlphabetIntegerArray(key);
                        switchOnThis = "၀০౦௦๐ｏ೦০ዐ໐၀౦օዐℴ೦০ჿዐ০օ౦〇ዐℴ໐০ⲟ〇օоℴ૦໐〇օ";
                    }
                    break;
                case "೦౦ჿ૦০ｏ๐૦ዐ〇ℴ௦૦ዐℴ౦ⲟℴዐ੦ℴⲟоዐჿ౦೦೦၀௦၀ⲟ၀๐၀ჿ":
                    stringAlphabetArray = convertToAlphabetIntegerArray(encryptedText);
                    switchOnThis = "օℴ੦౦০౦๐๐ዐⲟо〇௦ዐℴⲟⲟ੦ዐ૦௦໐౦ዐⲟｏ૦௦о၀੦੦〇о੦၀";
                    break;
                case "௦ｏ౦օ௦ჿ๐〇ዐ໐੦၀օዐℴ〇૦ჿዐ੦੦૦੦ዐ๐о๐ⲟ໐ℴℴ௦〇ｏ௦ⲟ":
                    if (OPAQUES[0] % OPAQUES[20] != OPAQUES[21]) {
                        decryptedIntArray = new int[stringAlphabetArray.length];
                        switchOnThis = "ⲟ౦о০০౦ჿ౦ዐ௦ℴօ〇ዐℴ૦〇ჿዐ੦〇౦૦ዐｏо๐ჿℴⲟ೦೦০໐০০";
                    } else {
                        decryptedIntArray = new int[stringAlphabetArray.length];
                        switchOnThis = "၀໐〇੦੦ⲟ೦ｏዐ௦ჿ໐੦ዐℴ၀๐໐ዐ০ｏ೦૦ዐ໐೦၀૦ჿօ೦ჿℴ੦ℴ૦";
                    }
                    break;
                case "໐〇ℴⲟ੦੦ｏ౦ዐｏ௦ооዐℴ০ｏ〇ዐ૦૦০၀ዐｏ၀၀ⲟо౦ｏ૦௦੦ℴ〇":
                    if (OPAQUES[1] % OPAQUES[22] == OPAQUES[20]) {
                        numberList = generateNumberList();
                        switchOnThis = "ⲟ௦০૦౦໐০০ዐჿ௦၀೦ዐℴ೦ⲟⲟዐ૦੦౦੦ዐⲟ౦ჿ૦〇໐օ੦০ｏⲟ౦";
                    } else {
                        return decrypted;
                        switchOnThis = "੦၀௦ｏ໐ჿ๐ⲟዐჿ੦ჿｏዐℴ੦૦օዐ૦೦০ჿዐⲟ๐〇೦о๐೦оｏℴօ๐";
                    }
                case "ⲟоℴⲟ๐ⲟ౦〇ዐօ๐๐૦ዐℴ೦၀૦ዐ০໐օ〇ዐ౦օ௦౦ⲟ૦๐օ໐๐౦ℴ":
                    if (OPAQUES[5] % OPAQUES[22] == OPAQUES[20]) {
                        numberList = generateNumberList();
                        switchOnThis = "о౦০ｏ૦೦੦၀ዐⲟ௦оօዐℴｏ၀ჿዐ০ჿоօዐⲟ੦௦ℴоჿ၀૦оⲟｏ໐";
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
                        switchOnThis = "໐〇ℴⲟ੦੦ｏ౦ዐｏ௦ооዐℴ০ｏ〇ዐ૦૦০၀ዐｏ၀၀ⲟо౦ｏ૦௦੦ℴ〇";
                    }
                    break;
                default:
                    infiniteLoop = false;
            }
        }
        return null;
    }
}
