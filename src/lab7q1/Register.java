package lab7q1;

public class Register {

    private static boolean isNegated = false;
    private String displayText = "0";
    private int displayDigitsMax = 18;
    public static Register myRegister = new Register();

    public Register(){

    }

    public void clearDisplay(){
        displayText = "0";
        System.out.println(displayText);
        if(isNegated)
            negate();
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
            System.out.println(displayText);
        }
        else {
            displayText = displayText.substring(1);
            isNegated = false;
            System.out.println(displayText);
        }
    }

    public void setDisplayDigitsMax(int dMax){
        displayDigitsMax = dMax;
    }

    public void addDigit(int k){
        if(displayText.equals("0"))
            displayText = "";
        displayText += k;
        if (displayText.equals("00"))
            displayText = "0";
        if(displayText.equals("-00"))
            displayText = "-0";
        System.out.println(displayText);
        View.myFrame.repaint();
    }

    public void addDigit(char k){
        displayText += k;
        if (displayText.equals("00"))
            displayText = "0";
        if(displayText.equals("-00"))
            displayText = "-0";
    }


}
