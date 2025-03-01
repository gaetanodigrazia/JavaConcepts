# Behavioral Patterns in Java

I **Behavioral Patterns** sono un insieme di **design pattern** che si concentrano sulla comunicazione e l’interazione tra gli oggetti, definendo modi efficienti per la cooperazione tra di loro senza creare dipendenze rigide.

## **Tipologie di Behavioral Patterns**

### **1. Chain of Responsibility**
- Permette di passare una richiesta attraverso una catena di handler, dove ogni handler può elaborare la richiesta o passarla al successivo.
- Evita la dipendenza diretta tra il mittente e il destinatario della richiesta.

### **2. Command**
- Incapsula una richiesta in un oggetto separato, permettendo di parametrizzare oggetti con operazioni, ritardare l'esecuzione di comandi o supportare operazioni reversibili (undo).
- Utilizzato in sistemi che gestiscono code di comandi o richieste programmabili.

### **3. Interpreter**
- Definisce una grammatica per un linguaggio specifico e fornisce un interprete per eseguire le espressioni di quel linguaggio.
- Utile per la creazione di linguaggi di scripting o sistemi di configurazione.

### **4. Iterator**
- Fornisce un modo per accedere agli elementi di una collezione sequenzialmente senza esporne la rappresentazione sottostante.
- Utile per navigare strutture dati come liste, array o alberi.

### **5. Mediator**
- Definisce un oggetto che centralizza la comunicazione tra un insieme di oggetti, riducendo le dipendenze dirette tra di loro.
- Utile nei sistemi con molteplici componenti interdipendenti.

### **6. Memento**
- Permette di catturare e ripristinare lo stato di un oggetto senza rivelarne la struttura interna.
- Utile per implementare funzionalità di **undo/redo**.

### **7. Observer**
- Definisce una relazione di **dipendenza uno-a-molti** tra oggetti, in cui quando un oggetto cambia stato, tutti i suoi osservatori vengono notificati automaticamente.
- Usato in sistemi di eventi, notifiche o interfacce utente reattive.

### **8. State**
- Permette a un oggetto di cambiare il proprio comportamento a seconda del suo stato interno, simulando il comportamento delle macchine a stati finiti.
- Utile per la gestione di stati in automi, parser, o interfacce grafiche.

### **9. Strategy**
- Definisce una famiglia di algoritmi intercambiabili e li incapsula, permettendo di selezionare l'algoritmo da usare in fase di esecuzione.
- Utile per scenari in cui il comportamento di un oggetto deve essere modificabile dinamicamente.

### **10. Template Method**
- Definisce la struttura di un algoritmo lasciando alcune fasi a essere implementate dalle sottoclassi.
- Evita la duplicazione del codice permettendo di riutilizzare parti comuni di un algoritmo.

### **11. Visitor**
- Permette di aggiungere nuove operazioni a una struttura di oggetti senza modificarne le classi.
- Utile quando si devono eseguire operazioni complesse su una struttura dati senza alterarla.

---

## **Quando Usarli?**
- **Chain of Responsibility** → Quando si vuole evitare dipendenze rigide tra mittente e destinatario.
- **Command** → Quando si vuole incapsulare una richiesta come un oggetto separato.
- **Interpreter** → Quando si deve interpretare un linguaggio specifico.
- **Iterator** → Quando è necessario iterare su una collezione senza esporne i dettagli.
- **Mediator** → Quando la comunicazione tra oggetti deve essere centralizzata.
- **Memento** → Quando si deve salvare e ripristinare lo stato di un oggetto.
- **Observer** → Quando più oggetti devono essere notificati di un cambiamento di stato.
- **State** → Quando il comportamento di un oggetto dipende dal suo stato interno.
- **Strategy** → Quando si vogliono rendere intercambiabili gli algoritmi di un oggetto.
- **Template Method** → Quando si vuole definire un algoritmo mantenendo flessibilità su alcune parti.
- **Visitor** → Quando si devono eseguire operazioni su una struttura dati senza modificarla.

I **Behavioral Patterns** sono fondamentali per migliorare la modularità e la scalabilità del software. 🚀
