# Fejlesztői dokumentáció 

## Az alkalmazás célja

Az alkalmazás járműveket adatait tölti be CSV fájlokból, majd azokon programozási tételeket valósít meg.

## Eszközök

Az alkalmazás egy Java nyelven írt programjait, ami VSCode-dal készült. A Java projekt "No build tools" választása jött létre.

## Forrásfájlok

A forrásfaájlok src könytárban találhatók egységesen.

## Az App osztály

Az App osztály csak az alkalmazás indítását szolgálja.

## A Solution osztály

A Solution osztály szolgáltatja a megoldásokat. 
Minden egyes metódus egy-egy programozási tétel valósít meg.

Minden metódus kiírja a saját maga által generált eredményt.

## A Store osztály 

A Store osztály valósítja meg a fájlok beolvasását. 
Az ipari tryReadCsvFile fájlban van megvalósítva, a readCsvFile metódus csak a hibakezelését valósítja meg.

## A Car osztály 

A Car osztály objektumaiban tároljuk egy jármű adatait.