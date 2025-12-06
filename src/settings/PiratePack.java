/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * className: PiratePack.java
 * rev : 3
 * date : 29/10/25
 * @amelia maxwell
 *  x23471092
 */
package settings;


import java.util.Random;

public class PiratePack{
    private Random rand = new Random();
    private String username;

    public PiratePack(String username) {//passes the username into wizard
        this.username = username;
    }
//this is a random number generator i used to pick random messages so the user doesnt get the same ones everytime
    

    public String getPraise(String level) {//gets messages bbased on level
        String[] mild = {//array cause theres many senteneces
            "Arrr, fine work matey " + username + "!",
            "Aye, ye’ve done well, Captain " + username + "!",
            "Ah, you could make a fine Sailer one day,  " + username + "!  Task be conquered!"
              
        };
        String[] medium = {
            "By the seven seas, ye did it  " + username + "!",
            "Ye’ve proven yer worth, seadog!",
            "The captain Ciara be proud o’ ye " + username + "!"
        };
        String[] spicy = {
            "Arrr, ye slacker  " + username + "! Ye finally did it!",
            "Jeepers! Took ye long enough " + username + "!, ye big barnacle brained seagull!",
            "About time ye finished, sailed the sea's faster than this i have " + username + "!",
            "who says ye cant teach an auld seadog new tricks, like productivity " + username + "!"
        };

        return pick(level, mild, medium, spicy);
    }
//--------------------------------------------------------
    
    
    public String getScold(String level) {
        String[] mild = {
            "Avast, ye forgot again about the booty " + username + "!",
            "Ye best be quicker next tide " + username + "!",
            "Don’t drift off now, sailor! Amelia already fell alseep behind the helm! Don't be sayin' i said tha " + username + "!"
        };
        String[] medium = {
            "Slackin’ off, are ye " + username + "? Wait till Ciara gets ahold of ye.",
            "The crew be waitin’ on ye, lad!",
            "Ye Scuttlebutt better get on that deck soon! Blessons waiting for ye!" + username + " there he is!! Run!!"
        };
        String[] spicy = {
            "Ah " + username + "! Ye barnacle-brained layabout!",
            "I oughta toss ye overboard " + username + "!",
            "Lad, Don't make me walk ye off the plank,  " + username + "!",
            "Lazy scallywag, get to it " + username + "!"
        };

        return pick(level, mild, medium, spicy);
    }
    //----------------------------------------
    
     public String getEncouragement(String level) {//gets messages bbased on level
         String[] mild= {
           "Keep sailing steady by doing your tasks " + username + ", the booty will come soon if ye keep workin. ",
           "SMITE THY TASK " + username.toUpperCase() + ".",
            "Aye, keep it up with those tasks" + username + " ye'v earned a captains nod."
                  };
        String[] medium = {
             "Ye best finish do yer tasks"+ username+". Keep it up try not to ruin the next one Matey",
              "Aye finish yer tasks"  + username + ". Keep our sails and yerself on course", 
            "SMITE THY TASK " + username.toUpperCase() + "."
        };
        String[] spicy = {
            "Ahoy.. ye let yer work sit undone "+ username+". Get it done, or I’ll let the crew use ye for target practice.",
            "Ye best finish do yer tasks, " + username + " or Ill throw ye overboard and let the tide finish ye.",
            "SMITE THY TASK " + username.toUpperCase() + "."
        };
    return pick(level, mild, medium, spicy);
}
    
        
//picks a random message based off levels
    private String pick(String level, String[] mild, String[] medium, String[] spicy) {
        if (level.equalsIgnoreCase("Mild")) return mild[rand.nextInt(mild.length)];// this is where the random message picker comes in
        if (level.equalsIgnoreCase("Medium")) return medium[rand.nextInt(medium.length)];
        if (level.equalsIgnoreCase("Spicy")) return spicy[rand.nextInt(spicy.length)];
        return "";
    }
}

// this stores the pirate style praise messages and give sthe user the correct one based on snark level

/*SOURCES
https://www.geeksforgeeks.org/system-design/strategy-pattern-set-1/
https://www.youtube.com/watch?v=NU_1StN5Tkk&t=100s
*/
