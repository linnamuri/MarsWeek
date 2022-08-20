public class Mars {
    public static void main(String[] args) {
        //Mars Adventure Game Part 1

//Create a string variable named ColonyName, and set it equal to your desired name
        String colonyName = "Telecom";

//Create an int variable named ShipPopulation, and set it equal to 300
        int shipPopulation = 300;

//Create a double variable named ShipFood, and set it equal to 4000.00
        double shipFood = 4000.00;

//Create a boolean variable named Landing, and set it equal to true
        boolean landing = true;

        shipFood = shipFood - (shipPopulation * 0.75);
        System.out.println("The amount of food that is left after consuming for 1 day : " + shipFood);

        shipFood = shipFood - (shipPopulation * 0.75);
        System.out.println("The amount of food that is left after consuming for 2 days : " + shipFood);
        //An extra crate of food is found increasing ShipFood by 50%
        shipFood = shipFood + (4000.00 * 0.5);
        System.out.println("The amount of food that is left after finding an extra crate : " + shipFood);

//The births very timed perfectly and 5 more babies join the ShipPopulation
        shipPopulation += 5;
        System.out.println("Ship population after joining new babies: " + shipPopulation);

        String landingLocation = "The Hill";
        if (landingLocation.equals("thePlain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        try {
            landing = landingCheck(1);
            GuessingGame gm=new GuessingGame();
            MarsExpedition me =new MarsExpedition();
            FindingsLists fl =new FindingsLists();

        }
        catch (Exception e)
            {
                System.out.println("handling interrupted exception");
            }
    }

    public static boolean landingCheck(int loops) throws InterruptedException
    {
        for (int i = 0; i <= loops; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Keep Center");

            }
            else if(i % 5 == 0)
            {
                System.out.println("Right");
            }
            else if(i % 3 == 0)
            {
                System.out.println("Left");
            }
                else
            {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }

}

