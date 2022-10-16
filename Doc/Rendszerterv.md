# Rendszerterv

## 1. A rendszer célja

## 2. Projektterv

### 2.1 Projektszerepkörök, felelősségek
Scrum master: Yuan Qi Zheng
Feladata a kommunikáció a csapat tagjaival, a sprint időszakán belül daily meeting-eken az elvégzett és a következő feladatok átbeszélése, akadályok (impediment) feltárása. 

Product owner: Kis Sándor
A prioritással és üzleti értékkel ellátott felhasználói sztorikat tartalmazó Product Backlog létrehozása és felügyelete.

Üzleti szereplők (Stakeholders):
- Megrendelő: KapzsiCorp

### 2.2 Projektmunkások és felelősségeik

Frontend:
- Tápai Árpád
- Yuan Qi Zheng
- Kis Sándor
A felhasználók által elérhető felület kialakítása, amin keresztűl a backend által biztosított szolgáltatások igénybevételével elérhetőek a rendszerben a felhasználók rendelkezésére álló funkciók.

Backend:
- Tápai Árpád
- Yuan Qi Zheng
- Kis Sándor
Feladatuk az adatbázis szerkezetek kialakítása, funkciók létrehozása, a frontend kiszolgálása adatokkal.

Tesztelés:
- Tápai Árpád
- Yuan Qi Zheng
- Kis Sándor
A szoftverekben meglévő hibák felderítése még az üzembe helyezés előtt. 
  
### 2.3 Ütemterv

||Funkció / Story | Feladat / Task | Prioritás | Becslés | Aktuális becslés | Elteltidő | Hátralévő idő ||
|-|---------------|----------------|-----------|---------|------------------|-----------|---------------|-|
||Követelmény specifikáció|        |         0 |      12 |               12 |        12 |             0 ||             
||Funkcionális specifikáció|       |         0 |      12 |               12 |        12 |             0 ||
||Rendszerterv|                    |           |      16 |               16 |         8 |             8 ||
||Adattárolás|Adatmodell megtervezése|       0 |       4 |                4 |         4 |             0 ||
||Adattárolás|Adatbázis megvalósítása a szerveren|  1 |  1 |              1 |         0 |             1 ||
||Mobil|Képernyőtervek elkészítése|        2 |       8 |                8 |         0 |             8 ||
||Mobil|Prototípus elkészítése|            2 |       8 |                8 |         0 |             8 ||
||Adattárolás|Adatbázis létrehozása|             2 |       8 |                8 |         0 |             8 ||
||Website|Menüstruktúra elkészítése|         2 |       8 |                8 |         0 |             8 ||
||Mobil|Fő ablak funkciók elkészítése|      2 |       8 |                8 |         0 |             8 ||
||Mobil|Login/regisztráció funkció megvalósítás|         2 |       8 |                8 |         0 |             8 ||
||Mobil|tantárgy szűrésfunkció|                 2 |       8 |                8 |         0 |             8 ||
||Mobil|új tanár felvétele funkciók|       2 |       8 |                8 |         0 |             8 ||
||Mobil|tanár értékelése funkciók|      2 |       8 |                8 |         0 |             8 ||
||Mobil|Tesztelés|                         2 |      16 |               16 |         0 |            16 ||


### 2.4 Mérföldkövek

- A prototipus bemutatása
- Az elkészült szoftver átadása 

## 3. Üzleti folyamatok modellje

### 3.1 Üzleti szereplők
Csak regisztráció után lehet használni a programot. Van Tanár, és Diák szerepkör. Ez a Kereső és kínálónak felel meg.

### 3.2 Üzleti folyamatok
Bejelentkezés mindenki számára ugyanolyan lefutású:
A ’Belépés’ menüpontra kattintva megjelenik a ’Felhasználó név’ és ’Jelszó’ beviteli űrlap. A mezők kitöltése után a ’Belépés’ gombra kattint a felhasználó. Ha az azonosítás sikeres, akkor a felhasználó belépett és megjelenik a jogosultságának megfelelő menüsor.
Ha nem sikerül az azonosítás, hibaüzenet jelenik meg.

#### Üzleti folyamatok Tanárok számára:
-tantárgy feltöltése/törlése.
- lehetséges tanítási időpontok megadása/törlése.
-regisztrált időpont törlése


||Megnevezés||
|-|---------|-|
||név||
||tantárgy||
||szint||
||kép(def kép)||
||órabér||


- Profil törlése a rendszerből:
profil alatta törlés gombra kattintással.

- Új tantárgy regisztrálása/törlése: 


- Keresés funkció: 


### 3.3 Üzleti entitások 
-	könyv
-	olvasójegy

## 4. Követelmények

### 4.1 Funkcionális követelmények  


### 4.2 Nemfunkcionális követelmények  

*	Termék követelmények
		*	Használhatósági követelmények 
			A fejelsztésre kerülő szoftver a potenciális felhasználók számára könnyen tanulható és használható, minimális 
			informatikai tudással alkalmazható. 
		*	Megbízhatósági követelmények
			A kiaalakítandó szisztéma webes felületen keresztül ér el adatbázist. Az adatbázis konkurens elérése biztosított,
			továbbá inkonzisztens állapotba történő kerülése normál használat mellett nem lehetséges.
		*	Hatékonysági követelmények
			*	Teljesítmény követelmények  
				
			*	Méret követelmények 
				A szoftver mérete nem haladja meg az 1 Gigabyte-ot.
		*	Hordozhatósági követelmények 
			Amennyiben a könyvtár információs rendszerében hardverfejlesztés, bővítés zajlik, a rendszer az új környezetben is
			alkalmazható lesz.
		
	*	Szervezeti követelmények
		*	Szállítási követelmények
			A szoftver a szerződésben meghatározozott időpontig kerül átadásra, ellenkező esetben a szszerződésben található 
			kötbér illeti meg a megrendelőt.
		*	Implementációs követelmények
			A program a szerződésben meghatározott gépekre kerül telepítésre, a felhasználók számára teljesen használatra
			készen, az adatbázisba minimális mennyiségű adat is feltöltésre kerül a dolgozók gyakorlati képzésének 
			megkönnyítése céljából.
		*	Szabványügyi követelmények
			A vonatkozó szabványügyi kritériumok Törvényi előírások, szabványok fejezetben találhatók.
			
	*	Külső követelmények
		*	Együttműködési követelmények
			A szoftverfejlesztő cég szakamberei és a megrendelő közötti kapcsoalttartást a szerződésben	meghatározott 
			személyek végzik. Szükség esetén mindkét oldalról bevonnak további szakembereket az együttműködés optimalizálása 
			céljából.
		*	Etikai követelmények
			A szoftverfeljesztő cég munkatársainak a jóváhagyott etikai kódex alapján kell viselkedniük.
		*	Jogi követelmények
			*	Titokvédelmi követelmények
				E téren a törvényi előírások az irányadók. A fejlesztő cég munkatársai vállalják, hogy a sem a könyvtár dolgzóinak,
				sem a felhasználók adatait harmadik fél számára nem adják át, továbbá a sikeres átadás átvételt követően a nem üzleti
				jellegű adatokat megsemmisítik.
			*	Biztonsági követelmények
				A szoftverfejlesztés során a felhasználók számára egylépcsős beléptetési rendszer lesz implementálva.


### 4.3 Törvényi előírások, szabványok  

Szerzői jogi törvény (1999. évi LXXVI. törvény; röviden: Szjt.), illetve a 
	2016. évi XCIII. törvény A szerzői jogok és a szerzőijoghoz kapcsolódó jogok közös kezeléséről  

	2018. évi LIV. törvény az üzleti titok védelméről

	2015. évi CCXXII. törvény az elektronikus ügyintézés és a bizalmi szolgáltatások általános szabályairól

	1995. évi LXVI. törvény a köziratokról, a közlevéltárakról és a magánlevéltári anyag védelméről

	73/2018. (IV. 20.) Korm. rendelet a helyi közszolgáltatás információs rendszerről

	187/2015. (VII. 13.) Korm. rendelet az elektronikus információs rendszerek biztonsági felügyeletét ellátó hatóságok,
	valamint az információbiztonsági felügyelő feladat- és hatásköréről, továbbá a zárt célú elektronikus információs rendszerek
	meghatározásáról

	335/2005. (XII. 29.) Korm. rendelet a közfeladatot ellátó szervek iratkezelésének általános követelményeiről

	Az ISO / IEC 12207 a nemzetközi szabvány, amely tartalmazza a szoftver életciklusának kiválasztási, bevezetési és ellenőrzési
	módszerét.

	Az ISO 9000 leírja a termékek előállításának hivatalosan szervezett folyamatát, valamint az előrehaladás irányításának és 
	nyomon követésének módszereit.

	Az ISO / IEC 24744 szoftverfejlesztés - Metamodel for Development Methodologies, egy Powertype-alapú metamodell
	szoftverfejlesztési módszertanhoz.

	ISO / IEC 15504 Információs technológia — folyamatértékelés, más néven a szoftverfolyamat-fejlesztési képesség meghatározása
	(SPICE), "a szoftverfolyamatok értékelésének kerete".

