# Könyvtári katalógus és nyilvántartó rendszer teszt jegyzőkönyv
## Tesztelést végezte: 	Tápai Árpád
## Api:			pixel 6 api 32
## Operációs rendszer:  Android 12l
## Dátum: 		2022.12.17.
## Talált hibák száma: 	2

# Main oldal tesztelése
- Ahogy elindítjuk az applikációt ez az oldal fogad minket kijelentkezett állapotban. 

### 	Oldal funkciók
  - A sign in gombra kattintva a sign in oldalra lépünk. Ha be vagyunk már jelentkezve, akkor itt az azonosítónk jelenik meg, és a profilunkra tudunk át jelentkezni.
  - A search mezőbe írva kihozza a keresett szöveghez hasonló illetve azonos kifejezéseket. Majd az enter lenyomása után befejeződik az elem keresése és a kereső mező 	alatti kártyák mezőben megtalálható a kívánt keresett kártyák. Az x megnyomása után törlődik a kereső mezőben lévő szöveg és az alapálapot jön létre.
		Keresés tesztelése:
 		-Tanár nevének a keresésére a megfelelő tanár kártyákat hozza ki.
		-A tantrágy nevének a keresésére a megfelelő tantárgyal rendelkező kártyákat hozza ki.
	Feature hiánya: nem lehet rákattintani a kihozott keresésekre és azonnal befejezni a keresést.
	BUg: Ha kitöröljük a keresett értéket nem tűnik el a keresés mező. 

 
Kártyák:
  - A kártyákat gördítve lehet betölteni.
  - Kép hiányában nem tölt be semmi képet.
  - Név hiányában nem tölt be semmi nevet.
  - Tantárgy , és ár hiányában nem tölt be semmi tantárgyat illetve árat.
  - Telefon gombra kattintva behozza a telefon hívás funkcióját és bemásolja a hívni kívánt számot.
 Bug: Nem létező telefonszámnál is bemásoljas ezt a telefonszámot.
  - A telefon vissza gomb megnyomása után vissza gombnál vissza tér az előző fő oldalra
  - Email gombra kattintva behozza az Email funkciót és bemásolja a címzettet.
 Bug: Nem létező vagy rossz címzettnél is bemásoljas ezt.
  - A telefon vissza gomb megnyomása után vissza tér az előző fő oldalra






