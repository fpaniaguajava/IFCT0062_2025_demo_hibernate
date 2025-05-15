package com.fernandopaniagua.demo;

import com.fernandopaniagua.demo.model.Genre;
import com.fernandopaniagua.demo.model.Studio;
import com.fernandopaniagua.demo.model.StudioPK;
import com.fernandopaniagua.demo.model.Videogame;
import com.fernandopaniagua.demo.repository.GenreDAO;
import com.fernandopaniagua.demo.repository.StudioDAO;
import com.fernandopaniagua.demo.repository.VideogameDAO;

import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //0. CREACIÓN INICIAL DE DATOS
        //System.out.println("0. CREACIÓN INICIAL DE DATOS");
        //createStudios();
        //createGenres();
        //createVideogames();

        //1. CREATE GENRE
        System.out.println("1. CREATE GENRE");
        Genre sandbox = new Genre("Sandbox", "Mundo abierto. El jugador tiene libertad de movimientos por el entorno");
        GenreDAO.create(sandbox);

        //2. CREATE VIDEOGAME
        System.out.println("2. CREATE VIDEOGAME");
        Videogame gtaV = new Videogame("Gran Thieft Auto", "PC", true, 59, true, sandbox);
        VideogameDAO.create(gtaV);

        //3. READ VIDEOGAME
        System.out.println("3. READ VIDEOGAME");
        Videogame videogame = VideogameDAO.read(gtaV.getId());
        System.out.println(videogame);

        //4. UPDATE VIDEOGAME
        System.out.println("4. UPDATE VIDEOGAME");
        Videogame updatedVideogame = VideogameDAO.read(gtaV.getId());
        updatedVideogame.setTitle("Grand Theft Auto");
        VideogameDAO.update(updatedVideogame);
        System.out.println(VideogameDAO.read((gtaV.getId())));

        //5. DELETE VIDEOGAME
        System.out.println("5. DELETE VIDEOGAME");
        VideogameDAO.delete(updatedVideogame);

        //6. CREATE STUDIO
        System.out.println("6. CREATE STUDIO");
        Studio newStudio = new Studio(new StudioPK("Naughty Dog", 1995), "Desarrollo de videojuegos para PlayStation", "EEUU");
        StudioDAO.create(newStudio);
    }

    /**
     * Crea 10 estudios
     */
    public static void createStudios() {
        Studio s1 = new Studio(new StudioPK("Nutting Associates", 1971), "Desarrollo de videojuegos para Odyssey", "EEUU");
        StudioDAO.create(s1);

        Studio s2 = new Studio(new StudioPK("Atari", 1972), "Pioneros en videojuegos arcade y consolas", "EEUU");
        StudioDAO.create(s2);

        Studio s3 = new Studio(new StudioPK("Nintendo", 1889), "Desarrollador y editor líder en videojuegos", "Japón");
        StudioDAO.create(s3);

        Studio s4 = new Studio(new StudioPK("Sega", 1960), "Desarrollador de consolas y videojuegos arcade", "Japón");
        StudioDAO.create(s4);

        Studio s5 = new Studio(new StudioPK("Rare", 1985), "Desarrollador innovador de videojuegos para consolas", "Reino Unido");
        StudioDAO.create(s5);

        Studio s6 = new Studio(new StudioPK("Valve", 1996), "Creador de Steam y videojuegos icónicos", "EEUU");
        StudioDAO.create(s6);

        Studio s7 = new Studio(new StudioPK("CD Projekt", 1994), "Conocido por la saga The Witcher", "Polonia");
        StudioDAO.create(s7);

        Studio s8 = new Studio(new StudioPK("Rockstar Games", 1998), "Creador de Grand Theft Auto", "EEUU");
        StudioDAO.create(s8);

        Studio s9 = new Studio(new StudioPK("Ubisoft", 1986), "Desarrollador global de franquicias como Assassin's Creed", "Francia");
        StudioDAO.create(s9);

        Studio s10 = new Studio(new StudioPK("Bethesda", 1986), "Creador de The Elder Scrolls y Fallout", "EEUU");
        StudioDAO.create(s10);
    }

    /**
     * Crea 5 géneros
     */
    public static void createGenres() {
        Genre g1 = new Genre("Plataformas", "Se caracterizan por tener que caminar, correr, saltar o escalar sobre una serie de plataformas y acantilados, con enemigos, mientras se recogen objetos para poder completar el juego");
        Genre g2 = new Genre("Shooter", "Se centra en el uso de armas de fuego para combatir enemigos en escenarios de acción rápida, en primera o tercera persona");
        Genre g3 = new Genre("Rol (RPG)", "Permiten al jugador asumir el papel de un personaje en un mundo ficticio, desarrollando sus habilidades, historia y decisiones");
        Genre g4 = new Genre("Estrategia", "Requieren planificación táctica y toma de decisiones para alcanzar objetivos, ya sea en tiempo real o por turnos");
        Genre g5 = new Genre("Deportes", "Simulan actividades deportivas reales como fútbol, baloncesto o carreras, con énfasis en competición y habilidades");

        GenreDAO.create(g1);
        GenreDAO.create(g2);
        GenreDAO.create(g3);
        GenreDAO.create(g4);
        GenreDAO.create(g5);
    }

    /**
     * Crea 100 videojuegos
     */
    public static void createVideogames() {
        String[] names = {
                "Call of Battle", "Sky Warriors", "Dungeon Quest", "Pixel Runner", "Stealth Ops",
                "Goal Kings", "Galaxy Strike", "Shadow Blade", "Fantasy Rise", "Turbo Soccer",
                "Dark Arena", "Speed Racer", "Zombie Land", "Mythical Realms", "Battlefront",
                "Shooting Stars", "Ninja Jump", "Empire Builder", "Virtual Coach", "Overload",
                "Night Siege", "Cyber Brawl", "Dragon Age", "Island Escape", "Sniper X",
                "Arcade Master", "Mage Trials", "Combat Strike", "Robo War", "Goal Hero",
                "Alien Wars", "Jump Hero", "Tactical Edge", "Real Slam", "Chrono Legends",
                "Strike Force", "Ninja Code", "Defense Grid", "Slam Dunk", "Heroic Souls",
                "Ghost Mission", "RunCraft", "Turn War", "Penalty Shot", "Digital Storm",
                "FireLine", "Pixel Clash", "Chess Lord", "Bike Rush", "Elven Path",
                "Iron Glory", "Sprint Hero", "Civic Control", "Free Kick", "Grave Diggers",
                "Astro Turf", "Sky Jumpers", "Base Commander", "Speed Pass", "World Tactics",
                "Hacker's Den", "Fire Ninja", "Battle Shift", "Race Royale", "Warbound",
                "Magic Tides", "Aim Zone", "Jungle Dash", "Hex Stratego", "Stadium King",
                "Void Wars", "Bit Jumper", "General's Order", "Pro Basketball", "Legend Age",
                "Stormfire", "Rogue Shift", "Build Empire", "Real Football", "Crimson Dawn",
                "Bullet Fury", "Platform Panic", "Map Commander", "Tennis Star", "Eternal Rune",
                "Sniper Nest", "Sky Bounce", "Clash Tactics", "Penalty Pro", "Wizards Duel",
                "Rapid Fire", "Jump Storm", "Strategic Strike", "Ice Rink Masters", "Myth of Steel",
                "War Cry", "Mega Sprint", "Tactic Rise", "Street Slam", "Arcane Fate",
                "Shadow Fury", "Neon Rush", "War Forge", "Volley Master", "Chrono Quest"
        };

        String[] platforms = {"PC", "PlayStation", "Xbox", "Nintendo Switch", "Mobile"};
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            String name = names[i % names.length];
            String platform = platforms[rand.nextInt(platforms.length)];
            boolean multiplayer = rand.nextBoolean();
            int price = 20 + rand.nextInt(61); // Precio entre 20 y 80
            boolean status = rand.nextBoolean();
            int genreId = 1 + rand.nextInt(5); // 1 a 5

            Videogame vg = new Videogame(name, platform, multiplayer, price, status, GenreDAO.read(genreId));
            VideogameDAO.create(vg);
        }
    }
}