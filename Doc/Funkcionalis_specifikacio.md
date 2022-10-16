# Funkcionális specifikáció

## 1. A rendszer céljai és nem céljai
A fejlesztés célja informatikai rendszer készítése a városi könyvtár számára, amely hatékonyabbá teszi a kölcsönzések folyamatának kezelését, az ehhez szükséges adatok tárolását és azok feldolgozását.
Annak érdekében, hogy a könyvtárosok számára minél könyebb legyen az átállás az új rendszer használatára, az általuk jelenleg használt manuális eszközökkel kezelt nyilvántartási rendszerhez hasonló módon kell működnie a megvalósított új informatikai rendszernek is.
A rendszer különböző feladatkörrel rendelkező felhasználói különböző jogosultságokkal rendelkeznek azzal kapcsolatban, hogy milyen műveleteket végezhetnek, ezeknek a kezelésének a megvalósítása felhasználói fiókok adminisztrációján keresztűl történik.
Meg kell valósítani a könyvtár katalógusának nyílvántartását, amely a kölcsönzésre rendelkezésre álló könyv példányokat tartalmazza, ennek a katalógusnak kereshetőnek, valamint bővíthetőnek kell lennie.
A könyvtárosok lesznek a rendszer fő felhasználói, ők végezik a katalógus karbantartását, az olvasók adminisztrációját, valalmint kezelik a kölcsönzésekhez szükséges műveleteket, ezért fontos, hogy az általuk használt funkciók ergonomiája minél jobb legyen, a lehető legjobban támogassák a hatékony munkavégzést. 
Azért, hogy a könyvtár kínálatát minél szélesebb körben megismerhessék, a fejlesztett rendszer része lesz egy, az interneten keresztűl elérhető nyílvános honlap is, amin keresztűl a könyvtár katalógusa regisztráció nélkül is kereshető lesz minden látogató számára.
A fejlesztés első ütemében a fő funkciók (felhasználók nyilvántartása és kezelése, könyvkatalógus nyilvántartása és adminisztrációja, kölcsönzési műveletek kezelése) megbízható működésének megvalósítása a célja, de nem cél a rendszer általánosabb felhasználásra történő felkészítése, mint pl. a könyveken kívűl más kölcsönözhető tételek kezelésének lehetősége.
Nem cél továbbá az sem, hogy a telepített rendszer központosított módon több könyvtárat is ki tudjon szolgálni, amennyiben a jövőben más könyvtárakban is kívánják a szovfvert használni, úgy mindegyikben külön kell telepíteni azt a helyi igények kiszolgálására.

## 2. Használati esetek
A rendszer használói a következők:
*	olvasó
*	könyvtáros
*	adminisztrátor
A rendszerhez tartozik még a kölcsönzés folyamata során használt vonalkód olvasó.

A rendszernek a következő funkciókat kell ellátnia:
*	az adminisztrátorok tudjanak könyvtárosokat regisztrálni és törölni
*	könyvtárosok tudjanak könyveket regisztrálni és törölni
*	könyvtárosok tudjanak olvasókat regisztrálni és törölni
*	könyvtárosok tudjanak könyveket kiadni és visszavenni
*	könyvtárosok az olvasók vagy könyvek listáját lekérdezhetik
*	olvasók belépés után meg tudják nézni a kölcsönzött könyveik listáját
*	olvasók belépés nélkül is tudnak keresni könyveket

Előfeltételek:
*	adminisztrátorok és könyvtárosok részére a rendszer használatához jogosultság, azaz jelszó szükséges
*	olvasóknak a kölcsönzéshez regisztráció szükséges

![usecase_dia](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/blob/main/Doc/image/usecasedia.jpg)

