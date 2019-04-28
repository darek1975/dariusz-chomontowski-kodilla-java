package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theRssultOfForum = forum.getUserList().stream()
                .filter(f -> f.getSex() == 'M')
                .filter(f -> f.getDateOfBirth().getYear() <= 1999)
                .filter(f -> f.getPostsCount() >=1)
                .collect(Collectors.toMap(ForumUser::getUserId, f -> f));
        System.out.println("# elements: " + theRssultOfForum.size());
        theRssultOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
    }
