/*
Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado
daquele tamanho com asteriscos. Seu programa deve funcionar para quadrados com
lados de todos os tamanhos entre 1 e 20.
Por exemplo, para lado igual a 5:
*****
*****
*****
*****
*****

 */
#include <stdio.h>

int main() {
    int lado;

    // Ler o tamanho do lado
    do {
        printf("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        scanf("%d", &lado);
    } while (lado < 1 || lado > 20);

    // Imprimir o quadrado
    for (int i = 0; i < lado; i++) {
        for (int j = 0; j < lado; j++) {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}

