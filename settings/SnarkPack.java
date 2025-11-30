/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * class name:  SnarkPack.java 
 * rev : 5 
 * date : 1/11/25
 * @amelia maxwell
 *  x23471092
 */

package settings;

import settings.ShakespearePack;
import settings.PiratePack;
import settings.Wizardpack;

public class SnarkPack {
    private String style;
    private String level;
    private String username;


    public SnarkPack() { //constructer for when app first runs ie no setting chosen
        style = "";
        level = "";
        username = "";
    }

    public SnarkPack(String style, String level, String username) { //
        this.style = style;
        this.level = level;
        this.username = username;
    }

    // gets praise based on styel and level
                public String getPraise() {
                    if (level.equalsIgnoreCase("Off")) {///combo boses for this option are in string added ignore case to avoid any issues
                        return "";//returns npothing if user has it off
                    }if (style.equals("Pirate")) {
                        PiratePack p = new PiratePack();//this makes an instance of pirate pack so now p has all the pirates snark logic
                        return p.getPraise(level);//gets the pirate style praise message with the right level
                    }
             if (style.equals("Shakespearean")) {
                        ShakespearePack s = new ShakespearePack();
                        return s.getPraise(level);
                    }

                    if (style.equals("Wizard")) {
                        Wizardpack w = new Wizardpack();
                        return w.getPraise(level);
                    }

                    // added if no style matched not going to happen with a combo box of set options but its a fallback that soothes me
                    return "Good job " + username ;
                }

//gets scold using the same logic as the getPraise method
            public String getScold() {
            if (level.equalsIgnoreCase("Off")) {
                return "";
            }

            if (style.equals("Pirate")) {
                PiratePack p = new PiratePack();
                return p.getScold(level);
            }

            if (style.equals("Shakespearean")) {
                ShakespearePack s = new ShakespearePack();
                return s.getScold(level);
            }

            if (style.equals("Wizard")) {
                Wizardpack w = new Wizardpack();
                return w.getScold(level);
            }

            // my nervous precaution
            return "Try again, " + username + ".";
        }

   
}

/*
The purpose of this file is to remember the users settings like snark levl, style, and name
it uses polymorphismm to get the right snark pack when programme runs 
and encapsulation to keep the users preferences in one object 
the strateddy pattern basically lets each style have their own class with its own messages and behaviour
*/