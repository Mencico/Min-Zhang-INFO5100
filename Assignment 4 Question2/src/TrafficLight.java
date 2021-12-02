import java.util.concurrent.locks.ReentrantLock;

class TrafficLight {

        private ReentrantLock lock;
        private boolean isLightAGreen;
        public TrafficLight() {
            lock = new ReentrantLock(true);
            isLightAGreen = true;
        }
        public void carArrived(
                int carId,           // ID of the car
                int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
                int direction,       // Direction of the car
                Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
                Runnable crossCar    // Use crossCar.run() to make car cross the intersection
        ) throws InterruptedException {
            lock.lock();
            try {
                if (!isLightAGreen && roadId == 1 || isLightAGreen && roadId == 2) {
                    isLightAGreen = !isLightAGreen; // Toggle boolean variable
                    turnGreen.run();
                }
                crossCar.run();
            } finally {
                lock.unlock();
            }
        }
    }

