package greeedy;

import trees.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * There is one meeting room in a firm. There are N meetings in the form of (S[i], F[i])
 * where S[i] is the start time of meeting i and F[i] is the finish time of meeting i.
 * The task is to find the
 * maximum number of meetings that can be accommodated in the meeting room. Print all meeting numbers
 */
public class MeetingRooms {

    public static void main(String[] args) {
        int s[] = {1, 3, 5, 10, 7, 8};
        int f[] = {2, 4, 7, 16, 9, 9};

        List<Pair<Integer,Integer>> meetings= new ArrayList<>();

        for(int i=0;i<s.length;i++){
            Pair<Integer, Integer> meeting= new Pair<>();
            meeting.setKey(s[i]);
            meeting.setValue(f[i]);
            meetings.add(meeting);
        }

        meetings=meetings.stream().sorted((x,y)->x.getValue().compareTo(y.getValue())).collect(Collectors.toList());
        int totalMeetings=1;
        int lastMeetingEnd=f[0];
        for(int i=1;i<s.length;i++){
            if(lastMeetingEnd<meetings.get(i).getKey()){
                totalMeetings++;
                lastMeetingEnd=meetings.get(i).getValue();
            }

        }

        System.out.println(totalMeetings);

    }


}
