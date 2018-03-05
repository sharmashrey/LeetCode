/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
import java.*;

/**
 *
 * @author shreyas
 */
public class judgeCircle {
 
     public boolean judgeCircle(String moves) {
         
        Stack<Character> stackR = new Stack<Character>();
        Stack<Character> stackU = new Stack<Character>();
        
        for(char content : moves.toCharArray()){
            if(content == 'R')
                        stackR.push(content);  
            else if(content == 'U')
                        stackU.push(content);               
            else if(content == 'L')
                        if(!stackR.empty())stackR.pop();  
            else if(content == 'D')
                        if(!stackU.empty())stackU.pop();          
        }
      if(stackR.empty() && stackU.empty()) return true;  
     return false;   
    }
    
    
    
    
}
