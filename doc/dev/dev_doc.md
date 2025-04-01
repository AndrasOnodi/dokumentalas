# Fejlesztői dokumentáció

## Az alkalmazás célja

Rendezés bemutatása egy egyszerű Java programmal.

# Használt eszközök

A Java nyelven írt program Visual Studio Code-dal készült. A projekt a "No build tools" projektgenerálóval készült.

Windows képmetsző a képernyőképekhez. 

A forráskódok az src könyvtárban találhatók.

## Az App osztály

Az App osztály az alkalmazás belépési pontja. Csak az alkalmazás inditására használjuk.

##  A Store osztály

A Store osztály segítségével beolvassuk a .csv kiterjesztésü fájl tartalmát.

## A tryReadFile metódus

A tryReadFile() metódus olvassa be ténylegesen a fájl tartalmát, amelynek a hibakezelője a readFile() metódus.

A fájl beolvasásakor a readFile()-t kell meghívni.

## Az Employee osztály

Az Employee osztály a fájlból beolvasott dolgozók tárolására szolgál. Egy Employee objektumban a fájl egyetlen sora tárolható.