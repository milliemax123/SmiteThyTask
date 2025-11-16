/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * classname: PiratePack.java
 * rev : 3
 * date : 29/10/25
 * @amelia maxwell
 *  x23471092
 */
package settings;


import java.util.Random;

public class PiratePack {

    private Random rand = new Random();

    public String getPraise(String level) {
        String[] mild = {
            "Arrr, fine work matey!",
            "Aye, ye’ve done well, sailor!",
            "Ah, you could make a fine captain one day, task be conquered!"
              
        };
        String[] medium = {
            "By the seven seas, ye did it!",
            "Ye’ve proven yer worth, seadog!",
            "The captain Ciara be proud o’ ye!"
        };
        String[] spicy = {
            "Arrr, ye slacker finally did it!",
            "Jeepers! Took ye long enough, ye big barnacle brained seagull!",
            "About time ye finished, sailed the sea's faster than this i have!",
            "who says ye cant teach an auld seadog new tricks, like productivity!"
        };

        return pick(level, mild, medium, spicy);
    }

    public String getScold(String level) {
        String[] mild = {
            "Avast, ye forgot again!",
            "Ye best be quicker next tide!",
            "Don’t drift off now, sailor! Amelia already fell alseep behind the helm!!"
        };
        String[] medium = {
            "Slackin’ off, are ye? Wait till Ciara gets ahold of ye.",
            "The crew be waitin’ on ye, lad!",
            "Ye better get on that deck soon! Blessons waiting for ye!"
        };
        String[] spicy = {
            "Ye barnacle-brained layabout!",
            "I oughta toss ye overboard!",
            "Don't make me walk ye off the plank, lad!",
            "Lazy scallywag, get to it!"
        };

        return pick(level, mild, medium, spicy);
    }

    private String pick(String level, String[] mild, String[] medium, String[] spicy) {
        if (level.equalsIgnoreCase("Mild")) return mild[rand.nextInt(mild.length)];
        if (level.equalsIgnoreCase("Medium")) return medium[rand.nextInt(medium.length)];
        if (level.equalsIgnoreCase("Spicy")) return spicy[rand.nextInt(spicy.length)];
        return "";
    }
}

