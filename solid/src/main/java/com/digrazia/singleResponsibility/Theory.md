# **Single Responsibility Principle (SRP) - Principio di Responsabilità Unica**

## 📌 **Definizione**
Il **Single Responsibility Principle (SRP)** afferma che **una classe deve avere una sola responsabilità e una sola ragione per cambiare**.  
In altre parole, una classe **deve fare solo una cosa** e farla bene.

> **Robert C. Martin (Uncle Bob)**:  
> *"A class should have only one reason to change."*

## ❌ **Violazione di SRP**
Quando una classe gestisce **più di una responsabilità**, diventa più difficile da manutenere e testare.

### **Esempio sbagliato**
La classe `User` fa **due cose**:
1. **Gestisce i dati dell'utente**
2. **Salva l'utente nel database** (compito che dovrebbe appartenere a un repository).

