package checkpoints;

import java.util.ArrayList;
import java.util.Date;

public class checkpoints {
    public static void main(String[] args) {
        ArrayList<Date> dates = new ArrayList<>();

        dates.add(new Date());
        // dates.add(new String()); 
        // Won't work because dates 
        // is declared as a list of Date objects. I cannot 
        // assign a string to the list.
    }
}