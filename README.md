# 🧮 Mini-projet Java – Opérations sur les Nombres et les Matrices

## 📘 Description

Ce projet Java regroupe plusieurs classes permettant d’effectuer des **opérations arithmétiques** sur des **nombres** et des **matrices**.  
Il illustre l’utilisation des **méthodes statiques**, des **flux (`Streams`)**, et de la **manipulation de tableaux multidimensionnels**.

Le code est organisé en trois classes principales :
- `Operation` → Contient les opérations mathématiques de base.  
- `Numbers` → Gère des tableaux de nombres simples (extraction, suppression, somme des plus grands, etc.).  
- `Matrix` → Permet des opérations élément par élément entre matrices et la multiplication par un scalaire.  

---

## 🧩 Structure du projet

src/
├── Operation.java
├── Numbers.java
└── Matrix.java


---

## ⚙️ Classes et fonctionnalités

### 🧠 `Operation.java`

Classe utilitaire regroupant les **opérations mathématiques élémentaires**.

#### Méthodes principales :
| Méthode | Description |
|----------|-------------|
| `addition(int nb1, int nb2)` | Retourne la somme de deux entiers |
| `subtract(int nb1, int nb2)` | Retourne la différence entre deux entiers |
| `multiplication(int nb1, int nb2)` | Retourne le produit de deux entiers |
| `division(int nb1, int nb2)` | Retourne le quotient de deux entiers (0 si division par zéro) |
| `mulScalMatrix(int[][] matrix, int number)` | Multiplie chaque élément d’une matrice par un scalaire |

##### Exemple :
```java
System.out.println(Operation.addition(5, 3)); // 8
System.out.println(Operation.multiplication(2, 4)); // 8
```

### 🔢 `Numbers.java`

Classe dédiée à la manipulation de tableaux d’entiers à une dimension.

#### Méthodes principales :

| Méthode | Description |
|----------|-------------|
| `getMaxNumber(int[] arrayNumbers)` | Retourne la plus grande valeur du tableau |
| `deleteNumber(int[] arrayNumbers, int numberToDelete)` | Supprime toutes les occurrences d’un nombre donné |
| `sum2MaxNumbers(int[] arrayNumbers))` | Trouve les deux nombres maximums du tableau et affiche leur somme |
	

##### Exemple :     
```java
int[] arrayNumbers = {1, 2, 5, 7, 10};
Numbers.sum2MaxNumbers(arrayNumbers); // Affiche : 17
```

### 🧩 `Matrix.java`

Classe gérant les opérations entre matrices (sous forme de tableaux 2D).

| Méthode | Description |
|----------|-------------|
| `applyMatrixOperation(int[][] m1, int[][] m2, String operator)` | Effectue une opération élément par élément entre deux matrices |
| `displayMatrix(int[][] matrix)` | Affiche une matrice dans la console |
| `displayMatrixOperation(...)` | Affiche deux matrices, l’opération et le résultat |
| `displayMulScalMatrixOperation(int[][] matrix, int number)` | Affiche la multiplication d’une matrice par un scalaire |

##### Exemple :     
```java
int[][] matrix1 = { {1, 2}, {3, 4} };
int[][] matrix2 = { {5, 6}, {7, 8} };

int[][] result = Matrix.applyMatrixOperation(matrix1, matrix2, "addition");
Matrix.displayMatrixOperation(matrix1, matrix2, result, "+");

```
---
## Exemple d'exécution
	
```yaml
[10 11 12]
[7 8 9]
+
[1 2 3]
[7 8 9]
=
[11 13 15]
[14 16 18]
-------------
3
*
[10 11 12]
[7 8 9]
=
[30 33 36]
[21 24 27]
-------------

```
---
## 💡 Améliorations possibles

✅ Ajouter la vérification des dimensions pour les multiplications matricielles réelles (produit matriciel).

🔢 Étendre les types supportés (double, float, etc.).
