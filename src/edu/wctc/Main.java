package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        InputStrategy input = new Input();
        ConsoleOutput out = new ConsoleOutput();
        WeaponFactory weaponFactory= new WeaponFactory();

        out.writln("Welcome to my expertly crafted dungeon, here you will have to battle several powerful foes to make it to victory!\n");
        out.writln("What is your hero's Name: ");
        String name = input.readln();
        out.writln("\nWelcome hero, You will need to choose a weapon for your upcoming adventure....here are your choices:" +
                "\n1. Sword\n2. Staff\n3. You look down at your clenched fists and think....who needs a weapon when you already have thunder and lightning...");

        int choice = Integer.parseInt(input.readln());

        Player player = new Player(name, weaponFactory.MakeWeapon(choice));

        Room room1 = new FirstRoom();
        room1.doBattle(player, room1.getEnemy(), room1);

        out.writln(player.getName() + " says....whew that was tough....but....we must press on to the next room....");
        System.out.println(" ");
        System.out.println(" ");
        out.writln("Type 1 to enter the next room: ");
        int nextRoom = Integer.parseInt(input.readln());

        if(nextRoom == 1)
        {
            System.out.println("******************************************************************");
            Room room2 = new SecondRoom();
            room2.doBattle(player, room2.getEnemy(), room2);
        }

        out.writln("Wow....I can't believe I have made it this far...hopefully the next room is easier....");
        System.out.println("");
        System.out.println("");
        out.writln("Type 2 to enter the next room: ");
        int secondRoom = Integer.parseInt(input.readln());

        if(secondRoom == 2)
        {
            System.out.println("******************************************************************");
            Room room3 = new LastRoom();
            room3.doBattle(player, room3.getEnemy(), room3);
        }
        System.out.println("");
        out.writln("WoW! You have beaten the dungeon! All hail " + player.getName() + " the savior of the castle!");
        System.out.println("Huzzah!");

    }
}