## 3. Megfeleltetés, hogyan fedik le a használati esetek a követelményeket
* K01, K02, K03: Az alkalmazást úgy hozzuk létre, hogy tartalmazza a kölcsönzők, könyvek és a kölcsönzés adminisztrációját, melyet a könyvtárosok felhasználó név/jelszó megadásával a rendszerbe belépve fognak elérni. Ezek fogják adni a rendszer fő funkcióit.
* K04: Különböző jogosultsági szinteket fogunk kialakítani. Az adminisztrátori jogosultsággal rendelkező könyvtárosok minden funkcióhoz hozzá fognak férni, felhasználói (könyvtáros/olvasó) fiókokat tudnak létrehozni/törölni. Könyvtárosok és az olvasó is jogosultságuk függvényében a rendszerbe belépve listákat és kimutatásokat tudnak lekérni.
* K05: A felhasználói felületet úgy alakítjuk ki, amely egy általános weboldal képét fogja nyújtani, az egyes funkciók egyértelmű elnevezést kapnak, és könnyen elérhetők lesznek.
* K06: A web alkalmazást úgy hozzuk létre, hogy rendszerbe való belépés nélkül is az online felületen keresztül is lehessen keresni könyveket az adatbázisban. 
* K07: A rendszer elkészítésekor ügyelünk a platformfüggetlen, robosztus működés kialakítására, ezért ellenőrizzük kódunk helyességét, hogy egy adott HTML elemet támogatják-e a böngészők, fontosabb alkalmazások és kisegítő technológiák. A HTML vizsgálathoz beleértjük a CSS vizsgálatot is. A teszteléseket elvégezzük Firefox, Chrome, Explorer, Opera, Safari böngészőkön, ill. Windows, Linux, iOs operációs rendszeren is.
* K08: A szabványos és elterjedt technológiák használata biztosítja. 
* K09: A kezelt adatokat MYSQL adatbázisban fogjuk tárolni. Az adatbázis használatával biztosítjuk az adatok bővíthetőségét. A applikációt PHP objektum orientált módon valósítjuk meg, amellyel új funkciókat könnyedén tudunk utólag hozzáadni a rendszerhez.
* K10: Azonos könyvtári folyamatok esetén a migrálás könnyedén megvalósítható, esetleges bővítések a K09 ponthoz írtak alapján gyorsan elérhetők. 

## 4. Képernyőtervek

