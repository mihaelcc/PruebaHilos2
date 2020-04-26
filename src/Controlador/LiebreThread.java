
package Controlador;
import  Principal.FrmGestionarHilos;
public class LiebreThread extends Thread
{  FrmGestionarHilos  obj;
   
    public  LiebreThread( FrmGestionarHilos  obj)
    {
        this.obj=obj;
    }
    @Override
    public void run() 
    {  int  i=1;
        try 
        {  System.out.println("Comienza la Liebre !!!!");
           while(i<=5)
           { 
               Thread.sleep(2000);
               System.out.println("Paso : "+i+" Liebre !!!");            
               i++;
           }   
           System.out.println("Termina la Liebre !!!!");
        } catch (Exception e) 
        {
        }
    }    
}
