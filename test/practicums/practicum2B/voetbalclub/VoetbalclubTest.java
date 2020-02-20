package practicums.practicum2B.voetbalclub;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    private Voetbalclub voetbalclub;


    @BeforeEach
    public void init(){
        System.out.println("init");
        voetbalclub = new Voetbalclub("");

    }

    @Test
    void verwerkGewonnenWedstrijd(){

        voetbalclub.verwerkResultaat('w');
        assertEquals(3, voetbalclub.aantalPuntenOptellen());
        assertEquals(1, voetbalclub.aantalGespeeldOptellen());
        assertTrue(voetbalclub.toString().contains("1 1 0 0 3"));


    }


    @Test
    void verwerkWedstrijdGelijk(){

        voetbalclub.verwerkResultaat('g');
        assertEquals(1, voetbalclub.aantalPuntenOptellen());
        assertEquals(1, voetbalclub.aantalGespeeldOptellen());
        assertTrue(voetbalclub.toString().contains("1 0 1 0 1"));
    }

    @Test
    void verwerkWedstrijdVerloren(){


        voetbalclub.verwerkResultaat('v');
        assertEquals(0, voetbalclub.aantalPuntenOptellen());
        assertEquals(1, voetbalclub.aantalGespeeldOptellen());
        assertTrue(voetbalclub.toString().contains("1 0 0 1 0"));
    }

    @Test
    void verwerkCombiWedstrijd(){

        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('v');

        assertEquals(3, voetbalclub.aantalPuntenOptellen());
        assertEquals(2, voetbalclub.aantalGespeeldOptellen());
        assertTrue(voetbalclub.toString().contains("2 1 0 1 3"));

    }


    @Test
    void verwerkFouteWedstrijd(){

        voetbalclub.verwerkResultaat('X');
        voetbalclub.verwerkResultaat('S');
        voetbalclub.verwerkResultaat('G');
        voetbalclub.verwerkResultaat('P');

        assertEquals(0, voetbalclub.aantalPuntenOptellen());
        assertEquals(0, voetbalclub.aantalGespeeldOptellen());
        assertTrue(voetbalclub.toString().contains("0 0 0 0 0"));


    }

    @Test
    void correcteNaam(){

        assertTrue(voetbalclub.getVoetbalclub().equals("FC"));

    }


}