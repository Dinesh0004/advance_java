package advance_java1;

class HillStations {// parent class created 
    void location() {
        System.out.println("Location is unknown");
    }

    void famousFor() {
        System.out.println("Famous for something");
    }
}

class Manali extends HillStations {// child class created
    void location() {//overridden
        System.out.println("Manali is in Himachal Pradesh");
    }

    void famousFor() {//overridden
        System.out.println("It is famous for Hadimba Temple and adventure sports");
    }
}

class Mussoorie extends HillStations {// child class created
    void location() {//overridden
        System.out.println("Mussoorie is in Uttarakhand");
    }

    void famousFor() {//overridden
        System.out.println("It is famous for education institutions");
    }
}

class Gulmarg extends HillStations {// child class created
    void location() {//overridden
        System.out.println("Gulmarg is in J&K");
    }

    void famousFor() {//overridden
        System.out.println("It is famous for skiing");
    }
}

public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HillStations h;// object created

        h = new Manali();
        h.location();
        h.famousFor();

        h = new Mussoorie();
        h.location();
        h.famousFor();

        h = new Gulmarg();
        h.location();
        h.famousFor();
	}

}
