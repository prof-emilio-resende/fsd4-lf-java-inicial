package fit.basico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {

    public static void experimentar() {
        System.out.println("Iniciando collections...");
        String[] names = new String[] {
            "Emilio", "Murta", "Resende"
        };
        System.out.println(names);

        List<String> namesLista = new ArrayList<>();
        namesLista.add("Emilio");
        namesLista.add("Murta");
        namesLista.add("Resende");
        System.out.println(namesLista);

        List<String> namesListaInline = new ArrayList<>() {{
            add("Emilio");
            add("Murta");
            add("Resende");
            add("Inline");
        }};
        System.out.println(namesListaInline);

        List<String> namesListaExtended = new ArrayList<>();
        {{
            namesLista.add("Emilio");
            namesLista.add("Murta");
            namesLista.add("Resende");
            namesLista.add("extended");
        }};
        System.out.println(namesListaExtended);

        Map<String, String> registro = new HashMap<>();
        registro.put("k1", "v1");
        registro.put("k2", "v2");
        System.out.println(registro);

        Map<String, String> registroInline = new HashMap<>() {{
            put("k1", "v1");
            put("k2", "v2");
        }};
        System.out.println(registroInline);

        Map<String, String> registroExtended = new HashMap<>();
        {{
            registroExtended.put("k1", "v1");
            registroExtended.put("k2", "v2");
        }}
        System.out.println(registroExtended);

        // utilizacao dos builders (funcional)
        List<String> listaBuilder = List.of("Emilio", "Murta", "Resende", "Builder");
        System.out.println(listaBuilder);
        Map<String, String> mapBuilder = Map.of("k1", "v1", "k2", "v2");
        System.out.println(mapBuilder);

        System.out.println("Percorrendo collections...");
        for(String palavra : listaBuilder) {
            System.out.println(palavra);
        }

        for (String registroMapKey : mapBuilder.keySet()) {
            System.out.println(registroMapKey);
        }

        for (String registroMapVal : mapBuilder.values()) {
            System.out.println(registroMapVal);
        }

        for (Map.Entry<String, String> registroMap : mapBuilder.entrySet()) {
            System.out.println(registroMap.getKey());
            System.out.println(registroMap.getValue());
        }
    }

}
