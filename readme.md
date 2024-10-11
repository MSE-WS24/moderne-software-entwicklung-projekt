# Grundlagen Git Commands

- $ `git init` Erstellung eines Git Repository/Projects
- $ `git clone` /..link../ Herunterladen bzw. Klonen eines Repositorys
- $ `git add` /..file../ Fügt Dateien dem Staging Bereich hinzu
- $ `git commit -m` "message" Hinzufügen/Speicherung der Änderungen mit einer Nachricht (-m "..")
- $ `git push` Hochladen auf das Repository/Branch
- $ `git pull` Herunterladen vom Repositorys/Branch
- $ `git rm` /..file../ löscht Dateien
- $ `git branch` /..Branch Name../ Erstellung eines Branches
- $ `git checkout` Branch wechseln
- $ `git checkout -b` /..Name../ Neuen Branch erstellen und dorthin wechseln
- $ `git branch -d` /..Name../ Bestimmten Branch löschen
- $ `git merge` /..Branch name../ Fügt Änderungen eines anderen Branches in den Aktuellen ein

- $ `git help add` Öffnet die Dokumentation im Browser
- $ `git status` Zeigt an, welche Dateien modizifiert wurden und welchen Status die besitzen
- $ `git log` Zeigt den Verlauf an und noch mehr Infos wie z.B. Autoren
- $ `git branch` Liste der verfügbaren Branches

\codefragment git push 




# Git Integration in IntelliJ - Remote

Vorausgesetzt wird ein bereits existierendes Repo.

1. Öffne IntelliJ und klicke auf "New Project"
2. Wähle "Project from Version Control"
3. Link des Remote Repositorys im vorgesehen Feld eingeben
4. IntelliJ klont das Projekt selber und öffnet es automatisch
![img_1.png](img_1.png)

Will man dennoch mit der Console arbeiten, werden die oben genannten Befehle und die Konsole benötigt.

1. IntelliJ Projekt erstellen und das Terminal öffnen. (Unten Links)
2. Befehl "git clone /Link/" das Repository klonen
3. Befehl "git checkout -b /Branch name/" Einen gewünschten Branch erstellen und dorthin wechseln
4. Nun kann die Projektbearbeitung beginnen.
5. mit "git status" kann zur Sicherheit überprüft werden, ob man sich der User im richtigen Branch befindet


# Git Integration in IntelliJ - Lokal

1. Neues Projekt in IntelliJ erstellen
2. Terminal öffnen
3. Befehl "cd /Verzeichnis/", um in das gewünschte Verzeichnis zu wechseln
4. Befehl "git init", um ein Lokales Repository anzulegen/initialisieren
5. Falls nötig mit ".gitignore" eine .gitignore Datei hinzufügen