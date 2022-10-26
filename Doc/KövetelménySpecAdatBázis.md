# Adatbázis

Az adatbázis a beépített SQLite-ot fogja használni ami a tanárok adatait tárolja le.

3 táblára lesz szükség összesen. A tanárok adatait tároló, tantárgyakat tároló, és az ezeket összekötő táblára.
 
A tanárok ha regisztrálnak akkor a következő adatokat tudják beállítani:
- nevük
- profil képük
- email címük
- telefonszámuk
- tantárgyak 
    - tantárgy neve
    - tantárgy ft/óra
    
## Adatok

### Tanárok (teachers)

| Adat              | Adat típus |
| ------------------| ------------- |
| ID                | INTEGER  |
| name              | TEXT  |
| image             | TEXT  |
| email             | TEXT |
| phone_number      | TEXT |


- ID : Az adatbázis kulcsa
- name : a tanár neve
- image : a kép
- email : email cím
- phone_number: telefonszám

### Tantárgyak (subjects)

| Adat              | Adat típus |
| ------------------| ------------- |
| ID                | INTEGER  |
| teacher_id        | INTEGER  |
| name              | TEXT  |
| price_per_hour    | INTEGER  |

- ID : Az adatbázis kulcsa
- teacher_id : tanár ID-ja
- name : tantárgy neve
- price_per_hour : órabér


## Funckiók

A következő funkcók szükségesek:
- Tanárok olvasása
- új tanár felvétele
- Bejelentkezés
- Tanár adatainak módosítása