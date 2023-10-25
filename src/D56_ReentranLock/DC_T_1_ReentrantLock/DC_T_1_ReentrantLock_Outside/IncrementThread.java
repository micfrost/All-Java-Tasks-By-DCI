package D56_ReentranLock.DC_T_1_ReentrantLock.DC_T_1_ReentrantLock_Outside;

import java.util.concurrent.locks.ReentrantLock;

public class IncrementThread extends Thread {
    private SharedValues sharedValues;
    private ReentrantLock reentrantLock;

    public IncrementThread(SharedValues sharedValues, ReentrantLock reentrantLock) {
        this.sharedValues = sharedValues;
        this.reentrantLock = reentrantLock;
    }

    public void run() {
        reentrantLock.lock();
        try {
            sharedValues.setCounter(sharedValues.getCounter() + 5);
        } finally {
            reentrantLock.unlock();
        }

    }

}
