/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * classname:  SnarkEngine.java
 * rev : 3
 * date : 31/10/25
 * @amelia maxwell
 * x23471092
 */

package settings;

public class SnarkEngine {

    private String username;
    private String snarkLevel;
    private String snarkStyle;

    // constructors
    public SnarkEngine() {
        this.username = "";
        this.snarkLevel = "Off";
        this.snarkStyle = "Pirate";
    }

    public SnarkEngine(String username, String snarkLevel, String snarkStyle) {
        this.username = username;
        this.snarkLevel = snarkLevel;
        this.snarkStyle = snarkStyle;
    }

    // setters
    public void setUserName(String username) {
        this.username = username;
    }

    public void setSnarkLevel(String snarkLevel) {
        this.snarkLevel = snarkLevel;
    }

    public void setSnarkStyle(String snarkStyle) {
        this.snarkStyle = snarkStyle;
    }

    // getters
    public String getUsername() {
        return username;
    }

    public String getSnarkLevel() {
        return snarkLevel;
    }

    public String getSnarkStyle() {
        return snarkStyle;
    }

    // METHODS

    // greetings for when user opens up the app
    public String getGreeting() {
        if (username == null || username.isBlank()) {
            return "Hail, Task Slayer!";
        }
        return "Hail " + username + " of Tasks!";
    }

            // gets praise message based off chosen snark styel and level
            public String getPraise() {
                if (snarkLevel.equalsIgnoreCase("Off")) {//combo boses for this option are in string added ignore case to avoid any issues
                    return "";//empty if nothing has been chosen
                }
                
                    //when user picked prate its then goes through levls
                if (snarkStyle.equalsIgnoreCase("Pirate")) {

                    if (snarkLevel.equalsIgnoreCase("Mild")) {
                        return "Arrr, fine work matey!";
                    }
                    if (snarkLevel.equalsIgnoreCase("Medium")) {
                        return "By the seas, ye did it!";
                    }if (snarkLevel.equalsIgnoreCase("Spicy")) {
                        return "Arrr, ye slacker finally did it!";
                    }
                    
                    

                } else if (snarkStyle.equalsIgnoreCase("Shakespearean")) {

                    if (snarkLevel.equalsIgnoreCase("Mild")) {
                        return "Thou art redeemed!";
                    }if (snarkLevel.equalsIgnoreCase("Medium")) {
                        return "A fine deed hath been done!";
                    }
                    if (snarkLevel.equalsIgnoreCase("Spicy")) {
                        return "Fie upon thee, yet thou hast prevailed!";
                    }
                    
                    

                } else if (snarkStyle.equalsIgnoreCase("Wizard")) {

                    if (snarkLevel.equalsIgnoreCase("Mild")) {
                        return "You have done well, noble soul.";
                    }
                    if (snarkLevel.equalsIgnoreCase("Medium")) {
                        return "Honour restored through diligence.";
                    }if (snarkLevel.equalsIgnoreCase("Spicy")) {
                        return "Rise, warrior! Thy duty is done!";
                  }
                    
                }

                // if none of these conditions match it will give this empty string as a safety net to avoid errors
                return "";
            }

    // Scold message using the same tactic as get praise method
            public String getScold() {

                if (snarkLevel.equals("Off")) {
                    return "";
                }

                if (snarkStyle.equals("Pirate")) {

                    if (snarkLevel.equals("Mild"))
                        return "Ye could’ve done better, matey.";

                    if (snarkLevel.equals("Medium"))
                        return "Ye barnacle-brained layabout!";

                    if (snarkLevel.equals("Spicy"))
                        return "Ye useless sea slug — even a starfish works harder!";
                }

                if (snarkStyle.equals("Shakespearean")) {

                    if (snarkLevel.equals("Mild"))
                        return "Thou art… less than impressive.";

                    if (snarkLevel.equals("Medium"))
                        return "Thou sluggard, finish thy deeds!";

                    if (snarkLevel.equals("Spicy"))
                        return "Thou art a walking tragedy, fit only for mockery!";
                }

                if (snarkStyle.equals("Wizard")) {

                    if (snarkLevel.equals("Mild"))
                        return "The arcane council raises an eyebrow at thee.";

                    if (snarkLevel.equals("Medium"))
                        return "You disappoint the arcane order, my friend.";

                    if (snarkLevel.equals("Spicy"))
                        return "The ancient spirits cry out — your laziness offends them!";
                }

                //incase conditions dont match to avoid errors
                return "";
            }

    }




/*
this class controls what snark messages are done eg which message, style, level. Its gicing the string that will be shown in the GUI.
i used conditional logic like if/else staements to match up styles and levels for the right message which have in their own class predefined
whats praise and scold.
*/