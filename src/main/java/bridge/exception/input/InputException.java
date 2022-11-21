package bridge.exception.input;

public class InputException {
    private static final String NUMERIC_PATTERN="\\d+";
    private static final int UNDER_RANGE=3;
    private static final int OVER_RANGE=20;
    private static final String MOVING_INPUT_PATTERN="^[UD]$";
    private static final String GAME_COMMAND_INPUT_PATTERN="^[RQ]$";

    private static final String BLANK="";

    private static boolean isNotProperInput(String userInput, String pattern){
        return !userInput.replaceAll(pattern, BLANK).equals(BLANK);
    }

    public static void validateProperBridgeLength(String userInput){
        if(isNotProperInput(userInput, NUMERIC_PATTERN)){
            throw new IllegalArgumentException("not proper letter");
        }
    }
    private static boolean isProperNumbers(String userInput){
        int bridgeLength = Integer.parseInt(userInput);
        return (bridgeLength<UNDER_RANGE || bridgeLength>OVER_RANGE);
    }

    public static void validateProperNumbersRange(String userInput){
        if(isProperNumbers(userInput)){
            throw new IllegalArgumentException("not proper range");
        }
    }
}
