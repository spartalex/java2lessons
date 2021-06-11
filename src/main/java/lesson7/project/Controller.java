package lesson7.project;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    private WeatherModel weatherModel = new AccuweatherModel();

    private Map<Integer, Variant> variantResults = new HashMap<>();

    public Controller() {
        variantResults.put(1, Variant.NOW);
        variantResults.put(0, Variant.FIVE_DAYS);
        variantResults.put(2, Variant.SAVED);
    }

    public void getWeather(String commandInput, String selectedCity) throws IOException {
        Integer integerCommand = Integer.parseInt(commandInput);
        //TODO: *сделать обработку ввода пользователя

        switch (variantResults.get(integerCommand)) {
            case NOW:
                weatherModel.getWeather(selectedCity, Variant.NOW);
                break;
            case FIVE_DAYS:
                //weatherModel.getWeather(selectedCity, Period.FIVE_DAYS);
                throw new IOException("Вывод прогноза погоды не реализован!");
            case SAVED:
                weatherModel.getSavedWeather();
        }
    }
}
