package util.moviles;

import drivers.AppiumDriver;
import excepions.LetraNoEncontradaException;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class UtilidadesMoviles {

    public static void pressKeyInAndroid(String string){

        switch(string) {
            case "a":
            case "A":
                System.out.println("A");
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.A));
                break;
            case "b":
            case "B":
                System.out.println("b");
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.B));
                break;
            case "c":
            case "C":
                System.out.println("c");
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.C));
                break;
            case "d":
            case "D":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.D));
                break;
            case "e":
            case "E":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.E));
                break;
            case "f":
            case "F":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.F));
                break;
            case "g":
            case "G":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.G));
                break;
            case "h":
            case "H":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.H));
                break;
            case "i":
            case "I":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.I));
                break;
            case "j":
            case "J":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.J));
                break;
            case "k":
            case "K":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.K));
                break;
            case "l":
            case "L":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.L));
                break;
            case "m":
            case "M":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.M));
                break;
            case "n":
            case "N":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.N));
                break;
            case "o":
            case "O":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.O));
                break;
            case "p":
            case "P":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.P));
                break;
            case "q":
            case "Q":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.Q));
                break;
            case "r":
            case "R":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.R));
                break;
            case "s":
            case "S":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.S));
                break;
            case "t":
            case "T":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.T));
                break;
            case "u":
            case "U":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.U));
                break;
            case "v":
            case "V":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.V));
                break;
            case "w":
            case "W":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.W));
                break;
            case "x":
            case "X":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.X));
                break;
            case "y":
            case "Y":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.Y));
                break;
            case "z":
            case "Z":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.Z));
                break;
            case "0":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_0));
                break;
            case "1":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_1));
                break;
            case "2":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_2));
                break;
            case "3":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_3));
                break;
            case "4":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_4));
                break;
            case "5":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_5));
                break;
            case "6":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_6));
                break;
            case "7":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_7));
                break;
            case "8":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_8));
                break;
            case "9":
                AppiumDriver.driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_9));
                break;
            default:
                throw new LetraNoEncontradaException();
        }
    }

}
