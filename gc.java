class GarbageCollectionDemo{
	public void finalize(){
	System.out.println("Object is garbage collected.");}
	public static void main(String args []){
		GarbageCollectionDemo gcd1 = new GarbageCollectionDemo();
		GarbageCollectionDemo gcd2 = new GarbageCollectionDemo();
		gcd1 = null;
		gcd2 = null;
		System.out.println("Garbage Destroyed.");
		System.gc();
	}
}