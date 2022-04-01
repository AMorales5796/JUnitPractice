import java.util.ArrayList;
import java.util.*;
public class Hiker {

    public static ArrayList<Integer> answer(int input) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        //output.add(0);
        
        if (input < 3 && input >=1)
        {
            output.add(input);
        }

        if (input < 1)
        {
          output.add(0);
        }//In the tests, expected answer is 0
        
        for(int i = 2; i<input; i++) 
        {
            while(input%i == 0) 
            {
                output.add(i);
                input = input/i;
            }
        }
        
        if(input > 2) 
        {
            output.add(input);
        }
        /*
        while (divisor != quotient && dividen != 1)
        {
            if (remainder == 0)
            {
                output.add(divisor);
                dividen = quotient;
            }
            else if(remainder == 1)
            {
                divisor++;
            }
        }
        output.add(dividen);
        
        if (divisor == quotient && dividen == 1 && remainder == 0)
        {
            output.add(dividen);
        }
        */
        return output;
    }
}
