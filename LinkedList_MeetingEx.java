import java.util.LinkedList;

public class LinkedList_MeetingEx
{
    public static void main(String[] args) {
        LinkedList<String> topics = new LinkedList<>();

        //Adding elements as customer
        topics.add("Vision & Mission");
        topics.add("Sprint Review");
        topics.add("Sprint Retrospective");
        topics.add("Standup (Scrum)");

        System.out.println("Meeing Topics list :"+topics);

        //Accessing the elements
        System.out.println("First topics name is : " + topics.getFirst() );

        //add topic at the end
        topics.addLast("Current Agenda");
        System.out.println("Topics Are: "+topics);

        // Remove the topic at the second position "Sprint review".
        topics.remove(1);
        System.out.println("After removing 2nd position elements Topics Are: "+topics);

        //Display the current agenda topics.
        System.out.println("Display the current agenda topics: "+topics.get(3));
    }
}
/*OUTPUT
Meeing Topics list :[Vision & Mission, Sprint Review, Sprint Retrospective, Standup (Scrum)]
First topics name is : Vision & Mission
Topics Are: [Vision & Mission, Sprint Review, Sprint Retrospective, Standup (Scrum), Current Agenda]
After removing 2nd position elements Topics Are: [Vision & Mission, Sprint Retrospective, Standup (Scrum), Current Agenda]
Display the current agenda topics: Current Agenda
 */