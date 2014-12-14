
# 2. PLÜ - Labyrinth - 2AHIF - POS1 - 15. Dez 2014

## Aufgabenstellung

__Das folgende ist bereits implementiert! Sie müssen hier noch nichts Programmieren! In Ihrem eigenen Code, müssen Sie aber mit den hier beschrieben Schnittstellen arbeiten!__

Sie werden eine Schatzsuchertruppe mit einem Computer Programm unterstützen. Die Schatzsuche findet in Labyrinthen statt: Ihr Trupp muss einen Weg durch ein Labyrinth finden und natürlich so viele Schätze sammeln wie möglich. So schaut ein Labyrinth aus:
```
     <------------------------------- x - Achse -------------------------------->
      -4 -3 -2 -1  0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20
^    +--+--+--+--+--+--+--+--+--+XX+--+--+--+XX+--+--+XXXXXXXXXXXXXXXXXXXXXXXXXXX
| -1 |        |  |              |XX|        |XX|     |XXXXXXXXXXXXXXXXXXXXXXXXXXX
y    +--+--+  +  +  +--+  +--+  +--+  +--+  +--+  +  +--+--+--+--+--+--+XXXXXXXXX
-  0 |     |       S   |  |XX|     |  |           |     |        |     |XXXXXXXXX
A    +  +  +  +--+  +--+  +--+--+  +  +  +  +--+--+--+  +  +--+  +  +  +--+--+XXX
c  1 |  |  |  |        |     |XX|     |  |     |     |        |     |     |  |XXX
h    +  +  +  +  +--+  +--+  +--+--+--+  +--+  +  +  +  +--+  +--+--+  +  +  +--+
s  2 |        |  |     |              |  |     |  |  |     |        |       #   |
e    +  +  +  +  +  +--+  +  +--+--+  +  +  +--+  +  +--+--+--+--+  +  +  +  +  +
|  3 |           |        |        |     |        |                 |        |  |
v    +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+
```
`|`, `+`, `-` sind dabei Wände, `X` ist nicht zugänglich (z.B. Felsen); freie Stellen sind zugänglich. Der Start ist mit `S` (x = 0, y = 0) markiert, und Schätze mit `#` (x = 19, y = 2).

In Java ist es folgendermaßen modelliert:
```
public interface Labyrinth extends Map<Coords, Tile> { ... }
```
Ein `Labyrinth` ist also eine `Map` mit Koordinaten (`Coords`) als Keys und Abschnitten (`Tile`) als Values.

Koordinaten sind, wie üblich, ein geordnetes Paar an `int`s. Wobei der erste `x` und der zweite `y` genannt wird. In der Grafik oben, sehen Sie die beiden zugehörigen Achsen eingezeichnet.
```
public final class Coords { ...
    public Coords(int x, int y) { ... }
    public int getX() { ... }
    public int getY() { ... } ...
}
```
Koordinaten können via dem `Coords`-Konstruktor erstellt werden (z.B. `new Coords(3, 5)` für (x = 3, y = 5)) und Sie können auf die Getter `getX()` und `getY()` zugreifen.

Der Eingang des `Labyrinth`s liegt __immer__ auf (x = 0, y = 0). Die `Map` enthält nur Einträge für zugängliche Abschnitte: In dem obigen Beispiel gibt es in der `Map` z.B. __keinen__ Eintrag für (x = 3, y = 0).

