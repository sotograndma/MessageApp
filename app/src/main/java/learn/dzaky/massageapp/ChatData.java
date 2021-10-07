package learn.dzaky.massageapp;

import java.util.ArrayList;

public class ChatData {
    private static String [] name = {
            "Arsenal",
            "Aston Villa",
            "Brighton & Hove Albion",
            "Burnley",
            "Chelsea",
            "Crystal Palace",
            "Everton"
    };

    private static String [] detail = {
            "Arsenal Football Club (dikenal pula sebagai Arsenal atau The Gunners) adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London",
            "Aston Villa berdiri tahun 1874 dan menggunakan stadion Villa Park dari tahun 1897 hingga sekarang. Aston Villa merupakan salah satu anggota pendiri Liga Sepak Bola (Football League) dan langsung mencapai kesuksesan, mereka memenangkan lima gelar dalam waktu tujuh musim.",
            "Brighton & Hove Albion Football Club adalah sebuah klub sepak bola profesional asal Inggris yang berbasis di kota pantai Brighton & Hove, di timur Sussex.",
            "Burnley Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Burnley, Lancashire. Klub ini sedang bermain di Liga Utama Inggris, kasta tertinggi sepak bola inggris di musim 2016-17 setelah memenangkan liga peringkat kedua yaitu Liga Championship Inggris di musim sebelumnya.",
            "Chelsea Football Club /ˈtʃɛlsiː/ adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris.",
            "Crystal Palace Football Club merupakan sebuah tim sepak bola Inggris yang bermarkas di London Borough of Croydon dan didirikan pada tahun 1905.",
            "Everton Football Club /ˈɛvərtən/ adalah sebuah klub sepak bola profesional yang bermarkas di Kota Liverpool, Inggris, dan merupakan klub rival dari klub sekota Liverpool."
    };

    private static int[] image = {
            R.drawable.arsenal,
            R.drawable.aston,
            R.drawable.brighton,
            R.drawable.burnley,
            R.drawable.chelsea,
            R.drawable.crystal,
            R.drawable.everton,

    };

    static ArrayList<Chat> getlistData(){
        ArrayList<Chat> list = new ArrayList<>();
        for (int position = 0; position <name.length; position++){
            Chat chat = new Chat();
            chat.setName(name[position]);
            chat.setDetail(detail[position]);
            chat.setPhoto(image[position]);
            list.add(chat);
        }
        return list;
    }

}
