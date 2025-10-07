/*
Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado
daquele tamanho com asteriscos e espaços em branco. Seu programa deve funcionar
para quadrados com lados de todos os tamanhos entre 1 e 20.
Para lado igual a 5:
*****
* *
* *
* *
*****
 */
#include <stdio.h>

int main() {
    int lado;

    // Ler tamanho do lado, garantindo que esteja entre 1 e 20
    do {
        printf("Digite o tamanho do lado do quadrado (1 a 20): ");
        scanf("%d", &lado);
    } while (lado < 1 || lado > 20);

    for (int i = 0; i < lado; i++) {
        for (int j = 0; j < lado; j++) {
            // Imprime '*' na borda superior, inferior e nas bordas laterais
            if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                printf("*");
            } else {
                // Espaços no interior
                printf(" ");
            }
        }
        printf("\n");
    }

    return 0;
}