## 5. Funkcionális terv

### 5.1 Rendszerszereplők
A rendszerünkben két rendszerszereplő csoportot különböztetünk meg. Az egyik a tanulni kívánók csoportja. A másik a tanárok csoportja. Az tanulni kívánók igénybe veszik a tanárok által kínált korepetációt, míg a tanárok ezt pénz ellenében hirdetik magukat. A tanárok több jogosultsággal rendelkeznek, mint az tanulni kívánók.



### 5.2 Rendszerhasználati esetek és lefutásaik 

![Kereses_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/rendszerhasznalati/kereses.png)

![Olvaso_sajat_adat_mod_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/rendszerhasznalati/olvaso_sajat_adat_mod.png)

![Olvaso_reg_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/rendszerhasznalati/olvaso_reg.png)

![Olvaso_del_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/rendszerhasznalati/olvaso_del.png)

![Olvaso_adat_mod_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/rendszerhasznalati/olvaso_adat_mod.png)

![Konyv_del_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/rendszerhasznalati/konyv_del.png)

![Konyv_kiad_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/rendszerhasznalati/konyv_kiad.png)

![Konyv_reg_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/rendszerhasznalati/konyv_reg.png)

![Konyv_vissza_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/rendszerhasznalati/konyv_vissza.png)

![Konyvtaros_reg_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/rendszerhasznalati/konyvtaros_reg.png)

![Konyvtaros_del_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/rendszerhasznalati/konyvtaros_del.png)

![Konyvtaros_adat_mod_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/rendszerhasznalati/konyvtaros_adat_mod.png)

### 5.3 Határ osztályok 

#### Az olvasó felhasználói tevékenységeihez kapcsolódó határosztályok
![olvaso_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/olvaso_hatarosztalyai.png)

#### A könyvtáros felhasználói tevékenységeihez kapcsolódó határosztályok  
Megjegyzés: A könyvkeresések eredményét leíró határosztályokat a fenti diagram tartalmazza  

![konyvtaros_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/konyvtaros_hatarosztalyai.png)

#### A könyvtáros felhasználó könyvkölcsönzési tevékenységeihez kapcsolódó határosztályok
![kolcsonzes_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/konyvkolcsonzes_hatarosztalyai.png)

#### A könyvtáros adminisztrátor kiegészítő felhasználói tevékenységeihez kapcsolódó határosztályok
![admin_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/konyvtaros_adminisztrator_hatarosztalyai.png)

### 5.4 Menühierarchiák 

A menürendszert egy, a weboldal fejléce alatt található vízszintes, lenyíló menüket is tartalmazó navigációs sávban építettük fel.  

A rendszerbe való bejelentkezés előtt *Kezdőlap, Tájékoztató, Katalógus*, valamint *Belépés* menüpontok találhatók a navigációs sávban. 
Ezek közül egyedül a Katalógus tartalmaz lenyíló menüt, lehetővé téve az *Egyszerű keresés* valamint a *Részletes keresés* műveletek 
kezdeményezését a könyvtári katalógusban a honlap látogatói számára.  

**Bármilyen felhasználóként** - olvasóként, könyvtárosként vagy könyvtáros adminisztrátorként - belépve a rendszerbe a navigációs sáv jobb oldalán 
helyezkedik el a *Belépve: felhasználónév* menüpont, kiemelve ezzel, hogy adott pillanatban ki használja a rendszert az adott böngészőből. 
A menüpont egy lenyíló menüt tartalmaz, mely a *Jelszócsere, Személyes adatok* és *Kilépés* menüpontokból áll. Ez egységes minden felhasználó esetén, 
a személyes adatok mindegyike megtekinthető, azonban csak a telefonszám és e-mail cím módosítható.

**Olvasóként** belépve a rendszerbe a *Kezdőlap, Katalógus, Könyveim* menüpontok jelennek meg a sáv bal oldalán. A Katalógus megegyezik a fentiekben 
ismertetett lenyíló menüvel, az olvasóknak csak keresési lehetőséget biztosít a rendszer a katalógusban. A Könyveim menüpont az aktuálisan kikölcsönzött 
könyveket listázza ki az olvasó számára.

**Könyvtárosként** belépve a rendszerbe a *Kezdőlap, Olvasó, Katalógus, Kölcsönzés* menüpontok találhatók a navigációs sávban, melyek mindegyike a 
Kezdőlaptól eltekintve lenyíló menürendszer. A főmenü felosztása az különböző adminisztratív funkciókhoz kapcsolódik, úm. olvasó nyilvántartás, 
könyv katalógus műveletek, és kölcsönzési adminisztráció.  
Az *Olvasó* menü tartalmazza az *Beiratkozás, Adatok módosítása, Tagság rendezése, Kiiratkozás,* valamint a *Lejárt tagságok* menüpontokat, 
melyek mindegyike a nevében szereplő műveletek végzéséhez szükséges képernyőket jeleníti meg, melyek a Lejárt tagságok kivételével - mely egy lista - 
egy olvasói adatokat tartalmazó űrlap.  
A *Katalógus* lenyíló menü tartalmazza a katalógusban való kereséshez és a könyvek katalogizálásához szükséges műveletek menüpontjait, 
melyek név szerint: *Egyszerű keresés, Részletes keresés, Új könyv felvétele, Könyv leselejtezése, Teljes leltár indítása,*
*Teljes leltár folytatása, Teljes vége*. A menü három főbb tevékenység köré szerveződik, a keresés, egyedi könyvpéldányok katalógusba való felvétele vagy
törlése, illetve az évente egyszer végzett teljes leltárhoz kapcsolódó három menüpont.  
A *Kölcsönzés* menüpont lenyíló menüjében a könyvek kikölcsönzéséhez, visszavételéhez, valamint a kölcsönzés hosszabbításához kapcsolódó műveletek
végzéséhez szükséges menüpontok szerepelnek: *Könyv kiadása, Könyv visszavétele, Hosszabbítás, Lejárt határidős könyvek*. Ezek napi szinten, folyamatosan használt műveletek, illetve 
nem a katalógushoz kapcsolódóak, mely indokolttá teszi külön menübe helyezésüket. A szintén gyakran végzett keresési műveleteket az egységes 
felhasználói felület megtartása végett, valamint funkcióját tekintetbe véve tartottuk a hosszú Katalógus menüben, de kiemelt szerepét tekintve az
első és második helyen.  

**Adminisztrátor könyvtárosként** a fenti könyvtáros menürendszer kiegészül a könyvtárosok adminisztrációjához szükséges lenyíló menüponttal.
Így a navigációs sáv bal oldalán ebben az esetben a *Kezdőlap, Olvasó, Könyvtáros, Katalógus, Kölcsönzés* menüpontok találhatóak. A Könyvtáros
lenyíló menü a *Regisztráció, Adatok módosítása, Törlés* menüpontokat tartalmazza. Ezek elkülönítését már csak az a szempont is indokolta, hogy ezek
a műveletek csak az erre jogosult könyvtárosoknak állnak rendelkezésére.

### 5.5 Képernyőtervek  

A képernyőtervek egy html/css kód használatával megírt prototípus weboldal formájában állnak rendelkezésre, melyeket a leendő
felhasználók számára készítettünk el a funkcionális specifikáció részeként, és mivel pozitív fogadtatásra talált, ezért 
a rendszerterv része is lett. A forrás fájlok a 
[prototype](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/tree/main/Doc/prototype/) GitHub mappából tölthetőek le, ezt
követően lehet megjeleníteni az oldalakat böngészőben. A prototípus nem fed le minden forgatókönyvet, az űrlapok mezői
általában adatok nélkül szerepelnek, néhány esetben demonstratív jelleggel ki van töltve. Visszajelző üzenetek is csak az 
újonnan felvett olvasók, könyvtárosok és könyvek, valamint jelszómódosítás esetén vannak. Azonban a menürendszerből minden 
funkcióhoz tartozó képernyőterv - beviteli űrlapok, listák(demo adatokkal) - elérhetőek.

Főbb oldalak:
- **kezdolap.html**, amely minden felhasználó számára először jelenik meg.  

- **belepve_olvaso.html**, amely az olvasó bejelentkezése után érhető el, ez jelenleg nem érhető el a kezdőlapon keresztül.    

- **belepve.html**, amely az adminisztrátor könyvtáros bejelentkezése után jelenik meg. Ez a kezdőoldal *Belépés* menüpontján 
keresztül elérhető.  

**Megjegyzések:**  
- Adminisztrátori jogosultsággal nem rendelkező könyvtáros menürendszere annyiban tér el a fentitől, hogy a *Könyvtáros* menüpont 
nem szerepel az oldalán, mint az a Menühierarchia fejezetben is ismertetésre került.

- Az *Egyszerű keresés* és az *Részletes keresés* oldalak elérhetők a kezdőlapról és belépést követően is,
azonban a keresés eredménye oldalak a kezdőlapra visznek vissza, megváltozik a menürendszer, ez tekinthető
a prototípus hiányosságának, azonban a keresési folyamatot így is demonstrálja a weboldal.  

