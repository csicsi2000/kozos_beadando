# Rendszerterv

## 1. A rendszer célja

## 2. Projektterv

### 2.1 Projektszerepkörök, felelősségek

Product owner: Szűcs János
A prioritással és üzleti értékkel ellátott felhasználói sztorikat tartalmazó Product Backlog létrehozása és felügyelete.

Üzleti szereplők (Stakeholders):

- Megrendelő: Nincs.
- Célzott felhasználók: tanárok és diákok.

### 2.2 Projektmunkások és felelősségeik

Frontend:

- Tápai Árpád
- Kis Sándor

Backend:

- Zheng Yuan Qi
  Feladatuk az adatbázis szerkezetek kialakítása, funkciók létrehozása, a frontend kiszolgálása adatokkal.

Tesztelés:

- Tápai Árpád
- Kis Sándor
- Zheng Yuan Qi

A szoftverekben meglévő hibák felderítése még az üzembe helyezés előtt.

### 2.3 Ütemterv

|     | Funkció / Story           | Feladat / Task                    | Prioritás | Becslés | Aktuális becslés |
| --- | ------------------------- | --------------------------------- | --------- | ------- | ---------------- |
|     | Követelmény specifikáció  |                                   | 0         | 12      | 12               |
|     | Funkcionális specifikáció |                                   | 0         | 12      | 12               |
|     | Rendszerterv              |                                   | 0         | 16      | 16               |
|     | Adattárolás               | Adatmodell megtervezése           | 0         | 4       | 4                |
|     | Adattárolás               | Adatbázis megvalósítása SQLiteban | 1         | 1       | 1                |
|     | Android applikáció        | Képernyőtervek elkészítése        | 2         | 8       | 8                |
|     | Android applikáció        | Prototípus elkészítése            | 2         | 8       | 8                |
|     | Android applikáció        | Adatbázis UIhoz kapcsolása        | 2         | 8       | 8                |
|     | Android applikáció        | Kezdőlap funkciók elkészítése     | 2         | 8       | 8                |
|     | Android applikáció        | Login funkció megvalósítás        | 2         | 8       | 8                |
|     | Android applikáció        | Registration funkció megvalósítás | 2         | 8       | 8                |
|     | Android applikáció        | Tesztelés                         | 2         | 16      | 16               |
|     | Adattárolás               | Tesztelés                         | 2         | 16      | 16               |
|     | Adattárolás               | Buffer bug javításra              | 2         | 16      | 16               |
|     | Android applikáció        | Buffer bug javításra              | 2         | 16      | 16               |
|     | Teljes applikáció         | Final Smoke Test                  | 2         | 4       | 4                |


### 2.4 Mérföldkövek

- A prototipus bemutatása
- Az elkészült szoftver átadása

## 3. Üzleti folyamatok modellje

### 3.1 Üzleti szereplők

A rendszert regisztrálás nélkül is lehet használni. Ekkor csak a meglévő tanárokat látja. Regisztráció után lehet új tanárt létrehozni.

### 3.2 Üzleti folyamatok

Bejelentkezés mindenki számára ugyanolyan lefutású:
A ’Login’ menüpontra kattintva megjelenik a ’Email’ és ’Password’ beviteli űrlap. A mezők kitöltése után a ’Belépés’ gombra kattint a felhasználó. Ha az azonosítás sikeres, akkor a felhasználó belépett és megjelenik a jogosultságának megfelelő menüsor.
Ha nem sikerül az azonosítás, hibaüzenet jelenik meg.

#### Üzleti folyamatok tanároknak:

- Tanár regisztrálása a rendszerben:
  Regisztráció után ha valaki belép akkkor látja a az adott tanárt is.

|     | Megnevezés                 |     |
| --- | -------------------------- | --- |
|     | Felhasználó név            |     |
|     | Jelszó                     |     |
|     | E-mail cím                 |     |
|     | Tanított tárgyak, és áraik |     |

- Lekérdezés (listák, kimutatások):
  A fő oldalon rögtön megjelennek az elérhető tanárok

### 3.3 Üzleti entitások

- Tanárgyak

## 4. Követelmények

### 4.1 Funkcionális követelmények

- Megjelenjenek a tanárok belépéskor
- Legyen lehetőség új tanár regisztrálására
- Már regisztrált tanár be tud lépni, és tudja módosítani az adatait

### 4.2 Nemfunkcionális követelmények

- Termék követelmények
  _ Használhatósági követelmények
  A fejelsztésre kerülő szoftver a potenciális felhasználók számára könnyen tanulható és használható, minimális
  informatikai tudással alkalmazható.
  _ Megbízhatósági követelmények
  A kiaalakítandó szisztéma webes felületen keresztül ér el adatbázist. Az adatbázis konkurens elérése biztosított,
  továbbá inkonzisztens állapotba történő kerülése normál használat mellett nem lehetséges.
  _ Hatékonysági követelmények
  _ Teljesítmény követelmények  
   A városi könyvtár járási, központi jellegéből kifolyólag akár 20000 olvasóval is rendelkezhet, ebből következően
  szélsőséges esetben sem lehet az együttesen a rendszert használók száma több 5000 főnél. Ennél jóval nagyobb
  létszám kiszolgálására is alkalmas a struktúra.
  _ Méret követelmények
  A szoftver mérete nem haladja meg az 1 Gigabyte-ot.
  _ Hordozhatósági követelmények
  Az adatbázis cserélhető legyen

