# Java base skeleton for a Battlefield 2 Statistics/Leaderboards web application
A Modified version of [Trym/Nosp1's skeleton](https://github.com/Nosp1/UiA-bacit-skeleton) to serve as a base for a statistics web application with 
stats from your local Battlefield 2 server [powered by bf2statistics](https://github.com/BF2Statistics).
<br>
## Notice
This project does not use Docker. I personally could not find a way to link up with the existing 
BF2-database when using Docker. I'm sure it's possible, I just couldn't manage to do it. Instead Xampp is used, as it is already used to host the BF2 database.<br> <br>
This repo has no official connections or affiliations to bf2statistics.com. It is simply meant to be a base for gaining further servlet/jsp/database/html experience and 
use bf2statistics/playing Battlefield 2 for a fun and engaging way to create the test data needed for a database instead of manually creating boring test data. 

## How to use
### Prerequisites:
-A copy of Battlefield 2 patched to 1.41 or 1.5 (1.41 has better singleplayer experience due to having working AI Commander)<br>
-Battlefield 2 Dedicated Server version 1.41 or 1.5 (Should match your BF2 version)<br>
-[XAMPP Version 7.4.28](https://www.apachefriends.org/download.html) (version 8.x is not advisable, it creates trouble with the PHP code in ASP) <br>
-[BF2Statistics Web Edition v3.1.0](https://github.com/BF2Statistics/ASP/releases) (then download and use the more updated ASP folder from [here](https://github.com/BF2Statistics/ASP)) <br><br>


[Tutorial video covering step 1-2 in this guide](https://youtu.be/WpNlfql3wPw) <br>
and/or <br>
[Written guide covering step 1-2 in this guide](https://bf2statistics.com/threads/bf2statistics-web-edition-tutorial-and-tips.3022/) <br>
##### 1. Install Battlefield 2 Dedicated Server, XAMPP and BF2Statistics Web Edition.    

##### 2. Install MySQL and Apache as services in Xampp control panel
Open xampp control panel and tick off services for Apache and MySQL.
It makes it so you don't need to manually open xampp and start Apache and MySQL everytime you want to host a dedicated server or make the web application able to contact the DB.
<br><br>

[Video demonstration of step 3-7 in this guide](https://youtu.be/b7qsIYTKmro) 
##### 3. Open this project in IntelliJ.


##### 4. Connect to the database in IntelliJ   
-Click on "Database" in the far right corner.<br>
-Click plus sign, then data source<br>
-Select MariaDB<br>
-Name it "bf2stats"<br>
-Host should be "localhost"<br>
-User should be "root"<br>
-Password should be blank as in nothing<br>
-database should be "bf2stats"<br>

Alternatively you can use "bf2statslogger" as user and "bf2" as password as used in my guides you followed when installing Bf2statistics web edition.

##### 5. Connect the xampps tomcat to IntelliJ
-In intelliJ, click "run" on the top tool menu<br>
-Click "Edit configurations"<br>
-Click the "+"sign<br>
-Scroll down the list until you see Tomcat. Select "local" (not "tomcatEE")<br>
-A menu pops up. Select "Configure" to the right of "application server"<br>
-Click the "+"sign here as well<br>
-Hit the folder icon on "Tomcat Home" and navigate to Xampp's tomcat folder. This is mine "C:\Spillting\Battlefield_2_Server-greier\XAMPP\tomcat" 
-Name it with the tomcat version (or it does so automatically?) and click ok<br>
-Select the tomcat version you just made in "application server"<br>
-Choose what you want the url to be. Mine is "http://localhost:8080/BF2StatsViewer/" <br>
-There will be a red light bulb with and the text "Warning: No artifacts marked for deployment" click "fix".<br>
-Two choices will come up: select "BF2StatsViewer:war_exploded"<br>
-In the "Application context", shorten it down to just "/BF2StatsViewer" (or whatever suffix you gave the URL two steps ago.)<br>

##### 6. Start the tomcat server in IntelliJ
-Click "services" in the menu down left hotkeys(ALT+8)<br>
-Select the tomcat server and hit the green "run" button<br>
-Alternatively there is also a green "run" button on top right menu.
-Wait for it to build the application.

##### 7. Test out the skeleton at http://localhost:8080/BF2StatsViewer/ (if you did not change the url)
-IntelliJ should automatically launch your browser with this link<br>

##### CLOSING NOTES: 
-If using an exploded war, you can apparently change the code without rebuilding. I haven't had the time to check it, so you should google it yourself to learn more about it. <br>

<br>

Have fun and experiment :)
