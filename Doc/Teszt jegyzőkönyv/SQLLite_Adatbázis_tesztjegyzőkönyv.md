# SQLLite adatbázis teszt jegyzőkönyv
Tesztelést végezte: Zheng Yuan Qi
Operációs rendszer: WIN10
Böngésző: Pixel 5 (Emulator)
Dátum: 2022.12.11
Talált hibák száma: 0

## addOrEditTeacher metódus tesztelése

- 1
    - üres adatbázis
    - metódus meghívása új Teacher objektummal. 
    - az objektum hozzá lett adva

- 2
    - üres adatbázis
    - metódus meghívása új Teacher objektummal. 
    - metódus meghívása azonos Teacher objektummal. 
    - az objektum nem lett hozzáadva

- 3 
    - üres adatbázis
    - metódus meghívása új Teacher objektummal. 
    - minden tanár lekérése
    - a lekért objektum adatai megyegyeznek

- 4
    - üres adatbázis
    - metódus meghívása új Teacher objektummal. 
    - a subjectek megfelelően vannak lementve az adatbázisba
- 5 
    - üres adatbázis
    - metódus meghívása új Teacher objektummal. 
    - az objektum hozzá lett adva
    - objektum szerkesztése
    - metódus meghívása a szekesztett objektummal.
    - az adatok frissülnek
- 6 
    - üres adatbázis
    - metódus meghívása új Teacher objektummal. 
    - a teacher lekérése
    - a profil kép helyes bitmap formátumban megjelenik
- 7
    - üres adatbázis
    - metódus meghívása új Teacher objektummal. 
    - a teacher módosítása
    - metódus meghívása a létező Teacher objektummal. 
    - csak a módosított adat módosult. A többi adat nem módosult, vagy sérült meg

## deleteTeacher metódus tesztelése
- 1
    - üres adatbázis
    - teacher objektum törlése
    - nem sikeres

- 2
    - üres adatbázis
    - új teacher hozzáadása
    - teacher törlése
    - sikeres törlés

- 3 
    - több teachert tartalmazó adatbázis
    - jelenlévő teacher törlése
    - csak az adott teacher törlődik
- 4 
    - ID nélküli teacher törlése
    - nem törlődik semmi
- 5
    - üres adatbázis
    - új teacher hozzáadása
    - teacher törlése
    - sikeres törlés
    - a subject adatbázisban is törlődtek a tantárgyak

## getAllTeachers metódus tesztelése
- 1 
    - a teacher objektumok lekérése
    - minden teacher visszaadva
- 2
    - teacher módosítása
    - a lekért teacher-ben látszanak a módosítások
- 3 
    - teacherek lekérése
    - a jelszavakhoz nem fér hozzá a hívó


## getPasswordFromEmail metódus tesztelése
- 1 
    - valid felhasználó, invalid jelszó
    - nem ad vissza teacher objektumot
- 2 
    - invalid felhasználó, valid jelszó
    - nem ad vissza teacher objektumot
- 3
    - valid felhasználó, valid jelszó
    - visszaadja a teacher objektumot



