/*
Escreva um algoritmo e um programa em C mostra todos os números ímpares de 1 até 100.
Escreva uma versão com FOR, WHILE e DO-WHILE.

 */
#include <stdio.h>

int main() {
    printf("Números ímpares de 1 até 100 usando FOR:\n");
    for (int i = 1; i <= 100; i += 2) {
        printf("%d\n", i);
    }
    return 0;
}

#include <stdio.h>

int main() {
    int i = 1;
    printf("Números ímpares de 1 até 100 usando WHILE:\n");
    while (i <= 100) {
        printf("%d\n", i);
        i += 2;
    }
    return 0;
}

#include <stdio.h>

int main() {
    int i = 1;
    printf("Números ímpares de 1 até 100 usando DO-WHILE:\n");
    do {
        printf("%d\n", i);
        i += 2;
    } while (i <= 100);
    return 0;
}
