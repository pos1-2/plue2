
# 2. Test - Labyrinth

2AHIF - POS1 - 15. Dez 2014

## Aufgabenstellung

__Das folgende ist bereits Implementiert! Sie müssen hier noch nichts Programmieren! In Ihrem eigenen Code, müssen Sie aber mit den hier beschrieben Schnittstellen arbeiten1__

Sie werden eine Schatzsuchertruppe mit einem Computer Programm unterstützen.
Gegeben sind 3 Labyrinthe in denen sich Schätze finden lassen.
Ihr Trupp muss einen Weg durch das Labyrinth finden und natürlich so viele Schätze sammeln wie möglich.

So schaut ein Labyrint aus:

```
     <<------------------------------ x - Achse ------------------------------->>
         -3 -2 -1  0  1  2  3
^    +--+--+--+--+--+--+--+--+--+XX+--+--+--+XX+--+--+XXXXXXXXXXXXXXXXXXXXXXXXXXX
^ -1 |        |  |              |XX|        |XX|     |XXXXXXXXXXXXXXXXXXXXXXXXXXX
y    +--+--+  +  S  S--+  +--+  +--+  +--+  +--+  +  +--+--+--+--+--+--XXXXXXXXXX
-  0 |     |      SS   |  |XX|     |  |           |     |        |     |XXXXXXXXX
A    +  +  +  +--S  S--+  +--X--+  +  +  +  +--+--+--+  +  +--+  +  +  +--+--XXXX
c  1 |  |  |  |        |     |XX|     |  |     |     |        |     |     |  |XXX
h    +  +  +  +  +--+  +--+  +--+--+--+  +--+  +  +  +  +--+  +--+--+  +  #  #--X
s  2 |        |  |     |              |  |     |  |  |     |        |      ##   |
e    +  +  +  +  +  +--+  +  +--+--+  +  +  +--+  +  +--+--+--+--+  +  +  #  #  +
v  3 |           |        |        |     |        |                 |        |  |
v    +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+
```

`|`, `+`, `-` sind dabei Wände, `X` ist nicht zugänglich (z.B. Felsen), ` ` ist ein zugängliche Stelle.
Der Eingang ist mit `S` markiert, und Schätze mit `#`.

In Java ist es folgendermaßen modelliert:

```
interface Labyrinth extends Map<Coords, Tile>
```

Ein `Labyrinth` ist also eine `Map` mit Koordinaten (`Coords`) als Keys und Abschnitten (`Tile`) als Values.

Koordinaten sind, wie üblich, ein geordnetes Paar an `int`s. Wobei der erste `X` und der zweite `Y` genannt wird.
In der Grafik oben, sehen Sie die beiden zugehörigen Achsen eingezeichnet.

Der Eingang des Labyrinths liegt _immer_ auf `[0,0]`. Sie erstellen eine Koordinaten (x = 3, y = 5) via `new Coords(3,5)` und können auf die Getter `getX()` und `getY()` zugreifen.


Schauen wir uns den Labyrinth-Abschnitt an:
```
abstract class Tile {
    public boolean isLeftOpen() { ... }
    public boolean isRightOpen() { ... }
    public boolean isUpOpen() { ... }
    public boolean isDownOpen() { ... }
    public boolean isDirectionOpen(Direction direction) { ... }
}
```
Ein Abschnitt wird beschrieben durch 4 Durchgänge (zu einem anderen Abschnitt), jeweils in die Richtungen Links, Rechts, Oben, Unten.
Das zB ist ein Abschnitt mit 2 offnen Durchgängen - Links und Unten - und 2 geschlossenen Durchgängen - Oben und Rechts.
```
+-+
  |
+ +
```
Diese 4 Richtungen sind auch in Java modelliert:
```
abstract class Direction { ... }
final class Left extends Direction { ... }
final class Right extends Direction { ... }
final class Up extends Direction { ... }
final class Down extends Direction { ... }
```
Eine Richtung erstellen Sie, wie gewohnt, mit dem `new` Keyword:
```
Direction left = new Left();
```
Sie können bei dem `Tile` auf 2 Arten auf eine Passage zugreifen:
```
Tile t = ...;
if (t.isLeftOpen() == t.isDirectionOpen(new Left())) {
    // das ist gleichwertig
}
```
Um die Schätze zu beschreiben gibt es ein Interface `Treasure`
```
public interface Treasure {
    float getValue();
    float getWeight();
}
```
Wie Sie sehen, hat ein Schatz einen Wert (je höher desto besser!!) und ein Gewicht (je höher desto unpraktischer - der Schatz muss ja auch geborgen werden!).

Einen Schatz den Ihr Trupp bereits eingesammelt hat wird mit dem Marker-Interface `CollectedTreasure` versehen:
```
public interface CollectedTreasure extends Treasure {
}
```

## Ihr Code

