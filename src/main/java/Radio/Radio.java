package Radio;

public class Radio {

    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int stationNumber = minStationNumber;

    public Radio(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber - 1;
    }

    public Radio() {

    }

    public int getStationNumber() {
        return stationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < minStationNumber) {
            return;
        }
        if (newStationNumber > maxStationNumber) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public void increaseStationNumber() { // Следующая радиостанция
        if (stationNumber < maxStationNumber) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = minStationNumber;
        }
    }

    public void previousStationNumber() { // Предыдущая радиостанция
        if (stationNumber > minStationNumber) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = maxStationNumber;
        }
    }


    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume;

    public int getVolume() {
        return volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() { // Увеличение громкости
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void descreaseVolume() { // Уменьшение громкости
        if (volume > minVolume) {
            volume = volume - 1;
        }
    }

}