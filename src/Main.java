import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Answer = 0;
        int points = 0;
        String Answer1 = "";
        int Answer3 = 0;
        int play_Data = 0;
        String Data_birth = "";
        int answer_minus = 0;
        int thwel = 0;

        System.out.println("enter name_");
        String Name = in.nextLine();
        System.out.println("enter Date of birth");
        Data_birth = in.nextLine();
        System.out.println("enter 1 play / enter 2 Data");
        play_Data = in.nextInt();

        while (play_Data == 1) {
            int random2 = (int) (Math.random() * ((4 - 1) + 1) + 1);
            //جمع
            while (random2 == 1) {
                System.out.println("جمع");
                random2 = (int) (Math.random() * ((4 - 1) + 1) + 1);
                int random = (int) (Math.random() * ((10 - 1) + 1) + 1);

                for (int number1 = 1; number1 <= 5; number1++) {
                    int s = random * number1;

                    if (number1 == 5) {
                        System.out.println(number1 * random);

                    }
                    if (number1 == 3) {
                        System.out.print("!" + ",");
                        Answer = s;
                    }
                    if (number1 == 4) {
                        System.out.print(s + ",");
                    }
                    if (number1 == 2) {
                        System.out.print(s + ",");
                    }
                    if (number1 == 1) {
                        System.out.print(s + ",");
                    }
                }
                System.out.println("enter Answer");
                Answer1 = in.next();
                if (Answer1.equals("step")) {

                    break;
                }

                if (Integer.parseInt(Answer1) == Answer) {
                    System.out.println("Correct");
                    points = points + 2;
                    break;
                } else {
                    System.out.println("error");
                }
            }
            while (random2 == 2) {
                //الاحرف
                random2 = (int) (Math.random() * ((4 - 1) + 1) + 1);
                String corect = "";
                String Geam_String[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
                int randomGamesString = (int) (Math.random() * ((20)) + 1);
                System.out.println("ترتيب حروف");
                for (int a = randomGamesString; a <= (5 + randomGamesString); a++) {
                    if (a == randomGamesString + 1) {
                        System.out.print(Geam_String[a] + ",");
                    }
                    if (a == randomGamesString + 2) {
                        System.out.print(Geam_String[a] + ",");
                    }
                    if (a == randomGamesString + 3) {

                        System.out.print("!" + ",");
                        corect = Geam_String[a];
                    }
                    if (a == randomGamesString + 4) {
                        System.out.print(Geam_String[a] + ",");
                    }
                    if (a == randomGamesString + 5) {
                        System.out.println(Geam_String[a]);
                    }
                }
                System.out.println("enter Answer");
                String Answer_String = in.next();
                if (Answer_String.equals("step")) {

                    break;
                } else if (corect.equals(Answer_String)) {
                    System.out.println("Correct");
                    points = points + 2;

                } else {
                    System.out.println("Error");
                }

            }
            while (random2 == 3) {
                //ناقص

                System.out.println("ناقص");
                random2 = (int) (Math.random() * ((4 - 1) + 1) + 1);
                int randem = (int) (Math.random() * (20 - 1) + 1);
                for (int numbr = 5; numbr > 0; numbr--) {
                    if (numbr == 5) {
                        System.out.print(randem * numbr + ",");
                    }
                    if (numbr == 4) {
                        System.out.print(randem * numbr + ",");
                    }
                    if (numbr == 3) {
                        System.out.print("?" + ",");
                        answer_minus = randem * numbr;
                    }
                    if (numbr == 2) {
                        System.out.print(randem * numbr + ",");
                    }
                    if (numbr == 1) {
                        System.out.println(randem * numbr);
                    }
                }
                System.out.println("enter answer");
                String answer_in = in.next();
                if (answer_in.equals("step")) {

                    break;

                }
                {
                    thwel = Integer.parseInt(answer_in);
                }
                if (thwel == answer_minus) {
                    System.out.println("correct");
                    points = points + 2;
                } else System.out.println("error");

            }//رفع الاسس
            while (random2 == 4) {
                System.out.println("رفع اسس");
                random2 = (int) (Math.random() * ((4 - 1) + 1) + 1);
                int rendem_2_5 = (int) (Math.random() * (7 - 1)) + 2;
                int ww = rendem_2_5;
                for (int aa = rendem_2_5; aa < rendem_2_5 + 5; aa++) {
                    if (aa == rendem_2_5) {
                        int num1 = ww * ww;
                        System.out.print(num1 + ",");
                        ww++;
                    }
                    if (aa == rendem_2_5 + 1) {
                        int num1 = ww * ww;
                        System.out.print(num1 + ",");
                        ww++;
                    }
                    if (aa == rendem_2_5 + 2) {
                        int num1 = ww * ww;
                        Answer3 = num1;
                        System.out.print("?" + ",");
                        ww++;
                    }
                    if (aa == rendem_2_5 + 3) {
                        int num1 = ww * ww;
                        System.out.print(num1 + ",");
                        ww++;
                    }
                    if (aa == rendem_2_5 + 4) {
                        int num1 = ww * ww;
                        System.out.println(num1);
                        ww++;
                    }
                }
                System.out.println("enter answerd");
                String input = in.next();
                if (input.equals("step")) {
                    break;

                }
                int input_int = Integer.parseInt(input);
                if (input_int == Answer3) {
                    System.out.println("correct");
                    points = points + 2;
                } else System.out.println("error");

            }
        }

        while (play_Data == 2) {
            String aa = Data_birth.substring(Data_birth.length() - 4);
            int number = Integer.parseInt(aa);
            System.out.println("Name = " + Name);
            System.out.println("age = " + (2022 - number));
            System.out.println("points = " + points);

        }


    }
}






