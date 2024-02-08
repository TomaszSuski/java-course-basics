public class VariableTypes {
    /*
    typy zmiennych w JAVA


    Typy liczb całkowitych
         byte - 8 bit - od -128 do 127
             byte a = 24;
         short - 16 bit - od -32,768 do 32,767
             short b = 2345;
         int - integer, liczba 32 bitowa ( od -(2^31) do 2^31 -1 )
             int c = 50000;
         long - liczba całkowita 64 bitowa ( od -(2^63) do 2^63 - 1 )
             Oznaczane literką L na końcu liczby!
             long d = 1234453324552344L;

    Typy tekstowe
        char - 2 bajty, pojedynczy znak
            znak przypisuje się jedynie w pojedynczym cudzysłowie!
            char a = 'A'
        String - ciąg znaków
            zawsze z wielkiej litery!
            zawsze w cudzysłowiu podwójnym!
            String name = "John"

    Typy zmiennoprzecinkowe
    zawsze z kropką
        float - 32 bity
            nizsza przecyzja po przecinku, praktycznie się go nie wykorzystuje!
            domyślnie jest double, żeby zapisac float, trzeba na końcu liczbydodać literkę f
            float a = 13.234453255f;
        double - 64 bity
            double b = 4.33324345532335343233532323423434;

    Boolean
        boolean isTrue = true;
            w JAVA nie można przypisać wartości liczbowych 0/1!

    Rzutowanie typów
        przykład:
            int a = 5;
            int b = 2;
            double c = 12;
            double d = 15;
                System.out.println(a / b) // = 2 bo wynik jest int
            wystarczy rzutować jedną z liczb na double, by wynik był double
            rzutowanie odbywa się przez przypisanie nowego typu w nawiasie przed nazwą zmiennej
                System.out.println((double)a / b) // = 2.5
            oczywiście można rzutowac przy nowej zmiennej wynikowej:
                double result = a / b
            rzutowanie może być konieczne przy próbie działania na różnych typach, ale trzeba mieć świadomość wyniku
                int result2 = a / (int)d // = 0 bo część po przecinku jest tracona


    Nazwy zmiennych są case sensitive. Stosuje się camelCase.
        String homeAdressStreet = "Kurkowa";
    Stałe opisuje się słowem kluczowym final i upper snake case
        final String BASE_URL = "http://..."


     */
}
