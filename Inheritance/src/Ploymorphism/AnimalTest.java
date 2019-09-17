package Ploymorphism;

import java.util.ArrayList;

class Animal{
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal{
    public void move(){
        System.out.println("사람이 두 발로 걷습니다");
    }
    public void hello() {
        System.out.println("짖습니다 멍멍");
    }
}
class Tiger extends Animal{

    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다");
    }
}

class Eagle extends Animal{

    public void move(){
        System.out.println("독수리가 하늘로 날아갑니다");
    }
}


public class AnimalTest {
    public static void main(String[] args) {
     Animal hAnimal = new Human();
     Animal tAnimal = new Tiger();
     Animal eAnimal = new Eagle();
//     hAnimal.hello();

//     AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
        animalArrayList.add(hAnimal);
        animalArrayList.add(tAnimal);
        animalArrayList.add(eAnimal);

        for(Animal animal : animalArrayList){
            animal.move();
        }
    }

    //하나의 코드가 여러자료형으로 변해서 다형성 구현
    public void moveAnimal(Animal animal) {
        animal.move();
    }
//    위의 코드과 일치한다
//    public void moveAnimal(Human animal){
//        animal.move();
//    }
//    public void moveAnimal(Tiger animal){
//        animal.move();
//    }
//    public void moveAnimal(Eagle animal){
//        animal.move();
//    }
}
