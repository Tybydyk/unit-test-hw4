package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherReporterTest {
    @Test
    void geberateReport() {
        WeatherService weatherServiceMock = mock(WeatherService.class);
        WeatherReporter weatherReporter = new WeatherReporter(weatherServiceMock);

        when(weatherServiceMock.getCurrentTemperature()).thenReturn(25);

        String value = weatherReporter.generateReport();

        assertEquals("Текущая температура: 25 градусов.", value);
    }


}