Schauen wir uns den Labyrinth-Abschnitt an:
```
public abstract class Tile {
    public boolean isLeftOpen() { ... }
    public boolean isRightOpen() { ... }
    public boolean isUpOpen() { ... }
    public boolean isDownOpen() { ... }
    public boolean isDirectionOpen(Direction direction) { ... }
}
```
Ein Abschnitt wird beschrieben durch 4 Durchgänge (ein Durchgang führt zu einem benachbarten Abschnitt), jeweils in die Richtungen Links, Rechts, Oben, Unten. Das z.B. ist ein Abschnitt mit 2 offnen Durchgängen - Links und Unten - und 2 geschlossenen Durchgängen - Oben und Rechts:
```
+-+
  |
+ +
```
Auch die Richtungen (Links, Rechts, Oben, Unten) sind bereits modelliert:
```
public abstract class Direction { ... }
public final class Left extends Direction { ... }
public final class Right extends Direction { ... }
public final class Up extends Direction { ... }
public final class Down extends Direction { ... }
```
Eine Richtung können Sie mit dem jeweiligen Konstruktor erstellen. Z.B.:
```
Direction left = new Left();
```
Ein `Tile` bietet Ihnen jeweils 2 Möglichkeiten, um auf einen Durchgang zuzugreifen. Z.B.:
```
Tile t = ...;
if (t.isLeftOpen() == t.isDirectionOpen(new Left())) {
    // das ist gleichwertig
}
```
Um die Schätze zu beschreiben, gibt es ein Interface `Treasure`. Wenn sich auf einem `Tile` auch ein Schatz befindet, dann wird dort auch `Treasure` implementiert.
```
public interface Treasure {
    float getValue();
    float getWeight();
}
```
Wie Sie sehen, hat ein Schatz einen Wert (je höher desto besser!) und ein Gewicht (je höher desto unpraktischer - der Schatz muss ja auch geborgen werden!).

Einen Schatz, den Ihr Trupp bereits eingesammelt hat, wird mit dem Marker-Interface `CollectedTreasure` versehen:
```
public interface CollectedTreasure extends Treasure {
}
```

## Ihr Code

__Jetzt sind Sie gefragt, ab hier dürfen und sollen Sie programmieren!__

Editieren Sie __NUR__ die Dateien __Solution.java__ und __Main.java__.

__Alle anderen__ Source Code Dateien __DÜRFEN NICHT VERÄNDERT WERDEN__!

Ihre Aufgabe ist es das Interface `Exercises` zu implementieren. In __Solution.java__ ist bereits ein Template vorhanden das Sie __erweitern__ sollen!

Die `main` Methode ist prinzipiell funktionstüchtig. Wenn erforderlich, können Sie diese verändern.

## 0 Organisatorisch [1 Punkt]

Erstellen Sie ein neues Eclipse Projekt mit __Ihrem Nachnamen als Projektnamen__.

Kopieren Sie die gegebenen Dateien in Ihr eclipse Projekt. __Ziehen Sie einfach den `pos1_2ahif` Ordner in den `src` Ordner in eclipse.__

Wenn Sie das richtig gemacht haben sollten, __MUSS__ das Programm __ohne weitere Veränderungen__ schon lauffähig sein!

__a) Führen Sie das Programm testweise aus (`pos1_2ahif.plue2.Main`)! Wenn das nicht funktioniert, melden Sie sich bitte UMGEHEND!__

__b) Implementieren Sie die Methoden `getMyName` und `getMyExamAccountName`__

## 1 Aufwärmen [9 Punkte]

Implementieren Sie 
```
boolean hasAnyTreasure(Labyrinth labyrinth)
```
Die Methode soll `true` liefern wenn es in dem gegeben `labyrinth` überhaupt einen Schatz gibt (egal wie wertvoll oder schwer) - gibt es gar keinen Schatz dann soll die Methode `false` liefern.

(Anm.: Ihr Trupp wird dann anhand des Ergebnisses entscheiden, ob das `Labyrinth` überhaupt erkundet werden soll, oder nicht)

## 2 Geld! [10 Punkte]

Implementieren Sie
```
List<Coords> getTreasuresOrderedByValue(Labyrinth labyrinth)
```
Diese Methode soll eine Liste aller Koordinaten zurückgeben, an denen sich Schätze befinden. Die Liste soll dabei __absteigend nach dem Wert__ des Schatzes geordnet sein.

Programmieren Sie einen geeigneten `Comperator` und verwenden Sie die `Collections.sort` Methode zum Sortieren.

__Tipp__ Möglicherweise möchten Sie sich zuerst an einer `private` Methode `private List<Coords> getTreasures()` versuchen, bei der die Ordnung noch nicht relevant ist.

