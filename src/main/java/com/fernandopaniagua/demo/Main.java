package com.fernandopaniagua.demo;

import com.fernandopaniagua.demo.model.Genre;
import com.fernandopaniagua.demo.model.Studio;
import com.fernandopaniagua.demo.model.StudioPK;
import com.fernandopaniagua.demo.model.Videogame;
import com.fernandopaniagua.demo.repository.GenreDAO;
import com.fernandopaniagua.demo.repository.StudioDAO;
import com.fernandopaniagua.demo.repository.VideogameDAO;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudioPK studioPK = new StudioPK("abcde", 88);
        Studio studio = new Studio(studioPK, "El Estudio", "Portugal");
        StudioDAO.create(studio);
        //CREATE VIDEOGAME
        //Genre genero = GenreDAO.read(1);
        //Videogame doom = new Videogame("Doom", "PC", true, 2, true, genero);
        //VideogameDAO.create(doom);
        //En este punto, el objeto 'persistido' ya tiene id.

        //READ VIDEOGAME
//        Videogame storedVideogame = VideogameDAO.read(fornite.getId());
//        System.out.println(storedVideogame);

        //UPDATE VIDEOGAME
//        fornite.setPlatform("XBox 360");
//        VideogameDAO.update(fornite);

        //DELETE VIDEOGAME
        //VideogameDAO.delete(storedVideogame);

        //CREATE GENERO
        //Genre adventure = new Genre("FPS", null);
        //GenreDAO.create(adventure);

        //List<Videogame> videogames = VideogameDAO.getAll();
        //videogames.forEach(System.out::println);

//        List<Videogame> videogames = VideogameDAO.findByPlatform("PC");
//        videogames.forEach(System.out::println);

        //createFakeData();

        Videogame vg = VideogameDAO.read(1);
        System.out.println(vg);
        System.out.println(vg.getGenre().getDescription());


    }
    public static void createFakeData() {

    }
}