package lesson5.hw4;

import java.util.HashMap;

public class Main {
    /*
    1.Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    Посчитать, сколько раз встречается каждое слово.
2.Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи,
а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией
может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
     */
    public static void main(String[] args) {
        String[] words = {"Apple", "Orange", "Potato", "Apple"};
        HashMap<String, Integer> wordsUniqueWithRepeats = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (wordsUniqueWithRepeats.containsKey(words[i])) {
                wordsUniqueWithRepeats.put(words[i], wordsUniqueWithRepeats.get(words[i]) + 1);
            } else {
                wordsUniqueWithRepeats.put(words[i], 1);
            }
        }

        System.out.println(wordsUniqueWithRepeats);

     }
}