__Jetzt sind Sie gefragt, ab hier dürfen und sollen Sie programmieren!__

### Rahmenbedingungen

Editieren Sie __NUR__ die Dateien __Solution.java__ und __Main.java__. 

__Alle anderen__ Source Code Dateien dürfen nicht __NICHT VERÄNDERT WERDEN__!

Ihre Aufgabe ist es das Interface `Exercises` zu implementieren. In __Solution.java__ ist bereits ein Template vorhanden das Sie __erweitern__ sollen!

Die `main` Methode ist prinzipiell funktionstüchtig. 

## 0 Organisatorisch [1 Punkt]

Erstellen Sie ein neues Eclipse Projekt mit Ihrem Nachnamen als Projektnamen.

Kopieren Sie die gegebenen Dateien in Ihr eclipse Projekt, ausgehen von dem pos1_2ahif Ornder!

- pos1_2ahif.test2.Main Klasse
- pos1_2ahif.test2.Solution Klasse
- pos1_2ahif.test2.api Package
- pos1_2ahif.test2.impl Package

Wenn Sie das richtig gemacht haben sollten, __MUSS__ das Programm __ohne weitere Veränderungen__ schon lauffähig sein!

__a) Führen Sie das Programm testweise aus! Wenn das nicht funktioniert, melden Sie sich bitte UMGEHEND!__

__b) Implementieren Sie die Methoden `getMyName` und `getMyExamAccountName`__

## 1 Aufwärmen [9 Punkte]

Implementieren Sie 

```
boolean hasAnyTreasure(Labyrinth labyrinth)
```

Die Methode soll `true` liefern wenn es in dem gegeben `labyrinth` überhaupt einen Schatz gibt (egal wie wertvoll oder schwer) - gibt es gar keinen Schatz dann soll die Methode `false` liefern.

(Anm.: Ihr Trupp wird dann anhand des Ergebnis entscheiden, ob Sie das Labyrinth überhaupt erkunden sollen oder nicht!)

## 2 Geld! [10 Punkte]

Implementieren Sie

```
List<Coords> getTreasuresOrderedByValue(Labyrinth labyrinth)
```

Diese Methode soll eine Liste aller Koordinaten zurückgeben, an denen sich Schätze befinden. Die Liste soll dabei __absteigend nach dem Wert__ des Schatzes geordnet sein.

Verwenden Sie die `Collections.sort` Methode zum Sortieren - Sie müssen dafür auch einen geeigneten `Comperator` programmieren!

__Tipp__ Möglicherweise möchten Sie sich zuerst an einer `private` Methode `private List<Coords> getTreasures()` versuchen, bei der die Ordnung noch nicht relevant ist.

__Tipp__ Beachten Sie: Sie sollen `Coords`s (Koordinaten) zurückliefern und keine `Treasure`s (die Schätze an sich)!

__Tipp__ Für `float` gibt es bereits ein `compareTo`, das Sie möglicherweise wiederverwenden wollen:

```
float f1 = ...;
float f2 = ...;
return Float.valueOf(f1).compareTo(f2);
```

(Anm.: Ihr Trupp wird Ihre Prioritätenliste dazu verwenden, ihre Route durch das Labyrinth zu planen)

## 3 Mein Rücken! [10 Punkte]

Implementieren Sie

```
List<Labyrinth.Coords> getTreasuresOrderedByValuePerWeight(Labyrinth labyrinth)
```

Diese Methode funktioniert genauso wie `getTreasuresOrderedByValue`, sortiert aber __absteigend nach Wert per Gewicht__.

Wert per Gewicht berechnet sich so: `valuePerWeight = value / weight`

Verwenden Sie erneut `Collections.sort` - Sie brauchen hier einen 2. `Comperator`.

## 4 Master Plan [20 Punkte]

Nachdem Ihr Trupp nun die Teilabschnitte durch das Labyrinth geplant haben, müssen Sie einen __Master Plan__ anfertigen.

Implementieren Sie

```
public List<Direction> joinPaths(List<List<Direction>> paths)
```

Diese Methode funktioniert wie folgt:

Ihr Trupp hat die einzelnen Teil Wege durchs Labyrinth geplant: Z.b.

- Vom Start zum 1. Schatz
- Vom 1. Schatz zum 2. Schatz
- Vom 2. Schatz zum 3. Schatz
- vom 3. Schatz wieder retour zum Start

Ein einzelner Weg wird beschrieben durch eine `List<Direction>`. Das ist Anhand eines Beispiels leicht zu verstehen:

(Erinneren Sie sich: `Direction` ist entweder `Left`, `Right`, `Up` oder `Down`).

Betrachten Sie folgende Liste:

```
[Left Up Right Right Right]
```
Das beschreibt folgenden Weg: 
- Zuerst nehmen wir den linken Durchgang
- Dann den oberen
- Und dann 3x hintereinander den rechten Durchgang

