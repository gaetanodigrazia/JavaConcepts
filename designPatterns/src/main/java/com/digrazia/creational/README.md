# Creational Patterns in Java

I **Creational Patterns** sono un insieme di **design pattern** che si occupano della creazione degli oggetti in modo flessibile ed efficiente. Questi pattern migliorano l'incapsulamento e riducono la dipendenza dalle classi concrete, aumentando la manutenibilità e la scalabilità del codice.

## Tipologie di Creational Patterns

### 1. Singleton
- Garantisce che una classe abbia **una sola istanza** e fornisce un punto di accesso globale a essa.
- Evita la creazione multipla di oggetti riducendo il consumo di memoria.
- Utilizzato per oggetti condivisi, come **logger**, **connessioni al database**, **gestione della configurazione**.

### 2. Factory Method
- Definisce un'interfaccia per **creare oggetti in una superclasse**, delegando la creazione alle sottoclassi.
- Permette di creare oggetti senza conoscere direttamente la loro classe concreta.
- Utilizzato quando il codice deve rimanere flessibile e indipendente dalla creazione delle istanze.

### 3. Abstract Factory
- Fornisce un'interfaccia per **creare famiglie di oggetti correlati** senza specificare le loro classi concrete.
- Utile quando si lavora con più varianti di oggetti appartenenti alla stessa famiglia.
- Applicato in scenari come **UI multipiattaforma** o **sistemi a plugin**.

### 4. Builder
- Permette di costruire **oggetti complessi passo dopo passo**, separando la creazione dalla rappresentazione.
- Utile quando un oggetto ha **molti parametri opzionali** o **configurazioni complesse**.
- Utilizzato per la creazione di oggetti immutabili e configurabili in modo fluido.

### 5. Prototype
- Permette di **creare nuovi oggetti clonando un'istanza esistente** invece di crearne una da zero.
- Riduce il costo della creazione di nuovi oggetti quando il processo è costoso.
- Utilizzato in contesti in cui le istanze devono avere configurazioni predefinite.

## Quando Usarli?
- **Singleton** → Quando serve una sola istanza condivisa (ad es. gestione della configurazione, logging).
- **Factory Method** → Quando non si vuole esporre la logica di creazione degli oggetti nel codice client.
- **Abstract Factory** → Quando si devono creare gruppi di oggetti correlati in modo indipendente.
- **Builder** → Quando un oggetto ha molte varianti o parametri opzionali.
- **Prototype** → Quando la creazione di un nuovo oggetto è costosa e può essere clonata da un'istanza esistente.

I **Creational Patterns** sono fondamentali per progettare software **più scalabile, manutenibile e modulare**.
