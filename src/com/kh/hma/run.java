package com.kh.hma;


public class run {
    public static void main(String [] args) {
    	CatFunction sCatf = new CatFunction();
    	EXIT:
    	while(true) {
    		int choice = sCatf.printMenu();
    		switch(choice) {
    		    case 1 : 
    		    	sCatf.inputCat();
    		    	break; 
    		    case 2 : 
    		    	sCatf.printCat();
    		    	break;
    		    case 3 : 
    		    	sCatf.printKcal();
    		    	break;
    		    case 4 : 
    		    	sCatf.printExit();
    		    	break EXIT;
    		    default :
    		    	sCatf.printException();
    		    	break;
    		}
    		
    		
    		
    	}
    }
}


//----------����� �Ϸ�ġ ��� �� ����ϱ�-----------
//0. �޴� printMenu
//1. ����� ���� �Է� inputCat
//2. ����� ���� ��� printCat
//3. ����� �ʿ� Į�θ� ��� -> ��� �� ��� printKcal 
//3. ���α׷� ���� printExit
//-----------------------------------------------------