import java.util.Scanner;
public class Homework06 {
    public static void main(String[] args) {
        Computer Alpha007 = new Computer();
        Alpha007.greeting();
        Alpha007.play();
        Alpha007.info();
    }
}

class Computer {
    int comChoice;
    int count = 0;
    int times = 0;
    int[] array = new int[100];

    public void greeting() {
        System.out.println("\n>>Hello Ricky");
        System.out.println(">>Let's play rock-paper-scissors");
        System.out.println(">>How many times you want play?");

        Scanner myScanner = new Scanner(System.in);
        this.times = myScanner.nextInt();
    }

    public void play() {
        //0 -> rock  1 -> paper  2 -> scissors
        int myChoice = 0;
        Scanner myScanner = new Scanner(System.in);
        for(int i = 0;i<this.times ;i++){
            System.out.println("\n>>Please enter your choice(0 -> rock,1 -> paper,2 -> scissors)");
            myChoice = myScanner.nextInt();
            System.out.println("--------result--------");

            //show my choice
            switch(myChoice){
                case 0:
                    System.out.println(">>In this turn,your choice is rock");
                    break;
                case 1:
                    System.out.println(">>In this turn,your choice is paper");
                    break;
                case 2:
                    System.out.println(">>In this turn,your choice is scissors");
                    break;
            }

            //show computer's choice
            this.comChoice = (int)(Math.random()*3);
            switch(comChoice){
                case 0:
                    System.out.println(">>In this turn,computer's choice is rock");
                    break;
                case 1:
                    System.out.println(">>In this turn,computer's choice is paper");
                    break;
                case 2:
                    System.out.println(">>In this turn,computer's choice is scissors");
                    break;
            }

            //compare these 2 choices
            switch(myChoice){
                case 0:
                    if(this.comChoice == 0){
                        array[this.count] = 0;
                        System.out.println(">>It's a draw play");
                    }else if(this.comChoice == 1) {
                        array[this.count] = -1;
                        System.out.println(">>You lost in this turn");
                    }else{
                        array[this.count] = 1;
                        System.out.println(">>You win in this turn");
                    }
                    break;
                case 1:
                    if(this.comChoice == 1){
                        array[this.count] = 0;
                        System.out.println(">>It's a draw play");
                    }else if(this.comChoice == 2) {
                        array[this.count] = -1;
                        System.out.println(">>You lost in this turn");
                    }else{
                        array[this.count] = 1;
                        System.out.println(">>You win in this turn");
                    }
                    break;
                case 2:
                    if(this.comChoice == 2){
                        array[this.count] = 0;
                        System.out.println(">>It's a draw play");
                    }else if(this.comChoice == 0) {
                        array[this.count] = -1;
                        System.out.println(">>You lost in this turn");
                    }else{
                        array[this.count] = 1;
                        System.out.println(">>You win in this turn");
                    }
                    break;
            }
            System.out.println("--------result--------");
            this.count++;
        }
    }

    public void info() {
        System.out.println(" ");
        System.out.println("--------info---------");
        System.out.println("Turn\t\tResult");

        for (int i = 0; i < this.count; i++) {
            if (this.array[i] == 1) {
                System.out.println(i + "\t\twin");
            } else if(this.array[i] == -1) {
                System.out.println(i + "\t\tlose");
            }else{
                System.out.println(i + "\t\tdraw");
            }
        }

        System.out.println("---------------------");
    }

}
