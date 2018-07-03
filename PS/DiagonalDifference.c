#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* readline();
char** split_string(char*);

// Complete the diagonalDifference function below.
int diagonalDifference(int a_rows, int a_columns, int** a) 
{
    int internal_result = 0;
    int diag_1 = 0;
    int diag_2 = 0;
    
    for (int i = 0; i < a_rows; i++)
    {
        internal_result = internal_result + a[i][i];
    }
    diag_1 = internal_result;
    
    internal_result =0;
    for (int i = 0; i < a_columns; i++)
    {
        int j = 0;
        j = (a_rows - i)-1;
        internal_result = internal_result + a[j][i];
    }
    diag_2 = internal_result;
    
    internal_result = sqrt((diag_1 - diag_2)*(diag_1 - diag_2));
    return internal_result;
}

int main()
{
    FILE* fptr = fopen(getenv("OUTPUT_PATH"), "w");

    char* n_endptr;
    char* n_str = readline();
    int n = strtol(n_str, &n_endptr, 10);

    if (n_endptr == n_str || *n_endptr != '\0') { exit(EXIT_FAILURE); }

    int** a = malloc(n * sizeof(int*));

    for (int i = 0; i < n; i++) {
        *(a + i) = malloc(n * (sizeof(int)));

        char** a_item_temp = split_string(readline());

        for (int j = 0; j < n; j++) {
            char* a_item_endptr;
            char* a_item_str = *(a_item_temp + j);
            int a_item = strtol(a_item_str, &a_item_endptr, 10);

            if (a_item_endptr == a_item_str || *a_item_endptr != '\0') { exit(EXIT_FAILURE); }

            *(*(a + i) + j) = a_item;
        }
    }

    int a_rows = n;
    int a_columns = n;

    int result = diagonalDifference(a_rows, a_columns, a);

    fprintf(fptr, "%d\n", result);

    fclose(fptr);

    return 0;
}

char* readline() {
    size_t alloc_length = 1024;
    size_t data_length = 0;
    char* data = malloc(alloc_length);

    while (true) {
        char* cursor = data + data_length;
        char* line = fgets(cursor, alloc_length - data_length, stdin);

        if (!line) { break; }

        data_length += strlen(cursor);

        if (data_length < alloc_length - 1 || data[data_length - 1] == '\n') { break; }

        size_t new_length = alloc_length << 1;
        data = realloc(data, new_length);

        if (!data) { break; }

        alloc_length = new_length;
    }

    if (data[data_length - 1] == '\n') {
        data[data_length - 1] = '\0';
    }

    data = realloc(data, data_length);

    return data;
}

char** split_string(char* str) {
    char** splits = NULL;
    char* token = strtok(str, " ");

    int spaces = 0;

    while (token) {
        splits = realloc(splits, sizeof(char*) * ++spaces);
        if (!splits) {
            return splits;
        }

        splits[spaces - 1] = token;

        token = strtok(NULL, " ");
    }

    return splits;
}
