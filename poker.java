import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void BasicTests() {
       
      assertEquals(true,Kata.CheckIfFlush(new String[]{"AS", "3S", "9S", "KS", "4S"}));
    assertEquals(false,Kata.CheckIfFlush(new String[]{"AD", "4S", "7H", "KC", "5S"}));
     assertEquals(false,Kata.CheckIfFlush(new String[]{"AD", "4S", "10H", "KC", "5S"}));
     assertEquals(true,Kata.CheckIfFlush(new String[]{"QD", "4D", "10D", "KD", "5D"}));
  }
    
}

public class Kata{
  public static boolean CheckIfFlush(String[] cards){

    if(cards[0].contains("S")){
      for(int i = 1;i < cards.length; i++){
        if(!cards[i].contains("S")){
          return false;
        }
      }
    }
    if(cards[0].contains("D")){
      for(int i = 1;i < cards.length; i++){
        if(!cards[i].contains("D")){
          return false;
        }
      }
    }
    if(cards[0].contains("H")){
      for(int i = 1;i < cards.length; i++){
        if(!cards[i].contains("H")){
          return false;
        }
      }
    }
    if(cards[0].contains("C")){
      for(int i = 1;i < cards.length; i++){
        if(!cards[i].contains("C")){
          return false;
        }
      }
    }
    
      
    
    
     return true; 
  }
}
