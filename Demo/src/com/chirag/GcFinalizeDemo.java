package com.chirag;

public class GcFinalizeDemo {
	
	static int count = 0;
	
	public static void main(String[] args) {
		
		// case - 1 
		/*String str = new String("Chirag");
		
		str = null;
		GcFinalizeDemo gcdemo = new GcFinalizeDemo();
		
		gcdemo = null;
		System.gc();*/
		
		// case - 2
		/*GcFinalizeDemo gcdemo = new GcFinalizeDemo();
		gcdemo.finalize();
		gcdemo.finalize();
		gcdemo = null;
		*/
		Runtime r = Runtime.getRuntime();
		System.out.println("Available Processors : " + r.availableProcessors());
		System.out.println("Max Memory : " + r.maxMemory()/(1024 * 1024));
		
		System.out.println("Free Memory : " + r.freeMemory()/(1024 * 1024));
		System.out.println("TotalMemory : " + r.totalMemory()/(1024 * 1024));
		
		for(int i =0; i<100; i++) {
			GcFinalizeDemo gcdemo = new GcFinalizeDemo();
			gcdemo = null;
		}
		
		
		System.out.println("\n\n After \n Free Memory : " + r.freeMemory()/(1024*1024));
		System.out.println("TotalMemory : " + r.totalMemory()/(1024 * 1024));
		
		Runtime.getRuntime().gc();
		
		System.out.println("\n\n After GC \n Free Memory : " + r.freeMemory()/(1024*1024));
		System.out.println("TotalMemory : " + r.totalMemory()/(1024*1024));
		
//		System.gc();
//		System.out.println("End of Main");
	}
	
	public void finalize() {
		count++;
		System.out.println("Finallized Method Called.. " + count);
	}

}
