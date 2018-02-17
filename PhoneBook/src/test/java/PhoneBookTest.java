import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {

    @Test
    public void addTest(){
      //Given
        PhoneBook record = new PhoneBook();
        String expected = "302-123-2345";

      //When
        record.addRecord("Mike","302-123-2345");
        String actual = record.lookup("Mike");

       //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void lookupTest(){
        //Given
        PhoneBook record = new PhoneBook();
        String expected = "302-123-2345";
        record.addRecord("Mike",expected);

        //When
        String actual = record.lookup("Mike");

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){
        //Given
        PhoneBook record = new PhoneBook();
        record.addRecord("Mike","302-123-2345");
        PhoneBook expected = null;

        //When
        record.remove("Mike");
        String actual = record.lookup("Mike");

       //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
     public void listAllEntriesTest(){
        //Given
        PhoneBook record = new PhoneBook();
        record.addRecord("Mike","302-123-2345");
        record.addRecord("Mary","302-234-5678");
        String expected = "[Mike=302-123-2345, Mary=302-234-5678]";

         //When
        String actual = record.toString();

        // Then
        Assert.assertEquals(expected, actual);
     }

    @Test
    public void reverseLookUpTest(){
        PhoneBook record = new PhoneBook();
        record.addRecord("John","302-034-0670");
        record.addRecord("Mike","302-123-2345");
        String expected = "John";

        //When
        String actual = record.reverseLookUp("302-034-0670");

        //Then
        Assert.assertEquals(expected,actual);

    }

}
