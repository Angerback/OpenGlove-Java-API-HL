/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_test;

import OpenGlove.OpenGloveAPI;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        //test_one();
        test_many(4);
    }
    
    private static void test_many(int n) throws InterruptedException{
        OpenGloveAPI api = OpenGloveAPI.GetInstance();
        List<Glove> gloves = api.getDevices();
        
        List<Integer> regions = new ArrayList<>();
        List<Integer> upInit = new ArrayList<>();
        List<Integer> downInit = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            regions.add(i);
            upInit.add(255);
            downInit.add(0);
        }
        
        regions.add(OpenGloveAPI.HandRegion.PalmarFingerThumbDistal.getValue());
        upInit.add(255);
        downInit.add(0);
        
        for (Glove glove : gloves) {
            System.out.println("GLOVE: " + glove.getName().getValue() + " | " + glove.getPort().getValue() + " | " + glove.getBluetoothAddress().getValue());
            if (glove.isConnected()) {
                FileWriter fw = null;
                try {
                    fw = new FileWriter("C:\\Users\\Sebastian\\Documents\\Tesis\\pruebas\\JAVA-API.txt");

                    for (int i = 0; i < 1000; i++) {
                        long lStartTime = System.nanoTime() / 1000;
                        api.Activate(glove, regions, upInit);
                        long lEndTime = System.nanoTime() / 1000;

                        long difference = lEndTime - lStartTime;
                        fw.append("" + difference + "\r\n");
                        System.out.println("Test pass: UP " + i);

                        Thread.sleep(250l);

                        lStartTime = System.nanoTime() / 1000;
                        api.Activate(glove, regions, downInit);
                        lEndTime = System.nanoTime() / 1000;

                        difference = lEndTime - lStartTime;
                        fw.append("" + difference + "\r\n");
                        System.out.println("Test pass: DOWN " + i);
                        Thread.sleep(250l);
                    }
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(OpenGloveServiceTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
        }
    }
    
    private static void test_one() throws InterruptedException{
        // TODO code application logic here
        OpenGloveAPI api = OpenGloveAPI.GetInstance();
        List<Glove> gloves = api.getDevices();

        for (Glove glove : gloves) {
            System.out.println("GLOVE: " + glove.getName().getValue() + " | " + glove.getPort().getValue() + " | " + glove.getBluetoothAddress().getValue());
            if (glove.isConnected()) {
                FileWriter fw = null;
                try {
                    fw = new FileWriter("C:\\Users\\Sebastian\\Documents\\Tesis\\pruebas\\JAVA-API.txt");
                    
                    for (int i = 0; i < 1000; i++) {
                        long lStartTime = System.nanoTime() / 1000;
                        api.Activate(glove, OpenGloveAPI.HandRegion.PalmarFingerIndexDistal.getValue(), 255);
                        long lEndTime = System.nanoTime() / 1000;

                        long difference = lEndTime - lStartTime;
                        fw.append("" + difference + "\r\n");
                        System.out.println("Test pass: UP " + i);

                        Thread.sleep(250l);

                        lStartTime = System.nanoTime() / 1000;
                        api.Activate(glove, OpenGloveAPI.HandRegion.PalmarFingerIndexDistal.getValue(), 0);
                        lEndTime = System.nanoTime() / 1000;

                        difference = lEndTime - lStartTime;
                        fw.append("" + difference + "\r\n");
                        System.out.println("Test pass: DOWN " + i);
                        Thread.sleep(250l);
                    }
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(OpenGloveServiceTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
        }
    }
    
    private void test_intensity() throws InterruptedException{
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
