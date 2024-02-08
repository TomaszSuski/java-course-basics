
public class Operators {
    /*
    Operatory

   OPERATORY ARYTMETYCZNE
       +   dodawanie liczb oraz łączenie string'ów
       -   odejmowanie
       *   mnożenie
       /   dzielenie

       =   przypisanie wartości
       += zwiększenie wartości o
       -= zmniejszenie wartości o
       /= podzielenie wartości o
       *= pomnożenie wartości o
       %= modulo z dzielenia o

       %   reszta z dzielenia (dzielenie modulo)


       ++   inkrementacja - powiększ o 1
       --   dekrementacja - zmniejsz o 1

       y++ - POST INKREMENTACJA
       y-- - POST dekrementacja

       ++y - PRE INKREMENTACJA
       --y - PRE dekrementacja


    OPERATOR RELACYJNY (PORÓWNANIA)

        == - porównanie
        != - porównanie czy są różne od siebie
        > - większe od
        < - mniejsze od
        >= - większe bądź równe
        <= - mniejsze bądź rowne


    OPERATORY LOGICZNE

            true false

            ! - negacji

            !(true) - false
            !(false) - true

            && - koniunkcja - "I" - W TYM SAMYM MOMENCIE

            true true - true
            true false - false
            false true - false
            false false - false

            KONIUNKCJA JEST PRAWDZIWA WTEDY I TYLKO WTEDY GDY OBA WYRAZENIA SA PRAWDZIWE

            || - alternatywa - "lub" - to lub też to

            true true - true
            true false - true
            false true - true
            false false - false

            ALTERNATYWA JEST FAŁSZYWA TYLKO GDY  OBA WYRAZENIA SA FALSZYWE


    OPERATORY BITOWE

        0 - false 1 - true (bit pusty czy pełny)

        & - iloczyn bitowy
        | - suma bitowa
        ^ - XOR eXclusive OR
        x << 1 - przesunięcie w lewo o 1
        x >> 2 - przesunięcie w prawo o 2

        ~ - negacja bitowa

        przykłady:

            system dziesiętny
            126 = 1 * 10 ^ 2 + 2 * 10 ^ 1 + 6 * 10 ^ 0

            system dwójkowy (liczymy pozycje od 0 od prawej i to są potęgi dwójki)
            1 0 1 0 = 1 * 2 ^ 3 + 0 * 2 ^ 2 + 1 * 2 ^ 1 + 0 * 2 ^ 0 = 8 + 0 + 2 + 0 = 10


        iloczyn bitowy (używane jako koniunkcja)
            1 1 1 0 // 14
            1 0 1 1 // 11
            ------------
        (&) 1 0 1 0
            14&11 = 10

        używane np do uprawnień:
            0 0 0 1 - może dodać post na forum
            0 0 1 0 - może edytować posty
            0 1 0 0 - może usuwac posty
            1 0 0 0 - może banować
            uzytkownik ma np uprawnienia:
            1 1 1 0 // 14
            sprawdzenie co może zrobić przez koniunkcję (iloczyn bitowy):
            14&1 = 0 - nie może pisac postów
            14&2 = 2 - może edytować
            14&4 = 4 - może usuwać
            14&8 = 8 - może banować


        suma bitowa (alternatywa)
            1 1 1 0 // 14
            1 0 1 1 // 11
            ------------
        (|) 1 1 1 1
            14|11 = 15

            1 0 1 0 // 10
            1 0 1 1 // 11
            -------------
        (|) 1 0 1 1 // 11
            10|11 = 11


        XOR ("albo", wynik prawdziwy tylko kiedy jedno wyrażenie prawdziwe - dla dwóch prawdziwych wynik jest fałszywy):
            1 1 - 0 // true true == false
            0 0 - 0 // false false == false
            1 0 - 1 // true false == true
            0 1 - 1 // false true == true

            1 0 1 0 // 10
            1 0 1 1 // 11
            -------------
        (^) 0 0 0 1
            10^11 = 1

            1 1 1 0 // 14
            1 0 1 1 // 11
            ------------
        (^) 0 1 0 1
            14^11 = 5


        >> przesunięcie w prawo
        (de facto dzielenie przez kolejne potęgi dwójki, wynik to liczba całkowita bez reszty:
        - dla przesunięcia o 1 de facto dzielenie przez dwa,
        - dla przesunięcia o 2 dzielenie przez 4 itd.)
            0 0 0 0 0 1 0 1 0 = 10
    10>>1 = 0 0 0 0 0 0 1 0 1 = 5
    10>>2 = 0 0 0 0 0 0 0 1 0 = 2
    10>>3 = 0 0 0 0 0 0 0 0 1 = 1


        << przesunięcie w lewo (de facto mnożenie przez kolejne potęgi dwójki)
            0 0 0 0 0 1 0 1 0 = 10
    10<<1 = 0 0 0 0 1 0 1 0 0 = 20
    10<<2 = 0 0 0 1 0 1 0 0 0 = 40
    10<<3 = 0 0 1 0 1 0 0 0 0 = 80


        ~ operator negacji (zmienia 0 i 1 na odwrót)
        zmienia wszystkie bity odwrotnie. Zamienia tez pierwszy bit od lewej co sprawia, że liczba jest ujemna.
        Robi to na całej 64 bitowej przestrzeni.
        Dlatego np. ~10 nie równa się 5 (to nie zamiana na poziomie 4 bitów 1 0 1 0 na 0 1 0 1). ~10 = -11

     */

}
