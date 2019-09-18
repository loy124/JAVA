package Ploymorphism;

import java.util.ArrayList;

class Animal{
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating(){

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
    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다");
    }
}

class Eagle extends Animal{

    public void move(){
        System.out.println("독수리가 하늘로 날아갑니다");
    }
    public void flying(){
        System.out.println("독수리가 도망갑니다");
    }
}


public class AnimalTest {
    public static void main(String[] args) {
     Animal hAnimal = new Human();
     Animal tAnimal = new Tiger();
     Animal eAnimal = new Eagle();
//     Eagle human = (Eagle) hAnimal;

//     human.flying();
//     hAnimal.hello();

//     AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
        animalArrayList.add(hAnimal);
        animalArrayList.add(tAnimal);
        animalArrayList.add(eAnimal);

        AnimalTest animalTest = new AnimalTest();
        animalTest.testDownCasting(animalArrayList);

//        for(Animal animal : animalArrayList){
//            animal.move();
//        }
    }
    public void testDownCasting(ArrayList<Animal> animalArrayList) {
        for(int i = 0; i<animalArrayList.size(); i++){
            Animal animal = animalArrayList.get(i);

            if ( animal instanceof  Human){
                Human human = (Human)animal;
                human.hello();
            }
            else if ( animal instanceof Eagle){
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            } else if ((animal instanceof Tiger)) {
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            }   else {
                System.out.println("Error");
            }
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
