# **Open/Closed Principle (OCP) - Principio Aperto/Chiuso**

## **📌 Definizione**
L'**Open/Closed Principle (OCP)** afferma che **una classe deve essere aperta per estensione, ma chiusa per modifiche**.

> **Definizione di Bertrand Meyer:**  
> *"Le entità software (classi, moduli, funzioni, ecc.) dovrebbero essere aperte per estensione, ma chiuse per modifica."*

## **🔹 Cosa significa?**
- **Aperta per estensione**: il comportamento della classe deve poter essere **esteso senza modificarne il codice originale**.
- **Chiusa per modifica**: il codice esistente **non deve essere alterato** quando vengono aggiunte nuove funzionalità.

## **❌ Problema senza OCP**
Se ogni volta che vogliamo aggiungere una nuova funzionalità dobbiamo **modificare il codice esistente**, possiamo introdurre bug o rompere il comportamento delle classi già testate.