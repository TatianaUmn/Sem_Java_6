import java.util.HashSet;
import java.util.Scanner;

/*
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(8, 512, "Windows", 15.6, 25000);
        Laptop laptop2 = new Laptop(8, 256, "Windows", 15.6, 20000);
        Laptop laptop3 = new Laptop(16, 512, "Linux", 13.3, 18000);
        Laptop laptop4 = new Laptop(32, 512, "Windows", 17.3, 15000);
        Laptop laptop5 = new Laptop(8, 256, "Windows", 14, 15000);
        Laptop laptop6 = new Laptop(4, 128, "Linux", 15.6, 12000);
        Laptop laptop7 = new Laptop(16, 256, "MacOS", 17.3, 26000);
        Laptop laptop8 = new Laptop(8, 128, "Windows", 15.6, 15000);
        Laptop laptop9 = new Laptop(64, 512, "Windows", 13.3, 28000);
        Laptop laptop10 = new Laptop(32, 512, "MacOS", 14, 30000);

        HashSet<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);
        laptopSet.add(laptop6);
        laptopSet.add(laptop7);
        laptopSet.add(laptop8);
        laptopSet.add(laptop9);
        laptopSet.add(laptop10);
        System.out.println(laptopSet);

        Scanner in = new Scanner(System.in);
        System.out.println(
                "Выберите критерий отбора:\n" +
                        "1 - озу\n2 - ssd\n3 - диагональ ноутбука\n4 - цена");
        int criteria = in.nextInt();
        System.out.println("Введите минимальное значение выбранного критерия: ");
        double minCriteria = in.nextDouble();
       
        boolean flag = false;

        if (criteria == 1) { 
            for (Laptop elem : laptopSet) {
                if (elem.getRam() >= minCriteria) {
                    System.out.println(elem);
                    flag = true;
                }
            }
            
        } else if (criteria == 2) { 
            for (Laptop elem : laptopSet) {
                if (elem.getSsd() >= minCriteria) {
                    System.out.println(elem);
                    flag = true;
                }
            }

        } else if (criteria == 3) { 
            for (Laptop elem : laptopSet) {
                if (elem.getDiagonal() >= minCriteria) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        } else if (criteria == 4) { 
            for (Laptop elem : laptopSet) {
                if (elem.getPrice() >= minCriteria) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("Ноутбуков с заданными параметрами нет");
        }
        
    
    }
}
