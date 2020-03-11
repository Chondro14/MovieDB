package com.market_tradis.moviedb.utils;

import com.market_tradis.moviedb.data.TVShow;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class DataTV {
    @NotNull
    public static List<TVShow> getTVShow(){
        ArrayList<TVShow> showArrayList=new ArrayList<>();
        showArrayList.add(new TVShow("456",
                "The Simpsons",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/qcr9bBY6MVeLzriKCmJOv1562uY.jpg",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                " December 17, 1989"));
        showArrayList.add(new TVShow("93533",
                "Thieves of the Wood",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/jQNOzoiaIQWxJAx8OUighnvnhRA.jpg",
                "Charismatic highwayman Jan de Lichte leads the oppressed and downtrodden in a revolt against the corrupt aristocracy of 18th-century Belgium.",
                "January 2, 2020"));
        showArrayList.add(new TVShow("4194",
                "Star Wars: The Clone Wars",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/p6s2svEHHLsQ1TOw4Si54c1dD5L.jpg",
                "Yoda, Obi-Wan Kenobi, Anakin Skywalker, Mace Windu and other Jedi Knights lead the Grand Army of the Republic against the droid army of the Separatists.",
                "October 3, 2008"));
        showArrayList.add(new TVShow("1402",
                "The Walking Dead ",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5l10EjdgPxu8Gbl5Ww6SWkVQH6T.jpg",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "October 31, 2010"));
        showArrayList.add(new TVShow("60735",
                "The Flash",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                " October 7, 2014"));
        showArrayList.add(new TVShow("4057",
                "Criminal Minds",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7TCwgX7oQKxcWYEhSPRmaHe6ULN.jpg",
                "An elite team of FBI profilers analyze the country's most twisted criminal minds, anticipating their next moves before they strike again. The Behavioral Analysis Unit's most experienced agent is David Rossi, a founding member of the BAU who returns to help the team solve new cases.",
                "September 22, 2005"));
        showArrayList.add(new TVShow("68421",
                "Altered Carbon",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/95IsiH4p5937YXQHaOS2W2dWYOG.jpg",
                "After 250 years on ice, a prisoner returns to life in a new body with one chance to win his freedom: by solving a mind-bending murder.",
                " February 2, 2018"));
        showArrayList.add(new TVShow("2734",
                "Law & Order: Special Victims Unit ",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6t6r1VGQTTQecN4V0sZeqsmdU9g.jpg",
                "In the criminal justice system, sexually-based offenses are considered especially heinous. In New York City, the dedicated detectives who investigate these vicious felonies are members of an elite squad known as the Special Victims Unit. These are their stories.",
                "September 20, 1999"));
        showArrayList.add(new TVShow("1416",
                "Grey's Anatomy",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/jnsvc7gCKocXnrTXF6p03cICTWb.jpg",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "March 27, 2005"));
        showArrayList.add(new TVShow("60625",
                "Rick and Morty",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/qJdfO3ahgAMf2rcmhoqngjBBZW1.jpg",
                "Rick is a mentally-unbalanced but scientifically-gifted old man who has recently reconnected with his family. He spends most of his time involving his young grandson Morty in dangerous, outlandish adventures throughout space and alternate universes. Compounded with Morty's already unstable family life, these events cause Morty much distress at home and school.",
                " December 2, 2013"));
        showArrayList.add(new TVShow("49464",
                "Dog & Scissors",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6f7xiHXiqsSNByg9ZeNpOKPA5YE.jpg",
                "A nonsense comical mystery. Harumi Kazuhito is a high school boy who loves books and is a fan of novelist Natsuno Kirihime. One day, he finds Kirihime writing at a cafe, about to be shot by a robber. He protects her from the attack but is killed instead. Through the supernatural power of a book-worm, he is reincarnated as a dachshund dog. Kazuhito (as a dog) writhes in a painful bookless life, when a sadistic woman carrying a pair of scissors offers him help. She is Kirihime herself.",
                "July 1, 2013"));

        return showArrayList;

    }
}
