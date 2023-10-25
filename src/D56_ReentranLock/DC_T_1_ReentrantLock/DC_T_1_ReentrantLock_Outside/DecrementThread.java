package D56_ReentranLock.DC_T_1_ReentrantLock.DC_T_1_ReentrantLock_Outside;

import java.util.concurrent.locks.ReentrantLock;

public class DecrementThread extends Thread {
    private SharedValues sharedValues;
    private ReentrantLock reentrantLock;

    public DecrementThread(SharedValues sharedValues, ReentrantLock reentrantLock) {
        this.sharedValues = sharedValues;
        this.reentrantLock = reentrantLock;
    }

    public void run() {
        reentrantLock.lock();
        try {
            sharedValues.setCounter(sharedValues.getCounter() - 3);
        } finally {
            reentrantLock.unlock();
        }

    }

}
