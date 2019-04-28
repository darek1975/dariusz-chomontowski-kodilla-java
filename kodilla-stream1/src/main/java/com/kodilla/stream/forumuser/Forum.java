package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUser = new ArrayList<>();

    public Forum() {
        forumUser.add(new ForumUser(1,"Janek",'M',1975,12,9,0));
        forumUser.add(new ForumUser(2,"Marek",'M',1984,6,29,65));
        forumUser.add(new ForumUser(3,"Zuzia",'F',1989,10,12,12));
        forumUser.add(new ForumUser(4,"Wera",'M',2001,5,19,124));
        forumUser.add(new ForumUser(5,"Jola",'K',1960,1,16, 34));
        forumUser.add(new ForumUser(6,"Jurek",'M',1998,1,26,140));

    }

    public List<ForumUser> getUserList(){

        return new  ArrayList<ForumUser>(forumUser);
    }

}
