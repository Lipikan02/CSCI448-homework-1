package polymorphia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FightTest {
    @Test
    void testCreation() {
        Adventurer bilbo = new Adventurer("Bilbo", 6.0);
        Creature ogre = new Creature("Shrek", 5.0);

        assertTrue(bilbo.fight(ogre));
    }
}
