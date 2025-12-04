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

public class Wizardpack{

    private Random rand = new Random();
    private String username;

    public Wizardpack(String username) {//passes the username into wizard
        this.username = username;
    }


    public String getPraise(String level) {//gets messages bbased on level
        String[] mild = {
            "Ah, the air shimmers with your brilliance, my radiant apprentice "+ username + "!",
            "You’ve conquered success most gracefully "+ username + "! From yours faithfully Ciara xx.",
            "Magic flows strong within your soul today,  "+ username + "! You could be the chosen one...my chosen one."
        };
        String[] medium = {
            "Well done "+ username + "! My enchantress of productivity!",
            "Another task vanquished "+ username + ". Careful! your power’s becoming irresistible, you may make Blesson jealous "+ username + "!",
            "I could kiss the quill, you write with such magnificent focus "+ username + "!"
        };
        String[] spicy = {
            "By the constallations,  "+ username + ", you tempt even destiny with such mastery!... Marry me?? please..",
            "My heart is aflame "+ username + "! From yourr bewitching work!",
            "Careful, my dear your brilliance may seduce the  star gods themselves "+ username + "!"
        };
        return pick(level, mild, medium, spicy);
    }
    //--------------------------------------------
    
    

        public String getScold(String level) {
        String[] mild = {
            "Hmm… the spell faltered. Perhaps you were distracted by thoughts of me "+ username + "?",
            "Ah "+ username + ",  a minor miscast but don’t pout, even the greats...Well no they dont. Better luck next time?.",
            "Your magic’s dimmed, but your charming good lucks remain "+ username + "! "
        };
        String[] medium = {
            "Your wand hand is shaky "+ username + ", my love please focus!",
            "The stars frown upon your laziness "+ username + ", though I never could. hehe.",
            "Even your failures have flair "+ username + ", my delightful disaster."
        };
        String[] spicy = {
            "Oh "+ username + ", a tragic misuse of power, but I almost forgive you, for that face.",
            "Tsk, such wasted potential! I’d train you personally… please.",
            "Your spell fizzled "+ username + ", perhaps you thinking of me again?"
        };
        return pick(level, mild, medium, spicy);
    }
    //-----------------------------    

        

    public String getEncouragement(String level) {
        String[] mild = {
            "Go on with your tasks!! "+ username + ". The magic listens to you with such mastery!! But i will always listen to you..",
            "Go on cast upon your uncompleted tasks "+ username + ". I could watch you enchant them all day..",
            "SMITE THY TASK " + username.toUpperCase() + "."
        };
        String[] medium = {
            "With ever task you conquer "+ username + ", the more charmingly good looking you become! How is it possible!? Did you charm yoursel??",
            "Press onwards with your tasks "+ username + "! Sucess really is your color, it makes you appear so radiant as always. I cant look away without using a potion..",
            "SMITE THY TASK " + username.toUpperCase() + "."
        };
        String[] spicy = {
            "Continue on with your tasks "+ username + ". For every successfull cast pulls me closer into your magical ether where I like to be.  orbiting you.",
            "Continue fighting for success by completing your tasks "+ username + "… pyour brilliance is becoming dangerously alluring to my composure!",
            "SMITE THY TASK " + username.toUpperCase() + ".",
        };
        return pick(level, mild, medium, spicy);
    }
    
//picks a random message based off levels
    private String pick(String level, String[] mild, String[] medium, String[] spicy) {
        if (level.equalsIgnoreCase("Mild")) // this is where the random message picker comes in
            return mild[rand.nextInt(mild.length)];
        if (level.equalsIgnoreCase("Medium"))
            return medium[rand.nextInt(medium.length)];
        if (level.equalsIgnoreCase("Spicy")) 
            return spicy[rand.nextInt(spicy.length)];
        return "";
    }
}

//this holds all the wizard messages and give the user the correct message based on the snark level they picked
/*SOURCES
https://www.geeksforgeeks.org/system-design/strategy-pattern-set-1/
https://www.youtube.com/watch?v=NU_1StN5Tkk&t=100s
*/
//i just a stragety ppattern from these sources as i had already started work before it was covered in class