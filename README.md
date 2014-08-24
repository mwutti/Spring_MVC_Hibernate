Spring_MVC_Hibernate
====================

Hibernate integration test 

@Setup
Tomcat muss installiert sein (v 6.0.41)

Am besten das Projekt als Maven Projekt in IDEA importieren.

unter run -> edit cunfigurations Tomcat Server auswählen und in des Feld VM options: folgendes eintragen
-XX:+CMSClassUnloadingEnabled -XX:+CMSPermGenSweepingEnabled

Dann bekommt ihr keine Memory Exception wenn Hibernate benützt wird.

Ein Script zur Erstellung der db liegt im Ordner Util

In webapp\WEB-INF\jdbc.properties das root Password für Mysql Eintragen 


***********************************************************************
-----------------------------------------------------------------------
Viel Spaß beim Kampf gegen die Exceptions ^^ !
-----------------------------------------------------------------------
***********************************************************************