## 6. Fizikai környezet

### 6.1 Vásárolt softwarekomponensek és külső rendszerek

Nincsenek vásárolt szoftverkomponensek. 

### 6.2 Hardver és hálózati topológia

- Az alkalmazás web platformra készül.
- Internet böngészőn keresztül érhető el a felhasználó felület.
- Szerverhez kapcsolódnak:
-- kliens gépek a helyi hálózaton 
-- interneten bárki számára elérhető honlap  
 
### 6.3 Fizikai alrendszerek

- Webszerver: 80-as porton elérhető HTTP szolgáltatás 
- Mysql adatbázis szerver
- Kliens gépek: a követelményeknek megfelelő internet böngésző futtatására alkalmas PC-k.

### 6.4 Fejlesztő eszközök

- Apache NetBeans
- WampServer  
- MySQL Workbench
- PSPad

## 8. Architekturális terv

Az Apache http szerveren futó alkalmazás szolgálja ki webes felületen keresztül a rendszer felhasználóit.
A felhasználó felület böngészőben megjelenő html oldalak formájában érhető el, ezen keresztül tudják a felhasználók a rendszert használni.
Az adatok tárolása a MySql adatbázis szerveren történik.


### 8.1 Architekturális tervezési minta

Az alkalmazás elkészítése során az MVC (Model, View Controller) modellt használjuk.

### 8.2 Az alkalmazás rétegei, fő komponensei, ezek kapcsolatai

A backend a webszereveren fut, a vékony kliens a böngészőből elérhető a felhasználók számára.
Adatbázis szerver (Adatbázis) <-------> Webszerver (Üzleti logika) <-------> Kliens (Felhasználói felület) 

### 8.3 Változások kezelése

Minden változás lekezelése szerver oldalon történik, a kliens oldalon nincs szükség új komponensek telepítésére.  


## 9. Adatbázisterv  
  
**Olvasó egyedet** jellemzi:  
 Olvasójegy azonosító, ami elsődleges kulcs, 
 Felhasználói név,
 Jelszó,  
 Tagság érvényesség,  
 Családi név,   
 Utónév,  
 Születési családi név,  
 Születési utónév,  
 Születési hely,  
 Születési dátum,  
 Anyja születési családi neve,  
 Anyja születési utóneve,  
 Lakcím irányítószám,  
 Lakcím város,  
 Lakcím utca, 
 Lakcím házszám,  
 Telefonszám,  
 e-mail,  
 
 **Könyv egyedet** jellemzi:  
 ISBN száma, ami elsődleges kulcs,  
 Szerző(k),  
 Cím,  
 Kiadó,   
 Kiadási év,  
 Cutter  
 ETO jelzet,  
 Oldalak száma,  
 Tárgyszavak,  
 
 
 **Példány egyedet** jellemzi:  
 Azonosító, ami elsődleges kulcs (vonalkód),  
 ISBN,   (mutat a könyvre)  
 Leltárba vétel dátuma,      
 Megjegyzés,  
 
 **Könyvtáros egyedet** jellemzi:  
 Felhasználói név elsődleges kulcs,  
 Jelszó,  
 Családi név,   
 Utónév,  
 Születési családi név,  
 Születési utónév,  
 Születési hely,  
 Születési dátum,  
 Anyja születési családi neve,  
 Anyja születési utóneve,  
 Lakcím irányítószám,  
 Lakcím város,  
 Lakcím utca,  
 Lakcím házszám,  
 Telefonszám,  
 e-mail,  
 Adminisztrátor (igen/nem)  
 
 **Kölcsönzések** egyedet jellemzi:  
 Példány_id				(Ez mutat a Példány tábla vonalkód mezőjére.)  
 Olvasó					(Mutat a kölcsönzőre.)  
 Kölcsönzés_kezdete	  
 Kölcsönzés_vége		(Ha null ki van adva a mű.)  
 Kiadta					(Mutat a könyvtárosra.)  
 Visszavételezte		(Mutat a könyvtárosra.)  
 Hosszabbítva
 
 
### 9.1 Logikai adatmodell 

### Egyed-Kapcsolat diagram
  
 ![Egyed-kapcsolat diagram](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/ER.png)   
   
