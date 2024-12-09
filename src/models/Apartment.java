package models;

import java.util.Objects;

public class Apartment {
    private String floor;
    private int door;
    private String owners;

    public Apartment(String floor, int door, String owners) {
        this.floor = floor;
        this.door = door;
        this.owners = owners;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return door == apartment.door && Objects.equals(floor, apartment.floor) && Objects.equals(owners, apartment.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, door, owners);
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "floor='" + floor + '\'' +
                ", door=" + door +
                ", owners='" + owners + '\'' +
                '}';
    }
}