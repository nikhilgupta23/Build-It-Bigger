package com.example;

public class Jokes {
    public static String getJoke() {
        String jokesList[] =
                {
                        "A Roman walks into a bar, holds up two fingers, and says \"Five beers, please.\"",
                        "A grasshopper walks into a bar. The bartender says, \"We've got a drink named after you.\" The grasshopper says, \"You've got a drink named Steve?\"",
                        "A ham sandwich walks into a bar and the bartender says, \"Sorry, we don't serve food in here.\"",
                        "A man walks into a library and asks, \"Can I have a cheeseburger?\" The librarian says, \"Sir, this is a library.\" The man whispers, \"Can I have a cheeseburger?\"",
                        "An infectious disease walks into a bar. The bartender says, \"We don't serve your kind in here.\" The disease replies, \"Well you're not a very good host.\"",
                        "Did you hear about the motherboard who ran away to join the circuits?",
                        "Did you hear about the restaurant on the moon? Great food but no atmosphere.",
                        "Don't trust the atoms. They make up everything.",
                        "How do you catch a runaway laptop? With an internet.",
                        "I told the doctor I broke my arm in two places. He told me not to go into those places.",
                        "I wondered why the baseball was getting bigger. Then it hit me.",
                        "I'd tell a chemestry joke, but I'm afraid I wouldn't get a reaction.",
                        "Knowledge is knowing a tomato is a fruit; wisdom is not putting it in a fruit salad.",
                        "The barman says, \"We don't serve time travelers in here.\" A time traveler walks into the bar.",
                        "The past, the present, and the future walked into a bar. It was tense.",
                        "There are two types of people in the world: Those who need closure.",
                        "Time flies like an arrow. Fruit flies like a banana.",
                        "Two antennas got married. The ceremony dragged on, but the reception was excellent.",
                        "Two goldfish are in a tank. One turns to the other and says, \"Do you know how to trive this thing?\"",
                        "Two silkworms were in a race. They ended up in a tie. No invertebrates were harmed in the making of this joke.",
                        "Two snowmen are chatting in a field. One says to the other, \"Funny, I smell carrots, too.\"",
                        "What did the passive-agressive raven say? \"Nevermind. Nevermind.\"",
                        "What did the zero say to the eight? \"Nice belt.\"",
                        "What do Winnie the Pooh and Ivan the Terrible have in common? The same middle name.",
                        "What do you call a dog who can do magic? A labracadabrador.",
                        "What do you call two crows on a branch? Attempted murder.",
                        "What do you do when you see a spaceman? Park in it, man!",
                        "What do you get when you cross a joke with a rhetorical question?",
                        "What do you get when you cross a stream and a brook? Wet feet.",
                        "What kind of underwear do clouds wear? Thunderpants.",
                        "What part of the keyboard do astronauts like best? The space bar.",
                        "What's brown and sticky? A stick.",
                        "Which way did the computer coder go? He went data way.",
                        "Who's the roundest knight at King Arthur's court? Circumference.",
                        "Why did the chicken cross the road, roll in the mud and cross the road again? Because he was a dirty double crosser.",
                        "Why did the hipster burn his mouth on his coffee? Because he drank it before it was cool.",
                        "Why didn't the spider go to school? Because she learned everything on the web.",
                        "Why do seagulls fly over the sea? Because if they flew over the bay, they'd be called bagels.",
                        "Why do sharks live in saltwater? Because pepperwater makes them sneeze.",
                        "Why was the calendar nervous? It's days were numbered."
                };
        return jokesList[(int)(Math.random()*40)];
    }
}
