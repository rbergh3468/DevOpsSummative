package bpp.com.devops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class NameManagerTest {

    private NameManager testObject;

    @BeforeEach
    public void setup() {
        testObject = new NameManager();
    }

    @Test
    public void testCreateName() {

        String name = testObject.createName();

        assertNotNull(name, "Name should not be null");
        assertEquals("Secret Squirrel", name, "Name does not match");

    }
    
    @Test
    public void testAddAnimal() { 	
    	
    	testObject.addAnimal("Horse");
    	
        assertEquals("Secret Squirrel", "Secret Horse", "Name does not match");
    }
    
    @Test
    public void testAddAdjective() { 	
    	
    	testObject.addAdjective("Golden");
    	
        assertEquals("Secret Squirrel", "Goldent Horse", "Name does not match");
    }

}