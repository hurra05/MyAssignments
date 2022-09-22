package org.system;

public abstract class Desktop extends Computer {
	abstract void DesktopSize();

	public static void main(String[] args) {
		Desktop obj=new Desktop() {
			
			@Override
			void DesktopSize() {
				// TODO Auto-generated method stub
				
			}
		};
			

 obj.ComputerModel();
 obj.DesktopSize();
	}

}
