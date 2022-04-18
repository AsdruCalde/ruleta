package exam1;


/**
 * Write a description of class otraruleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class otraruleta

{
    public static int otra(double a, double b, double primeraapuesta){
        if(a<b){
            return 0;
        }
        else{
            
            return 1+ otra(a-b,b*2+primeraapuesta,primeraapuesta);
        }
    }

}
