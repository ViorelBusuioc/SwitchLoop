public class SwitchChallenge {

    public static void main(String[] args) {

    natoChar('G');
    printDayOfWeek(5);
    printWeekDay(0);

    }

    public static char natoChar (char letter) {

        switch (letter) {
            case 'A':
                System.out.println("In NATO phonetic alphabet " + letter + " = Able");
                break;
            case 'B':
                System.out.println("In NATO phonetic alphabet " + letter + " = Baker");
                break;
            case 'C':
                System.out.println("In NATO phonetic alphabet " + letter + " = Charlie");
                break;
            case 'D':
                System.out.println("In NATO phonetic alphabet " + letter + " = Dog");
                break;
            case 'E':
                System.out.println("In NATO phonetic alphabet " + letter + " = Easy");
                break;
            case 'F':
                System.out.println("In NATO phonetic alphabet " + letter + " = Fox");
                break;
            case 'G':
                System.out.println("In NATO phonetic alphabet " + letter + " = George");
                break;
            default:
                System.out.println(letter + " = Not found");
        }
        return letter;
    }

    public static void printDayOfWeek (int day) {

        switch (day) {
            case 0 -> System.out.println(day + " is Sunday");
            case 1 -> System.out.println(day + " is Monday");
            case 2 -> System.out.println(day + " is Tuesday");
            case 3 -> System.out.println(day + " is Wednesday");
            case 4 -> System.out.println(day + " is Thursday");
            case 5 -> System.out.println(day + " is Friday");
            case 6 -> System.out.println(day + " is Saturday");
            default -> System.out.println(day + " = Invalid day number");
        }
    }

    public static void printWeekDay (int day) {

        if (day == 0) {
            System.out.println(day + " is Sunday");
        } else if (day == 1) {
            System.out.println(day + " is Monday");
        } else if (day == 2) {
            System.out.println(day + " is Tuesday");
        }else if (day == 3) {
            System.out.println(day + " is Wednesday");
        } else if (day == 4) {
            System.out.println(day + " is Thursday");
        } else if (day == 5) {
            System.out.println(day + " is Friday");
        } else if (day == 6) {
            System.out.println(day + " is Saturday");
        } else
            System.out.println(day + " = Invalid day number");
    }
}
