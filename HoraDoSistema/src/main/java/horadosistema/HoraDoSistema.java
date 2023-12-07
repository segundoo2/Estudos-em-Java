package horadosistema;

import java.util.Locale;

public class HoraDoSistema {

    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        String language = defaultLocale.getDisplayLanguage();
        System.out.println("O idioma do seu sistema é:");
        System.out.println(language.toString());
    }
}
