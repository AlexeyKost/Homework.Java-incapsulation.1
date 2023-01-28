package Radio;

public class Radio {
    private int stationNumber;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public void increaseStationNumber() { // Следующая радиостанция
        if (stationNumber < 9) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = 0;
        }
    }

    public void previousStationNumber() { // Предыдущая радиостанция
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = 9;
        }
    }


    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() { // Увеличение громкости
        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void descreaseVolume() { // Уменьшение громкости
        if (volume > 0) {
            volume = volume - 1;
        }
    }

}
