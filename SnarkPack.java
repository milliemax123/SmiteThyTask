/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * classname:  SnarkPack.java 
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

    // very direct methods
    public String getPraise() {
        if (level.equalsIgnoreCase("Off")) {
            return "";
        }

        if (style.equalsIgnoreCase("Pirate")) {
            PiratePack p = new PiratePack();
            return p.getPraise(level);
        } else if (style.equalsIgnoreCase("Shakespearean")) {
            ShakespearePack s = new ShakespearePack();
            return s.getPraise(level);
        } else if (style.equalsIgnoreCase("Wizard")) {
            Wizardpack w = new Wizardpack();
            return w.getPraise(level);
        }

        return "Good job, "  + username + "!";
    }

    public String getScold() {
        if (level.equalsIgnoreCase("Off")) {
            return "";
        }

        if (style.equalsIgnoreCase("Pirate")) {
            PiratePack p = new PiratePack();
            return p.getScold(level);
        } else if (style.equalsIgnoreCase("Shakespearean")) {
            ShakespearePack s = new ShakespearePack();
            return s.getScold(level);
        } else if (style.equalsIgnoreCase("Wizard")) {
            Wizardpack w = new Wizardpack();
            return w.getScold(level);
        }

        return "Try again, " + username + ".";
    }
}

/*
The purpose of this file is to remember the users settings like snark levl, style, and name
it uses polymorphismm to get the right snark pack when programme runs 
and encapsulation to keep the users preferences in one object 
the strateddy pattern basically lets each style have their own class with its own messages and behaviour
*/