### Adatbázis séma
  
 ![Relációsémák](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/Relacios.png)  
   
 ** Az adatbázis relációs sémái a létrehozás sorrendjében**  
 A táblák felvételének sorrendjében    
 Olvaso \[\ #Olvasojegyazonosito, Jelszo, Felhasználoi_nev, Tagság_ervenyesseg, Csaladi_nev, Utonev, Szuletesi_csaladi_nev, Szuletesi_utonev, Szuletesi_hely, Szuletesi_datum, Anyja_szuletesi_csaladi_neve, Anyja_szuletesi_utoneve, Lakcim_iranyitoszam, Lakcim_varos, Lakcim_utca, Lakcim_hazszam, Telefonszam, e-mail]  
 Konyv \[\ #ISBN, Szerzo(k), Cim, Kiado, Kiadasi_ev, Cutter, ETO_jelzet, Oldalak_szama, Targyszavak]  
 Peldany \[\ #Azonosito, ISBN, Leltarbavetel_datuma, Megjegyzes]  
 Konyvtaros \[\ #Felhasználoi_nev, Jelszo, Csaladi_nev, Utonev,Szuletesi_csaladi_nev, Szuletesi_utonev,	Szuletesi_hely, Szuletesi_datum, Anyja_szuletesi_csaladi_neve,Anyja_szuletesi_utoneve,Lakcim_iranyitoszam, Lakcim_varos,Lakcim_utca, Lakcim_hazszam, Telefonszam, e-mail, Adminisztrator]  
 Kolcsonzesek \[\ #Peldany_id, #Olvaso, #Kölcsönzés_kezdete, Kölcsönzés_vege, Kiadta, Visszavetelezte, Hosszabbitva]  
 
### 9.2 Tárolt eljárások 

### 9.3 Fizikai adatmodellt legeneráló SQL szkript   

**A táblákat létrehozó parancsok**    
 
Create TABLE Olvasok(Olvasojegy_azonosito  CHAR(8) PRIMARY KEY,   
Felhasznaloi_nev VARCHAR(40) NOT NULL, 
Jelszo CHAR(40) NOT NULL,  
Tagsag_ervenyesseg DATE NOT NULL,  
Csaladi_nev VARCHAR(40) NOT NULL,  
Utonev VARCHAR(40) NOT NULL,  
Szuletesi_csaladi_nev VARCHAR(40),    
Szuletesi_utonev VARCHAR(40),  
Szuletesi_hely VARCHAR(40) NOT NULL,  
Szuletesi_datum DATE NOT NULL,  
Anyja_szuletesi_csaladi_neve VARCHAR(40) NOT NULL,  
Anyja_szuletesi_utoneve VARCHAR(40) NOT NULL,  
Lakcim_iranyitoszam INTEGER NOT NULL,  
Lakcim_varos VARCHAR(40) NOT NULL,   
Lakcim_utca VARCHAR(40) NOT NULL,   
Lakcim_hazszam VARCHAR(40) NOT NULL,  
Telefonszam CHAR(11),  
Email VARCHAR(40));   

CREATE TABLE Konyvek(ISBN VARCHAR(13) PRIMARY KEY,  
Szerzok VARCHAR(200) NOT NULL,   
Cim VARCHAR(50) NOT NULL,   
Kiado VARCHAR(50),   
Kiadasi_ev INTEGER,   
Cutter VARCHAR(3),  
ETO_jelzet VARCHAR(10),  
Oldalak_szama INTEGER,  
Targyszavak VARCHAR(100));  

CREATE TABLE Peldanyok(Azonosito CHAR(13) PRIMARY KEY,   
ISBN VARCHAR(13) NOT NULL REFERENCES Konyv(ISBN),   
Leltarbavetel_datuma DATE NOT NULL,  
Megjegyzes VARCHAR(100));  
 
CREATE TABLE Konyvtarosok(Felhasznaloi_nev varchar(20) PRIMARY KEY,  
Jelszo CHAR(40) NOT NULL,  
Csaladi_nev VARCHAR(40) NOT NULL,  
Utonev VARCHAR(40) NOT NULL,  
Szuletesi_csaladi_nev VARCHAR(40),   
Szuletesi_utonev VARCHAR(40),  
Szuletesi_hely VARCHAR(40) NOT NULL,  
Szuletesi_datum DATE NOT NULL,  
Anyja_szuletesi_csaladi_neve VARCHAR(40) NOT NULL,  
Anyja_szuletesi_utoneve VARCHAR(40) NOT NULL,  
Lakcim_iranyitoszam INTEGER NOT NULL,  
Lakcim_varos VARCHAR(40) NOT NULL,  
Lakcim_utca VARCHAR(40) NOT NULL,  
Lakcim_hazszam Varchar(40) NOT NULL,  
Telefonszam CHAR(11),  
Email VARCHAR(40) NOT NULL,  
Adminisztrator INTEGER NOT NULL);  

CREATE TABLE Kolcsonzesek(   
Peldany_id CHAR(13) NOT NULL REFERENCES Peldany(azonosito),   
Olvaso CHAR(8) NOT NULL REFERENCES Olvaso(olvasojegy_azonosito),   
Kolcsonzes_kezdete DATE NOT NULL,   
Kolcsonzes_vege DATE,   
Kiadta VARCHAR(20) NOT NULL REFERENCES Konyvtaros(Felhasznaloi_nev),   
Visszavetelezte VARCHAR(20) REFERENCES Konyvtaros(Felhasznaloi_nev),   
Hosszabbitva integer,  
PRIMARY KEY(Peldany_id, Olvaso, Kolcsonzes_kezdete));

**Felhasználókat és jogokat létrehozó parancsok**  

CREATE USER konyvtaros IDENTIFIED BY '1212';  
GRANT SELECT, INSERT, UPDATE, DELETE ON Konyvtar.\* TO konyvtaros;  

CREATE USER olvaso IDENTIFIED BY '3434';  
GRANT SELECT ON Konyvtar.\* TO olvaso;  
GRANT UPDATE ON Konyvtar.Olvasok TO olvaso;  

## 10. Implementációs terv

A webszerveren futó php program tartalmazza az üzleti logikát.
A felhasználói felület, ami böngészőben megjelenő weboldalak formájában érhető el HTML, CSS, és JavaScript technológiák felhasználásával készülnek.
A programok objektum orientált programozási paradigma használatával, MVC modell használata mellett.  
MySql adatbázis szervert használunk az adatok tárolására.

### 10.1 Perzisztencia osztályok 

### 10.2 Üzleti logika osztályai

### 10.3 Kliens oldal osztályai 

## 11. Tesztterv   
   
A rendszerterv szerint implementált szoftver tesztelésének célja, hogy ellenőrizze az *Üzleti folyamatok modellje* című pontban 
meghatározott folyamatok helyes, specifikáció szerinti lefutását, valamint hogy a kliens webes felület felhasználóbarát módon 
jelenik meg, és használható különböző hardver és szoftverkörnyezetben.  

A tesztelés során használt kiszolgáló hardverkonfigurációja a telepítés során használt hardverrel kompatibilis, teljesítményben 
(processzor, operatív memória, háttértár) nem tér el jelentősen. A telepítéshez természetesen az általunk ajánlott konfiguráció
kerül beszerzésre a felhasználó könyvtár által.  

A tesztelés során használt kliens hardverek a napjainkban általánosan elterjedt hardverkonfigurációjú PC-k illetve laptopok, 
melyeken a leggyakrabban használt böngészőkön (Google Chrome, Mozilla Firefox, Microsoft Edge) teszteljük a rendszert az alábbiakban
részletezettek szerint. A minimum hardverkonfiguráció: Intel Celeron processzor, 4GB RAM, 128GB HDD, a képernyők felbontása: 
1280x1024, 1920x1080.  

A tesztelés során az üzleti folyamatokhoz tartozó különböző forgatókönyvek eredményét vizsgáljuk. Amennyiben az elvártnak megfelelő 
eredményt kapjuk, a teszteset sikeresnek tekinthető, ellenkező esetben a hibát rögzítjük a tesztjegyzőkönyvben. Ezt követően a feljegyzett 
hibákat javítjuk a szoftverben, és újbóli tesztelésnek vetjük alá a rendszert.  

A rendszer alábbiakban leírt tesztelésének előfeltétele, hogy az adatbázisba phpMyAdmin segítségével felvegyünk egy első adminisztrátori 
jogosultsággal rendelkező felhasználót a Könyvtáros táblába. Felhasználónév: admin, a további adatok a fejlesztő-tesztelő személyes adatai 
lesznek. Ezzel belépve tudjuk tesztelni a könyvtáros adminisztrátor kivételes funkcióját, mely a könyvtárosok adminisztrációja.


### 11.1 Tesztelt üzleti folyamatok adminisztátor könyvtárosok számára:  

**A) Belépés a rendszerbe:**  
A kezdőoldalról be tud lépni a rendszerbe a felhasználónevévek és jelszavának megadásával. Az adminisztrátorok minden funkciót elérnek, 
melyeknek meg kell jelenni a navigációs sávban.  

**Tesztesetek:**  
1. Nem regisztrált felhasználónév-jelszó kombináció. Elvárt eredmény: a rendszer hibaüzenetben jelzi ezt a felhasználó számára.
2. Regisztrált felhasználónév-jelszó kombináció. Elvárt eredmény: a rendszer belépteti a felhasználót, navigációs sáv megváltozik.  


**B) Könyvtáros regisztrálása:**  
A megjelenő űrlapot az adminisztrátor a könyvtáros, alábbi táblázatban szereplő adataival kitölti. Ha olyan könyvtárost regisztrál, 
aki adminisztrátori jogosultságokkal is fog rendelkezni, akkor bejelöli az 'Adminisztrátori jogosultság' mezőt. 
Az űrlap mezői és a bevitt adatokkal szemben támasztott követelmények:  

||Űrlap mező|Követelmények||
|-|---------|-------------|-|
||Felhasználó név|1. Kötelező 2. Nem lehet egy már regisztrált felhasználónév 3. Minimum 5 karakter hosszú legyen, betűk és számok szerepelhetnek benne ||
||Jelszó|1. Kötelező 2. Minimum 8 karakter hosszú, regisztrációkor a születési dátum 8 számjegye||
||Családi név|1. Kötelező 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik, több névtagból is állhat||
||Utónév|1. Kötelező 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik, több névtagból is állhat||
||Születési családi név|1. Opcionális 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik, több névtagból is állhat||
||Születési utónév|1. Opcionális 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik, több névtagból is állhat||
||Születési hely|1. Kötelező 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik||
||Születési dátum|1. Kötelező 2. Kötött dátum formátum: éééé.hh.nn vagy éééé-hh-nn||
||Anyja születési családi neve|1. Kötelező 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik, több névtagból is állhat||
||Anyja születési utóneve|1. Kötelező 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik, több névtagból is állhat||
||Lakcím, irányítószám|1. Kötelező 2. Kötött formátumú: 4 számjegy||
||Lakcím, város|1. Kötelező 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik||
||Lakcím, utca|1. Kötelező 3. Nagybetűvel kezdődik, több névtagból is állhat és valamely közterület megnevezést tartalmaz (utca, út, tér, stb.)||
||Lakcím, házszám|1. Kötelező||
||Telefonszám|1. Kötelező 2. Kötött formátumú: 11 számjegy||
||E-mail cím|1. Kötelező 2. Kötött formátumú: fióknév@domainnév, domainnév létező domainnév legyen||
||Adminisztrátori jogosultság|1. Opcionális, checkbox ||    

További követelmény, hogy azonos személyes adatokkal (Családi név, Utónév, Születési hely, Születési dátum, Anyja születési családi neve,
Anyja születési utóneve) már regisztrált felhasználót ne lehessen újra regisztrálni. Valamint, hogy a szöveg jellegű mezőkbe bevitt adatok 
hossza nem haladhatja meg az adatbázisban felvett maximális hossz értékét.  

**Tesztesetek:**  
1. Bevitt adatok helyesek, megfelelnek a követelményeknek.  
Elvárt eredmény:  
a) A Könyvtáros táblában megjelenik a regisztrált felhasználó rekordja az űrlapban megadott értékekkel. Ellenőrzés a Könyvtáros/Adatmódosítás almenüponton keresztül.  
b) A regisztrált könyvtáros be tud lépni a rendszerbe a weboldal kezdőoldalán található Belépés menüponton keresztül a megadott 
felhasználónévvel és jelszóval, és a jogosultságának megfelelő navigációs sáv elérhető számára.  
c) A könyvtáros a rendszerbe való belépést követően a *Személyes adatok* menüpontra kattintva tudja ellenőrizni a felvett adatokat.  
2. Bevitt adatok között szerepelnek a fenti követelményeknek nem megfelelő adatok.  
Elvárt eredmény: a rendszer hibaüzenetben jelzi a felhasználó számára a hibákat, az adatbázisban nem jelenik meg új rekord a Könyvtáros táblában. 
Ellenőrzés az 1. pont szerint.   


**C) Könyvtáros adatainak módosítása:**  
Adatok módosítása esetén az adminisztrátor először lekéri a könyvtáros 'adatlapját', melyet a könyvtáros felhasználói nevének megadása után 
tud megtenni, vagy a személynév beírását követően egy találati listából választja ki a lakcím, születési dátum adatok alapján. 
Az űrlap megegyezik a regisztrációnál megjelenő űrlappal, csak a Felhasználó név és Jelszó mezők nem szerepelnek. 
Ezekből kifolyólag a bevitt adatoknak ugyanazoknak a formai követelményeknek kell megfelelniük, 
melyek a fenti táblázatban szerepelnek. Ugyanakkor nem minden személyes adat módosítható természetüknél fogva, ezek az űrlapon nem módosítható
mezőkként szerepelnek. A módosítható adatok listája:  

