package lesson7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Cat cat = new Cat("Мурзик", "12");

        String catInJson = objectMapper.writeValueAsString(cat);
        System.out.println(catInJson);

        Cat catFromJson = objectMapper.readValue(catInJson, Cat.class);
        System.out.println(catFromJson);

        List<Cat> cats = new ArrayList<>(Arrays.asList(cat, new Cat("Морис", " 1")));
        String catsListJson = objectMapper.writeValueAsString(cats);
        System.out.println(catsListJson);

        List<Cat> catsFromJson = objectMapper.readValue(catsListJson, new TypeReference<List<Cat>>() {});
        System.out.println(catsFromJson);

        String jsonAfterRefactoring = "{\"name\":\"Мурзик\",\"age\":\"12\",\"weight\":\"5\"}";
        //objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Cat catAfterRefactoring = objectMapper.readValue(jsonAfterRefactoring, Cat.class);
        System.out.println(catAfterRefactoring);

        String jsonAfterSecondRefactoring = "{\"surname\":\"Мурзик\",\"age\":\"12\",\"weight\":\"5\"}";
        Cat cat1 = objectMapper.readValue(jsonAfterSecondRefactoring, Cat.class);
        System.out.println(cat1);

        objectMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
        String catJsonWithRoot = objectMapper.writeValueAsString(cat);
        System.out.println(catJsonWithRoot);

        Cat catWithEye = new Cat("Барсик", "10");
        catWithEye.setEye(new Eye("Зеленые"));
        String jsonCatWithEye = objectMapper.writeValueAsString(catWithEye);
        System.out.println(jsonCatWithEye);
    }
}
