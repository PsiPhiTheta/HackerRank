#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    char ch;
    char s[8];
    char sen[25];
    
    scanf("%c", &ch);
    printf("%c\n", ch);
    
    scanf("%s", &s);
    printf("%s\n", s);
    
    scanf("\n");
    scanf("%[^\n]%*c", sen);
    printf("%s", sen);
    
    return 0;
}
