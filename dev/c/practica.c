#include <stdio.h>
#include <stdlib.h>
int main() {
	int numero1;
	int numero2;
	int division;
	
	printf("Introduce un numero:");
	scanf("%d", &numero1);
	printf("Introduce un numero:");
	scanf("%d", &numero2);
	
	division = numero1 / numero2;
	
	printf ("El resultado es %d/%d = %d", numero1, numero2, (numero1/numero2));
	return 0;
}
	