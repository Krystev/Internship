package Chapter16;

public class Ex3_Test {

	
	
	
	public static void main(String[] args) {
		Ex3<Object> deck = new Ex3<Object>();
        String line;
        line = "1 2 3 4";
        String[] elementsToStarStr = line.split(" ");
        if (elementsToStarStr.length > 0)
        {
            for (int i = 0; i < elementsToStarStr.length; i++)
            {
                deck.addToStart(Integer.parseInt(elementsToStarStr[i]));
            }   
        }
        line = "1";
        String[] elementsToEndStr = line.split(" ");
        if (elementsToEndStr.length > 0)
        {
            for (int i = 0; i < elementsToEndStr.length; i++)
            {
                deck.addToEnd(Integer.parseInt(elementsToEndStr[i]));
            }
        }
        line = "4";
        int elementsToRemoveFromStart = Integer.parseInt(line);
        line = "1";
        int elementsToRemoveFromEnd = Integer.parseInt(line);
        for (int i = 0; i < elementsToRemoveFromStart; i++) {
            
                System.out.println((deck.removeFromStart()));
        }
        
 
        for (int i = 0; i < elementsToRemoveFromEnd; i++)
        {
            
                System.out.println((deck.removeFromEnd()));
            }
            
        
	}

}