Die Methode bekommt nun eine Liste solcher Wege (also eine Liste an Listen!), und soll diese zu einen einzigen langen Weg zusammenfassen. Etwa so: (Pseudo Code)

```
joinPaths( [ [L L U U] , [U R R], [D D R] ] ) == [L L U U U R R D D R]
```

## 5 Kaboom! [25 Punkte]

Ab und zu, wird sich Ihr Trupp dazu gezwungen sehen, sich durch eine Wand zu __sprengen__.

Diese Aufgabe wird Ihnen zu Teil:

Implementieren Sie

```
void clearPassagesAlongPath(Labyrinth labyrinth, List<Direction> path)
```

Diese Methode bekommt zusätzlich zum `labyrinth`, den `path` (Pfad) den Ihr Trupp beschlossen hat zu beschreiten.

Testen Sie, ob irgendwelche Wände im Weg sind (d.h. die `Passage` ist __nicht__ geöffnet - z.B. `tile.isLeftOpen() == false`).

Wenn ja, dann bleibt Ihnen nichts anderes über als diese zu entfernen: `Labyrinth` bietet dafür die Methode

```
class Labyrinth ... {
    ...
    void clearPassages(Map<Coords, Tile> modifiedTiles) { ... }
    ...
}
```
die Sie dafür verwenden sollen. 

Diese Methode funktioniert gleich wie `Map.putAll`, überprüft aber, ob Sie das `Labyrinth` in einem konsistenten Zustand hinterlassen:

Jeder Durchgang verbindet 2 `Tile`s. Wenn Sie eine Durchgang sprengen, müssen Sie das daher sicherstellen, dass der Durchgang von beiden Seiten (beiden `Tile`s) geöffnet ist!

Rufen Sie `clearPassages` mit einer `Map` auf, die beschreibt welche `Tile`s Sie wie ersetzen möchten.

Sollten Ihre Änderungen konsistent sein, wird das `labyrinth` entsprechend verändert.

Die Änderungen die Sie vornehem, sollen sind die folgenden: Jede Wand die im Weg ist muss weg. Also jeder Durchgang, der auf dem `path` liegt und geschlossen ist, gehört geöffnet.

Der Start und alle Schatzkammern sind übrigens __IMMER__ in alle Richtungen geöffnet.

__Tipp__ Der Start im Labyrinth befindet sich __IMMER__ auf `new Coords(0,0)`

__Tipp__ Die `Coords` Klasse implementiert die `go` Methode, die gut mit Directions zusammenarbeitet:

```
Coords c = new Coords(0,0);
Coords d = c.go(new Left()); // d = (x = -1, y = 0)
Coords e = d.go(new Down());   // e = (x = -1, y = 1)
...
```

__Tipp__ Sie dürfen die Methode `clearPassages` so oft aufrufen, wie Sie wollen. Am leichtesten ist es, diese für jede gesprengte Wand einzeln aufzurufen (jedes mal mit genau 2 Einträgen, denn jede gesprengte `Passage` betrifft immer genau 2 `Tile`s).

__Tipp__ Wenn Sie die Klasse `Tile` ableiten, können Sie sich aussuchen ob Sie entweder nur `isDirectionOpen` oder alle 4 `isLeftOpen`, `isRightOpen`, `isUpOpen`, `isDownOpen` implementieren. Wie es Ihnen lieber ist.

__Tipp__ Die `Directions` Klasse implementiert die `getOppositeDirection` Methode, die Ihnen die genau entgegengesetzte Richtung liefert:
```
Direction d = new Left();
Direction e = d.getOppositeDirection(); // e = Right
Direction f = e.getOppositeDirection(); // f = Left
```
## 6 Schatzkarte [25 Punkte]

Implementieren Sie
```
void printPlanForTreasureHunt(Labyrinth labyrinth, List<Direction> path, File file)
```

Diese Methode bekommt das `labyrinth`, einen `path` durch selbiges, und ein `file`.

Ihre Aufgabe ist es, in das File alle Schritte von `path` auszugeben. Das ist als Anleitung zu verstehen, wie man zu den Schätzen kommt. Wenn ein Schatz aufzusammeln ist, geben Sie zusätzlich auch noch einen Hinweis aus, dass man den Schatz aufzusammeln hat und wieviel man erwirtschaftet hat:

Z.b. 
```
...
Left
Left
Down
Fette Beute: 30.0 Gold
Up
Up
...
```

Schätze die Sie auf dem Pfad gesammelt habe, können Sie mittels dem Marker Interface `CollectedTreasure` erkennen.

Ganz am Ende geben Sie noch die Schatzkarte aus. Verwenden dazu die `Labyrinth.toString(List<Direction>)` die Ihnen sowohl das Labyrinth als auch den Pfad in einen druckfertigen `String` anliefert.

# Viel Erfolg!
