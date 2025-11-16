/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * classname:  SnarkEngine.java
 * rev : 2
 * date : 31/10/25
 * @amelia maxwell
 *  x23471092
 */


package settings;

public class SnarkEngine {

    private String username;
    private String snarkLevel;
    private String snarkStyle; 

    
    //constructors
    public SnarkEngine() {
        username = "";
        snarkLevel = "";
        snarkStyle = "";
    }

    public SnarkEngine(String username, String snarkLevel, String snarkStyle) {
        this.username = username;
        this.snarkLevel = snarkLevel;
        this.snarkStyle = snarkStyle;
    }
    
    //setterss
      public void setuserName(String username){ 
             this.username = username; 
    }
    
    public void setSnarkLevel(String snarkLevel){ 
            this.snarkLevel = snarkLevel; 
    }
    
    public void setSnarkStyle(String snarkStyle){ 
            this.snarkStyle = snarkStyle; 
    }

        
        if (snarkStyle.equalsIgnoreCase("Pirate")) {
            if (snarkLevel.equalsIgnoreCase("Mild"))
                return "Arrr, fine work matey!";
            
            if (snarkLevel.equalsIgnoreCase("Medium")) 
                return "By the seas, ye did it!";
            
            if (snarkLevel.equalsIgnoreCase("Spicy")) 
                return "Arrr, ye slacker finally did it!";
        
        }else if (snarkStyle.equalsIgnoreCase("Shakespearean")) {
            if (snarkLevel.equalsIgnoreCase("Mild")) return "Thou art redeemed!";
            if (snarkLevel.equalsIgnoreCase("Medium")) return "A fine deed hath been done!";
            if (snarkLevel.equalsIgnoreCase("Spicy")) return "Fie upon thee, yet thou hast prevailed!";
        
        }else if (snarkStyle.equalsIgnoreCase("Wizard")) {
            if (snarkLevel.equalsIgnoreCase("Mild")) return "You have done well, noble soul.";
            if (snarkLevel.equalsIgnoreCase("Medium")) return "Honour restored through diligence.";
            if (snarkLevel.equalsIgnoreCase("Spicy")) return "Rise, warrior! Thy duty is done!";
        }

        return "";
    }

    public String getScold() {
        if (snarkLevel.equalsIgnoreCase("Off")) {
            return "";
        }

        if (snarkStyle.equalsIgnoreCase("Pirate")) {
            return "Ye barnacle-brained layabout!";
        }else if (snarkStyle.equalsIgnoreCase("Shakespearean")) {
            return "Thou sluggard, finish thy deeds!";
        }else if (snarkStyle.equalsIgnoreCase("Noble")) {
            return "You disappoint the realm, my friend.";
        }return "";
    }

 
    public String getUsername(){ 
        return username; 
    }
    public String getSnarkLevel() {
        return snarkLevel; 
    }
    public String getSnarkStyle(){ 
        return snarkStyle; 
    }
        public String getGReeting() {
            return "Hail " + username + " of Tasks!";
    }
    public String getPraises() {
        if (snarkLevel.equalsIgnoreCase("Off")) {
            return "";
        }
}

/*
this class controls what snark messages are done eg which message, style, level. Its gicing the string that will be shown in the GUI.
i used conditional logic like if/else staements to match up styles and levels for the right message which have in their own class predefined
whats praise and scold.
*/