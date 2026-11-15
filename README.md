# Vier Gewinnt – Java-Spiel mit grafischer Benutzeroberfläche

## Projektbeschreibung

Dieses Projekt entstand im Rahmen eines universitären Softwareprojekts und implementiert das klassische Spiel **Vier Gewinnt** in Java. Neben der Spiellogik wurde eine grafische Benutzeroberfläche (GUI) entwickelt, über die das Spiel bedient werden kann.

Ziel des Spiels ist es, als erster Spieler vier eigene Spielsteine horizontal, vertikal oder diagonal in eine zusammenhängende Reihe zu bringen.

## Projektstruktur

Der Quellcode ist nach Verantwortlichkeiten in mehrere Pakete unterteilt:

```text
src/
└── main/
    └── java/
        └── tcu/
            └── isse/
                ├── controller/
                ├── model/
                └── view/
```

### `controller`

Dieses Paket enthält die Steuerungslogik des Spiels. Dazu gehören unter anderem Klassen für den Spielablauf und die Interaktion der Spieler. Die Projektstruktur enthält sowohl Controller-Klassen für eine Konsolenausgabe als auch für die grafische Oberfläche.

### `model`

In diesem Paket befinden sich die Datenstrukturen und Regeln des Spiels. Dazu gehören beispielsweise Klassen zur Darstellung des Spielbretts, der Zellen und Spielsteine sowie Komponenten zur Behandlung ungültiger Spielzüge und zur Ermittlung des Gewinners.

### `view`

Dieses Paket ist für die Darstellung der Benutzeroberfläche vorgesehen. Es trennt die visuelle Darstellung von der Spiellogik und der Steuerung.

## Technischer Überblick

- **Programmiersprache:** Java
- **Projekt:** Vier Gewinnt
- **Benutzeroberfläche:** Grafische Benutzeroberfläche (GUI)
- **Architektur:** Aufteilung in `controller`, `model` und `view`

## Spielziel

Zwei Spieler treten gegeneinander an. Sie setzen abwechselnd ihre Spielsteine auf das Spielbrett. Gewonnen hat, wer zuerst vier eigene Spielsteine in einer horizontalen, vertikalen oder diagonalen Reihe platziert.

## Starten des Projekts

Das Projekt enthält Java-Quellcode unter `src/main/java`. Die konkrete Startkonfiguration hängt von der verwendeten Entwicklungsumgebung und der im Projekt eingerichteten Main-Klasse ab.

Öffne das Projekt in deiner Java-Entwicklungsumgebung, prüfe die konfigurierte Main-Klasse und starte das Spiel über diese Konfiguration.

## Hinweis

Dieses Projekt wurde im Rahmen einer universitären Lehrveranstaltung entwickelt.
