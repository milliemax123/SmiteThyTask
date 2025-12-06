/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package settings;

/*
 * classname: ThemeManagerI.java
 * @amelia maxwell
 * x23471092
 */

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * Simple theme helper for the app.
 */
public class ThemeManager {
    // how fast the colours change in the ludicrous theme here its per 150 mili sec or 7 times per sec
    private static final int ludicrous_delay = 150;

    // timer + state for the flashing effect
    private static Timer ludicrousTimer;
    private static int ludicrousIndex = 0;
    private static JFrame ludicrousFrame;  // this lets the theme follow the user between sections, i did this so i didnt have to put timers and color arrays in every gui, its called by the constructor in each class to let this know which jframe it is

    private static final Color[] ludicrousColors = new Color[] {
        Color.magenta,
        Color.pink,
        Color.red,
        Color.orange,
        Color.yellow,
        Color.green,
        Color.cyan,
        Color.blue
    };

    // Applies the selected theme to the frame
    public static void applyTheme(JFrame frame, SnarkPack pack) {
        if (pack == null) {
            stopLudicrous();
            return;
        }

        String theme = pack.getTheme();

        if (theme.equals("Dark")) {
            frame.getContentPane().setBackground(Color.darkGray);
            frame.getContentPane().setForeground(Color.white);
            stopLudicrous(); // no color changing stuff
        } 
        else if (theme.equals("Light")) {
            frame.getContentPane().setBackground(Color.lightGray);
            frame.getContentPane().setForeground(Color.white);//this gave trouble as i kept writing grey with an e haha
            stopLudicrous(); // no flashing
        } 
        else if (theme.equals("Ludicrous")) {
            // start flashing bright chaotic colours
            startLudicrous(frame);
        } 
        else {
            // no changes
            stopLudicrous();
        }
    }

    // ===== Start flashing colours =====
    private static void startLudicrous(JFrame frame) {
        ludicrousFrame = frame;

        if (ludicrousTimer == null) {
            ludicrousTimer = new Timer(150, e -> {
                if (ludicrousFrame == null) return;

                ludicrousFrame.getContentPane().setBackground(
                        ludicrousColors[ludicrousIndex]
                );

                ludicrousIndex++;
                if (ludicrousIndex >= ludicrousColors.length) {
                    ludicrousIndex = 0;
                }
            });
        }

        ludicrousTimer.start();
    }

    // ===== Stop flashing =====
    private static void stopLudicrous() {
        if (ludicrousTimer != null) {
            ludicrousTimer.stop();
        }
        ludicrousIndex = 0;
        ludicrousFrame = null;
    }
}

/*
I USED SOURCES, HERE THEY ARE

// used jaxax swing timer for repeatedly upadating the colour on a timer per 150 milli sec or 7 times per sec
https://examples.javacodegeeks.com/java-development/desktop-java/swing/timer-swing/java-swing-timer-example/
*/