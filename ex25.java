/*
Achar o maior, menor, média e organizar números ou sequências são os algoritmos mais
importantes e estudados em Computação. Em C não poderia ser diferente.
Em nosso curso, obviamente, também não será diferente.
Escreva um programa em C que solicita 10 números ao usuário, através de um laço while,
e ao final mostre qual destes números é o maior.

 */
#include <stdio.h>

int main() {
    int count = 0;
    int num;
    int maior;

    printf("Digite 10 números:\n");

    // Lê o primeiro número para inicializar 'maior'
    scanf("%d", &num);
    maior = num;
    count = 1;

    while (count < 10) {
        scanf("%d", &num);
        if (num > maior) {
            maior = num;
        }
        count++;
    }

    printf("O maior número digitado foi: %d\n", maior);

    return 0;
}

