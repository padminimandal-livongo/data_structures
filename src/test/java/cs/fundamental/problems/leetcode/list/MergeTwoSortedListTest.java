package cs.fundamental.problems.leetcode.list;

import cs.fundamental.node.SinglyLinkedListNode;
import cs.fundamental.util.TestUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MergeTwoSortedListTest {

    @ParameterizedTest
    @CsvSource(value = {"1,2,4|1,2,4|1,1,2,2,4,4"
            , "|4,3,2|4,3,2"
            , "5,4,3||5,4,3"
            , "1,3,5,7|2,4,6,8|1,2,3,4,5,6,7,8"}, delimiter = '|')
    void mergeTwoLists(String list1Text, String list2Text, String expectedListText) {

        SinglyLinkedListNode<Integer> list1 = TestUtil.getList(list1Text);
        SinglyLinkedListNode<Integer> list2 = TestUtil.getList(list2Text);

        MergeTwoSortedList subject = new MergeTwoSortedList();

        SinglyLinkedListNode<Integer> result = subject.mergeTwoLists(list1, list2);

        SinglyLinkedListNode<Integer> expected = TestUtil.getList(expectedListText);

        while (expected != null) {
            Assertions.assertEquals(expected.getValue(), result.getValue());
            expected = expected.getNextNode();
            result = result.getNextNode();
        }
    }

}