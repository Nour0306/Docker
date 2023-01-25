conn = new Mongo();
db = conn.getDB("mongoDB");

db.createCollection("articles");

db.articles.insert({
    id: "1",
    title: "Why is Music So Powerful?",
    tag: "music",
    description: "Music is such a powerful tool. It has been scientifically proven that it has the ability to change our moods.",
    text: "A new neuroscience-based study has identified that if specific music evokes personal memories, these songs have the power to elicit stronger positive emotions than other stimuli, such as looking at a nostalgic picture. The goal of this study was to investigate the mechanisms by which music and photographs trigger pleasant or unpleasant emotions. Most significantly, the researchers found that while upbeat music (such as dance songs) reliably boosts someone's mood, the most potent factor for evoking powerful positive emotions and pleasure via music was linked to personal memories. Notably, the three feelings most strongly associated with pleasant valence while listening to music were joy, strength, and relaxation.",
    date: new Date()
});
db.articles.insert({
    id: "2",
    title: "Reasons to watch movies",
    tag: "movie",
    description: "This article explains why watching movies has huge benefits on our day to day life",
    text: "Did you know that cinema therapy exists? Cinemetherapy (movie therapy) is a form of expressive therapy for overcoming medical and mental health issues. This therapy can change an individual’s negative thoughts, bad habits, and the ability to manage life events. People who attend cinema therapy are watching movies that reflect their current issues.Comedies, for example, make us laugh, and laughing for 15 minutes is just as good for your heart as exercise, said cardiologist Dr. Michael Miller of the University of Maryland. But don't underestimate the sad movies! Sad movies have a positive effect on your brain chemistry too. According to scientists from Oxford University, watching a traumatic movie can boost the production of endorphins, a chemical associated with increased pain tolerance. So, sad movies can actually make you feel good.",
    date: new Date()
});