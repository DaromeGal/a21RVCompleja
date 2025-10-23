package com.example.a021recyclerviewcomplejo;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    // Devuelve una lista de ItemData con 16 Avatares
    public static List<ItemData> obtenerItems() {
        List<ItemData> items = new ArrayList<>();

        items.add(new ItemData("Avatar 1", "Descripción 1", R.drawable.avatar_1));
        items.add(new ItemData("Avatar 2", "Descripción 2", R.drawable.avatar_2));
        items.add(new ItemData("Avatar 3", "Descripción 3", R.drawable.avatar_3));
        items.add(new ItemData("Avatar 4", "Descripción 4", R.drawable.avatar_4));
        items.add(new ItemData("Avatar 5", "Descripción 5", R.drawable.avatar_5));
        items.add(new ItemData("Avatar 6", "Descripción 6", R.drawable.avatar_6));
        items.add(new ItemData("Avatar 7", "Descripción 7", R.drawable.avatar_7));
        items.add(new ItemData("Avatar 8", "Descripción 8", R.drawable.avatar_8));
        items.add(new ItemData("Avatar 9", "Descripción 9", R.drawable.avatar_9));
        items.add(new ItemData("Avatar 10", "Descripción 10", R.drawable.avatar_10));
        items.add(new ItemData("Avatar 11", "Descripción 11", R.drawable.avatar_11));
        items.add(new ItemData("Avatar 12", "Descripción 12", R.drawable.avatar_12));
        items.add(new ItemData("Avatar 13", "Descripción 13", R.drawable.avatar_13));
        items.add(new ItemData("Avatar 14", "Descripción 14", R.drawable.avatar_14));
        items.add(new ItemData("Avatar 15", "Descripción 15", R.drawable.avatar_15));
        items.add(new ItemData("Avatar 16", "Descripción 16", R.drawable.avatar_16));

        return items;
    }
}