__Tipp__ Beachten Sie: Sie sollen `Coords`s (Koordinaten) zurückliefern und keine `Treasure`s (die Schätze an sich)!

__Tipp__ Für `float` bzw. `Float` gibt es bereits ein `compare`, das Sie möglicherweise wiederverwenden wollen:

```
float f1 = ...;               // linker Vergleichswert
float f2 = ...;               // rechter Vergleichswert
return Float.compare(f1, f2); // Vergleich für eine __aufsteigende__ Ordnung
```
(Anm.: Ihr Trupp wird Ihre Prioritätenliste dazu verwenden, eine Route durch das Labyrinth zu planen)

## 3 Mein Rücken! [10 Punkte]

Geld ist nicht alles! Ihr Trupp kann nur ein begrenztes Gewicht an Ladung transportieren, und kann daher nicht immer alle Schätze bergen. Implementieren Sie

```
List<Labyrinth.Coords> getTreasuresOrderedByValuePerWeight(Labyrinth labyrinth)
```

Diese Methode funktioniert genauso wie `getTreasuresOrderedByValue`, sortiert aber __absteigend nach Wert per Gewicht__. Wert per Gewicht berechnet sich so: `valuePerWeight = value / weight`

Verwenden Sie erneut `Collections.sort` - Sie brauchen hier einen 2. `Comperator`.

(Anm.: Ihr Trupp wird eine alternative Route planen und selbstständig entscheiden, ob er die Route aus Punkt 2 verfolgt (die wertvollen Schätze), oder lieber doch diese alternative Route (die leichtgewichtigeren Schätze))

## 4 Master Plan [20 Punkte]

Nachdem Ihr Trupp die Route durch das `Labyrinth` geplant hat, ist nochmals Ihr Expertise gefragt: Der Plan, den Sie vorgelegt bekommen, besteht aus mehreren Teilwegen: Z.b.

- Vom Start zum 1. Schatz (1. Teilweg)
- Vom 1. Schatz zum 2. Schatz (2. Teilweg)
- Vom 2. Schatz zum 3. Schatz (3. Teilweg)
- Vom 3. Schatz wieder retour zum Start (4. Teilweg)

Es ist Ihre Aufgabe, daraus einen __Master Plan__ zu erarbeiten, der aus einem einzigen gesamten Weg besteht. Implementieren Sie dazu
```
public List<Direction> joinPaths(List<List<Direction>> paths)
```
Ein einzelner Weg bzw. Teilweg wird dabei durch eine `List<Direction>` beschrieben (Erinnern Sie sich: `Direction` ist entweder `Left`, `Right`, `Up` oder `Down`).

Die Funktionsweise der Methode ist anhand folgenden Beispiels leicht zu verstehen:

Betrachten Sie folgende `List`:
```
[Left Up Right Right Right]
```
Die `List` beschreibt folgenden Weg:
- Zuerst nehmen wir den linken Durchgang
- Dann den oberen
- Und dann 3x hintereinander den rechten Durchgang

Die Methode bekommt nun eine Liste solcher Wege (also eine Liste an Listen!), und soll diese zu einem einzigen gesamten Weg zusammenfassen. Etwa so: (Pseudo Code)
```
joinPaths( [ [L L U U] , [U R R] , [D D R] ] ) == [L L U U U R R D D R]
```

## 5 Kaboom! [25 Punkte]

Ab und zu, wird sich Ihr Trupp entscheiden, sich durch eine Wand zu __sprengen__ (manchmal ist ein Schatz nur durch eine Sprengung zu erreichen; doch meistens ist Ihr Trupp bloß zu faul einen größeren Umweg zu machen).

Diese Aufgabe wird Ihnen zuteil: Implementieren Sie
```
void clearPassagesAlongPath(Labyrinth labyrinth, List<Direction> path)
```
Diese Methode bekommt zusätzlich zum `labyrinth`, den `path` (Pfad) den Ihr Trupp beschlossen hat zu beschreiten.

Testen Sie, ob irgendwelche Wände im Weg sind (d.h. der Durchgang ist __nicht__ geöffnet - z.B. `tile.isLeftOpen() == false`).

