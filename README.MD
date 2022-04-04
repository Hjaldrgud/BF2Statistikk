# Java base skeleton for a Battlefield 2 Statistics/Leaderboards web application
A Modified version of [Trym/Nosp1's skeleton](https://github.com/Nosp1/UiA-bacit-skeleton) to serve as a base for a statistics web application with stats from your local Battlefield 2 server [powered by bf2statistics](https://github.com/BF2Statistics).
<br>

## Notice
I ditched Docker and all that. I personally could not find a way to link up with the existing 
BF2-database when using Docker. I'm sure it's possible, I just couldn't manage to do it. Instead Xampp is used, as it is already used to host the BF2 database.<br> <br>
This repo has no official connections or affiliations to bf2statistics.com. It is simply meant to be a base for gaining further servlet/jsp/database/html experience and use bf2statistics/playing Battlefield 2 for a fun and engaging way to create the test data needed for the tables. 

## How to use
### Prerequisites:
-A copy of Battlefield 2 patched to 1.41 or 1.5 (1.41 has better singleplayer experience due to having working AI Commander)<br>
-Battlefield 2 Dedicated Server version 1.41 or 1.5 (depending on your bf2 version)<br>
-[XAMPP Version 7.4.28](https://www.apachefriends.org/download.html) (version 8.x is not advisable) <br>
-[BF2Statistics Web Edition v3.1.0](https://github.com/BF2Statistics/ASP/releases) (then download and use the more updated asp folder from [here](https://github.com/BF2Statistics/ASP))

##### 1. Install Battlefield 2 Dedicated Server, XAMPP and BF2Statistics Web Edition.    
[My installation tutorial video](https://youtu.be/WpNlfql3wPw) <br>
and/or <br>
[My written guide](https://bf2statistics.com/threads/bf2statistics-web-edition-tutorial-and-tips.3022/) <br>


##### 2. Install MySQL and Apache as services in Xampp control panel
Open xampp control panel and tick off services for Apache and MySQL.
It makes it so you don't need to manually open xampp and start Apache and MySQL everytime you want to host a dedicated server or make the web application able to contact the DB.

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

Alternatively you can use "bf2statslogger" as user and "bf2" as password as in the guide you followed when installing Bf2statistics web edition.

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
-There will be a red light bulb with and the text "Warning: No artifacts marked for deployment" click it "fix".<br>
-Two choices will come up: select "Battlefield2Statistikk:war exploded"<br>
-In the "Application context", shorten it down to just "/BF2StatsViewer" (or whatever suffix you gave the URL two steps ago.)<br>

##### 6. Start the tomcat server in IntelliJ
-click "services" in the menu down left<br>
-select the tomcat server and hit the green "run" button
-Wait for it to build the application.

##### 7. Test out the skeleton at http://localhost:8080/BF2StatsViewer/ (if you did not change the url)
-IntelliJ should automatically launch your browser with this link<br>

##### CLOSING NOTES: 
-You can add tomcat to "services"-tool window (ALT+8) for fast rebuilding or use hotkeys SHIFT+F10<br>
-If using war_exploded, you can apparently change the code without rebuilding. I haven't checked it, so you should google to learn more about it. <br>

<br>

Have fun and experiment :)