package hwrk.skypro;

public class ServiceStation {
    public void check(Bycicle bycicle) {
        System.out.println("Начинаем сервис");
        bycicle.service();
        System.out.println("Сервис окончен");
    }
    public void check(Car car) {
        System.out.println("Начинаем сервис");
        car.service();
        System.out.println("Сервис окончен");
    }
    public void check(Truck truck) {
        System.out.println("Начинаем сервис");
        truck.service();
        System.out.println("Сервис окончен");
    }
}
