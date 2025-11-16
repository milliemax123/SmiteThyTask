/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * classname:  Wizardpack
 * rev : 1
 * date : 30/10/25
 * @amelia maxwell
 * x23471092
 */

package settings;

import java.util.Random;

public class Wizardpack {

    private Random rand = new Random();

    public String getPraise(String level) {
        String[] mild = {
            "Ah, the air shimmers with your brilliance, my radiant apprentice.",
            "You’ve conquered success most gracefully. From yours faithfully Ciara xx.",
            "Magic flows strong within your soul today, chosen one."
        };
        String[] medium = {
            "Well done, enchantress of productivity!",
            "Another task vanquished. Careful! your power’s becoming irresistible, you may make Blesson jealous!!",
            "I could kiss the quill, you write with such magnificent focus!"
        };
        String[] spicy = {
            "By the constallations, you tempt even destiny with such mastery!",
            "My heart is aflame, from you bewitching work!",
            "Careful, my dear your brilliance may seduce the  star gods themselves!"
        };
        return pick(level, mild, medium, spicy);
    }

    public String getScold(String level) {
        String[] mild = {
            "Hmm… the spell faltered. Perhaps you were distracted by thoughts of me?",
            "Ah, a minor miscast but don’t pout, even the greats...Well no they dont. Better luck next time?.",
            "Your magic’s dimmed, but your charming good lucks remain."
        };
        String[] medium = {
            "Your wand hand is shaky, my love please focus!",
            "The stars frown upon your laziness, though I never could. hehe.",
            "Even your failures have flair, my delightful disaster."
        };
        String[] spicy = {
            "Oh, a tragic misuse of power, but I almost forgive you, for that face.",
            "Tsk, such wasted potential! I’d train you personally… please.",
            "Your spell fizzled, perhaps you thinking of me again?"
        };
        return pick(level, mild, medium, spicy);
    }

    private String pick(String level, String[] mild, String[] medium, String[] spicy) {
        if (level.equalsIgnoreCase("Mild")) 
            return mild[rand.nextInt(mild.length)];
        if (level.equalsIgnoreCase("Medium"))
            return medium[rand.nextInt(medium.length)];
        if (level.equalsIgnoreCase("Spicy")) 
            return spicy[rand.nextInt(spicy.length)];
        return "";
    }
}