||Űrlap mező||
|-|---------|-|
||Családi név||
||Utónév||
||Lakcím, utca||
||Lakcím, irányítószám||
||Lakcím, város||
||Lakcím, házszám||
||Telefonszám||
||E-mail cím||
||Adminisztrátori jog||  

**Tesztesetek:**  
1. Azonosítás nem regisztrált felhasználói nevű könyvtárosra. Elvárt eredmény: a rendszer üzenetben jelzi ezt a felhasználó számára.  
2. Azonosítás regisztrált könyvtárosra. Elvárt eredmény: a rendszer megjeleníti az űrlapot az adatbázisban szereplő adatokkal.
3. Keresés személynév alapján nem regisztrált könyvtárosra. Elvárt eredmény: a rendszer üzenetben jelzi ezt a felhasználó számára.  
4. Keresés személynév alapján regisztrált könyvtárosra. Elvárt eredmény: a könyvtáros megjelenik egy listában, melyből ki lehet 
választani, ezt követően jelenik meg az űrlap az adatbázisban szereplő adatokkal.
5. Adatmódosítás helyes adatokkal. Elvárt eredmény: a megfelelő rekord módosul a Könyvtáros táblában. Adminisztrátor könyvtárosként 
az Adatok módosítása űrlap újbóli megjelenítésével ellenőrizhető a módosítás. A könyvtáros, akinek az adatait módosítottuk, a rendszerbe 
való belépést követően a *Személyes adatok* menüpontra kattintva tudja ellenőrizni a módosításokat.  
6. Adatmódosítás követelményeknek nem megfelelő adatokkal. Elvárt eredmény: a rendszer hibaüzenetben jelzi a felhasználó számára a hibát, 
az adatbázisban nem módosul rekord a Könyvtáros táblában. Ellenőrzés az 5. pont szerint.   


**D) Könyvtáros törlése:**  
Könyvtáros adatbázisból való törlése esetén az adminisztrátor először lekéri a könyvtáros 'adatlapját', melyet a könyvtáros felhasználói nevének 
vagy személynevének megadása után tud megtenni. Az űrlap megegyezik az Adatok módosítása űrlappal, viszont ezen az űrlapon a mezők egyike 
sem módosítható. Ezt követően a *Könytáros törlése nyilvántartásból* gomb megnyomása után üzenetben jelzi a rendszer a folyamat végét.  

**Tesztesetek:**  
1. Azonosítás nem regisztrált felhasználói nevű könyvtárosra. Elvárt eredmény: a rendszer üzenetben jelzi ezt a felhasználó számára.  
2. Azonosítás regisztrált könyvtárosra. Elvárt eredmény: a rendszer megjeleníti az űrlapot az adatbázisban szereplő adatokkal.
3. Keresés személynév alapján nem regisztrált könyvtárosra. Elvárt eredmény: a rendszer üzenetben jelzi ezt a felhasználó számára.  
4. Keresés személynév alapján regisztrált könyvtárosra. Elvárt eredmény: a könyvtáros megjelenik egy listában, melyből ki lehet 
választani, ezt követően jelenik meg az űrlap az adatbázisban szereplő adatokkal.
5. Sikeres azonosítást vagy keresést követően könyvtáros törlése. Elvárt eredmény: a megfelelő rekord törlődik a Könyvtáros táblából az adatbázisban. 
Ellenőrzés: a Könyvtáros/Adatok módosítása menüponton keresztül nem található a könyvtáros a nyilvántartásban.


### 11.2 Tesztelt üzleti folyamatok könyvtárosok számára:

Az alábbiakban tesztelt üzleti folyamatok az adminisztrátor könyvtárosok esetén is érvényesek, azonban külön nem szükséges tesztelni esetükben.
Az egyetlen különbség a Belépés esetén van.

**Belépés a rendszerbe:**  
Az adminisztrátor által előzetesen felvett könyvtáros a kezdőoldalról be tud lépni a rendszerbe a felhasználónevévek és jelszavának megadásával. 
A navigációs sávban a jogosultságának megfelelő menüpontok jelennek meg számára. (Lásd: Menühierarchia fejezet.)

**Tesztesetek:**  
1. Nem regisztrált felhasználónév-jelszó kombináció. Elvárt eredmény: a rendszer hibaüzenetben jelzi ezt a felhasználó számára.
2. Regisztrált felhasználónév-jelszó kombináció. Elvárt eredmény: a rendszer belépteti a felhasználót, navigációs sáv megváltozik, 
Könyvtáros menüpont nem elérhető.


### 11.2.1 Olvasók adminisztrációjának tesztelése:

**A) Olvasó regisztrálása a rendszerben:**  
A könyvtáros az *Olvasó* menü, *Beiratkozás* menüpontjára kattintva elkezdi a regisztrációt. A megjelenő űrlapon az olvasótól elkért, 
alábbi táblázat szerinti adatokat felviszi. A könyvtáros előkészít egy üres olvasójegyet. A Beiratkozás űrlap *Olvasójegy azonosító* 
mezőjébe belekattint, és a vonalkód olvasóval beolvassa az olvasójegyen lévő vonalkódot. Ha befejezte az adatok felvitelét az 
*Olvasó felvétele a nyilvántartásba* gombra kattint.  

||Űrlap mező|Követelmények||
|-|---------|-------------|-|
||Felhasználó név|1. Kötelező 2. Nem lehet egy már regisztrált felhasználónév 3. Minimum 5 karakter hosszú legyen, betűk és számok szerepelhetnek benne ||
||Jelszó|1. Kötelező 2. Minimum 8 karakter hosszú, regisztrációkor a születési dátum 8 számjegye||
||Családi név|1. Kötelező 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik, több névtagból is állhat||
||Utónév|1. Kötelező 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik, több névtagból is állhat||
||Születési családi név|1. Opcionális 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik, több névtagból is állhat||
||Születési utónév|1. Opcionális 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik, több névtagból is állhat||
||Születési hely|1. Kötelező 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik||
||Születési dátum|1. Kötelező 2. Kötött dátum formátum: éééé.hh.nn vagy éééé-hh-nn||
||Anyja születési családi neve|1. Kötelező 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik, több névtagból is állhat||
||Anyja születési utóneve|1. Kötelező 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik, több névtagból is állhat||
||Lakcím, irányítószám|1. Kötelező 2. Kötött formátumú: 4 számjegy||
||Lakcím, város|1. Kötelező 2. Nem tartalmazhat számjegyet, nagybetűvel kezdődik||
||Lakcím, utca|1. Kötelező 3. Nagybetűvel kezdődik, több névtagból is állhat és valamely közterület megnevezést tartalmaz (utca, út, tér, stb.)||
||Lakcím, házszám|1. Kötelező||
||Telefonszám|1. Opcionális 2. Kötött formátumú: 11 számjegy||
||E-mail cím|1. Opcionális 2. Kötött formátumú: fióknév@domainnév, domainnév létező domainnév legyen||
||Olvasójegy azonosító|1. Kötelező 2. Vonalkód olvasó esetén automatikus 3. Kötött formátumú: 13 számjegy||    
||Tagság érvényessége|1. Automatikus, az regisztrációtól számított 1 év 2. Dátum formátumú: éééé.hh.nn||
  
További követelmény, hogy a szöveg jellegű mezőkbe bevitt adatok hossza nem haladhatja meg az adatbázisban felvett maximális hossz értékét.  

**Tesztesetek:**  
1. Bevitt adatok helyesek, megfelelnek a követelményeknek.  
Elvárt eredmény:  
a) Az Olvasó táblában megjelenik a regisztrált felhasználó rekordja az űrlapban megadott értékekkel. Ez az Olvasó/Adatok módosítása menüponton 
keresztül ellenőrizhető az olvasó olvasójegy azonosítójának beolvasása vagy személynevére való keresést követően könyvtárosként.  
b) A regisztrált olvasó be tud lépni a rendszerbe a weboldal kezdőoldalán található Belépés menüponton keresztül a megadott 
felhasználónévvel és jelszóval, és a megfelelő navigációs sáv elérhető számára. (Lásd: Menühierarchiák fejezet)   
c) Az olvasó a rendszerbe való belépést követően a *Személyes adatok* menüpontra kattintva tudja ellenőrizni a felvett adatokat.  
2. Bevitt adatok között szerepelnek a fenti követelményeknek nem megfelelő adatok.  
Elvárt eredmény: a rendszer hibaüzenetben jelzi a könyvtáros számára a hibákat, az adatbázisban nem jelenik meg új rekord az Olvasó táblában. 
Ellenőrzés az 1. pontnak megfelelően.  

**Megjegyzés:**  
Amíg a rendszer teszteléséhez nem áll rendelkezésre vonalkód olvasó készülék, illetve vonalkód matricák, melyeket az olvasójegyre 
ragasztanak azonosítóként, az olvasójegy azonosító mezőt manuálisan töltjük ki egy megfelelő számsorozattal.   