A képernyőtervek egy html/css kód használatával megírt prototípus weboldal segítségével tekinthetők meg. A forrás fájlok a 
[prototype](https://github.com/beresgabor76/AFP2020_1_Lev_Csop2/tree/main/Doc/prototype) GitHub mappából tölthetőek le, ezt
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
nem szerepel az oldalán.  

- Az *Egyszerű keresés* és az *Részletes keresés* oldalak elérhetők a kezdőlapról és belépést követően is,
azonban a keresés eredménye oldalak a kezdőlapra visznek vissza, megváltozik a menürendszer, ez is tekinthető
a prototípus hiányosságának, azonban a keresési folyamatot így is demonstrálja a weboldal.

## 5. Forgatókönyvek

A *Kezdőlap* statikus oldal jelenik meg minden felhasználó számára legelőször, tartalmazza a könyvtár nyitvatartására, 
elérhetőségeire vonatkozó legfontosabb információkat valamint a könyvtárban tartott havi rendezvényeket. 
A navigációs sáv a *Kezdőlap*, *Tájékoztató*, *Katalógus* és *Belépés* menüpontokat tartalmazza, ezek a rendszerbe való
belépés előtt minden esetben megjelennek, a felhasználó bármelyik megjelenített oldalon kezdeményezheti az alább részletezett 
műveleteket vagy oldalak megjelenítését.  
- A *Tájékoztató* egy statikus oldal a kölcsönzőkre vonatkozó általános, a beiratkozással és az adatkezelési szabályokkal (GDPR) kapcsolatos 
tájékoztatást tartalmaz.  
- A *Katalógus* menüpont választása esetén lehetőség van anonim (belépés nélküli) könyvkeresésre. A felhasználó két lehetőség 
közül választhat, az egyszerű keresés esetén kulcsszavak, a részletes keresés esetén a könyvre vonatkozó részletes adatok
alapján tájékozódhat a felhasználó. Mindkét keresés esetén vagy egy találati lista vagy "Nincs a keresési feltételeknek megfelelő
könyv." üzenet az eredmény.  
- A *Belépés*-t választva olvasóként, könyvtárosként, illetve adminisztrátor könyvtárosként lehet belépni a rendszerbe. Hibás felhasználó név 
vagy jelszó megadása esetén újból meg kell adni az adatokat.  

Amennyiben a felhasználó **_adminisztrátori jogosultsággal rendelkező_ könyvtárosként** lép be a weboldalra, 
a *Kezdőlap* menüpont mellett az *Olvasó*, *Könyvtáros*, *Katalógus*, *Kölcsönzés* opciók jelennek meg mint legördülő menüpontok.
Bármely pontot is választja a felhasználó, ezek a menüpontok továbbra is elérhetők. Emellett a navigációs sáv jobb oldalán megjelenik 
a belépett felhasználó neve (pl. *Belépve: marika*), melyre rákattintva a *Személyes adatok*, *Jelszó csere*, *Kijelentkezés* pontok 
közül tud választani. A *Személyes adatok* űrlapon a felhasználó csak a telefonszámát és e-mail címét tudja módosítani, de ennek értelemszerűen 
csak abban az esetben van jelentősége, ha a felhasználó *olvasó vagy adminisztátori jogosultsággal nem rendelkező könyvtáros*.  

**_Adminisztrátori jogosultsággal nem rendelkező_ könyvtárosként** a fenti navigációs sávból hiányzik a *Könyvtáros* menüpont,
tehát ő nem vehet fel új könyvtárost, vagy módosíthatja adatait ill. törölheti a rendszerből.

Alábbiakban az adminisztrátori jogosultsággal rendelkező könyvtárosként ill. könyvtárosként végezhető műveleteket ismertetem.  
Az **_Olvasó_** menüponton belül az alábbi műveletek végzésére van lehetőség:  
- A *Beíratkozás* funkció használatával lehetőség van új tag felvételére a könyvtárba, az űrlap nem megfelelő kitöltése esetén - mely
	lehet egy hibás adatformátum bevitele, vagy ha már beíratkozott olvasót próbál felvenni a nyilvántartásba a könyvtáros - 
	hibaüzenetet kap, de a begépelt adatok nem vesznek el, tehát csak a hibás mezők módosítására van szükség.  
- Az *Adatok módosítása* pontot választva az olvasók minden személyes adatának változtatására mód van könyvtárosként, természetesen
    a szükséges dokumentumok (személyi igazolvány, lakcímkártya) bemutatását követően.  
- A *Tagság rendezése* nyomógomb segítségével lehet meghosszabítani a könyvtári tagságot, mely az aktuális dátumtól számított egy évre szól.  
- A *Kiíratkozás* menüpont értelemszerűen a tagság megszüntetését teszi lehetővé.  
- A *Lejárt tagságok* menüpont választása esetén a rendszer kilistázza a több, mint öt éve tagdíjat nem fizető könyvtári tagokat, 
	egyúttal lehetőséget biztosít ezek törlésére. E műveletek végrehajtását jelzi a rendszer egy rövid szöveges üzenetben.  
	
A **_Könyvtáros_** menüponton belül     
- a *Regisztráció* menüpont segítségével lehet elérni az új könyvtáros felvétele oldalt. Az adminisztrátor könyvtárosnak a 
	könyvtároshoz képest plusz funkcióként jelentkezik, hogy lehetősége van új könvtárost felvenni, vagy törölni a rendszerből.  
- Az *Adatok módosítása*, a könyvtárosok adatainak módosítását teszi lehetővé,  
- a	*Törlés* funkció pedig a könyvtáros rendszerből történő törlését. Ezeket szintén csak adminisztrátori jogkörrel rendelkező 
	könyvtárosok végezhetik el. E műveletek elvégzéséről is visszajelzést ad a rendszer.  
	
A **_Katalógus_** ponton keresztül    
- az *Egyszerű keresés* kulcsszavakon keresztüli keresést, míg  
- a *Részletes keresés* a könyv adatainak pontosabb ismerete alapján ad lehetőséget a katalógusban való keresésre.   
- Az *Új könyv felvétele* a könyvre vonatkozó adatok megadása alapján biztosít lehetőséget a katalógusba történő felvételre. 
Ha a könyvből több példányt is fel kell venni, a visszajelző üzenet lehetőséget biztosít a könyv másod(harmad...)példányának 
felvételére, az előzőleg kitöltött űrlapon már csak a könyv azonosítójául szolgáló vonalkód matricát kell leolvasni.  
- A *Könyv leselejtezése* lehetőséget biztosít megrongálódott könyvek katalógusból való törlésére. A művelet sikerességéről 
ebben az esetben is visszaigazolást ad a rendszer.  
- A *Lejárt határidős könyvek* funkció kilistázza a határidőn túl nem visszahozott könyveket. Lehetőség van figyelmeztető
	e-mail	küldésére, illetve a könyv törlésére a katalógusból.  
- A *Teljes leltár indítása* funkció segítségével indítható a leltározási folyamat, mely során a könyvtárban a polcokon 
elhelyezett könyvek vonalkódos azonosítójának leolvasása, és ezt követően a könyv adatainak ellenőrzés céljából történő lekérését 
követően a rendszer a katalógusban szereplő könyvpéldányhoz egy leltárba vételi dátumot rendel.
- A *Teljes leltár folytatása* menüpont az elindított leltározás közben végzett más műveletek esetén biztosítja a leltározási 
folyamat folytatását, könyvek leltárba vételét.  
- A *Teljes leltár vége* menüpont lehetőséget biztosít az aktuálisan leltárba vett könyvek között nem szereplő, nem kikölcsönzött, 
valószínűleg elveszett könyvek törlésére.  

A **_Kölcsönzés_** menüponton belül  
- a *Könyv kiadása* menüpontot választva először a könyvtárba beíratkozott tag azonosítására van szükség olvasójegye vonalkódjának 
leolvasása után, ennek hiánya esetén név megadását követően a személyes adatok alapján történő kiválasztására. Ezt követően a könyv 
vonalkódjának leolvasása, opcionálisan adatainak ellenőrzése után van lehetőség a könyv kiadására. A könyvek kölcsönzési határideje 
minden esetben az aktuális dátumtól számított 1 hónap, mely megjelenik az űrlapon. Ezt a dátumot valamint a kikölcsönzött könyvek 
számát a könyvtáros bejegyzi a kölcsönző olvasójegyébe.  
- A *Könyv visszavétele* menüpontnál szintén szükséges az olvasó azonosítása, majd a könyv megadása után visszavehető a mű, ebben 
az esetben szintén szükséges a könyvpéldány vonalkódos azonosítása.	Szükség esetén késedelmi díjat automatikusan számít a rendszer, 
erről tájékoztatja a felhasználót.  
- A	*Hosszabbítás* funkciónál a kölcsönző azonosítása az előzőekkel analóg, az aktuálisan kikölcsönzött könyveket a rendszer 
automatikusan kilistázza, ezután megoldható az egy hónapig történő hosszabbítás. Az új kölcsönzési határidőről visszaigazolást 
ad a rendszer, melyet a könyvtáros az olvasójegybe beír vagy szóban közöl az olvasóval telefonos megkeresés esetén.  
	
**Olvasó**-ként történő belépés esetén a felhasználó navigációs sávjában a *Kezdőlap*, *Katalógus* valamint szintén a felhasználó név
látható. Lehetőség van a kezdőlapra visszatérni, továbbá a *Katalógus*-ra történő navigáció a könyvtároséval megegyező egyszerű és 
részletes keresésre van lehetőség. A *Könyveim* menüpontra klikkelve az aktuálisan kikölcsönzött művek listázhatóak. A navigációs sáv 
jobb oldalán megjelenő felhasználó név (pl. *Belépve: gábor*) egy fentiekben már részletezett menüpont, melyek almenüi és azok 
funkciói teljesen megegyeznek a többi felhasználóéval.

## 6. Funkció–követelmény megfeleltetés
ID|Verzió|Követelmény|Funkció
--|------|---|--------
K01|V1.0|Olvasók adminisztrációja|Olvasók regisztrálása, törlése és adataik módosítása, amit a könyvtárosok végezhetnek a használati esetekben leírtak szerint.  
K02|V1.0|Könyvek adminisztrációja|Könyvek regisztrálása és törlése, amit a könyvtárosok végezhetnek a használati esetekben leírtak szerint.
K03|V1.0|Kölcsönzés adminisztrációja|Könyvek kezeresése, kiadása, visszavétele, amit a könyvtárosok végezhetnek a használati esetekben leírtak szerint.
K04|V1.0|Felhasználói fiókok kezelése|A felhasználók bejelentkezésének kezelése és a felhasználói adatok módosításának lehetőségének biztosítása. Könyvtárosok regisztrálása, törlése és adataik módosítása, amit az adminisztrátorok végezhetnek a használati esetekben leírtak szerint.  
K05|V1.0|Egyszerűen használható kezelőfelület|A felhasználói felület megvalósítása szabványos html, css és javascript technológiák felhasználásával, a képernyőtervek fejezetben láthatóan módon szerint. 
K06|V1.0|Online elérhető nyilvános katalógus|A honlapon elérhető és kereshető lesz a könyvtár katalógusa a látogatók számára bejelentkezés nélkül is.  
K07,K08|V1.0|Platformfüggetlen, robosztus működés és költséghatékony üzemeltetés| Szabványos, elterjedt paltformfüggetlen technológiák használata.
K09|V1.0|Bővíthetőség|Adatbáziskezelő rendszer használata, a tervezésnél figyelembe vesszük a későbbi bővítési igényeket.
K10|V1.0|Rendszer migrálása|A rendszer rövid időn belül bevezethető más könyvtárakban is ha a kezelni kívánt könyvtári feladatok ugyanazok.  


