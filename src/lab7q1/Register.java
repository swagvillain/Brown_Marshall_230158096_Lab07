package lab7q1;

public class Register {

    private static boolean isNegated = false;
    private String displayText;
    private int displayDigitsMax;

    public Register(){

    }

    public static boolean isNegated(){
        return isNegated;
    };

    public int getDisplayDigitsMax(){
        return displayDigitsMax;
    }

    public String getDisplayText(){
        return displayText;
    }

    public void negate(){
        if (!isNegated) {
            displayText = "-" + displayText;
            isNegated = true;
        }
        else {
            displayText = displayText.substring(1);
            isNegated = false;
        }
    }

    public void setDisplayDigitsMax(int dMax){
        displayDigitsMax = dMax;
    }

    public void addDigit(int k){
        displayText += k;
        if (displayText.equals("00"))
            displayText = "0";
        if(displayText.equals("-00"))
            displayText = "-0";
    }

    public void addDigit(char k){
        displayText += k;
        if (displayText.equals("00"))
            displayText = "0";
        if(displayText.equals("-00"))
            displayText = "-0";
    }


}
