package exam1;


/**
 * Write a description of class ruletra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ruletra
{
    public static int ruleta(double a, double b){
        if(a<b){
            return 0;
        }
        else{
            
            return 1+ ruleta(a-b,b*2);
        }
    }
}