**B) Olvasó adatainak módosítása:**  
Adatok módosítása esetén a könyvtáros először lekéri az olvasó 'adatlapját', melyet vagy az olvasót egyértelműen azonosító 
*Olvasójegy azonosító* vonalkód leolvasóval történő bevitelével tud megtenni, vagy a név beírását követően egy találati listából választja ki
a lakcím, születési dátum adatok alapján. Az adatokat tartalmazó űrlap megegyezik a regisztrációnál megjelenő 
űrlappal, csak a Felhasználó név és Jelszó mezők nem szerepelnek. Ezekből kifolyólag a bevitt adatoknak ugyanazoknak a formai és tartalmi 
követelményeknek kell megfelelni, melyek a fenti táblázatban szerepelnek. Ugyanakkor nem minden személyes adat módosítható természetüknél fogva, 
ezek az űrlapon nem módosítható mezőkként szerepelnek. A módosítható adatok listája:  

||Űrlap mező||
|-|---------|-|
||Családi név||
||Utónév||
||Lakcím, utca||
||Lakcím, irányítószám||
||Lakcím, város||
||Lakcím, házszám||
||Telefonszám||
||E-mail cím||

**Tesztesetek:**  
1. Azonosítás olvasójegy alapján nem regisztrált olvasóra. Elvárt eredmény: a rendszer üzenetben jelzi ezt a felhasználó számára.  
2. Azonosítás olvasójegy alapján regisztrált olvasóra. Elvárt eredmény: a rendszer megjeleníti az űrlapot az adatbázisban szereplő adatokkal.  
3. Keresés név alapján nem regisztrált olvasóra. Elvárt eredmény: a rendszer üzenetben jelzi ezt a felhasználó számára.  
4. Keresés név alapján regisztrált olvasóra. Elvárt eredmény: a rendszer megjeleníti a találati listát, melyben kiválasztva az olvasót,
megjeleníti az űrlapot az adatbázisban szereplő adatokkal.  
5. Adatmódosítás helyes adatokkal. Elvárt eredmény: a megfelelő rekord módosul az Olvasó táblában. Az ellenőrzést könyvtárosként az 
Olvasó/Adatok módosítása menüponton keresztül lehet elvégezni. A rendszerbe olvasóként való belépést követően 
a *Személyes adatok* menüpontra kattintva lehet ellenőrizni a módosításokat.  
6. Adatmódosítás követelményeknek nem megfelelő adatokkal. Elvárt eredmény: a rendszer hibaüzenetben jelzi a könyvtáros számára a hibát,
 az adatbázisban nem módosul rekord az Olvasó táblában. Ellenőrzés az 5. pont szerint.


**C) Tagság rendezése:**   
A tagság rendezése esetén az olvasó tagságának érvényessége automatikusan meghosszabbítódik vagy az aktuális dátumtól kezdődő egy évre, vagy
a tagság lejáratának dátumától egy évre. Az olvasó azonosítása a módosítással analóg módon történik, a megjelenő űrlapon minden mező csak olvasható,
egy gomb szolgál a hosszabbítás végrehajtására.  

**Tesztesetek:**  
1. Azonosítás olvasójegy alapján nem regisztrált olvasóra. Elvárt eredmény: a rendszer hibaüzenetben jelzi ezt a felhasználó számára.  
2. Azonosítás olvasójegy alapján regisztrált olvasóra. Elvárt eredmény: a rendszer megjeleníti az űrlapot az adatbázisban szereplő adatokkal, 
a tagság érvényessége mezőben a fentieknek megfelelő dátum szerepel. A véglegesítést követően az adatbázisban az Olvasó tábla megfelelő rekordja 
frissül, mely az Adatok módosítása menüpontban is ellenőrizhető.
3. Keresés név alapján nem regisztrált olvasóra. Elvárt eredmény: a rendszer hibaüzenetben jelzi ezt a felhasználó számára.  
4. Keresés név alapján regisztrált olvasóra. Elvárt eredmény: a rendszer megjeleníti a találati listát, melyben kiválasztva az olvasót, 
a rendszer megjeleníti az űrlapot az adatbázisban szereplő adatokkal, a tagság érvényessége mezőben a fentieknek megfelelő dátum szerepel. 
A véglegesítést követően az adatbázisban az Olvasó tábla megfelelő rekordja frissül, mely az Adatok módosítása menüpontban is ellenőrizhető.  


**D) Lejárt tagságú olvasók:**  
E funkció szolgál az 5 évnél régebben lejárt tagságú olvasók listázására, majd törlésére. A tesztet egy hamis olvasó rekorddal tudjuk elvégezni, 
melyet phpMyAdmin-ban viszünk fel az Olvasó táblába.

**Tesztesetek:**  
1. A lejárt tagságú olvasó megjelenik a listában, majd kijelölés nélkül a törlés gomb megnyomását követően az adatbázis Olvasó táblájában továbbra is 
szerepel a hozzá tartozó rekord.  
2. A lejárt tagságú olvasó megjelenik a listában, majd törlést követően az adatbázis Olvasó táblájában nem szerepel a hozzá tartozó rekord, mely 
ellenőrizhető a menüpont újbóli kiválasztásával.  


### 11.2.2 Katalógus adminisztrációjának tesztelése:  

**A) Új könyv regisztrációja:**  
A könyvtáros a *Katalógus* menü *Új könyv felvétele* menüpontra kattint és elkezdi a regisztrációt. A megjelenő űrlapon a könyv alábbi 
táblázatban szereplő adatait felviszi. Ha befejezte az adatok felvitelét az *Könyv felvétele katalógusba* gombra kattint.  

||Űrlap mező|Követelmények||
|-|---------|-------------|-|
||Szerző(k)|1. Kötelező 2. Nem tartalmazhat számot 3. Kötött formátum: a)szerző neve: családnév, utónév b)szerzők elválasztása: pontosvesszővel és szóközzel ||
||Cím|1. Kötelező||
||Kiadó|1. Kötelező||
||Kiadási év|1. Kötelező 2. Kötött formátum: 4 számjegy (évszám) 3. Hitelesség (évszám > 1900 és évszám <= aktuális év)||
||ISBN száma|1. Kötelező 2. Kötött formátum: 13 jegyű (a 2007. január 1. előtt kiadott könyveknél 10 jegyű)||
||Oldalak száma|1. Kötelező 2. Kötött formátum: pozitív egész szám||
||Cutter|1. Kötelező 2. Kötött formátum: \[3jegyű szám.szám\] nagybetű(-szóköz-)szám||
||ETO jelzet|1. Kötelező 2. Kötött formátum: 3jegyű szám.szám ||
||Tárgyszavak|1. Kötelező 2. Kötött formátum: kisbetűs szavak, szóösszetételek vesszővel elválasztva||
||Azonosító|1. Kötelező 2. Kötött formátum: 13 jegyű vonalkód azonosító 3. Egyedi minden példány esetén||
  
További követelmény, hogy a szöveg jellegű mezőkbe bevitt adatok hossza nem haladhatja meg az adatbázisban felvett maximális hossz értékét.  

**Tesztesetek:**  
1. Teljesen új könyv (nem másodpéldány) felvétele katalógusba a fenti táblázatban szereplő követelményeknek megfelelő adatokkal. 
Elvárt eredmény: új rekord a Könyv táblában, és új rekord a Példány táblában az űrlapon szereplő adatokkal, a Példány külső 
kulcsa (ISBN) a Könyv ISBN mezőjével megegyezik. Az *Egyszerű keresés* és *Részletes keresés* művelet során kilistázza az új könyvet, 
ha megfelelő keresési feltételeket adunk meg.
2. Másodpéldány felvétele katalógusba a fenti táblázatban szereplő követelményeknek megfelelő adatokkal. Elvárt eredmény: új rekord 
az adatbázis Példány táblájában, megfelelő külső kulccsal a megadott ISBN számú Könyv rekordra. Az *Egyszerű keresés* és *Részletes keresés* 
művelet során kilistázza az új könyvet, ha megfelelő keresési feltételeket adunk meg.  
3. Új könyv felvétele során az adatbázisba már felvett könyv ISBN száma megadása úgy, hogy a szerző vagy a cím nem mutat egyezést. 
Elvárt eredmény: a rendszer hibaüzenetben jelzi, hogy az ISBN számhoz másik könyv tartozik.
4. A követelményeknek nem megfelelően kitöltött űrlap. Elvárt eredmény: a rendszer hibaüzenetben jelzi ezt a könyvtáros felhasználó számára. 
Nem jelenik meg új rekord az adatbázisban. Keresés eredménytelen.   


**B) Könyv leselejtezése:**  
Könyv leselejtezése abban az esetben szükséges, ha a könyv megrongálódott. A művelethez szükséges a könyvpéldányt azonosító vonalkód matrica. 
A megjelenő űrlap az alábbi mezőkből áll, melyek közül egyedül az azonosítót kötelező kitölteni, ezt követően az *Adatok lekérése* gombra 
kattintva megjelennek a könyv adatai, ezek az űrlap mezők csak olvashatók.  

