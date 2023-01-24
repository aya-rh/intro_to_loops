import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {

        ArrayList<String> trainers = new ArrayList<>();

        trainers.add("Colin");
        trainers.add("Richard");
        trainers.add("Ed");

        System.out.println(trainers.get(0).toUpperCase());
        System.out.println(trainers.get(1).toUpperCase());
        System.out.println(trainers.get(2).toUpperCase());

//         for a list of this size, coding it all out like this is feasible
//         when it starts getting long or if you don't know how many trainers there are or will keep increasing
//         we want our code to be as dry as possible (Don't, Repeat, Yourself)
//
//         this is where for loops come in

//         FOR LOOPS
//         java has two types of for loop
//

//         -------------- ENHANCED FOR LOOP ----------------

        ArrayList<String> colours = new ArrayList<>();

        // ArrayList<String> colours = new ArrayList<>(Arrays.asList("blue, purple"));
        // can do this too where you have it as a list

        colours.add("red");
        colours.add("Silver");
        colours.add("green");
        colours.add("raspberry red");
        // would print [red, Silver, green, raspberry red]
        System.out.println(colours);


//        System.out.println(colours.get(0));
//        System.out.println(colours.get(1));
//        System.out.println(colours.get(2));
//         would print them all on separate lines



//         instead we will input the for loop here, and we can do anything to the colours
//         essentially it is:
//         creating a variable of type String and calling it colour
//         like an if we put curly brackets to open it up and expand
//         everytime it loops it reassigns "colour" to the next value of listed colours

        // identical to commented above and will print them on separate lines
        for (String colour: colours) {
            System.out.println(colour);

        }

        for (String colour: colours) {
            System.out.println(colour.toUpperCase());

        }
        // this will do the same as above print on separate lines and just make them all capital letters


        // if we wanted to filter colours to only print colours that start with an "r"
        // first letter of string will always be (0)
        for (String colour : colours) {
            if (colour.charAt(0) == 'r') {
                // charAt(0) refers to the first character in any of the strings
                System.out.println(colour);
//                 first letter (i.e. letter of index 0) of red? --> print
//                 first letter of silver? --> do not print
//                 first letter of green? --> do not print
//                 first letter of raspberry red? --> print
            }
        }
        // this will print out red and raspberry red on separate lines


        // to find out the last letter we need to know how long the strings are first
        // because the last letter of string will change everytime depending on words
        for (String colour : colours) {
            if (colour.charAt(colour.length() - 1) == 'r') {
                System.out.println(colour);
            }
        }
        // need to add the -1 because the index automatically starts at 0
        // array lists you use .length
        // array you use .size


        System.out.println("All colours: " + colours);


        // if we want to take this list of filtered strings and make a new array list with them:

        ArrayList<String> filteredColours = new ArrayList<>();

        for (String colour : colours) {
            if (colour.charAt(0) == 'r') {
                filteredColours.add(colour);
            }
        }

        System.out.println("Filtered colours beginning with 'r':" + filteredColours);




//        ------------- CLASSIC FOR LOOP -----------------

        for (int i = 0; i < colours.size() -1; i++) {
            // now we can do stuff to it

            System.out.println(colours.get(i));
            // identical to System.out.println(colours);

//            assigning i to a variable
            String colour = colours.get(i);
            // or String colour = colours[i];

            if (colours.get(i).charAt(0) == 'r') {
                System.out.println(colour);

            }

        }


//        for (int i = 0; i <= colours.size() -1; i++) {
//            // key difference here is the <=
//            System.out.println(colours.get(i));
//        }
//         does the same but better to use the top one



        // print odd numbers up to 20
        // i = 1 because we don't care about 0 since its odd numbers, 'i' can be anything
        // can give it its own array list

        for (int i = 1; i <= 20 ; i+=2) {
            System.out.println(i);
        }

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 1; i <= 20 ; i+=2) {
            oddNumbers.add(i);
        }
        System.out.println(oddNumbers);




        // say you had a list of employees, and you wanted to find out if there was someone called Aya there
        // ------>

        ArrayList<String> employees = new ArrayList<>();

        employees.add("a");
        employees.add("b");
        employees.add("c");
        employees.add("c");
        employees.add("d");
        employees.add("e");
        employees.add("f");
        employees.add("Aya");
        employees.add("k");
        employees.add("q");
        employees.add("n");
        employees.add("m");

        String nameToFind = "Aya";

        for (String employee : employees) {
            if (employee.equals("Aya")) {
                System.out.println("There is an employee called " + nameToFind);
                // no point searching whole list if found early on, break; stops the loop when found
                // continue; (instead of break;) acts as a skip rather than a stop
                // will print all the names other than "Aya" and will ignore any other lines of code underneath the if
                break;
            }
            System.out.println(employee);
        }


//         WHILE LOOP
        while (true) {
            // do something
            System.out.println("Hello, from the while loop");
            break;
        }
        // will give you an infinite loop in this case
        // can add a break to stop it
        // avoid using while loops - for loops are better and more efficient





    }
}
