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

public class ShakespearePack {

    private Random rand = new Random();
    //I i used this  pick random messages so the user doesnt get the same ones everytime

    public String getPraise(String level) {//gets messages bbased on level
        String[] mild = {
            "Thou hast done well, gentle soul.",
            "A fair deed, neat and true. Thou glow with virtue. And productivity!!",
            "Thy hand hath danced with productivity this day."
        };
        String[] medium = {
            "A noble triumph! Even the stars take note of thee. Such purpose, such promise!! Lord Blesson shall praise thy productivity!",
            "Ciaras realm shall praise thy clever mind and steady will. Godspeed!!",
            "Thy task complete, and virtue clings to thee like halo light"
        };
        String[] spicy = {
            "By the gods, thou hast conquered all before thee! Let us celebrate with the foamy nector of the gods!! SHH, I mean pints...Ciara has the pints..Ciaraa!!!!!",
            "Were I Amelia were but mortal, I’d bow before thy in all blazing glory!",
            "Thy brilliance scorched the heavens themselves!"
        };
    return pick(level, mild, medium, spicy);
}


    public String getScold(String level) {
        String[] mild = {
            "Thou hast failed, banquish thy idle.",
            "Even the sun grows weary of thy waiting.",
            "Linger not, lest sloth steal thy promise."
        };
        String[] medium = {
            "Thou lazy wretch, see thy duties done! For lord Blesson shall conquere thee!",
            "To work, lest disgrace claim thee first!",
            "I groan in anguish, my slothful friend!!"
        };
        String[] spicy = {
            "Shame upon thee, my slothful fiend! thou shall be banned thy realm ",
            "Thy hope withers while thou idle!",
            "Even the devils yawn at thy neglect!"
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
