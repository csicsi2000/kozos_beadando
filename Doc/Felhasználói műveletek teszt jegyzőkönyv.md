# Magántanár kereső
Tesztelést végezte: Kis Sándor <br>
Operációs rendszer: Andorid v11 <br>
Dátum: 03/01/2023 <br>
Talált hibák száma: 2
&nbsp;&nbsp;
## Felhasználói műveletek tesztelése

### Regisztráció
A rendszerbe való belépéshez regisztrációra van szükség. 
1. Első lépésben regisztráltam saját magamat mint tanárt a saját személyes adataimmal.
2. A név regisztrációs mezőt kitöltetlenül hagyva az "Invalid name" hibaüzenet jelenik meg.
3. Hibás email címet beírva az "invalid email" hibaüzenet jelenik meg. 
4. Ha a telefonszám tartalmz nem szám karaktereket vagy a telefonszám hossza nem éri el a 11 karaktert akkor az "invalid phone number" hibaüzenet jelenik meg.
5. Regisztrálni a tantárgy és az órabér megadása nélkül is tudtam. Ezeket az adatok a felhasználói profil oldalon később be tudtam állítani.

### Bejelentkezés
1. Első lépésben próbáltam adatok megadása nélkül bejelentkezni, ekkor az "Email address is not valid" hibaüzenet jelenik meg.
2. Második lépésben próbáltam hamis adatokkal bejelentkezni, ekkor a "Login failed" hibaüzenet jelent meg.

### Felhasználói profil
1. A felhasználó adatainak módosítására van lehetőség. Először a felhasználói email címet változtattam meg. Úgy választottam meg az új email címet, hogy ne legyen benne @ jel. Az email cím  sikeresen elmentésre került. Ezután ujjraindítottam a programot és próbáltam bejelentkezni új email címmel, de ekkor az "Email address is not valid" hibaüzenet  kaptam, mert az email cim nem tartalmazta a @ jelet.
2.  Második lépésben a telefonszámot változtattam meg úgy, hogy az új telefonszám csak 1 szamot tartalmazott. Az új telefonszám sikeresen mentésre került.  
3. Harmadik lépés a profilkép feltöltése és annak tesztelése volt. A rendszer jól müködött, 5MB volt a legnagyobb méretü file amit kipróbáltam, itt már a mentés az elég időigényes volt. Kép méretének korlátozása javasolt.  


üöíóáéőú





