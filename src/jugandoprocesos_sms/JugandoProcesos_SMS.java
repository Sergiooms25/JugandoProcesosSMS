/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugandoprocesos_sms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author sergi
 */
public class JugandoProcesos_SMS {

   
    public static void main(String[] args) throws IOException {
      
        JugandoProcesos_SMS a=new JugandoProcesos_SMS();
        a.ejecutaDir();
        
        }
        
        
        
    
    
    private void ejecutaDir() throws IOException{
        
        Process p= Runtime.getRuntime().exec("tasklist.exe");
        
        InputStream is=p.getInputStream();
        
        BufferedReader br = new BufferedReader (new InputStreamReader(is));
        
        String aux = br.readLine();
        
        while (aux !=null){
            System.out.println(aux);
            aux= br.readLine();
    }
    
}
}

