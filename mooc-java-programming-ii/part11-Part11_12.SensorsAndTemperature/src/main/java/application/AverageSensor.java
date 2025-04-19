/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author gdn
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> recordedReadings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.recordedReadings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return this.recordedReadings;
    }

    @Override
    public boolean isOn() {
        return this.sensors.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        this.sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (this.sensors.stream().allMatch(Sensor::isOn) == false || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }

        int sumOfValues = this.sensors.stream().map(sensor -> sensor.read()).reduce(0, (prevSum, value) -> prevSum + value);
        int average = Math.round(sumOfValues / this.sensors.size());
        this.recordedReadings.add(average);

        return average;
    }
}
