package org.example;

public class Main {

    public static void main(String[] args) {
       Participant[] participants = {
               new Cat(11, 350, "КаБаЧоК"),
               new Cat(2,400,"БаКлАжАн"),
               new Cat(5, 350, "КаБаЧоК1"),
               new Cat(2,400,"БаКлАжАн2"),
               new Human(2, 350, "СаНек"),
               new Robot(7, 900, "Кибер Андрюха"),

       };
      Challenge[] challenges = {
              new RunningRoad(RoadLenght.LOW),
              /*new RunningRoad(RoadLenght.HIGH),
              new RunningRoad(RoadLenght.LOW),
              new RunningRoad(RoadLenght.HIGH),
              new Wall(WallHeight.LOW),
              new RunningRoad(RoadLenght.MEDIUM),
              new RunningRoad(RoadLenght.MEDIUM),
              new Wall(WallHeight.HIGH),
              new RunningRoad(RoadLenght.HIGH),*/
              new Wall(WallHeight.LOW),
              new Wall(WallHeight.HIGH),
              new Wall(WallHeight.HIGH)
      };

      for(Participant p: participants) {
          for (Challenge c: challenges) {
              if (!c.isCan(p)) break;
          }
      }
    }
}