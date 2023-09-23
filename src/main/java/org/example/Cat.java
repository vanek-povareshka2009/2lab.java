package org.example;

public  class Cat implements Participant{
    int maxHeight;
    int maxLenght;
    String name;
    public int superJumpCount = 1;

    public Cat(int maxHeight, int maxLenght, String name) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.name = name;
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxLenght) {
            System.out.println("Кот " +this.name + " пробежал " + dist + "м");
            return true;
        }
        else {System.out.println("Кот " +this.name + " не смог пробежать " + dist + "м и выбывает");
        return false;}

    }
    @Override
    public boolean jump(int height) {
        if (height<= maxHeight) {
            System.out.println("Кот "+ this.name+ " перепрыгнул " + height  +"м");
            return true;
        }
        else if (superJumpCount != 0) {
            return superJump(height);
        }
        else {
            System.out.println("Кот "+ this.name+ " не смог перепрыгнуть " + height  +"м и выбывает");
            return false;
        }
    }
    public boolean superJump(int height) {
        System.out.println("Кот " + this.name+ " перепрыгнул " + height + "м с экстра");
        superJumpCount--;
        return true;

    }

}