||Űrlap mező||
|-|---------|-|
||Azonosító||
||ISBN száma||
||Szerző(k)||
||Cím||
||Kiadó||
||Kiadási év||
||Oldalak száma||
||Cutter||
||ETO jelzet||
||Tárgyszavak||

**Tesztesetek:**
1. Regisztrált könyvpéldány leselejtezése. Elvárt eredmény: Azonosító bevitelét és az adatok lekérését követően megjelennek a könyv adatai. 
A *Könyvpéldány törlése katalógusból* gombra kattintva az adatbázis Példány táblájából törlődik a megfelelő rekord. Keresés során ha az adott 
könyvből több példány van, a könyv adatlapján a példányok között nem szerepel a törölt azonosító. Ha csak egy példány volt a könyvből, 
a keresés eredménytelen.
2. Nem regisztrált könyvpéldány leselejtezése. Elvárt eredmény: Azonosító bevitelét és az adatok lekérését követően a rendszer hibaüzenetben 
jelzi, hogy az azonosítón nincs regisztrálva könyvpéldány.

**C) Egyszerű keresés:**   
Ezt a funkciót a rendszerbe való belépés előtt elegendő tesztelni, de rendelkezésre áll a felhasználók belépését követően is. Előfeltétele, hogy a 
fent részletezettek szerint sikeresen vegyünk fel új könyveket a katalógusba. Az űrlap egyetlen 'kulcsszó' mezőt tartalmaz, amely azonban több szóból 
állhat. (Pl. szerző esetén annak teljes neve.) A rendszer a Könyv egyedek szerző, cím, tárgyszavak attribútumait megvizsgálja, hogy tartalmazzák-e a megadott 
kulcsszavakat mint egész kifejezést, majd ha nem talál egyezést, az egyes kulcsszavakat külön-külön vizsgálja hogy a fenti attribútumok tartalmazzák-e.
 

**Tesztesetek:**
1. Tetszőleges könyv attribútum(ok) megadása, amely egy és csak egy regisztrált könyvvel mutat egyezést. 
Elvárt eredmény: a találati listában szerepeljen a könyv - többszörös egyezés esetén is csak egyszer -, 
a találati listában a könyvre kattintva annak összes mezőjét meg lehet tekinteni, illetve a könyvpéldányokra 
vonatkozó kölcsönzési információkat.  
2. Tetszőleges könyv attribútum(ok) megadása, amely több regisztrált könyvvel mutat egyezést. 
Elvárt eredmény: a találati listában szerepeljen mindegyik tesztelt könyv - többszörös egyezés esetén is csak egyszer -, 
a találati listában a könyvekre kattintva annak összes mezőjét meg lehet tekinteni, illetve a könyvpéldányokra 
vonatkozó kölcsönzési információkat.  
3. Tetszőleges könyv attribútum(ok) megadása, amely egyetlen regisztrált könyvvel sem mutat egyezést. 
Elvárt eredmény: a rendszer jelezze, hogy nem talált a keresési feltételnek megfelelő könyvet.


**D) Részletes keresés:**  
Ezt a funkciót a rendszerbe való belépés előtt elegendő tesztelni, de rendelkezésre áll a felhasználók belépését követően is. Előfeltétele, hogy a 
fent részletezettek szerint sikeresen vegyünk fel új könyveket a katalógusba. A részletes keresés esetén a Könyv minden attribútumát külön-külön 
meghatározhatjuk, melyeknek egyezést kell mutatni a keresett könyv megfelelő attribútumaival. A részletes keresés űrlap az alábbi mezőket tartalmazza:  

||Űrlap mező||
|-|---------|-|
||Szerző(k)||
||Cím||
||Kiadó||
||Kiadási év||
||ISBN száma||
||Oldalak száma||
||Cutter||
||ETO jelzet||
||Tárgyszavak||
||Azonosító||  

**Tesztesetek:**  
1. Tetszőleges könyv attribútum(ok) megadása, amely egy és csak egy regisztrált könyvvel mutat egyezést. 
Elvárt eredmény: a találati listában szerepeljen a könyv - többszörös egyezés esetén is csak egyszer -, 
a találati listában a könyvre kattintva annak összes mezőjét meg lehet tekinteni, illetve a könyvpéldányokra 
vonatkozó kölcsönzési információkat.  
2. Tetszőleges könyv attribútum(ok) megadása, amely több regisztrált könyvvel mutat egyezést. 
Elvárt eredmény: a találati listában szerepeljen mindegyik tesztelt könyv - többszörös egyezés esetén is csak egyszer -, 
a találati listában a könyvekre kattintva annak összes mezőjét meg lehet tekinteni, illetve a könyvpéldányokra 
vonatkozó kölcsönzési információkat.  
3. Tetszőleges könyv attribútum(ok) megadása, amely egyetlen regisztrált könyvvel sem mutat egyezést. 
Elvárt eredmény: a rendszer jelezze, hogy nem talált a keresési feltételnek megfelelő könyvet.  

**E) Teljes leltár:**  
A teljes leltárt évente egyszer végzik a könyvtárban, a ki nem kölcsönzött könyveket sorban leltárba veszik, ekkor a könyvpéldány 
leltárba vételi dátuma megváltozik. Ha minden könyvet leltárba vettek a *Teljes leltár vége* menüpontban lehet ellenórizni, hogy mely 
könyveket nem vettek leltárba azok közül, amelyek a katalógusban szerepelnek és nincsenek kikölcsönözve. A leltárba vétel a könyvek 
vonalkódos azonosítójának beolvasásával történik.  

**Tesztesetek:**  
1. A katalógusba felvett könyvek közül bizonyos könyveket nem veszünk leltárba. Elvárt eredmény: a leltárba nem vett könyvek a teljes leltár 
vége megnyomása esetén kilistázódnak. A többi könyv leltárba vételi dátuma a Példány táblában az aktuális dátum. 
2. A listában szereplő könyveket törlésre kijelöljük és megnyomjuk a *Könyv törlése katalógusból* gombot. Elvárt eredmény: a kijelölt könyvek 
rekordjai a Példány táblában törlésre kerülnek, így keresésük eredménytelen vagy nem szerepelnek a példányok listájában azonos könyvhöz tartozó 
több könyvpéldány esetén.

**F) Könyv kikölcsönzése:**  
A kölcsönzés első lépése a kölcsönző olvasó azonosítása. Ez történhet az olvasójegy vonalkód leolvasásával, vagy név alapján történő kereséssel. 
Ezt követően lehet a könyvek vonalkód azonosítóját beolvasva azokat kiadni.

**Tesztesetek:**  
1. Olvasójegy azonosító megadása, és Azonosítás gomb megnyomása. Elvárt eredmény: létező olvasó esetén az űrlapon megjelenik az olvasó teljes neve, 
tagságának érvényessége, valamint a kölcsönzési határidő, amely az aktuális dátumtól számított egy hónap.
2. Olvasó nevének megadása, és keresés megnyomása. Elvárt eredmény: létező olvasó esetén a találati listában megjelenik minden egyező nevű olvasó.
3. Olvasó kiválasztása találati listából, lakcím és születési dátum alapján. Elvárt eredmény: az űrlapon megjelenik az olvasó vonalkódos 
azonosítója, tagságának érvényessége, valamint a kölcsönzési határidő, amely az aktuális dátumtól számított egy hónap.
4. Kölcsönzésre kerülő könyvpéldány azonosítójának megadása, adatok lekérése, kikölcsönzés. Elvárt eredény: az adatok lekérését követően az 
űrlapon megjelennek a könyv adatai. A kölcsönzést követően a Kölcsönzések táblában megjelenik egy új rekord a megfelelő adatokkal. Ez ellenőrizhető 
a Kölcsönzés/Hosszabbítás menüponton keresztül, vagy ha belép az olvasó a rendszerbe a Könyveim menüpontra kattintva kilistázza kikölcsönzött könyveit.  
5. Már kikölcsönzött könyvpéldány azonosítójának megadása, adatok lekérése, kikölcsönzés. Elvárt eredény: a rendszer üzenetben jelzi, hogy a könyv nem 
kölcsönözhető ki.  

**G) Kölcsönzési határidő hosszabbítása:**  
A könyv hosszabbításának első lépése - az olvasó azonosítása - megegyezik a kölcsönzés első lépésével a fentiekben leírtak szerint. 
Ezt követően megjelenik egy lista kölcsönzött könyvek szerző, cím és azonosító adataival. A könyvek bejelölését követően a 
*Kölcsönzési határidő hosszabbítása* gombra kattintva a határidő az előző határidő plusz egy hónapra módosul. Ha már volt hosszabbítva vagy 
a késedelem meghaladja az 1 hónapot, akkor a rendszer üzenetben jelzi, hogy a hosszabbítás nem lehetséges.  

