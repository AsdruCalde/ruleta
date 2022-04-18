package exam1;


/**
 * Write a description of class probabilidadruleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class probabilidadruleta
{
  public static double proba (double a, double b){
      if (a==0){
          return 0;
      }else{
          return Math.pow(a,b)*100;
      }
  }
}
