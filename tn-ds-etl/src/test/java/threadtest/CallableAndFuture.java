package threadtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import org.junit.Test;


public class CallableAndFuture {
	
	/**
	 * 有futureTask.get执行的情况：
	 * futureTask1和futureTask2并行执行，只有当耗时最长的一个线程（futureTask2）执行完成之后，才会继续执行主线程下面的方法
	 */
	@Test
	public void test1() {
		// 创建callable对象
		Callable<Integer> callable1 = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				Thread.sleep(7000);
				System.out.println("callable1已经获取结果");
				return new Random().nextInt(100);
			}
		};
		Callable<Integer> callable2 = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				Thread.sleep(5000);
				System.out.println("callable2已经获取结果");
				return new Random().nextInt(100);
			}
		};
		
		// 创建futureTask对象
		FutureTask<Integer> futureTask1 = new FutureTask<Integer>(callable1);
		FutureTask<Integer> futureTask2 = new FutureTask<Integer>(callable2);
		
		// 开启线程任务
		new Thread(futureTask1).start();
		new Thread(futureTask2).start();
		
		try {
			System.out.println("futureTask1结果是：" + futureTask1.get());
			System.out.println("futureTask2结果是：" + futureTask2.get());
			
			System.out.println("做一些事。。。");
			Thread.sleep(8000);
			System.out.println("事情做完!");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	
	
	/**
	 * 没有futureTask.get执行的情况：
	 * futureTask1和futureTask2并行执行，这两个线程也和主线程并行执行，并且这两个线程存在于主线程的存活期间，主线程死掉，这两个线程也会退出
	 * 这种情况下futureTask1有输出结果，而futureTask2没有输出结果
	 */
	@Test
	public void test2() {
		// 创建callable对象
		Callable<Integer> callable1 = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				Thread.sleep(7000);
				System.out.println("callable1已经获取结果");
				return new Random().nextInt(100);
			}
		};
		Callable<Integer> callable2 = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				Thread.sleep(10000);
				System.out.println("callable2已经获取结果");
				return new Random().nextInt(100);
			}
		};
		
		// 创建futureTask对象
		FutureTask<Integer> futureTask1 = new FutureTask<Integer>(callable1);
		FutureTask<Integer> futureTask2 = new FutureTask<Integer>(callable2);
		
		// 开启线程任务
		new Thread(futureTask1).start();
		new Thread(futureTask2).start();
		
		try {
			System.out.println("做一些事。。。");
			Thread.sleep(8000);
			System.out.println("事情做完!");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	
	
	/**
	 * future1和future2串行执行，在此处future1执行完之后才执行future2，future2.get执行完之后才继续往下执行
	 * 注：不管future1.get 或 future2.get执行与否，结果都是future1和future2串行执行，先执行future1再执行future2，
	 *    future1和future2依赖于主线程的存活情况
	 */
	@Test
	@SuppressWarnings("unused")
	public void test3() {
		ExecutorService esThreadPool = Executors.newSingleThreadExecutor();
		Future<Integer> future1 = esThreadPool.submit(new Callable<Integer>(){
			@Override
			public Integer call() throws Exception {
				Thread.sleep(5000);
				System.out.println("future1已经获取结果");
				return new Random().nextInt(100);
			}
		});
		Future<Integer> future2 = esThreadPool.submit(new Callable<Integer>(){
			@Override
			public Integer call() throws Exception {
				Thread.sleep(7000);
				System.out.println("future2已经获取结果");
				return new Random().nextInt(100);
			}
		});
		
		try {
			//System.out.println("future1结果是：" + future1.get());
			//System.out.println("future2结果是：" + future2.get());
			
			System.out.println("做一些事。。。");
			Thread.sleep(8000);
			System.out.println("事情做完!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			esThreadPool.shutdown();
		}
	}
	
	
	/**
	 * 执行效果同test1和test2
	 * 执行多个带返回值的任务，并取得多个返回值
	 * 
	 * 1.CompletionService.take 会获取并清除已经完成Task的结果，如果当前没有已经完成Task时，会阻塞。
	 * 2.“先创建一个装Future类型的集合，用Executor提交的任务返回值添加到集合中，最后遍历集合取出数据” 
	 * -- 这种方法通常是按照Future加入的顺序。两个方法最大的差别在于遍历 Future 的顺序，相对来说， 
	 * CompletionService 的性能更高。考虑如下场景：多线程下载，结果用Future返回。第一个文件特别大，
	 * 后面的文件很小。用方法1，能很快知道已经下载完文件的结果(不是第一个)；而用方法2，必须等第一个文件
	 * 下载结束后，才会获得其他文件的下载结果。
	 * 
	 */
	@Test
	public void test5() {
		ExecutorService esThreadPool = Executors.newCachedThreadPool();
		ExecutorCompletionService<Integer> cs = new ExecutorCompletionService<Integer>(esThreadPool);
		
		cs.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				Thread.sleep(6000);
				System.out.println("future1已经获取结果");
				return new Random().nextInt(100);
			}
		});
		cs.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				Thread.sleep(3000);
				System.out.println("future2已经获取结果");
				return new Random().nextInt(100);
			}
		});
		
		try {
			System.out.println("先执行完的future结果：" + cs.take().get());
			System.out.println("后执行完的future结果：" + cs.take().get());
			
			System.out.println("做一些事。。。");
			Thread.sleep(8000);
			System.out.println("事情做完!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			esThreadPool.shutdown();
		}
	}
	
	
	
	
	@Test
	public void test6() {
		// 创建callable对象
		Callable<Boolean> callable = new Callable<Boolean>() {
			@Override
			public Boolean call() throws Exception {
				Thread.sleep(7000);
				System.out.println("callable已经获取结果");
				return true;
			}
		};
		
		// 创建futureTask对象
		for (int loop=0; loop<10; loop++) {
			List<FutureTask<Boolean>> futureTasks = new ArrayList<FutureTask<Boolean>>();
			for (int i=0; i<5; i++) {
				FutureTask<Boolean> futureTask = new FutureTask<Boolean>(callable);
				futureTasks.add(futureTask);
				
				new Thread(futureTask).start();
			}
			
			try {
				for (FutureTask<Boolean> futureTask: futureTasks) {
					Boolean success = futureTask.get();
					System.out.println(success);
				}
				
				System.out.println("做一些事。。。");
				Thread.sleep(8000);
				System.out.println("事情做完!");
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
}