**Tesztesetek:**  
1. Olvasójegy azonosító megadása, és Azonosítás gomb megnyomása. Elvárt eredmény: létező olvasó esetén az űrlapon megjelenik az olvasó teljes neve 
az olvasójegy azonosítója mellett.    
2. Olvasó nevének megadása, és keresés megnyomása. Elvárt eredmény: létező olvasó esetén a találati listában megjelenik minden egyező nevű olvasó.  
3. Olvasó kiválasztása találati listából, lakcím és születési dátum alapján. Elvárt eredmény: az űrlapon megjelenik az olvasó vonalkódos 
olvasójegy azonosítója, tagságának érvényessége.  
4. Még nem hosszabbított kölcsönzés határidejének hosszabbítása. Elvárt eredmény: a Kölcsönzések táblában a 'Kolcsonzés_kezdete' dátum mező 
plusz egy hónappal módosul és a 'Hosszabitva' mező 1 értéket kap. Ellenőrzés a Hosszabbítás (könyvtáros által) vagy Könyveim (olvasó által) menüponton keresztül.  
5. Már meghosszabbított kölcsönzés határidejének hosszabbítása. Elvárt eredmény: a rendszer üzenetben jelzi, hogy ez nem lehetséges. 
A Kölcsönzések táblában a határidő nem módosul.   

**H) Könyv visszavétele:**  
A könyv visszavételének első lépése - az olvasó azonosítása - megegyezik a kölcsönzés első lépésével a fentiekben leírtak szerint. 
Ezt követően lehet a könyvek vonalkód azonosítóját beolvasva azokat visszavételezni. Ha határidőn túl hozta vissza az olvasó a könyveket 
a rendszer üzenetben jelzi a késedelem és a késedelmi díj értékét.

**Tesztesetek:**  
1. Olvasójegy azonosító megadása, és Azonosítás gomb megnyomása. Elvárt eredmény: létező olvasó esetén az űrlapon megjelenik az olvasó személyneve 
az olvasójegy azonosító mellett.
2. Olvasó nevének megadása, és keresés megnyomása. Elvárt eredmény: létező olvasó esetén a találati listában megjelenik minden egyező nevű olvasó.
3. Olvasó kiválasztása találati listából, lakcím és születési dátum alapján. Elvárt eredmény: az űrlapon megjelenik az olvasó vonalkódos 
azonosítója a név mellett.
4. Kikölcsönzött könyvpéldány azonosítójának megadása, adatok lekérése, visszavételezés. Elvárt eredény: az adatok lekérését követően az 
űrlapon megjelennek a könyv adatai. A visszavételezést követően a Kölcsönzések táblában az adott kölcsönzéshez tartozó rekordban a 
'Kolcsonzes_vege' mezőbe az aktuális dátum kerül.  
5. Visszavételezés vége. Lejárt határidővel kerül visszavételezésre a könyv, melyhez egy hamis rekordot veszünk fel a Kölcsönzések táblába. 
Elvárt eredmény: a rendszer jelzi a késedelmes napok számát és a késedelmi díj értékét a könyvtáros számára.  

**I) Lejárt kölcsönzési határidős könyvek:**  
Ezt a Kölcsönzés menüpontot választva a könyvtáros ki tudja listázni azokat a könyvpéldányokat, melyeket az olvasók nem hoztak vissza 
a kölcsönzési határidőn belül. Ez könyvtári gyakorlattól függ, hogy milyen eljárást alkalmaznak a lejárat jelzésére az olvasóknak, illetve 
hogy mikor törlik a katalógusból, mely lehet egy év de kettő is, megrendelőnk tájékoztatása alapján. Először természetesen e-mailben vagy 
postai úton értesítik az olvasót a határidő lejártáról, melyhez a felületen gombnyomásra a rendszer egy üzenetben kilistázza a szükséges adatokat. 
E művelet teszteléséhez először a Kölcsönzések táblába fel kell vennünk egy hamis rekordot egy regisztrált olvasóhoz, melyben a határidő lejárt.  

**Tesztesetek:**  
1. A hamis rekordot kilistázza a rendszer és megadja, hogy a határidőn túl hány nappal járt le. Checkbox kipipálása és Figyelmeztetendő olvasók 
gomb megnyomása esetén a rendszer egy üzenetben listázza a renitens olvasók nevét, elérhetőségét és lejárt határidős könyveit. 
2. A hamis rekordot kilistázza a rendszer és megadja, hogy a határidőn túl hány nappal járt le. Checkbox kipipálása és könyv törlése katalógusból 
művelet esetén az adatbázisból törlődik a kölcsönzésre vonatkozó rekord a Kölcsönzések táblából, és a könyvpéldány a Példány táblából. 
A lejárt könyvek újbóli listázása esetén a könyv nem jelenik meg a listában.  

### 11.3 Olvasói műveletek tesztelése:  
  
**A) Belépés a rendszerbe:**  
A kezdőoldalról be tud lépni a rendszerbe a felhasználónevévek és jelszavának megadásával. Az adminisztrátorok minden funkciót elérnek, 
melyeknek meg kell jelenni a navigációs sávban.  
  
**Tesztesetek:**  
1. Nem regisztrált felhasználónév-jelszó kombináció. Elvárt eredmény: a rendszer hibaüzenetben jelzi ezt a felhasználó számára.
2. Regisztrált felhasználónév-jelszó kombináció. Elvárt eredmény: a rendszer belépteti a felhasználót, navigációs sáv megváltozik.  
   
**A) Könyveim menüpont:**   
Az olvasó ezt a menüpontot választva tudja megnézni, hogy mely könyvek vannak kikölcsönözve nála aktuálisan. A megjelenő lista tartalmazza 
a könyv szerzőjét, címét, azonosítóját és a kölcsönzési határidőt.  
   
**Tesztesetek:**   
1. Az olvasónak előzetesen kikölcsönzünk könyveket könyvtárosként. Elvárt eredmény: a Könyveim menüpontra kattintva megjelenik a lista a kikölcsönzött
könyvekről.  
2. Az olvasónak nincsenek kikölcsönzött könyvei. Elvárt eredmény: a Könyveim menüpontra kattintva a rendszer üzenetben jelzi, hogy az olvasónak nincsenek 
kikölcsönzött könyvei.  
   
### 11.4 Személyes adatok kezelése:  

**A) Személyes adatok megjelenítése, elérhetőségek módosítása:**  
A rendszerbe való belépést követően elérhetővé válik minden felhasználó - olvasó, könyvtáros, adminisztrátor könyvtáros - számára. 
Az olvasók a könyvtárosok által felvett adatokat tudják ellenőrizni, a könyvtárosok az adminisztárok által felvett adatokat. 
Módosítani csak a telefonszámot és az e-mail címet lehetséges, a többi mező csak olvasható. Az alábbi űrlap jelenik meg:  


||Űrlap mező||
|-|---------|-|
||Családi név||
||Utónév||
||Születési családi név||
||Születési utónév||
||Születési hely||
||Születési dátum||
||Anyja születési családi neve||
||Anyja születési utóneve||
||Lakcím, irányítószám||
||Lakcím, város||
||Lakcím, utca||
||Lakcím, házszám||
||Telefonszám||
||E-mail cím||  
  
  
A telefonszám és e-mail cím formai követelményei megegyeznek az 'olvasó regisztrálása a rendszerben' pontban megadottakkal.  
  
**Tesztesetek:**  
1. E-mail cím és telefonszám módosítása. Elvárt eredmény: a bejelentkezett felhasználó típusának megfelelő - Olvasó vagy Könyvtáros - táblában 
a megfelelő mezők módosulnak. Ellenőrizhető ugyanezen menüponton keresztül.

**B) Jelszó cseréje:**  
A rendszerbe való belépést követően elérhetővé válik minden felhasználó - olvasó, könyvtáros, adminisztrátor könyvtáros - számára. 
Az űrlapon szükséges megadni a régi jelszót, és az új jelszót két mezőben. Ezt követően lehet módosítani azt. A jelszóval szembeni 
formai követelmény, hogy minimum 8 karakter hosszú legyen.   

**Tesztesetek:**  
1. Helyes régi jelszó, új jelszó mindkét mezőben ugyanaz. Elvárt eredmény: a jelszó módosul. A rendszerből való kilépést követően 
az újbóli belépés során az új jelszóval be tud lépni a felhasználó.
2. Hibás régi jelszó, nem egyező új jelszó mezők, vagy 8 karakternél rövidebb új jelszó megadása. Elvárt eredmény: a rendszer 
hibaüzenetben jelzi az adott hibát a felhasználó számára. A jelszó nem módosul.   


## 12. Telepítési terv
Fizikai telepítési terv:
-Szükség van egy adatbázis szerverre, amely közvetlenül csatlakozik a webszerververhez.
-A webszerverre közvetlenül az internetről kapcsolódnak rá a kliensek.

Szoftver telepítési terv:
-A szoftver webes felületéhez csak egy ajánlott a böngésző telepítése szükséges (
Google Chrome, Firefox, Opera, Edge) külön szoftver nem kell hozzá.


