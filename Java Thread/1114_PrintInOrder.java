/*
我们提供了一个类：

public class Foo {
  public void one() { print("one"); }
  public void two() { print("two"); }
  public void three() { print("three"); }
}
三个不同的线程将会共用一个 Foo 实例。

线程 A 将会调用 one() 方法
线程 B 将会调用 two() 方法
线程 C 将会调用 three() 方法
请设计修改程序，以确保 two() 方法在 one() 方法之后被执行，three() 方法在 two() 方法之后被执行。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/print-in-order
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/

/*
执行用时：12 ms
内存消耗：39.6 MB
77.85%
*/
import java.util.concurrent.Semaphore;	
/*Semaphore is a classic concorrency tool.
  It maintains a set of permits: new Semaphore(total permits); 
  use "acquire()" to requirest for the permit;
  use "release()" to release the permit.
  New task has to wait if the permits are all preempted, until one releases its permit.
*/
class Foo {
    private Semaphore oneTwo = new Semaphore(0);
    private Semaphore twoThree = new Semaphore(0);	
	//Semaphore(0): The first acquire() will be blocked until a release() is done.
	//Semaphore(1): The first acquire() is accepted.
    
	public Foo() {}

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        oneTwo.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        oneTwo.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        twoThree.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        twoThree.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}