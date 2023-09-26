##  Les Generics en Java
Les génériques font référence à la capacité d'utiliser un "type" comme paramètre de méthodes ou de classe. 
Ceci donne la possibilité de définir un ensemble de classes ou de méthodes pouvant traiter différents types avec le même bout de code. 

**NB** : Les types de paramètres dans une classe ou méthode générique DOIT être une référence, pas un type primitif (comme int, double, char ....).

## Méthodes Génériques
Une méthode générique peut être appelée avec des arguments de différents types.

````Java
<T> void myMetod(T argument){
    //corps de la méthode
}
```