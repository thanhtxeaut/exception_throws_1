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
public class Exception_throws_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        float score = 1;
        try{
            // intance
            Input_Score a = new Input_Score();
            a.check_input(score);
        }catch(TooScore | missingScore e){
            System.out.print(e.getMessage());
            
        }
        
    }
    
}
