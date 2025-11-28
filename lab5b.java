package advance_java1;

class restaurant //restaurant class is created within this the foodorder,cookorder and recievedorder method was created
{
	boolean ordered = false;
    boolean cooked = false;
	synchronized void foodOrder(String orderName) {
        System.out.println("Thread waiter: customer has ordered " + orderName);

        ordered = true;
        notifyAll();

        while (!cooked) {  // waiter waits until food is cooked
            try { wait(); } catch (Exception e) {}
        }
    }
	
	synchronized void cookedOrder(String orderName) {

        while (!ordered) {  // cook waits until waiter takes the order
            try { wait(); } catch (Exception e) {}
        }

        System.out.println("Thread cook: chef has received the order " + orderName);
        System.out.println("Thread cook: cooking under progress.....");

        try { Thread.sleep(1000); } catch (Exception e) {}

        cooked = true;
        notifyAll();
    }

    synchronized void recievedOrder(String orderName) {

        while (!cooked) {  // customer waits until cooked
            try { wait(); } catch (Exception e) {}
        }

        System.out.println("Thread customer: food is delivered to customer!!");
    }
}

class customer extends Thread{
	restaurant r;
    String order;

    customer(restaurant r, String order) {
        this.r = r;
        this.order = order;
    }

    public void run() {
        r.recievedOrder(order);
    }
}
class cook extends Thread{
	restaurant r;
    String order;

    cook(restaurant r, String order) {
        this.r = r;
        this.order = order;
    }

    public void run() {
        r.cookedOrder(order);
    }
}
class waiter extends Thread{
	restaurant r;
    String order;

    waiter(restaurant r, String order) {
        this.r = r;
        this.order = order;
    }

    public void run() {
        r.foodOrder(order);
    }
}
public class lab5b {
	public static void main(String[] args) {
        restaurant r = new restaurant();// the object is created
        String order = "Chicken biryani";//to pass the value the variable is created

        System.out.println("Thread customer: customer is choosing an order ....");

        customer c1 = new customer(r, order);//the  object created for the thread class
        waiter w1 = new waiter(r, order);
        cook k1 = new cook(r, order);

        c1.start();//thread called...
        w1.start();
        k1.start();
	}
}
