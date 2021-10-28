package com.pdprogramer.galerycars;

public class Car {
    private String name;
    private int idDrawable;

    public Car(String name, int idDrawable) {
        this.name = name;
        this.idDrawable = idDrawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return name.hashCode();
    }

    public void setIdDrawable(int idDrawable) {
        this.idDrawable = idDrawable;
    }

    public static Car[] CARS = {
            new Car("Carro1",R.drawable.car1),
            new Car("Carro2",R.drawable.car2),
            new Car("Carro3",R.drawable.car3),
            new Car("Carro4",R.drawable.car4),
            new Car("Carro5",R.drawable.car5),
            new Car("Carro6",R.drawable.car6),
            new Car("Carro7",R.drawable.car8),
            new Car("Carro8",R.drawable.car9),
            new Car("Carro9",R.drawable.car10),
            new Car("Carro10",R.drawable.car11),
            new Car("Carro11",R.drawable.car12),
            new Car("Carro12",R.drawable.car13),
            new Car("Carro13",R.drawable.car14),
            new Car("Carro14",R.drawable.car15),
            new Car("Carro15",R.drawable.car16),
            new Car("Carro16",R.drawable.car17),
            new Car("Carro17",R.drawable.car18),
            new Car("Carro18",R.drawable.car19),
            new Car("Carro19",R.drawable.car1),


    };

    public static Car getItem(int id) {
        for (Car car : CARS) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

}