Wenn ja, dann bleibt Ihnen nichts anderes über, als diese zu entfernen: `Labyrinth` bietet dafür die Methode
```
interface Labyrinth ... { ...
    void clearPassages(Map<Coords, Tile> modifiedTiles) { ... } ...
}
```
die Sie dafür verwenden sollen. 

Diese Methode funktioniert wie `Map.putAll`, überprüft aber, ob Sie das `Labyrinth` in einem konsistenten Zustand hinterlassen:

Jeder Durchgang verbindet genau 2 `Tile`s. Wenn Sie eine Durchgang sprengen, müssen Sie das daher sicherstellen, dass der Durchgang von beiden Seiten (beiden `Tile`s) geöffnet ist! Z.b.
```
+--+--+
|t1|t2|
+--+--+
```
wenn Sie die mittlere Wand sprengen wollen, muss folgendes gelten:
```
t1.isRightOpen() == true && t2.isLeftOpen() == true
```
Rufen Sie `clearPassages` mit einer `Map` auf, die beschreibt welche `Tile`s Sie wie ersetzen möchten. Sollten Ihre Änderungen konsistent sein, wird das `labyrinth` entsprechend verändert.

Die Änderungen die Sie vornehmen sollen sind die folgenden: Jede Wand die im Weg ist muss weg. Also jeder Durchgang, der auf dem `path` liegt und geschlossen ist, gehört geöffnet.

Der Start und alle Schatzkammern sind übrigens __immer__ in alle Richtungen geöffnet.

__Tipp__ Der Start im Labyrinth befindet sich __immer__ auf `new Coords(0, 0)`

__Tipp__ Die `Coords` Klasse implementiert die `go` Methode, die gut mit `Direction`s zusammenarbeitet:

```
Coords c = new Coords(0, 0);
Coords d = c.go(new Left()); // d == (x = -1, y = 0)
Coords e = d.go(new Down()); // e == (x = -1, y = 1)
...
```
__Tipp__ Sie dürfen die Methode `clearPassages` so oft aufrufen, wie Sie wollen. Am leichtesten ist es, diese __einmal für jede__ Sprengung aufzurufen (mit genau 2 Einträgen, denn jede gesprengte Wand betrifft genau 2 `Tile`s).

__Tipp__ Wenn Sie die Klasse `Tile` ableiten, können Sie sich aussuchen ob Sie entweder nur `isDirectionOpen` oder __alle 4__ `isLeftOpen`, `isRightOpen`, `isUpOpen`, `isDownOpen` implementieren. Wie es Ihnen lieber ist.

__Tipp__ Die `Directions` Klasse implementiert die `getOppositeDirection` Methode, die Ihnen die genau entgegengesetzte Richtung liefert:
```
Direction d = new Left();
Direction e = d.getOppositeDirection(); // e == Right
Direction f = e.getOppositeDirection(); // f == Left
```
## 6 Schatzkarte [25 Punkte]

Implementieren Sie
```
void printReportForTreasureHunt(Labyrinth labyrinth, List<Direction> path, File file)
```
Diese Methode bekommt das `labyrinth`, einen `path` durch selbiges, und ein `file`.

Ihre Aufgabe ist es, alle Schritte von `path` in das `file`  auszugeben. Das ist als Bericht zu verstehen, wie Sie die Schätze erreicht haben. Wenn bei einem Schritt ein Schatz aufgesammelt wurde, geben Sie dafür zusätzlich einen Hinweis aus. Eine mögliche Ausgabe könnte so aussehen:
```
Left
Left
Down
Fette Beute: 30.0 Gold
Up
...
```
Schätze, die eingesammelt wurden, können Sie anhand des Marker-Interfaces `CollectedTreasure` erkennen.

Ganz am Ende geben Sie noch die Schatzkarte aus. Verwenden Sie dazu die `Labyrinth.toString(List<Direction>)` Methode, die Ihnen das Labyrinth inklusive eingezeichnetem `path` als druckfertigen `String` anliefert.

## Gutes Gelingen & Viel Erfolg
