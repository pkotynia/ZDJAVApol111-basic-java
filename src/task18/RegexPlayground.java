package task18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPlayground {

    public static void main(String[] args) {

//        Match: can man fan
//        Skip: dan ran pan
        String[] matchingInput = {"can", "man", "fan"};
        String[] skippedInput = {"dan", "ran", "pan"};
        String regex = "[cmf]an";

        System.out.println("result = " + matchForPositiveAndNegativeScenarios(matchingInput, skippedInput, regex));

//        Match	wazzzzzup wazzzup
//        Skip	wazup
        String[] wazupInputs = {"wazzzzzup", "wazzzup"};
        String[] wazupSkippedInputs = {"wazup"};
        String wazupRegex = "waz{2,5}up";
        System.out.println("Result = " + matchForPositiveAndNegativeScenarios(wazupInputs, wazupSkippedInputs, wazupRegex));

//        Match 1 file found, 2 files found, 24 files found
//        Skip	No files found.
        System.out.println("result = " + matchForPositiveAndNegativeScenarios(
                new String[]{"1 file found", "2 files found", "24 files found"},
                new String[]{"No files found"},
                "\\d files? found"));

    }

    private static boolean matchForPositiveAndNegativeScenarios(String[] matchingInput, String[] skippedInput, String regex) {
        return checkForMatches(matchingInput, regex) && checkForSkips(skippedInput, regex);
    }

    private static boolean checkForSkips(String[] skippedInput, String regex) {
        for (String item : skippedInput) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(item);
            if (!matcher.find()) {
                System.out.println("Skipping input " + item + " with regex " + regex);
            } else {
                System.out.println("Fail to skipp input " + item + " with regex " + regex);
                return false;
            }
        }
        return true;
    }

    private static boolean checkForMatches(String[] matchingInput, String regex) {
        for (String item : matchingInput) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(item);
            if (matcher.find()) {
                System.out.println("Match found for string " + item + " with regex " + regex);
            } else {
                System.out.println("Match NOT foud for string " + item + " with regex " + regex);
                return false;
            }
        }
        return true;
    }
}
