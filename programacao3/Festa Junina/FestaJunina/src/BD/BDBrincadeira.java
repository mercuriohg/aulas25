/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Brincadeira;

/**
 *
 * @author alunos
 */
public class BDBrincadeira {
    
    public static void salvarBanco(ArrayList<Brincadeira> dados){
        try{
          FileOutputStream fs= new FileOutputStream("DadosBrincadeiras.ag");
          ObjectOutputStream oos = new ObjectOutputStream(fs);
          oos.writeObject(dados);
          oos.close();
        }catch(Exception e){
            
        }
    }
        public static ArrayList<Brincadeira> carregarBanco(){
            ArrayList<Brincadeira> brincadeiras = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream("DadosBrincadeiras.ag");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();
            brincadeiras = (ArrayList<Brincadeira>) ob;
            ois.close();
        }catch(Exception e){
            
        }
        return brincadeiras;
        }
    }


