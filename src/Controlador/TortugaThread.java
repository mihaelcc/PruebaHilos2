
package Controlador;
import Principal.FrmGestionarHilos;
public class TortugaThread extends Thread
{
    FrmGestionarHilos  obj;
    
    public  TortugaThread(FrmGestionarHilos  obj)
    {   this.obj=obj;
    }    
    public  void   run()
    {   int  i=1;
        try
        {   //System.out.println("Comienza tortuga!!!!!");
         obj.txtArea.append("Comienza tortuga !!!\n");
            while(i<=5)
            {   obj.txtArea.append("Paso :"+i+" Tortuga !!!!\n");
                Thread.sleep(5000);
                
                i++;
            }
           obj.txtArea.append("\nTermina la Tortuga!!!!!"); 
        } catch (Exception e) 
        {
        }        
    }
  
    
}
