/*
Escreva um programa em C que solicita 10 números ao usuário, através de um laço while,
e ao final mostre os dois maiores números digitados pelo usuário.

 */
#include <stdio.h>

int main() {
    int count = 0;
    int num;
    int maior1, maior2;

    printf("Digite 10 números:\n");

    // Lê o primeiro número para inicializar maior1
    scanf("%d", &num);
    maior1 = num;
    maior2 = -2147483648; // Menor valor possível de int
    count = 1;

    while (count < 10) {
        scanf("%d", &num);

        if (num > maior1) {
            maior2 = maior1;
            maior1 = num;
        } else if (num > maior2) {
            maior2 = num;
        }

        count++;
    }

    printf("Os dois maiores números digitados foram: %d e %d\n", maior1, maior2);

    return 0;
}

