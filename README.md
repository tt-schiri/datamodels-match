# Data Models - Match

- [Deutsch](#deutsch)
- [English](#english)
- [Legal stuff](#legal-stuff)

## Deutsch

Teil des Projekts "TT-Schiri" für offene Dokumente und Programme rund um Tischtennis.

Dieser Teil enthält das Datenmodell für ein TT-Spiel.

### Was soll das? Kann ich mitmachen?

Zur Speicherung von Daten brauchen wir etliche Datenmodelle, die eigentlich nur einmal definiert werden brauchen.
Der Ansatz hier ist modular: verschiedene Datenmodelle importieren nur die Teile, die sie benötigen.

Wer mitmachen will, ist gerne eingeladen.
Es gibt keine festen Aufgaben.

### Git-Repository

Kurze Details zum Aufbau des Git-Repositories:
Die Aufteilung in Zweige orientiert sich am Git-Branching-Modell, das in http://nvie.com/posts/a-successful-git-branching-model/ beschrieben wird.

Das heißt, es gibt immer mindestens drei Zweige:

1. `master` - enthält nur fertige Versionen
2. `develop` - Hauptzweig, gegen den entwickelt wird, dient der Synchronisation der feature-, release- und hotfix-Zweige
3. `feature/work` - Haupt-Arbeitszweig, in dem standardmäßig geschrieben wird

Zusätzlich werden bei Bedarf folgende Zweige genutzt:

- `feature/*` - für das Schreiben eines bestimmten Features/Textteils
- `release/*` - Synchronisation fertiger Versionen zwischen `develop` und `master`
- `hotfix/*` - schnelle Fehlerbehebung

## English

Part of the project "TT-Schiri" which provides open documents and applications for table tennis.

This part contains the data model for a TT match.

### What is this? Can I participate?

We need data models for storing data, these only need to be defined once.
Here, we try the approach of having modular data models that include needed parts.

Everybody can participate, at the moment I don't have special tasks.

### Git repository

Short information about the structure of the git repository:

The branches are constructed regarding the git branching model of http://nvie.com/posts/a-successful-git-branching-model/

This means, there are always at least three branches:

1. `master` - contains released versions
2. `develop` - main synchronisation branch for feature, release, and hotfix branches
3. `feature/work` - main working branch for development

Additionally, the following branches may occur:

- `feature/*` - writing a special feature
- `release/*` - synchronizing release versions between `develop` and `master`
- `hotfix/*` - fast bugfixes

## Legal stuff

### Licenses

License of the documents: Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License
See file LICENSE.

License of the programs: GNU General Public License, GNU LESSER GENERAL PUBLIC LICENSE.
See file COPYING, COPYING.LESSER.

Which means:

- the documents are free, as long as you
	- don't make money with them
	- mention the creator
	- share derivates with the same license
- programs are free and open source
	- you have to provide the source code of the programs
	- if you change the source code, you have to distribute it under the same license

### Copyright

Copyright 2014-2017 Ekkart Kleinod <ekleinod@edgesoft.de>

The program is distributed under the terms of the GNU General Public License.

See COPYING for details.

This file is part of TT-Schiri: Data Models - Match.

TT-Schiri: Data Models - Match is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

TT-Schiri: Data Models - Match is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with TT-Schiri: Data Models - Match.  If not, see <http://www.gnu.org/licenses/>.
