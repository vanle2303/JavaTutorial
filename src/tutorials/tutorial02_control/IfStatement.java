package tutorials.tutorial02_control;

/**
 * if-else-if ladder example
 * if statement1;
 * else if statement2;
 * else if statement3;
 * example of which season a particular month is in?
 */
public class IfStatement {
    public static void main(String[] args) {

        int month = 3;
        String season;
        if (month==1 || month==2 || month==3){
            season = "spring";
        }
        else if (month==4 || month==5 || month==6) {
            season = "summer";
        } else if (month==7 || month==8|| month==9) {
            season = "fall";
        } else {
            season = "winter";
        }
        System.out.println("March is in the " + season);
    }
}
