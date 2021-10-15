/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_throws_1;

/**
 *
 * @author Thanh Tran
 */
public class Input_Score{
    
    // check 
    public void check_input(float score)  throws TooScore, missingScore{
        if (score <0)
            throw new missingScore("Warning! Score <0 ");
       if (score>10)
            throw new TooScore("Warning! Score >10");
           
    }
}