## 5. Funkcionális terv

### 5.1 Rendszerszereplők

A rendszerünkben két rendszerszereplő csoportot különböztetünk meg. Az egyik a könyveket kölcsönző olvasók csoportja. A másik a könyvtári adminisztrációt végző könyvtárosok csoportja. Az olvasók igénybe veszik a könyvtár szolgáltatásait, míg a könyvtárosok ezt nyilvántartják és kiszolgálják az olvasókat. A könyvtárosok több jogosultsággal rendelkeznek, mint az olvasók. Az ő feladatuk még az olvasók értesítése problémák esetén, pl. elmaradás vagy lejárt tagság. A könyvtárosok csoport része az adminisztrátori jogosultsággal rendelkező könyvtárosok csoportja, akik teljes jogosultsággal rendelkeznek. Ők végzik a rendszerben a könyvtárosok adminisztrálását.

### 5.2 Rendszerhasználati esetek és lefutásaik

#### 5.2.1 Bejelentkezés

```mermaid
graph TD
    A((Start)) -->|App indítás| B[Fő oldal tanárok listája]
    B --> G[Bejelentkezés oldal]
    G -->  C[Adatok felvitele]
    C --> D[Bejelentkezés]
    D --> E{Sikeres bejelentkezés?}
    E --> |Nem sikeres| C
    E --> |sikeres| F[Szerkestő oldal]
```

#### 5.2.2 Regisztrálás

```mermaid
graph TD
    A((Start)) -->|App indítás| B[Fő oldal tanárok listája]
    B --> G[Bejelentkezés oldal]
    G -->  H[Regisztrációs oldal]
    H --> C[Adatok felvitele]
    C --> D[Regisztráció]
    D --> E{Sikeres regisztráció?}
    E --> |Nem sikeres| C
    E --> |sikeres| F[Szerkestő oldal]
```

### 5.4 Képernyőtervek

Ez csak a Concept amit az elején csináltunk.  
![alt text](Images/Rendszerterv/UI_Concept.PNG)

## 6. Fizikai környezet

### 6.1 Vásárolt softwarekomponensek és külső rendszerek

Nincsenek vásárolt szoftverkomponensek.

### 6.2 Hardver és hálózati topológia

- Az alkalmazás egy android applikáció
- A jelenlegi implementáció SQLite adatbázist használ, de cserélhető komponens

### 6.3 Fizikai alrendszerek

- Mysql adatbázis szerver
- Android alapú rendszer
  - A beépített SQLite adatbázist használja

### 6.4 Fejlesztő eszközök

- Android Studio
- Visual Studio Code
- Github (git)

## 8. Architekturális terv

### 8.1 Architekturális tervezési minta

Az alkalmazás elkészítése során a felhasználói felület és az adatbázis szétválasztása eg fontos szempont volt. Egy Modulban lévő abstract és interface típusú osztályait használjuk az adatbázis függőségeinek csökkentésére.

### 8.2 Az alkalmazás rétegei, fő komponensei, ezek kapcsolatai

SQLite (Adatbázis) <-------> SQLiteHandler (Üzleti logika) <-------> Kliens (Felhasználói felület)

### 8.3 Változások kezelése

Minden változás lekezelése szerver oldalon történik, a kliens oldalon nincs szükség új komponensek telepítésére.

### 8.4 Git Branching stratégia

A fő branch a main. Minden új feature/bug esetén új branchet hozunk létre és ha kész van az adott dolog akkor mergeljük. Törekszünk a minél kisebb branchekre, és minél gyakoribb mergekre, a nagyobb git konfliktusokk elkerüléséért.

```mermaid
gitGraph
    commit
    commit
    branch feature
    checkout feature
    commit
    commit
    checkout main
    merge feature
    commit
    commit
    branch bug
    checkout bug
    commit
    commit
    checkout main
    merge bug
    commit
    commit
```

## 9. Adatbázisterv

### Tanárok (teachers)

| Adat         | Adat típus |
| ------------ | ---------- |
| ID           | INTEGER    |
| name         | TEXT       |
| image        | TEXT       |
| email        | TEXT       |
| phone_number | TEXT       |

- ID : Az adatbázis kulcsa
- name : a tanár neve
- image : a kép
- email : email cím
- phone_number: telefonszám

### Tantárgyak (subjects)

| Adat           | Adat típus |
| -------------- | ---------- |
| ID             | INTEGER    |
| teacher_id     | INTEGER    |
| name           | TEXT       |
| price_per_hour | INTEGER    |

- ID : Az adatbázis kulcsa
- teacher_id : tanár ID-ja
- name : tantárgy neve
- price_per_hour : órabér
