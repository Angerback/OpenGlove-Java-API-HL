/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_test;

import OpenGlove.OpenGloveAPI;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
import java.util.List;
import org.datacontract.schemas._2004._07.openglovewcf.Glove;


/**
 *
 * @author Sebastian
 */
public class OpenGloveServiceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        OpenGloveAPI api = OpenGloveAPI.GetInstance();
        List<Glove> gloves = api.getDevices();

        for (Glove glove : gloves) {
            System.out.println("GLOVE: " + glove.getName().getValue() + " | " + glove.getPort().getValue() + " | " + glove.getBluetoothAddress().getValue());
            if (glove.isConnected()) {
                List<ArrayOfKeyValueOfstringstring.KeyValueOfstringstring> mappings = glove.getGloveConfiguration().getValue().getGloveProfile().getValue().getMappings().getValue().getKeyValueOfstringstring();
                for (int i = 0; i < 256; i++) {
                    for (ArrayOfKeyValueOfstringstring.KeyValueOfstringstring item : mappings) {
                        System.out.println("" + i);
                        api.Activate(glove, Integer.parseInt(item.getKey()), i);  
                    }
                    Thread.sleep(200);
                }
                
                for (ArrayOfKeyValueOfstringstring.KeyValueOfstringstring item : mappings) {
                    api.Activate(glove, Integer.parseInt(item.getKey()), 0);  
                }
            }
        }
    }

}
