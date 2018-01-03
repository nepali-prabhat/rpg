package rpg;
interface StorageUnit{
	public void save(String name);
	
}
class cloud implements StorageUnit{
	
	cloud(){
	}

	@Override
	public void save(String name) {
		System.out.printf("%s is saved in cloud",name);
		
	}
	public void transferIntoCloud(){
		
	}

}

class local implements StorageUnit {
	local() {
	}

	@Override
	public void save(String name) {
		System.out.printf("%s is saved in local drive",name);
		
	}
	public void trasferPendrive() {
		
	}
	
	
	}
	
class externalDrive implements StorageUnit{

	@Override
	public void save(String name) {
		System.out.printf("%s is saved in external drive",name);
		
	}
	public void eject() {
		
	}
	
}
















