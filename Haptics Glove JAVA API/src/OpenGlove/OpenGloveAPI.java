/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenGlove;


import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring;
import java.util.HashMap;
import java.util.List;
import javafx.animation.KeyValue;
import org.datacontract.schemas._2004._07.openglovewcf.Glove;
import org.tempuri.IOGService;
import org.tempuri.OGService;

/**
 *
 * @author Sebastian
 */
public class OpenGloveAPI {

    private static OpenGloveAPI instance;

    private IOGService serviceClient;

    OpenGloveAPI() {
        serviceClient = new OGService().getBasicHttpBindingIOGService();
    }

    public static OpenGloveAPI GetInstance() {
        if (instance == null) {
            instance = new OpenGloveAPI();
        }
        return instance;
    }

    private List<Glove> devices;

    public List<Glove> getDevices() {
        devices = serviceClient.getGloves().getGlove();
        return devices;
    }

    public void Activate(Glove selectedGlove, Integer region, Integer intensity) {
        int actuator = -1;
        List<KeyValueOfstringstring> mappings = selectedGlove.getGloveConfiguration().getValue().getGloveProfile().getValue().getMappings().getValue().getKeyValueOfstringstring();
        for (KeyValueOfstringstring item : mappings) {
            if (item.getKey().equals(region.toString())) {
                actuator = Integer.parseInt(item.getValue());
                break;
            }
        }
        if (actuator == -1) {
            return;
        }
        this.serviceClient.activate(selectedGlove.getBluetoothAddress().getValue(), actuator, intensity);
    }

    public enum HandRegion {
        PalmarFingerSmallDistal(0),
        PalmarFingerRingDistal(1),
        PalmarFingerMiddleDistal(2),
        PalmarFingerIndexDistal(3),
        PalmarFingerSmallMiddle(4),
        PalmarFingerRingMiddle(5),
        PalmarFingerMiddleMiddle(6),
        PalmarFingerIndexMiddle(7),
        PalmarFingerSmallProximal(8),
        PalmarFingerRingProximal(9),
        PalmarFingerMiddleProximal(10),
        PalmarFingerIndexProximal(11),
        PalmarPalmSmallDistal(12),
        PalmarPalmRingDistal(13),
        PalmarPalmMiddleDistal(14),
        PalmarPalmIndexDistal(15),
        PalmarPalmSmallProximal(16),
        PalmarPalmRingProximal(17),
        PalmarPalmMiddleProximal(18),
        PalmarPalmIndexProximal(19),
        PalmarHypoThenarSmall(20),
        PalmarHypoThenarRing(21),
        PalmarThenarMiddle(22),
        PalmarThenarIndex(23),
        PalmarFingerThumbProximal(24),
        PalmarFingerThumbDistal(25),
        PalmarHypoThenarDistal(26),
        PalmarThenar(27),
        PalmarHypoThenarProximal(28),
        DorsalFingerSmallDistal(29),
        DorsalFingerRingDistal(30),
        DorsalFingerMiddleDistal(31),
        DorsalFingerIndexDistal(32),
        DorsalFingerSmallMiddle(33),
        DorsalFingerRingMiddle(34),
        DorsalFingerMiddleMiddle(35),
        DorsalFingerIndexMiddle(36),
        DorsalFingerSmallProximal(37),
        DorsalFingerRingProximal(38),
        DorsalFingerMiddleProximal(39),
        DorsalFingerIndexProximal(40),
        DorsalPalmSmallDistal(41),
        DorsalPalmRingDistal(42),
        DorsalPalmMiddleDistal(43),
        DorsalPalmIndexDistal(44),
        DorsalPalmSmallProximal(45),
        DorsalPalmRingProximal(46),
        DorsalPalmMiddleProximal(47),
        DorsalPalmIndexProximal(48),
        DorsalHypoThenarSmall(49),
        DorsalHypoThenarRing(50),
        DorsalThenarMiddle(51),
        DorsalThenarIndex(52),
        DorsalFingerThumbProximal(53),
        DorsalFingerThumbDistal(54),
        DorsalHypoThenarDistal(55),
        DorsalThenar(56),
        DorsalHypoThenarProximal(57);
        
        private int  _value;
        
        public int getValue() {
            return _value;
        }
        
        HandRegion(int Value) {
        this._value = Value;
        }       
    }
}
