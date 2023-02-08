package Radio;

import Radio.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() { // Выставляет номер радиостанции
        Radio rad = new Radio();

        rad.setStationNumber(10);

        int expected = 10;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToSetStation() {
        Radio rad = new Radio();

        rad.setStationNumber(-2);

        int expected = 0;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldToStationNumber() { // Выставляет радиостанцию вручную (корректное значение)
        Radio rad = new Radio();

        rad.setStationNumber(15);

        int expected = 0;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToNextStation() { // Следующая радиостанция (корректное значение)
        Radio rad = new Radio();
        rad.setStationNumber(7);

        rad.increaseStationNumber();

        int expected = 8;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToZeroStation() { // Верхнее граничное значение радиостанции при переключении вперед
        Radio rad = new Radio();
        rad.setStationNumber(9);

        rad.increaseStationNumber();

        int expected = 0;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToPreviousStation() { // Переключение радиостанции на предыдущую
        Radio rad = new Radio();
        rad.setStationNumber(5);

        rad.previousStationNumber();

        int expected = 4;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToNineStation() { // Нижнее граничное значение радиостанции при переключении назад
        Radio rad = new Radio();
        rad.setStationNumber(0);

        rad.previousStationNumber();

        int expected = 9;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() { // Выставляет уровень звука
        Radio rad = new Radio();

        rad.setVolume(10);

        int expected = 10;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToStayTen() { // Верхнее значение громкости при ее прибавлении
        Radio rad = new Radio();
        rad.setVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToUpVolume() { // Увеличение громкости
        Radio rad = new Radio();
        rad.setVolume(7);

        rad.increaseVolume();

        int expected = 8;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToDecreaseVolume() { // Уменьшение громкости
        Radio rad = new Radio();
        rad.setVolume(1);

        rad.descreaseVolume();

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToStayZeroVolume() { // Уменьшение громкости при минимальном ее значении
        Radio rad = new Radio();
        rad.setVolume(0);

        rad.descreaseVolume();

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToVolume() { // Выставляет уровень звука
        Radio rad = new Radio();

        rad.setVolume(101);

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToSetVolume() {
        Radio rad = new Radio();

        rad.setVolume(-1);

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioStationNumber() {
        Radio rad = new Radio(26);

        Assertions.assertEquals(25, rad.getMaxStationNumber());
        Assertions.assertEquals(0, rad.getMinStationNumber());
    }

    @Test
    public void testVolume() {
        Radio rad = new Radio();

        Assertions.assertEquals(0, rad.getMinVolume());
        Assertions.assertEquals(100, rad.getMaxVolume());
    }

}