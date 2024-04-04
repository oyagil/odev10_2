package org.example;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Main {
    // Bir koleksiyonu ve bulunacak bir öğeyi kabul eden metot
    public static <T> T elemaniBul(List<T> liste, T eleman) {
        Optional<T> sonuc = liste.stream()
                .filter(e -> Objects.equals(e, eleman))
                .findFirst();
        return sonuc.orElse(null); // Eğer bulunamazsa null yerine -1 dönsün
    }

    public static void main(String[] args) {
        // Örnek bir koleksiyon oluşturalım
        List<String> meyveler = List.of("elma", "muz", "portakal", "üzüm");

        // Bir öğeyi bulmak için metodu kullanalım
        String aranacakEleman = "portakal";
        System.out.println("Bulunan eleman: " + elemaniBul(meyveler, aranacakEleman));

        // Öğe bulunamazsa
        aranacakEleman = "karpuz";
        System.out.println("Bulunan eleman: " + (elemaniBul(meyveler, aranacakEleman) != null ? elemaniBul(meyveler, aranacakEleman) : "-1"));
    }
}
