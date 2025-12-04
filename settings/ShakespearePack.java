/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * classname: ShakespearePack.java
 * rev : 2
 * date : 29/10/25
 * @amelia maxwell
 *  x23471092
 */

package settings;

import java.util.Random;

public class ShakespearePack{
    private Random rand = new Random();
    private String username;

    public ShakespearePack(String username) {//passes the username into wizard
        this.username = username;
    }

    //I i used this  pick random messages so the user doesnt get the same ones everytime
   
    public String getPraise(String level) {//gets messages bbased on level
        String[] mild = {
            "Thou hast done well, gentle soul " + username + ".",
            "A fair deed, neat and true. Thou glow with virtue. And productivity "+ username + "!!",
            "Thy hand hath danced with productivity this day " + username + "."
        };
        String[] medium = {
            "A noble triumph! Even the stars take note of thee. Such purpose, such promise!! Lord Blesson shall praise thy productivity "+ username + "!",
            "Ciaras realm shall praise thy clever mind and steady will. Godspeed "  + username + "!!",
            "Thy task complete, and virtue clings to thee like halo light " + username + "."
        };
        String[] spicy = {
            "By the gods, thou hast conquered all before thee! Let us celebrate with the foamy nector of the gods!! SHH, I mean pints...Ciara has the pints. "+ username + " follow Ciara!",
            "Were I Amelia were but mortal, I’d bow before thy in all blazing glory "  + username + "!!", 
            "Thy brilliance of "+ username +" scorched the heavens themselves!"
        };
    return pick(level, mild, medium, spicy);
}
//----------------------
    


    public String getScold(String level) {
        String[] mild = {
            "Thou hast failed, banquish thy idle "   + username + "!",
            "Even the sun grows weary of thy waiting " + username + "!",
            "Linger not, lest sloth steal thy promise "+ username + "!"
        };
        String[] medium = {
            "Thou lazy wretch, see thy duties done! For lord Blesson shall conquere thee. "+ username + "run its lord Blesson!!!",
            "To work, "+ username +  " lest disgrace claim thee first",
            "I groan in anguish, my slothful friend!! " + username + " I pray for you!!"
        };
        String[] spicy = {
            "Shame upon thee, my slothful fiend! thou shall be banned thy realm "+ username + "!",
            "Thy hope withers while thou idle! "+ username + "!",
            "Even the devils yawn at thy neglect " + username + "!"
        };
    return pick(level, mild, medium, spicy);
}
    //-------------
    
    

        public String getEncouragement(String level) {//gets messages bbased on level
        String[] mild = {
            "Go fourth! Conquer all tasks, for if thy name is not Sir. " + username + " the third.",
           "SMITE THY TASK " + username.toUpperCase() + ".",
            "The folk of this manor crave but two delights: bread for the belly,  and the circus as spectacles.  " + username + " work for bread and circus."
        };
        String[] medium = {
             "Complete thy tasks as Sloth and gluttony tremble and weep in thy presense!! No task can dstroy thee "+ username+"'s will of iron!!",
              "Go fourth comeplete thee task, For if I Amelia were but mortal, I’d bow before thy in all blazing glory "  + username + "!!", 
            "SMITE THY TASK " + username.toUpperCase() + "."
        };
        String[] spicy = {
            "oh.. Thy work sits undone "+ username+". Perhaps do it. Lest i whisper shortcomings to the winds..",
           "Complete thy task, " + username + ", for an unfinished deed summons a reckoning most unpleasant.",
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
//this class give messages stores the shakespear messages and with the right snark level picked by user gives the message
/*SOURCES
https://www.geeksforgeeks.org/system-design/strategy-pattern-set-1/
https://www.youtube.com/watch?v=NU_1StN5Tkk&t=100s
*/